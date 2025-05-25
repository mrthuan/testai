package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.hwpf.model.HDFType;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public abstract class TLPAbstractType implements HDFType {
    protected short field_1_itl;
    protected byte field_2_tlp_flags;
    private static BitField fBorders = new BitField(1);
    private static BitField fShading = new BitField(2);
    private static BitField fFont = new BitField(4);
    private static BitField fColor = new BitField(8);
    private static BitField fBestFit = new BitField(16);
    private static BitField fHdrRows = new BitField(32);
    private static BitField fLastRow = new BitField(64);

    public void fillFields(byte[] bArr, int i10) {
        this.field_1_itl = LittleEndian.getShort(bArr, i10 + 0);
        this.field_2_tlp_flags = bArr[i10 + 2];
    }

    public short getItl() {
        return this.field_1_itl;
    }

    public int getSize() {
        return 7;
    }

    public byte getTlp_flags() {
        return this.field_2_tlp_flags;
    }

    public boolean isFBestFit() {
        return fBestFit.isSet(this.field_2_tlp_flags);
    }

    public boolean isFBorders() {
        return fBorders.isSet(this.field_2_tlp_flags);
    }

    public boolean isFColor() {
        return fColor.isSet(this.field_2_tlp_flags);
    }

    public boolean isFFont() {
        return fFont.isSet(this.field_2_tlp_flags);
    }

    public boolean isFHdrRows() {
        return fHdrRows.isSet(this.field_2_tlp_flags);
    }

    public boolean isFLastRow() {
        return fLastRow.isSet(this.field_2_tlp_flags);
    }

    public boolean isFShading() {
        return fShading.isSet(this.field_2_tlp_flags);
    }

    public void serialize(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10 + 0, this.field_1_itl);
        bArr[i10 + 2] = this.field_2_tlp_flags;
    }

    public void setFBestFit(boolean z10) {
        this.field_2_tlp_flags = (byte) fBestFit.setBoolean(this.field_2_tlp_flags, z10);
    }

    public void setFBorders(boolean z10) {
        this.field_2_tlp_flags = (byte) fBorders.setBoolean(this.field_2_tlp_flags, z10);
    }

    public void setFColor(boolean z10) {
        this.field_2_tlp_flags = (byte) fColor.setBoolean(this.field_2_tlp_flags, z10);
    }

    public void setFFont(boolean z10) {
        this.field_2_tlp_flags = (byte) fFont.setBoolean(this.field_2_tlp_flags, z10);
    }

    public void setFHdrRows(boolean z10) {
        this.field_2_tlp_flags = (byte) fHdrRows.setBoolean(this.field_2_tlp_flags, z10);
    }

    public void setFLastRow(boolean z10) {
        this.field_2_tlp_flags = (byte) fLastRow.setBoolean(this.field_2_tlp_flags, z10);
    }

    public void setFShading(boolean z10) {
        this.field_2_tlp_flags = (byte) fShading.setBoolean(this.field_2_tlp_flags, z10);
    }

    public void setItl(short s4) {
        this.field_1_itl = s4;
    }

    public void setTlp_flags(byte b10) {
        this.field_2_tlp_flags = b10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[TLP]\n    .itl                  =  (");
        stringBuffer.append((int) getItl());
        stringBuffer.append(" )\n    .tlp_flags            =  (");
        stringBuffer.append((int) getTlp_flags());
        stringBuffer.append(" )\n         .fBorders                 = ");
        stringBuffer.append(isFBorders());
        stringBuffer.append("\n         .fShading                 = ");
        stringBuffer.append(isFShading());
        stringBuffer.append("\n         .fFont                    = ");
        stringBuffer.append(isFFont());
        stringBuffer.append("\n         .fColor                   = ");
        stringBuffer.append(isFColor());
        stringBuffer.append("\n         .fBestFit                 = ");
        stringBuffer.append(isFBestFit());
        stringBuffer.append("\n         .fHdrRows                 = ");
        stringBuffer.append(isFHdrRows());
        stringBuffer.append("\n         .fLastRow                 = ");
        stringBuffer.append(isFLastRow());
        stringBuffer.append("\n[/TLP]\n");
        return stringBuffer.toString();
    }
}
