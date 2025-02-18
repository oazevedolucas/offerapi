# Como criar uma API Spring Boot do 0 e fazer o deploy dela na AWS

Bem-vindo ao repositório **offerapi**! Este é um projeo Java utilizando o framework Spring Boot, para demonstrar o deploy de uma API em um EC2. Para entender mais a respeito desse repositório te convido a assistir o vídeo no meu canal [@oazevedolucas](https://www.youtube.com/@oazevedolucas/videos).


![GitHub repo size](https://img.shields.io/github/repo-size/iuricode/README-template?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/iuricode/README-template?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/iuricode/README-template?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/iuricode/README-template?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/iuricode/README-template?style=for-the-badge)

## 📊 Visão Geral

Este repositório contém o código da aula [**Como criar uma API Spring Boot do 0 e fazer o deploy dela na AWS**](https://youtu.be/5diCOJ22ht8). Aprenda a:

- Criar um Banco de dados [RDS](https://aws.amazon.com/pt/rds/)
- Criar uma WEB API JAVA SPRING BOOT DO 0
- Criar um Serviço [EC2](https://aws.amazon.com/pt/ec2/)
- Fazer deploy da API na [AWS](https://aws.amazon.com/)

<div align="center">
  <img src="https://i.imgur.com/0EaMenF.png" alt="Lucas Azevedo Spring Boot Java AWS EC2 RDS" width="1280px">
</div>

---

## ⚡ Tecnologias Utilizadas

Este projeto foi desenvolvido com as seguintes tecnologias:

- **Java 17**
- **Spring Boot**
- **Maven**
- **[IntelliJ IDEA](https://www.jetbrains.com/idea/download/?section=mac)**
- **[AWS](https://aws.amazon.com/)**

---

## 🔧 Como Executar o Projeto

Siga as etapas abaixo para executar este projeto localmente:

1. Clone o repositório:
   ```bash
   git clone https://github.com/oazevedolucas/offerapi.git
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd offerapi
   ```

3. Compile o projeto com Maven:
   ```bash
   mvn clean install
   ```
4. Configure o projeto:
   ```text
    acesse o arquivo application.yaml para configurar o projeto com as suas configs.
   ```

5. Acesse a API em:
   [http://localhost:8080](http://localhost:8080)

6. Comandos Notion:
[Notion](https://majestic-keyboard-b5f.notion.site/Setup-AWS-19e4d8cbb6db80a9b007e0924fbbd1a6)


---

## 🔬 Estrutura do Projeto

A arquitetura segue boas práticas de organização, como separação de responsabilidades:

```
src/
|-- main/
|   |-- java/
|   |   |-- com.lucasazevedo.offerapi/
|   |       |-- repository/          # Interface que cuida das querys
|   |       |-- controller/          # Controladores REST
|   |       |-- entity/              # Entidades do banco de dados
```

---

## 🚀 Aprenda Mais

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Documentação EC2](https://docs.aws.amazon.com/pt_br/AWSEC2/latest/UserGuide/concepts.html)
- [Documentação RDS](https://docs.aws.amazon.com/pt_br/AmazonRDS/latest/UserGuide/Welcome.html)


---

## 👥 Autor

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/oazevedolucas">
        <img src="https://avatars.githubusercontent.com/u/49877556?v=4" width="100px;" alt="Foto do Lucas Azevedo no GitHub"/>
        <br/>
        <sub>
          <b>Lucas Azevedo</b>
        </sub>
      </a>
      <br/>
      <a href="https://www.linkedin.com/in/oazevedolucas">LinkedIn</a> |
      <a href="https://github.com/oazevedolucas">GitHub</a>
      <a href="https://www.youtube.com/@oazevedolucas">YouTube</a>
    </td>
  </tr>
</table>

---

**Assista ao vídeo completo da aula:** [YouTube - JUltimate Java Spring EC2 + RDS AWS](https://youtu.be/mK_gf5RqixQ?si=CwNdgLimQKXJQDU9).
