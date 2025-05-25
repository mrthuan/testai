package lib.zj.office.fc.hwpf.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.ddf.DefaultEscherRecordFactory;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherRecordFactory;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class EscherRecordHolder {
    private final ArrayList<EscherRecord> escherRecords;

    public EscherRecordHolder() {
        this.escherRecords = new ArrayList<>();
    }

    private void fillEscherRecords(byte[] bArr, int i10, int i11) {
        EscherRecordFactory defaultEscherRecordFactory = new DefaultEscherRecordFactory();
        int i12 = i10;
        while (i12 < i10 + i11) {
            EscherRecord createRecord = defaultEscherRecordFactory.createRecord(bArr, i12);
            this.escherRecords.add(createRecord);
            i12 += createRecord.fillFields(bArr, i12, defaultEscherRecordFactory) + 1;
        }
    }

    public EscherRecord findFirstWithId(short s4) {
        return findFirstWithId(s4, getEscherRecords());
    }

    public List<? extends EscherContainerRecord> getBStoreContainers() {
        ArrayList arrayList = new ArrayList(1);
        for (EscherContainerRecord escherContainerRecord : getDggContainers()) {
            for (EscherRecord escherRecord : escherContainerRecord.getChildRecords()) {
                if (escherRecord.getRecordId() == -4095) {
                    arrayList.add((EscherContainerRecord) escherRecord);
                }
            }
        }
        return arrayList;
    }

    public List<? extends EscherContainerRecord> getDgContainers() {
        ArrayList arrayList = new ArrayList(1);
        for (EscherRecord escherRecord : getEscherRecords()) {
            if (escherRecord.getRecordId() == -4094) {
                arrayList.add((EscherContainerRecord) escherRecord);
            }
        }
        return arrayList;
    }

    public List<? extends EscherContainerRecord> getDggContainers() {
        ArrayList arrayList = new ArrayList(1);
        for (EscherRecord escherRecord : getEscherRecords()) {
            if (escherRecord.getRecordId() == -4096) {
                arrayList.add((EscherContainerRecord) escherRecord);
            }
        }
        return arrayList;
    }

    public EscherContainerRecord getEscherContainer() {
        Iterator<EscherRecord> it = this.escherRecords.iterator();
        while (it.hasNext()) {
            EscherRecord next = it.next();
            if (next instanceof EscherContainerRecord) {
                return (EscherContainerRecord) next;
            }
        }
        return null;
    }

    public List<EscherRecord> getEscherRecords() {
        return this.escherRecords;
    }

    public List<? extends EscherContainerRecord> getSpContainers() {
        ArrayList arrayList = new ArrayList(1);
        for (EscherContainerRecord escherContainerRecord : getSpgrContainers()) {
            Iterator<EscherRecord> it = escherContainerRecord.getChildRecords().iterator();
            while (it.hasNext()) {
                arrayList.add((EscherContainerRecord) it.next());
            }
        }
        return arrayList;
    }

    public List<? extends EscherContainerRecord> getSpgrContainers() {
        ArrayList arrayList = new ArrayList(1);
        for (EscherContainerRecord escherContainerRecord : getDgContainers()) {
            for (EscherRecord escherRecord : escherContainerRecord.getChildRecords()) {
                if (escherRecord.getRecordId() == -4093) {
                    arrayList.add((EscherContainerRecord) escherRecord);
                }
            }
        }
        return arrayList;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.escherRecords.size() == 0) {
            stringBuffer.append("No Escher Records Decoded\n");
        }
        Iterator<EscherRecord> it = this.escherRecords.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().toString());
        }
        return stringBuffer.toString();
    }

    private static EscherRecord findFirstWithId(short s4, List<EscherRecord> list) {
        EscherRecord findFirstWithId;
        for (EscherRecord escherRecord : list) {
            if (escherRecord.getRecordId() == s4) {
                return escherRecord;
            }
        }
        for (EscherRecord escherRecord2 : list) {
            if (escherRecord2.isContainerRecord() && (findFirstWithId = findFirstWithId(s4, escherRecord2.getChildRecords())) != null) {
                return findFirstWithId;
            }
        }
        return null;
    }

    public EscherRecordHolder(byte[] bArr, int i10, int i11) {
        this();
        fillEscherRecords(bArr, i10, i11);
    }
}
