package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public abstract class FRDAbstractType {
    protected short field_1_nAuto;

    public static int getSize() {
        return 2;
    }

    public void fillFields(byte[] bArr, int i10) {
        this.field_1_nAuto = LittleEndian.getShort(bArr, i10 + 0);
    }

    public short getNAuto() {
        return this.field_1_nAuto;
    }

    public void serialize(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10 + 0, this.field_1_nAuto);
    }

    public void setNAuto(short s4) {
        this.field_1_nAuto = s4;
    }

    public String toString() {
        return "[FRD]\n    .nAuto                =  (" + ((int) getNAuto()) + " )\n[/FRD]\n";
    }
}
