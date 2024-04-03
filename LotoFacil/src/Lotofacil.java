import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
public class Lotofacil {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
         int opcoesMenu;


         System.out.println("*****************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A á Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("*****************");
            System.out.print("Escolha uma opção: ");
            
       do {
                opcoesMenu = scanner.nextInt();

                    switch (opcoesMenu) {
                
                case 1:
                    System.out.println("*******************");
                    System.out.println("Jogo escolhido:");
                    System.out.println("Apostar de 0 a 100");
                    System.out.println("*******************");
                    Scanner meuNumero = new Scanner(System.in);
                        System.out.println("Digite o seu número de aposta: ");
                        int numeroInformado = meuNumero.nextInt();
                        if (numeroInformado < 0 || numeroInformado > 100) {
                            System.out.println("Aposta inválida. O número deve estar entre 0 e 100!");
                            System.out.println("Digite 0 para sair ou 1 para jogar novamente.");
                            }else {
                                Random gerador = new Random();
                                int numeroSorteado = gerador.nextInt(100);
                                System.out.println("O seu número digitado foi: " + numeroInformado);
                                System.out.println("O número sorteado é: " + numeroSorteado);
                                    if (numeroInformado == numeroSorteado) {
                                        System.out.println("Parabéns! Você acertou e ganhou R$1.000,00");
                                    }else {
                                        System.out.println("Que pena! Você errou!");
                                    }
                                System.out.println("Digite 0 para sair.");
                            }
                    break;
                
                case 2:
                    System.out.println("*******************");
                    System.out.println("Jogo escolhido:");
                    System.out.println("Apostar de A á Z");
                    System.out.println("*******************");
                    System.out.println("Digite uma letra de A á Z: ");   
                    char letraPremiada = 'G';
                    try {
                        int codigoAscii = System.in.read();
                        char letraAposta = Character.toUpperCase((char) codigoAscii);
                        System.out.println("A letra apostada foi:" + " " + letraAposta);
                        if (Character.isLetter(letraAposta)) {
                            if (letraAposta == letraPremiada) {
                                System.out.println("Você ganhou R$ 500,00 reais.");
                            }else {
                                System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
                            }
                        }else {
                            System.out.println("Aposta inválida. Digite uma letra de A a Z.");
                        }
                    } catch (IOException e) {
                        System.out.println("Erro ao ler a entrada.");
                        e.printStackTrace();
                    }
                    
                break;
                
                case 3:
                    System.out.println("*******************");
                    System.out.println("Jogo escolhido:");
                    System.out.println("Apostar em par ou ímpar");
                    System.out.println("*******************");
                    Scanner parOuImpar = new Scanner(System.in);
                    System.out.println("Digite um número: ");
                    int nParOuImpar = parOuImpar.nextInt();
                    if (nParOuImpar % 2 == 0) {
                        System.out.println("O número " + nParOuImpar + " é par.");
                        System.out.println("Parabéns. Você ganhou R$100,00");
                        }else {
                            System.out.println("O número " + nParOuImpar + " é ímpar.");
                            System.out.println("Que pena, você perdeu. A premiação era apenas para números pares.");
                            System.out.println("Digite 0 para sair.");
                        }


                    break;
                case 0:
                    System.out.println("Saindo...Obrigado por jogar!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

       } while (opcoesMenu != 0);

    }
    
}
