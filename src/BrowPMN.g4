grammar BrowPMN;

@header {
import struct.*;
import static struct.Node.*;
}

prog returns [Node result]
    : (s=sttm {$result = $s.result;})+ 
    ;


sttm returns [Node result]
    : co=assinatura {$result = $co.result;}
    | NEWLINE
    ;


assinatura returns [Node result]
    : atribuicao {$result = $atribuicao.result;}
    | string// valor {$result = $valor.result;}
    //| fluxo {$result = $fluxo.result;}
    ;



atribuicao returns [Node result]
    : id=ID '=' string {$result = mkAssing($id.getText(), $string.result, "");}
    | (tag=TAGINICIO|tag=TAGFIM) id=ID '=' string {$result = mkAssing($id.getText(), $string.result, $tag.getText());}
    //| id=ID '=' valor {$result = mkAssing($id.getText(), $valor.result);}
    | variavel {$result = $variavel.result;}
    ;


fluxo returns [Node result]
    : (var=atribuicao) '->' (next=atribuicao) {$result = $var.result.setNextNode($next.result, "");}
    | (var=atribuicao) '->' (next=atribuicao) ('(' str=STRING ')') {$result = $var.result.setNextNode($next.result, $str.getText());}
    ;

/*
valor returns [Node result]
    | (tag=TAGINICIO | tag=TAGFIM) ID {$result = mkVariable($ID.getText(), $tag.getText());}
    ;
*/

variavel returns [Node result]
    : ID {$result = mkVariable($ID.getText());}
    ;

string returns [Node result]
    : str = STRING {$result = new Str($str.getText());}
    ;




FUNCTAG : 'def';
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
NEWLINE : '\r'? '\n' ;
ATRIBUICAO    : '=' ;
WHILE : 'while' ;
IF : 'if' ;
ELIF : 'elif';
ELSE : 'else' ;
DO : 'do';
AND : 'and';
IGNORE : [ \t\r\n]+ -> skip;


/*
funcao returns [Node result]
    : FUNCTAG func=ID LPAR (var1=ID (COMMA var2=ID)) RPAR LCOL codigo NEWLINE RCOL{
        $result = new Function($func, $var1, $var2).setCode($codigo.result);
    }
//    : FUNCTAG ID LPAR (ID (COMMA ID)*)? RPAR LCOL codigo NEWLINE RCOL
    ;
*/

/*
condicional returns [Node result]
    // Exclusivo
    :  if=exclusivo (elif=exclusivo_caminho)* (else=exclusivo_restante)? {$result = }
    // Paralelo
    | paralelo (paralelo_caminho)*
    // Repetição
    | loop {$result = $loop.result;}
    ;


loop
    :  WHILE LPAR ID COMMA ID RPAR (LPAR STRING RPAR)? LCOL (assinatura)* NEWLINE RCOL (LPAR STRING RPAR)?
    ;


paralelo
    : DO LPAR ID COMMA ID RPAR (LPAR STRING RPAR)? LCOL (assinatura)* NEWLINE RCOL
    ;


paralelo_caminho : ELSE RPAR (LPAR STRING RPAR)? LCOL (assinatura)* NEWLINE RCOL
    ;


exclusivo
    : IF LPAR ID COMMA ID RPAR (LPAR STRING RPAR)? LCOL (assinatura)* NEWLINE RCOL
    ;


exclusivo_caminho
    : ELIF LPAR ID COMMA ID RPAR (LPAR STRING RPAR)? LCOL (assinatura)* NEWLINE RCOL
    ;


exclusivo_restante
    : ELSE RPAR (LPAR STRING RPAR)? LCOL (assinatura)* NEWLINE RCOL
    ;
*/


