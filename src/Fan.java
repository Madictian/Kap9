import java.security.PublicKey;

public class Fan {
    public String color;
    public double radius;
    public int level;
    public boolean onOff;


    public Fan(String color, double radius, int level, boolean onOff) {
        this.color = color;
        this.radius = radius;
        this.level = level;
        this.onOff = onOff;
    }


    public int increase(int level){
        this.level++;
        isOnOff(this.level);
        return this.level;
    }

    public int decrease(int level){
        this.level--;
        isOnOff(this.level);
        return this.level;
    }

    public void isOnOff(int level) {
        if (this.level == 0){
            onOff = false;
        }else{
            onOff = true;
        }
    }
    public String toString(){
        String string = "";
        if (this.level == 0){
        string = "The fan is " + this.color + ", it has a radius of " + this.radius + " and it's turned off";
        }
        else{
        string = "The fan is " + this.color + ", it has a radius of " + this.radius + " and it's level is " + this.level;
        }
        return string;
    }

}