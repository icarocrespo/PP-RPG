package mapa;

import util.Item;

/**
 *
 * @author icaro
 */
public class Mapa {
    private Object[][] mapa;
    protected Item item;
    protected Integer flag_personagem;
    // 0 = Castelo | 1 = Vilarejo | 2 = Taberna | 3 = Floresta
    
    public Mapa(){
        mapa = new Object[5][5];   
    }
    
    public Mapa(Item item){
        mapa = new Object[5][5];
        this.item = item;
    }
    
    public Object getPosicao(int x, int y){
        return mapa[x][y];
    }
    
    public void setPosicao(Object obj, int x, int y){
        this.mapa[x][y] = obj;
    }

    public Object[][] getMapa() {
        return mapa;
    }

    public void setMapa(Object[][] mapa) {
        this.mapa = mapa;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    public boolean setMapa(Mapa obj, int x, int y){
        this.mapa[x][y] = obj;
        return true;
    }

    public Integer getFlag_personagem() {
        return flag_personagem;
    }

    public void setFlag_personagem(Integer flag_personagem) {
        this.flag_personagem = flag_personagem;
    }
    
       
}