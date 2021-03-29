import java.util.*;

class SavingsAccount implements Comparable<SavingsAccount>{
    int accBalance;
    int acc_id;
    String accountHolderName;
    boolean isSalaryAccount;
    
    SavingsAccount(int accBalance, int acc_id, String accountHolderName, boolean isSalaryAccount) {
        this.accBalance=accBalance;
        this.acc_id=acc_id;
        this.accountHolderName=accountHolderName;
        this.isSalaryAccount=isSalaryAccount;
    }
    
    public int getAcc_balance() {
        return accBalance;
    }
    
    public void setAcc_balance(int accBalance) {
        this.accBalance = accBalance;
    }
    
    public int getAcc_id() {
        return acc_id;
    }
    
    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public void setAccountholdername(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    
    public boolean issalaryAccount() {
        return isSalaryAccount;
    }
    
    public void setIssalaryAccount(boolean isSalaryAccount) {
        this.isSalaryAccount = isSalaryAccount;
    }
 
    public int compareTo(SavingsAccount s) {  
        if(acc_id>s.acc_id) {  
            return 1;  
        }else if(acc_id<s.acc_id) {  
            return -1;  
        }else{ 
            return 0;
        }  
    
}
}
/**
 * Driver Class
 */
public class CF9 { 
    public static void main(String[] args) {
        TreeSet<SavingsAccount> savings= new TreeSet<>();
        
        savings.add(new SavingsAccount(2000, 101, "Aditi", true));
        savings.add(new SavingsAccount(500, 125, "Anusha", true));
        savings.add(new SavingsAccount(1000, 204, "Aishwarya", true));
  
        for(SavingsAccount sa:savings) {
            System.out.println(sa.accBalance+" "+sa.acc_id+" "+sa.accountHolderName+" "+sa.isSalaryAccount);
        }
 
    }
    
}