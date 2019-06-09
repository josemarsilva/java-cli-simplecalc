# README - java-simplecalc-cli
Java Simple Calculator - Command Line

## 1. Introduction

This is repository of the project **java-simplecalc-cli**.

## 2. Documentation

### 2.1. Use Case Diagram

![UseCaseDiagram-Context.png](./doc/UseCaseDiagram-Context.png) 


### 2.2. Deploy Diagram

![DeployDiagram-Context.png](./doc/DeployDiagram-Context.png) 


### 2.3. Packages and Class Class Diagram

![ClassDiagram-Context.png](./doc/ClassDiagram-Context.png) 

### 2.4. Branch Strategy Workflow

![BranchStrategyWorkflow-Context.png](./doc/BranchStrategyWorkflow-Context.png) 

#### 2.4.1. Branches: master, develop, feature, release e hotfix

#### a. master
  * pronto para produção
  * vive "para sempre"

#### b. develop
  * último desenvolvimento pronto para produção
  * criado a partir da __master__

#### c. feature
  * suporte a funcionalidade
  * mais comum e familiar às pessoas porque elas normalmente trabalham nesta branch
  * criado a partir da __develop__
  * deve finalizar com merge em __develop__;

#### d. release
  * suporte a preparação do trabalhao que irá para próxima versão
  * criado a partir da __develop__
  * deve finalizar com merge em __develop__ e __master__
  * convenção de nomes: __release-*__

#### e. hotfix
  * mudanças críticas em produção
  * criado a partir da __master__
  * deve finalizar com merge em __master__ e __develop__
  * convenção de nomes: __hotfix-*__


## 3. Project

### 3.1. Preconditions

* n/a


### 3.2. Guide for Developers

* Clone source code using "git clone". Use branch "master" if branch "develop" is not available.
* Read, if avaliable, "2. Documentation"  and "3.X. Guides, Patterns, Standard, Conventions and Best Practices" to understand patterns, standards, conventions and best practices used in this project.
* Make your changes, commit and push on "develop" branch. Use branch "master" if branch "develop" is not available. Ask me permission, if not available permission to push.


### 3.3. Guide for Configuration

* n/a


### 3.4. Guide for Test

* n/a


### 3.5. Guide for Deploy

```bat
C:\..\java-simplecalc-cli> mvn clean compile package assembly:single
```


### 3.6. Guide for Demonstration

* n/a


### 3.7. Patterns, Standard, Conventions and Best Practices

* n/a


## I - References

* [How to write doc comment for JavaDoc Tool](https://www.oracle.com/technetwork/articles/javase/index-137868.html)
* [Apache Commons CLI usage](https://commons.apache.org/proper/commons-cli/usage.html)
* [Udo Java - Expression Evaluation](https://udojava.com/2012/12/16/java-expression-parser-evaluator/)
* [Maven](https://www.in28minutes.com/maven-tutorial-for-beginners)
* [Git Branching Model](https://nvie.com/posts/a-successful-git-branching-model/)
* [Git Numerosas possibilidades de defazer algo](https://docs.gitlab.com/ee/topics/git/numerous_undo_possibilities_in_git/#quickly-save-local-changes)
