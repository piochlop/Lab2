package pl.edu.pg.eti.ksg.po.lab1;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.*;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Obrot;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Translacja;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.ZlozenieTransformacji;

public class Javalab1obrot {
    public static void main(String[] args) {
        try {
            Punkt p1 = new Punkt(3.0, 5.0);
            System.out.println(p1);
            Transformacja tr = new Obrot(90.0);
            System.out.println(tr);
            Punkt p2 = tr.transformuj(p1);
            System.out.println(p2);
            Transformacja trr = tr.getTransformacjaOdwrotna();
            System.out.println(trr);
            Punkt p3 = trr.transformuj(p2);
            System.out.println(p3);
        } catch (BrakTransformacjiOdwrotnejException ex) {
            ex.printStackTrace();
        }
        /****************************/


        System.out.println();

    }
}
