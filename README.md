# Expo2
Este projeto contém um código que converte um número real em sua representação como soma de potências de 2.

Ao executar o programa, inserindo um número e o código realiza a separação entre a parte inteira e a parte fracionária. Cada parte é convertida em potências de 2 positivas ou negativas.

O resultado é exibido no console com uma lista contendo as potências necessárias para formar o número.

Por exemplo: ao digitar o número 10.25, a saída será [3.0, 1.0, -4.0], pois em binário 10.25 equivale a 1010.01.

Outro ponto importante é que o programa também lida com números negativos. Nesse caso, o sinal é tratado separadamente, e a decomposição é feita sobre o valor absoluto.

A implementação utiliza métodos privados do tipo List<> responsáveis por agrupar o valor obtido na lista.

Como melhoria futura, está prevista a adição da conversão binária direta, ampliando a utilidade do projeto tanto para fins acadêmicos quanto para aplicações práticas.
