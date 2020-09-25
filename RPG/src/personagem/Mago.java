package personagem;

/**
 *
 * @author icaro
 */
public class Mago extends Personagem {

// Mago VIDA = 30; ATAQUE = 7; DEFESA = 3; DISTANICA = 3.5; MAGIA = 2
    Atributos atributos;

    public Mago() {
        atributos = new Atributos();

        try {
            super.setId(3);
            super.setNome("Lula");
            super.setCategoria(Categoria.MAGO);

            atributos.setVida(30);
            atributos.setAtaque(7);
            atributos.setDefesa(3);
            atributos.setDistancia(3.5F);
            atributos.setMagia(2);
            super.setAtributos(atributos);
        } catch (Exception e) {
            
        }
    }
}
