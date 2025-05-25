package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.hwpf.model.HDFType;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public abstract class FLDAbstractType implements HDFType {
    protected byte field_1_chHolder;
    protected byte field_2_flt;

    /* renamed from: ch  reason: collision with root package name */
    private static BitField f20677ch = new BitField(31);
    private static BitField reserved = new BitField(224);
    private static BitField fDiffer = new BitField(1);
    private static BitField fZombieEmbed = new BitField(2);
    private static BitField fResultDirty = new BitField(4);
    private static BitField fResultEdited = new BitField(8);
    private static BitField fLocked = new BitField(16);
    private static BitField fPrivateResult = new BitField(32);
    private static BitField fNested = new BitField(64);
    private static BitField fHasSep = new BitField(64);

    public static int getSize() {
        return 6;
    }

    public void fillFields(byte[] bArr, int i10) {
        this.field_1_chHolder = bArr[i10 + 0];
        this.field_2_flt = bArr[i10 + 1];
    }

    public byte getCh() {
        return (byte) f20677ch.getValue(this.field_1_chHolder);
    }

    public byte getChHolder() {
        return this.field_1_chHolder;
    }

    public byte getFlt() {
        return this.field_2_flt;
    }

    public byte getReserved() {
        return (byte) reserved.getValue(this.field_1_chHolder);
    }

    public boolean isFDiffer() {
        return fDiffer.isSet(this.field_2_flt);
    }

    public boolean isFHasSep() {
        return fHasSep.isSet(this.field_2_flt);
    }

    public boolean isFLocked() {
        return fLocked.isSet(this.field_2_flt);
    }

    public boolean isFNested() {
        return fNested.isSet(this.field_2_flt);
    }

    public boolean isFPrivateResult() {
        return fPrivateResult.isSet(this.field_2_flt);
    }

    public boolean isFResultDirty() {
        return fResultDirty.isSet(this.field_2_flt);
    }

    public boolean isFResultEdited() {
        return fResultEdited.isSet(this.field_2_flt);
    }

    public boolean isFZombieEmbed() {
        return fZombieEmbed.isSet(this.field_2_flt);
    }

    public void serialize(byte[] bArr, int i10) {
        bArr[i10 + 0] = this.field_1_chHolder;
        bArr[i10 + 1] = this.field_2_flt;
    }

    public void setCh(byte b10) {
        this.field_1_chHolder = (byte) f20677ch.setValue(this.field_1_chHolder, b10);
    }

    public void setChHolder(byte b10) {
        this.field_1_chHolder = b10;
    }

    public void setFDiffer(boolean z10) {
        this.field_2_flt = (byte) fDiffer.setBoolean(this.field_2_flt, z10);
    }

    public void setFHasSep(boolean z10) {
        this.field_2_flt = (byte) fHasSep.setBoolean(this.field_2_flt, z10);
    }

    public void setFLocked(boolean z10) {
        this.field_2_flt = (byte) fLocked.setBoolean(this.field_2_flt, z10);
    }

    public void setFNested(boolean z10) {
        this.field_2_flt = (byte) fNested.setBoolean(this.field_2_flt, z10);
    }

    public void setFPrivateResult(boolean z10) {
        this.field_2_flt = (byte) fPrivateResult.setBoolean(this.field_2_flt, z10);
    }

    public void setFResultDirty(boolean z10) {
        this.field_2_flt = (byte) fResultDirty.setBoolean(this.field_2_flt, z10);
    }

    public void setFResultEdited(boolean z10) {
        this.field_2_flt = (byte) fResultEdited.setBoolean(this.field_2_flt, z10);
    }

    public void setFZombieEmbed(boolean z10) {
        this.field_2_flt = (byte) fZombieEmbed.setBoolean(this.field_2_flt, z10);
    }

    public void setFlt(byte b10) {
        this.field_2_flt = b10;
    }

    public void setReserved(byte b10) {
        this.field_1_chHolder = (byte) reserved.setValue(this.field_1_chHolder, b10);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[FLD]\n    .chHolder             =  (");
        stringBuffer.append((int) getChHolder());
        stringBuffer.append(" )\n         .ch                       = ");
        stringBuffer.append((int) getCh());
        stringBuffer.append("\n         .reserved                 = ");
        stringBuffer.append((int) getReserved());
        stringBuffer.append("\n    .flt                  =  (");
        stringBuffer.append((int) getFlt());
        stringBuffer.append(" )\n         .fDiffer                  = ");
        stringBuffer.append(isFDiffer());
        stringBuffer.append("\n         .fZombieEmbed             = ");
        stringBuffer.append(isFZombieEmbed());
        stringBuffer.append("\n         .fResultDirty             = ");
        stringBuffer.append(isFResultDirty());
        stringBuffer.append("\n         .fResultEdited            = ");
        stringBuffer.append(isFResultEdited());
        stringBuffer.append("\n         .fLocked                  = ");
        stringBuffer.append(isFLocked());
        stringBuffer.append("\n         .fPrivateResult           = ");
        stringBuffer.append(isFPrivateResult());
        stringBuffer.append("\n         .fNested                  = ");
        stringBuffer.append(isFNested());
        stringBuffer.append("\n         .fHasSep                  = ");
        stringBuffer.append(isFHasSep());
        stringBuffer.append("\n[/FLD]\n");
        return stringBuffer.toString();
    }
}
