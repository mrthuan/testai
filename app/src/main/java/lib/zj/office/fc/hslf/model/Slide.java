package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import java.util.Vector;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherDgRecord;
import lib.zj.office.fc.ddf.EscherDggRecord;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.hslf.record.ColorSchemeAtom;
import lib.zj.office.fc.hslf.record.Comment2000;
import lib.zj.office.fc.hslf.record.ExtendedParagraphHeaderAtom;
import lib.zj.office.fc.hslf.record.ExtendedPresRuleContainer;
import lib.zj.office.fc.hslf.record.HeadersFootersContainer;
import lib.zj.office.fc.hslf.record.RecordContainer;
import lib.zj.office.fc.hslf.record.RecordTypes;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hslf.record.SlideListWithText;
import lib.zj.office.fc.hslf.record.SlideProgTagsContainer;
import lib.zj.office.fc.hslf.record.SlideShowSlideInfoAtom;
import lib.zj.office.java.awt.Rectangle;

/* loaded from: classes3.dex */
public final class Slide extends Sheet {
    private SlideListWithText.SlideAtomsSet _atomSet;
    private ExtendedPresRuleContainer.ExtendedParaAtomsSet[] _extendedAtomsSets;
    private Notes _notes;
    private TextRun[] _runs;
    private int _slideNo;
    private SlideProgTagsContainer propTagsContainer;
    private SlideShowSlideInfoAtom ssSlideInfoAtom;

    public Slide(lib.zj.office.fc.hslf.record.Slide slide, Notes notes, SlideListWithText.SlideAtomsSet slideAtomsSet, ExtendedPresRuleContainer.ExtendedParaAtomsSet[] extendedParaAtomsSetArr, int i10, int i11) {
        super(slide, i10);
        this._notes = notes;
        this._atomSet = slideAtomsSet;
        this._slideNo = i11;
        this._extendedAtomsSets = extendedParaAtomsSetArr;
        TextRun[] findTextRuns = Sheet.findTextRuns(getPPDrawing());
        Vector vector = new Vector();
        SlideListWithText.SlideAtomsSet slideAtomsSet2 = this._atomSet;
        if (slideAtomsSet2 != null) {
            Sheet.findTextRuns(slideAtomsSet2.getSlideRecords(), vector);
        }
        this._runs = new TextRun[vector.size() + findTextRuns.length];
        int i12 = 0;
        while (i12 < vector.size()) {
            this._runs[i12] = (TextRun) vector.get(i12);
            this._runs[i12].setSheet(this);
            i12++;
        }
        for (TextRun textRun : findTextRuns) {
            this._runs[i12] = textRun;
            textRun.setSheet(this);
            i12++;
        }
        if (this._extendedAtomsSets == null) {
            return;
        }
        int i13 = 0;
        while (true) {
            TextRun[] textRunArr = this._runs;
            if (i13 >= textRunArr.length) {
                return;
            }
            if (textRunArr[i13].getExtendedParagraphAtom() == null) {
                int runType = this._runs[i13].getRunType();
                int i14 = 0;
                while (true) {
                    ExtendedPresRuleContainer.ExtendedParaAtomsSet[] extendedParaAtomsSetArr2 = this._extendedAtomsSets;
                    if (i14 >= extendedParaAtomsSetArr2.length) {
                        break;
                    }
                    ExtendedParagraphHeaderAtom extendedParaHeaderAtom = extendedParaAtomsSetArr2[i14].getExtendedParaHeaderAtom();
                    if (extendedParaHeaderAtom != null && extendedParaHeaderAtom.getTextType() == runType) {
                        this._runs[i13].setExtendedParagraphAtom(this._extendedAtomsSets[i14].getExtendedParaAtom());
                        break;
                    }
                    i14++;
                }
            }
            i13++;
        }
    }

    public TextBox addTitle() {
        Placeholder placeholder = new Placeholder();
        placeholder.setShapeType(1);
        placeholder.getTextRun().setRunType(0);
        placeholder.setText("Click to edit title");
        placeholder.setAnchor(new Rectangle(54, 48, 612, 90));
        addShape(placeholder);
        return placeholder;
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public void dispose() {
        super.dispose();
        SlideListWithText.SlideAtomsSet slideAtomsSet = this._atomSet;
        if (slideAtomsSet != null) {
            slideAtomsSet.dispose();
        }
        TextRun[] textRunArr = this._runs;
        if (textRunArr != null) {
            for (TextRun textRun : textRunArr) {
                textRun.dispose();
            }
        }
        Notes notes = this._notes;
        if (notes != null) {
            notes.dispose();
        }
        ExtendedPresRuleContainer.ExtendedParaAtomsSet[] extendedParaAtomsSetArr = this._extendedAtomsSets;
        if (extendedParaAtomsSetArr != null) {
            for (ExtendedPresRuleContainer.ExtendedParaAtomsSet extendedParaAtomsSet : extendedParaAtomsSetArr) {
                extendedParaAtomsSet.dispose();
            }
        }
        SlideShowSlideInfoAtom slideShowSlideInfoAtom = this.ssSlideInfoAtom;
        if (slideShowSlideInfoAtom != null) {
            slideShowSlideInfoAtom.dispose();
        }
        SlideProgTagsContainer slideProgTagsContainer = this.propTagsContainer;
        if (slideProgTagsContainer != null) {
            slideProgTagsContainer.dispose();
        }
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public Background getBackground() {
        if (getFollowMasterBackground()) {
            return getMasterSheet().getBackground();
        }
        return super.getBackground();
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public ColorSchemeAtom getColorScheme() {
        if (getFollowMasterScheme()) {
            return getMasterSheet().getColorScheme();
        }
        return super.getColorScheme();
    }

    public Comment[] getComments() {
        RecordContainer recordContainer;
        RecordContainer recordContainer2;
        RecordContainer recordContainer3 = (RecordContainer) getSheetContainer().findFirstOfType(RecordTypes.SlideProgTagsContainer.typeID);
        if (recordContainer3 != null && (recordContainer = (RecordContainer) recordContainer3.findFirstOfType(RecordTypes.SlideProgBinaryTagContainer.typeID)) != null && (recordContainer2 = (RecordContainer) recordContainer.findFirstOfType(RecordTypes.BinaryTagDataBlob.typeID)) != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < recordContainer2.getChildRecords().length; i11++) {
                if (recordContainer2.getChildRecords()[i11] instanceof Comment2000) {
                    i10++;
                }
            }
            Comment[] commentArr = new Comment[i10];
            for (int i12 = 0; i12 < recordContainer2.getChildRecords().length; i12++) {
                if (recordContainer2.getChildRecords()[i12] instanceof Comment2000) {
                    commentArr[i12] = new Comment((Comment2000) recordContainer2.getChildRecords()[i12]);
                }
            }
            return commentArr;
        }
        return new Comment[0];
    }

    public boolean getFollowMasterBackground() {
        return getSlideRecord().getSlideAtom().getFollowMasterBackground();
    }

    public boolean getFollowMasterObjects() {
        return getSlideRecord().getSlideAtom().getFollowMasterObjects();
    }

    public boolean getFollowMasterScheme() {
        return getSlideRecord().getSlideAtom().getFollowMasterScheme();
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public MasterSheet getMasterSheet() {
        SlideMaster slideMaster;
        TitleMaster[] titleMasters;
        SlideMaster[] slidesMasters = getSlideShow().getSlidesMasters();
        int masterID = getSlideRecord().getSlideAtom().getMasterID();
        int i10 = 0;
        while (true) {
            if (i10 < slidesMasters.length) {
                if (masterID == slidesMasters[i10]._getSheetNumber()) {
                    slideMaster = slidesMasters[i10];
                    break;
                }
                i10++;
            } else {
                slideMaster = null;
                break;
            }
        }
        if (slideMaster == null && (titleMasters = getSlideShow().getTitleMasters()) != null) {
            for (int i11 = 0; i11 < titleMasters.length; i11++) {
                if (masterID == titleMasters[i11]._getSheetNumber()) {
                    return titleMasters[i11];
                }
            }
            return slideMaster;
        }
        return slideMaster;
    }

    public Notes getNotesSheet() {
        return this._notes;
    }

    public SlideListWithText.SlideAtomsSet getSlideAtomsSet() {
        return this._atomSet;
    }

    public HeadersFooters getSlideHeadersFooters() {
        HeadersFootersContainer headersFootersContainer = getSlideRecord().getHeadersFootersContainer();
        if (headersFootersContainer != null) {
            return new HeadersFooters(headersFootersContainer, (Sheet) this, false, false);
        }
        return null;
    }

    public int getSlideNumber() {
        return this._slideNo;
    }

    public SlideProgTagsContainer getSlideProgTagsContainer() {
        return this.propTagsContainer;
    }

    public lib.zj.office.fc.hslf.record.Slide getSlideRecord() {
        return (lib.zj.office.fc.hslf.record.Slide) getSheetContainer();
    }

    public SlideShowSlideInfoAtom getSlideShowSlideInfoAtom() {
        return this.ssSlideInfoAtom;
    }

    @Override // lib.zj.office.fc.hslf.model.Sheet
    public TextRun[] getTextRuns() {
        return this._runs;
    }

    public String getTitle() {
        TextRun[] textRuns = getTextRuns();
        for (int i10 = 0; i10 < textRuns.length; i10++) {
            int runType = textRuns[i10].getRunType();
            if (runType == 6 || runType == 0) {
                return textRuns[i10].getText();
            }
        }
        return null;
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
    public void onCreate() {
        EscherSpRecord escherSpRecord;
        EscherDggRecord escherDggRecord = getSlideShow().getDocumentRecord().getPPDrawingGroup().getEscherDggRecord();
        EscherContainerRecord escherContainerRecord = (EscherContainerRecord) getSheetContainer().getPPDrawing().getEscherRecords()[0];
        EscherDgRecord escherDgRecord = (EscherDgRecord) s.F(escherContainerRecord, -4088);
        int maxDrawingGroupId = escherDggRecord.getMaxDrawingGroupId() + 1;
        escherDgRecord.setOptions((short) (maxDrawingGroupId << 4));
        escherDggRecord.setDrawingsSaved(escherDggRecord.getDrawingsSaved() + 1);
        escherDggRecord.setMaxDrawingGroupId(maxDrawingGroupId);
        for (EscherContainerRecord escherContainerRecord2 : escherContainerRecord.getChildContainers()) {
            short recordId = escherContainerRecord2.getRecordId();
            if (recordId != -4093) {
                if (recordId != -4092) {
                    escherSpRecord = null;
                } else {
                    escherSpRecord = (EscherSpRecord) escherContainerRecord2.getChildById(EscherSpRecord.RECORD_ID);
                }
            } else {
                escherSpRecord = (EscherSpRecord) ((EscherContainerRecord) escherContainerRecord2.getChild(0)).getChildById(EscherSpRecord.RECORD_ID);
            }
            if (escherSpRecord != null) {
                escherSpRecord.setShapeId(allocateShapeId());
            }
        }
        escherDgRecord.setNumShapes(1);
    }

    public void setExtendedAtom(ExtendedPresRuleContainer.ExtendedParaAtomsSet[] extendedParaAtomsSetArr) {
        this._extendedAtomsSets = extendedParaAtomsSetArr;
    }

    public void setFollowMasterBackground(boolean z10) {
        getSlideRecord().getSlideAtom().setFollowMasterBackground(z10);
    }

    public void setFollowMasterObjects(boolean z10) {
        getSlideRecord().getSlideAtom().setFollowMasterObjects(z10);
    }

    public void setFollowMasterScheme(boolean z10) {
        getSlideRecord().getSlideAtom().setFollowMasterScheme(z10);
    }

    public void setMasterSheet(MasterSheet masterSheet) {
        getSlideRecord().getSlideAtom().setMasterID(masterSheet._getSheetNumber());
    }

    public void setNotes(Notes notes) {
        this._notes = notes;
        SlideAtom slideAtom = getSlideRecord().getSlideAtom();
        if (notes == null) {
            slideAtom.setNotesID(0);
        } else {
            slideAtom.setNotesID(notes._getSheetNumber());
        }
    }

    public void setSlideNumber(int i10) {
        this._slideNo = i10;
    }

    public void setSlideProgTagsContainer(SlideProgTagsContainer slideProgTagsContainer) {
        this.propTagsContainer = slideProgTagsContainer;
    }

    public void setSlideShowSlideInfoAtom(SlideShowSlideInfoAtom slideShowSlideInfoAtom) {
        this.ssSlideInfoAtom = slideShowSlideInfoAtom;
    }

    public Slide(int i10, int i11, int i12) {
        super(new lib.zj.office.fc.hslf.record.Slide(), i10);
        this._slideNo = i12;
        getSheetContainer().setSheetId(i11);
    }
}
