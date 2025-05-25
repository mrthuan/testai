package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import java.util.Vector;

/* loaded from: classes3.dex */
public class ExtendedPresRuleContainer extends PositionDependentRecordContainer {
    private static long _type = 4014;
    private ExtendedParaAtomsSet[] _extendedAtomsSets;
    private byte[] _header;

    /* loaded from: classes3.dex */
    public class ExtendedParaAtomsSet {
        private ExtendedParagraphAtom _extendedParaAtom;
        private ExtendedParagraphHeaderAtom _extendedParaHeaderAtom;

        public ExtendedParaAtomsSet(ExtendedParagraphHeaderAtom extendedParagraphHeaderAtom, ExtendedParagraphAtom extendedParagraphAtom) {
            this._extendedParaHeaderAtom = extendedParagraphHeaderAtom;
            this._extendedParaAtom = extendedParagraphAtom;
        }

        public void dispose() {
            ExtendedParagraphHeaderAtom extendedParagraphHeaderAtom = this._extendedParaHeaderAtom;
            if (extendedParagraphHeaderAtom != null) {
                extendedParagraphHeaderAtom.dispose();
            }
            ExtendedParagraphAtom extendedParagraphAtom = this._extendedParaAtom;
            if (extendedParagraphAtom != null) {
                extendedParagraphAtom.dispose();
            }
        }

        public ExtendedParagraphAtom getExtendedParaAtom() {
            return this._extendedParaAtom;
        }

        public ExtendedParagraphHeaderAtom getExtendedParaHeaderAtom() {
            return this._extendedParaHeaderAtom;
        }
    }

    public ExtendedPresRuleContainer(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        int i12 = 0;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        Vector vector = new Vector();
        while (true) {
            Record[] recordArr = this._children;
            if (i12 < recordArr.length) {
                if (recordArr[i12] instanceof ExtendedParagraphAtom) {
                    int i13 = i12 - 1;
                    while (true) {
                        if (i13 >= 0) {
                            Record[] recordArr2 = this._children;
                            Record record = recordArr2[i13];
                            if (record instanceof ExtendedParagraphHeaderAtom) {
                                vector.add(new ExtendedParaAtomsSet((ExtendedParagraphHeaderAtom) record, (ExtendedParagraphAtom) recordArr2[i12]));
                                break;
                            }
                            i13--;
                        }
                    }
                }
                i12++;
            } else {
                this._extendedAtomsSets = (ExtendedParaAtomsSet[]) vector.toArray(new ExtendedParaAtomsSet[vector.size()]);
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        ExtendedParaAtomsSet[] extendedParaAtomsSetArr = this._extendedAtomsSets;
        if (extendedParaAtomsSetArr != null) {
            for (ExtendedParaAtomsSet extendedParaAtomsSet : extendedParaAtomsSetArr) {
                extendedParaAtomsSet.dispose();
            }
        }
    }

    public ExtendedParaAtomsSet[] getExtendedParaAtomsSets() {
        return this._extendedAtomsSets;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public void writeOut(OutputStream outputStream) {
    }
}
