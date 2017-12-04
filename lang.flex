/*---- Java preamble code ----*/
%%
%cup
%function next_token
%type java_cup.runtime.Symbol

/*---- Options and directives ----*/
%type Token // return a Token

/* The code included in %eofval{....}%eofval will be copied verbatim into the scanning method and will be
executed each time when the end of file is reached. The code returns a Token that indicates the end of file. */
%eofval{
                                {return new Token (Token.EOF, null);}
%eofval}

%state Block
%state Line

/* Macro for digits */
digits=[0-9]+
/* Macro for special characters */
spch = [\[\]\(\)\{\}\.\,\;\=(=){2}\+\-\*\/] /*everything except the double equals */

%%
/*---- Actions ----*/
/* The initial scanning state is YYINITIAL */
<YYINITIAL>"if"                 {return new Token (Token.IF, yytext());}
<YYINITIAL>"for"                {return new Token (Token.FOR, yytext());}
<YYINITIAL>"while"              {return new Token (Token.WHILE, yytext());}
<YYINITIAL>"do"                 {return new Token (Token.DO, yytext());}
<YYINITIAL>"class"              {return new Token (Token.CLASS, yytext());}
<YYINITIAL>"public"             {return new Token (Token.PUBLIC, yytext());}
<YYINITIAL>"static"             {return new Token (Token.STATIC, yytext());}
<YYINITIAL>"void"               {return new Token (Token.VOID, yytext());}
<YYINITIAL>"int"                {return new Token (Token.INT, yytext());}
<YYINITIAL>"float"              {return new Token (Token.FLOAT, yytext());}

<YYINITIAL>"/*"                 {yybegin(Block);} /*yybegin sets the current state */
<YYINITIAL>"//"                 {yybegin(Line);} /*yybegin sets the current state */

<YYINITIAL>({spch}|(=){2})               {return new Token (Token.SPECIAL, yytext());}

<YYINITIAL>[a-zA-Z_][a-zA-Z0-9_]*    {return new Token (Token.IDENT, yytext());}

<YYINITIAL>{digits}             {return new Token (Token.INT, new Integer (yytext()));}

<YYINITIAL>({digits}"."[0-9]*)|([0-9]*"."{digits})
                                {return new Token (Token.REAL, new Double (yytext()));}

<YYINITIAL>[\r\n\t\ ]+          {}

<Block>"*/"                   {yybegin(YYINITIAL);}
<Block>.                      {}
<Line>"\n"                    {yybegin(YYINITIAL);}
<Line>.                       {}
