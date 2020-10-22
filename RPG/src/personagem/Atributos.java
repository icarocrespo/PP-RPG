package personagem;

/**
 *
 * @author icaro
 */
public class Atributos {
    
    private Float vida;
    private Float ataque;
    private Float defesa;
    private Float magia;

    public Atributos(){
    
    }
    
    public Atributos(Float vida, Float ataque, Float defesa, Float magia) {
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.magia = magia;
    }

    public Float getVida() {
        return vida;
    }

    public void setVida(Float vida) {
        this.vida = vida;
    }

    public Float getAtaque() {
        return ataque;
    }

    public void setAtaque(Float ataque) {
        this.ataque = ataque;
    }

    public Float getDefesa() {
        return defesa;
    }

    public void setDefesa(Float defesa) {
        this.defesa = defesa;
    }

    public Float getMagia() {
        return magia;
    }

    public void setMagia(Float magia) {
        this.magia = magia;
    }
    
    
}
