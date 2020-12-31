public abstract class Account{
    
    protected String account_Type;
    protected Double interest_rate;
    protected Integer account_num;
    protected Integer routing_num;
    protected Double balance;
    
    Account(){}
    
    Account(String account_Type, Double interest_rate, Integer account_num, Integer routing_num, Double balance){
        this.account_Type = account_Type;
        this.interest_rate = interest_rate;
        this.account_num = account_num;
        this.routing_num = routing_num;
        this.balance = balance;
    }

    public void setAccount_Type(String account_Type) {
        this.account_Type = account_Type;
    }

    public void setInterest_rate(Double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public void setAccount_num(Integer account_num) {
        this.account_num = account_num;
    }

    public void setRouting_num(Integer routing_num) {
        this.routing_num = routing_num;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccount_Type() {
        return account_Type;
    }

    public Double getInterest_rate() {
        return interest_rate;
    }

    public Integer getAccount_num() {
        return account_num;
    }

    public Integer getRouting_num() {
        return routing_num;
    }

    public Double getBalance() {
        return balance;
    }
    
    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    public abstract void transferThroughAccounts(int user_id);

    public abstract void recurringPayment(double amount);
    
}