# Lista 3 Threads e Semaforos - Sistemas Operacionais 1

<div align="center">
  
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Windows](https://img.shields.io/badge/Windows-000?style=for-the-badge&logo=windows&logoColor=2CA5E0)
![Linux](https://img.shields.io/badge/Linux-000?style=for-the-badge&logo=linux&logoColor=FCC624)

</div>

## Sobre o projeto
Lista 3 de exercícios sobre Threads e Semaforos, da materia de Sistemas Operacionais 1 do curso de Análise e desenvolvimento de sistemas da FATEC Zona Leste.<br>

## Índice
=================
<!--ts-->
* [Título](#lista-3-threads-e-semaforos--sistemas-operacionais-1)
* [Sobre o Projeto](#sobre-o-projeto)
* [Índice](#índice)
* [Exercícios](#exercícios)
* [Status do projeto](#status-do-projeto)
* [Tecnologias](#tecnologias)
* [Agradecimentos](#agradecimentos)
* [Autor](#autor)
<!--te-->

## Exercícios
1) Fazer uma aplicação, console, que
gerencie a figura abaixo:

<div align="center">
  
![image](https://github.com/thiagosilvaantenor/ThreadsSemaforos-Lista-3-SO1/assets/99970279/3ce8d9e3-a108-4a1d-9139-379f8492e4da)

</div>

  * Para tal, usar uma variável sentido, que será alterado pela Thread que controla cada carro com a movimentação do carro.
  * Quando a Thread tiver a possibilidade de ser executada, ela deve imprimir em console o sentido que o carro está passando.
  * Só pode passar um carro por vez no cruzamento.

2) Quatro pessoas caminham, cada uma em um corredor diferente.
   
  * Os 4 corredores terminam em uma única porta.
  * Apenas 1 pessoa pode cruzar a porta, por vez.
  * Considere que cada corredor tem 200m. e cada pessoa anda de 4 a 6 m/s.
  * Cada pessoa leva de 1 a 2 segundos para abrir e cruzar a porta.
  * Faça uma aplicação em java que simule essa situação.

3) Um banco deve controlar Saques e Depósitos.
   
  * O sistema pode permitir um Saque e um Depósito Simultâneos, mas nunca 2 Saques ou 2 Depósitos Simultâneos.
  * Para calcular a transação (Saque ou Depósito), o método deve receber o código da conta, o saldo da conta e o valor a ser transacionado.
  * Deve-se montar um sistema que considera 20 transações simultâneas enviadas ao sistema (aleatoriamente, essas transações podem ser qualquer uma das
  opções) e tratar todas as transações.

4) Você foi contratado para automatizar um treino de Fórmula 1.
   
  * As regras estabelecidas pela direção da provas são simples:
    * “No máximo 5 carros das 7 escuderias (Cada escuderia tem 2 carros diferentes, portanto, 14 carros no total) presentes podem entrar na pista simultaneamente, mas
  apenas um carro de cada equipe.
    * O segundo carro deve ficar à espera, caso um companheiro de equipe já esteja na pista.
    * Cada piloto deve dar 3 voltas na pista.
    * O tempo de cada volta deverá ser exibido e a volta mais rápida de cada piloto deve ser armazenada para, ao final, exibir o grid de largada, ordenado do menor
      tempo para o maior.”

## Status do projeto
  🚧Em construção🚧
* Exercicíos completos:
  * [Exercicio 1](https://github.com/thiagosilvaantenor/ThreadsSemaforos-Lista-3-SO1/blob/main/src/controller/CarroController.java)

* Projeto utiliza o padrão **MVC** *(Model View Controller)*, todos os arquivos estão dentro do diretório **src**
  * Dentro do pacote **view** está a camada de interacao direta com o usuario:
    * Na classe `Cruzamento`:
      * Cria um `Semaphore` com 1 permissão
      * Dentro de um `for`, de 1 a 4, vai instanciar a classe `CarroController` e chamar o metodo de `start`, de `Threads`.
    
  * Dentro do pacote **controller** está a classe com métodos, que será instanciada na camada **view**:  
    * Na classe `CarroController`, que herda da classe `Threads`:
      * Atributos:
        * `int carroId` servindo para identificar o carro
        * `Semaphore semaforo` servindo para garantir o controle de seções criticas das threads
        * `String sentido` servindo para identificar o sentido de cada carro
       
      * Métodos:
        * `run` metodo principal para execução das threads, primeiro é chamado o método `alterarSentido()` e logo em seguida, dentro de um semaforo para garantir a execução de uma thread por vez, é chamado o método `passarCruzamento()`  
        * `alterarSentido()` utiliza de um `switch()` para alterar o sentido de cada carro de acordo com o `carroId` do carro
        * `passarCruzamento()` mostra na saída que o carro, identificado pelo `carroId` passou no cruzamento pelo `sentido`    


## Tecnologias
- [Java](https://www.oracle.com/br/java/)
  - [Thread](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)
  - [Semaphore](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Semaphore.html)

## Agradecimentos
Agradeço ao professor da disciplina de Sistemas Operacionais 1, [Leandro Colevati dos Santos](https://www.leandrocolevati.com.br/index.jsp), por todo o aprendizado passado.

## Autor

<div align="center">
<a href="https://www.linkedin.com/in/thiago-antenor/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/99970279?v=4" width="100px;" alt="foto do autor"/>
 <br />
 <sub><b>Thiago Silva Antenor</b></sub></a> <a href="https://www.linkedin.com/in/thiago-antenor/" title="Linkedin"> 🧑🏾‍💻</a>


Feito por Thiago Silva Antenor 👨🏾‍💻 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/thiago-antenor/)](https://www.linkedin.com/in/thiago-antenor/) 
[![Gmail Badge](https://img.shields.io/badge/-thiagoantenor31@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagoantenor31.com)](mailto:thiagoantenor31.com)
</div>
