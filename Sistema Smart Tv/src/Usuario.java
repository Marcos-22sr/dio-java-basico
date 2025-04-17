public class Usuario {
    public static void main(String[] args) throws Exception {
        
        //criando um Poo

        SmartTv smartTv = new SmartTv();

        smartTv.dimunirVolume();
        smartTv.dimunirVolume();
        smartTv.dimunirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : "+ smartTv.volume);


        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);


        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);













    }
}
