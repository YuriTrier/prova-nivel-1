Tecnologias utilizadas:

Para o desenvolvimento do código, foi utilizado o Spring Tools Suite, utilizando a última versão disponível para download (4.10.0 para Windows). O projeto foi feito utilizando o
modelo Maven, ambos operando com o Java 11. O projeto foi separado em 3 classes de entidade, Item, ItemPedido e Pedido. Há um banco de testes local configurado, para utilização
caso necessário. Para ativá-lo, será preciso apenas alterar o perfil selecionado na application.properties. Como banco oficial, foi utilizado o PostgreSQL, na versão 13.2.
Para lançamento de novas informações e verificações de informações presentes no banco, via Json, recomenda-se a utilização do software Postman (versão mais recente), sendo necessário chamar o url
local para acessos (Ex: http://localhost:8080/...).
Para conseguir realizar os Gets, Puts, Deletes, Posts, deve-se utilizar a denominação presente nas classes ...Resource. Para realizar uma pesquisa nos Itens cadastrados já no
banco, utilizar o get com a seguinte url exemplo: http://localhost:8080/itens.
Para tratamento de testes, na classe TestConfig, há alguns lançamentos manuais via código de informação para o banco, deixando-o populado no momento de execução do código. No
momento que se finaliza o programa, as tabelas serão derrubadas e iniciarão do mesmo jeito que está designado na classe. Para ajuste e manter as informações no banco, atualizar
o arquivo application-dev.properties, ajustando o termo "spring.jpa.hibernate.ddl-auto=create-drop" para update.
Para pesquisa de itens por Id UUID, basta acrescentá-lo da maneira que é apresentado na informação do Json, podendo copiá-lo e colá-lo após a denominação de pedido ou itens.

Para configuração do banco no PostgreSQL, deve-se respeitar o caminho que está definido no arquivo application-dev.properties, denominando o banco de maneira semelhante a url
definida neste arquivo. Ex: db_pedidos_prova.
O programa irá criar as tabelas e colunas de maneira automática, porém será necessário informar primeiramente o nome do banco de maneira exata a que foi criado no PostgreSQL.

Na tentativa de exclusão de Itens que possuem relacionamento com pedidos, ou vice versa, o programa irá barrar.
Para execução do projeto, executar o Run As Spring Boot App na classe ProvaNivelamento1Application.
