package personagem;

/**
 *
 * @author icaro
 */
public class Mago extends Personagem {

// Mago VIDA = 30; ATAQUE = 7; DEFESA = 3; MAGIA = 2
    Atributos atributos;

    public Mago() {
        atributos = new Atributos();

        try {
            super.setId(3);
            super.setNome("Lula");
            super.setCategoria(Categoria.MAGO);

            atributos.setVida(30F);
            atributos.setAtaque(7F);
            atributos.setDefesa(3F);
            atributos.setMagia(3F);
            super.setAtributos(atributos);
        } catch (Exception e) {
            
        }
    }
}
