package lib.zj.office.fc.hssf.model;

import java.util.List;
import lib.zj.office.fc.hssf.record.Record;

/* loaded from: classes3.dex */
public final class RecordStream {
    private int _countRead;
    private final int _endIx;
    private final List<Record> _list;
    private int _nextIndex;

    public RecordStream(List<Record> list, int i10, int i11) {
        this._list = list;
        this._nextIndex = i10;
        this._endIx = i11;
        this._countRead = 0;
    }

    public int getCountRead() {
        return this._countRead;
    }

    public Record getNext() {
        if (hasNext()) {
            this._countRead++;
            List<Record> list = this._list;
            int i10 = this._nextIndex;
            this._nextIndex = i10 + 1;
            return list.get(i10);
        }
        throw new RuntimeException("Attempt to read past end of record stream");
    }

    public boolean hasNext() {
        if (this._nextIndex < this._endIx) {
            return true;
        }
        return false;
    }

    public Class<? extends Record> peekNextClass() {
        if (!hasNext()) {
            return null;
        }
        return this._list.get(this._nextIndex).getClass();
    }

    public int peekNextSid() {
        if (!hasNext()) {
            return -1;
        }
        return this._list.get(this._nextIndex).getSid();
    }

    public RecordStream(List<Record> list, int i10) {
        this(list, i10, list.size());
    }
}
