/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema. */
import java.util.Scanner;
import entitidade.estudante;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        estudante aluno = new estudante();

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Informe a primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Informe a segunda nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Informe a terceira nota: ");

        aluno.nota3 = sc.nextDouble();
        aluno.notaFinal();
        aluno.aprovado();
        System.out.println("A nota final do aluno é: " + aluno.notaFinal);
        System.out.println("O aluno está: " + aluno.aprovado);
    }
}
