
public class myhealthapp {
    String name, bloodtype, health, height, weight, temperature, date;
    Double bmi;
    
    /*Declaring this functions to pass the reference to the next variable */
    public myhealthapp(String n,String btype,String hth, String h, String w, String t, String d, Double bmi){
        this.name = n;
        this.bloodtype = btype;
        this.health = hth;
        this.height = h;
        this.weight = w;
        this.temperature = t;
        this.date = d;
        this.bmi = bmi;
    }
}

