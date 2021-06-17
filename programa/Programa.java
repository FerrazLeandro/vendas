package programa;

/*
Faça um programa para uma loja de venda de auto peças. Na loja há os funcionários administrativos e os vendedores.
Todos possuem nome, matrícula e salário. Os vendedores possuem, além dessas características, um valor que é 
atualizado mensalmente indicando o montante vendido por ele no período. O cálculo do salário mensal de cada 
funcionário é  o seu salário mensal - 11%. O dos vendedores é essa mesma fórmula, acrescida da comissão, que é 
de 5% sobre todo o valor vendido no período de cálculo. O patrão é um cara legal e dá a comissão integral, 
sem impostos. Faça o modelo de classes correspondente e também um programa para demonstrar seu funcionamento.
*/

import java.util.Scanner;
import classes.Pessoa;
import classes.Vendedor;
public class Programa {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   Pessoa pessoa = new Pessoa();
   Vendedor vendedor = new Vendedor(); 

   System.out.println("             :: Bem vindo ao sistema de RH ::");
   System.out.printf("Informe o funcionário: \n 0 - Administrativo \n 1 - Vendedor \nTipo de funcionário: ");
   pessoa.setTipo(sc.nextInt());
   sc.nextLine();
   System.out.print("Nome: ");
   pessoa.setNome(sc.nextLine());
   System.out.print("Matrícula: ");
   pessoa.setMatricula(sc.nextLine());
   System.out.print("Salário: ");
   pessoa.setSalario(sc.nextDouble());

   if (pessoa.getTipo() == 1){
    System.out.print("Comissão: ");
    vendedor.setComissao(sc.nextDouble());
   }



   System.out.printf("\n          ::  Folha de pagamento da empresa Auto Peças SA  :: \n");
   System.out.println("Nome: " + pessoa.getNome());
   System.out.println("Matricula: " + pessoa.getMatricula());
   System.out.println("Salário líquido: " + (pessoa.getSalario() + vendedor.getComissao()));
   

  sc.close();
  }
}