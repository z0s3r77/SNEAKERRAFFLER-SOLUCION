package edu.craptocraft.sneakerraffle.entries;


import edu.craptocraft.sneakerraffle.sizes.Sizes;

public class Entry {
    

    private String email;
    private String userName;
    private String address;
    private Double total;
    private String payment;
    
    private Sizes size;


    public Entry(String email){
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public Sizes getSize() {
        return this.size;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return this.total;
    }

    public void payment(String payment) {
        this.payment = payment;
    }

    public String getPayment() {
        return this.payment;
    }

    @Override
    public String toString() {

        StringBuilder entry = new StringBuilder();
        entry.append("\nemail: "+this.getEmail()+"\nSize: "+this.getSize()+"\nAddres: "+this.getAddress()+"\nPayment: "+this.getPayment()+"\nTotal: "+this.getTotal()+" €\n");
        return entry.toString();
    }

    public boolean equals(Entry entry) {
        if (this.getEmail() != entry.getEmail() &&  this.getPayment() != entry.getPayment()) {
            return true;
        }
            return false;
    }
}
