package ex_27_Exception;

public class Lab221_CustomException {
    public static void main(String[] args) throws CustomException {
        Bank sbi=new Bank("INR",100);
        Bank icici=new Bank("INR",123);
        Integer total_Bal = sbi.add(icici);
        System.out.println(total_Bal);

        Bank jp_chase = new Bank("USD",101);
        Integer total_bal_all_cur = sbi.add(jp_chase);
        System.out.println(total_bal_all_cur);
    }
}

class Bank{
    private String  currency;
    private Integer amount;

    public Bank(String currency,Integer amount){
        this.currency=currency;
        this.amount=amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws CustomException {
        if (bankName.currency.equalsIgnoreCase("INR")){
            return bankName.amount + this.amount;
        }else {
            try {
                throw new CustomException("Currency Missmatch");
            }catch (CustomException e){
                throw new RuntimeException(e);
            }
        }

    }
}

class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}