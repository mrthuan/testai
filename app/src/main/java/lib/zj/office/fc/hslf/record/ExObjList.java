package lib.zj.office.fc.hslf.record;

import java.util.ArrayList;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class ExObjList extends RecordContainer {
    private static long _type = 1033;
    private byte[] _header;
    private ExObjListAtom exObjListAtom;

    public ExObjList(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        findInterestingChildren();
    }

    private void findInterestingChildren() {
        Record record = this._children[0];
        if (record instanceof ExObjListAtom) {
            this.exObjListAtom = (ExObjListAtom) record;
            return;
        }
        throw new IllegalStateException("First child record wasn't a ExObjListAtom, was of type " + this._children[0].getRecordType());
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        super.dispose();
        ExObjListAtom exObjListAtom = this.exObjListAtom;
        if (exObjListAtom != null) {
            exObjListAtom.dispose();
        }
    }

    public ExHyperlink get(int i10) {
        int i11 = 0;
        while (true) {
            Record[] recordArr = this._children;
            if (i11 < recordArr.length) {
                Record record = recordArr[i11];
                if (record instanceof ExHyperlink) {
                    ExHyperlink exHyperlink = (ExHyperlink) record;
                    if (exHyperlink.getExHyperlinkAtom().getNumber() == i10) {
                        return exHyperlink;
                    }
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public ExHyperlink[] getExHyperlinks() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            Record[] recordArr = this._children;
            if (i10 < recordArr.length) {
                Record record = recordArr[i10];
                if (record instanceof ExHyperlink) {
                    arrayList.add((ExHyperlink) record);
                }
                i10++;
            } else {
                return (ExHyperlink[]) arrayList.toArray(new ExHyperlink[arrayList.size()]);
            }
        }
    }

    public ExObjListAtom getExObjListAtom() {
        return this.exObjListAtom;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public ExObjList() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._children = new Record[1];
        bArr[0] = 15;
        LittleEndian.putShort(bArr, 2, (short) _type);
        this._children[0] = new ExObjListAtom();
        findInterestingChildren();
    }
}
