package lib.zj.office.fc.hssf.util;

import lib.zj.office.fc.hssf.record.RecordInputStream;

/* loaded from: classes3.dex */
public class CellRangeAddressList extends lib.zj.office.fc.ss.util.CellRangeAddressList {
    public CellRangeAddressList(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
    }

    public CellRangeAddressList() {
    }

    public CellRangeAddressList(RecordInputStream recordInputStream) {
        int readUShort = recordInputStream.readUShort();
        for (int i10 = 0; i10 < readUShort; i10++) {
            this._list.add(new CellRangeAddress(recordInputStream));
        }
    }
}
