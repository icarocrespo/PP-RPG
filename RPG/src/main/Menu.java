package main;

import java.util.Scanner;
import util.Historia;

/**
 *
 * @author icaro
 */
public class Menu {
    Scanner entrada;
    
    public Menu(){
        entrada = new Scanner(System.in);
    }
    
    public void inicial(){
        String opcao;
        
        Historia.intro();
        do{
            System.out.println("\tEscolha seu personagem!");
            System.out.println("[qualidades de cada personagem]");
            System.out.println("\t1. Arqueiro\n\t2. Espadachim\n\t3. Mago\n");
            System.out.print("Escolha sabiamente: ");
            opcao = entrada.next();
        }while(!opcao.equals("0") && !opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3"));
       
        switch(opcao){
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
    
    
    public void castelo1(){
        String opcao;
        
        Historia.intro();
        do{
            System.out.println("\tEscolha seu personagem!");
            System.out.println("[qualidades de cada personagem]");
            System.out.println("\t1. Arqueiro\n\t2. Espadachim\n\t3. Mago\n");
            System.out.print("Escolha sabiamente: ");
            opcao = entrada.next();
        }while(!opcao.equals("0") && !opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3"));
       
        switch(opcao){
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
}