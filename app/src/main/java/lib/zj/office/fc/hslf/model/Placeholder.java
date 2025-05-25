package lib.zj.office.fc.hslf.model;

import lib.zj.office.fc.ddf.EscherContainerRecord;

/* loaded from: classes3.dex */
public final class Placeholder extends TextBox {
    public Placeholder(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }

    @Override // lib.zj.office.fc.hslf.model.TextBox, lib.zj.office.fc.hslf.model.SimpleShape, lib.zj.office.fc.hslf.model.Shape
    public EscherContainerRecord createSpContainer(boolean z10) {
        EscherContainerRecord createSpContainer = super.createSpContainer(z10);
        this._escherContainer = createSpContainer;
        return createSpContainer;
    }

    public Placeholder(Shape shape) {
        super(shape);
    }

    public Placeholder() {
    }
}
