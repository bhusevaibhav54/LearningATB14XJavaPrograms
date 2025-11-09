package ex_20_OOPs_PolyMorphism.methodoverriding;

public class Lab190_Methodoverriding_Automation {
    public static void main(String[] args) {
        FireFoxTC f1 = new FireFoxTC();
        f1.openBrowser();

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();

        CommonToAll c2 = new chromeTC();
        c2.openBrowser();

    }
}


class CommonToAll{
    void openBrowser(){
        System.out.println("Starting with IE Browser");
    }
}

class chromeTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting Chrome, Better Browser!");
    }
}

class FireFoxTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting FireFox, Better Browser!");
    }
}