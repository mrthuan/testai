package di;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hssf.record.RowRecord;
import lib.zj.office.fc.ss.usermodel.IFont;

/* compiled from: ARow.java */
/* loaded from: classes3.dex */
public final class b extends ei.b {
    public b(ei.d dVar, c cVar, RowRecord rowRecord) {
        super((rowRecord.getLastCol() - rowRecord.getFirstCol()) + 5);
        int i10;
        int size;
        short s4;
        this.f16594a = cVar;
        rowRecord.setEmpty();
        this.f16596d = rowRecord.getRowNumber();
        this.f16595b = rowRecord.getFirstCol();
        this.c = Math.max(this.c, rowRecord.getLastCol());
        this.f16597e = rowRecord.getXFIndex();
        int i11 = 0;
        while (true) {
            int i12 = this.f16597e;
            i10 = Variant.VT_ILLEGAL >> i11;
            int i13 = i12 & i10;
            synchronized (dVar) {
                size = dVar.f16628f.size();
            }
            if (i13 <= size) {
                break;
            }
            i11++;
        }
        this.f16597e &= i10;
        this.f16599g.a((short) 0, Boolean.valueOf(rowRecord.getZeroHeight()));
        short height = rowRecord.getHeight();
        if ((32768 & height) != 0) {
            s4 = 255;
        } else {
            s4 = (short) (height & IFont.COLOR_NORMAL);
        }
        this.f16598f = (int) ((s4 / 20) * 1.3333334f);
    }
}
