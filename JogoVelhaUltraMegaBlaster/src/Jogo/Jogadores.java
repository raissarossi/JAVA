package Jogo;

import java.util.Scanner;

public class Jogadores {
    Scanner scan = new Scanner(System.in);

//    int marcador(){
//
//    }

    int marcar(){
        int a = 10;
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
            return a;
        }
    }
