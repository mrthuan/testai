package lib.zj.office.fc.sl.usermodel;

import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public interface Shape {
    Rectangle2D getAnchor();

    Shape getParent();

    int getShapeType();

    void moveTo(float f10, float f11);

    void setAnchor(Rectangle2D rectangle2D);
}
