package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.hwpf.model.types.TLPAbstractType;

/* loaded from: classes3.dex */
public class TableAutoformatLookSpecifier extends TLPAbstractType implements Cloneable {
    public static final int SIZE = 4;

    public TableAutoformatLookSpecifier() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableAutoformatLookSpecifier tableAutoformatLookSpecifier = (TableAutoformatLookSpecifier) obj;
        if (this.field_1_itl == tableAutoformatLookSpecifier.field_1_itl && this.field_2_tlp_flags == tableAutoformatLookSpecifier.field_2_tlp_flags) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.field_1_itl + 31) * 31) + this.field_2_tlp_flags;
    }

    public boolean isEmpty() {
        if (this.field_1_itl == 0 && this.field_2_tlp_flags == 0) {
            return true;
        }
        return false;
    }

    public TableAutoformatLookSpecifier(byte[] bArr, int i10) {
        fillFields(bArr, i10);
    }

    public TableAutoformatLookSpecifier clone() {
        try {
            return (TableAutoformatLookSpecifier) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new Error(e10.getMessage(), e10);
        }
    }
}
