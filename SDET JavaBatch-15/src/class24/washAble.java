package class24;

public interface washAble{
    void wash();
}

class SmartWatch implements washAble{


    @Override
    public void wash() {
        System.out.println("You can wash this smartwatch with out any issue");

    }
}
class Phone implements washAble{


    @Override
    public void wash() {
        System.out.println("You can wash this Phone");
    }
}
class Inverter implements washAble{

    @Override
    public void wash() {
        System.out.println("You can wash inverter");

    }
}