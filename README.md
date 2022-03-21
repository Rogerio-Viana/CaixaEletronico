# Caixa Eletrônico

## Descrição do projeto
Caixa Eletrônico - https://dojopuzzles.com/problems/caixa-eletronico/

## Descrição do processo de solução
O problema foi solucionado com o seguinte pensamento, caso o valor de saque for 130.
Esse valor é divido por 100 que é a nota disponível mais alta, restultado valor 1 inteiro, já obtendo a quantia de notas de R$100, após isso é reduzido do valor de saque 100 x 1 (nota atual vezes quantia de notas obtido anteriormente); 130 - (100 x 1) = 30.
O mesmo processo é repetido para cada nota disponível.
Antes de cada processo é realizado uma validação para saber se o valor é menor que a nota que esta sendo usada.


## Executar projeto
Considerando que já tenha Java versão minima 11 em seu computador. 

Baixe o projeto ou somente o arquivo **Jar** descrito abaixo e execute o camando na mesma pasta:
```
java -jar CaixaEletronico-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```

## Arquivo Jar
- Pasta: **/target**
- Arquivo: **CaixaEletronico-0.0.1-SNAPSHOT-jar-with-dependencies.jar**


## Testes
Arquivo de teste: **https://github.com/Rogerio-Viana/CaixaEletronico/blob/master/src/test/java/br/com/caixaeletronico/teste/CaixaEletronico.java**

Ferramenta: Junit

Versão: 4.13
