grammar extr;
start: documento+ EOF;

documento: linha1 linha2 linha3 linha4 linhaJournal linha5 linha6;
linha1: l1+ NEWLINE;
linha2: titulo+ NEWLINE;
linha3: autores+ NEWLINE;
linha4: comments* NEWLINE?;
linhaJournal: seq* NEWLINE?;
linha5: subjects NEWLINE;
linha6: resumo+ NEWLINE?;

seq: JOURNAL pontuacao l1+;
JOURNAL:'Journal-ref';
l1: alfanumerico | pontuacao;
titulo: alfanumerico | pontuacao;
autores: alfanumerico | pontuacao;
resumo: alfanumerico | pontuacao;
comments: 'Comments:' | alfanumerico | pontuacao; 
subjects: subAux2 pontuacao subAux+;
subAux: alfanumerico | pontuacao;
subAux2: 'Subjects';
pontuacao: '(' |')'|'.'|','|';'|'_'|'-'|'['|']'|':'|'%'|'\\%' | '?' | '\\' | '"' | '""' | '\"' | '&'|'/';
alfanumerico:IDENTIFICADOR|NUMERO|ACENTOS;
NUMERO:[0-9]+;
IDENTIFICADOR:[a-zA-Z]+;
ACENTOS:('\u00c0'..'\u00ff')+;
NEWLINE: '\r\n';
WS: [ \t]+ -> skip;