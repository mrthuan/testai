package lib.zj.office.fc.hslf.usermodel;

import a6.h;
import androidx.activity.f;
import b.a;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import lib.zj.office.fc.hslf.HSLFSlideShow;
import lib.zj.office.fc.hslf.exceptions.CorruptPowerPointFileException;
import lib.zj.office.fc.hslf.model.HeadersFooters;
import lib.zj.office.fc.hslf.model.Hyperlink;
import lib.zj.office.fc.hslf.model.Notes;
import lib.zj.office.fc.hslf.model.Slide;
import lib.zj.office.fc.hslf.model.SlideMaster;
import lib.zj.office.fc.hslf.model.TitleMaster;
import lib.zj.office.fc.hslf.record.Document;
import lib.zj.office.fc.hslf.record.DocumentAtom;
import lib.zj.office.fc.hslf.record.ExAviMovie;
import lib.zj.office.fc.hslf.record.ExControl;
import lib.zj.office.fc.hslf.record.ExHyperlink;
import lib.zj.office.fc.hslf.record.ExMCIMovie;
import lib.zj.office.fc.hslf.record.ExObjList;
import lib.zj.office.fc.hslf.record.ExObjListAtom;
import lib.zj.office.fc.hslf.record.ExOleObjAtom;
import lib.zj.office.fc.hslf.record.ExVideoContainer;
import lib.zj.office.fc.hslf.record.ExtendedParagraphHeaderAtom;
import lib.zj.office.fc.hslf.record.ExtendedPresRuleContainer;
import lib.zj.office.fc.hslf.record.FontCollection;
import lib.zj.office.fc.hslf.record.HeadersFootersContainer;
import lib.zj.office.fc.hslf.record.MainMaster;
import lib.zj.office.fc.hslf.record.PersistPtrHolder;
import lib.zj.office.fc.hslf.record.PositionDependentRecord;
import lib.zj.office.fc.hslf.record.PositionDependentRecordContainer;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.RecordContainer;
import lib.zj.office.fc.hslf.record.RecordTypes;
import lib.zj.office.fc.hslf.record.SlideListWithText;
import lib.zj.office.java.awt.Dimension;

/* loaded from: classes3.dex */
public final class SlideShow {
    private Document _documentRecord;
    private FontCollection _fonts;
    private HSLFSlideShow _hslfSlideShow;
    private SlideMaster[] _masters;
    private Record[] _mostRecentCoreRecords;
    private Notes[] _notes;
    private Record[] _records;
    private Hashtable<Integer, Integer> _sheetIdToCoreRecordsLookup;
    private Slide[] _slides;
    private TitleMaster[] _titleMasters;
    private boolean isGetThumbnail;

    public SlideShow(HSLFSlideShow hSLFSlideShow) {
        this(hSLFSlideShow, false);
    }

    private void buildSlidesAndNotes() {
        lib.zj.office.fc.hslf.record.Notes[] notesArr;
        lib.zj.office.fc.hslf.record.Slide[] slideArr;
        int length;
        ExtendedPresRuleContainer.ExtendedParaAtomsSet[] extendedParaAtomsSetArr;
        ExtendedPresRuleContainer.ExtendedParaAtomsSet[] extendedParaAtomsSetArr2;
        Notes notes;
        Integer num;
        ExtendedPresRuleContainer extendedPresRuleContainer;
        Document document = this._documentRecord;
        if (document != null) {
            SlideListWithText masterSlideListWithText = document.getMasterSlideListWithText();
            SlideListWithText slideSlideListWithText = this._documentRecord.getSlideSlideListWithText();
            SlideListWithText notesSlideListWithText = this._documentRecord.getNotesSlideListWithText();
            if (masterSlideListWithText != null) {
                SlideListWithText.SlideAtomsSet[] slideAtomsSets = masterSlideListWithText.getSlideAtomsSets();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < slideAtomsSets.length; i10++) {
                    Record coreRecordForSAS = getCoreRecordForSAS(slideAtomsSets[i10]);
                    int slideIdentifier = slideAtomsSets[i10].getSlidePersistAtom().getSlideIdentifier();
                    if (coreRecordForSAS instanceof lib.zj.office.fc.hslf.record.Slide) {
                        TitleMaster titleMaster = new TitleMaster((lib.zj.office.fc.hslf.record.Slide) coreRecordForSAS, slideIdentifier);
                        titleMaster.setSlideShow(this);
                        arrayList2.add(titleMaster);
                    } else if (coreRecordForSAS instanceof MainMaster) {
                        SlideMaster slideMaster = new SlideMaster((MainMaster) coreRecordForSAS, slideIdentifier);
                        slideMaster.setSlideShow(this);
                        arrayList.add(slideMaster);
                    }
                }
                SlideMaster[] slideMasterArr = new SlideMaster[arrayList.size()];
                this._masters = slideMasterArr;
                arrayList.toArray(slideMasterArr);
                TitleMaster[] titleMasterArr = new TitleMaster[arrayList2.size()];
                this._titleMasters = titleMasterArr;
                arrayList2.toArray(titleMasterArr);
            }
            Hashtable hashtable = new Hashtable();
            if (notesSlideListWithText == null) {
                notesArr = new lib.zj.office.fc.hslf.record.Notes[0];
            } else {
                SlideListWithText.SlideAtomsSet[] slideAtomsSets2 = notesSlideListWithText.getSlideAtomsSets();
                ArrayList arrayList3 = new ArrayList();
                for (int i11 = 0; i11 < slideAtomsSets2.length; i11++) {
                    Record coreRecordForSAS2 = getCoreRecordForSAS(slideAtomsSets2[i11]);
                    if (coreRecordForSAS2 instanceof lib.zj.office.fc.hslf.record.Notes) {
                        arrayList3.add((lib.zj.office.fc.hslf.record.Notes) coreRecordForSAS2);
                        hashtable.put(Integer.valueOf(slideAtomsSets2[i11].getSlidePersistAtom().getSlideIdentifier()), Integer.valueOf(i11));
                    }
                }
                notesArr = (lib.zj.office.fc.hslf.record.Notes[]) arrayList3.toArray(new lib.zj.office.fc.hslf.record.Notes[arrayList3.size()]);
            }
            SlideListWithText.SlideAtomsSet[] slideAtomsSetArr = new SlideListWithText.SlideAtomsSet[0];
            if (slideSlideListWithText == null) {
                slideArr = new lib.zj.office.fc.hslf.record.Slide[0];
            } else {
                slideAtomsSetArr = slideSlideListWithText.getSlideAtomsSets();
                slideArr = new lib.zj.office.fc.hslf.record.Slide[slideAtomsSetArr.length];
                for (int i12 = 0; i12 < slideAtomsSetArr.length; i12++) {
                    Record coreRecordForSAS3 = getCoreRecordForSAS(slideAtomsSetArr[i12]);
                    if (coreRecordForSAS3 instanceof lib.zj.office.fc.hslf.record.Slide) {
                        slideArr[i12] = (lib.zj.office.fc.hslf.record.Slide) coreRecordForSAS3;
                    }
                }
            }
            int i13 = 1;
            if (this.isGetThumbnail) {
                length = Math.min(notesArr.length, 1);
            } else {
                length = notesArr.length;
            }
            this._notes = new Notes[length];
            int i14 = 0;
            while (true) {
                Notes[] notesArr2 = this._notes;
                if (i14 >= notesArr2.length) {
                    break;
                }
                notesArr2[i14] = new Notes(notesArr[i14]);
                this._notes[i14].setSlideShow(this);
                i14++;
            }
            if (this._documentRecord.getList() != null && (extendedPresRuleContainer = this._documentRecord.getList().getExtendedPresRuleContainer()) != null) {
                extendedParaAtomsSetArr = extendedPresRuleContainer.getExtendedParaAtomsSets();
            } else {
                extendedParaAtomsSetArr = null;
            }
            if (!this.isGetThumbnail) {
                i13 = slideArr.length;
            }
            this._slides = new Slide[i13];
            int i15 = 0;
            while (i15 < this._slides.length) {
                SlideListWithText.SlideAtomsSet slideAtomsSet = slideAtomsSetArr[i15];
                int slideIdentifier2 = slideAtomsSet.getSlidePersistAtom().getSlideIdentifier();
                Vector vector = new Vector();
                if (extendedParaAtomsSetArr != null) {
                    for (int i16 = 0; i16 < extendedParaAtomsSetArr.length; i16++) {
                        ExtendedParagraphHeaderAtom extendedParaHeaderAtom = extendedParaAtomsSetArr[i16].getExtendedParaHeaderAtom();
                        if (extendedParaHeaderAtom != null && extendedParaHeaderAtom.getRefSlideID() == slideIdentifier2) {
                            vector.add(extendedParaAtomsSetArr[i16]);
                        }
                    }
                }
                if (vector.size() > 0) {
                    extendedParaAtomsSetArr2 = (ExtendedPresRuleContainer.ExtendedParaAtomsSet[]) vector.toArray(new ExtendedPresRuleContainer.ExtendedParaAtomsSet[vector.size()]);
                } else {
                    extendedParaAtomsSetArr2 = null;
                }
                int notesID = slideArr[i15].getSlideAtom().getNotesID();
                if (notesID != 0 && (num = (Integer) hashtable.get(Integer.valueOf(notesID))) != null) {
                    int intValue = num.intValue();
                    Notes[] notesArr3 = this._notes;
                    if (intValue < notesArr3.length) {
                        notes = notesArr3[num.intValue()];
                        int i17 = i15 + 1;
                        this._slides[i15] = new Slide(slideArr[i15], notes, slideAtomsSet, extendedParaAtomsSetArr2, slideIdentifier2, i17);
                        this._slides[i15].setSlideShow(this);
                        this._slides[i15].setSlideShowSlideInfoAtom(slideArr[i15].getSlideShowSlideInfoAtom());
                        this._slides[i15].setSlideProgTagsContainer(slideArr[i15].getSlideProgTagsContainer());
                        i15 = i17;
                    }
                }
                notes = null;
                int i172 = i15 + 1;
                this._slides[i15] = new Slide(slideArr[i15], notes, slideAtomsSet, extendedParaAtomsSetArr2, slideIdentifier2, i172);
                this._slides[i15].setSlideShow(this);
                this._slides[i15].setSlideShowSlideInfoAtom(slideArr[i15].getSlideShowSlideInfoAtom());
                this._slides[i15].setSlideProgTagsContainer(slideArr[i15].getSlideProgTagsContainer());
                i15 = i172;
            }
            return;
        }
        throw new CorruptPowerPointFileException("The PowerPoint file didn't contain a Document Record in its PersistPtr blocks. It is probably corrupt.");
    }

    private void findMostRecentCoreRecords() {
        Hashtable hashtable = new Hashtable();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            Record[] recordArr = this._records;
            if (i11 >= recordArr.length) {
                break;
            }
            Record record = recordArr[i11];
            if (record instanceof PersistPtrHolder) {
                PersistPtrHolder persistPtrHolder = (PersistPtrHolder) record;
                int[] knownSlideIDs = persistPtrHolder.getKnownSlideIDs();
                for (int i12 : knownSlideIDs) {
                    Integer valueOf = Integer.valueOf(i12);
                    if (hashtable.containsKey(valueOf)) {
                        hashtable.remove(valueOf);
                    }
                }
                Hashtable<Integer, Integer> slideLocationsLookup = persistPtrHolder.getSlideLocationsLookup();
                for (int i13 : knownSlideIDs) {
                    Integer valueOf2 = Integer.valueOf(i13);
                    hashtable.put(valueOf2, slideLocationsLookup.get(valueOf2));
                }
            }
            i11++;
        }
        this._mostRecentCoreRecords = new Record[hashtable.size()];
        this._sheetIdToCoreRecordsLookup = new Hashtable<>();
        int length = this._mostRecentCoreRecords.length;
        int[] iArr = new int[length];
        Enumeration keys = hashtable.keys();
        for (int i14 = 0; i14 < length; i14++) {
            iArr[i14] = ((Integer) keys.nextElement()).intValue();
        }
        Arrays.sort(iArr);
        for (int i15 = 0; i15 < length; i15++) {
            this._sheetIdToCoreRecordsLookup.put(Integer.valueOf(iArr[i15]), Integer.valueOf(i15));
        }
        int i16 = 0;
        while (true) {
            Record[] recordArr2 = this._records;
            if (i16 >= recordArr2.length) {
                break;
            }
            Record record2 = recordArr2[i16];
            if (record2 instanceof PositionDependentRecord) {
                PositionDependentRecord positionDependentRecord = (PositionDependentRecord) record2;
                Integer valueOf3 = Integer.valueOf(positionDependentRecord.getLastOnDiskOffset());
                for (int i17 = 0; i17 < length; i17++) {
                    Integer valueOf4 = Integer.valueOf(iArr[i17]);
                    if (((Integer) hashtable.get(valueOf4)).equals(valueOf3)) {
                        int intValue = this._sheetIdToCoreRecordsLookup.get(valueOf4).intValue();
                        if (positionDependentRecord instanceof PositionDependentRecordContainer) {
                            ((PositionDependentRecordContainer) this._records[i16]).setSheetId(valueOf4.intValue());
                        }
                        this._mostRecentCoreRecords[intValue] = this._records[i16];
                    }
                }
            }
            i16++;
        }
        while (true) {
            Record[] recordArr3 = this._mostRecentCoreRecords;
            if (i10 < recordArr3.length) {
                Record record3 = recordArr3[i10];
                if (record3 != null && record3.getRecordType() == RecordTypes.Document.typeID) {
                    Document document = (Document) this._mostRecentCoreRecords[i10];
                    this._documentRecord = document;
                    this._fonts = document.getEnvironment().getFontCollection();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private Record getCoreRecordForRefID(int i10) {
        Integer num = this._sheetIdToCoreRecordsLookup.get(Integer.valueOf(i10));
        if (num != null) {
            return this._mostRecentCoreRecords[num.intValue()];
        }
        return null;
    }

    private Record getCoreRecordForSAS(SlideListWithText.SlideAtomsSet slideAtomsSet) {
        return getCoreRecordForRefID(slideAtomsSet.getSlidePersistAtom().getRefID());
    }

    public int addControl(String str, String str2) {
        ExObjList exObjList = (ExObjList) this._documentRecord.findFirstOfType(RecordTypes.ExObjList.typeID);
        if (exObjList == null) {
            exObjList = new ExObjList();
            Document document = this._documentRecord;
            document.addChildAfter(exObjList, document.getDocumentAtom());
        }
        ExObjListAtom exObjListAtom = exObjList.getExObjListAtom();
        int objectIDSeed = ((int) exObjListAtom.getObjectIDSeed()) + 1;
        exObjListAtom.setObjectIDSeed(objectIDSeed);
        ExControl exControl = new ExControl();
        ExOleObjAtom exOleObjAtom = exControl.getExOleObjAtom();
        exOleObjAtom.setObjID(objectIDSeed);
        exOleObjAtom.setDrawAspect(1);
        exOleObjAtom.setType(2);
        exOleObjAtom.setSubType(0);
        exControl.setProgId(str2);
        exControl.setMenuName(str);
        exControl.setClipboardName(str);
        exObjList.addChildAfter(exControl, exObjListAtom);
        return objectIDSeed;
    }

    public int addHyperlink(Hyperlink hyperlink) {
        ExObjList exObjList = (ExObjList) this._documentRecord.findFirstOfType(RecordTypes.ExObjList.typeID);
        if (exObjList == null) {
            exObjList = new ExObjList();
            Document document = this._documentRecord;
            document.addChildAfter(exObjList, document.getDocumentAtom());
        }
        ExObjListAtom exObjListAtom = exObjList.getExObjListAtom();
        int objectIDSeed = ((int) exObjListAtom.getObjectIDSeed()) + 1;
        exObjListAtom.setObjectIDSeed(objectIDSeed);
        ExHyperlink exHyperlink = new ExHyperlink();
        exHyperlink.getExHyperlinkAtom().setNumber(objectIDSeed);
        exHyperlink.setLinkURL(hyperlink.getAddress());
        exHyperlink.setLinkTitle(hyperlink.getTitle());
        exObjList.addChildAfter(exHyperlink, exObjListAtom);
        hyperlink.setId(objectIDSeed);
        return objectIDSeed;
    }

    public int addMovie(String str, int i10) {
        ExMCIMovie exMCIMovie;
        ExObjList exObjList = (ExObjList) this._documentRecord.findFirstOfType(RecordTypes.ExObjList.typeID);
        if (exObjList == null) {
            exObjList = new ExObjList();
            Document document = this._documentRecord;
            document.addChildAfter(exObjList, document.getDocumentAtom());
        }
        ExObjListAtom exObjListAtom = exObjList.getExObjListAtom();
        int objectIDSeed = ((int) exObjListAtom.getObjectIDSeed()) + 1;
        exObjListAtom.setObjectIDSeed(objectIDSeed);
        if (i10 != 1) {
            if (i10 == 2) {
                exMCIMovie = new ExAviMovie();
            } else {
                throw new IllegalArgumentException(a.c("Unsupported Movie: ", i10));
            }
        } else {
            exMCIMovie = new ExMCIMovie();
        }
        exObjList.appendChildRecord(exMCIMovie);
        ExVideoContainer exVideo = exMCIMovie.getExVideo();
        exVideo.getExMediaAtom().setObjectId(objectIDSeed);
        exVideo.getExMediaAtom().setMask(15204352);
        exVideo.getPathAtom().setText(str);
        return objectIDSeed;
    }

    public void dispose() {
        HSLFSlideShow hSLFSlideShow = this._hslfSlideShow;
        if (hSLFSlideShow != null) {
            hSLFSlideShow.dispose();
        }
        Record[] recordArr = this._records;
        if (recordArr != null) {
            for (Record record : recordArr) {
                record.dispose();
            }
        }
        Record[] recordArr2 = this._mostRecentCoreRecords;
        if (recordArr2 != null) {
            for (Record record2 : recordArr2) {
                record2.dispose();
            }
        }
        Hashtable<Integer, Integer> hashtable = this._sheetIdToCoreRecordsLookup;
        if (hashtable != null) {
            hashtable.clear();
        }
        Document document = this._documentRecord;
        if (document != null) {
            document.dispose();
        }
        SlideMaster[] slideMasterArr = this._masters;
        if (slideMasterArr != null) {
            for (SlideMaster slideMaster : slideMasterArr) {
                slideMaster.dispose();
            }
        }
        TitleMaster[] titleMasterArr = this._titleMasters;
        if (titleMasterArr != null) {
            for (TitleMaster titleMaster : titleMasterArr) {
                titleMaster.dispose();
            }
        }
        Slide[] slideArr = this._slides;
        if (slideArr != null) {
            for (Slide slide : slideArr) {
                slide.dispose();
            }
        }
        Notes[] notesArr = this._notes;
        if (notesArr != null) {
            for (Notes notes : notesArr) {
                notes.dispose();
            }
        }
        FontCollection fontCollection = this._fonts;
        if (fontCollection != null) {
            fontCollection.dispose();
        }
    }

    public Document getDocumentRecord() {
        return this._documentRecord;
    }

    public ObjectData[] getEmbeddedObjects() {
        return this._hslfSlideShow.getEmbeddedObjects();
    }

    public FontCollection getFontCollection() {
        return this._fonts;
    }

    public Record[] getMostRecentCoreRecords() {
        return this._mostRecentCoreRecords;
    }

    public Notes[] getNotes() {
        return this._notes;
    }

    public HeadersFooters getNotesHeadersFooters() {
        HeadersFootersContainer headersFootersContainer;
        boolean z10;
        boolean equals = "___PPT12".equals(getSlidesMasters()[0].getProgrammableTag());
        Record[] childRecords = this._documentRecord.getChildRecords();
        int i10 = 0;
        while (true) {
            if (i10 < childRecords.length) {
                Record record = childRecords[i10];
                if ((record instanceof HeadersFootersContainer) && ((HeadersFootersContainer) record).getOptions() == 79) {
                    headersFootersContainer = (HeadersFootersContainer) childRecords[i10];
                    break;
                }
                i10++;
            } else {
                headersFootersContainer = null;
                break;
            }
        }
        if (headersFootersContainer == null) {
            headersFootersContainer = new HeadersFootersContainer((short) 79);
            z10 = true;
        } else {
            z10 = false;
        }
        if (equals) {
            Notes[] notesArr = this._notes;
            if (notesArr.length > 0) {
                return new HeadersFooters(headersFootersContainer, notesArr[0], z10, equals);
            }
        }
        return new HeadersFooters(headersFootersContainer, this, z10, equals);
    }

    public int getNumberOfFonts() {
        return getDocumentRecord().getEnvironment().getFontCollection().getNumberOfFonts();
    }

    public Dimension getPageSize() {
        DocumentAtom documentAtom = this._documentRecord.getDocumentAtom();
        return new Dimension((int) ((((float) documentAtom.getSlideSizeX()) * 72.0f) / 576.0f), (int) ((((float) documentAtom.getSlideSizeY()) * 72.0f) / 576.0f));
    }

    public PictureData[] getPictureData() {
        return this._hslfSlideShow.getPictures();
    }

    public Slide getSlide(int i10) {
        if (i10 >= 0 && i10 < getSlideCount()) {
            return this._slides[i10];
        }
        return null;
    }

    public int getSlideCount() {
        return this._slides.length;
    }

    public HeadersFooters getSlideHeadersFooters() {
        HeadersFootersContainer headersFootersContainer;
        boolean z10 = false;
        boolean equals = "___PPT12".equals(getSlidesMasters()[0].getProgrammableTag());
        Record[] childRecords = this._documentRecord.getChildRecords();
        int i10 = 0;
        while (true) {
            if (i10 < childRecords.length) {
                Record record = childRecords[i10];
                if ((record instanceof HeadersFootersContainer) && ((HeadersFootersContainer) record).getOptions() == 63) {
                    headersFootersContainer = (HeadersFootersContainer) childRecords[i10];
                    break;
                }
                i10++;
            } else {
                headersFootersContainer = null;
                break;
            }
        }
        if (headersFootersContainer == null) {
            headersFootersContainer = new HeadersFootersContainer((short) 63);
            z10 = true;
        }
        return new HeadersFooters(headersFootersContainer, this, z10, equals);
    }

    public Slide[] getSlides() {
        return this._slides;
    }

    public SlideMaster[] getSlidesMasters() {
        return this._masters;
    }

    public SoundData[] getSoundData() {
        return SoundData.find(this._documentRecord);
    }

    public TitleMaster[] getTitleMasters() {
        return this._titleMasters;
    }

    public Slide removeSlide(int i10) {
        int notesID;
        SlideListWithText.SlideAtomsSet[] slideAtomsSets;
        int length = this._slides.length - 1;
        if (i10 >= 0 && i10 <= length) {
            SlideListWithText slideSlideListWithText = this._documentRecord.getSlideSlideListWithText();
            SlideListWithText.SlideAtomsSet[] slideAtomsSets2 = slideSlideListWithText.getSlideAtomsSets();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Notes notes : getNotes()) {
                arrayList4.add(notes);
            }
            Slide slide = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                Slide[] slideArr = this._slides;
                if (i11 >= slideArr.length) {
                    break;
                }
                if (i11 != i10) {
                    arrayList3.add(slideArr[i11]);
                    arrayList2.add(slideAtomsSets2[i11]);
                    this._slides[i11].setSlideNumber(i12);
                    arrayList.add(slideAtomsSets2[i11].getSlidePersistAtom());
                    arrayList.addAll(Arrays.asList(slideAtomsSets2[i11].getSlideRecords()));
                    i12++;
                } else {
                    slide = slideArr[i11];
                    arrayList4.remove(slide.getNotesSheet());
                }
                i11++;
            }
            if (arrayList2.size() == 0) {
                this._documentRecord.removeSlideListWithText(slideSlideListWithText);
            } else {
                slideSlideListWithText.setSlideAtomsSets((SlideListWithText.SlideAtomsSet[]) arrayList2.toArray(new SlideListWithText.SlideAtomsSet[arrayList2.size()]));
                slideSlideListWithText.setChildRecord((Record[]) arrayList.toArray(new Record[arrayList.size()]));
            }
            this._slides = (Slide[]) arrayList3.toArray(new Slide[arrayList3.size()]);
            if (slide != null && (notesID = slide.getSlideRecord().getSlideAtom().getNotesID()) != 0) {
                SlideListWithText notesSlideListWithText = this._documentRecord.getNotesSlideListWithText();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (SlideListWithText.SlideAtomsSet slideAtomsSet : notesSlideListWithText.getSlideAtomsSets()) {
                    if (slideAtomsSet.getSlidePersistAtom().getSlideIdentifier() != notesID) {
                        arrayList6.add(slideAtomsSet);
                        arrayList5.add(slideAtomsSet.getSlidePersistAtom());
                        if (slideAtomsSet.getSlideRecords() != null) {
                            arrayList5.addAll(Arrays.asList(slideAtomsSet.getSlideRecords()));
                        }
                    }
                }
                if (arrayList6.size() == 0) {
                    this._documentRecord.removeSlideListWithText(notesSlideListWithText);
                } else {
                    notesSlideListWithText.setSlideAtomsSets((SlideListWithText.SlideAtomsSet[]) arrayList6.toArray(new SlideListWithText.SlideAtomsSet[arrayList6.size()]));
                    notesSlideListWithText.setChildRecord((Record[]) arrayList5.toArray(new Record[arrayList5.size()]));
                }
            }
            this._notes = (Notes[]) arrayList4.toArray(new Notes[arrayList4.size()]);
            return slide;
        }
        throw new IllegalArgumentException(f.k("Slide index (", i10, ") is out of range (0..", length, ")"));
    }

    public void reorderSlide(int i10, int i11) {
        if (i10 >= 1 && i11 >= 1) {
            Slide[] slideArr = this._slides;
            if (i10 <= slideArr.length && i11 <= slideArr.length) {
                SlideListWithText slideSlideListWithText = this._documentRecord.getSlideSlideListWithText();
                SlideListWithText.SlideAtomsSet[] slideAtomsSets = slideSlideListWithText.getSlideAtomsSets();
                int i12 = i10 - 1;
                SlideListWithText.SlideAtomsSet slideAtomsSet = slideAtomsSets[i12];
                int i13 = i11 - 1;
                slideAtomsSets[i12] = slideAtomsSets[i13];
                slideAtomsSets[i13] = slideAtomsSet;
                ArrayList arrayList = new ArrayList();
                int i14 = 0;
                while (i14 < slideAtomsSets.length) {
                    arrayList.add(slideAtomsSets[i14].getSlidePersistAtom());
                    for (Record record : slideAtomsSets[i14].getSlideRecords()) {
                        arrayList.add(record);
                    }
                    Slide slide = this._slides[i14];
                    i14++;
                    slide.setSlideNumber(i14);
                }
                slideSlideListWithText.setChildRecord((Record[]) arrayList.toArray(new Record[arrayList.size()]));
                return;
            }
            throw new IllegalArgumentException(h.g(new StringBuilder("Old and new slide numbers must not exceed the number of slides ("), this._slides.length, ")"));
        }
        throw new IllegalArgumentException("Old and new slide numbers must be greater than 0");
    }

    public void setPageSize(Dimension dimension) {
        DocumentAtom documentAtom = this._documentRecord.getDocumentAtom();
        documentAtom.setSlideSizeX((dimension.width * 576) / 72.0f);
        documentAtom.setSlideSizeY((dimension.height * 576) / 72.0f);
    }

    public SlideShow(HSLFSlideShow hSLFSlideShow, boolean z10) {
        this._hslfSlideShow = hSLFSlideShow;
        Record[] records = hSLFSlideShow.getRecords();
        this._records = records;
        this.isGetThumbnail = z10;
        for (Record record : records) {
            if (record instanceof RecordContainer) {
                RecordContainer.handleParentAwareRecords((RecordContainer) record);
            }
        }
        findMostRecentCoreRecords();
        buildSlidesAndNotes();
    }

    public void write(OutputStream outputStream) {
    }
}
