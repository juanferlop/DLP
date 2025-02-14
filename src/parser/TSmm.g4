grammar TSmm;	

program: 
       ;

fragment
CHAR:[a-zA-Z];
  		 
INT_CONSTANT: [1-9] [0-9]*
            | '0'
            ;

WHITESPACE: [ ]+ -> skip;

COMMENT: '//'.*?[\n|EoF] -> skip;

MULTIPLELINES_COMMENT: '/*' .*? '*/';

ID: '_'?[a-zA-Z][0-9]'_';

INT_LITERAL: [0-9]+;

REAL_CONSTANT: [0-9]*'.'[0-9]*;

CHAR_CONSTANT: 'CHAR';