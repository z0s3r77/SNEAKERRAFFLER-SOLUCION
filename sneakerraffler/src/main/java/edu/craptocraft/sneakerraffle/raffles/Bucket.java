package edu.craptocraft.sneakerraffle.raffles;

import edu.craptocraft.sneakerraffle.entries.Entry;

import java.util.Set;
import java.util.HashSet;

public class Bucket {

    Set<Entry> entries = new HashSet<Entry>();

    public Bucket(){}

    public void add(Entry entry){
        entries.add(entry);
    }

    public Integer totalEntries(){
        return entries.size();
    }



}
