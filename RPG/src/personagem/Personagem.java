package personagem;

import util.Item;
import java.util.List;
import mapa.Mapa;

/**
 *
 * @author icaro
 */
public abstract class Personagem {

    protected Integer id;
    protected String nome;
    protected Categoria categoria;
    protected Atributos atributos;
    protected List<Item> itens;
    protected Boolean selected;
    protected Mapa mapa;

    public Personagem() {

    }

    public Personagem(Integer id, String nome, Categoria categoria, Atributos atributos, List<Item> itens, Boolean selected) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.atributos = atributos;
        this.itens = itens;
        this.selected = selected;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Mapa getMapa() {
        return mapa;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }

    public Boolean usaItem(Item item, Atributos atributos) {
        boolean retorno = false;
        try {
            if (item.getStatus()) {
                
                // Acréscimos
                if (item.getAcrescimo_a() != null) {
                    atributos.setAtaque(atributos.getAtaque() + item.getAcrescimo_a());
                }
                if (item.getAcrescimo_a() != null) {
                    atributos.setDefesa(atributos.getDefesa() + item.getAcrescimo_d());
                }
                if (item.getAcrescimo_a() != null) {
                    atributos.setVida(atributos.getVida() + item.getAcrescimo_hp());
                }
                
                // Decréscimos
                if (item.getDecrescimo_a() != null) {
                    atributos.setAtaque(atributos.getAtaque() + item.getAcrescimo_a());
                }
                if (item.getDecrescimo_d() != null) {
                    atributos.setDefesa(atributos.getDefesa() + item.getDecrescimo_d());
                }
                if (item.getDecrescimo_hp() != null) {
                    atributos.setVida(atributos.getVida() + item.getDecrescimo_hp());
                }
            }
            itens.remove(item);
            retorno = true;
            setAtributos(atributos);
        } catch (Exception e) {
            retorno = false;
        }
        return retorno;
    }

    public String inventario() {
        String retorno = "----- INVENTÁRIO -----\n";

        if (itens.isEmpty()) {
            retorno += "Você não possui itens em seu inventário.";
            return retorno;
        } else {
            
            int i = 1;

            for (Item item : itens) {
                retorno += "Item [" + i + "] = " + item.getNome() + "\n"
                        + "Tipo = " + item.getTipo() + "\n"
                        + "Status = " + item.getStatus() + "\n"
                        + "Acréscimo HP = " + item.getAcrescimo_hp() + "\n"
                        + "Acréscimo Ataque = " + item.getAcrescimo_a() + "\n"
                        + "Acréscimo Defesa = " + item.getAcrescimo_d() + "\n\n";
                i++;
            }
            return retorno;
        }
    }
}
