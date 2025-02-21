grammar TSmm;	


// ANALISIS LEXICO

INT_CONSTANT: [1-9] [0-9]*
            | '0';

INT_LITERAL: [0-9]+;

WHITESPACE: [ ]+ -> skip;

COMMENT: '//'.*? [\r\n] -> skip;

MULTIPLELINES_COMMENT: '/*' .*? '*/';

ID: '_'?[a-zA-Z][0-9]'_';

REAL_CONSTANT: [0-9]*'.'[0-9]*;

REAL_LITERAL_WITHEXPONENT: [0-9]*'.'?[0-9]*[eE][+-]?[1-9]+;

CHAR_CONSTANT: '\'' . '\''

| '\\[0-9]+'

| ('\\n'|'\\t')
;

SIMPLE_TYPE: 'number'
| 'int'
| 'char';

RETURN_TYPE: SIMPLE_TYPE | 'void';

// ANALIZADOR SINTACTICO

program: expression EOF;

/*let real: number;
let c1, c2: char;*/
variable_definition: 'let' variable_definition
| ID ',' variable_definition
| ID ':' variable_definition
| TYPE ';';

/*
function f(n: int,r: number): int {
function main(): void{
IMPORTANTE -> DENTRO DE UNA DEFINICION NO SE PUEDEN DEFINIR OTRAS FUNCIONES
*/
function_definition: 'function' ID '(' ID ':' TYPE  ','
| ID ':' TYPE  ')' ':' RETURN_TYPE '{'  '}'
| variable_definition
| statement
|;

/*
Array Definition
let vector: [10][5]int;
*/
array_definition: 'let' ID ':'
| '[' INT_LITERAL ']' array_definition
| '[' INT_LITERAL ']' TYPE;

/*
// Record
  	let pair: [
    	let integer: int;
    	let character: char;
  	];
*/
record: 'let' ID ':' '[' record
| 'let' ID ':' TYPE ';' record
| 'let' ID ':' TYPE ';' '];'

/*
  	log f(i, (i as number)); // Invocation as an expression

*/
statement: 'log' expression
| ',' expression
|;

expression:INT_CONSTANT
| ID
| expression '*' expression
| expression ('+'|'-') expression;




