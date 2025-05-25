package lib.zj.office.fc.hslf.model;

import lib.zj.office.fc.hslf.model.textproperties.TextProp;

/* loaded from: classes3.dex */
public final class TitleMaster extends MasterSheet {
    private TextRun[] _runs;

    public TitleMaster(lib.zj.office.fc.hslf.record.Slide slide, int i10) {
        super(slide, i10);
        this._runs = Sheet.findTextRuns(getPPDrawing());
        int i11 = 0;
        while (true) {
            TextRun[] textRunArr = this._runs;
            if (i11 < textRunArr.length) {
                textRunArr[i11].setSheet(this);
                i11++;
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
        SlideMaster[] slidesMasters = getSlideShow().getSlidesMasters();
        int masterID = ((lib.zj.office.fc.hslf.record.Slide) getSheetContainer()).getSlideAtom().getMasterID();
        for (int i10 = 0; i10 < slidesMasters.length; i10++) {
            if (masterID == slidesMasters[i10]._getSheetNumber()) {
                return slidesMasters[i10];
            }
        }
        return null;
    }

    @Override // lib.zj.office.fc.hslf.model.MasterSheet
    public TextProp getStyleAttribute(int i10, int i11, String str, boolean z10) {
        MasterSheet masterSheet = getMasterSheet();
        if (masterSheet == null) {
            return null;
        }
        return masterSheet.getStyleAttribute(i10, i11, str, z10);
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public TextRun[] getTextRuns() {
        return this._runs;
    }
}
