package domain;

import java.util.ArrayList;

/**
 * Created by Jeison on 06/03/2018.
 */
public class Library {

    private String Name;
    private ArrayList<Student> studentsList;
    private ArrayList<Assets> assetsList;
    private ArrayList<Loans> loansList;
    private ArrayList<TypeLoan> typeLoansList;

    public Library(String name) {
        this.Name = name;
        this.studentsList= new ArrayList<>();
        this.assetsList= new ArrayList<>() ;
        this.loansList =new ArrayList<>();
        this.typeLoansList= new ArrayList<>();
    }

    public void setStudent(Student studen){
        this.studentsList.add(studen);
    }

    public void setAsset(Assets asset){
        this.assetsList.add(asset);
    }

    public void setLoan(Loans loan){
        this.loansList.add(loan);
    }

    public void  setTypeLoan(TypeLoan typeLoan){
        this.typeLoansList.add(typeLoan);
    }


    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}
