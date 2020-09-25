package personagem;

/**
 *
 * @author icaro
 */
public abstract class Personagem {
    
    private Integer id;
    private String nome;
    private Categoria categoria;
    private Atributos atributos;

    public Personagem(){
    
    }

    public Personagem(Integer id, String nome, Categoria categoria, Atributos atributos) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.atributos = atributos;
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
}
