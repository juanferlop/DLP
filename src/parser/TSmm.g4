grammar TSmm;	

@header{
import ast.*;
import java.util.*;
}

// ANALISIS LEXICO

fragment
// No acepta ceros a la derecha
MANTISA:[0]*[1-9]+;

fragment
// No se puede elevar a cero
EXPONENTE:'-'?[1-9]+;

COMMENT: '//' ~[\r\n]* -> skip;

BLOCK_COMMENT : '/*' .*? '*/' -> skip ;

INT_CONSTANT: [1-9][0-9]*
| '0'
| [0-9]+;

// ¿Carácter invisible?
WHITESPACE: [ \n\t\r]+ -> skip;

//   Identificadores que comienzan con una letra o _ y seguidos de letra, dÌgito o _
ID: '_'?([a-zA-Z]|[0-9]|'_')+ ;

// Reconoce "." o ".e2"
REAL_CONSTANT:[1-9][0-9]*'.'([0]*[1-9]+)? // 12.005, 34. o 0.0003
| '.'[0]*[1-9]+  // .34
| [1-9][0-9]*'.'?MANTISA?[eE]EXPONENTE ; // 34.12E-3 o 3e3

// Literales caracter entre ''
CHAR_CONSTANT: '\''.'\''
| '\'\\n\''
| '\'\\t\''
| '\'\\'[0-9]+'\'';

SIMPLE_TYPE: 'number'
| 'int'
| 'char';

RETURN_TYPE: 'number'
| 'int'
| 'char'
| 'void';

// ANALIZADOR SINTACTICO

// program:definition*EOF;
program returns [Program ast = new Program(new ArrayList<Definition>()]: expression EOF;

/*let real: number;
let c1, c2: char;*/
variable_definition:'let'identifier_list':'SIMPLE_TYPE';' ;
identifier_list:ID
|ID','identifier_list;

/*
Las funciones se definen mediante la palabra reservada "function" el
 identificador de la funciÛn, una lista de parametros separados
 por comas entre "(" y ")" seguido de ":" y el tipo de retorno
 cuando sea necesario.
El tipo de retorno y de los parametros debe ser de tipo simple
(no se permiten ni arrays ni registros).
El cuerpo de la funcion va entre "{" y "}".
El cuerpo de las funciones se compone de una secuencia de cero
o mas definiciones de variables seguida de una secuencia de cero
o mas sentencias.
La funcion "main" es obligatoria, no devuelve nada, no recibe parametros y
debe estar declarada en ultimo lugar.
-----------------------------------------
function main(): void{
}
function f(n: int,r: number): int {
} */
function_definition: 'function' ID '(' parametros ')' ':' RETURN_TYPE '{' body '}';
body: variable_definition body | statement body | ;
parametros: ID ':' SIMPLE_TYPE ',' parametros
| ID ':' SIMPLE_TYPE;

/*
Array Definition
let vector: [10][5]int;
*/
array_definition: 'let' ID ':'
| '[' INT_CONSTANT ']' array_definition
| '[' INT_CONSTANT ']' SIMPLE_TYPE;

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
;
/*
  	log f(i, (i as number)); // Invocation as an expression

*/
statement: 'log' expression
| ',' expression
|;

expression: expression 'as' SIMPLE_TYPE
| expression '*' expression
| expression ('+'|'-') expression
| INT_CONSTANT
| ID ;





