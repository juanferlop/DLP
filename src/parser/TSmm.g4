grammar TSmm;	

program: 
       ;


fragment


INT_CONSTANT: [1-9] [0-9]*
            | '0';

WHITESPACE: [ ]+ -> skip;

COMMENT: '//'.*? '\\r''\\n' -> skip;

MULTIPLELINES_COMMENT: '/*' .*? '*/';

ID: '_'?[a-zA-Z][0-9]'_';

REAL_LITERAL: [0-9]*'.'[0-9]*;

REAL_LITERAL_WITHEXPONENT: [0-9]*'.'?[0-9]*[eE][+-]?[1-9]+;

CHAR_CONSTANT: [.];

CHAR_ASCII_LITERAL:'\\[0-9]+';

SPECIAL_CHARACTERS: ('\\n'|'\\t') -> skip;