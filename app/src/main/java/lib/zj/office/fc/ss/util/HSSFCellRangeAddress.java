package lib.zj.office.fc.ss.util;

import lib.zj.office.fc.hssf.formula.SheetNameFormatter;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.util.LittleEndianByteArrayOutputStream;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public class HSSFCellRangeAddress extends CellRangeAddressBase {
    public static final int ENCODED_SIZE = 8;

    public HSSFCellRangeAddress(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
    }

    public static int getEncodedSize(int i10) {
        return i10 * 8;
    }

    private static int readUShortAndCheck(RecordInputStream recordInputStream) {
        if (recordInputStream.remaining() >= 8) {
            return recordInputStream.readUShort();
        }
        throw new RuntimeException("Ran out of data reading CellRangeAddress");
    }

    public static HSSFCellRangeAddress valueOf(String str) {
        CellReference cellReference;
        CellReference cellReference2;
        int indexOf = str.indexOf(":");
        if (indexOf == -1) {
            cellReference2 = new CellReference(str);
            cellReference = cellReference2;
        } else {
            CellReference cellReference3 = new CellReference(str.substring(0, indexOf));
            cellReference = new CellReference(str.substring(indexOf + 1));
            cellReference2 = cellReference3;
        }
        return new HSSFCellRangeAddress(cellReference2.getRow(), cellReference.getRow(), cellReference2.getCol(), cellReference.getCol());
    }

    public HSSFCellRangeAddress copy() {
        return new HSSFCellRangeAddress(getFirstRow(), getLastRow(), getFirstColumn(), getLastColumn());
    }

    public String formatAsString() {
        return formatAsString(null, false);
    }

    public int serialize(int i10, byte[] bArr) {
        serialize(new LittleEndianByteArrayOutputStream(bArr, i10, 8));
        return 8;
    }

    public HSSFCellRangeAddress(RecordInputStream recordInputStream) {
        super(readUShortAndCheck(recordInputStream), recordInputStream.readUShort(), recordInputStream.readUShort(), recordInputStream.readUShort());
    }

    public String formatAsString(String str, boolean z10) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(SheetNameFormatter.format(str));
            stringBuffer.append("!");
        }
        CellReference cellReference = new CellReference(getFirstRow(), getFirstColumn(), z10, z10);
        CellReference cellReference2 = new CellReference(getLastRow(), getLastColumn(), z10, z10);
        stringBuffer.append(cellReference.formatAsString());
        if (!cellReference.equals(cellReference2)) {
            stringBuffer.append(':');
            stringBuffer.append(cellReference2.formatAsString());
        }
        return stringBuffer.toString();
    }

    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getFirstRow());
        littleEndianOutput.writeShort(getLastRow());
        littleEndianOutput.writeShort(getFirstColumn());
        littleEndianOutput.writeShort(getLastColumn());
    }
}
