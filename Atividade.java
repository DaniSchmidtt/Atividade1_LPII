import Classes.*;

public class Atividade {
    public static void main(String[] args)
     {
        
        Aluno zezinho = new Aluno("Zezinho", Humor.GLUCKLICH);
        Professor maria = new Professor("Maria", Humor.AUFGEMUNTERT);

        maria.Apresentacao();
        maria.Cumprimentar(zezinho);
        zezinho.Cumprimentar(maria);
        maria.ComoVoceEsta(zezinho);
        zezinho.Resposta();
        maria.Resposta();
        maria.Despedida(zezinho);
        zezinho.Despedida(maria);
    }
}