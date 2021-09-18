import java.util.Scanner;

public class While1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String op = "S";
        while (op.equals("N")) {
            System.out.println("Deseja sair (S, N)");
            op = se.nextLine();
        }
        System.out.println("While executado");

        do {
            System.out.println("Deseja sair (S, N)");
            op = se.nextLine();
        } while (op.equals("N"));
        System.out.println("Do-While executado");

    }
}