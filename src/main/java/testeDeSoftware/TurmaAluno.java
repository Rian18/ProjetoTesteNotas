package testeDeSoftware;

/**
 *
 * @author Rian Alves
 */
public class TurmaAluno {
    private String turma;
    private String professor;
    private String nomeAluno;
    private String notaFinal;

    
    public TurmaAluno(String turma, String professor, String nomeAluno, String notaFinal) {
        this.turma = turma;
        this.professor = professor;
        this.nomeAluno = nomeAluno;
        this.notaFinal = notaFinal;
    }

    
    public String getTurma() {
        return turma;
    }

    
    public void setTurma(String turma) {
        this.turma = turma;
    }

    
    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNotaFinal() {
        return notaFinal;
    }

   
    public void setNotaFinal(String notaFinal) {
        this.notaFinal = notaFinal;
    }
}
