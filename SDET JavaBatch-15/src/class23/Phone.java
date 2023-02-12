package class23;

public abstract class Phone {
    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void sendText();
}
class Iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Use IPhotos");

    }

    @Override
    void unlockPhone() {
        System.out.println("Use FaceID");

    }

    @Override
    void sendText() {
        System.out.println("Use IMessage");

    }
}
class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Use Gallery");

    }
    @Override
    void unlockPhone() {
        System.out.println("Use Fingerprint");

    }

    @Override
    void sendText() {
        System.out.println("Use the simple message");

    }
}