package XE;

import java.text.DecimalFormat;

public class Euro extends Observer {
    private double e;
    public Euro(Subject sb)
    {
        this.sb=sb;
        this.sb.attach(this);
    }
    @Override
    public void update()
    {
        e=sb.getINR()/69;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("EURO value is:"+df.format(e));
    }

}
