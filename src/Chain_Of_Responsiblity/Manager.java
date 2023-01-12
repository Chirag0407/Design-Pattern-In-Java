package Chain_Of_Responsiblity;

public class Manager extends LoanApprover{
    @Override
    void ApproveRequest(Loan l) {
        if(l.getAmount()<500000){
            System.out.println("Request Approved by Manager");
        }
        else{
            nextApprover.ApproveRequest(l);
        }
    }
}
