import java.util.concurrent.ThreadLocalRandom;

public class AnaliseCandidatos {
   public AnaliseCandidatos() {
   }

   public static void main(String[] var0) throws Exception {
      selecaoCandidatos();
   }

   static void selecaoCandidatos() {
      String[] var0 = new String[]{"Lucas", "Mariana", "Thiago", "Aline", "Rafael", "Camila", "Bruno", "Larissa", "Pedro", "Juliana"};
      int var1 = 0;
      int var2 = 0;

      for(double var3 = 2000.0; var1 < 5 && var2 < var0.length; ++var2) {
         String var5 = var0[var2];
         double var6 = valorPretendido();
         System.out.println("O candidato " + var5 + " Solicitou este valor de salário " + var6);
         if (var3 >= var6) {
            System.out.println("O candidato " + var5 + " foi selecionado para a vaga");
            ++var1;
         }
      }

      System.out.println(var1);
   }

   static double valorPretendido() {
      return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
   }

   static void analisarCandidato(double var0) {
      double var2 = 2000.0;
      if (var2 > var0) {
         System.out.println("Ligar para o candidato.");
      } else if (var2 == var0) {
         System.out.println("Ligar para o candidato com contra proposta");
      } else {
         System.out.println("Aguardando resultado dos demais candidatos");
      }

   }
}
