package edu.craptocraft.sneakerraffle.raffles;

import edu.craptocraft.sneakerraffle.sizes.Sizes;

public class Sneaker implements Raffle {
    
    private String name;
    private String style;
    private Double price;
    
    public Sneaker(String name, String style, Double price){
        
        this.name = name;
        this.style = style;
        this.price = price;
        
    }
    
    public Double price(){
        
        return this.price;
        
    }
    
    public String getName(){
        
        return this.name;
        
    }
    
    public String getStyle(){
        
        return this.style;
        
    }

    @Override
    public void sizesRun(Sizes sizesInitial, Sizes sizesFinal) {
    }

    @Override
    public void register() {
    }

    @Override
    public void cancel() {
    }

    @Override
    public Integer totalEntries() {
        return 0;
    }

    @Override
    public String listEntries() {
        return null;
    }


}
