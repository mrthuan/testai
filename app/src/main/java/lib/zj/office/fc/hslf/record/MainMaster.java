package lib.zj.office.fc.hslf.record;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class MainMaster extends SheetContainer {
    private static long _type = 1016;
    private ColorSchemeAtom _colorScheme;
    private byte[] _header;
    private ColorSchemeAtom[] clrscheme;
    private PPDrawing ppDrawing;
    private SlideAtom slideAtom;
    private TxMasterStyleAtom[] txmasters;

    public MainMaster(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        int i12 = 0;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            Record[] recordArr = this._children;
            if (i12 < recordArr.length) {
                Record record = recordArr[i12];
                if (record instanceof SlideAtom) {
                    this.slideAtom = (SlideAtom) record;
                } else if (record instanceof PPDrawing) {
                    this.ppDrawing = (PPDrawing) record;
                } else if (record instanceof TxMasterStyleAtom) {
                    arrayList.add((TxMasterStyleAtom) record);
                } else if (record instanceof ColorSchemeAtom) {
                    arrayList2.add((ColorSchemeAtom) record);
                }
                if (this.ppDrawing != null) {
                    Record record2 = this._children[i12];
                    if (record2 instanceof ColorSchemeAtom) {
                        this._colorScheme = (ColorSchemeAtom) record2;
                    }
                }
                i12++;
            } else {
                this.txmasters = (TxMasterStyleAtom[]) arrayList.toArray(new TxMasterStyleAtom[arrayList.size()]);
                this.clrscheme = (ColorSchemeAtom[]) arrayList2.toArray(new ColorSchemeAtom[arrayList2.size()]);
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        super.dispose();
        SlideAtom slideAtom = this.slideAtom;
        if (slideAtom != null) {
            slideAtom.dispose();
        }
        PPDrawing pPDrawing = this.ppDrawing;
        if (pPDrawing != null) {
            pPDrawing.dispose();
        }
        TxMasterStyleAtom[] txMasterStyleAtomArr = this.txmasters;
        if (txMasterStyleAtomArr != null) {
            for (TxMasterStyleAtom txMasterStyleAtom : txMasterStyleAtomArr) {
                txMasterStyleAtom.dispose();
            }
        }
        ColorSchemeAtom[] colorSchemeAtomArr = this.clrscheme;
        if (colorSchemeAtomArr != null) {
            for (ColorSchemeAtom colorSchemeAtom : colorSchemeAtomArr) {
                colorSchemeAtom.dispose();
            }
        }
        ColorSchemeAtom colorSchemeAtom2 = this._colorScheme;
        if (colorSchemeAtom2 != null) {
            colorSchemeAtom2.dispose();
        }
    }

    @Override // lib.zj.office.fc.hslf.record.SheetContainer
    public ColorSchemeAtom getColorScheme() {
        return this._colorScheme;
    }

    public ColorSchemeAtom[] getColorSchemeAtoms() {
        return this.clrscheme;
    }

    @Override // lib.zj.office.fc.hslf.record.SheetContainer
    public PPDrawing getPPDrawing() {
        return this.ppDrawing;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public SlideAtom getSlideAtom() {
        return this.slideAtom;
    }

    public TxMasterStyleAtom[] getTxMasterStyleAtoms() {
        return this.txmasters;
    }
}
