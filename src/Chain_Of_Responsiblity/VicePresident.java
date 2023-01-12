package Chain_Of_Responsiblity;

public class VicePresident extends LoanApprover{
    @Override
    void ApproveRequest(Loan l) {
        if(l.getAmount()>1000000){
            System.out.println("Request Approved By Vice President");
        }
        else{
            nextApprover.ApproveRequest(l);
        }
    }


}
