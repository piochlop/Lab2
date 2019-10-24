package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class ZlozenieTransformacji implements Transformacja{

    private int n, tabs;

    public ZlozenieTransformacji(int ile){
        this.n=ile;
        Transformacja[] tabs = new Transformacja[n];
    }

    @Override
    public Punkt transformuj(Punkt p) {
        for (int i=0; i<.length; i++) {
            arrayy[i].transformuj(p);
        }
        return new Punkt (2,8);
        }


    @Override
    public Transformacja getTransformacjaOdwrotna()
    {
        return new Obrot(2);
    }
}

