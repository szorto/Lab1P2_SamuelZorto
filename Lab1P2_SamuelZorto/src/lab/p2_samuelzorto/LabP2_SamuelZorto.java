package lab.p2_samuelzorto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author szorto
 */
public class LabP2_SamuelZorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrad = new Scanner(System.in);
        boolean rep = true;
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Elija el ejercicio que desea hacer:");
            System.out.println("[1] Ejercicio 1");
            System.out.println("[2] Ejercicio 2");
            System.out.println("[3] Ejercicio 3");
            System.out.println("[4] Salir");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int el = entrada.nextInt();
            switch (el) {
                case 1:
                    System.out.println("");
                    System.out.print("Numero de discos: ");
                    int ni = entrada.nextInt();
                    hanoii(ni, 1, 2, 3);
                    break;

                case 2:
                    System.out.println("Porfa escriba asi 🙏: hola,22/02/2022,chango,chango2,17/03/1905,...");
                    String chango = entrad.nextLine();
                    String changoo[] = chango.split(",");
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    for (int i = 0; i < changoo.length; i++) {
                        if (changoo[i].length() == 10 && changoo[i].charAt(2) == '/' && changoo[i].charAt(5) == '/') {
                            System.out.println(changoo[i]);
                        }
                    }
                    break;
                    
                case 3:
                    System.out.print("Ingrese valor de k: ");
                    int kk = entrada.nextInt();
                    System.out.println(4 *pipi(kk, 0));
                    break;
                default:
                    rep = false;
                    break;
            }
        } while (rep);
    }

    public static void hanoii(int ni, int ori, int aux, int des) {
        if (ni == 1) {
            System.out.println("mover disco 1 de " + ori + " a " + des);
        } else {
            hanoii(ni - 1, ori, des, aux);
            System.out.println("mover disco " + ni + " de " + ori + " a " + des);
            hanoii(ni - 1, aux, ori, des);
        }

    }
    
    public static double pipi(int kk, int nn){
        if(kk == 0){
            return 1;
        }else{
            double up = Math.pow(-1, kk);
            double down = (2 * kk) + 1;
            double chacha = up/down;
            return chacha + pipi(kk - 1, nn);
        }
    }
}
