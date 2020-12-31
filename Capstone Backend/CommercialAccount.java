public class CommercialAccount extends User{

    private Integer commercial_id;

    CommercialAccount(){};

    CommercialAccount(String first_name, String last_name, String email, String phone, String password, Double balance, Integer commercial_id){
        super(first_name, last_name, email, phone, password, balance);
        this.commercial_id = commercial_id;
    }

    public void createNewAccount();

    public void editAccountDetails();
}
