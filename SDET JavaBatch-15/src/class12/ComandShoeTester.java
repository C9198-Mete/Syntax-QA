package class12;

public class ComandShoeTester {
    public static void main(String[] args) {
        Computer lenova=new Computer();
        lenova.name="Lenova";
        lenova.capacity=2;
        lenova.model="T430";
        lenova.game();
        lenova.game();

        System.out.println("********");

        Shoes adidas=new Shoes();
        adidas.model="F450";
        adidas.price=235;
        adidas.name="Predator";
        adidas.climbing();
        adidas.running();


    }
}
