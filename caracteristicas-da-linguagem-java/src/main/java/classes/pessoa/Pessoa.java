package classes.pessoa;

public class Pessoa {

    private Integer idade;
    private Float peso;

   /* public Pessoa(final Integer idade) {
        this.idade = idade;
    } */

    public Pessoa(final Integer idade, final Float peso) {
        this.idade = idade;
        this.peso = peso;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public Float getPeso() {
        return this.peso;
    }

    protected String relatorio() {
        return "Idade : " + idade +" e Peso: "+ peso;
    }
    public String relatorioPublico() {
        return "Idade : " + idade +" e Peso: "+ peso;
    }
}
