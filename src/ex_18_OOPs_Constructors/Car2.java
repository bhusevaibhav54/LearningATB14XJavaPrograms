package ex_18_OOPs_Constructors;

public class Car2 {

    String model;
    int year;

    Car2(){
        model="XXX";
        year = 1990;
        System.out.println("DC");
    }

    Car2(String model_name, int year_created){
        this("i10");
        this.model= model_name;
        this.year=year_created;
//        model="XXX";
//        year = 1990;
//        System.out.println("DC");
    }

    Car2(String model_name){
        this("Swift",1998);
        this.model=model_name;
    }
}
