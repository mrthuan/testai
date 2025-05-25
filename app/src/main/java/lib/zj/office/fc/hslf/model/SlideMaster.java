package lib.zj.office.fc.hslf.model;

import lib.zj.office.fc.hslf.model.textproperties.TextProp;
import lib.zj.office.fc.hslf.model.textproperties.TextPropCollection;
import lib.zj.office.fc.hslf.record.MainMaster;
import lib.zj.office.fc.hslf.record.TxMasterStyleAtom;
import lib.zj.office.fc.hslf.usermodel.SlideShow;

/* loaded from: classes3.dex */
public final class SlideMaster extends MasterSheet {
    private TextRun[] _runs;
    private TxMasterStyleAtom[] _txmaster;

    public SlideMaster(MainMaster mainMaster, int i10) {
        super(mainMaster, i10);
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
        TxMasterStyleAtom[] txMasterStyleAtomArr = this._txmaster;
        if (txMasterStyleAtomArr != null) {
            for (TxMasterStyleAtom txMasterStyleAtom : txMasterStyleAtomArr) {
                if (txMasterStyleAtom != null) {
                    txMasterStyleAtom.dispose();
                }
            }
        }
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public MasterSheet getMasterSheet() {
        return null;
    }

    @Override // lib.zj.office.fc.hslf.model.MasterSheet
    public TextProp getStyleAttribute(int i10, int i11, String str, boolean z10) {
        TextPropCollection[] paragraphStyles;
        TextPropCollection textPropCollection;
        TextProp textProp = null;
        for (int i12 = i11; i12 >= 0; i12--) {
            if (z10) {
                paragraphStyles = this._txmaster[i10].getCharacterStyles();
            } else {
                paragraphStyles = this._txmaster[i10].getParagraphStyles();
            }
            if (i12 < paragraphStyles.length && (textPropCollection = paragraphStyles[i12]) != null) {
                textProp = textPropCollection.findByName(str);
            }
            if (textProp != null) {
                break;
            }
        }
        if (textProp == null) {
            int i13 = 0;
            if (z10) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        if (i10 != 7 && i10 != 8) {
                            return null;
                        }
                    }
                }
                i13 = 1;
            } else {
                if (i10 != 5) {
                    if (i10 != 6) {
                        if (i10 != 7 && i10 != 8) {
                            return null;
                        }
                    }
                }
                i13 = 1;
            }
            return getStyleAttribute(i13, i11, str, z10);
        }
        return textProp;
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public TextRun[] getTextRuns() {
        return this._runs;
    }

    public TxMasterStyleAtom[] getTxMasterStyleAtoms() {
        return this._txmaster;
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public void onAddTextShape(TextShape textShape) {
        TextRun textRun = textShape.getTextRun();
        TextRun[] textRunArr = this._runs;
        if (textRunArr == null) {
            this._runs = new TextRun[]{textRun};
            return;
        }
        int length = textRunArr.length + 1;
        TextRun[] textRunArr2 = new TextRun[length];
        System.arraycopy(textRunArr, 0, textRunArr2, 0, textRunArr.length);
        textRunArr2[length - 1] = textRun;
        this._runs = textRunArr2;
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public void setSlideShow(SlideShow slideShow) {
        super.setSlideShow(slideShow);
        if (this._txmaster == null) {
            this._txmaster = new TxMasterStyleAtom[9];
            TxMasterStyleAtom[] txMasterStyleAtoms = ((MainMaster) getSheetContainer()).getTxMasterStyleAtoms();
            for (int i10 = 0; i10 < txMasterStyleAtoms.length; i10++) {
                this._txmaster[txMasterStyleAtoms[i10].getTextType()] = txMasterStyleAtoms[i10];
            }
            TxMasterStyleAtom txMasterStyleAtom = getSlideShow().getDocumentRecord().getEnvironment().getTxMasterStyleAtom();
            this._txmaster[txMasterStyleAtom.getTextType()] = txMasterStyleAtom;
        }
    }
}
