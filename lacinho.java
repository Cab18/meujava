package lacosforJava;

import java.util.Scanner;

public class lacinho {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero misera");
        int n = leia.nextInt();

        for (int i = 1; i < n; i++) {
            for (int x = 1; x <= n; i++) {
                System.out.println(i + "" + x);
            }
        }

    }

}