package Polymorphism;
class SavingsAccount{
    float interest;
    float fixedDeposit;

    //constructor
    SavingsAccount(float interest, float fixedDeposit){
        this.interest=interest;
        this.fixedDeposit =fixedDeposit;
    }
    //
    float calculateInterest(){
        System.out.println("calculating interest from Saving Account");
        return (fixedDeposit *interest/100);
    }
}

public class SeniorAccount extends SavingsAccount {

    float seniorInterest;

    SeniorAccount(float seniorInterest,float interest, float fixedDeposit){
        super(interest,fixedDeposit);
        this.seniorInterest=seniorInterest;
    }
    @Override
    float calculateInterest(){
        System.out.println("calculating interest from Senior Account");
        return super.calculateInterest()+this.fixedDeposit *seniorInterest/100;
    }

    public static void main(String [] args){
        SavingsAccount saving = new SavingsAccount(10,10000);
        SeniorAccount senior = new SeniorAccount(1,10,10000);
        System.out.println("Saving Interest::"+saving.calculateInterest());
        System.out.println("Senior Interest >>>:"+senior.calculateInterest());


    }
}
