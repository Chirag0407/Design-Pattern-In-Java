package Chain_Of_Responsiblity;

public class Directer extends LoanApprover{
    @Override
    void ApproveRequest(Loan l) {
        if(l.getAmount()<1000000){
            System.out.println("Loan Approved By Directer");
        }
        else{
            nextApprover.ApproveRequest(l);
        }
    }


}
