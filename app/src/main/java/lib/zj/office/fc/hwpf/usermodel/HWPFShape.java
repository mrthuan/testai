package lib.zj.office.fc.hwpf.usermodel;

import a0.a;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.activity.s;
import gh.b;
import lib.zj.office.fc.ddf.EscherChildAnchorRecord;
import lib.zj.office.fc.ddf.EscherClientAnchorRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.ddf.EscherTertiaryOptRecord;
import lib.zj.office.java.awt.Color;
import lib.zj.office.java.awt.Rectangle;

/* loaded from: classes3.dex */
public abstract class HWPFShape {
    public static final byte POSH_ABS = 0;
    public static final byte POSH_CENTER = 2;
    public static final byte POSH_INSIDE = 4;
    public static final byte POSH_LEFT = 1;
    public static final byte POSH_OUTSIDE = 5;
    public static final byte POSH_RIGHT = 3;
    public static final byte POSRELH_CHAR = 3;
    public static final byte POSRELH_COLUMN = 2;
    public static final byte POSRELH_MARGIN = 0;
    public static final byte POSRELH_PAGE = 1;
    public static final byte POSRELV_LINE = 3;
    public static final byte POSRELV_MARGIN = 0;
    public static final byte POSRELV_PAGE = 1;
    public static final byte POSRELV_TEXT = 2;
    public static final byte POSV_ABS = 0;
    public static final byte POSV_BOTTOM = 3;
    public static final byte POSV_CENTER = 2;
    public static final byte POSV_INSIDE = 4;
    public static final byte POSV_OUTSIDE = 5;
    public static final byte POSV_TOP = 1;
    protected EscherContainerRecord escherContainer;
    protected HWPFShape parent;

    public HWPFShape(EscherContainerRecord escherContainerRecord, HWPFShape hWPFShape) {
        this.escherContainer = escherContainerRecord;
        this.parent = hWPFShape;
    }

    public void dispose() {
        EscherContainerRecord escherContainerRecord = this.escherContainer;
        if (escherContainerRecord != null) {
            escherContainerRecord.dispose();
        }
    }

    public Float[] getAdjustmentValue() {
        return s.z(getSpContainer());
    }

    public Rectangle getAnchor(Rectangle rectangle, float f10, float f11) {
        EscherClientAnchorRecord escherClientAnchorRecord;
        EscherChildAnchorRecord escherChildAnchorRecord;
        EscherClientAnchorRecord escherClientAnchorRecord2;
        EscherSpRecord escherSpRecord = (EscherSpRecord) this.escherContainer.getChildById(EscherSpRecord.RECORD_ID);
        Rectangle rectangle2 = null;
        if (escherSpRecord != null) {
            if ((escherSpRecord.getFlags() & 2) != 0) {
                if (((EscherChildAnchorRecord) s.F(this.escherContainer, -4081)) == null) {
                    if (((EscherClientAnchorRecord) s.F(this.escherContainer, -4080)) != null) {
                        rectangle2 = new Rectangle();
                        rectangle2.f20688x = (int) a.a(escherClientAnchorRecord2.getCol1(), f10, 96.0f, 914400.0f);
                        rectangle2.f20689y = (int) a.a(escherClientAnchorRecord2.getFlag(), f11, 96.0f, 914400.0f);
                        rectangle2.width = (int) a.a(escherClientAnchorRecord2.getDx1() - escherClientAnchorRecord2.getCol1(), f10, 96.0f, 914400.0f);
                        rectangle2.height = (int) a.a(escherClientAnchorRecord2.getRow1() - escherClientAnchorRecord2.getFlag(), f11, 96.0f, 914400.0f);
                    }
                } else {
                    rectangle2 = new Rectangle();
                    rectangle2.f20688x = (int) a.a(escherChildAnchorRecord.getDx1(), f10, 96.0f, 914400.0f);
                    rectangle2.f20689y = (int) a.a(escherChildAnchorRecord.getDy1(), f11, 96.0f, 914400.0f);
                    rectangle2.width = (int) a.a(escherChildAnchorRecord.getDx2() - escherChildAnchorRecord.getDx1(), f10, 96.0f, 914400.0f);
                    rectangle2.height = (int) a.a(escherChildAnchorRecord.getDy2() - escherChildAnchorRecord.getDy1(), f11, 96.0f, 914400.0f);
                }
            } else {
                if (((EscherClientAnchorRecord) s.F(this.escherContainer, -4080)) != null) {
                    rectangle2 = new Rectangle();
                    rectangle2.f20688x = (int) a.a(escherClientAnchorRecord.getCol1(), f10, 96.0f, 914400.0f);
                    rectangle2.f20689y = (int) a.a(escherClientAnchorRecord.getFlag(), f11, 96.0f, 914400.0f);
                    rectangle2.width = (int) a.a(escherClientAnchorRecord.getDx1() - escherClientAnchorRecord.getCol1(), f10, 96.0f, 914400.0f);
                    rectangle2.height = (int) a.a(escherClientAnchorRecord.getRow1() - escherClientAnchorRecord.getFlag(), f11, 96.0f, 914400.0f);
                }
            }
        }
        if (rectangle != null) {
            rectangle2.f20688x -= rectangle.f20688x;
            rectangle2.f20689y -= rectangle.f20689y;
        }
        return rectangle2;
    }

    public int getBackgroundPictureIdx() {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(getSpContainer(), -4085);
        int K = s.K(this.escherContainer);
        if ((K == 3 || K == 2 || K == 1) && (escherSimpleProperty = (EscherSimpleProperty) s.H(escherOptRecord, 390)) != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return -1;
    }

    public int getEndArrowLength() {
        return s.B(getSpContainer());
    }

    public ug.a getEndArrowPath(Rectangle rectangle) {
        return s.C(getSpContainer(), rectangle);
    }

    public int getEndArrowType() {
        return s.D(getSpContainer());
    }

    public int getEndArrowWidth() {
        return s.E(getSpContainer());
    }

    public int getFillAngle() {
        return s.I(getSpContainer());
    }

    public int getFillFocus() {
        return s.J(getSpContainer());
    }

    public int getFillType() {
        return s.K(getSpContainer());
    }

    public Color getFillbackColor() {
        return s.L(getSpContainer(), null, 0);
    }

    public boolean getFlipHorizontal() {
        return s.M(getSpContainer());
    }

    public boolean getFlipVertical() {
        return s.N(getSpContainer());
    }

    public Color getForegroundColor() {
        return s.O(getSpContainer(), null, 0);
    }

    public Path[] getFreeformPath(Rectangle rectangle, PointF pointF, byte b10, PointF pointF2, byte b11) {
        return s.P(getSpContainer(), rectangle, pointF, b10, pointF2, b11);
    }

    public b getLine(boolean z10) {
        boolean z11;
        if (z10 || hasLine()) {
            int round = (int) Math.round(getLineWidth() * 1.3333333730697632d);
            if (getLineDashing() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Color lineColor = getLineColor();
            if (lineColor != null) {
                eh.b bVar = new eh.b();
                bVar.f16571d = lineColor.getRGB();
                b bVar2 = new b();
                bVar2.f17807b = bVar;
                bVar2.f17806a = round;
                bVar2.c = z11;
                return bVar2;
            }
            return null;
        }
        return null;
    }

    public Color getLineColor() {
        return s.S(getSpContainer(), null, 0);
    }

    public int getLineDashing() {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherOptRecord) s.F(getSpContainer(), -4085), 462);
        if (escherSimpleProperty == null) {
            return 0;
        }
        return escherSimpleProperty.getPropertyValue();
    }

    public double getLineWidth() {
        return s.T(getSpContainer());
    }

    public HWPFShape getParent() {
        return this.parent;
    }

    public int getPositionRelTo_H() {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherTertiaryOptRecord) s.F(getSpContainer(), -3806), 912);
        if (escherSimpleProperty != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 2;
    }

    public int getPositionRelTo_V() {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherTertiaryOptRecord) s.F(getSpContainer(), -3806), 914);
        if (escherSimpleProperty != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 2;
    }

    public int getPosition_H() {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherTertiaryOptRecord) s.F(getSpContainer(), -3806), 911);
        if (escherSimpleProperty != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 0;
    }

    public int getPosition_V() {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherTertiaryOptRecord) s.F(getSpContainer(), -3806), 913);
        if (escherSimpleProperty != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 0;
    }

    public int getRadialGradientPositionType() {
        return s.U(getSpContainer());
    }

    public int getRotation() {
        return (s.G(getSpContainer(), (short) 4, 0) >> 16) % 360;
    }

    public int[] getShaderColors() {
        return s.V(getSpContainer());
    }

    public float[] getShaderPositions() {
        return s.W(getSpContainer());
    }

    public int getShapeType() {
        EscherSpRecord escherSpRecord = (EscherSpRecord) this.escherContainer.getChildById(EscherSpRecord.RECORD_ID);
        if (escherSpRecord != null) {
            return escherSpRecord.getOptions() >> 4;
        }
        return -1;
    }

    public EscherContainerRecord getSpContainer() {
        return this.escherContainer;
    }

    public int getStartArrowLength() {
        return s.Y(getSpContainer());
    }

    public ug.a getStartArrowPath(Rectangle rectangle) {
        return s.Z(getSpContainer(), rectangle);
    }

    public int getStartArrowType() {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(getSpContainer(), -4085);
        if (escherOptRecord != null && (escherSimpleProperty = (EscherSimpleProperty) s.H(escherOptRecord, 464)) != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 0;
    }

    public int getStartArrowWidth() {
        return s.a0(getSpContainer());
    }

    public boolean hasLine() {
        return s.h0(getSpContainer());
    }

    public boolean isHidden() {
        return s.j0(getSpContainer());
    }

    public boolean isShaderPreset() {
        return s.l0(getSpContainer());
    }
}
