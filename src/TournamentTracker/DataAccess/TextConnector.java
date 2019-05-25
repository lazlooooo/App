/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TournamentTracker.DataAccess;

import TournamentTracker.ModelClass.Matchup;
import TournamentTracker.ModelClass.Person;
import TournamentTracker.ModelClass.Team;
import static TournamentTracker.DataAccess.TextConnectorProcessor.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kuba
 */
public class TextConnector implements IDataConnection {
    
    static final String PERSONFILE  = "Person.csv";
    static final String TEAMFILE = "Team.csv";
    static final String MATCHUP = "Matchup.csv";
    static final String MATCHUPENTRY = "MatchupEntry.csv";
    static final String TOURNAMENT = "Tournament.csv";
    
    public Matchup CreateMatchup(Matchup model){
        
        return model;
    }

    
    @Override
    public Team CreateTeam(Team model) {
        
        return model;
    }

    @Override
    public Person CreatePerson(Person model) {
        try {
           ArrayList<Person> persons = ConvertToPerson(LoadFile(FullFilePath(PERSONFILE)));
           
           
           Collections.sort(persons, (Person p1, Person p2) -> Integer.valueOf(p1.Id).compareTo(p2.Id));
           Collections.reverse(persons);   
           
           int currentId = persons.get(0).Id + 1; 
            System.out.println(currentId);
            } 
        catch (IOException ex) {
            Logger.getLogger(TextConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
        
    }
    
}
