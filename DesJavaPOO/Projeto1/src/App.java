public class App {
    public static void main(String[] args) throws Exception {
        public class Carro{
            String modelo;
            String cor;
            int Velocidade;

            void acelerar(){
                velocidade += 10;

            }

            void frear(){
                velocidade -= 10;
            }

            void mosrtrarDados(){
                System.out.println("Modelo: " + modelo);
                System.out.println("Cor: " + cor);
                System.out.println("Velocidade: " + velocidade);
            }
        }
    }
}
