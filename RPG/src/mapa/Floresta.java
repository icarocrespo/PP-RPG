package mapa;

import item.Item;
import java.util.List;
import personagem.Chefao;

/**
 *
 * @author icaro
 */
public class Floresta extends Mapa{
    private Chefao boss;

    public Floresta() {
    }

    public Floresta(Chefao boss, List<Item> itens) {
        super(itens);
        this.boss = boss;
    }

    public Floresta(Chefao boss) {
        this.boss = boss;
    }
    
    public Chefao getBoss() {
        return boss;
    }

    public void setBoss(Chefao boss) {
        this.boss = boss;
    }
    
    
}
