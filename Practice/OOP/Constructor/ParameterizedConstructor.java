package OOP.Constructor;

class BankAccount{
    long accountNUmber;
    String IFSCCode;
    String branch;

    public BankAccount(){
        this.IFSCCode="";
        this.accountNUmber = 0;
        this.branch = "";
    }

    //Parameterized Constructor
    public BankAccount(long accountNUmber,String IFSCCode,String branch){
        this.IFSCCode = IFSCCode;
        this.accountNUmber = accountNUmber;
        this.branch = branch;
    }

    public void setAccountNUmber(long accountNUmber) {
        this.accountNUmber = accountNUmber;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setIFSCCode(String IFSCCode) {
        this.IFSCCode = IFSCCode;
    }

    public void getAccountDetails(){
        System.out.println("Account Details : ");
        System.out.println("1. Account Number : "+accountNUmber);
        System.out.println("2. IFSC Code : "+IFSCCode);
        System.out.println("3. Branch : "+branch);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        BankAccount ba2 = new BankAccount(1234567899,"SBI00002123","Pune");

        ba.getAccountDetails();
        ba2.getAccountDetails();
    }
}
