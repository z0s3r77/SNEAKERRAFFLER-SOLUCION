package edu.craptocraft.sneakerraffle.raffles;

public interface Raffle {
    
    public void sizesRun(Sizes sizesInitial, Sizes sizesFinal);
    public Double price();
    public void register();
    public void cancel();
    public Integer totalEntries();
    public String listEntries();
    // public Entry draw();
    

}
