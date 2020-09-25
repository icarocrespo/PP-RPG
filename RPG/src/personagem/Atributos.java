package personagem;

/**
 *
 * @author icaro
 */
public class Atributos {
    
    private Integer vida;
    private Integer ataque;
    private Integer defesa;
    private Float distancia;
    private Integer magia;

    public Atributos(){
    
    }
    
    public Atributos(Integer vida, Integer ataque, Integer defesa, Float distancia, Integer magia) {
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.distancia = distancia;
        this.magia = magia;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefesa() {
        return defesa;
    }

    public void setDefesa(Integer defesa) {
        this.defesa = defesa;
    }

    public Float getDistancia() {
        return distancia;
    }

    public void setDistancia(Float distancia) {
        this.distancia = distancia;
    }

    public Integer getMagia() {
        return magia;
    }

    public void setMagia(Integer magia) {
        this.magia = magia;
    }
    
    
}
