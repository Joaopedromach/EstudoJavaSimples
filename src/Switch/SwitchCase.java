package Switch;

public class SwitchCase {
    public static void main(String[] args) {
        String tomaagua = "talvez";

        switch (tomaagua){

            case "sim":
                System.out.println("Agua no copo");
            break;
            case "talvez":
                System.out.println("Tomar Agua");
            break;
            default:
                System.out.println("Ja Tomou agua Hoje");


        }
    }
}
