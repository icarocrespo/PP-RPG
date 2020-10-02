package mapa;

import item.Item;
import java.util.List;

/**
 *
 * @author icaro
 */
public abstract class Mapa {
    protected Object[][] mapa;
    protected List<Item> itens;
    
    public Mapa(){
        mapa = new Object[50][50];   
    }
    
    public Mapa(List<Item> itens){
        mapa = new Object[50][50];
        this.itens = itens;
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

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
}