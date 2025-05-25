package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public abstract class LFOAbstractType {
    protected int field_1_lsid;
    protected int field_2_reserved1;
    protected int field_3_reserved2;
    protected byte field_4_clfolvl;
    protected byte field_5_ibstFltAutoNum;
    protected byte field_6_grfhic;
    protected byte field_7_reserved3;
    private static BitField fHtmlChecked = new BitField(1);
    private static BitField fHtmlUnsupported = new BitField(2);
    private static BitField fHtmlListTextNotSharpDot = new BitField(4);
    private static BitField fHtmlNotPeriod = new BitField(8);
    private static BitField fHtmlFirstLineMismatch = new BitField(16);
    private static BitField fHtmlTabLeftIndentMismatch = new BitField(32);
    private static BitField fHtmlHangingIndentBeneathNumber = new BitField(64);
    private static BitField fHtmlBuiltInBullet = new BitField(128);

    public static int getSize() {
        return 16;
    }

    public void fillFields(byte[] bArr, int i10) {
        this.field_1_lsid = LittleEndian.getInt(bArr, i10 + 0);
        this.field_2_reserved1 = LittleEndian.getInt(bArr, i10 + 4);
        this.field_3_reserved2 = LittleEndian.getInt(bArr, i10 + 8);
        this.field_4_clfolvl = bArr[i10 + 12];
        this.field_5_ibstFltAutoNum = bArr[i10 + 13];
        this.field_6_grfhic = bArr[i10 + 14];
        this.field_7_reserved3 = bArr[i10 + 15];
    }

    public byte getClfolvl() {
        return this.field_4_clfolvl;
    }

    public byte getGrfhic() {
        return this.field_6_grfhic;
    }

    public byte getIbstFltAutoNum() {
        return this.field_5_ibstFltAutoNum;
    }

    public int getLsid() {
        return this.field_1_lsid;
    }

    public int getReserved1() {
        return this.field_2_reserved1;
    }

    public int getReserved2() {
        return this.field_3_reserved2;
    }

    public byte getReserved3() {
        return this.field_7_reserved3;
    }

    public boolean isFHtmlBuiltInBullet() {
        return fHtmlBuiltInBullet.isSet(this.field_6_grfhic);
    }

    public boolean isFHtmlChecked() {
        return fHtmlChecked.isSet(this.field_6_grfhic);
    }

    public boolean isFHtmlFirstLineMismatch() {
        return fHtmlFirstLineMismatch.isSet(this.field_6_grfhic);
    }

    public boolean isFHtmlHangingIndentBeneathNumber() {
        return fHtmlHangingIndentBeneathNumber.isSet(this.field_6_grfhic);
    }

    public boolean isFHtmlListTextNotSharpDot() {
        return fHtmlListTextNotSharpDot.isSet(this.field_6_grfhic);
    }

    public boolean isFHtmlNotPeriod() {
        return fHtmlNotPeriod.isSet(this.field_6_grfhic);
    }

    public boolean isFHtmlTabLeftIndentMismatch() {
        return fHtmlTabLeftIndentMismatch.isSet(this.field_6_grfhic);
    }

    public boolean isFHtmlUnsupported() {
        return fHtmlUnsupported.isSet(this.field_6_grfhic);
    }

    public void serialize(byte[] bArr, int i10) {
        LittleEndian.putInt(bArr, i10 + 0, this.field_1_lsid);
        LittleEndian.putInt(bArr, i10 + 4, this.field_2_reserved1);
        LittleEndian.putInt(bArr, i10 + 8, this.field_3_reserved2);
        bArr[i10 + 12] = this.field_4_clfolvl;
        bArr[i10 + 13] = this.field_5_ibstFltAutoNum;
        bArr[i10 + 14] = this.field_6_grfhic;
        bArr[i10 + 15] = this.field_7_reserved3;
    }

    public void setClfolvl(byte b10) {
        this.field_4_clfolvl = b10;
    }

    public void setFHtmlBuiltInBullet(boolean z10) {
        this.field_6_grfhic = (byte) fHtmlBuiltInBullet.setBoolean(this.field_6_grfhic, z10);
    }

    public void setFHtmlChecked(boolean z10) {
        this.field_6_grfhic = (byte) fHtmlChecked.setBoolean(this.field_6_grfhic, z10);
    }

    public void setFHtmlFirstLineMismatch(boolean z10) {
        this.field_6_grfhic = (byte) fHtmlFirstLineMismatch.setBoolean(this.field_6_grfhic, z10);
    }

    public void setFHtmlHangingIndentBeneathNumber(boolean z10) {
        this.field_6_grfhic = (byte) fHtmlHangingIndentBeneathNumber.setBoolean(this.field_6_grfhic, z10);
    }

    public void setFHtmlListTextNotSharpDot(boolean z10) {
        this.field_6_grfhic = (byte) fHtmlListTextNotSharpDot.setBoolean(this.field_6_grfhic, z10);
    }

    public void setFHtmlNotPeriod(boolean z10) {
        this.field_6_grfhic = (byte) fHtmlNotPeriod.setBoolean(this.field_6_grfhic, z10);
    }

    public void setFHtmlTabLeftIndentMismatch(boolean z10) {
        this.field_6_grfhic = (byte) fHtmlTabLeftIndentMismatch.setBoolean(this.field_6_grfhic, z10);
    }

    public void setFHtmlUnsupported(boolean z10) {
        this.field_6_grfhic = (byte) fHtmlUnsupported.setBoolean(this.field_6_grfhic, z10);
    }

    public void setGrfhic(byte b10) {
        this.field_6_grfhic = b10;
    }

    public void setIbstFltAutoNum(byte b10) {
        this.field_5_ibstFltAutoNum = b10;
    }

    public void setLsid(int i10) {
        this.field_1_lsid = i10;
    }

    public void setReserved1(int i10) {
        this.field_2_reserved1 = i10;
    }

    public void setReserved2(int i10) {
        this.field_3_reserved2 = i10;
    }

    public void setReserved3(byte b10) {
        this.field_7_reserved3 = b10;
    }

    public String toString() {
        return "[LFO]\n    .lsid                 =  (" + getLsid() + " )\n    .reserved1            =  (" + getReserved1() + " )\n    .reserved2            =  (" + getReserved2() + " )\n    .clfolvl              =  (" + ((int) getClfolvl()) + " )\n    .ibstFltAutoNum       =  (" + ((int) getIbstFltAutoNum()) + " )\n    .grfhic               =  (" + ((int) getGrfhic()) + " )\n         .fHtmlChecked             = " + isFHtmlChecked() + "\n         .fHtmlUnsupported         = " + isFHtmlUnsupported() + "\n         .fHtmlListTextNotSharpDot     = " + isFHtmlListTextNotSharpDot() + "\n         .fHtmlNotPeriod           = " + isFHtmlNotPeriod() + "\n         .fHtmlFirstLineMismatch     = " + isFHtmlFirstLineMismatch() + "\n         .fHtmlTabLeftIndentMismatch     = " + isFHtmlTabLeftIndentMismatch() + "\n         .fHtmlHangingIndentBeneathNumber     = " + isFHtmlHangingIndentBeneathNumber() + "\n         .fHtmlBuiltInBullet       = " + isFHtmlBuiltInBullet() + "\n    .reserved3            =  (" + ((int) getReserved3()) + " )\n[/LFO]\n";
    }
}
