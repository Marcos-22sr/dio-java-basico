public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //POO

    public void mudarCanal (int novoCanal){ //entre parênteses são parametros. 
        canal = novoCanal;
    }

    public void aumentarCanal(){ //nomes verdes são métodos.
        canal++;
    }

    public void diminuirCanal(){ //nomes rosas são classes.
        canal--;
    }


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    
    public void dimunirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada=true;
    }
    
    public void desligar(){
        ligada=false;
    }


    

}
