//CARCAÇA
import java.util.Scanner;
public class main {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
//BASE
System.out.print("Digite o seu nome");
String nome = entrada.nextLine();
System.out.print("Digite sua idade");
int idade = entrada.nextInt();

System.out.print("Digite sua cidade");
entrada.nextLine();

String cidade = entrada.nextLine();
System.out.println("\n--- Cadastro Realizado ---");
System.out.println("Nome: " + nome);
System.out.println("Idade: " + idade + " anos");
System.out.println("Cidade: " + cidade);
entrada.close();
}
}
