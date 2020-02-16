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
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import nt.application.crewtask.model.Crew;

/**
 *
 * @author Elnic
 */
public class CrewDaoDbImpl implements CrewDao {

    private final Map<Integer, Crew> crews = new HashMap<>();
    private static int lastIdNumber = 1;
    public static final String CREW_LIST = "C:/Repos/CrewTask/crewList.txt";
    public static final String DELIMITER = "::";

    //Temporary file system for saving and loading crews - will implement MySQL db later
    private void loadCrews() throws Exception {
        Scanner sc;
        try {
            sc = new Scanner(new BufferedReader(new FileReader(CREW_LIST)));
        } catch (FileNotFoundException e) {
            throw new Exception("file not found", e);
        }
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            try {
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
                lastIdNumber = currentCrew.getId();
                crews.put(currentCrew.getId(), currentCrew);
                
            } catch (NumberFormatException e) {
                Crew firstCrew = new Crew(1);
                firstCrew.setCrewName("First Crew");
                firstCrew.setCrewLead("Crew Lead");
                String[] tempCrewMems = new String[]{"Crew Member"};
                firstCrew.setCrewMembers(tempCrewMems);
                firstCrew.setIsAvailable(true);
                crews.put(firstCrew.getId(), firstCrew);
                lastIdNumber = firstCrew.getId();
            }
            
        }
        sc.close();
    }

    private void writeCrews() throws Exception {
        loadCrews();
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(CREW_LIST));
        } catch (IOException e) {
            throw new Exception("test", e);
        }

        List<Crew> crews = this.getAllCrews();
        for (Crew crew : crews) {
            out.println(crew.getId() + DELIMITER
                    + crew.getCrewName() + DELIMITER
                    + crew.getCrewLead() + DELIMITER
                    + true);
            for (int i = 0; i < crew.getCrewMembers().length - 1; i++) {
                out.print(crew.getCrewMembers()[i] + DELIMITER);
            }
            out.print(crew.getCrewMembers()[crew.getCrewMembers().length - 1]);
            out.println();
            out.flush();
        }
        out.close();
    }

    //Once db is created, will add to tables, for now stored in hashmap and written to file.
    @Override
    public Crew addCrew(Crew crew) throws Exception {
        loadCrews();
        lastIdNumber += 1;
        crew.setId(lastIdNumber);
        crews.put(lastIdNumber, crew);
        writeCrews();
        return crew;
    }

    //temporary placeholder crew to load into system
    @Override
    public ArrayList<Crew> getAllCrews() throws Exception {
        loadCrews();
        return new ArrayList<>(crews.values());
    }

    //will replace existing  crew info with new
    @Override
    public Crew editCrew(Crew crew) {
        crews.put(crew.getId(), crew);
        return crew;
    }

    //will remove crew from db
    @Override
    public void deleteCrew(Crew crew) {
        System.out.println(crew.getId());
        crews.remove(crew.getId());
    }

    //select crew by crew id
    @Override
    public Crew selectCrew(int id) throws Exception {
        return crews.get(id);
    }

}
