/*grammar BrowPMN;

@header {
import ast.Expr;
import static ast.Expr.*;
import ast.Op;
}


prog returns [Expr result]
    : (s=sttm {$result = $s.result;})+
    ;

sttm returns [Expr result]
    : e=expr NEWLINE      {$result = $e.result;}
    | a=assign NEWLINE    {$result = $a.result;}
    | NEWLINE             {$result = null;}
    ;

assign returns [Expr result]
    : ID GETS e=expr      {$result = mkAssign($ID.text, $e.result);}
    ;

expr returns [Expr result]
    : STRING {$result = mkString($STRING.text);}
    ;


fragment WS : ' ';
fragment CHAR : [a-zA-Z0-9];
fragment STRTAG : '"' ;
STRING : STRTAG (CHAR|WS)* STRTAG;
ID      : [_a-zA-Z][_a-zA-Z0-9]* ;
NEWLINE : '\r'? '\n' ;
GETS    : '=' ;
IGNORE      : [ \t\r\n]+ -> skip;*/

grammar BrowPMN;


prog
    : (inicio)+
    ;

inicio
    : assinatura NEWLINE
    | NEWLINE
    ;

assinatura
    : ID ATRIBUICAO valor
    | TAGINICIO ID ATRIBUICAO valor
    | TAGFIM ID ATRIBUICAO valor
    | fluxo
    ;

fluxo
    : ID PROXIMO ID (LPAR STRING RPAR)?
    ;

funcao
    : ID LPAR (ID (COMMA ID)*)? RPAR LCOL inicio RCOL
    ;

valor
    : STRING
    ;

COMMA : ',' ;
TAGINICIO : '!' ;
TAGFIM : '#' ;
LPAR : '(' ;
RPAR : ')' ;
PROXIMO : '->' ;
LCOL : '{' ;
RCOL : '}' ;
fragment WS : ' ';
fragment CHAR : [a-zA-Z0-9];
fragment STRTAG : '"' ;
STRING : STRTAG (CHAR|WS)* STRTAG;
ID : [_a-zA-Z][_a-zA-Z0-9]* ;
NEWLINE : ';' ('\r'? '\n')* ;
ATRIBUICAO    : '=' ;
IGNORE      : [ \t\r\n]+ -> skip;
