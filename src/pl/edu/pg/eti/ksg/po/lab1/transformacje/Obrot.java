package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class Obrot implements Transformacja
{
private final double alfa;

public Obrot(double a){
    this.alfa = a;
}

@Override
public Transformacja getTransformacjaOdwrotna()
{
    return new Obrot(-alfa);
}

    @Override
    public Punkt transformuj(Punkt p)
    {
        double x = p.getX() * Math.cos((alfa*Math.PI)/180) - (p.getY() * Math.sin((alfa*Math.PI)/180));
        double y = p.getX() * Math.sin((alfa*Math.PI)/180) + (p.getY() * Math.cos((alfa*Math.PI)/180));
        return new Punkt(x, y);
    }

    @Override
    public String toString()
    {
        return "Obrot o "+alfa+" stopni.";
    }
}
