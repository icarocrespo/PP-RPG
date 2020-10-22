package jogador;

import util.Item;
import java.util.List;

/**
 *
 * @author icaro
 */
public class Jogador {
    
    private List<Item> itens;

    public Jogador(List<Item> itens) {
        this.itens = itens;
    }
    
    public Jogador(){
    
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
