package personagem;

/**
 *
 * @author icaro
 */

// Espadachim VIDA = 50; ATAQUE = 8; DEFESA = 6; DISTANICA = 1; MAGIA = 0
public class Espadachim extends Personagem{
    
    public Espadachim(){
    atributos = new Atributos();

        try {
            super.id = 2;
            super.nome = "Haddad";
            super.categoria = Categoria.ESPADACHIM;
            super.selected = false;
            
            super.atributos.setVida(50F);
            super.atributos.setAtaque(8F);
            super.atributos.setDefesa(6F);
            super.atributos.setMagia(0F);
            super.setAtributos(atributos);
        } catch (Exception e) {

        }
    }
}
