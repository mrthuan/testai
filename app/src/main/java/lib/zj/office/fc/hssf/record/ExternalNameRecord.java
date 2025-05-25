package lib.zj.office.fc.hssf.record;

import com.google.android.play.core.assetpacks.b1;
import lib.zj.office.fc.hssf.formula.Formula;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class ExternalNameRecord extends StandardRecord {
    private static final int OPT_AUTOMATIC_LINK = 2;
    private static final int OPT_BUILTIN_NAME = 1;
    private static final int OPT_ICONIFIED_PICTURE_LINK = 32768;
    private static final int OPT_OLE_LINK = 16;
    private static final int OPT_PICTURE_LINK = 4;
    private static final int OPT_STD_DOCUMENT_NAME = 8;
    public static final short sid = 35;
    private Object[] _ddeValues;
    private int _nColumns;
    private int _nRows;
    private short field_1_option_flag;
    private short field_2_ixals;
    private short field_3_not_used;
    private String field_4_name;
    private Formula field_5_name_definition;

    public ExternalNameRecord() {
        this.field_2_ixals = (short) 0;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int encodedSize;
        int encodedSize2 = (StringUtil.getEncodedSize(this.field_4_name) - 1) + 6;
        if (!isOLELink() && !isStdDocumentNameIdentifier()) {
            if (isAutomaticLink()) {
                encodedSize2 += 3;
                encodedSize = b1.A(this._ddeValues);
            } else {
                encodedSize = this.field_5_name_definition.getEncodedSize();
            }
            return encodedSize2 + encodedSize;
        }
        return encodedSize2;
    }

    public short getIx() {
        return this.field_2_ixals;
    }

    public Ptg[] getParsedExpression() {
        return Formula.getTokens(this.field_5_name_definition);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 35;
    }

    public String getText() {
        return this.field_4_name;
    }

    public boolean isAutomaticLink() {
        if ((this.field_1_option_flag & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isBuiltInName() {
        if ((this.field_1_option_flag & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isIconifiedPictureLink() {
        if ((this.field_1_option_flag & 32768) != 0) {
            return true;
        }
        return false;
    }

    public boolean isOLELink() {
        if ((this.field_1_option_flag & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isPicureLink() {
        if ((this.field_1_option_flag & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean isStdDocumentNameIdentifier() {
        if ((this.field_1_option_flag & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_option_flag);
        littleEndianOutput.writeShort(this.field_2_ixals);
        littleEndianOutput.writeShort(this.field_3_not_used);
        littleEndianOutput.writeByte(this.field_4_name.length());
        StringUtil.writeUnicodeStringFlagAndData(littleEndianOutput, this.field_4_name);
        if (!isOLELink() && !isStdDocumentNameIdentifier()) {
            if (isAutomaticLink()) {
                littleEndianOutput.writeByte(this._nColumns - 1);
                littleEndianOutput.writeShort(this._nRows - 1);
                b1.u(littleEndianOutput, this._ddeValues);
                return;
            }
            this.field_5_name_definition.serialize(littleEndianOutput);
        }
    }

    public void setIx(short s4) {
        this.field_2_ixals = s4;
    }

    public void setParsedExpression(Ptg[] ptgArr) {
        this.field_5_name_definition = Formula.create(ptgArr);
    }

    public void setText(String str) {
        this.field_4_name = str;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        Ptg[] tokens;
        StringBuffer stringBuffer = new StringBuffer("[EXTERNALNAME]\n    .options      = ");
        stringBuffer.append((int) this.field_1_option_flag);
        stringBuffer.append("\n    .ix      = ");
        stringBuffer.append((int) this.field_2_ixals);
        stringBuffer.append("\n    .name    = ");
        stringBuffer.append(this.field_4_name);
        stringBuffer.append("\n");
        Formula formula = this.field_5_name_definition;
        if (formula != null) {
            for (Ptg ptg : formula.getTokens()) {
                stringBuffer.append(ptg.toString());
                stringBuffer.append(ptg.getRVAType());
                stringBuffer.append("\n");
            }
        }
        stringBuffer.append("[/EXTERNALNAME]\n");
        return stringBuffer.toString();
    }

    public ExternalNameRecord(RecordInputStream recordInputStream) {
        this.field_1_option_flag = recordInputStream.readShort();
        this.field_2_ixals = recordInputStream.readShort();
        this.field_3_not_used = recordInputStream.readShort();
        this.field_4_name = StringUtil.readUnicodeString(recordInputStream, recordInputStream.readUByte());
        if (isOLELink() || isStdDocumentNameIdentifier()) {
            return;
        }
        if (isAutomaticLink()) {
            if (recordInputStream.available() > 0) {
                int readUByte = recordInputStream.readUByte() + 1;
                int readShort = recordInputStream.readShort() + 1;
                this._ddeValues = b1.U(recordInputStream, readShort * readUByte);
                this._nColumns = readUByte;
                this._nRows = readShort;
                return;
            }
            return;
        }
        this.field_5_name_definition = Formula.read(recordInputStream.readUShort(), recordInputStream);
    }
}
