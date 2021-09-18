package lacosforJava;

public class lacofor {
    public static void main(String[] args) {

        // for int(x=1;x<10;x++)
        // while
        // do while

        for (int x = 1; x < 10; x++) {// x=1

            for (int h = 1; h < 10; h++) { // h=1+1+1...8+1

                System.out.println(x + "*" + h "=" +x*h);// 1-2-3....8-9

                if(h==2){
                    break;
                }
            }

            if(x==4){
                continue;
            }

        }

    }

}
