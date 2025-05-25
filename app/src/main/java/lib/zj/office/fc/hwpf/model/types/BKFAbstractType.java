package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public abstract class BKFAbstractType {
    protected short field_1_ibkl;
    protected short field_2_bkf_flags;
    private static BitField itcFirst = new BitField(ShapeTypes.VERTICAL_SCROLL);
    private static BitField fPub = new BitField(128);
    private static BitField itcLim = new BitField(32512);
    private static BitField fCol = new BitField(Variant.VT_RESERVED);

    public static int getSize() {
        return 4;
    }

    public void fillFields(byte[] bArr, int i10) {
        this.field_1_ibkl = LittleEndian.getShort(bArr, i10 + 0);
        this.field_2_bkf_flags = LittleEndian.getShort(bArr, i10 + 2);
    }

    public short getBkf_flags() {
        return this.field_2_bkf_flags;
    }

    public short getIbkl() {
        return this.field_1_ibkl;
    }

    public byte getItcFirst() {
        return (byte) itcFirst.getValue(this.field_2_bkf_flags);
    }

    public byte getItcLim() {
        return (byte) itcLim.getValue(this.field_2_bkf_flags);
    }

    public boolean isFCol() {
        return fCol.isSet(this.field_2_bkf_flags);
    }

    public boolean isFPub() {
        return fPub.isSet(this.field_2_bkf_flags);
    }

    public void serialize(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10 + 0, this.field_1_ibkl);
        LittleEndian.putShort(bArr, i10 + 2, this.field_2_bkf_flags);
    }

    public void setBkf_flags(short s4) {
        this.field_2_bkf_flags = s4;
    }

    public void setFCol(boolean z10) {
        this.field_2_bkf_flags = (short) fCol.setBoolean(this.field_2_bkf_flags, z10);
    }

    public void setFPub(boolean z10) {
        this.field_2_bkf_flags = (short) fPub.setBoolean(this.field_2_bkf_flags, z10);
    }

    public void setIbkl(short s4) {
        this.field_1_ibkl = s4;
    }

    public void setItcFirst(byte b10) {
        this.field_2_bkf_flags = (short) itcFirst.setValue(this.field_2_bkf_flags, b10);
    }

    public void setItcLim(byte b10) {
        this.field_2_bkf_flags = (short) itcLim.setValue(this.field_2_bkf_flags, b10);
    }

    public String toString() {
        return "[BKF]\n    .ibkl                 =  (" + ((int) getIbkl()) + " )\n    .bkf_flags            =  (" + ((int) getBkf_flags()) + " )\n         .itcFirst                 = " + ((int) getItcFirst()) + "\n         .fPub                     = " + isFPub() + "\n         .itcLim                   = " + ((int) getItcLim()) + "\n         .fCol                     = " + isFCol() + "\n[/BKF]\n";
    }
}
