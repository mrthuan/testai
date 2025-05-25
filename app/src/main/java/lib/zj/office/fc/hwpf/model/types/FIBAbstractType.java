package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hwpf.model.HDFType;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public abstract class FIBAbstractType implements HDFType {
    protected short field_10_history;
    protected int field_11_chs;
    protected int field_12_chsTables;
    protected int field_13_fcMin;
    protected int field_14_fcMac;
    protected int field_1_wIdent;
    protected int field_2_nFib;
    protected int field_3_nProduct;
    protected int field_4_lid;
    protected int field_5_pnNext;
    protected short field_6_options;
    protected int field_7_nFibBack;
    protected int field_8_lKey;
    protected int field_9_envr;
    private static BitField fDot = BitFieldFactory.getInstance(1);
    private static BitField fGlsy = BitFieldFactory.getInstance(2);
    private static BitField fComplex = BitFieldFactory.getInstance(4);
    private static BitField fHasPic = BitFieldFactory.getInstance(8);
    private static BitField cQuickSaves = BitFieldFactory.getInstance(240);
    private static BitField fEncrypted = BitFieldFactory.getInstance(256);
    private static BitField fWhichTblStm = BitFieldFactory.getInstance(512);
    private static BitField fReadOnlyRecommended = BitFieldFactory.getInstance(1024);
    private static BitField fWriteReservation = BitFieldFactory.getInstance(2048);
    private static BitField fExtChar = BitFieldFactory.getInstance(4096);
    private static BitField fLoadOverride = BitFieldFactory.getInstance(8192);
    private static BitField fFarEast = BitFieldFactory.getInstance(16384);
    private static BitField fCrypto = BitFieldFactory.getInstance(Variant.VT_RESERVED);
    private static BitField fMac = BitFieldFactory.getInstance(1);
    private static BitField fEmptySpecial = BitFieldFactory.getInstance(2);
    private static BitField fLoadOverridePage = BitFieldFactory.getInstance(4);
    private static BitField fFutureSavedUndo = BitFieldFactory.getInstance(8);
    private static BitField fWord97Saved = BitFieldFactory.getInstance(16);
    private static BitField fSpare0 = BitFieldFactory.getInstance(254);

    public void fillFields(byte[] bArr, int i10) {
        this.field_1_wIdent = LittleEndian.getShort(bArr, i10 + 0);
        this.field_2_nFib = LittleEndian.getShort(bArr, i10 + 2);
        this.field_3_nProduct = LittleEndian.getShort(bArr, i10 + 4);
        this.field_4_lid = LittleEndian.getShort(bArr, i10 + 6);
        this.field_5_pnNext = LittleEndian.getShort(bArr, i10 + 8);
        this.field_6_options = LittleEndian.getShort(bArr, i10 + 10);
        this.field_7_nFibBack = LittleEndian.getShort(bArr, i10 + 12);
        this.field_8_lKey = LittleEndian.getShort(bArr, i10 + 14);
        this.field_9_envr = LittleEndian.getShort(bArr, i10 + 16);
        this.field_10_history = LittleEndian.getShort(bArr, i10 + 18);
        this.field_11_chs = LittleEndian.getShort(bArr, i10 + 20);
        this.field_12_chsTables = LittleEndian.getShort(bArr, i10 + 22);
        this.field_13_fcMin = LittleEndian.getInt(bArr, i10 + 24);
        this.field_14_fcMac = LittleEndian.getInt(bArr, i10 + 28);
    }

    public byte getCQuickSaves() {
        return (byte) cQuickSaves.getValue(this.field_6_options);
    }

    public int getChs() {
        return this.field_11_chs;
    }

    public int getChsTables() {
        return this.field_12_chsTables;
    }

    public int getEnvr() {
        return this.field_9_envr;
    }

    public byte getFSpare0() {
        return (byte) fSpare0.getValue(this.field_10_history);
    }

    public int getFcMac() {
        return this.field_14_fcMac;
    }

    public int getFcMin() {
        return this.field_13_fcMin;
    }

    public short getHistory() {
        return this.field_10_history;
    }

    public int getLKey() {
        return this.field_8_lKey;
    }

    public int getLid() {
        return this.field_4_lid;
    }

    public int getNFib() {
        return this.field_2_nFib;
    }

    public int getNFibBack() {
        return this.field_7_nFibBack;
    }

    public int getNProduct() {
        return this.field_3_nProduct;
    }

    public short getOptions() {
        return this.field_6_options;
    }

    public int getPnNext() {
        return this.field_5_pnNext;
    }

    public int getSize() {
        return 32;
    }

    public int getWIdent() {
        return this.field_1_wIdent;
    }

    public boolean isFComplex() {
        return fComplex.isSet(this.field_6_options);
    }

    public boolean isFCrypto() {
        return fCrypto.isSet(this.field_6_options);
    }

    public boolean isFDot() {
        return fDot.isSet(this.field_6_options);
    }

    public boolean isFEmptySpecial() {
        return fEmptySpecial.isSet(this.field_10_history);
    }

    public boolean isFEncrypted() {
        return fEncrypted.isSet(this.field_6_options);
    }

    public boolean isFExtChar() {
        return fExtChar.isSet(this.field_6_options);
    }

    public boolean isFFarEast() {
        return fFarEast.isSet(this.field_6_options);
    }

    public boolean isFFutureSavedUndo() {
        return fFutureSavedUndo.isSet(this.field_10_history);
    }

    public boolean isFGlsy() {
        return fGlsy.isSet(this.field_6_options);
    }

    public boolean isFHasPic() {
        return fHasPic.isSet(this.field_6_options);
    }

    public boolean isFLoadOverride() {
        return fLoadOverride.isSet(this.field_6_options);
    }

    public boolean isFLoadOverridePage() {
        return fLoadOverridePage.isSet(this.field_10_history);
    }

    public boolean isFMac() {
        return fMac.isSet(this.field_10_history);
    }

    public boolean isFReadOnlyRecommended() {
        return fReadOnlyRecommended.isSet(this.field_6_options);
    }

    public boolean isFWhichTblStm() {
        return fWhichTblStm.isSet(this.field_6_options);
    }

    public boolean isFWord97Saved() {
        return fWord97Saved.isSet(this.field_10_history);
    }

    public boolean isFWriteReservation() {
        return fWriteReservation.isSet(this.field_6_options);
    }

    public void serialize(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10 + 0, (short) this.field_1_wIdent);
        LittleEndian.putShort(bArr, i10 + 2, (short) this.field_2_nFib);
        LittleEndian.putShort(bArr, i10 + 4, (short) this.field_3_nProduct);
        LittleEndian.putShort(bArr, i10 + 6, (short) this.field_4_lid);
        LittleEndian.putShort(bArr, i10 + 8, (short) this.field_5_pnNext);
        LittleEndian.putShort(bArr, i10 + 10, this.field_6_options);
        LittleEndian.putShort(bArr, i10 + 12, (short) this.field_7_nFibBack);
        LittleEndian.putShort(bArr, i10 + 14, (short) this.field_8_lKey);
        LittleEndian.putShort(bArr, i10 + 16, (short) this.field_9_envr);
        LittleEndian.putShort(bArr, i10 + 18, this.field_10_history);
        LittleEndian.putShort(bArr, i10 + 20, (short) this.field_11_chs);
        LittleEndian.putShort(bArr, i10 + 22, (short) this.field_12_chsTables);
        LittleEndian.putInt(bArr, i10 + 24, this.field_13_fcMin);
        LittleEndian.putInt(bArr, i10 + 28, this.field_14_fcMac);
    }

    public void setCQuickSaves(byte b10) {
        this.field_6_options = (short) cQuickSaves.setValue(this.field_6_options, b10);
    }

    public void setChs(int i10) {
        this.field_11_chs = i10;
    }

    public void setChsTables(int i10) {
        this.field_12_chsTables = i10;
    }

    public void setEnvr(int i10) {
        this.field_9_envr = i10;
    }

    public void setFComplex(boolean z10) {
        this.field_6_options = (short) fComplex.setBoolean(this.field_6_options, z10);
    }

    public void setFCrypto(boolean z10) {
        this.field_6_options = (short) fCrypto.setBoolean(this.field_6_options, z10);
    }

    public void setFDot(boolean z10) {
        this.field_6_options = (short) fDot.setBoolean(this.field_6_options, z10);
    }

    public void setFEmptySpecial(boolean z10) {
        this.field_10_history = (short) fEmptySpecial.setBoolean(this.field_10_history, z10);
    }

    public void setFEncrypted(boolean z10) {
        this.field_6_options = (short) fEncrypted.setBoolean(this.field_6_options, z10);
    }

    public void setFExtChar(boolean z10) {
        this.field_6_options = (short) fExtChar.setBoolean(this.field_6_options, z10);
    }

    public void setFFarEast(boolean z10) {
        this.field_6_options = (short) fFarEast.setBoolean(this.field_6_options, z10);
    }

    public void setFFutureSavedUndo(boolean z10) {
        this.field_10_history = (short) fFutureSavedUndo.setBoolean(this.field_10_history, z10);
    }

    public void setFGlsy(boolean z10) {
        this.field_6_options = (short) fGlsy.setBoolean(this.field_6_options, z10);
    }

    public void setFHasPic(boolean z10) {
        this.field_6_options = (short) fHasPic.setBoolean(this.field_6_options, z10);
    }

    public void setFLoadOverride(boolean z10) {
        this.field_6_options = (short) fLoadOverride.setBoolean(this.field_6_options, z10);
    }

    public void setFLoadOverridePage(boolean z10) {
        this.field_10_history = (short) fLoadOverridePage.setBoolean(this.field_10_history, z10);
    }

    public void setFMac(boolean z10) {
        this.field_10_history = (short) fMac.setBoolean(this.field_10_history, z10);
    }

    public void setFReadOnlyRecommended(boolean z10) {
        this.field_6_options = (short) fReadOnlyRecommended.setBoolean(this.field_6_options, z10);
    }

    public void setFSpare0(byte b10) {
        this.field_10_history = (short) fSpare0.setValue(this.field_10_history, b10);
    }

    public void setFWhichTblStm(boolean z10) {
        this.field_6_options = (short) fWhichTblStm.setBoolean(this.field_6_options, z10);
    }

    public void setFWord97Saved(boolean z10) {
        this.field_10_history = (short) fWord97Saved.setBoolean(this.field_10_history, z10);
    }

    public void setFWriteReservation(boolean z10) {
        this.field_6_options = (short) fWriteReservation.setBoolean(this.field_6_options, z10);
    }

    public void setFcMac(int i10) {
        this.field_14_fcMac = i10;
    }

    public void setFcMin(int i10) {
        this.field_13_fcMin = i10;
    }

    public void setHistory(short s4) {
        this.field_10_history = s4;
    }

    public void setLKey(int i10) {
        this.field_8_lKey = i10;
    }

    public void setLid(int i10) {
        this.field_4_lid = i10;
    }

    public void setNFib(int i10) {
        this.field_2_nFib = i10;
    }

    public void setNFibBack(int i10) {
        this.field_7_nFibBack = i10;
    }

    public void setNProduct(int i10) {
        this.field_3_nProduct = i10;
    }

    public void setOptions(short s4) {
        this.field_6_options = s4;
    }

    public void setPnNext(int i10) {
        this.field_5_pnNext = i10;
    }

    public void setWIdent(int i10) {
        this.field_1_wIdent = i10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[FIB]\n    .wIdent               =  (");
        stringBuffer.append(getWIdent());
        stringBuffer.append(" )\n    .nFib                 =  (");
        stringBuffer.append(getNFib());
        stringBuffer.append(" )\n    .nProduct             =  (");
        stringBuffer.append(getNProduct());
        stringBuffer.append(" )\n    .lid                  =  (");
        stringBuffer.append(getLid());
        stringBuffer.append(" )\n    .pnNext               =  (");
        stringBuffer.append(getPnNext());
        stringBuffer.append(" )\n    .options              =  (");
        stringBuffer.append((int) getOptions());
        stringBuffer.append(" )\n         .fDot                     = ");
        stringBuffer.append(isFDot());
        stringBuffer.append("\n         .fGlsy                    = ");
        stringBuffer.append(isFGlsy());
        stringBuffer.append("\n         .fComplex                 = ");
        stringBuffer.append(isFComplex());
        stringBuffer.append("\n         .fHasPic                  = ");
        stringBuffer.append(isFHasPic());
        stringBuffer.append("\n         .cQuickSaves              = ");
        stringBuffer.append((int) getCQuickSaves());
        stringBuffer.append("\n         .fEncrypted               = ");
        stringBuffer.append(isFEncrypted());
        stringBuffer.append("\n         .fWhichTblStm             = ");
        stringBuffer.append(isFWhichTblStm());
        stringBuffer.append("\n         .fReadOnlyRecommended     = ");
        stringBuffer.append(isFReadOnlyRecommended());
        stringBuffer.append("\n         .fWriteReservation        = ");
        stringBuffer.append(isFWriteReservation());
        stringBuffer.append("\n         .fExtChar                 = ");
        stringBuffer.append(isFExtChar());
        stringBuffer.append("\n         .fLoadOverride            = ");
        stringBuffer.append(isFLoadOverride());
        stringBuffer.append("\n         .fFarEast                 = ");
        stringBuffer.append(isFFarEast());
        stringBuffer.append("\n         .fCrypto                  = ");
        stringBuffer.append(isFCrypto());
        stringBuffer.append("\n    .nFibBack             =  (");
        stringBuffer.append(getNFibBack());
        stringBuffer.append(" )\n    .lKey                 =  (");
        stringBuffer.append(getLKey());
        stringBuffer.append(" )\n    .envr                 =  (");
        stringBuffer.append(getEnvr());
        stringBuffer.append(" )\n    .history              =  (");
        stringBuffer.append((int) getHistory());
        stringBuffer.append(" )\n         .fMac                     = ");
        stringBuffer.append(isFMac());
        stringBuffer.append("\n         .fEmptySpecial            = ");
        stringBuffer.append(isFEmptySpecial());
        stringBuffer.append("\n         .fLoadOverridePage        = ");
        stringBuffer.append(isFLoadOverridePage());
        stringBuffer.append("\n         .fFutureSavedUndo         = ");
        stringBuffer.append(isFFutureSavedUndo());
        stringBuffer.append("\n         .fWord97Saved             = ");
        stringBuffer.append(isFWord97Saved());
        stringBuffer.append("\n         .fSpare0                  = ");
        stringBuffer.append((int) getFSpare0());
        stringBuffer.append("\n    .chs                  =  (");
        stringBuffer.append(getChs());
        stringBuffer.append(" )\n    .chsTables            =  (");
        stringBuffer.append(getChsTables());
        stringBuffer.append(" )\n    .fcMin                =  (");
        stringBuffer.append(getFcMin());
        stringBuffer.append(" )\n    .fcMac                =  (");
        stringBuffer.append(getFcMac());
        stringBuffer.append(" )\n[/FIB]\n");
        return stringBuffer.toString();
    }
}
