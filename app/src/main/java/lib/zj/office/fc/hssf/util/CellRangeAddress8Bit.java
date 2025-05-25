package lib.zj.office.fc.hssf.util;

import lib.zj.office.fc.ss.util.CellRangeAddressBase;
import lib.zj.office.fc.util.LittleEndianByteArrayOutputStream;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class CellRangeAddress8Bit extends CellRangeAddressBase {
    public static final int ENCODED_SIZE = 6;

    public CellRangeAddress8Bit(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
    }

    public static int getEncodedSize(int i10) {
        return i10 * 6;
    }

    private static int readUShortAndCheck(LittleEndianInput littleEndianInput) {
        if (littleEndianInput.available() >= 6) {
            return littleEndianInput.readUShort();
        }
        throw new RuntimeException("Ran out of data reading CellRangeAddress");
    }

    public CellRangeAddress8Bit copy() {
        return new CellRangeAddress8Bit(getFirstRow(), getLastRow(), getFirstColumn(), getLastColumn());
    }

    public int serialize(int i10, byte[] bArr) {
        serialize(new LittleEndianByteArrayOutputStream(bArr, i10, 6));
        return 6;
    }

    public CellRangeAddress8Bit(LittleEndianInput littleEndianInput) {
        super(readUShortAndCheck(littleEndianInput), littleEndianInput.readUShort(), littleEndianInput.readUByte(), littleEndianInput.readUByte());
    }

    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getFirstRow());
        littleEndianOutput.writeShort(getLastRow());
        littleEndianOutput.writeByte(getFirstColumn());
        littleEndianOutput.writeByte(getLastColumn());
    }
}
