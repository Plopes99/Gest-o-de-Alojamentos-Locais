# Gestão De Alojamentos Locais
 
## Introdução
 
No âmbito da unidade curricular Projeto II foi-nos proposto o desenvolvimento de uma aplicação para a
Gestão de Alojamentos Locais. Esta aplicação permite ao proprietário gerir o negócio de alojamentos
locais, podendo inserir novos alojamentos locais, gerir e aumentar as reservas, verificar as avaliações dos
hóspedes, entre outros, de modo a atingir o maior lucro possível, garantindo sempre a qualidade dos
serviços prestados.
Na vertente dos utilizadores (possíveis hóspedes) é possível verificar a disponibilidade dos alojamentos
locais, efetuar reservas, verificar as avaliações de anteriores hóspedes e/ouavaliar os mesmos e pode
ainda efetuar o check-in. Deste modo, os hóspedes têm à sua disposição uma aplicação que permite
efetuar as suas reservas sem precisar de sair de casa.

## Levantamento de Requisitos:

### O que é que a aplicação vai fazer?

A aplicação vai permitir ao proprietário gerir o negócio de alojamentos locais, podendo inserir novos
alojamentos locais, gerir e aumentar as reservas, verificar as avaliações dos hóspedes, entre outros.
Na vertente dos utilizadores (possíveis hóspedes) é possível verificar a disponibilidade dos alojamentos
locais, efetuar reservas, verificar as avaliações de anteriores hóspedes e/ou avaliar os mesmos e pode
ainda efetuar o check-in.

### Quem vai utilizar a aplicação?

A aplicação será utilizada pelos proprietários dos alojamentos locais, bem como todas as pessoas que
pretendem reservar um alojamento local.

### O que é que cada utilizador pode fazer na aplicação?

### Utilizadores:
#### Proprietários:
* Inserir diferentes alojamentos locais e as suas características;
* Controlar as reservas efetuadas;
* Verificar as disponibilidades dos seus alojamentos;
* Contactar os clientes;
* Confirmar pagamentos.
#### Clientes:
* Pesquisar os diferentes alojamentos disponíveis por zonas;
* Verificar a disponibilidade do alojamento selecionado;
* Efetuar reservas;
* Escolher as datas de check-in e check-out;
* Contactar o proprietário;
* Efetuar pagamento.
### Departamentos do Gestor:
* **Rececionista:** Responsável pelos registos dos proprietários e dos clientes, da inserção de novos alojamentos e de enviar mensagens/avisos aos clientes e/ou proprietários em caso de erro no sistema e pela verificação de disponibilidades e da verificação de disponibilidades;
* **Tesouraria:** Responsável pela gestão dos pagamentos efetuados e da emissão derecibos;
* **Gestor de Dados Pessoais:** Responsável pelo armazenamento dos dados dos utilizadores, bem como pelo cumprimento do RGPD (Regulamento Geral sobre a Proteção deDados).

### Quais os dados a armazenar?
 
 Nesta aplicação serão armazenados os dados dos clientes e dos proprietários (nome, data de nascimento, contactos e dados bancários), a informação de cada alojamento (localização, tipologia, comodidades e descrição do espaço) e de cada pagamento.

## Identificação e Modelação dos Processos de Negócio.

### Lista de Requisitos

#Req | Requisitos | Prioridade
-----|----------------------|-------
R1 | Um proprietário pode inserir alojamentos. |1
R2 | Na inserção de um alojamento deve ser indicado o tipo de espaço, a capacidade, as comodidades, imagens do espaço, uma descrição, a disponibilidade e o preço. | 2
R3 | Um proprietário pode verificar o número de reservas feitas para um determinado alojamento. | 1
R4 | Um proprietário pode ver o histórico de clientes de um determinado alojamento, bem como as avaliações efetuadas. | 1
R5 | Um cliente pode pesquisar um alojamento. | 1
R6 |Para realizar uma pesquisa é necessário indicar a localidade desejada, as datas de check-in e check-out e o número de pessoas que irão ocupar o espaço. | 2
R7 | Um cliente pode consultar informações sobre um alojamento assim como fotos do local. | 1
R8 | Um cliente pode reservar um determinado alojamento efetuando o pagamento associado. | 1
R9 | Um cliente pode contactar o proprietário | 1
R10 | Um rececionista é responsável por realizar os registos dos proprietários e clientes, e por gerir permissões e a validação ou não de dados, tendo acesso a toda a informação dos alojamentos, proprietários e clientes | 3
R11 | Num registo deve ser indicado o nome, o email, a password, a data de nascimento, o contacto e os dados de pagamento. | 2
R12 | Um rececionista/gestor encaminha a informação recebida para os órgãos competentes. | 3
R13 | O gestor de dados pessoais pode atualizar e guardar os dados inseridos referentes a alojamentos, pagamentos, clientes e proprietários. | 4
R14 | A tesouraria recebe os pagamentos e emite recibos. | 3  
  
  
![Modelo de Entidades e Relacionamentos - Versão detalhada.](https://i.ibb.co/Jy8xB5Q/Modelo-ER.png)  

### Esquema de Tabelas:
* **Cliente:** (**id_cliente**, nome, email, nCC, data_nasc, contacto);
* **Alojamento:** (id_alojamento, area, descricao, capacidade, estado, tipologia, preco, morada, código_tipo,
id_gestor, id_proprietario);
* **Gestor_Disponibilidade:** (id_reserva, id_alojamento, disponibilidade);
* **Reserva:** (id_reserva, data_checkIn, data_checkOut, num_pessoas, id_pagamento, id_cliente);
* **Tipo_Alojamento:** (codigo_tipo, nome_tipo);
* **Pagamento:** (id_pagamento, data_pagamento, valor_pagamento);
* **Linha_Pagamento:** (id_pagamento, id_metodo, num_dias);
* **Metodo_Pagamento:** (id_metodo, tipo_metodo);
* **Avaliacao:** (id_avaliacao, nota, id_cliente);

### Esquema de Tabelas – 3FN
* **Cliente:** (id_cliente, nome, email, nCC, data_nasc, contacto);
* **Alojamento:** (id_alojamento, area, descricao, capacidade, estado, tipologia, preco,
código_postal_alojamento, código_tipo, id_proprietario );
* **Codigo_Postal_Alojamento:** (codigo_postal_alojamento, localidade, rua, concelho, distrito);
* **Gestor_Disponibilidade:** (id_reserva, id_alojamento, disponibilidade);
* **Reserva:** (id_reserva, data_checkIn, data_checkOut, num_pessoas, id_pagamento, id_cliente);
* **Tipo_Alojamento:** (codigo_tipo, nome_tipo);
* **Pagamento:** (id_pagamento, data_pagamento, valor_pagamento, id_reserva);
* **Linha_Pagamento:** (id_pagamento, id_metodo, num_dias);
* **Metodo_Pagamento:** (id_metodo, tipo_metodo);
* **Avaliacao:** (id_avaliacao, nota, id_cliente);

## Definição de Linguagem de Domínio
### Modelo de Domínio  

![Diagrama de Classes](https://i.ibb.co/84BBT0g/Projeto-I-Modelos-Classes-Dominio.png)  

## Dicionário do Domínio
* **Cliente:**
O Cliente representa todo o utilizador que faça interação com o software, necessitando assim, de um registo válido para o fazer. O cliente pode inserir alojamentos que possua, inserindo todos os dados da mesma e atribuindo um preço. O cliente pode pesquisar por alojamentos para que possa ter uma estadia por tempo determinado. Assim sendo o cliente pode assumir uma qualidade de proprietário, alguém que procura uma estadia, ou até mesmo os dois.
* **Alojamento:**
O Alojamento é a estadia que um cliente disponibiliza para outros utilizadores, sendo composto por uma série de informações como área, tipologia ou preço, que procuram ajudar o cliente na procura de alojamento.
* **Gestor_Disponibilidade:**
A classe Gestor_Diponibilidade é responsável por atualizar a disponibilidade de um alojamento, no caso de um cliente reservar o mesmo para uma determinada data.
* **Código_Postal_Alojamento:**
Classe responsável por atribuir o alojamento á sua respetiva morada.
* **Tipo_Alojamento:**
Existem vários tipos de Alojamentos, assim sendo a classe Tipo_Alojamento associa os diferentes alojamentos aos seus respetivos tipos, para que o cliente que procura alojamento possa filtrar a sua pesquisa de acordo com as suas necessidades.
* **Reserva:**
Uma Reserva é efetuada pelo cliente, assim que encontrar o alojamento que deseja, dessa forma o alojamento fica reservado para as datas selecionadas após a confirmação do Pagamento.
* **Avaliacao:**
Um cliente pode deixar a sua avaliação nos alojamentos que frequentou numa escala de 0 a 5, para além disso pode consultar outras avaliações de forma ajudá-lo na sua decisão.
* **Pagamento:**
O Pagamento é efetuado após a escolha do alojamento e das datas feitas pelo cliente, dessa forma através do valor estipulado pelo proprietário do alojamento será feito um total a pagar pelo cliente. Uma vez confirmado o pagamento, a data de pagamento será registado assim como o id_pagamento para fins de faturação.
* **Linha_Pagamento:**
Nesta classe é feita a ligação entre o pagamento e método de pagamento usado.
* **Metodo_Pagamento**
O pagamento pode ser efetuado de diversas formas, tais como paypal, multibanco entre outras.  

## Modelo de Funcionalidades do Sistema
### Diagrama de Casos de Uso
![Casos de Uso](https://i.ibb.co/dKC41YP/Casos-de-Uso.png)  

#### Caso de Uso: Pesquisar Alojamento:
Actor Principal: Cliente
Pós-condição: O cliente pode consultar a informação disponibilizada acerca de um alojamento.
Cenário Principal:
1. O utilizador pesquisa pelo alojamento desejado.
2. O utilizador inicia pedido de Reserva
3. O sistema pede informações de pagamento
4. O utilizador realiza o pagamento.
5. O sistema valida o pagamento.
6. A disponibilidade é atualizada.

#### Caso de Uso: Inserir Alojamento
Ator Principal: Cliente
Cenário Principal:
1. O utilizador reúne informação sobre o alojamento que deseja inserir
2. O utilizador insere a informação do alojamento
3. O sistema válido a informação.  

#### Caso de Uso: Reservar Alojamento
Ator Principal: cliente
Pós-condição: O cliente deve efetuar o pagamento para a sua reserva ser efetuada.
Cenário Principal:
1. O cliente deve selecionar o alojamento que pretende.
2. O cliente escolhe o método de pagamento da sua preferência
3. O cliente efetua o pagamento com o método escolhido
4. O sistema valida o pagamento.  

#### Caso de Uso: Consultar Informação
Ator Principal: Cliente
pós-condição: O cliente pode consultar as diversas avaliações para o determinado alojamento.
Cenário Principal:
1.O cliente seleciona um alojamento de entre a lista fornecida pela pesquisa
2. O cliente obtém as informações necessárias para fazer as suas deliberações.  

#### Caso de Uso: Avaliar Alojamento
Ator Principal: Cliente
Cenário Principal:
1. O cliente seleciona um alojamento de entre a lista de pesquisa.
2. O cliente atribui uma nota até 5 estrelas ao alojamento escolhido.
3. O cliente pode também deixar o seu comentário/experiencia.  

#### Caso de Uso: Efetuar Pagamento
Ator Principal: Tesoureira
Pós-condição: Após o pagamento a disponibilidade é atualizada.
Pré-condição: É necessário efetuar um pedido de reserva para posteriormente ser realizado o pagamento
Cenário Principal:
1. A tesoureira recebe e valida o pagamento.
2. A tesoureira envia fatura para o email do cliente.
3. A tesoureira envia o dinheiro para o proprietário do alojamento.  

#### Caso de Uso: Atualizar Disponibilidade
Ator Principal: Gerente
Pré-condição: O Pagamento deve ser efetuado para a disponibilidade ser atualizada.
Cenária Principal:
1. O Gerente recebe a confirmação de pagamento.
2. O Gerente atualiza a disponibilidade.  

## Implementação da Base de Dados  

Realizada a modelação da Base de Dados iremos implementar o Modelo de Entidades e Relacionamentos
utilizando o software Oracle SQL. Dessa forma após a devida configuração do SGDB procedemos à criação
de scripts para as diversas etapas da implementação requerida.  

### Scripts de Criação de Tabelas
#### Entidade Alojamento:
~~~sql 
Drop table Alojamento; create table Alojamento(
id_alojamento NUMBER NOT NULL , area NUMBER NOT NULL,
descricao varchar2(1000), capacidade NUMBER, estado varchar2(20), tipologia varchar2(20), preco NUMBER(8,2),
PRIMARY KEY(id_alojamento),
FOREIGN KEY (codigo_postal_alojamento) references Codigo_Postal_Alojamento (codigo_postal_alojamento),
FOREIGN KEY (codigo_tipo) references Tipo_Alojamento(codigo_tipo), FOREIGN KEY (id_proprietario) references Proprietario(id_proprietario));
~~~

#### Entidade Proprietario:
~~~sql 
Drop table Proprietario ; 
create table Proprietario (
id_proprietario NUMBER NOT NULL, nome varchar2(50) NOT NULL,
nCC NUMBER NOT NULL,
data_nasc DATE NOT NULL, contacto NUMBER,
PRIMARY KEY (id_proprietario)
);
~~~

#### Entidade Tipo Alojamento:
~~~sql
Drop table Tipo_Alojamento; 
create table Tipo_Alojamento ( codigo_tipo NUMBER NOT NULL, nome_tipo varchar2(20), 
PRIMARY KEY(codigo_tipo));
~~~  

#### Entidade Codigo_Postal_Alojamento:
~~~sql
Drop table Codigo_Postal_Alojamento ; 
create table Codigo_Postal_Alojamento(
codigo_postal_alojamento NUMBER NOT NULL, 
localidade varchar2(20) NOT NULL,
rua varchar2(20) NOT NULL, 
concelho varchar2(20) NOT NULL, 
distrito varchar2(20),
PRIMARY KEY(codigo_postal_alojamento));
~~~  

#### Entidade Gestor_Disponibilidade:
~~~sql
Drop table Gestor_Disponibilidade; 
create table Gestor_Disponibilidade( 
id_alojamento NUMBER NOTNULL, 
id_reserva NUMBER NOT NULL, 
nome VARCHAR2 NOT NULL,
Estado NUMBER(2) NOT NULL,
PRIMARY KEY (id_alojamento, id_reserva),
FOREIGN KEY (id_alojamento) references Alojamento(id_alojamento), 
FOREIGN KEY (id_reserva) references Reserva(id_reserva));
~~~  

#### Entidade Avaliacao:
~~~sql
Drop table Avaliacao; create table Avaliacao(
id_avaliacao NUMBER NOT NULL, nota NUMBER(1,2),
PRIMARY KEY (id_avaliacao),
FOREIGN KEY (id_cliente) references Cliente(id_cliente));
~~~

#### Entidade Reserva:
~~~sql
Drop table Reserva ; 
create table Reserva(
id_reserva NUMBER NOT NULL, 
data_checkIn date NOT NULL, 
data_checkOut date NOT NULL,
num_pessoas NUMBER NOT NULL, 
PRIMARY KEY (id_reserva),
FOREIGN KEY (id_pagamento) references Pagamento(id_pagamento), 
FOREIGN KEY (id_cliente) references Cliente(id_cliente));
~~~

#### Entidade Cliente:
~~~sql
Drop table Cliente ; create table Cliente(
id_cliente NUMBER NOT NULL, 
nome Varchar2 (50) NOT NULL, 
email varchar(20),
nCC NUMBER NOT NULL,
data_nasc date NOT NULL, 
contacto NUMBER NOT NULL, 
PRIMARY KEY (id_cliente),
FOREIGN KEY (id_pagamento) references Pagamento(id_pagamento));
~~~

#### Entidade Pagamento:
~~~sql
Drop table Pagamento ; 
create table Pagamento(
id_pagamento NUMBER NOT NULL, 
data_pagamento date NOT NULL, 
valor_pagamento NUMBER (8,2),
PRIMARY KEY(id_pagamento)
);
~~~

#### Entidade Linha_Pagamento:
~~~sql
Drop table Linha_Pagamento; 
create table Linha_Pagamento( 
id_pagamento NUMBER NOT NULL,
id_metodo NUMBER NOT NULL,
num_dias NUMBER NOT NULL,
PRIMARY KEY (id_pagamento, id_metodo),
FOREIGN KEY (id_pagamento) references Pagamento(id_pagamento), FOREIGN KEY (id_metodo) references Metodo_Pagamento(id_metodo));
~~~

#### Entidade Metodo_Pagamento:
~~~sql
Drop table Metodo_Pagamento; 
create table Metodo_Pagamento( 
id_metodo NUMBER NOT NULL,
tipo_metodo VARCHAR2(20), 
PRIMARY KEY (id_metodo));
~~~  

### Scripts Inserção de Dados

### Entidade Alojamento:
~~~sql
insert into Alojamento(id_alojamento, area, descricao, capacidade, estado, tipologia, preco) Values('1',
'582', 'EXMEPLO' , '4' , 'novo', 'T2', '162,99');
insert into Alojamento(id_alojamento, area, descricao, capacidade, estado, tipologia, preco) Values('2',
'232', 'EXMEPLO' , '3' , 'usado', 'T2', '100,99');
insert into Alojamento(id_alojamento, area, descricao, capacidade, estado, tipologia, preco) Values('3',
'482', 'EXMEPLO' , '5' , 'novo', 'T3', '120,99');
insert into Alojamento(id_alojamento, area, descricao, capacidade, estado, tipologia, preco) Values('4',
'622', 'EXMEPLO' , '6' , 'novo', 'T3', '160,99');
insert into Alojamento(id_alojamento, area, descricao, capacidade, estado, tipologia, preco) Values('5',
'282', 'EXMEPLO' , '2' , 'usado', 'T1', '20,99');
~~~

#### Entidade Tipo_Alojamento:
~~~sql
insert into Tipo_Alojamento (codigo_tipo, nome_tipo) values ('1', 'Moradia'); 
insert into Tipo_Alojamento (codigo_tipo, nome_tipo) values ('2', 'Apartamento'); 
insert into Tipo_Alojamento (codigo_tipo, nome_tipo) values ('3', 'Vivenda'); 
insert into Tipo_Alojamento (codigo_tipo, nome_tipo) values ('4','Garagem');
~~~

#### Entidade Codigo_Postal_Alojamento:
~~~sql
insert into Codigo_Postal_Alojamento (codigo_postal_alojamento, localidade, rua, concelho, distrito)
values ('4750625', 'Santa Maria', 'Rua das flores', 'Barcelos', 'Braga');
insert into Codigo_Postal_Alojamento (codigo_postal_alojamento, localidade, rua, concelho, distrito)
values ('4760722', 'Ribeirao', 'Rua Antonio Pereria Araujo Fonseca', 'Vila Nova de Famalicao', 'Braga');
insert into Codigo_Postal_Alojamento (codigo_postal_alojamento, localidade, rua, concelho, distrito)
values ('1000026', 'Lisboa', 'Avenida Duque de Avila', 'Lisboa', 'Lisboa');
~~~

#### Entidade Gestor_Disponibilidade:
~~~sql
insert into Gestor_Disponibilidade (id_alojamento, id_reserva, nome, disponibilidade) values ('1', ‘2’, 'Hugo Matias', '1' );
insert into Gestor_Disponibilidade (id_alojamento, id_reserva, nome, disponibilidade) values (‘2’,'1', 'Afonso Garcia', '1' );
~~~  

#### Entidade Avaliacao:
~~~sql
insert into Avaliacao (id_avaliacao, nota) values ('1', '4'); 
insert into Avaliacao (id_avaliacao, nota) values ('2', '3'); 
insert into Avaliacao (id_avaliacao, nota) values ('3', '4'); 
insert into Avaliacao (id_avaliacao, nota) values ('4', '4');
~~~  

#### Entidade Reserva:
~~~sql
insert into Reserva (id_reserva, data_checkIn, data_checkOut, num_pessoas) values ('1',to_date('10/01/2021', 'DD/MM/YYYY'),to_date('16/01/2021', 'DD/MM/YYYY'), '4');
insert into Reserva (id_reserva, data_checkIn, data_checkOut, num_pessoas) values ('2',to_date('26/01/2021', 'DD/MM/YYYY'),to_date('30/01/2021', 'DD/MM/YYYY'), '2');
~~~

#### Entidade Cliente:
~~~sql
insert into Cliente (id_cliente, nome, email, nCC, data_nasc, contacto) 
values ('1', 'José Mata','josezinho2000@gmail.com', '26694749', to_date('26/01/2000', 'DD/MM/YYYY'), '933567401');
insert into Cliente (id_cliente, nome, email, nCC, data_nasc, contacto) 
values ('2', 'Maria Gomes', 'jmgomes1961@gmail.com', '123945449', to_date('31/07/1961', 'DD/MM/YYYY'), '918482423');
insert into Cliente (id_cliente, nome, email, nCC, data_nasc, contacto) 
values ('3', 'Marlene Pereira', 'marlenezita@gmail.com', '23824749', to_date('02/09/89', 'DD/MM/YYYY'), '924829385');
insert into Cliente (id_cliente, nome, email, nCC, data_nasc, contacto) 
values ('4', 'Miguel SIlva','souomiguels@gmail.com', '354344749', to_date('16/05/2001', 'DD/MM/YYYY'), '931424720');
~~~

#### Entidade Pagamento:
~~~sql
insert into Pagamento (id_pagamento, data_pagamento, valor_pagamento) values ('1', to_date('11/05/2020', 'DD/MM/YYYY'), '100,21');
insert into Pagamento (id_pagamento, data_pagamento, valor_pagamento) values ('2', to_date('15/05/2020', 'DD/MM/YYYY'), '120,21');
insert into Pagamento (id_pagamento, data_pagamento, valor_pagamento) values ('3', to_date('13/05/2020', 'DD/MM/YYYY'), '160,21');
~~~

#### Entidade Linha_Pagamento:
~~~sql
insert into Linha_Pagamento (id_pagamento, id_metodo, num_dias) values ('1', '1', '20'); 
insert into Linha_Pagamento (id_pagamento, id_metodo, num_dias) values ('2', '3', '30'); 
insert into Linha_Pagamento (id_pagamento, id_metodo, num_dias) values ('3', '5', '40');
~~~

####Entidade Metodo_Pagamento:
~~~sql
insert into Metodo_Pagamento (id_metodo, tipo_metodo) values ('1', 'Paypal'); 
insert into Metodo_Pagamento (id_metodo, tipo_metodo) values ('2', 'Multibanco'); 
insert into Metodo_Pagamento (id_metodo, tipo_metodo) values ('3', 'MBWay'); 
insert into Metodo_Pagamento (id_metodo, tipo_metodo) values ('4', 'Paysafecard'); 
insert into Metodo_Pagamento (id_metodo, tipo_metodo) values ('5', 'Visa');
~~~  

