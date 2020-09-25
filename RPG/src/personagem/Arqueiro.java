package personagem;

/**
 *
 * @author icaro
 */
public class Arqueiro extends Personagem {

    Atributos atributos;

// Arqueiros VIDA = 30; ATAQUE = 6; DEFESA = 3; DISTANICA = 5; MAGIA = 0
    public Arqueiro() {
        atributos = new Atributos();

        try {
            super.setId(1);
            super.setNome("Putin");
            super.setCategoria(Categoria.ARQUEIRO);

            atributos.setVida(30);
            atributos.setAtaque(6);
            atributos.setDefesa(3);
            atributos.setDistancia(5F);
            atributos.setMagia(0);
            super.setAtributos(atributos);
        } catch (Exception e) {

        }
    }

}
