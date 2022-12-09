package analizadores;

import java.io.*;


%%
%public
%class MiLexer

digit = [0-9]
decim={digit}+(\.){digit}+
num=(\-)?{digit}+
letter = [a-zA-Z]
identificador = {letter}({letter}|{digit}|\_)*
simpleComment=(\/\/)(.)*
multiComment=(\/\*)[^\*\/]*(\*\/)
chr=(\'){letter}(\')|(\'){digit}(\')
whitespace = [ \t\r\n]

%type Token
%line
%column

%state STRING

%eofval{
    
    return new Token(TokenConstant.EOF, null);

%eofval}


%{
    StringBuffer string = new StringBuffer();    
%}

%%

//reglas lexicas
<YYINITIAL>{
\"      {string.setLength(0); yybegin(STRING);}
}
<STRING> {
      \"                             { yybegin(YYINITIAL); 
                                      return new Token(TokenConstant.CADENA, string.toString(), yyline, yycolumn);
                                     }
      [^\n\r\"\\]+                   { string.append( yytext() ); }
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }

      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }
    }

"break"           {return new Token(TokenConstant.BREAK, yytext(), yyline, yycolumn);}
"continue"           {return new Token(TokenConstant.CONTINUE, yytext(), yyline, yycolumn);}
"do"           {return new Token(TokenConstant.DO, yytext(), yyline, yycolumn);}
"foreach"           {return new Token(TokenConstant.FOREACH, yytext(), yyline, yycolumn);}
"new"           {return new Token(TokenConstant.NEW, yytext(), yyline, yycolumn);}
"out"           {return new Token(TokenConstant.OUT, yytext(), yyline, yycolumn);}
"return"           {return new Token(TokenConstant.RETURN, yytext(), yyline, yycolumn);}
"true"           {return new Token(TokenConstant.BOOLEANO, yytext(), yyline, yycolumn);}
"double"           {return new Token(TokenConstant.DOUBLE,yytext(), yyline, yycolumn);}
"int"           {return new Token(TokenConstant.INT, yytext(), yyline, yycolumn);}
"null"           {return new Token(TokenConstant.NULL, yytext(), yyline, yycolumn);}
"public"           {return new Token(TokenConstant.PUBLIC, yytext(), yyline, yycolumn);}
"switch"           {return new Token(TokenConstant.SWITCH, yytext(), yyline, yycolumn);}
"case"           {return new Token(TokenConstant.CASE, yytext(), yyline, yycolumn);}
"default"           {return new Token(TokenConstant.DEFAULT, yytext(), yyline, yycolumn);}
"else"           {return new Token(TokenConstant.ELSE, yytext(), yyline, yycolumn);}  
"if"           {return new Token(TokenConstant.IF, yytext(), yyline, yycolumn);}
"static"           {return new Token(TokenConstant.STATIC, yytext(), yyline, yycolumn);}
"void"           {return new Token(TokenConstant.VOID, yytext(), yyline, yycolumn);}
"bool"           {return new Token(TokenConstant.BOOL, yytext(), yyline, yycolumn);}
"const"           {return new Token(TokenConstant.CONST, yytext(), yyline, yycolumn);}
"false"           {return new Token(TokenConstant.BOOLEANO, yytext(), yyline, yycolumn);}
"for"           {return new Token(TokenConstant.FOR, yytext(), yyline, yycolumn);}
"string"           {return new Token(TokenConstant.STRING, yytext(), yyline, yycolumn);}
"while"           {return new Token(TokenConstant.WHILE, yytext(), yyline, yycolumn);}
"Console.Write"   {return new Token(TokenConstant.PRINT, yytext(), yyline, yycolumn);}

//Signos
"+"           {return new Token(TokenConstant.PLUS, yytext(), yyline, yycolumn);}
"-"           {return new Token(TokenConstant.LESS, yytext(), yyline, yycolumn);}
"*"           {return new Token(TokenConstant.MULT, yytext(), yyline, yycolumn);}
"/"           {return new Token(TokenConstant.DIV, yytext(), yyline, yycolumn);}
"<"           {return new Token(TokenConstant.MIN, yytext(), yyline, yycolumn);}
">"           {return new Token(TokenConstant.GREATER, yytext(), yyline, yycolumn);}
"="           {return new Token(TokenConstant.EQUAL, yytext(), yyline, yycolumn);}
","           {return new Token(TokenConstant.COMA, yytext(), yyline, yycolumn);}
";"           {return new Token(TokenConstant.SEMI_COLON, yytext(), yyline, yycolumn);}
"."           {return new Token(TokenConstant.POINT, yytext(), yyline, yycolumn);}
":"           {return new Token(TokenConstant.T_POINTS, yytext(), yyline, yycolumn);}

//Signos de agrupacion
"("           {return new Token(TokenConstant.P_A, yytext(), yyline, yycolumn);}
")"           {return new Token(TokenConstant.P_C, yytext(), yyline, yycolumn);}
"{"           {return new Token(TokenConstant.LL_A, yytext(), yyline, yycolumn);}
"}"           {return new Token(TokenConstant.LL_C, yytext(), yyline, yycolumn);}
"\""           {return new Token(TokenConstant.QUOTE, yytext(), yyline, yycolumn);}
"'"           {return new Token(TokenConstant.S_QUOTE, yytext(), yyline, yycolumn);}


{identificador}              {return new Token(TokenConstant.ID, yytext(), yyline, yycolumn);}
{num}                        {return new Token(TokenConstant.DIGIT, yytext(), yyline, yycolumn);}
{decim}                       {return new Token(TokenConstant.DECIMAL, yytext(), yyline, yycolumn);}
{chr}                       {return new Token(TokenConstant.CARACTER, yytext(), yyline, yycolumn);}
{simpleComment}   {return new Token(TokenConstant.SIMPLE_COMMENT, yytext(), yyline, yycolumn);}
{multiComment}    {return new Token(TokenConstant.MULTI_COMMENT, yytext(), yyline, yycolumn);}

{whitespace}+     {/*Ignore*/}
[^]               {return new Token(TokenConstant.ERROR, yytext(), yyline, yycolumn);}

