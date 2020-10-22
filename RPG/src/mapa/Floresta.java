package mapa;

import util.Item;
import personagem.Chefao;

/**
 *
 * @author icaro
 */
public class Floresta extends Mapa{
    private Chefao boss;

    public Floresta() {
    }

    public Floresta(Chefao boss, Item item) {
        super(item);
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
