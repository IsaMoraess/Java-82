package entitidade;

public class estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public String notaFinal;
    public String aprovado;

    public double notaFinal(){
        return (nota1 + nota2 + nota3) / 3;
    }
    public boolean aprovado(){
        return notaFinal() >= 60;
    }
    public boolean reprovado(){
        return notaFinal() < 60;
    }
    
}
