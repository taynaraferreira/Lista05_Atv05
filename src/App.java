import java.util.Scanner;

public class App {

    // Faça um programa com uma função chamada somaImposto. A função possui dois parâmetros formais: 
    // taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e custo, que é o custo de um item antes do imposto. 
    // A função “altera” o valor de custo para incluir o imposto sobre vendas.
    public static void main(String[] args) throws Exception {
        Scanner teclado =new Scanner(System.in);
        System.out.print("Informe o valor do produto: ");
        double produto=teclado.nextDouble();
        System.out.print("Informe a taxa de imposto: ");
        double taxa=teclado.nextDouble();
        teclado.close();
        double totalComImposto=somaImposto(taxa, produto);
        System.out.print("Valor do produto sem imposto: R$"+produto+"Taxa de imposto aplicada: "+taxa+" % Valor total de imposto: R$"+(totalComImposto-produto)+"\nValor com imposto: R$"+totalComImposto);
    }

    static double somaImposto(double taxaImposto, double custo){
        double total=custo+((custo*taxaImposto)/100);
        return total;
    }

}
