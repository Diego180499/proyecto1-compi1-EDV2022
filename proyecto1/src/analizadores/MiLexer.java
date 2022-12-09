/* The following code was generated by JFlex 1.4.3 on 12/9/22, 6:44 AM */

package analizadores;

import java.io.*;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/9/22, 6:44 AM from the specification file
 * <tt>J:/Universidad/Vaqueras-Guate/Compi 1/Laboratorio/PROYECTOS/Proyecto1/proyecto1/src/analizadores/Lexer.flex</tt>
 */
public class MiLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\12\1\7\2\0\1\15\22\0\1\12\1\0\1\13\4\0"+
    "\1\11\1\53\1\54\1\10\1\44\1\50\1\3\1\2\1\6\12\1"+
    "\1\52\1\51\1\45\1\47\1\46\2\0\2\4\1\42\23\4\1\43"+
    "\3\4\1\0\1\14\2\0\1\5\1\0\1\23\1\21\1\25\1\31"+
    "\1\22\1\32\1\41\1\33\1\27\1\4\1\24\1\35\1\4\1\17"+
    "\1\26\1\36\1\4\1\20\1\37\1\16\1\30\1\40\1\34\3\4"+
    "\1\55\1\0\1\56\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\17\5\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\3\26"+
    "\1\27\1\30\1\0\1\2\1\31\2\0\13\5\1\32"+
    "\1\5\1\33\10\5\2\26\1\34\1\35\1\36\1\37"+
    "\1\40\1\0\1\41\1\5\1\42\7\5\1\43\1\44"+
    "\3\5\1\45\7\5\1\46\1\47\1\50\2\5\1\51"+
    "\1\52\1\53\12\5\1\54\2\5\1\55\1\5\1\56"+
    "\3\5\1\57\5\5\1\60\2\5\1\61\1\5\1\62"+
    "\1\63\1\64\1\65\2\5\1\66\1\67\1\5\1\70"+
    "\5\0\1\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\136\0\274\0\353\0\u011a"+
    "\0\u0149\0\136\0\u0178\0\136\0\u01a7\0\u01d6\0\u0205\0\u0234"+
    "\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac"+
    "\0\u03db\0\u040a\0\u0439\0\136\0\136\0\136\0\136\0\136"+
    "\0\136\0\136\0\136\0\136\0\136\0\136\0\u0468\0\u0497"+
    "\0\u04c6\0\136\0\u04f5\0\u0524\0\274\0\u0553\0\u0582\0\u05b1"+
    "\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c\0\u06cb\0\u06fa\0\u0729"+
    "\0\u0758\0\u0787\0\u07b6\0\353\0\u07e5\0\u0814\0\u0843\0\u0872"+
    "\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d\0\u098c\0\u09bb\0\u09ea"+
    "\0\136\0\136\0\136\0\136\0\u0524\0\u0a19\0\136\0\u0a48"+
    "\0\353\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91"+
    "\0\353\0\353\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d\0\u0c7c\0\u0cab"+
    "\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96\0\136\0\353\0\353"+
    "\0\u0dc5\0\u0df4\0\353\0\353\0\353\0\u0e23\0\u0e52\0\u0e81"+
    "\0\u0eb0\0\u0edf\0\u0f0e\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\353"+
    "\0\u0ff9\0\u1028\0\353\0\u1057\0\353\0\u1086\0\u10b5\0\u10e4"+
    "\0\353\0\u1113\0\u1142\0\u1171\0\u11a0\0\u11cf\0\353\0\u11fe"+
    "\0\u122d\0\353\0\u125c\0\353\0\353\0\353\0\353\0\u128b"+
    "\0\u12ba\0\353\0\353\0\u12e9\0\353\0\u1318\0\u1347\0\u1376"+
    "\0\u13a5\0\u13d4\0\136";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\3\1\10\1\11"+
    "\1\12\1\13\1\11\1\14\1\3\1\11\1\15\1\16"+
    "\1\17\1\20\1\21\2\7\1\22\1\23\1\24\1\7"+
    "\1\25\1\26\1\7\1\27\1\7\1\30\1\31\1\32"+
    "\1\7\1\33\1\7\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\6\47\1\50"+
    "\1\11\2\47\1\51\1\52\1\53\1\11\41\47\60\0"+
    "\1\4\1\54\55\0\1\55\56\0\1\7\2\0\2\7"+
    "\10\0\26\7\21\0\1\56\1\0\1\57\55\0\1\11"+
    "\2\0\1\11\2\0\1\11\42\0\1\60\2\0\1\60"+
    "\11\0\26\60\14\0\1\7\2\0\2\7\10\0\2\7"+
    "\1\61\23\7\14\0\1\7\2\0\2\7\10\0\4\7"+
    "\1\62\5\7\1\63\13\7\14\0\1\7\2\0\2\7"+
    "\10\0\4\7\1\64\21\7\14\0\1\7\2\0\2\7"+
    "\10\0\2\7\1\65\5\7\1\66\15\7\14\0\1\7"+
    "\2\0\2\7\10\0\17\7\1\67\6\7\14\0\1\7"+
    "\2\0\2\7\10\0\5\7\1\70\2\7\1\71\15\7"+
    "\14\0\1\7\2\0\2\7\10\0\12\7\1\72\13\7"+
    "\14\0\1\7\2\0\2\7\10\0\1\7\1\73\12\7"+
    "\1\74\11\7\14\0\1\7\2\0\2\7\10\0\4\7"+
    "\1\75\3\7\1\76\15\7\14\0\1\7\2\0\2\7"+
    "\10\0\5\7\1\77\2\7\1\100\15\7\14\0\1\7"+
    "\2\0\2\7\10\0\15\7\1\101\10\7\14\0\1\7"+
    "\2\0\2\7\10\0\12\7\1\102\13\7\14\0\1\7"+
    "\2\0\2\7\10\0\1\103\15\7\1\104\7\7\14\0"+
    "\1\7\2\0\2\7\10\0\10\7\1\105\15\7\14\0"+
    "\1\7\2\0\2\7\10\0\10\7\1\106\15\7\13\0"+
    "\7\47\1\0\3\47\3\0\47\47\1\107\1\0\1\110"+
    "\2\47\3\0\50\47\1\11\2\47\1\51\2\0\1\11"+
    "\41\47\13\0\1\111\2\0\1\112\1\113\1\114\37\0"+
    "\1\115\55\0\7\56\1\0\47\56\6\57\1\0\1\57"+
    "\1\116\46\57\11\0\1\117\46\0\1\7\2\0\2\7"+
    "\10\0\12\7\1\120\13\7\14\0\1\7\2\0\2\7"+
    "\10\0\16\7\1\121\7\7\14\0\1\7\2\0\2\7"+
    "\10\0\17\7\1\122\6\7\14\0\1\7\2\0\2\7"+
    "\10\0\1\123\25\7\14\0\1\7\2\0\2\7\10\0"+
    "\4\7\1\124\21\7\14\0\1\7\2\0\2\7\10\0"+
    "\10\7\1\125\15\7\14\0\1\7\2\0\2\7\10\0"+
    "\21\7\1\126\4\7\14\0\1\7\2\0\2\7\10\0"+
    "\21\7\1\127\4\7\14\0\1\7\2\0\2\7\10\0"+
    "\1\7\1\130\24\7\14\0\1\7\2\0\2\7\10\0"+
    "\1\131\25\7\14\0\1\7\2\0\2\7\10\0\1\132"+
    "\25\7\14\0\1\7\2\0\2\7\10\0\14\7\1\133"+
    "\11\7\14\0\1\7\2\0\2\7\10\0\12\7\1\134"+
    "\13\7\14\0\1\7\2\0\2\7\10\0\17\7\1\135"+
    "\6\7\14\0\1\7\2\0\2\7\10\0\2\7\1\136"+
    "\23\7\14\0\1\7\2\0\2\7\10\0\11\7\1\137"+
    "\14\7\14\0\1\7\2\0\2\7\10\0\3\7\1\140"+
    "\22\7\14\0\1\7\2\0\2\7\10\0\2\7\1\141"+
    "\2\7\1\142\20\7\14\0\1\7\2\0\2\7\10\0"+
    "\11\7\1\143\14\7\14\0\1\7\2\0\2\7\10\0"+
    "\11\7\1\144\14\7\14\0\1\7\2\0\2\7\10\0"+
    "\1\7\1\145\24\7\13\0\7\107\1\0\3\107\3\56"+
    "\41\107\6\110\1\47\1\57\1\47\2\110\3\57\41\110"+
    "\6\0\1\146\51\0\1\7\2\0\2\7\10\0\4\7"+
    "\1\147\21\7\14\0\1\7\2\0\2\7\10\0\17\7"+
    "\1\150\6\7\14\0\1\7\2\0\2\7\10\0\12\7"+
    "\1\151\13\7\14\0\1\7\2\0\2\7\10\0\5\7"+
    "\1\152\20\7\14\0\1\7\2\0\2\7\10\0\17\7"+
    "\1\153\6\7\14\0\1\7\2\0\2\7\10\0\4\7"+
    "\1\154\21\7\14\0\1\7\2\0\2\7\10\0\4\7"+
    "\1\155\21\7\14\0\1\7\2\0\2\7\10\0\1\156"+
    "\20\7\1\157\4\7\14\0\1\7\2\0\2\7\10\0"+
    "\5\7\1\160\20\7\14\0\1\7\2\0\2\7\10\0"+
    "\3\7\1\161\22\7\14\0\1\7\2\0\2\7\10\0"+
    "\21\7\1\120\4\7\14\0\1\7\2\0\2\7\10\0"+
    "\4\7\1\162\21\7\14\0\1\7\2\0\2\7\10\0"+
    "\17\7\1\163\6\7\14\0\1\7\2\0\2\7\10\0"+
    "\17\7\1\164\6\7\14\0\1\7\2\0\2\7\10\0"+
    "\11\7\1\165\14\7\14\0\1\7\2\0\2\7\10\0"+
    "\1\166\25\7\14\0\1\7\2\0\2\7\10\0\1\167"+
    "\25\7\14\0\1\7\2\0\2\7\10\0\13\7\1\170"+
    "\12\7\14\0\1\7\2\0\2\7\10\0\21\7\1\171"+
    "\4\7\14\0\1\7\2\0\2\7\10\0\2\7\1\172"+
    "\23\7\14\0\1\7\2\0\2\7\10\0\6\7\1\173"+
    "\17\7\14\0\1\7\2\0\2\7\10\0\11\7\1\174"+
    "\14\7\14\0\1\7\2\0\2\7\10\0\1\175\25\7"+
    "\14\0\1\7\2\0\2\7\10\0\12\7\1\176\13\7"+
    "\14\0\1\7\2\0\2\7\10\0\17\7\1\177\6\7"+
    "\14\0\1\7\2\0\2\7\10\0\5\7\1\200\20\7"+
    "\14\0\1\7\2\0\2\7\10\0\4\7\1\201\21\7"+
    "\14\0\1\7\2\0\2\7\10\0\11\7\1\202\14\7"+
    "\14\0\1\7\2\0\2\7\10\0\1\7\1\203\24\7"+
    "\14\0\1\7\2\0\2\7\10\0\11\7\1\204\14\7"+
    "\14\0\1\7\2\0\2\7\10\0\7\7\1\205\16\7"+
    "\14\0\1\7\2\0\2\7\10\0\10\7\1\206\15\7"+
    "\14\0\1\7\2\0\2\7\10\0\1\7\1\207\24\7"+
    "\14\0\1\7\2\0\2\7\10\0\1\7\1\210\24\7"+
    "\14\0\1\7\2\0\2\7\10\0\17\7\1\211\6\7"+
    "\14\0\1\7\2\0\2\7\10\0\4\7\1\212\21\7"+
    "\14\0\1\7\2\0\2\7\10\0\7\7\1\213\16\7"+
    "\14\0\1\7\2\0\2\7\10\0\7\7\1\214\16\7"+
    "\14\0\1\7\2\0\2\7\10\0\23\7\1\215\2\7"+
    "\14\0\1\7\2\0\2\7\10\0\7\7\1\216\16\7"+
    "\14\0\1\7\2\0\2\7\10\0\15\7\1\217\10\7"+
    "\14\0\1\7\2\0\2\7\10\0\17\7\1\220\6\7"+
    "\14\0\1\7\2\0\2\7\10\0\12\7\1\221\13\7"+
    "\14\0\1\7\2\0\2\7\10\0\1\222\25\7\14\0"+
    "\1\7\2\0\2\7\10\0\15\7\1\223\10\7\14\0"+
    "\1\7\2\0\2\7\10\0\4\7\1\224\21\7\14\0"+
    "\1\7\2\0\2\7\10\0\4\7\1\225\21\7\14\0"+
    "\1\7\1\226\1\0\2\7\10\0\26\7\56\0\1\227"+
    "\33\0\1\230\65\0\1\231\45\0\1\232\62\0\1\233"+
    "\34\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5123];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\4\1\1\11\1\1\1\11"+
    "\17\1\13\11\3\1\1\11\1\1\1\0\2\1\2\0"+
    "\30\1\4\11\1\1\1\0\1\11\26\1\1\11\57\1"+
    "\5\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[155];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    StringBuffer string = new StringBuffer();    


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public MiLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public MiLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 128) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 49: 
          { return new Token(TokenConstant.DOUBLE,yytext(), yyline, yycolumn);
          }
        case 58: break;
        case 3: 
          { return new Token(TokenConstant.POINT, yytext(), yyline, yycolumn);
          }
        case 59: break;
        case 19: 
          { return new Token(TokenConstant.P_C, yytext(), yyline, yycolumn);
          }
        case 60: break;
        case 4: 
          { return new Token(TokenConstant.LESS, yytext(), yyline, yycolumn);
          }
        case 61: break;
        case 21: 
          { return new Token(TokenConstant.LL_C, yytext(), yyline, yycolumn);
          }
        case 62: break;
        case 50: 
          { return new Token(TokenConstant.PUBLIC, yytext(), yyline, yycolumn);
          }
        case 63: break;
        case 15: 
          { return new Token(TokenConstant.COMA, yytext(), yyline, yycolumn);
          }
        case 64: break;
        case 6: 
          { return new Token(TokenConstant.DIV, yytext(), yyline, yycolumn);
          }
        case 65: break;
        case 29: 
          { string.append('\t');
          }
        case 66: break;
        case 53: 
          { return new Token(TokenConstant.SWITCH, yytext(), yyline, yycolumn);
          }
        case 67: break;
        case 37: 
          { return new Token(TokenConstant.FOR, yytext(), yyline, yycolumn);
          }
        case 68: break;
        case 57: 
          { return new Token(TokenConstant.PRINT, yytext(), yyline, yycolumn);
          }
        case 69: break;
        case 10: 
          { string.setLength(0); yybegin(STRING);
          }
        case 70: break;
        case 9: 
          { return new Token(TokenConstant.S_QUOTE, yytext(), yyline, yycolumn);
          }
        case 71: break;
        case 54: 
          { return new Token(TokenConstant.DEFAULT, yytext(), yyline, yycolumn);
          }
        case 72: break;
        case 36: 
          { return new Token(TokenConstant.INT, yytext(), yyline, yycolumn);
          }
        case 73: break;
        case 55: 
          { return new Token(TokenConstant.FOREACH, yytext(), yyline, yycolumn);
          }
        case 74: break;
        case 42: 
          { return new Token(TokenConstant.ELSE, yytext(), yyline, yycolumn);
          }
        case 75: break;
        case 5: 
          { return new Token(TokenConstant.ID, yytext(), yyline, yycolumn);
          }
        case 76: break;
        case 41: 
          { return new Token(TokenConstant.BOOL, yytext(), yyline, yycolumn);
          }
        case 77: break;
        case 23: 
          { yybegin(YYINITIAL); 
                                      return new Token(TokenConstant.CADENA, string.toString(), yyline, yycolumn);
          }
        case 78: break;
        case 14: 
          { return new Token(TokenConstant.EQUAL, yytext(), yyline, yycolumn);
          }
        case 79: break;
        case 24: 
          { string.append('\\');
          }
        case 80: break;
        case 8: 
          { return new Token(TokenConstant.MULT, yytext(), yyline, yycolumn);
          }
        case 81: break;
        case 31: 
          { string.append('\r');
          }
        case 82: break;
        case 1: 
          { return new Token(TokenConstant.ERROR, yytext(), yyline, yycolumn);
          }
        case 83: break;
        case 12: 
          { return new Token(TokenConstant.MIN, yytext(), yyline, yycolumn);
          }
        case 84: break;
        case 11: 
          { return new Token(TokenConstant.PLUS, yytext(), yyline, yycolumn);
          }
        case 85: break;
        case 27: 
          { return new Token(TokenConstant.DO, yytext(), yyline, yycolumn);
          }
        case 86: break;
        case 33: 
          { return new Token(TokenConstant.CARACTER, yytext(), yyline, yycolumn);
          }
        case 87: break;
        case 16: 
          { return new Token(TokenConstant.SEMI_COLON, yytext(), yyline, yycolumn);
          }
        case 88: break;
        case 2: 
          { return new Token(TokenConstant.DIGIT, yytext(), yyline, yycolumn);
          }
        case 89: break;
        case 26: 
          { return new Token(TokenConstant.IF, yytext(), yyline, yycolumn);
          }
        case 90: break;
        case 46: 
          { return new Token(TokenConstant.CONST, yytext(), yyline, yycolumn);
          }
        case 91: break;
        case 28: 
          { string.append('\"');
          }
        case 92: break;
        case 32: 
          { return new Token(TokenConstant.DECIMAL, yytext(), yyline, yycolumn);
          }
        case 93: break;
        case 17: 
          { return new Token(TokenConstant.T_POINTS, yytext(), yyline, yycolumn);
          }
        case 94: break;
        case 39: 
          { return new Token(TokenConstant.BOOLEANO, yytext(), yyline, yycolumn);
          }
        case 95: break;
        case 25: 
          { return new Token(TokenConstant.SIMPLE_COMMENT, yytext(), yyline, yycolumn);
          }
        case 96: break;
        case 52: 
          { return new Token(TokenConstant.STATIC, yytext(), yyline, yycolumn);
          }
        case 97: break;
        case 38: 
          { return new Token(TokenConstant.MULTI_COMMENT, yytext(), yyline, yycolumn);
          }
        case 98: break;
        case 13: 
          { return new Token(TokenConstant.GREATER, yytext(), yyline, yycolumn);
          }
        case 99: break;
        case 56: 
          { return new Token(TokenConstant.CONTINUE, yytext(), yyline, yycolumn);
          }
        case 100: break;
        case 30: 
          { string.append('\n');
          }
        case 101: break;
        case 51: 
          { return new Token(TokenConstant.STRING, yytext(), yyline, yycolumn);
          }
        case 102: break;
        case 43: 
          { return new Token(TokenConstant.CASE, yytext(), yyline, yycolumn);
          }
        case 103: break;
        case 45: 
          { return new Token(TokenConstant.BREAK, yytext(), yyline, yycolumn);
          }
        case 104: break;
        case 18: 
          { return new Token(TokenConstant.P_A, yytext(), yyline, yycolumn);
          }
        case 105: break;
        case 44: 
          { return new Token(TokenConstant.VOID, yytext(), yyline, yycolumn);
          }
        case 106: break;
        case 47: 
          { return new Token(TokenConstant.WHILE, yytext(), yyline, yycolumn);
          }
        case 107: break;
        case 20: 
          { return new Token(TokenConstant.LL_A, yytext(), yyline, yycolumn);
          }
        case 108: break;
        case 7: 
          { /*Ignore*/
          }
        case 109: break;
        case 48: 
          { return new Token(TokenConstant.RETURN, yytext(), yyline, yycolumn);
          }
        case 110: break;
        case 35: 
          { return new Token(TokenConstant.OUT, yytext(), yyline, yycolumn);
          }
        case 111: break;
        case 22: 
          { string.append( yytext() );
          }
        case 112: break;
        case 40: 
          { return new Token(TokenConstant.NULL, yytext(), yyline, yycolumn);
          }
        case 113: break;
        case 34: 
          { return new Token(TokenConstant.NEW, yytext(), yyline, yycolumn);
          }
        case 114: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {     
    return new Token(TokenConstant.EOF, null);

 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
