package com.example.Library;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class StatisticsDb {
    final private Map<Integer, ArrayList<ArrayList<Integer>>> mp = new HashMap<>();

    public boolean ifExist(int studentId) {
        return mp.containsKey(studentId);
    }

    public ArrayList<ArrayList<Integer>> getRecord(int studentId) {
        ArrayList<ArrayList<Integer>> record = mp.get(studentId);
        return record;
    }

    public void updateDb(int studentId, ArrayList<ArrayList<Integer>> record) {
        if(record.isEmpty()==true)
            mp.remove(studentId);
        else
        mp.put(studentId, record);
    }

    public void printDb() {
        System.out.println(mp);
    }
}
