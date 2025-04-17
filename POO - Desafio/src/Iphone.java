public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
   
    //REPRODUTOR MUSICAL
    public void tocar() {
        System.out.println("Tocar música");
    }

    public void pausar() {
        System.out.println("Pausar música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecione a música desejada: " + musica);    
    }

    //APARELHO TELEFONICO
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atender telefone");
    }

    public void iniciarCorreiroDeVoz() {
        System.out.println("Iniciando correio de voz no iPhone");
    }

    //NAVEGADOR DE INTERNET
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url); 
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador");
    }

}
