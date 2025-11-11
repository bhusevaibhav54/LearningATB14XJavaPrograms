package ex_23_OOPs_Super_Abstraction.superKeyword;

public class Lab180 {

}

class BaseClass{

    BaseClass(){
        System.out.println("DC-Parent");
    }

    BaseClass(String browser){
        this.browser = browser;
        System.out.println("DC Param-Parent");
    }

    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    void openBrowser(){
        System.out.println("Opening Browser!");
    }

    void openBrowser(String browserName){
        System.out.println("Open Browser-> " +browserName);
    }

    void closeBrowser(){
        System.out.println("Close Browser!");
    }
}

class TestCase extends BaseClass{

    void testC(){

    }

    public TestCase(){
//        super();
        super("Chrome");
        super.openBrowser();
        super.openBrowser("Chrome");
        super.closeBrowser();
        System.out.println(super.getBrowser());
        super.setBrowser("Firefox");
    }

}
