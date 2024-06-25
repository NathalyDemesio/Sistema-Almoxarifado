class Material {
  //Atributos
  int codigo;
  String nome;
  float saldo;

  public Material() {
    this.codigo = 0;
    this.nome = "";
    this.saldo = 0;
  }

  //Método construtor padrão
  public Material(int codigo, String nome, float saldo) {
    this.codigo = codigo;
    this.nome = nome;
    this.saldo = saldo;
  }

  //Métodos
  public void removeSaldo(float qtd) {
    this.saldo -= qtd;
  }

  public void addSaldo(float qtd) {
    this.saldo += qtd;
  }

  public void changeNome(String name) {
    this.nome = name;
  }
}
