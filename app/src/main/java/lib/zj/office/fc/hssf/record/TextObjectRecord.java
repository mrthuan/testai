package lib.zj.office.fc.hssf.record;

import a0.a;
import a6.h;
import androidx.activity.r;
import lib.zj.office.fc.hssf.formula.ptg.OperandPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.record.cont.ContinuableRecord;
import lib.zj.office.fc.hssf.record.cont.ContinuableRecordOutput;
import lib.zj.office.fc.hssf.usermodel.HSSFRichTextString;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;

/* loaded from: classes3.dex */
public final class TextObjectRecord extends ContinuableRecord {
    private static final int FORMAT_RUN_ENCODED_SIZE = 8;
    public static final short HORIZONTAL_TEXT_ALIGNMENT_CENTERED = 2;
    public static final short HORIZONTAL_TEXT_ALIGNMENT_JUSTIFIED = 4;
    public static final short HORIZONTAL_TEXT_ALIGNMENT_LEFT_ALIGNED = 1;
    public static final short HORIZONTAL_TEXT_ALIGNMENT_RIGHT_ALIGNED = 3;
    public static final short TEXT_ORIENTATION_NONE = 0;
    public static final short TEXT_ORIENTATION_ROT_LEFT = 3;
    public static final short TEXT_ORIENTATION_ROT_RIGHT = 2;
    public static final short TEXT_ORIENTATION_TOP_TO_BOTTOM = 1;
    public static final short VERTICAL_TEXT_ALIGNMENT_BOTTOM = 3;
    public static final short VERTICAL_TEXT_ALIGNMENT_CENTER = 2;
    public static final short VERTICAL_TEXT_ALIGNMENT_JUSTIFY = 4;
    public static final short VERTICAL_TEXT_ALIGNMENT_TOP = 1;
    public static final short sid = 438;
    private OperandPtg _linkRefPtg;
    private HSSFRichTextString _text;
    private Byte _unknownPostFormulaByte;
    private int _unknownPreFormulaInt;
    private int field_1_options;
    private int field_2_textOrientation;
    private int field_3_reserved4;
    private int field_4_reserved5;
    private int field_5_reserved6;
    private int field_8_reserved7;
    private static final BitField HorizontalTextAlignment = BitFieldFactory.getInstance(14);
    private static final BitField VerticalTextAlignment = BitFieldFactory.getInstance(112);
    private static final BitField textLocked = BitFieldFactory.getInstance(512);

    public TextObjectRecord() {
    }

    private int getFormattingDataLength() {
        if (this._text.length() < 1) {
            return 0;
        }
        return (this._text.numFormattingRuns() + 1) * 8;
    }

    private static void processFontRuns(RecordInputStream recordInputStream, HSSFRichTextString hSSFRichTextString, int i10) {
        if (i10 % 8 == 0) {
            int i11 = i10 / 8;
            for (int i12 = 0; i12 < i11; i12++) {
                short readShort = recordInputStream.readShort();
                short readShort2 = recordInputStream.readShort();
                recordInputStream.readInt();
                hSSFRichTextString.applyFont(readShort, hSSFRichTextString.length(), readShort2);
            }
            return;
        }
        throw new RecordFormatException(a.g("Bad format run data length ", i10, ")"));
    }

    private static String readRawString(RecordInputStream recordInputStream, int i10) {
        boolean z10 = true;
        if ((recordInputStream.readByte() & 1) != 0) {
            z10 = false;
        }
        if (z10) {
            return recordInputStream.readCompressedUnicode(i10);
        }
        return recordInputStream.readUnicodeLEString(i10);
    }

    private void serializeTXORecord(ContinuableRecordOutput continuableRecordOutput) {
        continuableRecordOutput.writeShort(this.field_1_options);
        continuableRecordOutput.writeShort(this.field_2_textOrientation);
        continuableRecordOutput.writeShort(this.field_3_reserved4);
        continuableRecordOutput.writeShort(this.field_4_reserved5);
        continuableRecordOutput.writeShort(this.field_5_reserved6);
        continuableRecordOutput.writeShort(this._text.length());
        continuableRecordOutput.writeShort(getFormattingDataLength());
        continuableRecordOutput.writeInt(this.field_8_reserved7);
        OperandPtg operandPtg = this._linkRefPtg;
        if (operandPtg != null) {
            continuableRecordOutput.writeShort(operandPtg.getSize());
            continuableRecordOutput.writeInt(this._unknownPreFormulaInt);
            this._linkRefPtg.write(continuableRecordOutput);
            Byte b10 = this._unknownPostFormulaByte;
            if (b10 != null) {
                continuableRecordOutput.writeByte(b10.byteValue());
            }
        }
    }

    private void serializeTrailingRecords(ContinuableRecordOutput continuableRecordOutput) {
        continuableRecordOutput.writeContinue();
        continuableRecordOutput.writeStringData(this._text.getString());
        continuableRecordOutput.writeContinue();
        writeFormatData(continuableRecordOutput, this._text);
    }

    private static void writeFormatData(ContinuableRecordOutput continuableRecordOutput, HSSFRichTextString hSSFRichTextString) {
        int numFormattingRuns = hSSFRichTextString.numFormattingRuns();
        for (int i10 = 0; i10 < numFormattingRuns; i10++) {
            continuableRecordOutput.writeShort(hSSFRichTextString.getIndexOfFormattingRun(i10));
            short fontOfFormattingRun = hSSFRichTextString.getFontOfFormattingRun(i10);
            if (fontOfFormattingRun == 0) {
                fontOfFormattingRun = 0;
            }
            continuableRecordOutput.writeShort(fontOfFormattingRun);
            continuableRecordOutput.writeInt(0);
        }
        continuableRecordOutput.writeShort(hSSFRichTextString.length());
        continuableRecordOutput.writeShort(0);
        continuableRecordOutput.writeInt(0);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        TextObjectRecord textObjectRecord = new TextObjectRecord();
        textObjectRecord._text = this._text;
        textObjectRecord.field_1_options = this.field_1_options;
        textObjectRecord.field_2_textOrientation = this.field_2_textOrientation;
        textObjectRecord.field_3_reserved4 = this.field_3_reserved4;
        textObjectRecord.field_4_reserved5 = this.field_4_reserved5;
        textObjectRecord.field_5_reserved6 = this.field_5_reserved6;
        textObjectRecord.field_8_reserved7 = this.field_8_reserved7;
        textObjectRecord._text = this._text;
        OperandPtg operandPtg = this._linkRefPtg;
        if (operandPtg != null) {
            textObjectRecord._unknownPreFormulaInt = this._unknownPreFormulaInt;
            textObjectRecord._linkRefPtg = operandPtg.copy();
            textObjectRecord._unknownPostFormulaByte = this._unknownPostFormulaByte;
        }
        return textObjectRecord;
    }

    public int getHorizontalTextAlignment() {
        return HorizontalTextAlignment.getValue(this.field_1_options);
    }

    public Ptg getLinkRefPtg() {
        return this._linkRefPtg;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public HSSFRichTextString getStr() {
        return this._text;
    }

    public int getTextOrientation() {
        return this.field_2_textOrientation;
    }

    public int getVerticalTextAlignment() {
        return VerticalTextAlignment.getValue(this.field_1_options);
    }

    public boolean isTextLocked() {
        return textLocked.isSet(this.field_1_options);
    }

    @Override // lib.zj.office.fc.hssf.record.cont.ContinuableRecord
    public void serialize(ContinuableRecordOutput continuableRecordOutput) {
        serializeTXORecord(continuableRecordOutput);
        if (this._text.getString().length() > 0) {
            serializeTrailingRecords(continuableRecordOutput);
        }
    }

    public void setHorizontalTextAlignment(int i10) {
        this.field_1_options = HorizontalTextAlignment.setValue(this.field_1_options, i10);
    }

    public void setStr(HSSFRichTextString hSSFRichTextString) {
        this._text = hSSFRichTextString;
    }

    public void setTextLocked(boolean z10) {
        this.field_1_options = textLocked.setBoolean(this.field_1_options, z10);
    }

    public void setTextOrientation(int i10) {
        this.field_2_textOrientation = i10;
    }

    public void setVerticalTextAlignment(int i10) {
        this.field_1_options = VerticalTextAlignment.setValue(this.field_1_options, i10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[TXO]\n    .options        = ");
        stringBuffer.append(HexDump.shortToHex(this.field_1_options));
        stringBuffer.append("\n         .isHorizontal = ");
        stringBuffer.append(getHorizontalTextAlignment());
        stringBuffer.append("\n         .isVertical   = ");
        stringBuffer.append(getVerticalTextAlignment());
        stringBuffer.append("\n         .textLocked   = ");
        stringBuffer.append(isTextLocked());
        stringBuffer.append("\n    .textOrientation= ");
        stringBuffer.append(HexDump.shortToHex(getTextOrientation()));
        stringBuffer.append("\n    .reserved4      = ");
        r.j(this.field_3_reserved4, stringBuffer, "\n    .reserved5      = ");
        r.j(this.field_4_reserved5, stringBuffer, "\n    .reserved6      = ");
        r.j(this.field_5_reserved6, stringBuffer, "\n    .textLength     = ");
        stringBuffer.append(HexDump.shortToHex(this._text.length()));
        stringBuffer.append("\n    .reserved7      = ");
        stringBuffer.append(HexDump.intToHex(this.field_8_reserved7));
        stringBuffer.append("\n    .string = ");
        stringBuffer.append(this._text);
        stringBuffer.append('\n');
        for (int i10 = 0; i10 < this._text.numFormattingRuns(); i10++) {
            stringBuffer.append("    .textrun = ");
            stringBuffer.append((int) this._text.getFontOfFormattingRun(i10));
            stringBuffer.append('\n');
        }
        stringBuffer.append("[/TXO]\n");
        return stringBuffer.toString();
    }

    public TextObjectRecord(RecordInputStream recordInputStream) {
        this.field_1_options = recordInputStream.readUShort();
        this.field_2_textOrientation = recordInputStream.readUShort();
        this.field_3_reserved4 = recordInputStream.readUShort();
        this.field_4_reserved5 = recordInputStream.readUShort();
        this.field_5_reserved6 = recordInputStream.readUShort();
        int readUShort = recordInputStream.readUShort();
        int readUShort2 = recordInputStream.readUShort();
        this.field_8_reserved7 = recordInputStream.readInt();
        if (recordInputStream.remaining() > 0) {
            if (recordInputStream.remaining() >= 11) {
                int readUShort3 = recordInputStream.readUShort();
                this._unknownPreFormulaInt = recordInputStream.readInt();
                Ptg[] readTokens = Ptg.readTokens(readUShort3, recordInputStream);
                if (readTokens.length == 1) {
                    this._linkRefPtg = (OperandPtg) readTokens[0];
                    if (recordInputStream.remaining() > 0) {
                        this._unknownPostFormulaByte = Byte.valueOf(recordInputStream.readByte());
                    } else {
                        this._unknownPostFormulaByte = null;
                    }
                } else {
                    throw new RecordFormatException(h.g(new StringBuilder("Read "), readTokens.length, " tokens but expected exactly 1"));
                }
            } else {
                throw new RecordFormatException("Not enough remaining data for a link formula");
            }
        } else {
            this._linkRefPtg = null;
        }
        if (recordInputStream.remaining() <= 0) {
            HSSFRichTextString hSSFRichTextString = new HSSFRichTextString(readUShort > 0 ? readRawString(recordInputStream, readUShort) : "");
            this._text = hSSFRichTextString;
            if (readUShort2 > 0) {
                processFontRuns(recordInputStream, hSSFRichTextString, readUShort2);
                return;
            }
            return;
        }
        throw new RecordFormatException("Unused " + recordInputStream.remaining() + " bytes at end of record");
    }
}
