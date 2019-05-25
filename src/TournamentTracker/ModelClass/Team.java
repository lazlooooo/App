package TournamentTracker.ModelClass;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kuba
 */
public class Team {
    public int Id;
    public ArrayList<Person> TeamMember;
    public String TeamName;
    
    public Team(){
    TeamMember = new ArrayList<Person>();
    }

    public Team(int Id, ArrayList<Person> TeamMember, String TeamName) {
        this.TeamMember = TeamMember;
        this.TeamName = TeamName;
        this.Id = Id;
    }
    
}