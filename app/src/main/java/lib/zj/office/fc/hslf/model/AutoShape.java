package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.java.awt.b;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public class AutoShape extends TextShape {
    public AutoShape(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }

    public EscherContainerRecord createSpContainer(int i10, boolean z10) {
        this._escherContainer = super.createSpContainer(z10);
        setShapeType(i10);
        setEscherProperty(EscherProperties.PROTECTION__LOCKAGAINSTGROUPING, 262144);
        setEscherProperty(EscherProperties.FILL__FILLCOLOR, 134217732);
        setEscherProperty(EscherProperties.FILL__FILLCOLOR, 134217732);
        setEscherProperty(EscherProperties.FILL__FILLBACKCOLOR, 134217728);
        setEscherProperty(EscherProperties.FILL__NOFILLHITTEST, 1048592);
        setEscherProperty(EscherProperties.LINESTYLE__COLOR, 134217729);
        setEscherProperty(EscherProperties.LINESTYLE__NOLINEDRAWDASH, 524296);
        setEscherProperty((short) 513, 134217730);
        return this._escherContainer;
    }

    @Override // lib.zj.office.fc.hslf.model.TextShape, lib.zj.office.fc.hslf.model.SimpleShape, lib.zj.office.fc.hslf.model.Shape
    public void dispose() {
        super.dispose();
    }

    public int getAdjustmentValue(int i10) {
        if (i10 >= 0 && i10 <= 9) {
            return s.G(this._escherContainer, (short) (i10 + 327), 0);
        }
        throw new IllegalArgumentException("The index of an adjustment value must be in the [0, 9] range");
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public b getOutline() {
        ShapeOutline shapeOutline = AutoShapes.getShapeOutline(getShapeType());
        Rectangle2D logicalAnchor2D = getLogicalAnchor2D();
        if (shapeOutline == null) {
            return logicalAnchor2D;
        }
        return AutoShapes.transform(shapeOutline.getOutline(this), logicalAnchor2D);
    }

    public void setAdjustmentValue(int i10, int i11) {
        if (i10 >= 0 && i10 <= 9) {
            setEscherProperty((short) (i10 + 327), i11);
            return;
        }
        throw new IllegalArgumentException("The index of an adjustment value must be in the [0, 9] range");
    }

    @Override // lib.zj.office.fc.hslf.model.TextShape
    public void setDefaultTextProperties(TextRun textRun) {
        setVerticalAlignment(1);
        setHorizontalAlignment(1);
        setWordWrap(2);
    }

    public AutoShape(int i10, Shape shape) {
        super(null, shape);
        this._escherContainer = createSpContainer(i10, shape instanceof ShapeGroup);
    }

    public AutoShape(int i10) {
        this(i10, (Shape) null);
    }
}
