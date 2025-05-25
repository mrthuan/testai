package lib.zj.office.fc.hssf.record;

import a0.a;
import lib.zj.office.fc.ss.usermodel.ErrorConstants;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class BoolErrRecord extends CellRecord {
    public static final short sid = 517;
    private boolean _isError;
    private int _value;

    public BoolErrRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public void appendValueText(StringBuilder sb2) {
        if (isBoolean()) {
            sb2.append("  .boolVal = ");
            sb2.append(getBooleanValue());
            return;
        }
        sb2.append("  .errCode = ");
        sb2.append(ErrorConstants.getText(getErrorValue()));
        sb2.append(" (");
        sb2.append(HexDump.byteToHex(getErrorValue()));
        sb2.append(")");
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        BoolErrRecord boolErrRecord = new BoolErrRecord();
        copyBaseFields(boolErrRecord);
        boolErrRecord._value = this._value;
        boolErrRecord._isError = this._isError;
        return boolErrRecord;
    }

    public boolean getBooleanValue() {
        if (this._value != 0) {
            return true;
        }
        return false;
    }

    public byte getErrorValue() {
        return (byte) this._value;
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public String getRecordName() {
        return "BOOLERR";
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 517;
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public int getValueDataSize() {
        return 2;
    }

    public boolean isBoolean() {
        return !this._isError;
    }

    public boolean isError() {
        return this._isError;
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public void serializeValue(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(this._value);
        littleEndianOutput.writeByte(this._isError ? 1 : 0);
    }

    public void setValue(boolean z10) {
        this._value = z10 ? 1 : 0;
        this._isError = false;
    }

    public BoolErrRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
        int remaining = recordInputStream.remaining();
        if (remaining == 2) {
            this._value = recordInputStream.readByte();
        } else if (remaining == 3) {
            this._value = recordInputStream.readUShort();
        } else {
            throw new RecordFormatException("Unexpected size (" + recordInputStream.remaining() + ") for BOOLERR record.");
        }
        int readUByte = recordInputStream.readUByte();
        if (readUByte == 0) {
            this._isError = false;
        } else if (readUByte == 1) {
            this._isError = true;
        } else {
            throw new RecordFormatException(a.g("Unexpected isError flag (", readUByte, ") for BOOLERR record."));
        }
    }

    public void setValue(byte b10) {
        if (b10 != 0 && b10 != 7 && b10 != 15 && b10 != 23 && b10 != 29 && b10 != 36 && b10 != 42) {
            throw new IllegalArgumentException(b.a.c("Error Value can only be 0,7,15,23,29,36 or 42. It cannot be ", b10));
        }
        this._value = b10;
        this._isError = true;
    }
}
