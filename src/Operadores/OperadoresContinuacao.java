package Operadores;

public class OperadoresContinuacao {

    public static void main(String[] args) {

        Integer num1 = 2;

        num1++;
        System.out.println(num1);

        num1--;

        System.out.println(num1);

        Integer num2 = 3;
        Integer num3 = 4;

        /*
         == operador de igual
         != operador de diferente
         < menor
         > maior
         >= maior ou igual
         <= menor ou igual
         */
        Boolean igual = num2 == num3;
        Boolean diferente = num2 != num3;
        Boolean menor = num2 < num3;
        Boolean maior = num2 > num2;
        Boolean maiorigual = num2>= num3;
        Boolean menorigual = num2 <= num3;

        System.out.println(igual);
        System.out.println(diferente);
        System.out.println(menor);
        System.out.println(maior);
        System.out.println(maiorigual);
        System.out.println(menorigual);

        System.out.println(igual +" "+ diferente + " " + menor+ " "+ maior + " " + maiorigual + " " + menorigual);
    }
}
