public class Cachorro{
    String nome = "Pimpão";

    public void latir(){
        System.out.println("O cachorro está latindo au au");
    }
}

public class Ativiade3{
    public static void main(String[] args){
        
        Cachorro c1 = new Cachorro();
        
        c1.latir();
        System.out.println("O nome: " + c1.nome);
        
    }
}