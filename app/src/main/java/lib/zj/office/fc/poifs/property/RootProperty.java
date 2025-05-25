package lib.zj.office.fc.poifs.property;

import lib.zj.office.fc.poifs.storage.SmallDocumentBlock;

/* loaded from: classes3.dex */
public final class RootProperty extends DirectoryProperty {
    private static final String NAME = "Root Entry";

    public RootProperty() {
        super(NAME);
        setNodeColor((byte) 1);
        setPropertyType((byte) 5);
        setStartBlock(-2);
    }

    @Override // lib.zj.office.fc.poifs.property.Property
    public String getName() {
        return NAME;
    }

    @Override // lib.zj.office.fc.poifs.property.Property
    public void setSize(int i10) {
        super.setSize(SmallDocumentBlock.calcSize(i10));
    }

    public RootProperty(int i10, byte[] bArr, int i11) {
        super(i10, bArr, i11);
    }
}
