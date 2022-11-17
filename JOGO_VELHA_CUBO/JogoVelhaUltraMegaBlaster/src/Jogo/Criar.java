package Jogo;

import java.util.Arrays;

public class Criar {
    int[][] velha = {
            {7, 8, 9},
            {4, 5, 6},
            {1, 2, 3}};

    void mostrar(int[][] mostra) {
        String velhaS = Arrays.deepToString(mostra);
        velhaS = velhaS.replace(", [", "\n");
        velhaS = velhaS.replace("]", "");
        velhaS = velhaS.replace("[", "");
        velhaS = velhaS.replace(",", "   ");
        velhaS = velhaS.replace("10", "💋");
        velhaS = velhaS.replace("20", "👽");
        System.out.println(velhaS);
    }

    public void marcar(int position, int marcador) {
        if (position == 7 && (!(velha[0][0] == 10 || velha[0][0] == 20))) {
            velha[0][0] = marcador;
        }
        if (position == 8 && (!(velha[0][1] == 10 || velha[0][1] == 20))) {
            velha[0][1] = marcador;
        }
        if (position == 9 && (!(velha[0][2] == 10 || velha[0][2] == 20))) {
            velha[0][2] = marcador;
        }
        if (position == 4 && (!(velha[1][0] == 10 || velha[1][0] == 20))) {
            velha[1][0] = marcador;
        }
        if (position == 5 && (!(velha[1][1] == 10 || velha[1][1] == 20))) {
            velha[1][1] = marcador;
        }
        if (position == 6 && (!(velha[1][2] == 10 || velha[1][2] == 20))) {
            velha[1][2] = marcador;
        }
        if (position == 1 && (!(velha[2][0] == 10 || velha[2][0] == 20))) {
            velha[2][0] = marcador;
        }
        if (position == 2 && (!(velha[2][1] == 10 || velha[2][1] == 20))) {
            velha[2][1] = marcador;
        }
        if (position == 3 && (!(velha[2][2] == 10 || velha[2][2] == 20))) {
            velha[2][2] = marcador;
        }

        mostrar(velha);

    }
}
