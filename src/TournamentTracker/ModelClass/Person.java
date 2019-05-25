package TournamentTracker.ModelClass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kuba
 */
public class Person {
   public int Id;
   public String FirstName;
   public String LastName;
   public String EmailAddress;
   public String CellphoneNumber;

    public Person(int Id,String FirstName, String LastName, String EmailAddress, String CellphoneNumber) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.EmailAddress = EmailAddress;
        this.CellphoneNumber = CellphoneNumber;
        this.Id = Id;
    }
    public Person(String FirstName, String LastName, String EmailAddress, String CellphoneNumber) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.EmailAddress = EmailAddress;
        this.CellphoneNumber = CellphoneNumber;
    }
    public Person() {
    }
    
    
}
