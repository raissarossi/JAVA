package bosch;

import java.util.Arrays;
import java.util.Scanner;

public class Jogo {
    Jogo(){
    }
    void jogar(){

        Scanner scan = new Scanner(System.in);

        Velha centerCube = new Velha();
        Velha upCube = new Velha();
        Velha backCube = new Velha();
        Velha downCube = new Velha();
        Velha leftCube = new Velha();
        Velha rightCube = new Velha();

        definirOCubo(centerCube, 1);
        definirOCubo(upCube, 2);
        definirOCubo(backCube, 3);
        definirOCubo(downCube, 4);
        definirOCubo(leftCube, 5);
        definirOCubo(rightCube,6 );

        System.out.println("\n\n");
        int girar;
        boolean a;
        centerCube.showCube();
        turnCenterToRight(leftCube, centerCube, rightCube, backCube, 0, false);
//        while (true) {
//            girar = scan.nextInt();
//            if (girar == 1) {
//                turnCenterToRight(centerCube, true);
//            }else if (girar == 2){
//                turnCenterToRight(centerCube, false);
//            }else if (girar == 0){
//                break;
//            }
//        }



    }
    public int[] inverter(int[] vetorDe3){
        vetorDe3 = new int[]{vetorDe3[2], vetorDe3[1], vetorDe3[0]};
        return vetorDe3;
    }

    public void turnCenterToRight(Velha center, boolean reverse) {

        int[] centerLine0 = center.getLine0();
        int[] centerLine1 = center.getLine1();
        int[] centerLine2 = center.getLine2();

        if (reverse) {
            centerLine2 = inverter(centerLine2);
            centerLine1 = inverter(centerLine1);
            centerLine0 = inverter(centerLine0);
            center.setColumn2(centerLine2);
            center.setColumn1(centerLine1);
            center.setColumn0(centerLine0);
            System.out.println("\n\n");
            System.out.println("<<=!");
        } else {
            center.setColumn2(centerLine0);
            center.setColumn1(centerLine1);
            center.setColumn0(centerLine2);
            System.out.println("\n\n");
            System.out.println("!=>>");
        }

        center.showCube();
    }
    public void definirOCubo(Velha cubo, int definir){
        int[] set = {definir, definir, definir};
        cubo.setLine0(set);
        cubo.setLine1(set);
        cubo.setLine2(set);
    }
    public void turnCenterToRight(Velha left, Velha center, Velha right, Velha back, int line, boolean reverse) {
        int[][] girar = {{},{},{},{}};

        System.out.println(Arrays.deepToString(girar));

        if (reverse) {
            if (line == 0){
                girar[0] = left.getLine0();
                girar[1] = center.getLine0();
                girar[2] = right.getLine0();
                girar[3] = back.getLine0();
            }else if (line == 1){
                girar[0] = left.getLine1();
                girar[1] = center.getLine1();
                girar[2] = right.getLine1();
                girar[3] = back.getLine1();
            } else{
                girar[0] = left.getLine2();
                girar[1] = center.getLine2();
                girar[2] = right.getLine2();
                girar[3] = back.getLine2();
            }
            left.getLine0();
            center.getLine0();
            right.getLine0();
            back.getLine0();
            System.out.println("L");
            left.showCube();
            System.out.println("C");
            center.showCube();
            System.out.println("R");
            right.showCube();
            System.out.println("B");
            back.showCube();
        } else {
            if (line == 0){
                girar[0] = left.getLine0();
                girar[1] = center.getLine0();
                girar[2] = right.getLine0();
                girar[3] = back.getLine0();
            }else if (line == 1){
                girar[0] = left.getLine1();
                girar[1] = center.getLine1();
                girar[2] = right.getLine1();
                girar[3] = back.getLine1();
            } else{
                girar[0] = left.getLine2();
                girar[1] = center.getLine2();
                girar[2] = right.getLine2();
                girar[3] = back.getLine2();
            }
            left.getLine0();
            center.getLine0();
            right.getLine0();
            back.getLine0();

            System.out.println("L");
            left.showCube();
            System.out.println("C");
            center.showCube();
            System.out.println("R");
            right.showCube();
            System.out.println("B");
            back.showCube();
        }
    }
}
