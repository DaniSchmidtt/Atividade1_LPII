package Classes;

public class Aluno extends Humano {

    public Aluno (final String nome, final Humor humor) {
        super(nome, humor);
    }

    @Override
    public void Cumprimentar(final Humano humano)
    {
        System.out.println(this.getNome() + ": Hallo " + humano.getNome() + ", estou pronto para a aula" );
    }


    @Override
    public void Resposta()
    {
        System.out.println(this.getNome() + ": Ich bin " + this.getHumor().getDescricao() + " und du ?");
    }
}