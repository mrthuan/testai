package lib.zj.office.java.awt;

import a6.h;
import java.io.Serializable;
import lib.zj.office.java.awt.geom.g;

/* loaded from: classes3.dex */
public class Dimension extends g implements Serializable {
    private static final long serialVersionUID = 4723952579491349524L;
    public int height;
    public int width;

    public Dimension() {
        this(0, 0);
    }

    private static native void initIDs();

    public boolean equals(Object obj) {
        if (!(obj instanceof Dimension)) {
            return false;
        }
        Dimension dimension = (Dimension) obj;
        if (this.width != dimension.width || this.height != dimension.height) {
            return false;
        }
        return true;
    }

    @Override // lib.zj.office.java.awt.geom.g
    public double getHeight() {
        return this.height;
    }

    public Dimension getSize() {
        return new Dimension(this.width, this.height);
    }

    @Override // lib.zj.office.java.awt.geom.g
    public double getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i10 = this.width;
        int i11 = this.height + i10;
        return (((i11 + 1) * i11) / 2) + i10;
    }

    @Override // lib.zj.office.java.awt.geom.g
    public void setSize(double d10, double d11) {
        this.width = (int) Math.ceil(d10);
        this.height = (int) Math.ceil(d11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append("[width=");
        sb2.append(this.width);
        sb2.append(",height=");
        return h.g(sb2, this.height, "]");
    }

    public Dimension(Dimension dimension) {
        this(dimension.width, dimension.height);
    }

    public Dimension(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public void setSize(Dimension dimension) {
        setSize(dimension.width, dimension.height);
    }

    public void setSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }
}
