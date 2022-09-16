package dados;

import java.util.Arrays;

public class Velha {

        int[][] velha = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        String vencedor(int[][] velhaV) {
            int[] l0 = velhaV[0];
            int[] l1 = velhaV[1];
            int[] l2 = velha[2];
            int[] c0 = {velha[0][0], velha[1][0], velha[2][0]};
            int[] c1 = {velha[0][1], velha[1][1], velha[2][1]};
            int[] c2 = {velha[0][2], velha[1][2], velha[2][2]};
            int[] d0 = {velha[0][0], velha[1][1], velha[2][2]};
            int[] d1 = {velha[0][2], velha[1][1], velha[2][0]};
            int[][] tudo = {l0, l1, l2, c0, c1, c2, d0, d1};
            int[] valorX = {1, 1, 1};
            int[] valorO = {0, 0, 0};
            int x = 0;
            int resto = 0;
//            for x in range(0, len(tudo)):
//            print(tudo[x])
//            if tudo[x] == [1, 1, 1]:
//            print('JOGADOR 1 GANHOU')
//            break

            for (int[] ints : tudo) {
                if (ints == valorX) {
                    return "JOGADOR 2 GANHOU";
                }else if (ints == valorO) {
                    return "JOGADOR 1 GANHOU";
                }else{
                    for (int y = 0; y < 3; y++) {
                            if (!(tudo[x][y] == 1 || tudo[x][y] == 0)) {
                                resto = 1;
                                break;
                            }
                        }if (resto == 1){
                        break;
                    }
                    }
                x += 1;
                }
            if (resto == 1) {
                return "Nada aconteceu";
            }else{
                return "Velha";
            }
//                    elif tudo[x] == [1, 1, 1]:
//            print('JOGADOR 2 GANHOU')
//            break

//            for y in range(0, 3):
//            print(tudo[x][y])
//            if tudo[x][y] != 1:
//            if tudo[x][y] != 0:
//            resto = 1
        }

        void mostrar(Arrays[] mostra){
            String velhaS = Arrays.deepToString(mostra);
            velhaS = velhaS.replace("[[","\n");
            velhaS = velhaS.replace("]","");
            velhaS = velhaS.replace("[","");
            velhaS = velhaS.replace(",","");
            velhaS = velhaS.replace("0","");
            System.out.println(velhaS);
        }
    }

