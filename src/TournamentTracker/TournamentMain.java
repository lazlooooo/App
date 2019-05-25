/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TournamentTracker;

import TournamentTracker.DataAccess.TextConnectorProcessor;
import java.util.ArrayList;
import static TournamentTracker.DataAccess.TextConnectorProcessor.LoadFile;
import static TournamentTracker.DataAccess.TextConnectorProcessor.FullFilePath;
import TournamentTracker.DataAccess.TextConnector;
import TournamentTracker.ModelClass.Person;
import java.io.IOException;
/**
 *
 * @author Kuba
 */
public class TournamentMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println(TextConnectorProcessor.FullFilePath("plik.csv"));
        ArrayList<String> lines = LoadFile(FullFilePath("Person.csv")); 
        for (String line : lines){
            System.out.println(line);
        } 
        Person p = new Person();
        TextConnector tc = new TextConnector();
        tc.CreatePerson(p);
        
        TournamentStart start = new TournamentStart();
        start.setVisible(true);
        
        
    }
    
}
