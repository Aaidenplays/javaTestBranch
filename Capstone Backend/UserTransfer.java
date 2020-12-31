import java.text.*;

public class UserTransfer extends Transfer{
    
    private Integer transfer_id;
    private String  receiver_id;

    UserTransfer(){}

    UserTransfer(Integer user_id, Double amount, Date transfer_date, Integer transfer_id, String  receiver_id){
        super(user_id, amount,transfer_date);
        this.transfer_id = transfer_id;
        this.receiver_id = receiver_id;
    }

    public grabTransferHistory(int payee_id);
    
    public Date grabTransferDate(int payee_id);
    
    public void submitNewRecord(int payee_id);

}
