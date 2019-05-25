/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TournamentTracker.ModelClass;

/**
 *
 * @author Kuba
 */
public class MatchupEntry {
    



    public Team TeamCompeting;
    public double Score;
    public Matchup ParentMatchup;

    
    

    public MatchupEntry(Team TeamCompeting, double Score, Matchup ParentMatchup) {
        this.TeamCompeting = TeamCompeting;
        this.Score = Score;
        this.ParentMatchup = ParentMatchup;
    }
   
}
