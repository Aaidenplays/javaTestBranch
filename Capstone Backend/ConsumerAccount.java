public class ConsumerAccount extends User{

    private Integer user_id;

    ConsumerAccount(){};

    ConsumerAccount(String first_name, String last_name, String email, String phone, String password, Double balance, Integer user_id){
        super(first_name, last_name, email, phone, password, balance);
        this.user_id = user_id;
    }

    public void createNewAccount();

    public void editAccountDetails();
}
