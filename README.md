# 📚 Gerenciador de Tarefas com Java Swing

Este é um projeto de uma aplicação gráfica em Java, desenvolvida com Swing e o padrão MVC, para gerenciar tarefas com nome, descrição, 
categoria e status (pendente ou concluída). O projeto foi desenvolvido como parte de um trabalho prático da disciplina de Linguagem de Programação Orientada a Objetos.

---

## 🎯 Funcionalidades
- Cadastrar nova tarefa com:
  - Nome
  - Descrição
  - Categoria (ENUM)
  - Status (Concluída ou Pendente)
- Editar tarefa existente
- Remover tarefa da lista
- Marcar como concluída
- Listar tarefas na interface gráfica (JList)

---

## 🧩 Estrutura do Projeto

- `model` - Contém as classes de domínio, `Tarefa` e `CategoriaTarefa`.
- `view` - Contém as janelas e telas feitas com Swing, `TarefasJF` e `CadastroTarefaJD`.
- `controller` - Contém a classe `TarefasController`, que implementa a lógica de manipulação da lista de tarefas. 

---

## 🖥 Tecnologias Utilizadas

- Java SE 8+
- Swing (JFrame, JDialog, JList, JComboBox, JCheckBox)
- Apache NetBeans (com uso do editor visual - Design)

---

## 🛠 Como Executar o Projeto

1. Clone o repositório:
```bash
  git clone https://github.com/Anestrom/projeto-tarefas-java.git
```
2. Abra o NetBeans.
3. Vá em File > Open Project e selecione a pasta clonada.
4. Rode a aplicação pela classe `TarefasJF.java`.
---

## 👩‍💻 Autor
Marjory Ane Toazza

Meu Linkedin: [Marjory Ane Toazza](linkedin.com/in/marjory-ane-toazza-1b0b0425b)

Professor: Vanessa Lago Machado - LPOO
