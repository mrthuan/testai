package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherDgRecord;
import lib.zj.office.fc.ddf.EscherDggRecord;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.hslf.record.CString;
import lib.zj.office.fc.hslf.record.ColorSchemeAtom;
import lib.zj.office.fc.hslf.record.EscherTextboxWrapper;
import lib.zj.office.fc.hslf.record.ExtendedParagraphAtom;
import lib.zj.office.fc.hslf.record.OEPlaceholderAtom;
import lib.zj.office.fc.hslf.record.PPDrawing;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.RecordContainer;
import lib.zj.office.fc.hslf.record.RecordTypes;
import lib.zj.office.fc.hslf.record.RoundTripHFPlaceholder12;
import lib.zj.office.fc.hslf.record.SheetContainer;
import lib.zj.office.fc.hslf.usermodel.SlideShow;

/* loaded from: classes3.dex */
public abstract class Sheet {
    private Background _background;
    private SheetContainer _container;
    private Shape[] _shapes;
    private int _sheetNo;
    private SlideShow _slideShow;

    public Sheet(SheetContainer sheetContainer, int i10) {
        this._container = sheetContainer;
        this._sheetNo = i10;
    }

    public static TextRun[] findTextRuns(PPDrawing pPDrawing) {
        Vector vector = new Vector();
        EscherTextboxWrapper[] textboxWrappers = pPDrawing.getTextboxWrappers();
        for (int i10 = 0; i10 < textboxWrappers.length; i10++) {
            int size = vector.size();
            RecordContainer.handleParentAwareRecords(textboxWrappers[i10]);
            findTextRuns(textboxWrappers[i10].getChildRecords(), vector);
            if (vector.size() != size) {
                TextRun textRun = (TextRun) vector.get(vector.size() - 1);
                textRun.setShapeId(textboxWrappers[i10].getShapeId());
                boolean z10 = false;
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    if (textboxWrappers[i11].getShapeId() == 5003) {
                        Record[] childRecords = textboxWrappers[i11].getChildRecords();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= childRecords.length) {
                                break;
                            } else if (childRecords[0] instanceof ExtendedParagraphAtom) {
                                textRun.setExtendedParagraphAtom((ExtendedParagraphAtom) childRecords[i12]);
                                z10 = true;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (z10) {
                        break;
                    }
                }
            }
        }
        int size2 = vector.size();
        TextRun[] textRunArr = new TextRun[size2];
        for (int i13 = 0; i13 < size2; i13++) {
            textRunArr[i13] = (TextRun) vector.get(i13);
        }
        return textRunArr;
    }

    public int _getSheetNumber() {
        return this._sheetNo;
    }

    public int _getSheetRefId() {
        return this._container.getSheetId();
    }

    public void addShape(Shape shape) {
        ((EscherContainerRecord) s.F((EscherContainerRecord) getPPDrawing().getEscherRecords()[0], -4093)).addChildRecord(shape.getSpContainer());
        shape.setSheet(this);
        shape.setShapeId(allocateShapeId());
        shape.afterInsert(this);
    }

    public int allocateShapeId() {
        EscherDggRecord escherDggRecord = this._slideShow.getDocumentRecord().getPPDrawingGroup().getEscherDggRecord();
        EscherDgRecord escherDgRecord = this._container.getPPDrawing().getEscherDgRecord();
        escherDggRecord.setNumShapesSaved(escherDggRecord.getNumShapesSaved() + 1);
        for (int i10 = 0; i10 < escherDggRecord.getFileIdClusters().length; i10++) {
            EscherDggRecord.FileIdCluster fileIdCluster = escherDggRecord.getFileIdClusters()[i10];
            if (fileIdCluster.getDrawingGroupId() == escherDgRecord.getDrawingGroupId() && fileIdCluster.getNumShapeIdsUsed() != 1024) {
                int numShapeIdsUsed = ((i10 + 1) * 1024) + fileIdCluster.getNumShapeIdsUsed();
                fileIdCluster.incrementShapeId();
                escherDgRecord.setNumShapes(escherDgRecord.getNumShapes() + 1);
                escherDgRecord.setLastMSOSPID(numShapeIdsUsed);
                if (numShapeIdsUsed >= escherDggRecord.getShapeIdMax()) {
                    escherDggRecord.setShapeIdMax(numShapeIdsUsed + 1);
                }
                return numShapeIdsUsed;
            }
        }
        escherDggRecord.addCluster(escherDgRecord.getDrawingGroupId(), 0, false);
        escherDggRecord.getFileIdClusters()[escherDggRecord.getFileIdClusters().length - 1].incrementShapeId();
        escherDgRecord.setNumShapes(escherDgRecord.getNumShapes() + 1);
        int length = escherDggRecord.getFileIdClusters().length * 1024;
        escherDgRecord.setLastMSOSPID(length);
        if (length >= escherDggRecord.getShapeIdMax()) {
            escherDggRecord.setShapeIdMax(length + 1);
        }
        return length;
    }

    public void dispose() {
        Background background = this._background;
        if (background != null) {
            background.dispose();
        }
        Shape[] shapeArr = this._shapes;
        if (shapeArr != null) {
            for (Shape shape : shapeArr) {
                shape.dispose();
            }
        }
        SheetContainer sheetContainer = this._container;
        if (sheetContainer != null) {
            sheetContainer.dispose();
        }
    }

    public Background getBackground() {
        EscherContainerRecord escherContainerRecord;
        if (this._background == null) {
            Iterator<EscherRecord> childIterator = ((EscherContainerRecord) getPPDrawing().getEscherRecords()[0]).getChildIterator();
            while (true) {
                if (childIterator.hasNext()) {
                    EscherRecord next = childIterator.next();
                    if (next.getRecordId() == -4092) {
                        escherContainerRecord = (EscherContainerRecord) next;
                        break;
                    }
                } else {
                    escherContainerRecord = null;
                    break;
                }
            }
            if (escherContainerRecord != null) {
                Background background = new Background(escherContainerRecord, null);
                this._background = background;
                background.setSheet(this);
            }
        }
        return this._background;
    }

    public ColorSchemeAtom getColorScheme() {
        return this._container.getColorScheme();
    }

    public abstract MasterSheet getMasterSheet();

    public PPDrawing getPPDrawing() {
        return this._container.getPPDrawing();
    }

    public TextShape getPlaceholder(int i10) {
        Shape[] shapes;
        int i11;
        for (Shape shape : getShapes()) {
            if (shape instanceof TextShape) {
                TextShape textShape = (TextShape) shape;
                OEPlaceholderAtom placeholderAtom = textShape.getPlaceholderAtom();
                if (placeholderAtom != null) {
                    i11 = placeholderAtom.getPlaceholderId();
                } else {
                    RoundTripHFPlaceholder12 roundTripHFPlaceholder12 = (RoundTripHFPlaceholder12) textShape.getClientDataRecord(RecordTypes.RoundTripHFPlaceholder12.typeID);
                    if (roundTripHFPlaceholder12 != null) {
                        i11 = roundTripHFPlaceholder12.getPlaceholderId();
                    } else {
                        i11 = 0;
                    }
                }
                if (i11 == i10) {
                    return textShape;
                }
            }
        }
        return null;
    }

    public TextShape getPlaceholderByTextType(int i10) {
        Shape[] shapes;
        TextShape textShape;
        TextRun textRun;
        for (Shape shape : getShapes()) {
            if ((shape instanceof TextShape) && (textRun = (textShape = (TextShape) shape).getTextRun()) != null && textRun.getRunType() == i10) {
                return textShape;
            }
        }
        return null;
    }

    public String getProgrammableTag() {
        RecordContainer recordContainer;
        CString cString;
        RecordContainer recordContainer2 = (RecordContainer) getSheetContainer().findFirstOfType(RecordTypes.SlideProgTagsContainer.typeID);
        if (recordContainer2 != null && (recordContainer = (RecordContainer) recordContainer2.findFirstOfType(RecordTypes.SlideProgBinaryTagContainer.typeID)) != null && (cString = (CString) recordContainer.findFirstOfType(RecordTypes.CString.typeID)) != null) {
            return cString.getText();
        }
        return null;
    }

    public Shape[] getShapes() {
        EscherContainerRecord escherContainerRecord;
        Shape[] shapeArr = this._shapes;
        if (shapeArr != null) {
            return shapeArr;
        }
        Iterator<EscherRecord> childIterator = ((EscherContainerRecord) getPPDrawing().getEscherRecords()[0]).getChildIterator();
        while (true) {
            if (childIterator.hasNext()) {
                EscherRecord next = childIterator.next();
                if (next.getRecordId() == -4093) {
                    escherContainerRecord = (EscherContainerRecord) next;
                    break;
                }
            } else {
                escherContainerRecord = null;
                break;
            }
        }
        if (escherContainerRecord != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<EscherRecord> childIterator2 = escherContainerRecord.getChildIterator();
            if (childIterator2.hasNext()) {
                childIterator2.next();
            }
            while (childIterator2.hasNext()) {
                Shape createShape = ShapeFactory.createShape((EscherContainerRecord) childIterator2.next(), null);
                createShape.setSheet(this);
                arrayList.add(createShape);
            }
            Shape[] shapeArr2 = new Shape[arrayList.size()];
            this._shapes = shapeArr2;
            arrayList.toArray(shapeArr2);
            return this._shapes;
        }
        throw new IllegalStateException("spgr not found");
    }

    public SheetContainer getSheetContainer() {
        return this._container;
    }

    public SlideShow getSlideShow() {
        return this._slideShow;
    }

    public abstract TextRun[] getTextRuns();

    public boolean removeShape(Shape shape) {
        EscherContainerRecord escherContainerRecord;
        Iterator<EscherRecord> childIterator = ((EscherContainerRecord) getPPDrawing().getEscherRecords()[0]).getChildIterator();
        while (true) {
            if (childIterator.hasNext()) {
                EscherRecord next = childIterator.next();
                if (next.getRecordId() == -4093) {
                    escherContainerRecord = (EscherContainerRecord) next;
                    break;
                }
            } else {
                escherContainerRecord = null;
                break;
            }
        }
        if (escherContainerRecord == null) {
            return false;
        }
        List<EscherRecord> childRecords = escherContainerRecord.getChildRecords();
        boolean remove = childRecords.remove(shape.getSpContainer());
        escherContainerRecord.setChildRecords(childRecords);
        return remove;
    }

    public void setSlideShow(SlideShow slideShow) {
        this._slideShow = slideShow;
        TextRun[] textRuns = getTextRuns();
        if (textRuns != null) {
            for (TextRun textRun : textRuns) {
                textRun.supplySlideShow(this._slideShow);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void findTextRuns(lib.zj.office.fc.hslf.record.Record[] r8, java.util.Vector r9) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.length
            int r2 = r2 + (-1)
            if (r0 >= r2) goto La2
            r2 = r8[r0]
            boolean r3 = r2 instanceof lib.zj.office.fc.hslf.record.TextHeaderAtom
            if (r3 == 0) goto L9e
            lib.zj.office.fc.hslf.record.TextHeaderAtom r2 = (lib.zj.office.fc.hslf.record.TextHeaderAtom) r2
            int r3 = r8.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r0 >= r3) goto L20
            int r3 = r0 + 2
            r3 = r8[r3]
            boolean r5 = r3 instanceof lib.zj.office.fc.hslf.record.StyleTextPropAtom
            if (r5 == 0) goto L20
            lib.zj.office.fc.hslf.record.StyleTextPropAtom r3 = (lib.zj.office.fc.hslf.record.StyleTextPropAtom) r3
            goto L21
        L20:
            r3 = r4
        L21:
            int r5 = r0 + 1
            r6 = r8[r5]
            boolean r7 = r6 instanceof lib.zj.office.fc.hslf.record.TextCharsAtom
            if (r7 == 0) goto L31
            lib.zj.office.fc.hslf.record.TextCharsAtom r6 = (lib.zj.office.fc.hslf.record.TextCharsAtom) r6
            lib.zj.office.fc.hslf.model.TextRun r4 = new lib.zj.office.fc.hslf.model.TextRun
            r4.<init>(r2, r6, r3)
            goto L6e
        L31:
            boolean r7 = r6 instanceof lib.zj.office.fc.hslf.record.TextBytesAtom
            if (r7 == 0) goto L3d
            lib.zj.office.fc.hslf.record.TextBytesAtom r6 = (lib.zj.office.fc.hslf.record.TextBytesAtom) r6
            lib.zj.office.fc.hslf.model.TextRun r4 = new lib.zj.office.fc.hslf.model.TextRun
            r4.<init>(r2, r6, r3)
            goto L6e
        L3d:
            long r2 = r6.getRecordType()
            r6 = 4001(0xfa1, double:1.977E-320)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L48
            goto L6e
        L48:
            r2 = r8[r5]
            long r2 = r2.getRecordType()
            r6 = 4010(0xfaa, double:1.981E-320)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L55
            goto L6e
        L55:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Found a TextHeaderAtom not followed by a TextBytesAtom or TextCharsAtom: Followed by "
            r3.<init>(r6)
            r6 = r8[r5]
            long r6 = r6.getRecordType()
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
        L6e:
            if (r4 == 0) goto L9c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r0
        L76:
            int r6 = r8.length
            if (r3 >= r6) goto L8a
            if (r3 <= r0) goto L82
            r6 = r8[r3]
            boolean r6 = r6 instanceof lib.zj.office.fc.hslf.record.TextHeaderAtom
            if (r6 == 0) goto L82
            goto L8a
        L82:
            r6 = r8[r3]
            r2.add(r6)
            int r3 = r3 + 1
            goto L76
        L8a:
            int r0 = r2.size()
            lib.zj.office.fc.hslf.record.Record[] r0 = new lib.zj.office.fc.hslf.record.Record[r0]
            r2.toArray(r0)
            r4._records = r0
            r4.setIndex(r1)
            r9.add(r4)
            r0 = r5
        L9c:
            int r1 = r1 + 1
        L9e:
            int r0 = r0 + 1
            goto L2
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hslf.model.Sheet.findTextRuns(lib.zj.office.fc.hslf.record.Record[], java.util.Vector):void");
    }

    public void onCreate() {
    }

    public void onAddTextShape(TextShape textShape) {
    }
}
