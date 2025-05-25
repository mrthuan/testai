package lib.zj.office.java.awt.geom;

/* compiled from: Dimension2D.java */
/* loaded from: classes3.dex */
public abstract class g implements Cloneable {
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public abstract double getHeight();

    public abstract double getWidth();

    public abstract void setSize(double d10, double d11);

    public void setSize(g gVar) {
        setSize(gVar.getWidth(), gVar.getHeight());
    }
}
