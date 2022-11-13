package com.company;

public class Main {

    public static void main(String[] args) {
   Printable[]printables= {creat_obgect("Magic"),creat_obgect("Medic"), creat_obgect("Warrior")};
   for (Printable print:printables){
       print.print();
   }
    }
    public static Printable creat_obgect(String class_name){
        if ("Magic".equals(class_name)) {
            Magic magic = new Magic(300, 3000, 3300, "boostdamage");
            return magic;
        } else if ("Medic".equals(class_name)) {
            Medic medic = new Medic(400, 2500, 5700, "healpoints");
            return medic;
        } else if ("Warrior".equals(class_name)) {
            Warrior warrior = new Warrior(200, 900, 9900, "criticaldamage");
            return warrior;
        }
        return null;
    }
}
