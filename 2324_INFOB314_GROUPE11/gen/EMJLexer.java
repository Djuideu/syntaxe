// Generated from C:/Users/nonow/Desktop/syntaxe/2324_INFOB314_GROUPE11/src/main/antlr4/be/unamur/info/b314/compiler/EMJLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EMJLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZERO=1, UN=2, AFFECT=3, LPAR=4, RPAR=5, COMMA=6, PLUS=7, MINUS=8, SPEAKER_HIGH_VOLUME=9, 
		SPEAKER_LOW=10, LOUDSPEAKER=11, UP_ARROW=12, CROHET1=13, CROHET2=14, CROCHETS1=15, 
		CROCHETS2=16, EGALE=17, PATH1=18, PATH2=19, PATH3=20, PATH4=21, DOWN_ARROW=22, 
		RIGHT_ARROW=23, LEFT_ARROW=24, CARTES=25, POLICE=26, MOTORWAY=27, CONSTRUCTION=28, 
		HOUSE=29, TRACTOR=30, VOLCANO=31, WAVES=32, VILLAIN=33, ID=34, NUMBER=35, 
		SIGNE=36, LIGNE=37, COMMENTAIRE_UNE_LIGNE=38, COMMENTAIRE_PLUS_LIGNE=39, 
		STRING=40, CHAR=41, INTEGER=42, BOOLEAN=43, NOMBRE_EMO=44, INFORMATION=45, 
		CHAINE_INFO=46, BOOLEAN_INFO=47, MULTIPILICATION=48, DIVISION=49, EMOJIE=50, 
		OPERATOR=51, INFERIEUR=52, SUPERIEUR=53, EGALITES=54, EGAL_SUP=55, EGAL_INF=56, 
		DIFF=57, ET_LOGIQUE=58, OU_LOGIQUE=59, NON=60, UPLET_EMO=61, NEWLINE=62, 
		WS=63, COMPARATOR=64, CONNECTOR=65, FIN_INSTRUCTION=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ZERO", "UN", "AFFECT", "LPAR", "RPAR", "COMMA", "PLUS", "MINUS", "SPEAKER_HIGH_VOLUME", 
			"SPEAKER_LOW", "LOUDSPEAKER", "UP_ARROW", "CROHET1", "CROHET2", "CROCHETS1", 
			"CROCHETS2", "EGALE", "PATH1", "PATH2", "PATH3", "PATH4", "DOWN_ARROW", 
			"RIGHT_ARROW", "LEFT_ARROW", "CARTES", "POLICE", "MOTORWAY", "CONSTRUCTION", 
			"HOUSE", "TRACTOR", "VOLCANO", "WAVES", "VILLAIN", "ID", "NUMBER", "LETTER", 
			"DIGIT", "SIGNE", "LIGNE", "COMMENTAIRE_UNE_LIGNE", "COMMENTAIRE_PLUS_LIGNE", 
			"STRING", "CHAR", "INTEGER", "BOOLEAN", "NOMBRE_EMO", "INFORMATION", 
			"CHAINE_INFO", "BOOLEAN_INFO", "MULTIPILICATION", "DIVISION", "EMOJIE", 
			"OPERATOR", "INFERIEUR", "SUPERIEUR", "EGALITES", "EGAL_SUP", "EGAL_INF", 
			"DIFF", "ET_LOGIQUE", "OU_LOGIQUE", "NON", "UPLET_EMO", "NEWLINE", "WS", 
			"COMPARATOR", "CONNECTOR", "FIN_INSTRUCTION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'1'", "'affect'", "'('", "')'", "','", "'+'", "'-'", "'\\uD83D\uDD0A'", 
			"'\\uD83D\uDD08'", "'\\uD83D\uDCE2'", "'\\u2B06'", "'''", "'\"'", "'['", 
			"']'", "'='", null, null, null, null, "'\\u2B07'", "'\\u27A1'", "'\\u2B05'", 
			"'\\uD83D\uDDFA'", "'\\uD83D\uDE94'", "'\\uD83D\uDEE3'", "'\\uD83D\uDEA7'", 
			"'\\uD83C\uDFE0'", "'\\uD83D\uDE9C'", "'\\uD83C\uDF0B'", "'\\uD83C\uDF0A'", 
			"'\\uD83E\uDDB9'", null, null, null, "'\\n'", null, null, null, null, 
			null, null, "'\\uD83D\uDD22'", "'\\u2139'", "'\\uD83D\uDD24'", "'\\uD83D\uDD21'", 
			"'*'", "'/'", null, null, "'<'", "'>'", "'=='", "'>='", "'<='", "'!='", 
			"'&&'", "'||'", "'!'", "'\\uD83D\uDC65'", null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZERO", "UN", "AFFECT", "LPAR", "RPAR", "COMMA", "PLUS", "MINUS", 
			"SPEAKER_HIGH_VOLUME", "SPEAKER_LOW", "LOUDSPEAKER", "UP_ARROW", "CROHET1", 
			"CROHET2", "CROCHETS1", "CROCHETS2", "EGALE", "PATH1", "PATH2", "PATH3", 
			"PATH4", "DOWN_ARROW", "RIGHT_ARROW", "LEFT_ARROW", "CARTES", "POLICE", 
			"MOTORWAY", "CONSTRUCTION", "HOUSE", "TRACTOR", "VOLCANO", "WAVES", "VILLAIN", 
			"ID", "NUMBER", "SIGNE", "LIGNE", "COMMENTAIRE_UNE_LIGNE", "COMMENTAIRE_PLUS_LIGNE", 
			"STRING", "CHAR", "INTEGER", "BOOLEAN", "NOMBRE_EMO", "INFORMATION", 
			"CHAINE_INFO", "BOOLEAN_INFO", "MULTIPILICATION", "DIVISION", "EMOJIE", 
			"OPERATOR", "INFERIEUR", "SUPERIEUR", "EGALITES", "EGAL_SUP", "EGAL_INF", 
			"DIFF", "ET_LOGIQUE", "OU_LOGIQUE", "NON", "UPLET_EMO", "NEWLINE", "WS", 
			"COMPARATOR", "CONNECTOR", "FIN_INSTRUCTION"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public EMJLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EMJLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000B\u016a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0005!\u00e4\b!\n!\f!\u00e7\t!\u0001\"\u0004\"\u00ea\b\"\u000b\"\f\""+
		"\u00eb\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'"+
		"\u0001\'\u0005\'\u00f8\b\'\n\'\f\'\u00fb\t\'\u0001(\u0001(\u0005(\u00ff"+
		"\b(\n(\f(\u0102\t(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0005)\u010a"+
		"\b)\n)\f)\u010d\t)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0003*\u0115"+
		"\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0003+\u011d\b+\u0001,\u0001"+
		",\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u0001"+
		"1\u00012\u00012\u00013\u00013\u00014\u00014\u00014\u00014\u00034\u0133"+
		"\b4\u00015\u00015\u00016\u00016\u00017\u00017\u00017\u00018\u00018\u0001"+
		"8\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001"+
		"<\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001?\u0003?\u0150\b?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001@\u0004@\u0157\b@\u000b@\f@\u0158\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u0163\bA\u0001B\u0001"+
		"B\u0003B\u0167\bB\u0001C\u0001C\u0001\u0100\u0000D\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G\u0000I\u0000K$M%O&Q\'S(U)W*Y+["+
		",]-_.a/c0e1g2i3k4m5o6q7s8u9w:y;{<}=\u007f>\u0081?\u0083@\u0085A\u0087"+
		"B\u0001\u0000\u0005\u0002\u0000AZaz\u0001\u0000\n\n\u0002\u0000\u2714"+
		"\u2714\u274c\u274c\u0003\u0000\u8001\uf46e\u8001\uf46e\u8001\uf642\u8001"+
		"\uf642\u8001\uf697\u8001\uf697\u0002\u0000\t\t  \u017d\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000K\u0001\u0000"+
		"\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000"+
		"\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U"+
		"\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000"+
		"\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000"+
		"\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c"+
		"\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000"+
		"\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000"+
		"\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q"+
		"\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000"+
		"\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000"+
		"\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f"+
		"\u0001\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083"+
		"\u0001\u0000\u0000\u0000\u0000\u0085\u0001\u0000\u0000\u0000\u0000\u0087"+
		"\u0001\u0000\u0000\u0000\u0001\u0089\u0001\u0000\u0000\u0000\u0003\u008b"+
		"\u0001\u0000\u0000\u0000\u0005\u008d\u0001\u0000\u0000\u0000\u0007\u0094"+
		"\u0001\u0000\u0000\u0000\t\u0096\u0001\u0000\u0000\u0000\u000b\u0098\u0001"+
		"\u0000\u0000\u0000\r\u009a\u0001\u0000\u0000\u0000\u000f\u009c\u0001\u0000"+
		"\u0000\u0000\u0011\u009e\u0001\u0000\u0000\u0000\u0013\u00a0\u0001\u0000"+
		"\u0000\u0000\u0015\u00a2\u0001\u0000\u0000\u0000\u0017\u00a4\u0001\u0000"+
		"\u0000\u0000\u0019\u00a6\u0001\u0000\u0000\u0000\u001b\u00a8\u0001\u0000"+
		"\u0000\u0000\u001d\u00aa\u0001\u0000\u0000\u0000\u001f\u00ac\u0001\u0000"+
		"\u0000\u0000!\u00ae\u0001\u0000\u0000\u0000#\u00b0\u0001\u0000\u0000\u0000"+
		"%\u00b6\u0001\u0000\u0000\u0000\'\u00bc\u0001\u0000\u0000\u0000)\u00c2"+
		"\u0001\u0000\u0000\u0000+\u00c8\u0001\u0000\u0000\u0000-\u00ca\u0001\u0000"+
		"\u0000\u0000/\u00cc\u0001\u0000\u0000\u00001\u00ce\u0001\u0000\u0000\u0000"+
		"3\u00d0\u0001\u0000\u0000\u00005\u00d2\u0001\u0000\u0000\u00007\u00d4"+
		"\u0001\u0000\u0000\u00009\u00d6\u0001\u0000\u0000\u0000;\u00d8\u0001\u0000"+
		"\u0000\u0000=\u00da\u0001\u0000\u0000\u0000?\u00dc\u0001\u0000\u0000\u0000"+
		"A\u00de\u0001\u0000\u0000\u0000C\u00e0\u0001\u0000\u0000\u0000E\u00e9"+
		"\u0001\u0000\u0000\u0000G\u00ed\u0001\u0000\u0000\u0000I\u00ef\u0001\u0000"+
		"\u0000\u0000K\u00f1\u0001\u0000\u0000\u0000M\u00f3\u0001\u0000\u0000\u0000"+
		"O\u00f5\u0001\u0000\u0000\u0000Q\u00fc\u0001\u0000\u0000\u0000S\u0105"+
		"\u0001\u0000\u0000\u0000U\u0110\u0001\u0000\u0000\u0000W\u011c\u0001\u0000"+
		"\u0000\u0000Y\u011e\u0001\u0000\u0000\u0000[\u0120\u0001\u0000\u0000\u0000"+
		"]\u0122\u0001\u0000\u0000\u0000_\u0124\u0001\u0000\u0000\u0000a\u0126"+
		"\u0001\u0000\u0000\u0000c\u0128\u0001\u0000\u0000\u0000e\u012a\u0001\u0000"+
		"\u0000\u0000g\u012c\u0001\u0000\u0000\u0000i\u0132\u0001\u0000\u0000\u0000"+
		"k\u0134\u0001\u0000\u0000\u0000m\u0136\u0001\u0000\u0000\u0000o\u0138"+
		"\u0001\u0000\u0000\u0000q\u013b\u0001\u0000\u0000\u0000s\u013e\u0001\u0000"+
		"\u0000\u0000u\u0141\u0001\u0000\u0000\u0000w\u0144\u0001\u0000\u0000\u0000"+
		"y\u0147\u0001\u0000\u0000\u0000{\u014a\u0001\u0000\u0000\u0000}\u014c"+
		"\u0001\u0000\u0000\u0000\u007f\u014f\u0001\u0000\u0000\u0000\u0081\u0156"+
		"\u0001\u0000\u0000\u0000\u0083\u0162\u0001\u0000\u0000\u0000\u0085\u0166"+
		"\u0001\u0000\u0000\u0000\u0087\u0168\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u00050\u0000\u0000\u008a\u0002\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"1\u0000\u0000\u008c\u0004\u0001\u0000\u0000\u0000\u008d\u008e\u0005a\u0000"+
		"\u0000\u008e\u008f\u0005f\u0000\u0000\u008f\u0090\u0005f\u0000\u0000\u0090"+
		"\u0091\u0005e\u0000\u0000\u0091\u0092\u0005c\u0000\u0000\u0092\u0093\u0005"+
		"t\u0000\u0000\u0093\u0006\u0001\u0000\u0000\u0000\u0094\u0095\u0005(\u0000"+
		"\u0000\u0095\b\u0001\u0000\u0000\u0000\u0096\u0097\u0005)\u0000\u0000"+
		"\u0097\n\u0001\u0000\u0000\u0000\u0098\u0099\u0005,\u0000\u0000\u0099"+
		"\f\u0001\u0000\u0000\u0000\u009a\u009b\u0005+\u0000\u0000\u009b\u000e"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0005-\u0000\u0000\u009d\u0010\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005\u8001\uf50a\u0000\u0000\u009f\u0012"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u8001\uf508\u0000\u0000\u00a1"+
		"\u0014\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u8001\uf4e2\u0000\u0000"+
		"\u00a3\u0016\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u2b06\u0000\u0000"+
		"\u00a5\u0018\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\'\u0000\u0000\u00a7"+
		"\u001a\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\"\u0000\u0000\u00a9\u001c"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005[\u0000\u0000\u00ab\u001e\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005]\u0000\u0000\u00ad \u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005=\u0000\u0000\u00af\"\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0003\u0007\u0003\u0000\u00b1\u00b2\u0003W+\u0000\u00b2\u00b3"+
		"\u0003\u000b\u0005\u0000\u00b3\u00b4\u0003W+\u0000\u00b4\u00b5\u0003\t"+
		"\u0004\u0000\u00b5$\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003\u0007\u0003"+
		"\u0000\u00b7\u00b8\u0003Y,\u0000\u00b8\u00b9\u0003\u000b\u0005\u0000\u00b9"+
		"\u00ba\u0003Y,\u0000\u00ba\u00bb\u0003\t\u0004\u0000\u00bb&\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0003\u0007\u0003\u0000\u00bd\u00be\u0003S)\u0000"+
		"\u00be\u00bf\u0003\u000b\u0005\u0000\u00bf\u00c0\u0003S)\u0000\u00c0\u00c1"+
		"\u0003\t\u0004\u0000\u00c1(\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003"+
		"\u0007\u0003\u0000\u00c3\u00c4\u0003U*\u0000\u00c4\u00c5\u0003\u000b\u0005"+
		"\u0000\u00c5\u00c6\u0003U*\u0000\u00c6\u00c7\u0003\t\u0004\u0000\u00c7"+
		"*\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u2b07\u0000\u0000\u00c9,\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0005\u27a1\u0000\u0000\u00cb.\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005\u2b05\u0000\u0000\u00cd0\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005\u8001\uf5fa\u0000\u0000\u00cf2\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0005\u8001\uf694\u0000\u0000\u00d14\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0005\u8001\uf6e3\u0000\u0000\u00d36\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005\u8001\uf6a7\u0000\u0000\u00d58\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0005\u8001\uf3e0\u0000\u0000\u00d7:\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005\u8001\uf69c\u0000\u0000\u00d9<\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005\u8001\uf30b\u0000\u0000\u00db>\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005\u8001\uf30a\u0000\u0000\u00dd@\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005\u8001\uf9b9\u0000\u0000\u00dfB\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e5\u0003G#\u0000\u00e1\u00e4\u0003G#\u0000\u00e2\u00e4"+
		"\u0003I$\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6D\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ea\u0003I$\u0000\u00e9"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"F\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0000\u0000\u0000\u00eeH\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u000209\u0000\u00f0J\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0003\u000f\u0007\u0000\u00f2L\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0005\n\u0000\u0000\u00f4N\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f9\u0003\u0015\n\u0000\u00f6\u00f8\b\u0001\u0000\u0000\u00f7\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00faP\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u0100\u0003"+
		"\u0011\b\u0000\u00fd\u00ff\t\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000"+
		"\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0003\u0013"+
		"\t\u0000\u0104R\u0001\u0000\u0000\u0000\u0105\u010b\u0003\u001b\r\u0000"+
		"\u0106\u010a\u0003C!\u0000\u0107\u010a\u0003E\"\u0000\u0108\u010a\u0005"+
		" \u0000\u0000\u0109\u0106\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0003\u001b\r\u0000\u010fT\u0001\u0000\u0000"+
		"\u0000\u0110\u0114\u0003\u0019\f\u0000\u0111\u0115\u0003C!\u0000\u0112"+
		"\u0115\u0003E\"\u0000\u0113\u0115\u0005 \u0000\u0000\u0114\u0111\u0001"+
		"\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0113\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0003"+
		"\u0019\f\u0000\u0117V\u0001\u0000\u0000\u0000\u0118\u0119\u0003K%\u0000"+
		"\u0119\u011a\u0003E\"\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b"+
		"\u011d\u0003E\"\u0000\u011c\u0118\u0001\u0000\u0000\u0000\u011c\u011b"+
		"\u0001\u0000\u0000\u0000\u011dX\u0001\u0000\u0000\u0000\u011e\u011f\u0007"+
		"\u0002\u0000\u0000\u011fZ\u0001\u0000\u0000\u0000\u0120\u0121\u0005\u8001"+
		"\uf522\u0000\u0000\u0121\\\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u2139"+
		"\u0000\u0000\u0123^\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u8001\uf524"+
		"\u0000\u0000\u0125`\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u8001\uf521"+
		"\u0000\u0000\u0127b\u0001\u0000\u0000\u0000\u0128\u0129\u0005*\u0000\u0000"+
		"\u0129d\u0001\u0000\u0000\u0000\u012a\u012b\u0005/\u0000\u0000\u012bf"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0007\u0003\u0000\u0000\u012dh\u0001"+
		"\u0000\u0000\u0000\u012e\u0133\u0003\u000f\u0007\u0000\u012f\u0133\u0003"+
		"\r\u0006\u0000\u0130\u0133\u0003c1\u0000\u0131\u0133\u0003e2\u0000\u0132"+
		"\u012e\u0001\u0000\u0000\u0000\u0132\u012f\u0001\u0000\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133"+
		"j\u0001\u0000\u0000\u0000\u0134\u0135\u0005<\u0000\u0000\u0135l\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005>\u0000\u0000\u0137n\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005=\u0000\u0000\u0139\u013a\u0005=\u0000\u0000\u013a"+
		"p\u0001\u0000\u0000\u0000\u013b\u013c\u0005>\u0000\u0000\u013c\u013d\u0005"+
		"=\u0000\u0000\u013dr\u0001\u0000\u0000\u0000\u013e\u013f\u0005<\u0000"+
		"\u0000\u013f\u0140\u0005=\u0000\u0000\u0140t\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0005!\u0000\u0000\u0142\u0143\u0005=\u0000\u0000\u0143v\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0005&\u0000\u0000\u0145\u0146\u0005&\u0000"+
		"\u0000\u0146x\u0001\u0000\u0000\u0000\u0147\u0148\u0005|\u0000\u0000\u0148"+
		"\u0149\u0005|\u0000\u0000\u0149z\u0001\u0000\u0000\u0000\u014a\u014b\u0005"+
		"!\u0000\u0000\u014b|\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u8001\uf465"+
		"\u0000\u0000\u014d~\u0001\u0000\u0000\u0000\u014e\u0150\u0005\r\u0000"+
		"\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0005\n\u0000\u0000"+
		"\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0006?\u0000\u0000\u0154"+
		"\u0080\u0001\u0000\u0000\u0000\u0155\u0157\u0007\u0004\u0000\u0000\u0156"+
		"\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0006@\u0000\u0000\u015b\u0082"+
		"\u0001\u0000\u0000\u0000\u015c\u0163\u0003k5\u0000\u015d\u0163\u0003m"+
		"6\u0000\u015e\u0163\u0003o7\u0000\u015f\u0163\u0003s9\u0000\u0160\u0163"+
		"\u0003q8\u0000\u0161\u0163\u0003u:\u0000\u0162\u015c\u0001\u0000\u0000"+
		"\u0000\u0162\u015d\u0001\u0000\u0000\u0000\u0162\u015e\u0001\u0000\u0000"+
		"\u0000\u0162\u015f\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000"+
		"\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0084\u0001\u0000\u0000"+
		"\u0000\u0164\u0167\u0003w;\u0000\u0165\u0167\u0003y<\u0000\u0166\u0164"+
		"\u0001\u0000\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167\u0086"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0005;\u0000\u0000\u0169\u0088\u0001"+
		"\u0000\u0000\u0000\u000f\u0000\u00e3\u00e5\u00eb\u00f9\u0100\u0109\u010b"+
		"\u0114\u011c\u0132\u014f\u0158\u0162\u0166\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}