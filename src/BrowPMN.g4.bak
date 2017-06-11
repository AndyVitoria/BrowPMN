grammar BrowPMN;

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
IGNORE      : [ \t\r\n]+ -> skip;