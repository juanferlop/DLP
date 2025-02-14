grammar TSmm;	

program: 
       ;
  		 
INT_CONSTANT: [1-9] [0-9]*
            | '0'
            ;

WHITESPACE: [ ]+ -> skip;

COMMENT: '//'.*? -> skip;

MULTIPLELINES_COMMENT: '/*' .*? '*/';

ID: '_'?[a-zA-Z][0-9]'_';

INT_LITERAL_WITHOUTSIGN: [0-9]+;

REAL_CONSTANT: [0-9]*'.'[0-9]*;

CHAR_CONSTANT: