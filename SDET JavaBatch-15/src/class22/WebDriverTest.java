package class22;

public class WebDriverTest {
    public static void main(String[] args) {
        WebDriver webDriver=new Chrome();

        webDriver.startBrowser();
        webDriver.openUrl();
        webDriver.testLoginPage();
        webDriver.closeBrowser();

        System.out.println("***********");

        /*Chrome chrome=new Chrome();
        Safari safari=new Safari();
        Firefox firefox=new Firefox();
        WebDriver [] browsers={chrome,safari,firefox};*/

        WebDriver [] browsers={new Chrome(),new Safari(),new Firefox()};

        for (WebDriver browser:browsers) {
            browser.startBrowser();
            browser.openUrl();
            browser.testLoginPage();
            browser.closeBrowser();
        }


    }
}
