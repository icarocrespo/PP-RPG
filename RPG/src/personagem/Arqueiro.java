package personagem;

/**
 *
 * @author icaro
 */
public class Arqueiro extends Personagem {

    Atributos atributos;

// Arqueiros VIDA = 30; ATAQUE = 6; DEFESA = 3; MAGIA = 0
    public Arqueiro() {
        atributos = new Atributos();

        try {
            super.setId(1);
            super.setNome("Putin");
            super.setCategoria(Categoria.ARQUEIRO);

            atributos.setVida(30F);
            atributos.setAtaque(6F);
            atributos.setDefesa(3F);
            atributos.setMagia(0F);
            super.setAtributos(atributos);
        } catch (Exception e) {

        }
    }

}
