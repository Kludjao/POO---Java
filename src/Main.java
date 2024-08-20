public class Main {

    public static void main(String[] args) {

        //Criando um objeto do tipo Personagem Mágico
        PersonagemMagico mago = new PersonagemMagico("Gadalf", 100, "Magia");

        //Atribuindo valores aos atributos do objeto
//        mago.nome = "Gandalf";
//        mago.nivelEnergia = 100;
//        mago.poderMagico = "Magia";

        //Exibindo valores dos atributos do objeto
        System.out.println(mago.nome + " Energia: " + mago.nivelEnergia + " Poder: " + mago.poderMagico);

        PersonagemMagico elfo = new PersonagemMagico("Legolas", 50, "Arqueira");
//        elfo.nome = "Legolas";
//        elfo.nivelEnergia = 50;
//        elfo.poderMagico = "Arqueira";
        System.out.println(elfo.nome + " Energia: " + elfo.nivelEnergia + " Poder: " + elfo.poderMagico);


        PersonagemMagico cavaleiro = new PersonagemMagico("Cavaleiro Branco");

        System.out.println(cavaleiro.nome);
    }

}