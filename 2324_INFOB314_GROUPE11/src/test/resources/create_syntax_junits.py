# !/usr/bin/env python2
# encoding: UTF-8

# Creates Java test files from existing directories and files. 
# Test files must be in src/test/resources/semantics/testseriename/ok/testfile.b314
# Test files must be in src/test/resources/semantics/testseriename/ko/testfile.b314
# Script must be launched from src/test/resources folder

import os

filePath = os.path.dirname(os.path.realpath(__file__))
syntaxDir = os.path.join(filePath, 'syntax')

for serie in [x for x in os.listdir(syntaxDir) if not x.startswith('.')]:
    junitName = 'B314SyntaxTest{}'.format(serie)

    with open('{}/../java/be/unamur/info/b314/compiler/main/{}.java'.format(filePath, junitName), 'w') as fout:
        okDir = os.path.join(syntaxDir, serie, 'ok')
        koDir = os.path.join(syntaxDir, serie, 'ko')

        fout.write('package be.unamur.info.b314.compiler.main;\n')
        fout.write('\n')
        fout.write('import org.junit.Test;\n')
        fout.write('import org.junit.Rule;\n')
        fout.write('import org.junit.rules.TemporaryFolder;\n')
        fout.write('import org.junit.rules.TestRule;\n')
        fout.write('import org.junit.rules.TestWatcher;\n')
        fout.write('import org.junit.runner.Description;\n')
        fout.write('import org.slf4j.Logger;\n')
        fout.write('import org.slf4j.LoggerFactory;\n')
        fout.write('\n')
        fout.write('public class {} {{\n'.format(junitName))
        fout.write('\n')
        fout.write('    private static final Logger LOG = LoggerFactory.getLogger({}.class);\n'.format(junitName))
        fout.write('\n')
        fout.write('    @Rule\n')
        fout.write('    // Create a temporary folder for outputs deleted after tests\n')
        fout.write('    public TemporaryFolder testFolder = new TemporaryFolder();\n')
        fout.write('\n')
        fout.write('    @Rule\n')
        fout.write('    // Print message on logger before each test\n')
        fout.write('    public TestRule watcher = new TestWatcher() {\n')
        fout.write('        @Override\n')
        fout.write('        protected void starting(Description description) {\n')
        fout.write('            LOG.info(String.format("Starting test: %s()...",\n')
        fout.write('                    description.getMethodName()));\n')
        fout.write('        }\n')
        fout.write('    ;\n')
        fout.write('    };\n')
        fout.write('\n')
        fout.write('    /* Serie {} OK */\n'.format(serie))
        fout.write('\n')

        for inputFile in [x for x in os.listdir(okDir) if not x.startswith('.')]:
            testName = inputFile.replace('.b314', '')

            fout.write('    @Test\n')
            fout.write('    public void test{}_{}_ok() throws Exception {{\n'.format(serie, testName))
            fout.write('        CompilerTestHelper.launchCompilation(\n')
            fout.write('                "/syntax/{}/ok/{}", \n'.format(serie, inputFile))
            fout.write('                testFolder.newFile(), \n')
            fout.write('                true, \n')
            fout.write('                "{} : {}"\n'.format(serie, testName))
            fout.write('        );\n')
            fout.write('    }\n')
            fout.write('\n')

        fout.write('    /* Serie {} KO */\n'.format(serie))
        fout.write('\n')

        for inputFile in [x for x in os.listdir(koDir) if not x.startswith('.')]:
            testName = inputFile.replace('.b314', '')

            fout.write('    @Test\n')
            fout.write('    public void test{}_{}_ko() throws Exception {{\n'.format(serie, testName))
            fout.write('        CompilerTestHelper.launchCompilation(\n')
            fout.write('                "/syntax/{}/ko/{}", \n'.format(serie, inputFile))
            fout.write('                testFolder.newFile(), \n')
            fout.write('                false, \n')
            fout.write('                "{} : {}"\n'.format(serie, testName))
            fout.write('        );\n')
            fout.write('    }\n')
            fout.write('\n')

        fout.write('}')
