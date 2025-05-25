package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.java.awt.b;
import lib.zj.office.java.awt.geom.Line2D;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public final class Line extends SimpleShape {
    public Line(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }

    @Override // lib.zj.office.fc.hslf.model.SimpleShape, lib.zj.office.fc.hslf.model.Shape
    public EscherContainerRecord createSpContainer(boolean z10) {
        EscherContainerRecord createSpContainer = super.createSpContainer(z10);
        this._escherContainer = createSpContainer;
        ((EscherSpRecord) createSpContainer.getChildById(EscherSpRecord.RECORD_ID)).setOptions(EscherProperties.GEOMETRY__RIGHT);
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(this._escherContainer, -4085);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.GEOMETRY__SHAPEPATH, 4);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.GEOMETRY__FILLOK, 65536);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.FILL__NOFILLHITTEST, 1048576);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.LINESTYLE__COLOR, 134217729);
        Shape.setEscherProperty(escherOptRecord, EscherProperties.LINESTYLE__NOLINEDRAWDASH, 655368);
        Shape.setEscherProperty(escherOptRecord, (short) 513, 134217730);
        return this._escherContainer;
    }

    @Override // lib.zj.office.fc.hslf.model.SimpleShape, lib.zj.office.fc.hslf.model.Shape
    public void dispose() {
        super.dispose();
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public Float[] getAdjustmentValue() {
        return s.z(getSpContainer());
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public b getOutline() {
        Rectangle2D logicalAnchor2D = getLogicalAnchor2D();
        return new Line2D.Double(logicalAnchor2D.getX(), logicalAnchor2D.getY(), logicalAnchor2D.getX() + logicalAnchor2D.getWidth(), logicalAnchor2D.getY() + logicalAnchor2D.getHeight());
    }

    public Line(Shape shape) {
        super(null, shape);
        this._escherContainer = createSpContainer(shape instanceof ShapeGroup);
    }

    public Line() {
        this(null);
    }
}
