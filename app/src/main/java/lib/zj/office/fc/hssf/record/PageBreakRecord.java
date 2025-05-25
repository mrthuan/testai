package lib.zj.office.fc.hssf.record;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public abstract class PageBreakRecord extends StandardRecord {
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private Map<Integer, Break> _breakMap;
    private List<Break> _breaks;

    public PageBreakRecord() {
        this._breaks = new ArrayList();
        this._breakMap = new HashMap();
    }

    public void addBreak(int i10, int i11, int i12) {
        Integer valueOf = Integer.valueOf(i10);
        Break r12 = this._breakMap.get(valueOf);
        if (r12 == null) {
            Break r13 = new Break(i10, i11, i12);
            this._breakMap.put(valueOf, r13);
            this._breaks.add(r13);
            return;
        }
        r12.main = i10;
        r12.subFrom = i11;
        r12.subTo = i12;
    }

    public final Break getBreak(int i10) {
        return this._breakMap.get(Integer.valueOf(i10));
    }

    public final int[] getBreaks() {
        int numBreaks = getNumBreaks();
        if (numBreaks < 1) {
            return EMPTY_INT_ARRAY;
        }
        int[] iArr = new int[numBreaks];
        for (int i10 = 0; i10 < numBreaks; i10++) {
            iArr[i10] = this._breaks.get(i10).main;
        }
        return iArr;
    }

    public final Iterator<Break> getBreaksIterator() {
        return this._breaks.iterator();
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return (this._breaks.size() * 6) + 2;
    }

    public int getNumBreaks() {
        return this._breaks.size();
    }

    public boolean isEmpty() {
        return this._breaks.isEmpty();
    }

    public final void removeBreak(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        this._breaks.remove(this._breakMap.get(valueOf));
        this._breakMap.remove(valueOf);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public final void serialize(LittleEndianOutput littleEndianOutput) {
        int size = this._breaks.size();
        littleEndianOutput.writeShort(size);
        for (int i10 = 0; i10 < size; i10++) {
            this._breaks.get(i10).serialize(littleEndianOutput);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        String str;
        String str2;
        StringBuffer stringBuffer = new StringBuffer();
        String str3 = "row";
        if (getSid() == 27) {
            str = "HORIZONTALPAGEBREAK";
            str2 = "col";
        } else {
            str = "VERTICALPAGEBREAK";
            str3 = "column";
            str2 = "row";
        }
        stringBuffer.append("[" + str + "]");
        stringBuffer.append("\n     .sid        =");
        stringBuffer.append((int) getSid());
        stringBuffer.append("\n     .numbreaks =");
        stringBuffer.append(getNumBreaks());
        stringBuffer.append("\n");
        Iterator<Break> breaksIterator = getBreaksIterator();
        for (int i10 = 0; i10 < getNumBreaks(); i10++) {
            Break next = breaksIterator.next();
            stringBuffer.append("     .");
            stringBuffer.append(str3);
            stringBuffer.append(" (zero-based) =");
            stringBuffer.append(next.main);
            stringBuffer.append("\n     .");
            stringBuffer.append(str2);
            stringBuffer.append("From    =");
            stringBuffer.append(next.subFrom);
            stringBuffer.append("\n     .");
            stringBuffer.append(str2);
            stringBuffer.append("To      =");
            stringBuffer.append(next.subTo);
            stringBuffer.append("\n");
        }
        stringBuffer.append("[" + str + "]");
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* loaded from: classes3.dex */
    public static final class Break {
        public static final int ENCODED_SIZE = 6;
        public int main;
        public int subFrom;
        public int subTo;

        public Break(int i10, int i11, int i12) {
            this.main = i10;
            this.subFrom = i11;
            this.subTo = i12;
        }

        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.writeShort(this.main + 1);
            littleEndianOutput.writeShort(this.subFrom);
            littleEndianOutput.writeShort(this.subTo);
        }

        public Break(RecordInputStream recordInputStream) {
            this.main = recordInputStream.readUShort() - 1;
            this.subFrom = recordInputStream.readUShort();
            this.subTo = recordInputStream.readUShort();
        }
    }

    public PageBreakRecord(RecordInputStream recordInputStream) {
        short readShort = recordInputStream.readShort();
        this._breaks = new ArrayList(readShort + 2);
        this._breakMap = new HashMap();
        for (int i10 = 0; i10 < readShort; i10++) {
            Break r22 = new Break(recordInputStream);
            this._breaks.add(r22);
            this._breakMap.put(Integer.valueOf(r22.main), r22);
        }
    }
}
