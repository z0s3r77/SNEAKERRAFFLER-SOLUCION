package edu.craptocraft.sneakerraffle.raffles;

import java.util.Arrays;

import edu.craptocraft.sneakerraffle.entries.Entry;
import edu.craptocraft.sneakerraffle.sizes.Sizes;

public class Sneaker implements Raffle {
    
    private String name;
    private String style;
    private Double price;
    private String[] sizes;
    private  Bucket bucket;
    
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
        
        int sizeInitial = sizesInitial.ordinal();
        int sizeFinal = sizesFinal.ordinal();
        
        int size = sizeFinal - sizeInitial + 1;
        this.sizes = new String[size];
        
        for (int i = 0; i < size; i++) {
            
            //Necesito que se metán las tallas US en el array sizes
            this.sizes[i] = Sizes.values()[sizeInitial+i].getUSsize();
        }


    }

    @Override
    public void register(Entry entry) {

        if (this.bucket == null) {
            this.bucket = new Bucket();
        }

        this.bucket.add(entry);

    }

    @Override
    public void cancel(Entry entry) {
    }

    @Override
    public Integer totalEntries() {

        return this.bucket.totalEntries();

    }

    @Override
    public String listEntries() {
        return null;
    }

    public String[] sizes() {
    
        return this.sizes;
        
    }

    @Override
    public String toString() {
        
        StringBuilder sneaker = new StringBuilder();
        sneaker.append("\n"+this.getName()+"\n"+this.getStyle()+"\n"+this.price()+" €\n"+Arrays.toString(this.sizes()));
        return sneaker.toString();
        

    }

}
