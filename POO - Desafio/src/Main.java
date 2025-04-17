public class Main {
    public static void main(String[] args) throws Exception {
        
        // INSTANCIANDO IPHONE
        Iphone iphone = new Iphone();

        // CHAMANDO A CLASSE REPRODUTOR MUSICAL 
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("In Pieces - Linkin Park");

        System.out.println();

        //CHAMANDO A CLASSE APARELHO TELEFONICO
        iphone.ligar("8199300-0362");
        iphone.atender();
        iphone.iniciarCorreiroDeVoz();
        System.out.println();

        //CHAMANDO A CLASSE NAVEGADOR INTERNET 

        iphone.exibirPagina("www.dioteste.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
