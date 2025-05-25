package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.hwpf.model.types.FRDAbstractType;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class FootnoteReferenceDescriptor extends FRDAbstractType implements Cloneable {
    public FootnoteReferenceDescriptor() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FootnoteReferenceDescriptor.class == obj.getClass() && this.field_1_nAuto == ((FootnoteReferenceDescriptor) obj).field_1_nAuto) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 31 + this.field_1_nAuto;
    }

    public boolean isEmpty() {
        if (this.field_1_nAuto == 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hwpf.model.types.FRDAbstractType
    public String toString() {
        if (isEmpty()) {
            return "[FRD] EMPTY";
        }
        return super.toString();
    }

    public FootnoteReferenceDescriptor(byte[] bArr, int i10) {
        fillFields(bArr, i10);
    }

    public FootnoteReferenceDescriptor clone() {
        try {
            return (FootnoteReferenceDescriptor) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
