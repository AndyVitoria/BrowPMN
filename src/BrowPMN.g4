grammar BrowPMN;


prog
    : (sttm)+
    ;


sttm
    : (funcao)+
    | NEWLINE
    ;



assinatura
    : ID ATRIBUICAO valor
    | TAGINICIO ID ATRIBUICAO valor
    | TAGFIM ID ATRIBUICAO valor
    | fluxo
    | ID ATRIBUICAO ID LPAR (ID (COMMA ID)*)? RPAR
    | condicional
    ;



codigo
    : (assinatura | NEWLINE)+
    ;

fluxo
    : ID PROXIMO ID (LPAR STRING RPAR)?
    ;


condicional
    // Exclusivo
    :  exclusivo (exclusivo_caminho)* (exclusivo_restante)?
    // Paralelo
    | paralelo (paralelo_caminho)*
    // Repetição
    | loop
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


funcao
    : FUNCTAG ID LPAR (ID (COMMA ID)*)? RPAR LCOL codigo NEWLINE RCOL
    ;


valor
    : STRING
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
