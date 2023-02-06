package class19;

public class SportTest {
    public static void main(String[] args) {
        Cricket crick=new Cricket("Cricket","Pakistan","Green helmet");
        crick.display();
        Soccer soc=new Soccer("Soccer","England","Liverpool",11);
        soc.display();
        soc.displayTeam();
    }
}
