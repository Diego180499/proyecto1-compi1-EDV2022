package analizadores;

import java.io.*;
import java_cup.runtime.Symbol;


%%
%public
%class MiLexerCup

digit = [0-9]
decim={digit}+(\.){digit}+
num=(\-)?{digit}+
letter = [a-zA-Z]
identificador = {letter}({letter}|{digit}|\_)*
simpleComment=(\/\/)(.)*
multiComment=(\/\*)[^\*\/]*(\*\/)
chr=(\'){letter}(\')|(\'){digit}(\')
whitespace = [ \t\r\n]

%type java_cup.runtime.Symbol
%line
%column
%cup



%state STRING

%eofval{
    
    return new Symbol(sym.EOF, null);

%eofval}


%{
    StringBuffer string = new StringBuffer();    
    
    private Symbol symbol(int type, Object value){
        return new Symbol(type,yyline,yycolumn,value);
    }

    private Symbol symbol(int type){
        return new Symbol(type,yyline,yycolumn);
    }

%}

%%

//reglas lexicas
<YYINITIAL>{
\"      {string.setLength(0); yybegin(STRING);}
}
<STRING> {
      \"                             { yybegin(YYINITIAL); 
                                      return new Symbol(sym.CADENA, yyline, yychar, string.toString());
                                     }
      [^\n\r\"\\]+                   { string.append( yytext() ); }
      \\t                            { string.append('\t'); }
      \\n                            { string.append('\n'); }

      \\r                            { string.append('\r'); }
      \\\"                           { string.append('\"'); }
      \\                             { string.append('\\'); }
    }

"break"           {return new Symbol(sym.BREAK, yyline, yychar, yytext());}
"continue"           {return new Symbol(sym.CONTINUE, yyline, yychar, yytext());}
"do"           {return new Symbol(sym.DO, yyline, yychar, yytext());}
"foreach"           {return new Symbol(sym.FOREACH, yyline, yychar, yytext());}
"new"           {return new Symbol(sym.NEW, yyline, yychar, yytext());}
"out"           {return new Symbol(sym.OUT, yyline, yychar, yytext());}
"return"           {return new Symbol(sym.RETURN, yyline, yychar, yytext());}
"true"           {return new Symbol(sym.BOOLEANO, yyline, yychar, yytext());}
"double"           {return new Symbol(sym.DOUBLE, yyline, yychar, yytext());}
"int"           {return new Symbol(sym.INT, yyline, yychar, yytext());}
"null"           {return new Symbol(sym.NULL, yyline, yychar, yytext());}
"public"           {return new Symbol(sym.PUBLIC, yyline, yychar, yytext());}
"switch"           {return new Symbol(sym.SWITCH, yyline, yychar, yytext());}
"case"           {return new Symbol(sym.CASE, yyline, yychar, yytext());}
"default"           {return new Symbol(sym.DEFAULT, yyline, yychar, yytext());}
"else"           {return new Symbol(sym.ELSE, yyline, yychar, yytext());}  
"if"           {return new Symbol(sym.IF, yyline, yychar, yytext());}
"static"           {return new Symbol(sym.STATIC, yyline, yychar, yytext());}
"void"           {return new Symbol(sym.VOID, yyline, yychar, yytext());}
"bool"           {return new Symbol(sym.BOOL, yyline, yychar, yytext());}
"const"           {return new Symbol(sym.CONST, yyline, yychar, yytext());}
"false"           {return new Symbol(sym.BOOLEANO, yyline, yychar, yytext());}
"for"           {return new Symbol(sym.FOR,  yyline, yychar, yytext());}
"string"           {return new Symbol(sym.STRING, yyline, yychar, yytext());}
"while"           {return new Symbol(sym.WHILE, yyline, yychar, yytext());}
"Console.Write"   {return new Symbol(sym.PRINT, yyline, yychar, yytext());}

//Signos
"+"           {return new Symbol(sym.PLUS, yyline, yychar, yytext());}
"-"           {return new Symbol(sym.LESS, yyline, yychar, yytext());}
"*"           {return new Symbol(sym.MULT, yyline, yychar, yytext());}
"/"           {return new Symbol(sym.DIV, yyline, yychar, yytext());}
"<"           {return new Symbol(sym.MIN, yyline, yychar, yytext());}
">"           {return new Symbol(sym.GREATER,  yyline, yychar, yytext());}
"="           {return new Symbol(sym.EQUAL, yyline, yychar, yytext());}
","           {return new Symbol(sym.COMA, yyline, yychar, yytext());}
";"           {return new Symbol(sym.SEMI_COLON, yyline, yychar, yytext());}
"."           {return new Symbol(sym.POINT, yyline, yychar, yytext());}
":"           {return new Symbol(sym.T_POINTS, yyline, yychar, yytext());}

//Signos de agrupacion
"("           {return new Symbol(sym.P_A, yyline, yychar, yytext());}
")"           {return new Symbol(sym.P_C, yyline, yychar, yytext());}
"{"           {return new Symbol(sym.LL_A, yyline, yychar, yytext());}
"}"           {return new Symbol(sym.LL_C, yyline, yychar, yytext());}
"'"           {return new Symbol(sym.S_QUOTE, yyline, yychar, yytext());}


{identificador}              {return new Symbol(sym.IDENTIFICADOR, yyline, yychar, yytext());}
{num}                        {return new Symbol(sym.DIGIT, yyline, yychar, yytext());}
{decim}                       {return new Symbol(sym.DECIMAL, yyline, yychar, yytext());}
{chr}                       {return new Symbol(sym.CARACTER, yyline, yychar, yytext());}
{simpleComment}             {return new Symbol(sym.SIMPLE_COMMENT, yyline, yychar, yytext());}
{multiComment}              {return new Symbol(sym.MULTI_COMMENT, yyline, yychar, yytext());}

{whitespace}+     {/*Ignore*/}
[^]               {return new Symbol(sym.ERROR, yyline, yychar, yytext());}

