package lib.zj.office.fc.hslf.record;

/* loaded from: classes3.dex */
public final class Notes extends SheetContainer {
    private static long _type = 1008;
    private ColorSchemeAtom _colorScheme;
    private byte[] _header;
    private NotesAtom notesAtom;
    private PPDrawing ppDrawing;

    public Notes(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        int i12 = 0;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        while (true) {
            Record[] recordArr = this._children;
            if (i12 < recordArr.length) {
                Record record = recordArr[i12];
                if (record instanceof NotesAtom) {
                    this.notesAtom = (NotesAtom) record;
                }
                if (record instanceof PPDrawing) {
                    this.ppDrawing = (PPDrawing) record;
                }
                if (this.ppDrawing != null && (record instanceof ColorSchemeAtom)) {
                    this._colorScheme = (ColorSchemeAtom) record;
                }
                i12++;
            } else {
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        super.dispose();
        NotesAtom notesAtom = this.notesAtom;
        if (notesAtom != null) {
            notesAtom.dispose();
        }
        PPDrawing pPDrawing = this.ppDrawing;
        if (pPDrawing != null) {
            pPDrawing.dispose();
        }
        ColorSchemeAtom colorSchemeAtom = this._colorScheme;
        if (colorSchemeAtom != null) {
            colorSchemeAtom.dispose();
        }
    }

    @Override // lib.zj.office.fc.hslf.record.SheetContainer
    public ColorSchemeAtom getColorScheme() {
        return this._colorScheme;
    }

    public NotesAtom getNotesAtom() {
        return this.notesAtom;
    }

    @Override // lib.zj.office.fc.hslf.record.SheetContainer
    public PPDrawing getPPDrawing() {
        return this.ppDrawing;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }
}
