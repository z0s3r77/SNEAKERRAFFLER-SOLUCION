package edu.craptocraft.sneakerraffle.raffles;

import edu.craptocraft.sneakerraffle.entries.Entry;

import java.util.*;
import java.util.stream.Collectors;

public class Bucket {

    private Random rand = new Random();
    Set<Entry> entries = new HashSet<Entry>();

    public Bucket(){}

    void add(Entry entry) {
        if (!this.isDoubleEntry(entry)) {
            entries.add(entry);
        }
    }

     boolean isDoubleEntry(Entry entry) {
        return this.entries.stream().anyMatch(e -> e.getPayment().equalsIgnoreCase(entry.getPayment()));
    }

    void delete(Entry entry){
        if (this.entries.contains(entry)){
            this.entries.remove(entry);
        }
    }



    public Integer totalEntries(){
        return this.entries.size();
    }

    public String listEntries(){
        return  this.entries.stream().map(e -> e.getEmail()).collect(Collectors.toList()).toString();
    }

    Optional<Entry> draw() {
        Random rand;
        return this.entries.stream().skip(this.rand.nextInt(entries.size())).findFirst();
    }

}
