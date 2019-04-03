
package practicapl;
import java_cup.runtime.*;

%%

%class AnalizadorLexico
%unicode
%line
%column
%cup

/* GENERALES */
TerminacionLinea = \r|\n|\r\n
CualquierCaracter = [^\r\n]
EspacionBlaco = {TerminacionLinea} | [ \t\f]


/* IDENTIFICADORES */

Identificador = [a-zA-Z]+ [a-zA-Z0-9_]*


/* CONSTANTES NUMERICAS */

// Constante numérica entera:
ConstNumericaEntera = [+-]? [0-9]+

// Constante numérica real:

PuntoFijo = [+-]? [0-9]+ [.] [0-9]+
Exponencial = [+-]? [0-9]+ [Ee] [+-]? [0-9]+
Mixto = [+-]? {PuntoFijo} [Ee] [+-]? [0-9]+

/* CONSTANTES LITERALES*/

ConstanteLiteral = ['] {CualquierCaracter}* [']

/* COMENTARIOS */

UnaLinea = [{] {CualquierCaracter}* [}]
MultiLinea = [(][*] ({CualquierCaracter} | {TerminacionLinea})* [*][)]

%%

<YYINITIAL> {
	
	/* RESTO */
	"program "							{ return new Symbol(sym.program,yyline,yycolumn,yytext()); }
	";"									{ return new Symbol(sym.semicolon,yyline,yycolumn,yytext()); }
	"."									{ return new Symbol(sym.dot,yyline,yycolumn,yytext()); }
	[b][e][g][i][n]						{ return new Symbol(sym.begin,yyline,yycolumn,yytext()); }
	[e][n][d]							{ return new Symbol(sym.end,yyline,yycolumn,yytext()); }
	"const "							{ return new Symbol(sym.constant,yyline,yycolumn,yytext()); }
	"="									{ return new Symbol(sym.equal,yyline,yycolumn,yytext()); }
	"var "								{ return new Symbol(sym.var,yyline,yycolumn,yytext()); }
	":"									{ return new Symbol(sym.colon,yyline,yycolumn,yytext()); }
	","									{ return new Symbol(sym.comma,yyline,yycolumn,yytext()); }
	"procedure "						{ return new Symbol(sym.procedure,yyline,yycolumn,yytext()); }
	"function "							{ return new Symbol(sym.function,yyline,yycolumn,yytext()); }
	"("									{ return new Symbol(sym.openParenthesis,yyline,yycolumn,yytext()); }
	")"									{ return new Symbol(sym.closeParenthesis,yyline,yycolumn,yytext()); }
	"INTEGER "							{ return new Symbol(sym.INTEGER,yyline,yycolumn,yytext()); }
	"REAL "								{ return new Symbol(sym.REAL,yyline,yycolumn,yytext()); }
	":="								{ return new Symbol(sym.assig,yyline,yycolumn,yytext()); }
	"+"									{ return new Symbol(sym.plus,yyline,yycolumn,yytext()); }
	"-"									{ return new Symbol(sym.minus,yyline,yycolumn,yytext()); }
	"*"									{ return new Symbol(sym.multiplication,yyline,yycolumn,yytext()); }
	"div "								{ return new Symbol(sym.div,yyline,yycolumn,yytext()); }
	"mod "								{ return new Symbol(sym.mod,yyline,yycolumn,yytext()); }
	
	
	/* SENTENCIAS DE CONTROL DE FLUJO*/
	"or " 								{ return new Symbol(sym.or,yyline,yycolumn,yytext()); }
	"and " 								{ return new Symbol(sym.and,yyline,yycolumn,yytext()); }
	"not "								{ return new Symbol(sym.not,yyline,yycolumn,yytext()); }
	"<"									{ return new Symbol(sym.less,yyline,yycolumn,yytext()); }
	">"									{ return new Symbol(sym.greater,yyline,yycolumn,yytext()); }
	"<="								{ return new Symbol(sym.lessEqual,yyline,yycolumn,yytext()); }
	">="								{ return new Symbol(sym.greaterEqual,yyline,yycolumn,yytext()); }
	"if "								{ return new Symbol(sym.ifConditional,yyline,yycolumn,yytext()); }
	"then "								{ return new Symbol(sym.then,yyline,yycolumn,yytext()); }
	"else "								{ return new Symbol(sym.elseConditional,yyline,yycolumn,yytext()); }
	"while "							{ return new Symbol(sym.whileLoop,yyline,yycolumn,yytext()); }
	"do "								{ return new Symbol(sym.doFor,yyline,yycolumn,yytext()); }
	"repeat "							{ return new Symbol(sym.repeat,yyline,yycolumn,yytext()); }
	"until "							{ return new Symbol(sym.until,yyline,yycolumn,yytext()); }
	"for "								{ return new Symbol(sym.forLoop,yyline,yycolumn,yytext()); }
	"to "								{ return new Symbol(sym.to,yyline,yycolumn,yytext()); }
	"downto "							{ return new Symbol(sym.downto,yyline,yycolumn,yytext()); }
	
	/* IDENTIFICADORES */ 
    {Identificador}                    	{ return new Symbol(sym.identifier,yyline,yycolumn); }

    /* CONSTANTES */
    {ConstNumericaEntera}				{ return new Symbol(sym.numeric_integer_const,yyline,yycolumn); }
	{PuntoFijo}							{ return new Symbol(sym.numeric_real_const,yyline,yycolumn); }
	{Exponencial}						{ return new Symbol(sym.numeric_real_const,yyline,yycolumn); }
	{Mixto}								{ return new Symbol(sym.numeric_real_const,yyline,yycolumn); }

    /* CONSTANTE LITERAL */
    {ConstanteLiteral}					{ return new Symbol(sym.string_const,yyline,yycolumn); }
    /* COMENTARIOS */
    {UnaLinea}							{ /* ignorar */ }
	{MultiLinea}						{ /* ignorar */ }
	
	/* ESPACIO BLANCO */

	{EspacionBlaco}						{ /* ignorar */ }
	

}
	
/* error fallback */

{ConstNumericaEntera}{Identificador} 	{ throw new RuntimeException("Illegal character \""+yytext()+ "\" at line "+yyline+", column "+yycolumn); }
[^]                                 	{ throw new RuntimeException("Illegal character \""+yytext()+ "\" at line "+yyline+", column "+yycolumn); }