import java.util.*;

public class SavingsAccount extends Account{

    private Integer id;
    private byte monthlyWidthdraws;
    
    public SavingsAccount(String account_Type, Double interest_rate, Integer account_num, Integer routing_num, Double balance, Integer id){
        super(account_Type, interest_rate, account_num, routing_num, balance);
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public withdraw(double amount){
        balance-=amount;
    }

    public deposit(double amount){
        balance+=amount;
    }
    
    public transferThroughAccounts(int user_id){

    }

    public recurringPayment(double amount){

    }

    
    public widtihdrawFee()){
        
    }
}