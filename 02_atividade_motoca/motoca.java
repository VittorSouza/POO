package AtividadeMotoca;

class Pessoa {
    String nome;
    int idade;
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

public class Motoca {
    Pessoa pessoa;
    int potencia;
    int tempo;

    public Motoca( int potencia,int tempo, Pessoa pessoa ){
        this.pessoa = pessoa;
        this.potencia = potencia;
        this.tempo = tempo;
    }

    void embarcar(Pessoa pessoa) {
        if(this.pessoa == null) {
            this.pessoa=pessoa;
            this.tempo=0;
        }
        else
            System.out.println("Ja tem gente na motoca");
    }

    void desembarcar() {
        if(this.pessoa != null)
            this.pessoa = null;
        else
            System.out.println("Nao tem ninguem na moto");
    }

    void dirigir( int tempo ){
        if(this.pessoa == null)
            System.out.println("Nao tem ninguem na moto");
        else if(this.pessoa.idade < 2)
            System.out.println("Muito pequeno pra andar de moto");
        else if(this.pessoa.idade > 10)
            System.out.println("Muito grande pra andar de moto");
        else
        if(this.potencia == 1)
            System.out.println(this.pessoa.nome + ": Run");
        else if(this.potencia == 2)
            System.out.println(this.pessoa.nome + ": RunRun");
        else if(this.potencia == 3)
            System.out.println(this.pessoa.nome + ": RunRunRun");
        this.tempo = tempo;
        if(this.tempo == 0){
            System.out.println("acabou o tempo, pague mais dinheiro");
        }
        this.tempo = this.tempo - tempo;
    }
    void pagar ( int dinheiro ){
        this.tempo = this.tempo + dinheiro;
    }

    public static void main(String[] args) {
        Pessoa davi = new Pessoa("Davi", 10);
        {
            Motoca moto = new Motoca(1, 0, null);
            moto.embarcar(davi);
            moto.dirigir(10);
            moto.desembarcar();
        }
        Motoca moto2 = new Motoca(2, 20, null);
        moto2.embarcar(davi);
        moto2.dirigir(10);
        moto2.desembarcar();

        System.out.println(davi.nome);
    }
}