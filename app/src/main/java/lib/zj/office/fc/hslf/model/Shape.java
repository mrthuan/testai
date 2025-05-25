package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import java.util.Iterator;
import lib.zj.office.fc.ddf.EscherChildAnchorRecord;
import lib.zj.office.fc.ddf.EscherClientAnchorRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperty;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.hslf.record.ColorSchemeAtom;
import lib.zj.office.java.awt.Color;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.b;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public abstract class Shape {
    protected EscherContainerRecord _escherContainer;
    protected Fill _fill;
    protected Shape _parent;
    protected Sheet _sheet;

    public Shape(EscherContainerRecord escherContainerRecord, Shape shape) {
        this._escherContainer = escherContainerRecord;
        this._parent = shape;
    }

    public static EscherRecord getEscherChild(EscherContainerRecord escherContainerRecord, int i10) {
        Iterator<EscherRecord> childIterator = escherContainerRecord.getChildIterator();
        while (childIterator.hasNext()) {
            EscherRecord next = childIterator.next();
            if (next.getRecordId() == i10) {
                return next;
            }
        }
        return null;
    }

    public static EscherProperty getEscherProperty(EscherOptRecord escherOptRecord, int i10) {
        if (escherOptRecord != null) {
            for (EscherProperty escherProperty : escherOptRecord.getEscherProperties()) {
                if (escherProperty.getPropertyNumber() == i10) {
                    return escherProperty;
                }
            }
            return null;
        }
        return null;
    }

    public static void setEscherProperty(EscherOptRecord escherOptRecord, short s4, int i10) {
        Iterator<EscherProperty> it = escherOptRecord.getEscherProperties().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == s4) {
                it.remove();
            }
        }
        if (i10 != -1) {
            escherOptRecord.addEscherProperty(new EscherSimpleProperty(s4, i10));
            escherOptRecord.sortProperties();
        }
    }

    public abstract EscherContainerRecord createSpContainer(boolean z10);

    public void dispose() {
        EscherContainerRecord escherContainerRecord = this._escherContainer;
        if (escherContainerRecord != null) {
            escherContainerRecord.dispose();
        }
        Fill fill = this._fill;
        if (fill != null) {
            fill.dispose();
        }
    }

    public Float[] getAdjustmentValue() {
        return s.z(this._escherContainer);
    }

    public Rectangle getAnchor() {
        return getAnchor2D().getBounds();
    }

    public Rectangle2D getAnchor2D() {
        if ((((EscherSpRecord) this._escherContainer.getChildById(EscherSpRecord.RECORD_ID)).getFlags() & 2) != 0) {
            EscherChildAnchorRecord escherChildAnchorRecord = (EscherChildAnchorRecord) s.F(this._escherContainer, -4081);
            if (escherChildAnchorRecord == null) {
                EscherClientAnchorRecord escherClientAnchorRecord = (EscherClientAnchorRecord) s.F(this._escherContainer, -4080);
                return new Rectangle2D.Float((escherClientAnchorRecord.getCol1() * 72.0f) / 576.0f, (escherClientAnchorRecord.getFlag() * 72.0f) / 576.0f, ((escherClientAnchorRecord.getDx1() - escherClientAnchorRecord.getCol1()) * 72.0f) / 576.0f, ((escherClientAnchorRecord.getRow1() - escherClientAnchorRecord.getFlag()) * 72.0f) / 576.0f);
            }
            return new Rectangle2D.Float((escherChildAnchorRecord.getDx1() * 72.0f) / 576.0f, (escherChildAnchorRecord.getDy1() * 72.0f) / 576.0f, ((escherChildAnchorRecord.getDx2() - escherChildAnchorRecord.getDx1()) * 72.0f) / 576.0f, ((escherChildAnchorRecord.getDy2() - escherChildAnchorRecord.getDy1()) * 72.0f) / 576.0f);
        }
        EscherClientAnchorRecord escherClientAnchorRecord2 = (EscherClientAnchorRecord) s.F(this._escherContainer, -4080);
        return new Rectangle2D.Float((escherClientAnchorRecord2.getCol1() * 72.0f) / 576.0f, (escherClientAnchorRecord2.getFlag() * 72.0f) / 576.0f, ((escherClientAnchorRecord2.getDx1() - escherClientAnchorRecord2.getCol1()) * 72.0f) / 576.0f, ((escherClientAnchorRecord2.getRow1() - escherClientAnchorRecord2.getFlag()) * 72.0f) / 576.0f);
    }

    public Color getColor(int i10, int i11) {
        if (i10 >= 134217728) {
            int i12 = i10 - 134217728;
            ColorSchemeAtom colorScheme = getSheet().getColorScheme();
            if (i12 >= 0 && i12 <= 7) {
                i10 = colorScheme.getColor(i12);
            }
        }
        Color color = new Color(i10, true);
        return new Color(color.getBlue(), color.getGreen(), color.getRed(), i11);
    }

    public int getEndArrowLength() {
        return s.B(this._escherContainer);
    }

    public int getEndArrowType() {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) getEscherChild(this._escherContainer, -4085);
        if (escherOptRecord != null && (escherSimpleProperty = (EscherSimpleProperty) getEscherProperty(escherOptRecord, 465)) != null && escherSimpleProperty.getPropertyValue() > 0) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 0;
    }

    public int getEndArrowWidth() {
        return s.E(this._escherContainer);
    }

    public Fill getFill() {
        if (this._fill == null) {
            this._fill = new Fill(this);
        }
        return this._fill;
    }

    public Color getFillColor() {
        return getFill().getForegroundColor();
    }

    public boolean getFlipHorizontal() {
        return s.M(getSpContainer());
    }

    public boolean getFlipVertical() {
        return s.N(getSpContainer());
    }

    public Hyperlink getHyperlink() {
        return Hyperlink.find(this);
    }

    public Color getLineColor() {
        return s.S(getSpContainer(), getSheet(), 2);
    }

    public double getLineWidth() {
        return s.T(getSpContainer());
    }

    public Rectangle2D getLogicalAnchor2D() {
        return getAnchor2D();
    }

    public int getMasterShapeID() {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(this._escherContainer, -4085);
        if (escherOptRecord != null && (escherSimpleProperty = (EscherSimpleProperty) s.H(escherOptRecord, 769)) != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 0;
    }

    public b getOutline() {
        return getLogicalAnchor2D();
    }

    public Shape getParent() {
        return this._parent;
    }

    public int getRotation() {
        return (s.G(getSpContainer(), (short) 4, 0) >> 16) % 360;
    }

    public int getShapeId() {
        EscherSpRecord escherSpRecord = (EscherSpRecord) this._escherContainer.getChildById(EscherSpRecord.RECORD_ID);
        if (escherSpRecord == null) {
            return 0;
        }
        return escherSpRecord.getShapeId();
    }

    public String getShapeName() {
        return ShapeTypes.typeName(getShapeType());
    }

    public int getShapeType() {
        EscherSpRecord escherSpRecord = (EscherSpRecord) this._escherContainer.getChildById(EscherSpRecord.RECORD_ID);
        if (escherSpRecord != null) {
            return escherSpRecord.getOptions() >> 4;
        }
        return -1;
    }

    public Sheet getSheet() {
        return this._sheet;
    }

    public EscherContainerRecord getSpContainer() {
        return this._escherContainer;
    }

    public int getStartArrowLength() {
        return s.Y(this._escherContainer);
    }

    public int getStartArrowType() {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) getEscherChild(this._escherContainer, -4085);
        if (escherOptRecord != null && (escherSimpleProperty = (EscherSimpleProperty) getEscherProperty(escherOptRecord, 464)) != null && escherSimpleProperty.getPropertyValue() > 0) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 0;
    }

    public int getStartArrowWidth() {
        return s.a0(this._escherContainer);
    }

    public boolean hasLine() {
        return s.h0(getSpContainer());
    }

    public boolean isHidden() {
        return s.j0(this._escherContainer);
    }

    public void moveTo(float f10, float f11) {
        Rectangle2D anchor2D = getAnchor2D();
        anchor2D.setRect(f10, f11, anchor2D.getWidth(), anchor2D.getHeight());
        setAnchor(anchor2D);
    }

    public void setAnchor(Rectangle2D rectangle2D) {
        if ((((EscherSpRecord) this._escherContainer.getChildById(EscherSpRecord.RECORD_ID)).getFlags() & 2) != 0) {
            EscherChildAnchorRecord escherChildAnchorRecord = (EscherChildAnchorRecord) s.F(this._escherContainer, -4081);
            escherChildAnchorRecord.setDx1((int) ((rectangle2D.getX() * 576.0d) / 72.0d));
            escherChildAnchorRecord.setDy1((int) ((rectangle2D.getY() * 576.0d) / 72.0d));
            escherChildAnchorRecord.setDx2((int) (((rectangle2D.getX() + rectangle2D.getWidth()) * 576.0d) / 72.0d));
            escherChildAnchorRecord.setDy2((int) (((rectangle2D.getY() + rectangle2D.getHeight()) * 576.0d) / 72.0d));
            return;
        }
        EscherClientAnchorRecord escherClientAnchorRecord = (EscherClientAnchorRecord) s.F(this._escherContainer, -4080);
        escherClientAnchorRecord.setFlag((short) ((rectangle2D.getY() * 576.0d) / 72.0d));
        escherClientAnchorRecord.setCol1((short) ((rectangle2D.getX() * 576.0d) / 72.0d));
        escherClientAnchorRecord.setDx1((short) (((rectangle2D.getX() + rectangle2D.getWidth()) * 576.0d) / 72.0d));
        escherClientAnchorRecord.setRow1((short) (((rectangle2D.getY() + rectangle2D.getHeight()) * 576.0d) / 72.0d));
    }

    public void setShapeId(int i10) {
        EscherSpRecord escherSpRecord = (EscherSpRecord) this._escherContainer.getChildById(EscherSpRecord.RECORD_ID);
        if (escherSpRecord != null) {
            escherSpRecord.setShapeId(i10);
        }
    }

    public void setShapeType(int i10) {
        ((EscherSpRecord) this._escherContainer.getChildById(EscherSpRecord.RECORD_ID)).setOptions((short) ((i10 << 4) | 2));
    }

    public void setSheet(Sheet sheet) {
        this._sheet = sheet;
    }

    public int getEscherProperty(short s4) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) getEscherProperty((EscherOptRecord) getEscherChild(this._escherContainer, -4085), s4);
        if (escherSimpleProperty == null) {
            return 0;
        }
        return escherSimpleProperty.getPropertyValue();
    }

    public int getEscherProperty(short s4, int i10) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) getEscherProperty((EscherOptRecord) getEscherChild(this._escherContainer, -4085), s4);
        return escherSimpleProperty == null ? i10 : escherSimpleProperty.getPropertyValue();
    }

    public void setEscherProperty(short s4, int i10) {
        setEscherProperty((EscherOptRecord) getEscherChild(this._escherContainer, -4085), s4, i10);
    }

    public void afterInsert(Sheet sheet) {
    }
}
