grammar bc;

// ==========================
// Programa
// ==========================
programa
    : (cabecalho | declaracaoClasse | metodo)* EOF
    ;

// ==========================
// Cabeçalho
// ==========================
cabecalho
    : '.source' STRING
      '.class' ID
      '.super' ID
    ;

// ==========================
// Classe
// ==========================
declaracaoClasse
    : '.class' modificador* ID '{'
        (campo | metodo)*
      '}'
    ;

// ==========================
// Modificadores
// ==========================
modificador
    : 'public'
    | 'private'
    | 'protected'
    | 'static'
    | 'final'
    ;

// ==========================
// Campos
// ==========================
campo
    : '.field' modificador* tipo ID ';'
    ;

// ==========================
// Métodos
// ==========================
metodo
    : '.method' modificador* tipo ID '(' parametroLista? ')'
      '{'
        instrucao*
      '}'
      '.end' 'method'
    ;

// ==========================
// Parâmetros
// ==========================
parametroLista
    : parametro (',' parametro)*
    ;

parametro
    : tipo ID
    ;

// ==========================
// Instruções
// ==========================
instrucao
    : load
    | store
    | consts
    | operadorBinario
    | chamadaMetodo
    | retorno
    | controleFluxo
    | labelDef
    | stackOp
    ;

// ==========================
// Labels (FIX IMPORTANTE)
// ==========================
labelDef
    : rotulo ':'
    ;

// ==========================
// Load / Store
// ==========================
load
    : 'iload' NUMERO ';'
    | 'aload' NUMERO ';'
    ;

store
    : 'istore' NUMERO ';'
    | 'astore' NUMERO ';'
    ;

// ==========================
// Constantes (MELHORADO)
// ==========================
consts
    : ICONST ';'
    | 'ldc' (NUMERO | STRING) ';'
    ;

// ==========================
// Operações
// ==========================
operadorBinario
    : ('iadd' | 'isub' | 'imul' | 'idiv') ';'
    ;

// ==========================
// Stack ops (NOVO)
// ==========================
stackOp
    : 'dup' ';'
    | 'pop' ';'
    ;

// ==========================
// Chamada de método (FIX)
// ==========================
chamadaMetodo
    : 'invokevirtual' classeNome '/' metodoNome '(' descriptorLista? ')' tipo ';'
    ;

classeNome : ID ;
metodoNome : ID ;

descriptorLista
    : tipo (',' tipo)*
    ;

// ==========================
// Retorno
// ==========================
retorno
    : 'return' ';'
    | 'ireturn' ';'
    | 'areturn' ';'
    ;

// ==========================
// Controlo de fluxo
// ==========================
controleFluxo
    : 'goto' rotulo ';'
    | 'ifeq' rotulo ';'
    | 'ifne' rotulo ';'
    ;

// ==========================
// Label
// ==========================
rotulo
    : 'L' NUMERO
    ;

// ==========================
// Tipos
// ==========================
tipo
    : 'int'
    | 'float'
    | 'double'
    | 'long'
    | 'void'
    | 'boolean'
    | ID
    ;

// ==========================
// Tokens
// ==========================
ICONST
    : 'iconst_0'
    | 'iconst_1'
    | 'iconst_2'
    | 'iconst_3'
    | 'iconst_4'
    | 'iconst_5'
    ;

ID      : [a-zA-Z_][a-zA-Z0-9_/]* ;
STRING  : '"' (~["])* '"' ;
NUMERO  : [0-9]+ ;
WS      : [ \t\r\n]+ -> skip ;
