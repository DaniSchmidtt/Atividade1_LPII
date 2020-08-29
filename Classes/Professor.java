package Classes;

public class Professor extends Humano {

    public Professor(String nome, Humor humor)
    {
        super (nome, humor);
    }

    @Override
    public void Cumprimentar(Humano humano)
    {
        System.out.println(this.getNome() + ": Hallo, " + humano.getNome()+ ", preparado para a aula ?" );
    }

    @Override
    public void ComoVoceEsta(Humano humano)
    {
        System.out.println(this.getNome() + ": Relembrando como vai é você em alemão é Wie geth's, Wie geth's dir " + humano.getNome() + " ?");
    }
    
}