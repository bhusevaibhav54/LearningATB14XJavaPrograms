package ex_25_ENUM;

public class Lab200_ENUM_REAL_WEB_Automation {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocators());
    }
}


enum Locators{
    page_input_email("xpath1"),
    page_input_password("xpath2"),
    page_input_submit("xpath1");

    private String locators;

    Locators(String locators){
        this.locators=locators;
    }

    public String getLocators() {
        return this.locators;
    }
}
