/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TournamentTracker.DataAccess;
import TournamentTracker.ModelClass.Person;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.stream.Collectors;


/**
 *
 * @author Kuba
 */
public class TextConnectorProcessor {
    public static String FullFilePath(String fileName){
        String userDir = System.getProperty("user.home");
        return userDir + "\\Documents\\TournamentTracker\\" + fileName;
    }
    
    public static ArrayList<String> LoadFile(String filePath) throws FileNotFoundException, IOException{
        File file = new File(filePath);
        if(!file.exists()){
            return new ArrayList<>();
        }
        return (ArrayList<String>) Files.lines(file.toPath()).collect(Collectors.toList());
    }
    
    public static ArrayList<Person> ConvertToPerson(ArrayList<String> lines){
        
        ArrayList<Person> out = new ArrayList<>();
        
        for(String line:lines){
        String[] cols = line.split(",");
        Person p = new Person(0,cols[1], cols[2], cols[3], cols[4]);
        p.Id = Integer.parseInt(cols[0]);
        out.add(p);
        }
        return out;
    
    }
    public static void SaveToPerson(){
        
    }
}

