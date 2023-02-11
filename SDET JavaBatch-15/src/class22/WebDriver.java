package class22;

public class WebDriver {

    public void startBrowser(){
        System.out.println("starting the browser");
    }
    public void openUrl(){
        System.out.println("opening a url");
    }
    public void testLoginPage(){
        System.out.println("test login page");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }

}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openUrl() {
        System.out.println("Opening the url in Google chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Chrome");
    }
}

class Safari extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Starting the Safari");
    }

    @Override
    public void openUrl() {
        System.out.println("Opening the url in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }
}

class Firefox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Firefox");
    }

    @Override
    public void openUrl() {
        System.out.println("Opening the url in Firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Firefox");
    }
}
