
package Classes;

public enum Humor {

    ANIMADO("animado"),

    TRISTE("triste"),

    FELIZ("feliz"),

    AUFGEMUNTERT("aufgemuntert"),

    TRAURIG("traurig"),

    GLUCKLICH("glücklich");

    private String descricao;
    
    Humor(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao() 
    {
        return descricao;
    }

}
