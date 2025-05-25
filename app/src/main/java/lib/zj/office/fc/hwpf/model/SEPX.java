package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.hwpf.sprm.SectionSprmCompressor;
import lib.zj.office.fc.hwpf.sprm.SectionSprmUncompressor;
import lib.zj.office.fc.hwpf.sprm.SprmBuffer;
import lib.zj.office.fc.hwpf.usermodel.SectionProperties;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class SEPX extends PropertyNode<SEPX> {
    SectionDescriptor _sed;
    SectionProperties sectionProperties;

    public SEPX(SectionDescriptor sectionDescriptor, int i10, int i11, byte[] bArr) {
        super(i10, i11, new SprmBuffer(bArr, 0));
        this._sed = sectionDescriptor;
    }

    @Override // lib.zj.office.fc.hwpf.model.PropertyNode
    public boolean equals(Object obj) {
        SEPX sepx = (SEPX) obj;
        if (super.equals(obj)) {
            return sepx._sed.equals(this._sed);
        }
        return false;
    }

    public byte[] getGrpprl() {
        SectionProperties sectionProperties = this.sectionProperties;
        if (sectionProperties != null) {
            this._buf = new SprmBuffer(SectionSprmCompressor.compressSectionProperty(sectionProperties), 0);
        }
        return ((SprmBuffer) this._buf).toByteArray();
    }

    public SectionDescriptor getSectionDescriptor() {
        return this._sed;
    }

    public SectionProperties getSectionProperties() {
        if (this.sectionProperties == null) {
            this.sectionProperties = SectionSprmUncompressor.uncompressSEP(((SprmBuffer) this._buf).toByteArray(), 0);
        }
        return this.sectionProperties;
    }

    public String toString() {
        return "SEPX from " + getStart() + " to " + getEnd();
    }
}
