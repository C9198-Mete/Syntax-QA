package homework14;

public class Task2 {
    public static void main(String[] args) {
        Computer [] computers={new Apple(),new HP()};
        for (Computer c:computers) {
            c.playVideo();
            c.browserInternet();

            if (c instanceof Apple){
                Apple apple=(Apple) c;
                apple.installApp();
                apple.editVideos();
            }



        }

    }



}

class Computer{

    int RAM;
    int storage;
    String OS;

    void playVideo(){
        System.out.println("Video is playing");
    }
    void browserInternet(){
        System.out.println("Browse the internet");
    }

}
class Apple extends Computer{
    @Override
    void playVideo() {
        System.out.println("Playing the video on quick time player");
    }

    @Override
    void browserInternet() {
        System.out.println("Browsing the internet using Safari");
    }

    void editVideos(){
        System.out.println("Editing on IMovies");
    }
    void  installApp(){
        System.out.println("Installing apps from App Store");
    }
}
class HP extends Computer{

    @Override
    void browserInternet() {
        System.out.println("Browsing using chrome");
    }

    @Override
    void playVideo() {
        System.out.println("Playing the video using VLC player");
    }
}