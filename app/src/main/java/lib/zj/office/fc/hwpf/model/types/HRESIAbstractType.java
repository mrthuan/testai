package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public abstract class HRESIAbstractType {
    public static final byte HRES_ADD_LETTER_BEFORE = 2;
    public static final byte HRES_CHANGE_LETTER_AFTER = 5;
    public static final byte HRES_CHANGE_LETTER_BEFORE = 3;
    public static final byte HRES_DELETE_BEFORE_CHANGE_BEFORE = 6;
    public static final byte HRES_DELETE_LETTER_BEFORE = 4;
    public static final byte HRES_NO = 0;
    public static final byte HRES_NORMAL = 1;
    protected byte field_1_hres;
    protected byte field_2_chHres;

    public static int getSize() {
        return 6;
    }

    public void fillFields(byte[] bArr, int i10) {
        this.field_1_hres = bArr[i10 + 0];
        this.field_2_chHres = bArr[i10 + 1];
    }

    public byte getChHres() {
        return this.field_2_chHres;
    }

    public byte getHres() {
        return this.field_1_hres;
    }

    public void serialize(byte[] bArr, int i10) {
        bArr[i10 + 0] = this.field_1_hres;
        bArr[i10 + 1] = this.field_2_chHres;
    }

    public void setChHres(byte b10) {
        this.field_2_chHres = b10;
    }

    public void setHres(byte b10) {
        this.field_1_hres = b10;
    }

    public String toString() {
        return "[HRESI]\n    .hres                 =  (" + ((int) getHres()) + " )\n    .chHres               =  (" + ((int) getChHres()) + " )\n[/HRESI]\n";
    }
}
