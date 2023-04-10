Algumas observações gerais:
--
Convenções:

Nomes de Classe iniciam-se sempre com letras maiúsculas.
Toda classe precisa existir no seu diretório src do seu projeto.
Todo arquivo é .java
Todo .java DEVE começar com a letra maiúscula, e seus respectivos.
A Classe deve possuir o mesmo nome do arquivo.
--
#Variáveis - camelCase

Escritas com letra minúscula, mas as sucetivas com letra Maiúsculas.
Devem conter: Letras, _, $ e números 0 a 9
Iniciam-se com letras minúsuclas
Não podem conter espaços
Não podem usar termos reservados
Nome único dentro do escopo.

Toda variável deverá conter:
Estrutura: Nome bem definido = (Atribuição, quando couber).
Concatenação pode ser usaca com "concat" ou '+'

Caso uma variável seja uma constante:
1 - final - palavra reservada, define uma constante. Ex: final string BR = "Brasil"
2 - Constante comumenta possuem todos as letras maiúsculas Ex: ESTADOS_BRASILEIROS = 27
--
Organização Básica:
Ex: com.nome.funcao
com = comercial
nome = local
função = definição, ex: notificacao

No VSCode:
Na IDE VSCode, na pasta src, criar pastas para segmentar cada pacote.
Ex: src/Dio/Rodolffo/PrimeiraAula
--
Java Beans:
    Variáveis
    Idioma único
    Sem abreviacao
    Variáveis singular
    Array no plural
    Em resumo:
        Uma classe que contenha todos os atributos privados
        Possua getters e setters para seus atributos
        Usada para encapsular e abstrair uma entidade
        Implementa java.io.Serializable
    
    Métodos:
    Métodos são, no geral, verbos. Iniciam com letras min. e subsequentes com Maiúsculas
    Ex: abrirConexao(), somar(), concluirProcessamento{}
    

