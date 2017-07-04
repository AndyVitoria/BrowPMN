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
    | fluxo {$result = $fluxo.result;}
    | exclusive {$result = $exclusive.result;}
    | parallel {$result = $parallel.result;}
    | loop {$result = $loop.result;}
    ;


atribuicao returns [Node result]
    : id=ID '=' string {$result = mkAssing($id.getText(), $string.result, "");}
    | (tag=TAGINICIO|tag=TAGFIM) id=ID '=' string {$result = mkAssing($id.getText(), $string.result, $tag.getText());}
    ;


fluxo returns [Node result]
    : var=ident '->' next=ident {$result = Node.setNextNode($var.result, $next.result, "");}
    | var=ident '->' next=ident ('(' str=STRING ')') {$result = Node.setNextNode($var.result, $next.result, $str.getText());}
    ;


ident returns [String result]
    : var=ID  {$result = new String($var.getText());}
    | var='*' {$result = new String($var.getText());}
    | var='+' {$result = new String($var.getText());}
    | var='@' {$result = new String($var.getText());}
    ;


string returns [Node result]
    : str = STRING {$result = new Str($str.getText());}
    ;


exclusive returns [Node result]
    : 'if' '(' id1=ident ',' id2=ident ')' '{'
        {$result = mkExclusive($id1.result, $id2.result, "","");}
    | 'if' '(' id1=ident ',' id2=ident ')' '(' desc1=STRING ')' '{'
        {$result = mkExclusive($id1.result, $id2.result, $desc1.getText(),"");}
    | 'if' '(' id1=ident ',' id2=ident ')' '(' desc1=STRING ',' desc2=STRING ')' '{'
        {$result = mkExclusive($id1.result, $id2.result, $desc1.getText(),$desc2.getText());}
    | '}' {$result = closeConditional();}
    ;


parallel returns [Node result]
    : 'do' '(' id1=ident ',' id2=ident ')' '{'
        {$result = mkParallel($id1.result, $id2.result, "","");}
    | 'do' '(' id1=ident ',' id2=ident ')' '(' desc1=STRING ')' '{'
        {$result = mkParallel($id1.result, $id2.result, $desc1.getText(),"");}
    | 'do' '(' id1=ident ',' id2=ident ')' '(' desc1=STRING ',' desc2=STRING ')' '{'
        {$result = mkParallel($id1.result, $id2.result, $desc1.getText(),$desc2.getText());}
    | '}' {$result = Node.closeConditional();}
    ;


loop returns [Node result]
    : 'while' '(' id1=ident ',' id2=ident ')' '{'
        {$result = mkLoop($id1.result, $id2.result, "","");}
    | 'while' '(' id1=ident ',' id2=ident ')' '(' desc1=STRING ')' '{'
        {$result = mkLoop($id1.result, $id2.result, $desc1.getText(),"");}
    | 'while' '(' id1=ident ',' id2=ident ')' '(' desc1=STRING ',' desc2=STRING ')' '{'
        {$result = mkLoop($id1.result, $id2.result, $desc1.getText(),$desc2.getText());}
    | '}' {$result = Node.closeConditional();}
    ;


TAGINICIO : '!' ;
TAGFIM : '#' ;
LPAR : '(' ;
RPAR : ')' ;
OPEN : '{' ;
CLOSE : '}' ;
PROXIMO : '->' ;
fragment WS : ' ';
fragment CHAR : [a-zA-Z0-9];
fragment STRTAG : '"' ;
STRING : STRTAG (CHAR|WS)* STRTAG;
ID : [_a-zA-Z][_a-zA-Z0-9]* ;
NEWLINE : '\r'? '\n' ;
ATRIBUICAO    : '=' ;
IGNORE : [ \t\r\n]+ -> skip;