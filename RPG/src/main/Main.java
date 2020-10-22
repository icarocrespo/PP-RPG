package main;

import util.Item;
import util.Menu;
import java.util.Scanner;
import mapa.Castelo;
import mapa.Floresta;
import mapa.Mapa;
import mapa.Taberna;
import mapa.Vilarejo;
import personagem.Personagem;

/**
 *
 * @author icaro
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner x = new Scanner(System.in);
        Menu menu = new Menu();
        Mapa mapa = new Mapa();
        
        Item espada = new Item(1, "Facada Biroliro", 20F, null, 30F, null, 5F, null, false);
        Item pocao = new Item(2, "Brhama geladinha", 40F, null, 15F, null, null, -3F, false);
        
        Castelo castelo = new Castelo(espada);
        Floresta floresta = new Floresta();
        Vilarejo vilarejo = new Vilarejo();
        Taberna taberna = new Taberna(pocao);
        
        
        Personagem personagem;
        
        // dispõe locais no mapa
        mapa.setMapa(castelo, 0, 3);
        mapa.setMapa(vilarejo, 2, 2);
        mapa.setMapa(taberna, 2, 3);
        mapa.setMapa(floresta, 4, 4);
                
        personagem = menu.inicial(mapa);
        menu.movimento(mapa);
        menu.acao(mapa, personagem);
        
    }
    
}