package personagem;

/**
 *
 * @author icaro
 */
public class Chefao extends Personagem {

// Chefao VIDA = 120; ATAQUE = 12; DEFESA = 20; MAGIA = 6
    Atributos atributos;

    public Chefao() {
        atributos = new Atributos();

        try {
            super.id = 3;
            super.nome = "Bolsossauro";
            super.categoria = Categoria.CHEFAO;

            atributos.setVida(120F);
            atributos.setAtaque(12F);
            atributos.setDefesa(20F);
            atributos.setMagia(6F);
            super.setAtributos(atributos);
        } catch (Exception e) {

        }
    }
}
