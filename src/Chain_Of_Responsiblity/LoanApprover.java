package Chain_Of_Responsiblity;

abstract public class LoanApprover {
    LoanApprover nextApprover;
    abstract void ApproveRequest(Loan l);
    void SetnextApprover(LoanApprover nextApprover){
        this.nextApprover=nextApprover;
    };
}

