class Main {
  private static void clearScreen(){
    System.out.println("\033[H\033[J");
  }
  
  public static void main(String[] args){
    //DECLARAÇÃO e INICIALIZAÇÃO DOS OBJETOS
    Material m1 = new Material(123, "Cimento", 0);
    Material m2 = new Material(321, "Areia", 0);

    //INICIA O PROGRAMA
    m1.addSaldo(30);
    m2.addSaldo(20);

    m1.removeSaldo(15);
    m2.removeSaldo(5);

    m1.changeNome("Cimento de concreto");

    clearScreen();

    System.out.println("---Material 1---");
    System.out.println("Código: " + m1.codigo);
    System.out.println("Nome: " + m1.nome);
    System.out.println("Estoque: " + m1.saldo);
    System.out.println(" ");
    System.out.println("---Material 2---");
    System.out.println("Código: " + m2.codigo);
    System.out.println("Nome: " + m2.nome);
    System.out.println("Estoque: " + m2.saldo);

    
    
  }
}
