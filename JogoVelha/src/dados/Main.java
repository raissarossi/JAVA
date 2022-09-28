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
                while(true){
                    System.out.println("DIGITE ONDE VOCE QUER MARCAR J1");
                    try {
                        a = scan.nextInt();
                        if (a <= 0 || a >= 10) {
                            System.out.println("DIGITE NOVAMENTE");
                            continue;
                        }
                    } catch (Exception e) {
                        System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA");
                        scan.next();
                        continue;
                    }
                    break;
                }

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
                System.out.println("DIGITE ONDE VOCE QUER MARCAR J2");
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
