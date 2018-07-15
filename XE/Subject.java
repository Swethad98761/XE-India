package XE;
import java.util.ArrayList;
import java.util.List;
public class Subject {
    private List<Observer> ob=new ArrayList<>();
   private double INR;

    public double getINR() {
        return this.INR;
    }

    public void setINR(double INR) {
        this.INR = INR;
        notifyall();
    }
    public void attach(Observer observer){
        ob.add(observer);
    }
    public void notifyall()
    {
        for(Observer i:ob)
        {
            i.update();
        }
    }

}
