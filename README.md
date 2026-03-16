# Relatório: Tutorial 1 - Hello Kotlin. Hello Android World!

[cite_start]**Curso:** Desenvolvimento de Aplicações Móveis (DAM) [cite: 3]
**Estudante:** 50950 // Carlos Miguel Vieira D' Almeida Séca de Ceita
**Data:** 14/03/2026
**Repositório URL:** [INSERIR O TEU LINK AQUI]

## 1. Introduction
O propósito deste trabalho foi familiarizar-me com o desenvolvimento em Kotlin e Android. O foco inicial incidiu em tipos básicos e controlo de fluxo, evoluindo para a criação de uma aplicação "Hello World" no Android Studio e exploração de conceitos de Programação Orientada a Objetos.

## 2. System Overview
O projeto engloba:
* Exercícios de consola em Kotlin (Calculadora, Sequências de ressaltos, Biblioteca de livros físicos e digitais).
* Aplicação Android com interface gráfica evolutiva (v1 e v2).


## 3. Architecture and Design
A organização seguiu os requisitos do guião:
* Kotlin: Estrutura de pacotes `dam.exer_x` gerida por Maven.

## 4. Implementation
Destaques da implementação:
* Uso de `generateSequence` com `takeWhile` para simular o comportamento físico de uma bola.
* Extração de strings para `strings.xml` para permitir internacionalização.
* Implementação de herança em Kotlin com as classes `Book`, `DigitalBook` e `PhysicalBook`.

## 5. Testing and Validation
A validação foi realizada através de:
* Execução em emulador (Pixel 9 Pro AVD) e monitorização via **Logcat**.
* Uso de **Breakpoints** e modo Debug para inspecionar o estado das variáveis no `onCreate`.

## 6. Usage Instructions
1. Abrir o projeto no IntelliJ IDEA (exercícios de consola) ou Android Studio (apps móveis).
2. Sincronizar o Gradle.
3. Executar o alvo desejado no emulador configurado com API 24 ou superior.

# Autonomous Software Engineering Sections (MIP)

## 7. Prompting Strategy
Utilizei uma abordagem de **Prompting Direto** e iterativo no Gemini. 

## 8. Autonomous Agent Workflow
O Gemini atuou em **Planning Mode**. O fluxo consistiu em:
1. Definição de requisitos;
2. Geração do plano de implementação;
3. Criação de modelos de dados para a Open-Meteo API.

## 9. Verification of AI-Generated Artifacts
O código gerado foi revisto manualmente. Corrigi erros de importação e ajustei as `constraints` no XML que estavam a sobrepor elementos. Testei a conectividade à rede para garantir que o Retrofit recebia os dados corretamente.

## 10. Human vs AI Contribution
* **IA:** Estrutura do plano de projeto, lógica de consumo de API (MIP) e esqueleto do relatório.
* **Humano:** Configuração inicial do ambiente, design visual dos layouts Android, resolução lógica dos exercícios de consola e debugging final.

## 11. Ethical and Responsible Use
Assegurei que a IA não fosse usada na secção [AC NO, AI NO]. 

# Development Process

## 12. Version Control and Commit History
Utilizei Git local e remoto (GitHub).

## 13. Difficulties and Lessons Learned


## 14. Future Improvements
Pretendo implementar persistência de dados (Room) para guardar localizações meteorológicas favoritas.

## 15. AI Usage Disclosure (Mandatory)
Utilizei o **Gemini 3 Flash** como assistente de codificação e escrita. Reafirmo que sou totalmente responsável pelo conteúdo e capaz de explicar todo o código apresentado.