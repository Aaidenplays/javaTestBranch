import java.text.*;

public abstract class Transfer{
    
        protected Integer user_id;
        protected Double amount;
        protected Date transfer_date;

        
        Transfer(){}
        
        Transfer(Integer user_id, Double amount, Date transfer_date){
            this.user_id = user_id;
            this.amount = amount;
            this.transfer_date = transfer_date;
      
        }
    
        public void setUser_id(Integer user_id) {
            this.user_id = user_id;
        }

        public void setAmount(Double amount) {
            this.amount = amount;
        }


        public void setTransfer_date(Date transfer_date) {
            this.transfer_date = transfer_date;
        }


        public Integer getUser_id() {
            return user_id;
        }

        public Double getAmount() {
            return amount;
        }

        public Date getTransfer_date() {
            return transfer_date;
        }

        public abstract void grabTransferHistory(int payee_id);
    
        public abstract void grabTransferDate(int payee_id);
    
        public abstract void submitNewRecord(int payee_id);
    
        
    }