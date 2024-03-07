# Padrões de Projeto em Desenvolvimento de Software

## 1. Natureza Genérica dos Padrões de Projeto

Padrões de projeto representam técnicas bem-sucedidas aplicáveis a problemas similares. Entretanto, é importante notar que um padrão de projeto não garante uma solução ótima, pois é mais genérico do que específico.

## 2. Diferença entre Padrões Arquiteturais e Design Patterns

Os padrões arquiteturais concentram-se na estrutura global de um sistema, enquanto os design patterns lidam com soluções específicas para problemas de design em nível de código. Ambos são cruciais para desenvolver software eficiente, modular e fácil de manter.

## 3. Design Patterns em Conversas de Desenvolvimento

Na conversa entre programadores, foram mencionados design patterns como o Método Fábrica para refatoração proposto pelo Programador 1, e a Composição e Fachada sugeridas pelo Programador 2 para estrutura hierárquica e simplificação na interação da classe cliente.

## 4. Padrão Singleton

O padrão Singleton assegura uma única instância de uma classe, oferecendo acesso global controlado. A criação da instância é única, geralmente com inicialização tardia, permitindo a manutenção de um estado global e controle preciso sobre o acesso à instância.

## 5. Método configuracoes

```java

public class Cenario {
private static Cenario cenario=null;

    private Cenario(){}

    public static Cenario getCenario(){
        if(cenario==null)
            cenario=new Cenario();

        return cenario;
    }

    public  void configuracoes(){
        System.out.println("Olá");
    }
}
```

##  6.  Lazy Singleton
```java
package singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton;
    private static final int MAX_INSTANCE = 3;
    private static int instanceCount = 0;

   private LazySingleton() {

    }

    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
            instanceCount++;
            return lazySingleton;
        } else if (instanceCount < MAX_INSTANCE){
            instanceCount++;
            return lazySingleton;
        }
        return null;
    }
}
```