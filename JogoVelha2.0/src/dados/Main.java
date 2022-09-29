package dados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int parar = 0;
        int a= 0;
        Velha L1 = new Velha();
        Velha L2 = new Velha();
        Velha L3 = new Velha();
        Velha L4 = new Velha();
        Velha L5 = new Velha();
        Velha L6 = new Velha();
        Scanner scan = new Scanner(System.in);
        L1.mostrar(L1.velha);
        L2.mostrar(L2.velha);
        L3.mostrar(L3.velha);
        L4.mostrar(L4.velha);
        L5.mostrar(L5.velha);
        L6.mostrar(L6.velha);
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
//                FAZER UM IF PARA CADA E CRIAR UMA STRING QUE SO PODE SER C,L,R,U,D OU B
                int b = L1.marcar(a, 10);
                int b = L2.marcar(a, 10);
                int b = L3.marcar(a, 10);
                int b = L4.marcar(a, 10);
                int b = L5.marcar(a, 10);
                int b = L6.marcar(a, 10);

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
