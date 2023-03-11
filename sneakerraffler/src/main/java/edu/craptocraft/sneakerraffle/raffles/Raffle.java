package edu.craptocraft.sneakerraffle.raffles;

import edu.craptocraft.sneakerraffle.entries.Entry;
import edu.craptocraft.sneakerraffle.sizes.Sizes;

public interface Raffle {
    
    public void sizesRun(Sizes sizesInitial, Sizes sizesFinal);
    public Double price();
    public void register(Entry ... entry);
    public void cancel(Entry entry);
    public Integer totalEntries();
    public String listEntries();
    public Entry draw();
    

}
