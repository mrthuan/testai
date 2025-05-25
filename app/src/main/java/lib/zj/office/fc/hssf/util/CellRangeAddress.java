package lib.zj.office.fc.hssf.util;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;

/* loaded from: classes3.dex */
public class CellRangeAddress extends HSSFCellRangeAddress {
    public CellRangeAddress(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
    }

    public CellRangeAddress(RecordInputStream recordInputStream) {
        super(recordInputStream);
    }
}
