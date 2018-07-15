package XE;

import java.text.DecimalFormat;

public class USD extends Observer{
    private double u;
    public USD(Subject sb)
    {
        this.sb=sb;
        this.sb.attach(this);
    }
    @Override
    public void update()
    {
       u=sb.getINR()/65;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("USD value is:"+df.format(u));
    }


}
