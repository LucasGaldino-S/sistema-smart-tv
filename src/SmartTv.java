public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void escolherCanal(int novoCanal){
    canal=novoCanal;
  }

  public void diminuirCanal(){
    canal--;
  }

  public void aumentarCanal(){
    canal++;
  }

  public void aumentarVolume(){
  volume++;
  System.out.println("Volume :" + volume);
}

  public void diminuirVolume(){
    volume--;
    System.out.println("Volume :" + volume);
  }

  public void ligar(){
    ligada=true;

  }

  public void desligar(){
    ligada=false;
    
  }
}

