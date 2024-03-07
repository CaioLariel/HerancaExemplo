
package heranca;


public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        
        a1.nome = "Caio Gabriel";
        a1.rg = "36.456.789-x";
        a1.cpf = "456.123.789-89";
        a1.registraAluno = 987987987;
        a1.notaVestibular = 7.5f;
        a1.curso = "Bacharelado e Artes Marciais";
        a1.dataMatricula = "02/02/2022";
        
        p1.nome = "Caio Gabriel";
        p1.rg = "36.456.789-x";
        p1.cpf = "456.123.789-89";
        p1.matriculaProfessor = 300468;
        p1.dataAdmissao = "10/10/2019";
        p1.salarioHorista = 70.99;
    }
}
