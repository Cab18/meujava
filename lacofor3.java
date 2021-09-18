package lacosforJava;

public class lacofor3 {
    public static void main(String[] args) {

        for (int y = 0; y <= 100; y++) {

            if (y % 2 == 0) {

                System.out.println(y + "É par");

            }

            for (y = 1; y <= 100; y++) {

                if (y % 2 == 1) {

                    System.out.println(y + " Impar");
                }
                // ||validação dentro do for

            }
        }
    }
}
