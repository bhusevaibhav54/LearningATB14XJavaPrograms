package ex_25_ENUM;

public class Lab199_ENUM_P3 {
    public static void main(String[] args) {
        System.out.println(HEX_COLORs.RED.getHexCode());
    }
}

enum HEX_COLORs{
    RED("a"),
    GREEN("b"),
    YELLOW("c");

    private String hexCode;

    HEX_COLORs(String hexCode){
        this.hexCode=hexCode;
    }

    public String getHexCode() {
        return this.hexCode;
    }
}