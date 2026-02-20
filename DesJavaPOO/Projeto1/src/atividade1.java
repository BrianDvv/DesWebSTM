public class Principal{
    public static void mian(String[] args){

        Pessoa p1 = new Pessoa();

        p1.nome = "Carlos";
        p1.idade = "25";

        p1.apresentar();

        Pessoa p2 = new Pessoa();

        p2.nome = "Maria";
        p2.idade = 30;

        p2.apresentar();

        class Pessoa{
            
            String nome;
            int idade;

            void apresentar(){

                System.out.printlm("--------------------------------");
                System.out.printlm("Nome: " + nome);
                System.out.printlm("Idade: " idade);
            }
        }
    }
}