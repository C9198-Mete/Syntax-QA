package homework8;

public class PhoneTest {
    public static void main(String[] args) {

        Phone iphone=new Phone();
        iphone.name="14 pro";
        iphone.color="Grey";
        iphone.capacity=256;
        iphone.price=980;
        iphone.faceId();
        iphone.record();

        System.out.println("*********");

        Phone pixel=new Phone();
        pixel.name="my";
        pixel.color="Black";
        pixel.capacity=516;
        pixel.price=775;
        pixel.faceId();
        pixel.record();

        System.out.println("*********");

        Phone samsung=new Phone();
        samsung.name="Boo";
        samsung.color="White";
        samsung.capacity=64;
        samsung.price=700;
        samsung.faceId();
        samsung.record();
    }
}
