# GameAndroidBase

Este projeto se encontra em atualização.

### Descrição

Este projeto tem como objetivo oferecer uma base de programação para o desenvolvimento de jogos para Android.

### Suporte a desenho:
- [X] Canvas
- [ ] OpenGL

### Funcionamento: **Boards** e **Scenes**
Basicamente, a engine possui um gerenciador de **Boards**, sendo que somente uma **Board**, por padrão, é carregada na memória por vez.

Cada board possui uma lista de **Scene (Cenas)**, que são usadas para dividir o contexto de uma **Board** em subcontextos.

![](Misc/basicWorking.png)

Exemplo: No menu principal do jogo, uma cena para cada menu, ou uma cena para uma animação rodando por trás da cena que cuida do menu.

![](Misc/basicWorking2.png)

### Uso: **Boards** e **Scenes**
Para uma nova **Board**, é necessario criar uma nova classe e estender a **Board**.
```java
public class MyBoard extends Board {

  public MyBoard() {
    super(x, y, largura, altura);
  }
  
  @Override
  public void init() {
  }

}
```
