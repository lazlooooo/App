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
public class Matchup {
    public ArrayList<MatchupEntry> Entries;
    public Team Winner;
    public int MatchupRound;

    public Matchup(ArrayList<MatchupEntry> Entries, Team Winner, int MatchupRound) {
        this.Entries = Entries;
        this.Winner = Winner;
        this.MatchupRound = MatchupRound;
    }
    
}
