public class Main{
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mimi");
        Caramelo caramelo = new Caramelo("Caramelo");

        System.out.println("O cachorro se chama: " + cachorro.getNome());
        cachorro.latir();
        cachorro.comer();
        cachorro.dormir();
        
        System.out.println("O cachorro Caramelo se chama: " + caramelo.getNome());
        caramelo.latir();
        caramelo.comer();
        caramelo.dormir();

        System.out.println("O gato se chama: " + gato.getNome());
        gato.miar();
        gato.comer();
        gato.dormir();
    }
}