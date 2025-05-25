package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.formula.Formula;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class LinkedDataRecord extends StandardRecord {
    public static final byte LINK_TYPE_CATEGORIES = 2;
    public static final byte LINK_TYPE_TITLE_OR_TEXT = 0;
    public static final byte LINK_TYPE_VALUES = 1;
    public static final byte REFERENCE_TYPE_DEFAULT_CATEGORIES = 0;
    public static final byte REFERENCE_TYPE_DIRECT = 1;
    public static final byte REFERENCE_TYPE_ERROR_REPORTED = 4;
    public static final byte REFERENCE_TYPE_NOT_USED = 3;
    public static final byte REFERENCE_TYPE_WORKSHEET = 2;
    private static final BitField customNumberFormat = BitFieldFactory.getInstance(1);
    public static final short sid = 4177;
    private byte field_1_linkType;
    private byte field_2_referenceType;
    private short field_3_options;
    private short field_4_indexNumberFmtRecord;
    private Formula field_5_formulaOfLink;

    public LinkedDataRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        LinkedDataRecord linkedDataRecord = new LinkedDataRecord();
        linkedDataRecord.field_1_linkType = this.field_1_linkType;
        linkedDataRecord.field_2_referenceType = this.field_2_referenceType;
        linkedDataRecord.field_3_options = this.field_3_options;
        linkedDataRecord.field_4_indexNumberFmtRecord = this.field_4_indexNumberFmtRecord;
        linkedDataRecord.field_5_formulaOfLink = this.field_5_formulaOfLink.copy();
        return linkedDataRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return this.field_5_formulaOfLink.getEncodedSize() + 6;
    }

    public Ptg[] getFormulaOfLink() {
        return this.field_5_formulaOfLink.getTokens();
    }

    public short getIndexNumberFmtRecord() {
        return this.field_4_indexNumberFmtRecord;
    }

    public byte getLinkType() {
        return this.field_1_linkType;
    }

    public short getOptions() {
        return this.field_3_options;
    }

    public byte getReferenceType() {
        return this.field_2_referenceType;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isCustomNumberFormat() {
        return customNumberFormat.isSet(this.field_3_options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(this.field_1_linkType);
        littleEndianOutput.writeByte(this.field_2_referenceType);
        littleEndianOutput.writeShort(this.field_3_options);
        littleEndianOutput.writeShort(this.field_4_indexNumberFmtRecord);
        this.field_5_formulaOfLink.serialize(littleEndianOutput);
    }

    public void setCustomNumberFormat(boolean z10) {
        this.field_3_options = customNumberFormat.setShortBoolean(this.field_3_options, z10);
    }

    public void setFormulaOfLink(Ptg[] ptgArr) {
        this.field_5_formulaOfLink = Formula.create(ptgArr);
    }

    public void setIndexNumberFmtRecord(short s4) {
        this.field_4_indexNumberFmtRecord = s4;
    }

    public void setLinkType(byte b10) {
        this.field_1_linkType = b10;
    }

    public void setOptions(short s4) {
        this.field_3_options = s4;
    }

    public void setReferenceType(byte b10) {
        this.field_2_referenceType = b10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        Ptg[] tokens;
        StringBuffer stringBuffer = new StringBuffer("[AI]\n    .linkType             = ");
        stringBuffer.append(HexDump.byteToHex(getLinkType()));
        stringBuffer.append("\n    .referenceType        = ");
        stringBuffer.append(HexDump.byteToHex(getReferenceType()));
        stringBuffer.append("\n    .options              = ");
        stringBuffer.append(HexDump.shortToHex(getOptions()));
        stringBuffer.append("\n    .customNumberFormat   = ");
        stringBuffer.append(isCustomNumberFormat());
        stringBuffer.append("\n    .indexNumberFmtRecord = ");
        stringBuffer.append(HexDump.shortToHex(getIndexNumberFmtRecord()));
        stringBuffer.append("\n    .formulaOfLink        = \n");
        for (Ptg ptg : this.field_5_formulaOfLink.getTokens()) {
            stringBuffer.append(ptg.toString());
            stringBuffer.append(ptg.getRVAType());
            stringBuffer.append('\n');
        }
        stringBuffer.append("[/AI]\n");
        return stringBuffer.toString();
    }

    public LinkedDataRecord(RecordInputStream recordInputStream) {
        this.field_1_linkType = recordInputStream.readByte();
        this.field_2_referenceType = recordInputStream.readByte();
        this.field_3_options = recordInputStream.readShort();
        this.field_4_indexNumberFmtRecord = recordInputStream.readShort();
        this.field_5_formulaOfLink = Formula.read(recordInputStream.readUShort(), recordInputStream);
    }
}
