package analizadores;

import java.io.*;


%%
%public
%class MiLexer

digit = [0-9]
letter = [a-zA-Z]
identificador = {letter}({letter}|{digit}|\_)*
simpleComment=(\/\/)(.)*
multiComment=(\/\*)[^\*\/]*(\*\/)

whitespace = [ \t\r\n]

%type Token

%eofval{
    
    return new Token(TokenConstant.EOF, null);

%eofval}


%%

//reglas lexicas

"abstract"           {return new Token(TokenConstant.ABSTRACT, yytext());}
"break"           {return new Token(TokenConstant.BREAK, yytext());}
"char"           {return new Token(TokenConstant.CHAR, "var");}
"continue"           {return new Token(TokenConstant.CONTINUE, yytext());}
"do"           {return new Token(TokenConstant.DO, yytext());}
"event"           {return new Token(TokenConstant.EVENT, yytext());}
"finally"           {return new Token(TokenConstant.FINALLY, yytext());}
"foreach"           {return new Token(TokenConstant.FOREACH, yytext());}
"in"           {return new Token(TokenConstant.IN, yytext());}
"is"           {return new Token(TokenConstant.IS, yytext());}
"new"           {return new Token(TokenConstant.NEW, yytext());}
"out"           {return new Token(TokenConstant.OUT, yytext());}
"protected"           {return new Token(TokenConstant.PROTECTED, yytext());}
"return"           {return new Token(TokenConstant.RETURN, yytext());}
"sizeof"           {return new Token(TokenConstant.SIZEOF, yytext());}
"struct"           {return new Token(TokenConstant.STRUCT, yytext());}
"true"           {return new Token(TokenConstant.TRUE, yytext());}
"ulong"           {return new Token(TokenConstant.ULONG, "var");}
"using"           {return new Token(TokenConstant.USING, yytext());}
"as"           {return new Token(TokenConstant.AS, yytext());}
"byte"           {return new Token(TokenConstant.BYTE, "var");}
"checked"           {return new Token(TokenConstant.CHECKED, yytext());}
"decimal"           {return new Token(TokenConstant.DECIMAL, "var");}
"double"           {return new Token(TokenConstant.DOUBLE, "var");}
"explicit"           {return new Token(TokenConstant.EXPLICIT, yytext());}
"fixed"           {return new Token(TokenConstant.FIXED, yytext());}
"goto"           {return new Token(TokenConstant.GOTO, yytext());}
"int"           {return new Token(TokenConstant.INT, "var");}
"lock"           {return new Token(TokenConstant.LOCK, yytext());}
"null"           {return new Token(TokenConstant.NULL, yytext());}
"override"           {return new Token(TokenConstant.OVERRIDE, yytext());}
"public"           {return new Token(TokenConstant.PUBLIC, yytext());}
"sbyte"           {return new Token(TokenConstant.SBYTE, "var");}
"stackalloc"           {return new Token(TokenConstant.STACKALLOC, yytext());}
"switch"           {return new Token(TokenConstant.SWITCH, yytext());}
"try"           {return new Token(TokenConstant.TRY, yytext());}
"unchecked"           {return new Token(TokenConstant.UNCHECKED, yytext());}
"virtual"           {return new Token(TokenConstant.VIRTUAL, yytext());}
"base"           {return new Token(TokenConstant.BASE, yytext());}
"case"           {return new Token(TokenConstant.CASE, yytext());}
"class"           {return new Token(TokenConstant.CLASS, yytext());}
"default"           {return new Token(TokenConstant.DEFAULT, yytext());}
"else"           {return new Token(TokenConstant.ELSE, yytext());}
"extern"           {return new Token(TokenConstant.EXTERN, yytext());}
"float"           {return new Token(TokenConstant.FLOAT, "var");}
"if"           {return new Token(TokenConstant.IF, yytext());}
"long"           {return new Token(TokenConstant.LONG, "var");}
"object"           {return new Token(TokenConstant.OBJECT, "var");}
"params"           {return new Token(TokenConstant.PARAMS, yytext());}
"readonly"           {return new Token(TokenConstant.READONLY, yytext());}
"sealed"           {return new Token(TokenConstant.SEALED, yytext());}
"static"           {return new Token(TokenConstant.STATIC yytext());}
"this"           {return new Token(TokenConstant.THIS, yytext());}
"typeof"           {return new Token(TokenConstant.TYPEOF, yytext());}
"unsafe"           {return new Token(TokenConstant.UNSAFE, yytext());}
"void"           {return new Token(TokenConstant.VOID, yytext());}
"bool"           {return new Token(TokenConstant.BOOL, "var");}
"catch"           {return new Token(TokenConstant.CATCH, yytext());}
"const"           {return new Token(TokenConstant.CONST, yytext());}
"delegate"           {return new Token(TokenConstant.DELEGATE, yytext());}
"enum"           {return new Token(TokenConstant.ENUM   , yytext());}
"false"           {return new Token(TokenConstant.FALSE, yytext());}
"for"           {return new Token(TokenConstant.FOR, yytext());}
"implicit"           {return new Token(TokenConstant.IMPLICIT, yytext());}
"internal"           {return new Token(TokenConstant.INTERNAL, yytext());}
"namespace"           {return new Token(TokenConstant.NAMESPACE, yytext());}
"operator"           {return new Token(TokenConstant.OPERATOR, yytext());}
"private"           {return new Token(TokenConstant.PRIVATE, yytext());}
"ref"           {return new Token(TokenConstant.REF, yytext());}
"short"           {return new Token(TokenConstant.SHORT, "var");}
"string"           {return new Token(TokenConstant.STRING, yytext());}
"throw"           {return new Token(TokenConstant.THROW, yytext());}
"uint"           {return new Token(TokenConstant.UINT, "var");}
"ushort"           {return new Token(TokenConstant.USHORT, "var");}
"while"           {return new Token(TokenConstant.WHILE, yytext());}
"interface"           {return new Token(TokenConstant.INTERFACE, yytext());}

//Signos
"+"           {return new Token(TokenConstant.PLUS, yytext());}
"-"           {return new Token(TokenConstant.LESS, yytext());}
"*"           {return new Token(TokenConstant.MULT, yytext());}
"/"           {return new Token(TokenConstant.DIV, yytext());}
"<"           {return new Token(TokenConstant.MIN, yytext());}
">"           {return new Token(TokenConstant.GREATER, yytext());}
"="           {return new Token(TokenConstant.EQUAL, yytext());}
","           {return new Token(TokenConstant.COMA, yytext());}
";"           {return new Token(TokenConstant.SEMI_COLON, yytext());}
"."           {return new Token(TokenConstant.POINT, yytext());}
":"           {return new Token(TokenConstant.T_POINTS, yytext());}

//Signos de agrupacion
"("           {return new Token(TokenConstant.P_A, yytext());}
")"           {return new Token(TokenConstant.P_C, yytext());}
"{"           {return new Token(TokenConstant.LL_A, yytext());}
"}"           {return new Token(TokenConstant.LL_C, yytext());}
"\""           {return new Token(TokenConstant.QUOTE, yytext());}
"'"           {return new Token(TokenConstant.S_QUOTE, yytext());}



{identificador}                  {return new Token(TokenConstant.ID, yytext());}
{digit}+                        {return new Token(TokenConstant.DIGIT, yytext());}
{simpleComment}   {return new Token(TokenConstant.SIMPLE_COMMENT, "\'\'\'"+yytext()+"\'\'\'");}
{multiComment}    {return new Token(TokenConstant.MULTI_COMMENT, yytext());}
{whitespace}+     {/*Ignore*/}
[^]               {return new Token(TokenConstant.ERROR, yytext());}

