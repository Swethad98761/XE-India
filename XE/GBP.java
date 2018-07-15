package XE;

import java.text.DecimalFormat;

public class GBP extends Observer {
    private double g;
    public GBP(Subject sb)
    {
        this.sb=sb;
        this.sb.attach(this);
    }
    @Override
    public void update()
    {
        g=sb.getINR()/80;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("GBP value is:"+df.format(g));
    }

}
