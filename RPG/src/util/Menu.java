package util;

import java.util.Scanner;
import util.Historia;

/**
 *
 * @author icaro
 */
public class Menu {

    Scanner entrada;

    public Menu() {
        entrada = new Scanner(System.in);
    }

    public void inicial() throws InterruptedException {
        String opcao;

        System.out.println("||||| WELCOME TO YOUR FAITH |||||");
        
        Historia.intro();
        do {
            System.out.println("\tEscolha seu personagem!");
            System.out.println("\t0. Sair\n"
                    + "\t1. Arqueiro [HP = 30 | A = 6 | D = 3 | DIST = 5 | M = 0]\n"
                    + "\t2. Espadachim [HP = 50 | A = 8 | D = 6 | DIST = 1 | M = 0]\n"
                    + "\t3. Mago [HP = 30 | A = 7 | D = 3 | DIST = 3.5 | M = 2]\n");
            System.out.print("Escolha sabiamente: ");
            opcao = entrada.next();
        } while (!opcao.equals("0") && !opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3"));

        switch (opcao) {
            case "0":
                System.out.println("Você saiu");
                break;
            case "1":
                System.out.println("Você escolheu 1, ARQUEIRO!");
                break;
            case "2":
                System.out.println("Você escolheu 1, ESPADACHIM!");
                break;
            case "3":
                System.out.println("Você escolheu 1, MAGO!");
                break;
        }
    }

    public void castelo1() throws InterruptedException {
        String opcao;
        
        Historia.castelo1();
        
        do {

            opcao = entrada.next();
        } while (!opcao.equals("0") && !opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3"));

        switch (opcao) {
            case "0":
                System.out.println("Você saiu");
                break;
            case "1":
                System.out.println("Você escolheu 1, ARQUEIRO!");
                break;
            case "2":
                System.out.println("Você escolheu 1, ESPADACHIM!");
                break;
            case "3":
                System.out.println("Você escolheu 1, MAGO!");
                break;
        }
    }

    public void floresta1() {

    }

    public void vilarejo1() {

    }

    public void floresta2() {

    }

    public void opcao(String opcao) {
        do {
            switch (opcao.charAt(0)) {
                case '1':

                    break;

                case '2':

                    break;

                case 'm':
                    break;

                case 'i':
                    break;

                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        } while (opcao.charAt(0) != '1' || opcao.charAt(0) != '2' || opcao.charAt(0) != 'm' || opcao.charAt(0) != 'i');
    }
}
