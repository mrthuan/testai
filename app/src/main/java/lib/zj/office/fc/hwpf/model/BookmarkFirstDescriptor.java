package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.hwpf.model.types.BKFAbstractType;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class BookmarkFirstDescriptor extends BKFAbstractType implements Cloneable {
    public BookmarkFirstDescriptor() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BookmarkFirstDescriptor.class != obj.getClass()) {
            return false;
        }
        BookmarkFirstDescriptor bookmarkFirstDescriptor = (BookmarkFirstDescriptor) obj;
        if (this.field_1_ibkl == bookmarkFirstDescriptor.field_1_ibkl && this.field_2_bkf_flags == bookmarkFirstDescriptor.field_2_bkf_flags) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.field_1_ibkl + 31) * 31) + this.field_2_bkf_flags;
    }

    public boolean isEmpty() {
        if (this.field_1_ibkl == 0 && this.field_2_bkf_flags == 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hwpf.model.types.BKFAbstractType
    public String toString() {
        if (isEmpty()) {
            return "[BKF] EMPTY";
        }
        return super.toString();
    }

    public BookmarkFirstDescriptor(byte[] bArr, int i10) {
        fillFields(bArr, i10);
    }

    public BookmarkFirstDescriptor clone() {
        try {
            return (BookmarkFirstDescriptor) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
