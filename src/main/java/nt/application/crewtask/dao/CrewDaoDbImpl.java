/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.application.crewtask.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import nt.application.crewtask.model.Crew;

/**
 *
 * @author Elnic
 */
public class CrewDaoDbImpl implements CrewDao{

    private final Map<Integer, Crew> crews = new HashMap<>();
    
    public static final String CREW_LIST = "crewList.txt";
    public static final String DELIMITER = "::";
    
    
    //Temporary file system for saving and loading crews - will implement MySQL db later
    private void loadCrews() throws Exception {
        Scanner sc;
        try {
            sc = new Scanner(new BufferedReader(new FileReader(CREW_LIST)));
        } catch (FileNotFoundException e) {
            throw new Exception("test", e);
        }
        String currentLine;
        String[] currentTokens;
        
        while (sc.hasNextLine()) {
            
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            String[] crewMembers;
            
            Crew currentCrew = new Crew(Integer.parseInt(currentTokens[0]));
            currentCrew.setCrewName(currentTokens[1]);
            currentCrew.setCrewLead(currentTokens[2]);
            currentCrew.setIsAvailable(Boolean.parseBoolean(currentTokens[3]));
            while (sc.hasNextLine()) {
                currentLine = sc.nextLine();
                currentTokens = currentLine.split(DELIMITER);
                crewMembers = new String[currentTokens.length];
                for (int i = 0; i < currentTokens.length; i++) {
                    crewMembers[i] = currentTokens[i];
                }
                currentCrew.setCrewMembers(crewMembers);
            }
            crews.put(currentCrew.getId(), currentCrew);
        }
        sc.close();
    }
    
    private void writeCrews() throws Exception {
        PrintWriter out;
        
        try {
            out = new PrintWriter(new FileWriter(CREW_LIST));
        } catch (IOException e) {
            throw new Exception("test", e);
        }
    }    
    
    //Once db is created, will add to tables, for now stored in hashmap and written to file.
    @Override
    public Crew addCrew(Crew crew) {
        crews.put(crew.getId(), crew);
        return crew;
    }

    //temporary placeholder crew to load into system
    @Override
    public ArrayList<Crew> getAllCrews() throws Exception {
        loadCrews();
       Crew crew = new Crew(1);
       crew.setCrewName("Test Crew");
       String[] strArray = new String[2];
       strArray[1] = "test member 1";
       strArray[2] = "test member 2";
       crew.setCrewMembers(strArray);
       crew.setCrewLead("Will Burr");
       crew.setIsAvailable(true);
       ArrayList<Crew> crewList = new ArrayList<>();
       crewList.add(crew);
       return crewList;
    }

    //will replace existing  crew info with new
    @Override
    public Crew editCrew(Crew crew) {
        return crew;
    }

    //will remove crew from db
    @Override
    public void deleteCrew(Crew crew) {
        
    }

    //select crew by crew id
    @Override
    public Crew selectCrew(int id) throws Exception {
        return getAllCrews().get(1);
    }
    
}
