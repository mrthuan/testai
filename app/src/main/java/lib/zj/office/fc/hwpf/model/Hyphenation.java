package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.hwpf.model.types.HRESIAbstractType;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class Hyphenation extends HRESIAbstractType implements Cloneable {
    public Hyphenation() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Hyphenation.class != obj.getClass()) {
            return false;
        }
        Hyphenation hyphenation = (Hyphenation) obj;
        if (this.field_1_hres == hyphenation.field_1_hres && this.field_2_chHres == hyphenation.field_2_chHres) {
            return true;
        }
        return false;
    }

    public short getValue() {
        byte[] bArr = new byte[2];
        serialize(bArr, 0);
        return LittleEndian.getShort(bArr);
    }

    public int hashCode() {
        return ((this.field_1_hres + 31) * 31) + this.field_2_chHres;
    }

    public boolean isEmpty() {
        if (this.field_1_hres == 0 && this.field_2_chHres == 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hwpf.model.types.HRESIAbstractType
    public String toString() {
        if (isEmpty()) {
            return "[HRESI] EMPTY";
        }
        return super.toString();
    }

    public Hyphenation(short s4) {
        byte[] bArr = new byte[2];
        LittleEndian.putShort(bArr, s4);
        fillFields(bArr, 0);
    }

    public Hyphenation clone() {
        try {
            return (Hyphenation) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
