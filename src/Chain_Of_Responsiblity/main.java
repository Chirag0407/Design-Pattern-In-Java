package Chain_Of_Responsiblity;

public class main {
    public static void main(String[] args) {
        LoanApprover m=new Manager();
        LoanApprover m1=new Manager();
        LoanApprover d= new Directer();
        LoanApprover vc=new VicePresident();

        m.SetnextApprover(d);
        m1.SetnextApprover(d);
        d.SetnextApprover(vc);

        Loan l=new Loan(80000);
        Loan l1=new Loan(900000);
        Loan l2=new Loan(1000000);

        m.ApproveRequest(l2);
        m1.ApproveRequest(l2);
    }
}
