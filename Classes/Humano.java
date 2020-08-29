
package Classes;

abstract class Humano {

    private String nome;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    private Humor humor;

    public Humor getHumor()
    {
        return humor;
    }

    public void setHumor(Humor humor)
    {
        this.humor = humor;
    }

    public Humano (String nome, Humor humor)
    {
        this.setNome(nome);
        this.setHumor(humor);
    }

    public void Cumprimentar(Humano humano)
    {
        System.out.println(this.getNome()+ "Hallo " + humano.getNome()+ "!");
    }

    public void ComoVoceEsta(Humano humano)
    {
        System.out.println(this.getNome() + ": Wie geth's ?");
    }

    public void Resposta()
    {
        System.out.println(this.getNome() + ": Ich bin " + this.getHumor().getDescricao());
    }
    

}

