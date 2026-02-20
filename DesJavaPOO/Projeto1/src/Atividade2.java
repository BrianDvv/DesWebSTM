public class Ativiade2{

    public static void main(String[] args){

        Aluno a1 = new Aluno("Brian",8.0,6.0);

        al.mostrarDados();

        a1.setNota1(11);
        a1.setNota2(9);

        System.out.println("\nApós alterações");
        a1.mostrarDados();

        // Encapsulamento
        class Aluno{
            private String nome;
            private double nota1;
            private double nota2;
        }

        //Construtor
        public Aluno(String nome, double nota1, double nota2 ){
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
        }

        public void setNota1(double nota1){
            if(nota1 >= 0 && nota1 <=10){
                this.nota1 = nota1;
            }
            else{
                System.out.println("Nota 1 inválida!");
            }
        }

        // setNota2
        public void setNota2(double nota2){
            if(nota2 >= 0 && nota2 <= 10){
                this.nota2 = nota2;
            }
            else{
                System.out.println("Nota 2 inválida!");
            }
        }

        //Metodo para calcular a média
        public double calcularMedia(){
            return(nota1 + nota2)/2;
        }

        //metodo verificações
        public void verificarAprovacao(){
            double media = calcularMedia();

            //Verificação da situação do aluno
            if(media >= 7){
                System.out.println("Situação: Aprovado");
            }
            else{
                System.out.println("Situação: Reprovado");
            }
        }

        // chamando os metodos
        public void mostrarDados(){
        System.out.println("Nome:" +nome);
        System.out.println("Nota 1: " + nota1);  
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + calcularMedia());
        verificarAprovacao();


        }
    }
}