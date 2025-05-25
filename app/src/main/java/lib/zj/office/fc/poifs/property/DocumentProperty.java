package lib.zj.office.fc.poifs.property;

import lib.zj.office.fc.poifs.filesystem.POIFSDocument;

/* loaded from: classes3.dex */
public class DocumentProperty extends Property {
    private POIFSDocument _document;

    public DocumentProperty(String str, int i10) {
        this._document = null;
        setName(str);
        setSize(i10);
        setNodeColor((byte) 1);
        setPropertyType((byte) 2);
    }

    public POIFSDocument getDocument() {
        return this._document;
    }

    @Override // lib.zj.office.fc.poifs.property.Property
    public boolean isDirectory() {
        return false;
    }

    public void setDocument(POIFSDocument pOIFSDocument) {
        this._document = pOIFSDocument;
    }

    @Override // lib.zj.office.fc.poifs.property.Property
    public boolean shouldUseSmallBlocks() {
        return super.shouldUseSmallBlocks();
    }

    public DocumentProperty(int i10, byte[] bArr, int i11) {
        super(i10, bArr, i11);
        this._document = null;
    }

    @Override // lib.zj.office.fc.poifs.property.Property
    public void preWrite() {
    }
}
