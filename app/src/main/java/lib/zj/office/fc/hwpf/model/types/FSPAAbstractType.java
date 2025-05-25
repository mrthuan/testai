package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public abstract class FSPAAbstractType {
    protected int field_1_spid;
    protected int field_2_xaLeft;
    protected int field_3_yaTop;
    protected int field_4_xaRight;
    protected int field_5_yaBottom;
    protected short field_6_flags;
    protected int field_7_cTxbx;
    private static BitField fHdr = new BitField(1);
    private static BitField bx = new BitField(6);
    private static BitField by = new BitField(24);
    private static BitField wr = new BitField(480);
    private static BitField wrk = new BitField(7680);
    private static BitField fRcaSimple = new BitField(8192);
    private static BitField fBelowText = new BitField(16384);
    private static BitField fAnchorLock = new BitField(Variant.VT_RESERVED);

    public static int getSize() {
        return 26;
    }

    public void fillFields(byte[] bArr, int i10) {
        this.field_1_spid = LittleEndian.getInt(bArr, i10 + 0);
        this.field_2_xaLeft = LittleEndian.getInt(bArr, i10 + 4);
        this.field_3_yaTop = LittleEndian.getInt(bArr, i10 + 8);
        this.field_4_xaRight = LittleEndian.getInt(bArr, i10 + 12);
        this.field_5_yaBottom = LittleEndian.getInt(bArr, i10 + 16);
        this.field_6_flags = LittleEndian.getShort(bArr, i10 + 20);
        this.field_7_cTxbx = LittleEndian.getInt(bArr, i10 + 22);
    }

    @Internal
    public byte getBx() {
        return (byte) bx.getValue(this.field_6_flags);
    }

    @Internal
    public byte getBy() {
        return (byte) by.getValue(this.field_6_flags);
    }

    @Internal
    public int getCTxbx() {
        return this.field_7_cTxbx;
    }

    @Internal
    public short getFlags() {
        return this.field_6_flags;
    }

    @Internal
    public int getSpid() {
        return this.field_1_spid;
    }

    @Internal
    public byte getWr() {
        return (byte) wr.getValue(this.field_6_flags);
    }

    @Internal
    public byte getWrk() {
        return (byte) wrk.getValue(this.field_6_flags);
    }

    @Internal
    public int getXaLeft() {
        return this.field_2_xaLeft;
    }

    @Internal
    public int getXaRight() {
        return this.field_4_xaRight;
    }

    @Internal
    public int getYaBottom() {
        return this.field_5_yaBottom;
    }

    @Internal
    public int getYaTop() {
        return this.field_3_yaTop;
    }

    @Internal
    public boolean isFAnchorLock() {
        return fAnchorLock.isSet(this.field_6_flags);
    }

    @Internal
    public boolean isFBelowText() {
        return fBelowText.isSet(this.field_6_flags);
    }

    @Internal
    public boolean isFHdr() {
        return fHdr.isSet(this.field_6_flags);
    }

    @Internal
    public boolean isFRcaSimple() {
        return fRcaSimple.isSet(this.field_6_flags);
    }

    public void serialize(byte[] bArr, int i10) {
        LittleEndian.putInt(bArr, i10 + 0, this.field_1_spid);
        LittleEndian.putInt(bArr, i10 + 4, this.field_2_xaLeft);
        LittleEndian.putInt(bArr, i10 + 8, this.field_3_yaTop);
        LittleEndian.putInt(bArr, i10 + 12, this.field_4_xaRight);
        LittleEndian.putInt(bArr, i10 + 16, this.field_5_yaBottom);
        LittleEndian.putShort(bArr, i10 + 20, this.field_6_flags);
        LittleEndian.putInt(bArr, i10 + 22, this.field_7_cTxbx);
    }

    @Internal
    public void setBx(byte b10) {
        this.field_6_flags = (short) bx.setValue(this.field_6_flags, b10);
    }

    @Internal
    public void setBy(byte b10) {
        this.field_6_flags = (short) by.setValue(this.field_6_flags, b10);
    }

    @Internal
    public void setCTxbx(int i10) {
        this.field_7_cTxbx = i10;
    }

    @Internal
    public void setFAnchorLock(boolean z10) {
        this.field_6_flags = (short) fAnchorLock.setBoolean(this.field_6_flags, z10);
    }

    @Internal
    public void setFBelowText(boolean z10) {
        this.field_6_flags = (short) fBelowText.setBoolean(this.field_6_flags, z10);
    }

    @Internal
    public void setFHdr(boolean z10) {
        this.field_6_flags = (short) fHdr.setBoolean(this.field_6_flags, z10);
    }

    @Internal
    public void setFRcaSimple(boolean z10) {
        this.field_6_flags = (short) fRcaSimple.setBoolean(this.field_6_flags, z10);
    }

    @Internal
    public void setFlags(short s4) {
        this.field_6_flags = s4;
    }

    @Internal
    public void setSpid(int i10) {
        this.field_1_spid = i10;
    }

    @Internal
    public void setWr(byte b10) {
        this.field_6_flags = (short) wr.setValue(this.field_6_flags, b10);
    }

    @Internal
    public void setWrk(byte b10) {
        this.field_6_flags = (short) wrk.setValue(this.field_6_flags, b10);
    }

    @Internal
    public void setXaLeft(int i10) {
        this.field_2_xaLeft = i10;
    }

    @Internal
    public void setXaRight(int i10) {
        this.field_4_xaRight = i10;
    }

    @Internal
    public void setYaBottom(int i10) {
        this.field_5_yaBottom = i10;
    }

    @Internal
    public void setYaTop(int i10) {
        this.field_3_yaTop = i10;
    }

    public String toString() {
        return "[FSPA]\n    .spid                 =  (" + getSpid() + " )\n    .xaLeft               =  (" + getXaLeft() + " )\n    .yaTop                =  (" + getYaTop() + " )\n    .xaRight              =  (" + getXaRight() + " )\n    .yaBottom             =  (" + getYaBottom() + " )\n    .flags                =  (" + ((int) getFlags()) + " )\n         .fHdr                     = " + isFHdr() + "\n         .bx                       = " + ((int) getBx()) + "\n         .by                       = " + ((int) getBy()) + "\n         .wr                       = " + ((int) getWr()) + "\n         .wrk                      = " + ((int) getWrk()) + "\n         .fRcaSimple               = " + isFRcaSimple() + "\n         .fBelowText               = " + isFBelowText() + "\n         .fAnchorLock              = " + isFAnchorLock() + "\n    .cTxbx                =  (" + getCTxbx() + " )\n[/FSPA]\n";
    }
}
