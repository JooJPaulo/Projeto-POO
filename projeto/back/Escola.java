import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Escola {
    public static void main(String[] args) {
        // Create Departmentos
        Departmento mathDepartmento = new Departmento(1, "Mathematics");
        Departmento languageDepartmento = new Departmento(2, "Language Studies");

        // Create Professors
        Professor professor1 = new Professor(1, "John Doe", "PhD in Mathematics", "123 Main St", "555-1234");
        Professor professor2 = new Professor(2, "Jane Smith", "PhD in Linguistics", "456 Elm St", "555-5678");

        // Create Cursos
        Curso Curso1 = new Curso(1, "Mathematics Curso", "MATH101");
        Curso Curso2 = new Curso(2, "Language Curso", "LANG101");

        // Create Disciplinas
        Disciplina Disciplina1 = new Disciplina(1, "Algebra", "ALG101", "Introduction to Algebra");
        Disciplina Disciplina2 = new Disciplina(2, "English Grammar", "ENG101", "Basics of English Grammar");

        // Create Alunos
        Aluno Aluno1 = new Aluno(1, "Alice Johnson", "789 Oak St", "555-9012", "Parent1", new Date());
        Aluno Aluno2 = new Aluno(2, "Bob Brown", "101 Pine St", "555-3456", "Parent2", new Date());

        // Establish relationships
        // Example: Assign professors to Departmentos
        List<Professor> mathProfessors = new ArrayList<>();
        mathProfessors.add(professor1);
        // Add more professors to the Departmento as needed

        List<Professor> languageProfessors = new ArrayList<>();
        languageProfessors.add(professor2);
        // Add more professors to the Departmento as needed

        // Example: Assign Disciplinas to Cursos
        List<Disciplina> mathCursoDisciplinas = new ArrayList<>();
        mathCursoDisciplinas.add(Disciplina1);
        // Add more Disciplinas to the Curso as needed

        List<Disciplina> languageCursoDisciplinas = new ArrayList<>();
        languageCursoDisciplinas.add(Disciplina2);
        // Add more Disciplinas to the Curso as needed

        // Example: Assign Alunos to Cursos
        List<Aluno> mathCursoAlunos = new ArrayList<>();
        mathCursoAlunos.add(Aluno1);
        // Add more Alunos to the Curso as needed

        List<Aluno> languageCursoAlunos = new ArrayList<>();
        languageCursoAlunos.add(Aluno2);
        // Add more Alunos to the Curso as needed

        // Print out some information to verify relationships
        System.out.println("Departmentos:");
        System.out.println(mathDepartmento.getDenominacao());
        System.out.println(languageDepartmento.getDenominacao());

        System.out.println("\nProfessors:");
        for (Professor professor : mathProfessors) {
            System.out.println(professor.getNome() + " - " + professor.getFormacao());
        }
        for (Professor professor : languageProfessors) {
            System.out.println(professor.getNome() + " - " + professor.getFormacao());
        }

        System.out.println("\nCursos:");
        System.out.println(Curso1.getNome() + " - " + Curso1.getSigla());
        System.out.println(Curso2.getNome() + " - " + Curso2.getSigla());

        System.out.println("\nDisciplinas:");
        for (Disciplina Disciplina : mathCursoDisciplinas) {
            System.out.println(Disciplina.getDenominacao() + " - " + Disciplina.getSigla());
        }
        for (Disciplina Disciplina : languageCursoDisciplinas) {
            System.out.println(Disciplina.getDenominacao() + " - " + Disciplina.getSigla());
        }

        System.out.println("\nAlunos:");
        for (Aluno Aluno : mathCursoAlunos) {
            System.out.println(Aluno.getNome() + " - " + Aluno.getEndereco());
        }
        for (Aluno Aluno : languageCursoAlunos) {
            System.out.println(Aluno.getNome() + " - " + Aluno.getEndereco());
        }
    }
}