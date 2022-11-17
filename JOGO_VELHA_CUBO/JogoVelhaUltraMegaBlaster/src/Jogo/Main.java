package Jogo;

import java.util.Arrays;

public class Main {
    static int vencedor(int[][] velha){
        int[] l0 = velha[0];
        int[] l1 = velha[1];
        int[] l2 = velha[2];
        int[] c0 = {velha[0][0], velha[1][0], velha[2][0]};
        int[] c1 = {velha[0][1], velha[1][1], velha[2][1]};
        int[] c2 = {velha[0][2], velha[1][2], velha[2][2]};
        int[] d0 = {velha[0][0], velha[1][1], velha[2][2]};
        int[] d1 = {velha[0][2], velha[1][1], velha[2][0]};
        int[][] tudo = {l0, l1, l2, c0, c1, c2, d0, d1};
        int[] valorX = {10, 10, 10};
        int[] valorO = {20, 20, 20};
        int resto = 0;
//      VERIFICAR VENCEDOR
        for (int[] ints : tudo) {
            if (Arrays.equals(ints, valorX)){
                System.out.println("JOGADOR 1 VENCEU");
                return 1;
            }
            if (Arrays.equals(ints, valorO)){
                System.out.println("JOGADOR 2 VENCEU");
                return 1;
            }
        }
//      VERIFICAR VELHA
        for (int[] ints : tudo){
            for (int ver : ints) {
                if (!(ver == 10 || ver == 20)){
                    resto += 1;
                }
            }
        }
        if (resto == 0){
            System.out.println("DEU VELHA");
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
    Criar center = new Criar();
    Jogadores J1 = new Jogadores();
    Jogadores J2 = new Jogadores();
    while (true){
        center.mostrar(center.velha);
        

        int a = vencedor(center.velha);
    }
    }
}
