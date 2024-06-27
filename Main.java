import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        double valor;


        String menu = """        
                    |-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*|
                    | BEM-VINDO AO CONVERSOR DE MOEDAS ONE
                    | OPÇÕES DE MOEDAS:
                    | 1] DOLAR -> REAL
                    | 2] REAL -> DOLAR
                    | 3] PESO MEXICANO -> REAL"
                    | 4] REAL -> PESO MEXICANO"
                    | 5] REAL -> EURO"
                    | 6] SAIR;
                    |-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
                    | ESCOLHA UMA OPÇÃO:
                """;

        Scanner leitura = new Scanner(System.in);
        MoedaConverter moedaConverter = new MoedaConverter();

        while (opcao != 6) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("Qual é a quantidade que deseja convertir: ");
                valor = leitura.nextDouble();
                MoedaConvercao usdBrl = moedaConverter.buscaMoeda("USD", "BRL", valor);
                System.out.println(valor + "dolares convertido a real é: " + usdBrl.conversion_result());
            } else if (opcao == 2) {
                System.out.println("Qual é a quantidade que deseja convertir: ");
                valor = leitura.nextDouble();
                MoedaConvercao brlUsd = moedaConverter.buscaMoeda("BRL", "USD", valor);
                System.out.println(valor + "reais convertido a dolares é: " + brlUsd.conversion_result());
            } else if (opcao == 3) {
                System.out.println("Qual é a quantidade que deseja convertir: ");
                valor = leitura.nextDouble();
                MoedaConvercao mxnBrl = moedaConverter.buscaMoeda("MXN", "BRL", valor);
                System.out.println(valor + "pesos mexicanos convertido a reais é: " + mxnBrl.conversion_result());
            } else if (opcao == 4) {
                System.out.println("Qual é a quantidade que deseja convertir: ");
                valor = leitura.nextDouble();
                MoedaConvercao brlMxn = moedaConverter.buscaMoeda("BRL", "MXN", valor);
                System.out.println(valor + "reais convertido a pesos mexicanos é: " + brlMxn.conversion_result());
            } else if (opcao == 5) {
                System.out.println("Qual é a quantidade que deseja convertir: ");
                valor = leitura.nextDouble();
                MoedaConvercao brlEur = moedaConverter.buscaMoeda("BRL", "EUR", valor);
                System.out.println(valor + "reais convertido a euro é: " + brlEur.conversion_result());
            }else if (opcao != 6) {
                System.out.println("Opção invalida, digite uma opção correta.");
            }

            }


        }



    }