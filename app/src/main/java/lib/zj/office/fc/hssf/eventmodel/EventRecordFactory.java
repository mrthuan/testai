package lib.zj.office.fc.hssf.eventmodel;

import java.io.InputStream;
import java.util.Arrays;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordFactory;
import lib.zj.office.fc.hssf.record.RecordInputStream;

/* loaded from: classes3.dex */
public final class EventRecordFactory {
    private final ERFListener _listener;
    private final short[] _sids;

    public EventRecordFactory(ERFListener eRFListener, short[] sArr) {
        this._listener = eRFListener;
        if (sArr == null) {
            this._sids = null;
            return;
        }
        short[] sArr2 = (short[]) sArr.clone();
        this._sids = sArr2;
        Arrays.sort(sArr2);
    }

    private boolean isSidIncluded(short s4) {
        short[] sArr = this._sids;
        if (sArr == null || Arrays.binarySearch(sArr, s4) >= 0) {
            return true;
        }
        return false;
    }

    private boolean processRecord(Record record) {
        if (!isSidIncluded(record.getSid())) {
            return true;
        }
        return this._listener.processRecord(record);
    }

    public void processRecords(InputStream inputStream) {
        RecordInputStream recordInputStream = new RecordInputStream(inputStream);
        Record record = null;
        while (recordInputStream.hasNextRecord()) {
            recordInputStream.nextRecord();
            Record[] createRecord = RecordFactory.createRecord(recordInputStream);
            if (createRecord.length > 1) {
                for (int i10 = 0; i10 < createRecord.length; i10++) {
                    if (record != null && !processRecord(record)) {
                        return;
                    }
                    record = createRecord[i10];
                }
                continue;
            } else {
                Record record2 = createRecord[0];
                if (record2 == null) {
                    continue;
                } else if (record != null && !processRecord(record)) {
                    return;
                } else {
                    record = record2;
                }
            }
        }
        if (record != null) {
            processRecord(record);
        }
    }
}
