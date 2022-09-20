package dados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int parar = 0;
        int a= 0;
        Velha L1 = new Velha();
        Scanner scan = new Scanner(System.in);
        while (parar == 0) {
            while (parar == 0) {
                System.out.println("DIGITE ONDE VOCE QUER MARCAR");
                a = scan.nextInt();
                int b = L1.marcar(a, 10);
                if (b == 0) {
                    break;
                }else if (b == 1){
                    parar = 1;
                }else {
                    System.out.println("POR FAVOR DIGITE O NUMERO NOVAMENTE!!!");
                }
            }
            while (parar == 0) {
                System.out.println("DIGITE ONDE VOCE QUER MARCAR");
                a = scan.nextInt();
                int b = L1.marcar(a, 20);
                if (b == 0) {
                    break;
                }else if (b == 1){
                    parar = 1;
                } else {
                    System.out.println("POR FAVOR DIGITE O NUMERO NOVAMENTE!!!");
                }
            }
        }

    }
}
