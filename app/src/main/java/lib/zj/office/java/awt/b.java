package lib.zj.office.java.awt;

import lib.zj.office.java.awt.geom.AffineTransform;
import lib.zj.office.java.awt.geom.Rectangle2D;
import lib.zj.office.java.awt.geom.p;

/* compiled from: Shape.java */
/* loaded from: classes3.dex */
public interface b {
    boolean contains(double d10, double d11);

    boolean contains(double d10, double d11, double d12, double d13);

    Rectangle2D getBounds2D();

    p getPathIterator(AffineTransform affineTransform);

    boolean intersects(double d10, double d11, double d12, double d13);
}
