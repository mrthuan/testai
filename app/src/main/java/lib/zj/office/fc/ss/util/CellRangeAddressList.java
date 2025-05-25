package lib.zj.office.fc.ss.util;

import androidx.appcompat.view.menu.d;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.util.LittleEndianByteArrayOutputStream;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public class CellRangeAddressList {
    protected final List _list;

    public CellRangeAddressList() {
        this._list = new ArrayList();
    }

    public static int getEncodedSize(int i10) {
        return HSSFCellRangeAddress.getEncodedSize(i10) + 2;
    }

    public void addCellRangeAddress(int i10, int i11, int i12, int i13) {
        addCellRangeAddress(new HSSFCellRangeAddress(i10, i12, i11, i13));
    }

    public CellRangeAddressList copy() {
        CellRangeAddressList cellRangeAddressList = new CellRangeAddressList();
        int size = this._list.size();
        for (int i10 = 0; i10 < size; i10++) {
            cellRangeAddressList.addCellRangeAddress(((HSSFCellRangeAddress) this._list.get(i10)).copy());
        }
        return cellRangeAddressList;
    }

    public int countRanges() {
        return this._list.size();
    }

    public HSSFCellRangeAddress getCellRangeAddress(int i10) {
        return (HSSFCellRangeAddress) this._list.get(i10);
    }

    public HSSFCellRangeAddress[] getCellRangeAddresses() {
        HSSFCellRangeAddress[] hSSFCellRangeAddressArr = new HSSFCellRangeAddress[this._list.size()];
        this._list.toArray(hSSFCellRangeAddressArr);
        return hSSFCellRangeAddressArr;
    }

    public int getSize() {
        return getEncodedSize(this._list.size());
    }

    public HSSFCellRangeAddress remove(int i10) {
        if (!this._list.isEmpty()) {
            if (i10 >= 0 && i10 < this._list.size()) {
                return (HSSFCellRangeAddress) this._list.remove(i10);
            }
            StringBuilder e10 = d.e("Range index (", i10, ") is outside allowable range (0..");
            e10.append(this._list.size() - 1);
            e10.append(")");
            throw new RuntimeException(e10.toString());
        }
        throw new RuntimeException("List is empty");
    }

    public int serialize(int i10, byte[] bArr) {
        int size = getSize();
        serialize(new LittleEndianByteArrayOutputStream(bArr, i10, size));
        return size;
    }

    public CellRangeAddressList(int i10, int i11, int i12, int i13) {
        this();
        addCellRangeAddress(i10, i12, i11, i13);
    }

    public void addCellRangeAddress(HSSFCellRangeAddress hSSFCellRangeAddress) {
        this._list.add(hSSFCellRangeAddress);
    }

    public void serialize(LittleEndianOutput littleEndianOutput) {
        int size = this._list.size();
        littleEndianOutput.writeShort(size);
        for (int i10 = 0; i10 < size; i10++) {
            ((HSSFCellRangeAddress) this._list.get(i10)).serialize(littleEndianOutput);
        }
    }

    public CellRangeAddressList(RecordInputStream recordInputStream) {
        this();
        int readUShort = recordInputStream.readUShort();
        for (int i10 = 0; i10 < readUShort; i10++) {
            this._list.add(new HSSFCellRangeAddress(recordInputStream));
        }
    }
}
