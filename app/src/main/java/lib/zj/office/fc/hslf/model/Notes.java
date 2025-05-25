package lib.zj.office.fc.hslf.model;

/* loaded from: classes3.dex */
public final class Notes extends Sheet {
    private TextRun[] _runs;

    public Notes(lib.zj.office.fc.hslf.record.Notes notes) {
        super(notes, notes.getNotesAtom().getSlideID());
        this._runs = Sheet.findTextRuns(getPPDrawing());
        int i10 = 0;
        while (true) {
            TextRun[] textRunArr = this._runs;
            if (i10 < textRunArr.length) {
                textRunArr[i10].setSheet(this);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public void dispose() {
        super.dispose();
        TextRun[] textRunArr = this._runs;
        if (textRunArr != null) {
            for (TextRun textRun : textRunArr) {
                textRun.dispose();
            }
        }
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public MasterSheet getMasterSheet() {
        return null;
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public TextRun[] getTextRuns() {
        return this._runs;
    }
}
