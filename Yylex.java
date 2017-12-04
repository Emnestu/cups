/* The following code was generated by JFlex 1.4.3 on 01/12/17 17:12 */

/*---- Java preamble code ----*/

/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 01/12/17 17:12 from the specification file
 * <tt>lang.flex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int Block = 2;
  public static final int YYINITIAL = 0;
  public static final int Line = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2, 2
  };

  /**
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED =
    "\11\0\1\33\1\34\2\0\1\33\22\0\1\33\7\0\2\2\1\27"+
    "\3\2\1\32\1\26\2\1\1\3\7\1\1\0\1\2\1\0\1\30"+
    "\3\0\32\31\1\2\1\0\1\2\1\0\1\31\1\0\1\16\1\22"+
    "\1\15\1\14\1\13\1\5\1\31\1\11\1\4\2\31\1\12\1\31"+
    "\1\25\1\6\1\20\1\31\1\7\1\17\1\23\1\21\1\24\1\10"+
    "\3\31\1\2\1\0\1\2\uff82\0";

  /**
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\11\3\3\2\3\4\1\5\1\6"+
    "\1\7\4\3\1\10\4\3\1\11\1\12\1\13\1\14"+
    "\13\3\1\15\1\16\1\17\1\20\2\3\1\21\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[56];
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
    "\0\0\0\35\0\72\0\127\0\164\0\127\0\221\0\256"+
    "\0\313\0\350\0\u0105\0\u0122\0\u013f\0\u015c\0\u0179\0\u0196"+
    "\0\u01b3\0\u01d0\0\u01ed\0\164\0\u020a\0\164\0\u01d0\0\313"+
    "\0\u0227\0\u0244\0\u0261\0\u027e\0\313\0\u029b\0\u02b8\0\u02d5"+
    "\0\u02f2\0\164\0\164\0\313\0\313\0\u030f\0\u032c\0\u0349"+
    "\0\u0366\0\u0383\0\u03a0\0\u03bd\0\u03da\0\u03f7\0\u0414\0\u0431"+
    "\0\313\0\313\0\313\0\313\0\u044e\0\u046b\0\313\0\313";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[56];
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
    "\1\0\1\4\1\5\1\6\1\7\1\10\2\11\1\12"+
    "\3\11\1\13\1\14\1\11\1\15\1\16\3\11\1\17"+
    "\1\11\1\20\1\5\1\21\1\11\1\22\2\23\27\24"+
    "\1\25\4\24\1\0\34\24\1\26\1\0\1\4\1\0"+
    "\1\4\26\0\1\27\40\0\1\11\1\0\2\11\1\30"+
    "\17\11\1\31\3\0\1\11\4\0\1\11\1\0\3\11"+
    "\1\32\3\11\1\33\13\11\3\0\1\11\4\0\1\11"+
    "\1\0\23\11\3\0\1\11\4\0\1\11\1\0\6\11"+
    "\1\34\14\11\3\0\1\11\4\0\1\11\1\0\3\11"+
    "\1\35\17\11\3\0\1\11\4\0\1\11\1\0\7\11"+
    "\1\36\13\11\3\0\1\11\4\0\1\11\1\0\20\11"+
    "\1\37\2\11\3\0\1\11\4\0\1\11\1\0\16\11"+
    "\1\40\4\11\3\0\1\11\4\0\1\11\1\0\3\11"+
    "\1\41\17\11\3\0\1\11\31\0\1\42\1\43\35\0"+
    "\1\5\5\0\1\27\1\0\1\27\64\0\2\23\26\0"+
    "\1\26\7\0\1\11\1\0\20\11\1\44\2\11\3\0"+
    "\1\11\4\0\1\11\1\0\4\11\1\45\16\11\3\0"+
    "\1\11\4\0\1\11\1\0\3\11\1\46\17\11\3\0"+
    "\1\11\4\0\1\11\1\0\1\11\1\47\21\11\3\0"+
    "\1\11\4\0\1\11\1\0\13\11\1\50\7\11\3\0"+
    "\1\11\4\0\1\11\1\0\13\11\1\51\7\11\3\0"+
    "\1\11\4\0\1\11\1\0\17\11\1\52\3\11\3\0"+
    "\1\11\4\0\1\11\1\0\1\11\1\53\21\11\3\0"+
    "\1\11\4\0\1\11\1\0\13\11\1\54\7\11\3\0"+
    "\1\11\4\0\1\11\1\0\7\11\1\55\13\11\3\0"+
    "\1\11\4\0\1\11\1\0\14\11\1\56\6\11\3\0"+
    "\1\11\4\0\1\11\1\0\20\11\1\57\2\11\3\0"+
    "\1\11\4\0\1\11\1\0\7\11\1\60\13\11\3\0"+
    "\1\11\4\0\1\11\1\0\11\11\1\61\11\11\3\0"+
    "\1\11\4\0\1\11\1\0\20\11\1\62\2\11\3\0"+
    "\1\11\4\0\1\11\1\0\10\11\1\63\12\11\3\0"+
    "\1\11\4\0\1\11\1\0\14\11\1\64\6\11\3\0"+
    "\1\11\4\0\1\11\1\0\1\11\1\65\21\11\3\0"+
    "\1\11\4\0\1\11\1\0\1\11\1\66\21\11\3\0"+
    "\1\11\4\0\1\11\1\0\12\11\1\67\10\11\3\0"+
    "\1\11\4\0\1\11\1\0\12\11\1\70\10\11\3\0"+
    "\1\11\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1160];
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
    "\3\0\1\1\1\11\16\1\1\11\1\1\1\11\13\1"+
    "\2\11\25\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[56];
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


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
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
    while (i < 110) {
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token next_token() throws java.io.IOException {
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
        case 14:
          { return new Token (Token.FLOAT, yytext());
          }
        case 19: break;
        case 11:
          { return new Token (Token.INT, yytext());
          }
        case 20: break;
        case 17:
          { return new Token (Token.STATIC, yytext());
          }
        case 21: break;
        case 16:
          { return new Token (Token.CLASS, yytext());
          }
        case 22: break;
        case 5:
          { yybegin(YYINITIAL);
          }
        case 23: break;
        case 3:
          { return new Token (Token.IDENT, yytext());
          }
        case 24: break;
        case 18:
          { return new Token (Token.PUBLIC, yytext());
          }
        case 25: break;
        case 15:
          { return new Token (Token.WHILE, yytext());
          }
        case 26: break;
        case 6:
          { return new Token (Token.REAL, new Double (yytext()));
          }
        case 27: break;
        case 12:
          { return new Token (Token.FOR, yytext());
          }
        case 28: break;
        case 7:
          { return new Token (Token.IF, yytext());
          }
        case 29: break;
        case 8:
          { return new Token (Token.DO, yytext());
          }
        case 30: break;
        case 10:
          { yybegin(Block);
          }
        case 31: break;
        case 2:
          { return new Token (Token.SPECIAL, yytext());
          }
        case 32: break;
        case 9:
          { yybegin(Line);
          }
        case 33: break;
        case 13:
          { return new Token (Token.VOID, yytext());
          }
        case 34: break;
        case 1:
          { return new Token (Token.INT, new Integer (yytext()));
          }
        case 35: break;
        case 4:
          {
          }
        case 36: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {                                 {return new Token (Token.EOF, null);}
 }
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
