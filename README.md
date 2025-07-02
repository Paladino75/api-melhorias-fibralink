# Teste para a Vaga Interna SOGE - Fibralink

-----

## API de Gerenciamento de Melhorias

Este projeto é uma **API feita com Spring Boot e JDBC** para ajudar a gerenciar melhorias. A gente usa **Docker pra rodar o banco de dados PostgreSQL**.

-----

## O que você precisa ter

Pra rodar o projeto, você vai precisar do **Java instalado**. Se você não tem, ou quer um jeito fácil de gerenciar suas versões de Java, o **SDKMAN** é uma boa pedida:

  * **SDKMAN**: [https://sdkman.io/install](https://sdkman.io/install)

-----

## Começando o Projeto

Pra colocar o projeto pra funcionar, segue o passo a passo:

### Como o projeto começou

Ele foi criado usando o site [Spring Initializr](https://start.spring.io/) com essas configurações:

  * **Tipo de Projeto**: Gradle
  * **Java**: Versão 17
  * **Dependências**:
      * Spring Web
      * Spring Data JDBC
      * PostgreSQL Driver

### O que foi feito no código

1.  Baixei o projeto e abri no **IntelliJ**.
2.  Organizei as pastas iniciais: **Controller, Model, Repository e Service**.
3.  Criei a classe "Colaboradores" pra ser a base dos nossos dados no banco.
4.  Fiz a interface "ColaboradoresRepository" pra lidar com o banco de dados.
5.  A classe "ColaboradoresServiceImpl" implementa as regras de negócio.
6.  Criei o "ColaboradorController" pra receber os pedidos do usuário e fazer o **CRUD** (criar, ler, atualizar, apagar).
7.  Fiz o arquivo "application.properties" pra conectar no banco de dados.

> **Observação:** Tive alguns problemas pra conectar no banco, então o projeto tá meio incompleto. Mesmo depois do prazo, vou continuar mexendo nele pra aprender mais.

-----

## Como rodar o Banco de Dados com Docker

Pra deixar o banco de dados PostgreSQL funcionando, a gente usa o Docker:

1.  Você precisa ter o Docker instalado.

2.  Tem um arquivo `docker-compose.yaml` na pasta do projeto.

3.  Abra o terminal na pasta do projeto e digite o comando abaixo pra subir o banco:

    ```bash
    sudo docker compose up -d
    ```

    Isso vai iniciar o banco em segundo plano.

-----

## Comandos do Banco (SQL)

Depois que o banco estiver rodando, você pode usar esses comandos pra criar a tabela e colocar alguns dados de exemplo:

### Criar a tabela `colaboradores`

```sql
CREATE TABLE colaboradores (
    id SERIAL PRIMARY KEY,
    nome_colaborador VARCHAR(255) NOT NULL,
    setor VARCHAR(100),
    descricao TEXT,
    status VARCHAR(50),
    data_criacao TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);
```

### Colocar dados de exemplo

```sql
INSERT INTO colaboradores (nome_colaborador, setor, descricao, status) VALUES
('João Silva', 'SOGE', 'Sugestão: Otimizar o processo de onboarding de novos colaboradores para reduzir o tempo de adaptação.', 'em análise'),
('Maria Oliveira', 'Financeiro', 'Sugestão: Implementar um sistema de gestão de despesas mais intuitivo para facilitar o acompanhamento.', 'implementada'),
('Pedro Souza', 'Administrativo', 'Sugestão: Criar um fluxo de aprovação de documentos digital para agilizar as operações internas.', 'aberta'),
('Ana Costa', 'Marketing', 'Sugestão: Desenvolver campanhas de marketing mais personalizadas com base em dados de comportamento do cliente.', 'em análise'),
('Carlos Lima', 'Suporte VIP', 'Sugestão: Centralizar o feedback dos clientes VIP para identificar pontos de melhoria no serviço.', 'aberta'),
('Fernanda Santos', 'Back office', 'Sugestão: Automatizar tarefas repetitivas no back office para aumentar a eficiência operacional.', 'implementada'),
('Ricardo Almeida', 'Equipe de Campo', 'Sugestão: Fornecer tablets com acesso online aos manuais técnicos para a equipe de campo.', 'em análise'),
('Patrícia Gomes', 'Auxiliar de Limpeza', 'Sugestão: Adotar produtos de limpeza ecológicos para promover a sustentabilidade ambiental.', 'aberta'),
('Rafael Martins', 'Recursos Humanos', 'Sugestão: Implementar um programa de mentoria para desenvolver talentos internos.', 'implementada'),
('Mariana Ferreira', 'SOGE', 'Sugestão: Explorar a integração de inteligência artificial para otimizar a análise de dados.', 'em análise'),
('Bruno Rocha', 'Financeiro', 'Sugestão: Desenvolver um painel de controle financeiro interativo para uma visão mais clara das métricas.', 'aberta'),
('Camila Dias', 'Marketing', 'Sugestão: Realizar workshops internos sobre as últimas tendências em marketing digital para a equipe.', 'implementada');
```
