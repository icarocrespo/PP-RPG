package personagem;

import item.Item;
import java.util.List;

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

    public Personagem() {

    }

    public Personagem(Integer id, String nome, Categoria categoria, Atributos atributos, List<Item> itens) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.atributos = atributos;
        this.itens = itens;
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

    protected Boolean usaItem(Item item, Atributos atributos) {
        boolean retorno = false;
        Atributos atr = new Atributos();
        try {
            if (item.getStatus()) {
                if (item.getAcrescimo_a() != 0F) {
                    atr.setAtaque(atributos.getAtaque() * item.getAcrescimo_a());
                }
            }
            retorno = true;
            setAtributos(atributos);
        } catch (Exception e) {
            retorno = false;
        }
        return retorno;
    }

    public String inventario() {
        String retorno = "----- INVENTÁRIO -----\n";
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
