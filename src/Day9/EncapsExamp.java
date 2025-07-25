package Day9;

public class EncapsExamp {
    public static void main(String[] args) {


        BankAccount ba = new BankAccount();
        ba.setAccNo("43425687");
        ba.setBalance(45000.344234);
        ba.setBalance(100.123);

        System.out.println("Account number is: "+ ba.getAccNo());
        System.out.println("Balance amount is : "+ba.getBalance());
    }
}
class BankAccount{
    private String AccNo;
    private double Balance;
    public String getAccNo(){
        return AccNo;
    }
    public void setAccNo(String NewAccNo){
        AccNo = NewAccNo;
    }
    public double getBalance(){
        return Balance;
    }
    public void setBalance(double NewBalance){
        if(NewBalance < 0){
            System.out.println("Invalid Balance");
        }
        else{
            Balance += NewBalance;
        }
    }
}
