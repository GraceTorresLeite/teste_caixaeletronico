# teste_caixaeletronico

## Mapa de Tecnologias
|Framework |Back       |Versionamento |Qualidade  |
|----------|-----------|--------------|-----------|
|Eclipse   |Java 1.8   |Github        |Junit 4    |
|          |           |Docker hub    |TDD        |
|          |           |              |           | 

*https://hub.docker.com/repository/docker/gracetorresleite/testezenvia*


## Objetivo

* Sistema com a finalidade de atender ao público que possui conta bancária. ( não foram colocados regras para saldo disponível e ou autenticação).

### Notas da dispensa
|Tipo Enum |Quantidade |
|----------|-----------|
|2         |20         |
|5         |20         |
|10        |20         |
|20        |20         |
|50        |10         |
|100       |5          |

* Função principal: Cliente poderá *sacar um determinado valor que corresponda a quantidades de notas e tipo disponibilizadas na dispensa*.
  - regras: 
  
  -[x] o saque não será realizado caso o número de notas na dispensa seja menor ao número de notas que será preciso para efetuar a entrega ao cliente;
  
  -[x] o saque não será realizado caso o valor digitado não corresponda as notas disponíveis na dispensa;
                 (Mensagem disparada em ambos casos = ("Valor inválido para saque"); 
                 
  -[x] na medida que o saque é realizado deve ocorrer a diminuição do número de notas na dispensa;
  
  -[x] o caixa eletrônico deverá priorizar as notas maiores no momento de escolher as notas a serem dadas na execução do saque; *Os testes foram feitos com o número esperado de quantidade de notas disponibilizadas com exemplos em diversos casos de saque.*

* Links utilizados na pesquisa para implementar o Docker: 

  -[x] https://github.com/spotify/docker-maven-plugin
  
  -[x] https://www.youtube.com/watch?v=0nHSgo4YShU
  
  -[x] https://hub.docker.com/_/maven
  
  -[x] https://mvnrepository.com/artifact/com.spotify/docker-maven-plugin/1.2.2

  - Após algumas pesquisas dentre plugins da própria IDE Eclipse, tipos de imagens para incluir o volume desejado, optei por usar o plugin desenvolvido pela Spotify, onde apenas adicionamos o mesmo no arquivo pom.xml da aplicação. 
