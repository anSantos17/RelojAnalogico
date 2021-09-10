public class Reloj {
  private Hora hora;
  private Minuto minuto;
  private Segundo segundo;

  public Reloj(){
    hora = new Hora();
    minuto = new Minuto();
    segundo = new Segundo();
  }

  public void setHora(Hora hora){
    this.hora = hora;
  }
  public Hora getHora(){
    return hora;
  }
  public void setMinuto( Minuto minuto){
    this.minuto = minuto;
  }
  public Minuto getMinuto(){
    return minuto;
  }
  public void setSegundo(Segundo segundo){
    this.segundo = segundo;
  }
  public Segundo getSegundo(){
    return segundo;
  }

  public void adelante(){

    segundo.avanzar();
    if(segundo.getValor()== 0){
      minuto.avanzar();
      if(minuto.getValor() == 0){
        hora.avanzar();
        if(hora.getValor() == 24){
          segundo.avanzar();
        }
      }
    }
  }

  public void retroceder(){
      hora.retroceder();
      if(hora.getValor() == 24){
        minuto.retroceder();
        if(minuto.getValor() == minuto.getLimite()){
          segundo.retroceder();
          if(segundo.getValor() == segundo.getLimite()){
            hora.retroceder();
          }
        }
      }
  }

  public void restablecer(){
    int vresta = 0;
    hora.setValor(vresta);
    minuto.setValor(vresta);
    segundo.setValor(vresta);
  }

  public String mTiempo(){
    String str = String.format("(%d : %d : %d)", hora.getValor(), minuto.getValor(), segundo.getValor());
    return str;
  }
}