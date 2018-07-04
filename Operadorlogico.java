public class Operadorlogico {
   public static void main (String [] args) {
       
      int idade;
      idade = 18;

      String sexo;
      sexo = "masculino";

 
      if ((idade <= 18) && (sexo == "masculino")) {
      System.out.println ("Homem maior de idade");
      
      }else{
       System.out.println ("Mulher");
   }
  }
 }