package lib.zj.office.fc.hssf.eventusermodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordFactory;

/* loaded from: classes3.dex */
public class HSSFRequest {
    private final Map<Short, List<HSSFListener>> _records = new HashMap(50);

    public void addListener(HSSFListener hSSFListener, short s4) {
        List<HSSFListener> list = this._records.get(Short.valueOf(s4));
        if (list == null) {
            list = new ArrayList<>(1);
            this._records.put(Short.valueOf(s4), list);
        }
        list.add(hSSFListener);
    }

    public void addListenerForAllRecords(HSSFListener hSSFListener) {
        for (short s4 : RecordFactory.getAllKnownRecordSIDs()) {
            addListener(hSSFListener, s4);
        }
    }

    public short processRecord(Record record) {
        List<HSSFListener> list = this._records.get(Short.valueOf(record.getSid()));
        if (list == null) {
            return (short) 0;
        }
        List<HSSFListener> list2 = list;
        short s4 = 0;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            HSSFListener hSSFListener = list2.get(i10);
            if (hSSFListener instanceof AbortableHSSFListener) {
                s4 = ((AbortableHSSFListener) hSSFListener).abortableProcessRecord(record);
                if (s4 != 0) {
                    break;
                }
            } else {
                hSSFListener.processRecord(record);
            }
        }
        return s4;
    }
}
