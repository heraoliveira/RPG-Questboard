# 🏰 Guilda RPG Quest (CLI)

Sistema de gerenciamento de personagens, missões e inventário para uma guilda de RPG, desenvolvido em Java com Spring Boot (Maven).

---

## 🚧 Status

Em desenvolvimento.

Versão atual: v0.1 — Estrutura inicial + padronização do projeto (README e pacotes)

---

## 🎯 Objetivo

Construir um sistema em linha de comando (CLI) que permita:

- Gerenciar personagens
- Criar e organizar missões
- Controlar inventário
- Gerar relatórios com Streams
- Persistir dados em arquivo JSON
- Consumir API externa via HTTP

O sistema será estruturado em camadas para permitir evolução futura para:

- API REST
- Banco de dados relacional
- Arquitetura mais robusta

---

## 🛠 Tecnologias

- Java 17
- Spring Boot
- Maven
- Jackson
- (Futuro) Spring Web + JPA

---

## 📁 Estrutura do Projeto

### 📦 Pacote base
`br.com.heraoliveira.rpgquest`

### 🗂️ Árvore de pa stas (visão geral)
```text
RPG-Questboard/
├─ data/
│  └─ .gitkeep
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  └─ br/com/heraoliveira/rpgquest/
│  │  │     ├─ app/
│  │  │     │  └─ MenuPrincipal.java
│  │  │     ├─ infra/
│  │  │     │  ├─ http/
│  │  │     │  ├─ json/
│  │  │     │  └─ storage/
│  │  │     ├─ model/
│  │  │     ├─ repository/
│  │  │     ├─ service/
│  │  │     ├─ util/
│  │  │     └─ RpgQuestApplication.java
│  │  └─ resources/
│  └─ test/
│     └─ java/
└─ pom.xml
```

### 📏 Padrões do Projeto

- Classes: `PascalCase` (ex.: `MenuPrincipal`, `RpgQuestApplication`)
- Pacotes: minúsculo e hierárquico (ex.:`infra.json`, `infra.http`)
- Enums: PascalCase (ex.: `StatusMissao`, `TipoItem`)
- Um arquivo por classe
- Sufixos por função: Service, Repository, Client (ex.: `MissaoService`, `PersonagemRepository`, `ApiClient`)

### 🧱 Responsabilidades (resumo)

- app/: menus do CLI, leitura de comandos e exibição de resultados.
- model/: entidades e enums do domínio (dados do “mundo”).
- service/: regras de negócio e geração de relatórios.
- repository/: contratos e acesso a dados (memória/arquivo agora; banco depois).
- infra/: integrações com o “mundo externo”:
  - infra.json/: serialização/desserialização JSON.
  - infra.storage/: salvar/carregar arquivos (usa JSON).
  - infra.http/: consumo de APIs via HTTP.
- util/: validações, regex, formatação e helpers.