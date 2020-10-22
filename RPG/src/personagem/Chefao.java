package personagem;

/**
 *
 * @author icaro
 */
public class Chefao extends Personagem {

// Chefao VIDA = 120; ATAQUE = 12; DEFESA = 20; DISTANICA = 2; MAGIA = 6
    Atributos atributos;

    public Chefao() {
        atributos = new Atributos();

        try {
            super.setId(3);
            super.setNome("Bolsossauro");
            super.setCategoria(Categoria.CHEFAO);

            atributos.setVida(120F);
            atributos.setAtaque(12F);
            atributos.setDefesa(20F);
            atributos.setDistancia(2F);
            atributos.setMagia(6F);
            super.setAtributos(atributos);
        } catch (Exception e) {

        }
    }
}
