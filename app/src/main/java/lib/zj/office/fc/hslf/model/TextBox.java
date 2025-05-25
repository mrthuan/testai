package lib.zj.office.fc.hslf.model;

import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherProperties;

/* loaded from: classes3.dex */
public class TextBox extends TextShape {
    public TextBox(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }

    @Override // lib.zj.office.fc.hslf.model.SimpleShape, lib.zj.office.fc.hslf.model.Shape
    public EscherContainerRecord createSpContainer(boolean z10) {
        this._escherContainer = super.createSpContainer(z10);
        setShapeType(202);
        setEscherProperty(EscherProperties.FILL__FILLCOLOR, 134217732);
        setEscherProperty(EscherProperties.FILL__FILLBACKCOLOR, 134217728);
        setEscherProperty(EscherProperties.FILL__NOFILLHITTEST, 1048576);
        setEscherProperty(EscherProperties.LINESTYLE__COLOR, 134217729);
        setEscherProperty(EscherProperties.LINESTYLE__NOLINEDRAWDASH, 524288);
        setEscherProperty((short) 513, 134217730);
        this._txtrun = createTextRun();
        return this._escherContainer;
    }

    @Override // lib.zj.office.fc.hslf.model.TextShape
    public void setDefaultTextProperties(TextRun textRun) {
        setVerticalAlignment(0);
        setEscherProperty(EscherProperties.TEXT__SIZE_TEXT_TO_FIT_SHAPE, 131074);
    }

    public TextBox(Shape shape) {
        super(shape);
    }

    public TextBox() {
        this(null);
    }
}
