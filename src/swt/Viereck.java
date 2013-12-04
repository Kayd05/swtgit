package swt;

import java.awt.Point;

public class Viereck {
    private DoublePoint a;
    private DoublePoint b;
    private DoublePoint c;
    private DoublePoint d;

    public Viereck(Point a, Point b, Point c, Point d) {
    	this.a.setLocation(a.x, a.y);
    	this.b.setLocation(b.x, b.y);
    	this.c.setLocation(c.x, c.y);
    	this.d.setLocation(d.x, d.y);
    }

    public Viereck(DoublePoint a, DoublePoint b, DoublePoint c, DoublePoint d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public boolean isQuadrat() {
        if ((a.x == b.x) && (a.y == d.y) && (b.y == c.y) && (c.x == d.x)) {
            double ab = Math.abs(a.y - b.y);
            double bc = Math.abs(b.x - c.x);
            double cd = Math.abs(c.y - d.y);
            double da = Math.abs(d.x - a.x);
            if (ab == bc && cd == da && bc == cd) {
                return true;
            }
        }
        return false;
    }

    public boolean isRechteck() {
        if ((a.x == b.x) && (a.y == d.y) && (b.y == c.y) && (c.x == d.x)) {
            double ab = Math.abs(a.y - b.y);
            double bc = Math.abs(b.x - c.x);
            double cd = Math.abs(c.y - d.y);
            double da = Math.abs(d.x - a.x);
            if (ab == cd && da== bc ) {
                return true;
            }
        }
        return false;
    }
    public boolean isTrapez() {
        if ((a.x == b.x) && (a.y == d.y) && (b.y == c.y) && (c.x == d.x)) {
            double bc = Math.abs(b.x - d.y);
            double ad = Math.abs(d.x - a.x);
            double bd = Math.abs(b.x - d.x);
            double ac = Math.abs(a.x - c.x);
            if (bc > ad && bd ==ac ) {
                return true;
            }
        }
        return false;
    }
    
    
/*    public boolean isParallelogram() {
        if ((a.x != b.x) && (a.y == d.y) && (b.y == c.y) && (c.x != d.x)) {
            double ab = Math.abs(a.y - b.y);
            double bc = Math.abs(b.x - c.x);
            double cd = Math.abs(c.y - d.y);
            double da = Math.abs(d.x - a.x);
            if (ab == cd && bc == da && ab != bc) {
                return true;
            }
        }
        return false;
    }
    */

}
