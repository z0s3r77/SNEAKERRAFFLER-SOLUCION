package edu.craptocraft.sneakerraffle.raffles;

import edu.craptocraft.sneakerraffle.entries.Entry;

import java.util.Set;
import java.util.HashSet;

public class Bucket {

    Set<Entry> entries = new HashSet<Entry>();

    public Bucket(){}

    void add(Entry entry) {
        if (!this.isDoubleEntry(entry)) {
            entries.add(entry);
        }
    }

    private boolean isDoubleEntry(Entry entry) {
        return this.entries.stream().anyMatch(e -> e.getPayment().equalsIgnoreCase(entry.getPayment()));
    }

    public Integer totalEntries(){
        return entries.size();
    }



}
