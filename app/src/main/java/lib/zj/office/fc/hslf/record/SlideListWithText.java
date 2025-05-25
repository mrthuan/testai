package lib.zj.office.fc.hslf.record;

import java.util.Vector;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class SlideListWithText extends RecordContainer {
    public static final int MASTER = 1;
    public static final int NOTES = 2;
    public static final int SLIDES = 0;
    private static long _type = 4080;
    private byte[] _header;
    private SlideAtomsSet[] slideAtomsSets;

    /* loaded from: classes3.dex */
    public class SlideAtomsSet {
        private SlidePersistAtom slidePersistAtom;
        private Record[] slideRecords;

        public SlideAtomsSet(SlidePersistAtom slidePersistAtom, Record[] recordArr) {
            this.slidePersistAtom = slidePersistAtom;
            this.slideRecords = recordArr;
        }

        public void dispose() {
            SlidePersistAtom slidePersistAtom = this.slidePersistAtom;
            if (slidePersistAtom != null) {
                slidePersistAtom.dispose();
            }
            Record[] recordArr = this.slideRecords;
            if (recordArr != null) {
                for (Record record : recordArr) {
                    record.dispose();
                }
            }
        }

        public SlidePersistAtom getSlidePersistAtom() {
            return this.slidePersistAtom;
        }

        public Record[] getSlideRecords() {
            return this.slideRecords;
        }
    }

    public SlideListWithText(byte[] bArr, int i10, int i11) {
        Record[] recordArr;
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        Vector vector = new Vector();
        int i12 = 0;
        while (true) {
            Record[] recordArr2 = this._children;
            if (i12 < recordArr2.length) {
                if (recordArr2[i12] instanceof SlidePersistAtom) {
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        recordArr = this._children;
                        if (i14 >= recordArr.length || (recordArr[i14] instanceof SlidePersistAtom)) {
                            break;
                        }
                        i14++;
                    }
                    int i15 = (i14 - i12) - 1;
                    Record[] recordArr3 = new Record[i15];
                    System.arraycopy(recordArr, i13, recordArr3, 0, i15);
                    vector.add(new SlideAtomsSet((SlidePersistAtom) this._children[i12], recordArr3));
                    i12 += i15;
                }
                i12++;
            } else {
                this.slideAtomsSets = (SlideAtomsSet[]) vector.toArray(new SlideAtomsSet[vector.size()]);
                return;
            }
        }
    }

    public void addSlidePersistAtom(SlidePersistAtom slidePersistAtom) {
        appendChildRecord(slidePersistAtom);
        SlideAtomsSet slideAtomsSet = new SlideAtomsSet(slidePersistAtom, new Record[0]);
        SlideAtomsSet[] slideAtomsSetArr = this.slideAtomsSets;
        int length = slideAtomsSetArr.length + 1;
        SlideAtomsSet[] slideAtomsSetArr2 = new SlideAtomsSet[length];
        System.arraycopy(slideAtomsSetArr, 0, slideAtomsSetArr2, 0, slideAtomsSetArr.length);
        slideAtomsSetArr2[length - 1] = slideAtomsSet;
        this.slideAtomsSets = slideAtomsSetArr2;
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        SlideAtomsSet[] slideAtomsSetArr = this.slideAtomsSets;
        if (slideAtomsSetArr != null) {
            for (SlideAtomsSet slideAtomsSet : slideAtomsSetArr) {
                slideAtomsSet.dispose();
            }
        }
    }

    public int getInstance() {
        return LittleEndian.getShort(this._header, 0) >> 4;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public SlideAtomsSet[] getSlideAtomsSets() {
        return this.slideAtomsSets;
    }

    public void setInstance(int i10) {
        LittleEndian.putShort(this._header, (short) ((i10 << 4) | 15));
    }

    public void setSlideAtomsSets(SlideAtomsSet[] slideAtomsSetArr) {
        this.slideAtomsSets = slideAtomsSetArr;
    }

    public SlideListWithText() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putUShort(bArr, 0, 15);
        LittleEndian.putUShort(this._header, 2, (int) _type);
        LittleEndian.putInt(this._header, 4, 0);
        this._children = new Record[0];
        this.slideAtomsSets = new SlideAtomsSet[0];
    }
}
