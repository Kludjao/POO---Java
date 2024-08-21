public class PersonagemMagico {

    String nome;

    int nivelEnergia;

    String poderMagico;

    HabilidadeEspecial habilidadeEspecial;


    public PersonagemMagico(){
    }

    public PersonagemMagico(String nome, int nivelEnergia, String poderMagico) {
        this.nome = nome;
        this.nivelEnergia = nivelEnergia;
        this.poderMagico = poderMagico;
    }

    public PersonagemMagico(String nome){
        this.nome = nome;
    }

}
