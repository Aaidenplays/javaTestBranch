import java.text.*;

public class AccountTransfer extends Transfer{
    
    private Integer transfer_id;

    AccountTransfer(){}

    AccountTransfer(Integer user_id, Double amount, Date transfer_date, Integer transfer_id){
        super(user_id, amount,transfer_date);
        this.transfer_id = transfer_id;
    }

    public grabTransferHistory(int payee_id);
    
    public Date grabTransferDate(int payee_id);
    
    public void submitNewRecord(int payee_id);

}
