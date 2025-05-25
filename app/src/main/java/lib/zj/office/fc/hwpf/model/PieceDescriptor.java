package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class PieceDescriptor {
    short descriptor;

    /* renamed from: fc  reason: collision with root package name */
    int f20675fc;
    PropertyModifier prm;
    boolean unicode;

    public PieceDescriptor(byte[] bArr, int i10) {
        this.descriptor = LittleEndian.getShort(bArr, i10);
        int i11 = i10 + 2;
        this.f20675fc = LittleEndian.getInt(bArr, i11);
        this.prm = new PropertyModifier(LittleEndian.getShort(bArr, i11 + 4));
        int i12 = this.f20675fc;
        if ((1073741824 & i12) == 0) {
            this.unicode = true;
            return;
        }
        this.unicode = false;
        int i13 = i12 & (-1073741825);
        this.f20675fc = i13;
        this.f20675fc = i13 / 2;
    }

    public static int getSizeInBytes() {
        return 8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PieceDescriptor.class != obj.getClass()) {
            return false;
        }
        PieceDescriptor pieceDescriptor = (PieceDescriptor) obj;
        if (this.descriptor != pieceDescriptor.descriptor) {
            return false;
        }
        PropertyModifier propertyModifier = this.prm;
        if (propertyModifier == null) {
            if (pieceDescriptor.prm != null) {
                return false;
            }
        } else if (!propertyModifier.equals(pieceDescriptor.prm)) {
            return false;
        }
        if (this.unicode == pieceDescriptor.unicode) {
            return true;
        }
        return false;
    }

    public int getFilePosition() {
        return this.f20675fc;
    }

    public PropertyModifier getPrm() {
        return this.prm;
    }

    public int hashCode() {
        int hashCode;
        int i10;
        int i11 = (this.descriptor + 31) * 31;
        PropertyModifier propertyModifier = this.prm;
        if (propertyModifier == null) {
            hashCode = 0;
        } else {
            hashCode = propertyModifier.hashCode();
        }
        int i12 = (i11 + hashCode) * 31;
        if (this.unicode) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return i12 + i10;
    }

    public boolean isUnicode() {
        return this.unicode;
    }

    public void setFilePosition(int i10) {
        this.f20675fc = i10;
    }

    public byte[] toByteArray() {
        int i10 = this.f20675fc;
        if (!this.unicode) {
            i10 = (i10 * 2) | 1073741824;
        }
        byte[] bArr = new byte[8];
        LittleEndian.putShort(bArr, 0, this.descriptor);
        LittleEndian.putInt(bArr, 2, i10);
        LittleEndian.putShort(bArr, 6, this.prm.getValue());
        return bArr;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PieceDescriptor (pos: ");
        sb2.append(getFilePosition());
        sb2.append("; ");
        if (isUnicode()) {
            str = "unicode";
        } else {
            str = "non-unicode";
        }
        sb2.append(str);
        sb2.append("; prm: ");
        sb2.append(getPrm());
        sb2.append(")");
        return sb2.toString();
    }
}
