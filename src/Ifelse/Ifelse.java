package Ifelse;

public class Ifelse {
    public static void main(String[] args) {

    Integer idade = 19;

    if(idade >= 18 ){
        System.out.println("Pode tirar CNH!");

    }else{
        System.out.println("Nao pode tirar CNH!");
    }

    // Operador ternario (cond.)?cod. : cod.

        System.out.println((idade >= 18)?"Pode tirar CNH!":"Nao pode tirar CNH!");

}
}
