package programa;

import java.util.Scanner;
import classes.Pessoa;
public class Programa {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   Pessoa pessoa = new Pessoa();

   System.out.println("             :: Bem vindo ao sistema de RH ::");
   System.out.printf("Informe o funcionário: \n 0 - Administrativo \n 1 - Vendedor \nTipo de funcionário: ");
   pessoa.setTipo(sc.nextInt());
   sc.nextLine();
   System.out.print("Nome: ");
   pessoa.setNome(sc.nextLine());
   System.out.print("Matrícula: ");
   pessoa.setMatricula(sc.nextLine());
   System.out.print("Salário bruto: ");
   pessoa.setSalario(sc.nextDouble());



   System.out.printf("\n          ::  Folha de pagamento da empresa Auto Peças SA  :: \n");
   System.out.println("Nome: " + pessoa.getNome());
   System.out.println("Matricula: " + pessoa.getMatricula());
   System.out.println("Salário líquido: " + pessoa.getSalario());

  sc.close();
  }
}