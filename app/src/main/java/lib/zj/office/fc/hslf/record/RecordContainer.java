package lib.zj.office.fc.hslf.record;

import java.util.ArrayList;
import lib.zj.office.fc.util.ArrayUtil;

/* loaded from: classes3.dex */
public abstract class RecordContainer extends Record {
    protected Record[] _children;
    private Boolean changingChildRecordsLock = Boolean.TRUE;

    private void addChildAt(Record record, int i10) {
        synchronized (this.changingChildRecordsLock) {
            appendChild(record);
            moveChildRecords(this._children.length - 1, i10, 1);
        }
    }

    private void appendChild(Record record) {
        synchronized (this.changingChildRecordsLock) {
            Record[] recordArr = this._children;
            Record[] recordArr2 = new Record[recordArr.length + 1];
            System.arraycopy(recordArr, 0, recordArr2, 0, recordArr.length);
            recordArr2[this._children.length] = record;
            this._children = recordArr2;
        }
    }

    private int findChildLocation(Record record) {
        synchronized (this.changingChildRecordsLock) {
            int i10 = 0;
            while (true) {
                Record[] recordArr = this._children;
                if (i10 < recordArr.length) {
                    if (recordArr[i10].equals(record)) {
                        return i10;
                    }
                    i10++;
                } else {
                    return -1;
                }
            }
        }
    }

    public static void handleParentAwareRecords(RecordContainer recordContainer) {
        Record[] childRecords;
        for (Record record : recordContainer.getChildRecords()) {
            if (record instanceof ParentAwareRecord) {
                ((ParentAwareRecord) record).setParentRecord(recordContainer);
            }
            if (record instanceof RecordContainer) {
                handleParentAwareRecords((RecordContainer) record);
            }
        }
    }

    private void moveChildRecords(int i10, int i11, int i12) {
        if (i10 == i11 || i12 == 0) {
            return;
        }
        int i13 = i10 + i12;
        Record[] recordArr = this._children;
        if (i13 <= recordArr.length) {
            ArrayUtil.arrayMoveWithin(recordArr, i10, i11, i12);
            return;
        }
        throw new IllegalArgumentException("Asked to move more records than there are!");
    }

    public void addChildAfter(Record record, Record record2) {
        synchronized (this.changingChildRecordsLock) {
            int findChildLocation = findChildLocation(record2);
            if (findChildLocation != -1) {
                addChildAt(record, findChildLocation + 1);
            } else {
                throw new IllegalArgumentException("Asked to add a new child after another record, but that record wasn't one of our children!");
            }
        }
    }

    public void addChildBefore(Record record, Record record2) {
        synchronized (this.changingChildRecordsLock) {
            int findChildLocation = findChildLocation(record2);
            if (findChildLocation != -1) {
                addChildAt(record, findChildLocation);
            } else {
                throw new IllegalArgumentException("Asked to add a new child before another record, but that record wasn't one of our children!");
            }
        }
    }

    public void appendChildRecord(Record record) {
        synchronized (this.changingChildRecordsLock) {
            appendChild(record);
        }
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        Record[] recordArr = this._children;
        if (recordArr != null) {
            for (Record record : recordArr) {
                if (record != null) {
                    record.dispose();
                }
            }
        }
    }

    public Record findFirstOfType(long j10) {
        int i10 = 0;
        while (true) {
            Record[] recordArr = this._children;
            if (i10 < recordArr.length) {
                if (recordArr[i10].getRecordType() == j10) {
                    return this._children[i10];
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public Record[] getChildRecords() {
        return this._children;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public boolean isAnAtom() {
        return false;
    }

    public void moveChildBefore(Record record, Record record2) {
        moveChildrenBefore(record, 1, record2);
    }

    public void moveChildrenAfter(Record record, int i10, Record record2) {
        if (i10 < 1) {
            return;
        }
        synchronized (this.changingChildRecordsLock) {
            int findChildLocation = findChildLocation(record2);
            if (findChildLocation != -1) {
                int i11 = findChildLocation + 1;
                int findChildLocation2 = findChildLocation(record);
                if (findChildLocation2 != -1) {
                    moveChildRecords(findChildLocation2, i11, i10);
                } else {
                    throw new IllegalArgumentException("Asked to move a record that wasn't a child!");
                }
            } else {
                throw new IllegalArgumentException("Asked to move children before another record, but that record wasn't one of our children!");
            }
        }
    }

    public void moveChildrenBefore(Record record, int i10, Record record2) {
        if (i10 < 1) {
            return;
        }
        synchronized (this.changingChildRecordsLock) {
            int findChildLocation = findChildLocation(record2);
            if (findChildLocation != -1) {
                int findChildLocation2 = findChildLocation(record);
                if (findChildLocation2 != -1) {
                    moveChildRecords(findChildLocation2, findChildLocation, i10);
                } else {
                    throw new IllegalArgumentException("Asked to move a record that wasn't a child!");
                }
            } else {
                throw new IllegalArgumentException("Asked to move children before another record, but that record wasn't one of our children!");
            }
        }
    }

    public Record removeChild(Record record) {
        Record[] recordArr;
        ArrayList arrayList = new ArrayList();
        Record record2 = null;
        for (Record record3 : this._children) {
            if (record3 != record) {
                arrayList.add(record3);
            } else {
                record2 = record3;
            }
        }
        this._children = (Record[]) arrayList.toArray(new Record[arrayList.size()]);
        return record2;
    }

    public void setChildRecord(Record[] recordArr) {
        this._children = recordArr;
    }
}
