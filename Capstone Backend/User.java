public abstract class User{
    
    protected String first_name;
    protected String last_name;
    protected String email;
    protected String phone;
    protected String password;
    protected Double balance;
    
    User(){}
    
    User(String first_name, String last_name, String email, String phone, String password, Double balance){
        
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.balance = balance;
        
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }
    
    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public Double getBalance() {
        return balance;
    }
    
    public abstract void createNewAccount();
}