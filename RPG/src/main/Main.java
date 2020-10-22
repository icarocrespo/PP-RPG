package main;

import util.Menu;
import java.util.Scanner;
import mapa.Castelo;
import mapa.Floresta;
import mapa.Vilarejo;

/**
 *
 * @author icaro
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner x = new Scanner(System.in);
        Menu menu = new Menu();
        Castelo castelo = new Castelo();
        Floresta floresta = new Floresta();
        Vilarejo vilarejo = new Vilarejo();
        
                
        menu.inicial();
        menu.castelo1();
    }
}