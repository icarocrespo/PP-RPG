package personagem;

/**
 *
 * @author icaro
 */

// Espadachim VIDA = 50; ATAQUE = 8; DEFESA = 6; DISTANICA = 1; MAGIA = 0
public class Espadachim extends Personagem{
    Atributos atributos;
    
    public Espadachim(){
    atributos = new Atributos();

        try {
            super.setId(2);
            super.setNome("Haddad");
            super.setCategoria(Categoria.ESPADACHIM);

            atributos.setVida(50);
            atributos.setAtaque(8);
            atributos.setDefesa(6);
            atributos.setDistancia(0F);
            atributos.setMagia(0);
            super.setAtributos(atributos);
        } catch (Exception e) {

        }
    }
}
