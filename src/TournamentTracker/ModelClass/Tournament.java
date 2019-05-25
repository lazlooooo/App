/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TournamentTracker.ModelClass;

import java.util.ArrayList;

/**
 *
 * @author Kuba
 */
public class Tournament {
    public String TournamentName;
    public ArrayList<Team> EnteredTeams;
    public ArrayList<ArrayList<Matchup>> Rounds;


    
    public Tournament(String TournamentName, ArrayList<Team> EnteredTeams, ArrayList<ArrayList<Matchup>> Rounds) {
        this.TournamentName = TournamentName;
        this.EnteredTeams = EnteredTeams;
        this.Rounds = Rounds;
    }
    
}
