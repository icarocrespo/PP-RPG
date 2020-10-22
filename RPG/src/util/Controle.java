package util;

import java.util.Scanner;
import mapa.Mapa;
import personagem.Arqueiro;
import personagem.Chefao;
import personagem.Espadachim;
import personagem.Mago;
import personagem.Personagem;

/**
 *
 * @author icaro
 */
public class Controle {

    Scanner entrada;

    public Controle() {
        entrada = new Scanner(System.in);
    }

    public Personagem inicial(Mapa mapa) throws InterruptedException {
        Personagem p = null;
        String opcao;

        System.out.println("||||| WELCOME TO YOUR JOURNEY |||||");

        Historia.intro();
        do {
            System.out.println("\tEscolha seu personagem!");
            System.out.println("\t0. Sair\n"
                    + "\t1. Arqueiro [HP = 30 | A = 6 | D = 3 | M = 0]\n"
                    + "\t2. Espadachim [HP = 50 | A = 8 | D = 6 | M = 0]\n"
                    + "\t3. Mago [HP = 30 | A = 7 | D = 3 | M = 2]\n");
            System.out.print("Escolha sabiamente: ");
            opcao = entrada.next();
        } while (!opcao.equals("0") && !opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3"));

        switch (opcao) {
            case "0":
                System.out.println("Você saiu");
                break;

            case "1":
                System.out.println("Você escolheu 1, ARQUEIRO!\n");
                p = new Arqueiro();
                p.setSelected(true);
                p.setMapa(mapa);
                personagemHistoria(p);
                Thread.sleep(1000);
                System.out.println("");
                Historia.castelo1();
                mapa.setFlag_personagem(0);
                break;

            case "2":
                System.out.println("Você escolheu 2, ESPADACHIM!\n");
                p = new Espadachim();
                p.setSelected(true);
                p.setMapa(mapa);
                personagemHistoria(p);
                Thread.sleep(1000);
                System.out.println("");
                Historia.castelo1();
                mapa.setFlag_personagem(0);
                break;

            case "3":
                System.out.println("Você escolheu 3, MAGO!\n");
                p = new Mago();
                p.setSelected(true);
                p.setMapa(mapa);
                personagemHistoria(p);
                Thread.sleep(1000);
                System.out.println("");
                Historia.castelo1();
                mapa.setFlag_personagem(0);

                break;
        }

        return p;
    }

    // Mostra a história do personagem selecionado
    public void personagemHistoria(Personagem personagem) throws InterruptedException {
        if (personagem instanceof Arqueiro) {
            Historia.putin1();
        } else if (personagem instanceof Espadachim) {
            Historia.haddad1();
        } else if (personagem instanceof Mago) {
            Historia.lula1();
        } else {
            System.out.println("Erro de instância de personagem.");
        }
    }

    // Movimenta o personagem pelo mapa
    public void movimento(Mapa mapa) {
        switch (mapa.getFlag_personagem()) {
            case 0:
                System.out.println("");
                System.out.println("\t\tVocê está no Castelo. \n");
                System.out.println("\t\t\tSUAS OPÇÕES\n");
                System.out.println("[1. Falar com o rei | "
                        + "2. Ir para o Vilarejo | "
                        + "i. Ver inventário | "
                        + "m. Ver mapa]");
                break;
            case 1:
                System.out.println("");
                System.out.println("\t\tVocê está no Vilarejo.\n");
                System.out.println("\t\t\tSUAS OPÇÕES\n");
                System.out.println("[1. Ir para o Castelo | "
                        + "2. Ir para a Taberna | "
                        + "3. Ir para a Floresta | "
                        + "i. Ver inventário | "
                        + "m. Ver mapa]");
                break;
            case 2:
                System.out.println("");
                System.out.println("\t\tVocê está na Taberna.\n");
                System.out.println("\t\t\tSUAS OPÇÕES\n");
                System.out.println("[1. Interagir | "
                        + "2. Ir para o Vilarejo | "
                        + "i. Ver inventário | "
                        + "m. Ver mapa]");
                break;
            case 3:
                System.out.println("");
                System.out.println("\t\tVocê está na Floresta.\n");
                System.out.println("\t\t\tSUAS OPÇÕES\n");
                System.out.println("[1. Ir para o Vilarejo | "
                        + "2. Enfrentar o Biroliro | "
                        + "i. Ver inventário | "
                        + "m. Ver mapa]");
                break;
        }
    }

    public void acao(Mapa mapa, Personagem personagem) throws InterruptedException {
        switch (mapa.getFlag_personagem()) {
            case 0:
                acaoCastelo(mapa, personagem);
                break;

            case 1:
                acaoVilarejo(mapa, personagem);
                break;

            case 2:
                acaoTaberna(mapa, personagem);
                break;

            case 3:
                acaoFloresta(mapa, personagem);
                break;
        }
    }

    // Ações ao estar no castelo
    public void acaoCastelo(Mapa mapa, Personagem personagem) throws InterruptedException {
        String opcao;

        opcao = entrada.next();

        do {
            switch (opcao.charAt(0)) {
                case '1':
                    Historia.castelo1();
                    movimento(mapa);
                    break;

                case '2':
                    mapa.setFlag_personagem(1);
                    movimento(mapa);
                    break;

                case 'm':
                    System.out.println("Você está no Castelo");
                    System.out.println("\tMAPA");
                    System.out.println("[ _ _ _ C _");
                    System.out.println("_ _ _ _ _");
                    System.out.println("_ _ V _ T");
                    System.out.println("_ _ _ _ _");
                    System.out.println("_ _ _ F _ ]");
                    System.out.println("Legenda:\n [C = Castelo | V = Vilarejo | T = Taberna | F = Floresta]");
                    movimento(mapa);
                    break;

                case 'i':
                    int op;

                    personagem.inventario();
                    if (!personagem.getItens().isEmpty()) {
                        System.out.println("Você deseja usar algum item?");
                        System.out.println("[1. Sim | 2. Não]");
                        op = entrada.nextInt();

                        if (op == 1) {
                            System.out.println("Digite o número do item para usá-lo.");
                            try {
                                personagem.usaItem(personagem.getItens().get(entrada.nextInt()), personagem.getAtributos());
                            } catch (Exception e) {
                                System.out.println("Item inválido.");
                            }
                        }
                    }
                    movimento(mapa);
                    break;

                case 'q':
                    Thread.currentThread().interrupt();
                    break;

                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        } while (opcao.charAt(0) != '1' || opcao.charAt(0) != '2' || opcao.charAt(0) != 'm' || opcao.charAt(0) != 'i');
    }

    public void acaoVilarejo(Mapa mapa, Personagem personagem) {
        String opcao;

        opcao = entrada.next();

        do {
            switch (opcao.charAt(0)) {
                case '1':

                    break;

                case '2':

                    break;

                case 'm':
                    break;

                case 'i':
                    break;

                case 'q':
                    Thread.currentThread().interrupt();
                    break;

                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        } while (opcao.charAt(0) != '1' || opcao.charAt(0) != '2' || opcao.charAt(0) != 'm' || opcao.charAt(0) != 'i');
    }

    public void acaoTaberna(Mapa mapa, Personagem personagem) {
        String opcao;

        opcao = entrada.next();

        do {
            switch (opcao.charAt(0)) {
                case '1':

                    break;

                case '2':

                    break;

                case 'm':
                    break;

                case 'i':
                    break;

                case 'q':
                    Thread.currentThread().interrupt();
                    break;

                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        } while (opcao.charAt(0) != '1' || opcao.charAt(0) != '2' || opcao.charAt(0) != 'm' || opcao.charAt(0) != 'i');
    }

    public void acaoFloresta(Mapa mapa, Personagem personagem) {
        String opcao;

        opcao = entrada.next();

        do {
            switch (opcao.charAt(0)) {
                case '1':

                    break;

                case '2':

                    break;

                case 'm':
                    break;

                case 'i':
                    break;

                case 'q':
                    Thread.currentThread().interrupt();
                    break;

                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        } while (opcao.charAt(0) != '1' || opcao.charAt(0) != '2' || opcao.charAt(0) != 'm' || opcao.charAt(0) != 'i');
    }

    public void batalha(Personagem personagem, Chefao chefao) {
        int opcao, resultDadoJ = 0, resultDadoC = 0;

        System.out.println("BATALHA CONTRA O CHEFÃO");
        do {
            System.out.println("0. Rodar o dado");

            opcao = entrada.nextInt();
            do {
                switch (opcao) {
                    case 0:
                        resultDadoJ = Dado.dado();
                        break;
                    default:
                        System.out.println("Você deve rodar o dado.");
                        break;
                }
            } while (opcao != 0);
            resultDadoC = Dado.dado();

            System.out.println(personagem.getNome() + resultDadoJ);
            System.out.println(chefao.getNome() + resultDadoC);

            if (resultDadoJ > resultDadoC) {
                System.out.println(personagem.getNome() + " começa atacando");
            } else if (resultDadoJ < resultDadoC) {
                System.out.println(chefao.getNome() + " começa atacando");
            } else {
                System.out.println("Empate");
            }
        } while (chefao.getAtributos().getVida() > 0F);

    }
}
