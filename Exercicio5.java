import java.util.Scanner;
public class Exercicio2 
    {
        public static void main(String[] args) {
            double m=0;
            double soma=0;
            while (m<=3) {
            double a=Math.pow(16.0,-m);
            double b=(4.0/((8.0*m)+1.0));
            double c=(2.0/((8.0*m)+4.0));
            double d=(1.0/((8.0*m)+5.0));
            double e=(1.0/((8.0*m)+6.0)); 

            soma = soma + (a*(b-c-d-e));

             m = m + 1;
  }
    System.out.println(soma);
  }
}