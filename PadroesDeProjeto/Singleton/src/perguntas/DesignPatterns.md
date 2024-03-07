### Defina padrões de projeto.
##### Explique de forma objetiva e adequada a relação entre padrões arquiteturais e design patterns. Dê um exemplo teórico.
#### Leia o trecho de uma possível conversa entre dois programadores que desenvolvem um projeto. Considere que o processo utilizado é o método ágil, portanto, as equipes trabalham em pares para incrementar a comunicação. Dado este contexto, identifique os designs patterns contidos no trecho de conversa. Para auxiliá-lo, use o catálogo GoF.
### Programador 1:
“Nesta sprint vou refatorar aquele trecho utilizando um método fábrica. O que você acha?”

### Programador 2:
“Boa ideia! Falando nisso...
 Podemos utilizar a composição para implementar aquela estrutura hierárquica, aproveitando a sua natureza recursiva!”
 Também será necessário uma fachada para esta unidade do software porque a interação na classe cliente está ficando muito complexa.

### Quais são as características que o padrão singleton deve ter?
Para o código a seguir:

```java
public class Cenario {
 private static Cenario cenario=null;

 private Cenario(){}

 public static Cenario getCenario(){
  if(cenario==null)
   cenario=new Cenario();

  return cenario;
 }
}
```

Escreva um método configuracoes que deve exibir uma mensagem. Esse método deve ser invocado pela instância dentro da classe Cenario.
### Utilizando o padrão Lazy Singleton, escreva uma classe que controle a quantidade de instâncias. Considere ter, no máximo, três instâncias.

