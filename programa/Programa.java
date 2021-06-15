package programa;

import java.util.Scanner;

public class Programa {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcao;

    do {
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Incluir pessoa");
      System.out.println("2 - Listar todos os cadastrados");
      System.out.print("Opção: ");

      opcao = sc.nextInt();
      sc.nextLine(); // Limpa o ENTER que fica na entrada  

      switch (opcao) {
        case 0:
          System.out.println("Fim do programa!");
          break;
        case 1:

          break;
        case 2:

          break;
        default:
          System.out.println("Opção inválida! :(");
          break;
      }
    } while (opcao != 0);

    sc.close();
  }
}