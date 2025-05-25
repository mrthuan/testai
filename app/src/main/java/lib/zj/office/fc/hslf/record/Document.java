package lib.zj.office.fc.hslf.record;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class Document extends PositionDependentRecordContainer {
    private static long _type = 1000;
    private byte[] _header;
    private DocumentAtom documentAtom;
    private Environment environment;
    private ExObjList exObjList;
    private List list;
    private PPDrawingGroup ppDrawing;
    private SlideListWithText[] slwts;

    public Document(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        int i12 = 0;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        Record[] findChildRecords = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        this._children = findChildRecords;
        Record record = findChildRecords[0];
        if (record instanceof DocumentAtom) {
            this.documentAtom = (DocumentAtom) record;
            int i13 = 1;
            int i14 = 1;
            int i15 = 0;
            while (true) {
                Record[] recordArr = this._children;
                if (i14 >= recordArr.length) {
                    break;
                }
                Record record2 = recordArr[i14];
                if (record2 instanceof SlideListWithText) {
                    i15++;
                } else if (record2 instanceof Environment) {
                    this.environment = (Environment) record2;
                } else if (record2 instanceof PPDrawingGroup) {
                    this.ppDrawing = (PPDrawingGroup) record2;
                } else if (record2 instanceof ExObjList) {
                    this.exObjList = (ExObjList) record2;
                } else if (record2 instanceof List) {
                    this.list = (List) record2;
                }
                i14++;
            }
            this.slwts = new SlideListWithText[i15];
            while (true) {
                Record[] recordArr2 = this._children;
                if (i13 < recordArr2.length) {
                    Record record3 = recordArr2[i13];
                    if (record3 instanceof SlideListWithText) {
                        this.slwts[i12] = (SlideListWithText) record3;
                        i12++;
                    }
                    i13++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("The first child of a Document must be a DocumentAtom");
        }
    }

    public void addSlideListWithText(SlideListWithText slideListWithText) {
        Record[] recordArr = this._children;
        Record record = recordArr[recordArr.length - 1];
        if (record.getRecordType() == RecordTypes.EndDocument.typeID) {
            addChildBefore(slideListWithText, record);
            SlideListWithText[] slideListWithTextArr = this.slwts;
            int length = slideListWithTextArr.length + 1;
            SlideListWithText[] slideListWithTextArr2 = new SlideListWithText[length];
            System.arraycopy(slideListWithTextArr, 0, slideListWithTextArr2, 0, slideListWithTextArr.length);
            slideListWithTextArr2[length - 1] = slideListWithText;
            this.slwts = slideListWithTextArr2;
            return;
        }
        throw new IllegalStateException("The last child record of a Document should be EndDocument, but it was " + record);
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        DocumentAtom documentAtom = this.documentAtom;
        if (documentAtom != null) {
            documentAtom.dispose();
        }
        Environment environment = this.environment;
        if (environment != null) {
            environment.dispose();
        }
        PPDrawingGroup pPDrawingGroup = this.ppDrawing;
        if (pPDrawingGroup != null) {
            pPDrawingGroup.dispose();
        }
        SlideListWithText[] slideListWithTextArr = this.slwts;
        if (slideListWithTextArr != null) {
            for (SlideListWithText slideListWithText : slideListWithTextArr) {
                slideListWithText.dispose();
            }
        }
        ExObjList exObjList = this.exObjList;
        if (exObjList != null) {
            exObjList.dispose();
        }
        List list = this.list;
        if (list != null) {
            list.dispose();
        }
    }

    public DocumentAtom getDocumentAtom() {
        return this.documentAtom;
    }

    public Environment getEnvironment() {
        return this.environment;
    }

    public ExObjList getExObjList() {
        return this.exObjList;
    }

    public List getList() {
        return this.list;
    }

    public SlideListWithText getMasterSlideListWithText() {
        int i10 = 0;
        while (true) {
            SlideListWithText[] slideListWithTextArr = this.slwts;
            if (i10 < slideListWithTextArr.length) {
                if (slideListWithTextArr[i10].getInstance() == 1) {
                    return this.slwts[i10];
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public SlideListWithText getNotesSlideListWithText() {
        int i10 = 0;
        while (true) {
            SlideListWithText[] slideListWithTextArr = this.slwts;
            if (i10 < slideListWithTextArr.length) {
                if (slideListWithTextArr[i10].getInstance() == 2) {
                    return this.slwts[i10];
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public PPDrawingGroup getPPDrawingGroup() {
        return this.ppDrawing;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public SlideListWithText[] getSlideListWithTexts() {
        return this.slwts;
    }

    public SlideListWithText getSlideSlideListWithText() {
        int i10 = 0;
        while (true) {
            SlideListWithText[] slideListWithTextArr = this.slwts;
            if (i10 < slideListWithTextArr.length) {
                if (slideListWithTextArr[i10].getInstance() == 0) {
                    return this.slwts[i10];
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public void removeSlideListWithText(SlideListWithText slideListWithText) {
        SlideListWithText[] slideListWithTextArr;
        ArrayList arrayList = new ArrayList();
        for (SlideListWithText slideListWithText2 : this.slwts) {
            if (slideListWithText2 != slideListWithText) {
                arrayList.add(slideListWithText2);
            } else {
                removeChild(slideListWithText);
            }
        }
        this.slwts = (SlideListWithText[]) arrayList.toArray(new SlideListWithText[arrayList.size()]);
    }
}
