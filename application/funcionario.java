package application;

public class funcionario {
    private String departamento;
    private int salario;
    public funcionario (String nomeFuncionario, String departamento, int salario, int dataDeAdimicao){
        this.departamento = departamento;
        this.salario = salario;
    }

    public funcionario(String nomeFuncionario2) {
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    

}
//get e set