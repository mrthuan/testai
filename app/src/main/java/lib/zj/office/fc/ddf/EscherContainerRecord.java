package lib.zj.office.fc.ddf;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class EscherContainerRecord extends EscherRecord {
    public static final short BSTORE_CONTAINER = -4095;
    public static final short DGG_CONTAINER = -4096;
    public static final short DG_CONTAINER = -4094;
    public static final short SOLVER_CONTAINER = -4091;
    public static final short SPGR_CONTAINER = -4093;
    public static final short SP_CONTAINER = -4092;
    private final List<EscherRecord> _childRecords = new ArrayList();

    /* loaded from: classes3.dex */
    public static final class ReadOnlyIterator implements Iterator<EscherRecord> {
        private int _index = 0;
        private final List<EscherRecord> _list;

        public ReadOnlyIterator(List<EscherRecord> list) {
            this._list = list;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this._index < this._list.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public EscherRecord next() {
            if (hasNext()) {
                List<EscherRecord> list = this._list;
                int i10 = this._index;
                this._index = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    public void addChildBefore(EscherRecord escherRecord, int i10) {
        int i11 = 0;
        while (i11 < this._childRecords.size()) {
            if (this._childRecords.get(i11).getRecordId() == i10) {
                this._childRecords.add(i11, escherRecord);
                i11++;
            }
            i11++;
        }
    }

    public void addChildRecord(EscherRecord escherRecord) {
        this._childRecords.add(escherRecord);
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void display(PrintWriter printWriter, int i10) {
        super.display(printWriter, i10);
        for (EscherRecord escherRecord : this._childRecords) {
            escherRecord.display(printWriter, i10 + 1);
        }
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
        if (this._childRecords != null) {
            for (int i10 = 0; i10 < this._childRecords.size(); i10++) {
                this._childRecords.get(i10).dispose();
            }
            this._childRecords.clear();
        }
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int readHeader = readHeader(bArr, i10);
        int i11 = 8;
        int i12 = i10 + 8;
        while (readHeader > 0 && i12 < bArr.length) {
            EscherRecord createRecord = escherRecordFactory.createRecord(bArr, i12);
            int fillFields = createRecord.fillFields(bArr, i12, escherRecordFactory);
            i11 += fillFields;
            i12 += fillFields;
            readHeader -= fillFields;
            addChildRecord(createRecord);
        }
        return i11;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public EscherRecord getChild(int i10) {
        return this._childRecords.get(i10);
    }

    public <T extends EscherRecord> T getChildById(short s4) {
        Iterator<EscherRecord> it = this._childRecords.iterator();
        while (it.hasNext()) {
            T t4 = (T) it.next();
            if (t4.getRecordId() == s4) {
                return t4;
            }
        }
        return null;
    }

    public List<EscherContainerRecord> getChildContainers() {
        ArrayList arrayList = new ArrayList();
        for (EscherRecord escherRecord : this._childRecords) {
            if (escherRecord instanceof EscherContainerRecord) {
                arrayList.add((EscherContainerRecord) escherRecord);
            }
        }
        return arrayList;
    }

    public Iterator<EscherRecord> getChildIterator() {
        return new ReadOnlyIterator(this._childRecords);
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public List<EscherRecord> getChildRecords() {
        return new ArrayList(this._childRecords);
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        switch (getRecordId()) {
            case -4096:
                return "DggContainer";
            case -4095:
                return "BStoreContainer";
            case -4094:
                return "DgContainer";
            case -4093:
                return "SpgrContainer";
            case -4092:
                return "SpContainer";
            case -4091:
                return "SolverContainer";
            default:
                return "Container 0x" + HexDump.toHex(getRecordId());
        }
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        int i10 = 0;
        for (EscherRecord escherRecord : this._childRecords) {
            i10 += escherRecord.getRecordSize();
        }
        return i10 + 8;
    }

    public void getRecordsById(short s4, List<EscherRecord> list) {
        for (EscherRecord escherRecord : this._childRecords) {
            if (escherRecord instanceof EscherContainerRecord) {
                ((EscherContainerRecord) escherRecord).getRecordsById(s4, list);
            } else if (escherRecord.getRecordId() == s4) {
                list.add(escherRecord);
            }
        }
    }

    public boolean hasChildOfType(short s4) {
        for (EscherRecord escherRecord : this._childRecords) {
            if (escherRecord.getRecordId() == s4) {
                return true;
            }
        }
        return false;
    }

    public boolean removeChildRecord(EscherRecord escherRecord) {
        return this._childRecords.remove(escherRecord);
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        int i11 = 0;
        for (EscherRecord escherRecord : this._childRecords) {
            i11 += escherRecord.getRecordSize();
        }
        LittleEndian.putInt(bArr, i10 + 4, i11);
        int i12 = i10 + 8;
        for (EscherRecord escherRecord2 : this._childRecords) {
            i12 += escherRecord2.serialize(i12, bArr, escherSerializationListener);
        }
        int i13 = i12 - i10;
        escherSerializationListener.afterRecordSerialize(i12, getRecordId(), i13, this);
        return i13;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void setChildRecords(List<EscherRecord> list) {
        List<EscherRecord> list2 = this._childRecords;
        if (list != list2) {
            list2.clear();
            this._childRecords.addAll(list);
            return;
        }
        throw new IllegalStateException("Child records private data member has escaped");
    }

    public String toString() {
        String property = System.getProperty("line.separator");
        StringBuffer stringBuffer = new StringBuffer();
        if (this._childRecords.size() > 0) {
            stringBuffer.append("  children: " + property);
            int i10 = 0;
            for (EscherRecord escherRecord : this._childRecords) {
                stringBuffer.append("   Child " + i10 + ":" + property);
                String replaceAll = String.valueOf(escherRecord).replaceAll("\n", "\n    ");
                stringBuffer.append("    ");
                stringBuffer.append(replaceAll);
                stringBuffer.append(property);
                i10++;
            }
        }
        return EscherContainerRecord.class.getName() + " (" + getRecordName() + "):" + property + "  isContainer: " + isContainerRecord() + property + "  options: 0x" + HexDump.toHex(getOptions()) + property + "  recordId: 0x" + HexDump.toHex(getRecordId()) + property + "  numchildren: " + this._childRecords.size() + property + stringBuffer.toString();
    }
}
