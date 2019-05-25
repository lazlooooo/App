/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TournamentTracker.DataAccess;

import TournamentTracker.ModelClass.Person;
import TournamentTracker.ModelClass.Team;

/**
 *
 * @author Kuba
 */
public interface IDataConnection {
    public Team CreateTeam(Team model);
    public Person CreatePerson(Person model);
}
