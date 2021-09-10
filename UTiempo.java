public class UTiempo{
  private int limite;
  private int valor;

  public UTiempo(){
    limite = 60;
    valor = 0;
  }

  public void setLimite(int limite){
    this.limite = limite;
  }
  public int getLimite(){
    return limite;
  }
  public void setValor(int valor){
    this.valor = valor;
  }
  public int getValor(){
    return valor;
  }

  public void avanzar(){
    valor++;
      if(valor == limite){
          valor = 0;
      }
  }

  public void retroceder(){
    valor--;
      if(valor == limite){
          valor = limite - 1;
      }
  }

}