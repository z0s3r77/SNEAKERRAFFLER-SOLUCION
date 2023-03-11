package edu.craptocraft.sneakerraffle.payment;

import java.util.HashMap;

public class Paypal implements Payment{

        private HashMap<String, Double> users = new HashMap<String, Double>();

        public  Paypal(){
            this.users.put("squanchy@paypal.com", 200d);
            this.users.put("birdman@paypal.com", 200d);
            this.users.put("morty@paypal.com", 200d);
            this.users.put("summer@paypal.com", 200d);
        }

        @Override
        public boolean autentication(String user) {
            return this.users.containsKey(user);
        }

        @Override
        public boolean pay(String user, Double credit) {
            if(this.users.containsKey(user)){
                this.users.put(user, this.users.get(user) - credit);
                return true;
            }
            return false;
        }

        @Override
        public Double credit(String user) {

            return this.users.get(user);

        }
}
