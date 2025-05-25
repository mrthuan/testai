package lib.zj.office.fc.hssf.record;

import di.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.ddf.DefaultEscherRecordFactory;
import lib.zj.office.fc.ddf.EscherBoolProperty;
import lib.zj.office.fc.ddf.EscherClientAnchorRecord;
import lib.zj.office.fc.ddf.EscherClientDataRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherDgRecord;
import lib.zj.office.fc.ddf.EscherDggRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherRecordFactory;
import lib.zj.office.fc.ddf.EscherSerializationListener;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.ddf.EscherSpgrRecord;
import lib.zj.office.fc.ddf.EscherTextboxRecord;
import lib.zj.office.fc.hssf.model.AbstractShape;
import lib.zj.office.fc.hssf.model.CommentShape;
import lib.zj.office.fc.hssf.model.ConvertAnchor;
import lib.zj.office.fc.hssf.model.DrawingManager2;
import lib.zj.office.fc.hssf.model.TextboxShape;
import lib.zj.office.fc.hssf.usermodel.HSSFChart;
import lib.zj.office.fc.hssf.usermodel.HSSFClientAnchor;
import lib.zj.office.fc.hssf.usermodel.HSSFPatriarch;
import lib.zj.office.fc.hssf.usermodel.HSSFShape;
import lib.zj.office.fc.hssf.usermodel.HSSFShapeContainer;
import lib.zj.office.fc.hssf.usermodel.HSSFShapeFactory;
import lib.zj.office.fc.hssf.usermodel.HSSFShapeGroup;
import lib.zj.office.fc.hssf.usermodel.HSSFTextbox;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public final class EscherAggregate extends AbstractEscherHolderRecord {
    private static POILogger log = POILogFactory.getLogger(EscherAggregate.class);
    public static final short sid = 9876;
    private short drawingGroupId;
    private DrawingManager2 drawingManager;
    protected HSSFPatriarch patriarch;
    private Map<EscherRecord, Record> shapeToObj = new HashMap();
    private Map<EscherRecord, List<Record>> chartToObj = new HashMap();
    private List tailRec = new ArrayList();

    public EscherAggregate(DrawingManager2 drawingManager2) {
        this.drawingManager = drawingManager2;
    }

    private void convertGroup(HSSFShapeGroup hSSFShapeGroup, EscherContainerRecord escherContainerRecord, Map map) {
        EscherContainerRecord escherContainerRecord2 = new EscherContainerRecord();
        EscherContainerRecord escherContainerRecord3 = new EscherContainerRecord();
        EscherSpgrRecord escherSpgrRecord = new EscherSpgrRecord();
        EscherSpRecord escherSpRecord = new EscherSpRecord();
        EscherOptRecord escherOptRecord = new EscherOptRecord();
        EscherClientDataRecord escherClientDataRecord = new EscherClientDataRecord();
        escherContainerRecord2.setRecordId(EscherContainerRecord.SPGR_CONTAINER);
        escherContainerRecord2.setOptions((short) 15);
        escherContainerRecord3.setRecordId(EscherContainerRecord.SP_CONTAINER);
        escherContainerRecord3.setOptions((short) 15);
        escherSpgrRecord.setRecordId(EscherSpgrRecord.RECORD_ID);
        escherSpgrRecord.setOptions((short) 1);
        escherSpgrRecord.setRectX1(hSSFShapeGroup.getX1());
        escherSpgrRecord.setRectY1(hSSFShapeGroup.getY1());
        escherSpgrRecord.setRectX2(hSSFShapeGroup.getX2());
        escherSpgrRecord.setRectY2(hSSFShapeGroup.getY2());
        escherSpRecord.setRecordId(EscherSpRecord.RECORD_ID);
        escherSpRecord.setOptions((short) 2);
        int allocateShapeId = this.drawingManager.allocateShapeId(this.drawingGroupId);
        escherSpRecord.setShapeId(allocateShapeId);
        if (hSSFShapeGroup.getAnchor() instanceof HSSFClientAnchor) {
            escherSpRecord.setFlags(513);
        } else {
            escherSpRecord.setFlags(515);
        }
        escherOptRecord.setRecordId(EscherOptRecord.RECORD_ID);
        escherOptRecord.setOptions((short) 35);
        escherOptRecord.addEscherProperty(new EscherBoolProperty(EscherProperties.PROTECTION__LOCKAGAINSTGROUPING, 262148));
        escherOptRecord.addEscherProperty(new EscherBoolProperty((short) 959, 524288));
        EscherRecord createAnchor = ConvertAnchor.createAnchor(hSSFShapeGroup.getAnchor());
        escherClientDataRecord.setRecordId(EscherClientDataRecord.RECORD_ID);
        escherClientDataRecord.setOptions((short) 0);
        escherContainerRecord2.addChildRecord(escherContainerRecord3);
        escherContainerRecord3.addChildRecord(escherSpgrRecord);
        escherContainerRecord3.addChildRecord(escherSpRecord);
        escherContainerRecord3.addChildRecord(escherOptRecord);
        escherContainerRecord3.addChildRecord(createAnchor);
        escherContainerRecord3.addChildRecord(escherClientDataRecord);
        ObjRecord objRecord = new ObjRecord();
        CommonObjectDataSubRecord commonObjectDataSubRecord = new CommonObjectDataSubRecord();
        commonObjectDataSubRecord.setObjectType((short) 0);
        commonObjectDataSubRecord.setObjectId(allocateShapeId);
        commonObjectDataSubRecord.setLocked(true);
        commonObjectDataSubRecord.setPrintable(true);
        commonObjectDataSubRecord.setAutofill(true);
        commonObjectDataSubRecord.setAutoline(true);
        GroupMarkerSubRecord groupMarkerSubRecord = new GroupMarkerSubRecord();
        EndSubRecord endSubRecord = new EndSubRecord();
        objRecord.addSubRecord(commonObjectDataSubRecord);
        objRecord.addSubRecord(groupMarkerSubRecord);
        objRecord.addSubRecord(endSubRecord);
        map.put(escherClientDataRecord, objRecord);
        escherContainerRecord.addChildRecord(escherContainerRecord2);
        convertShapes(hSSFShapeGroup, escherContainerRecord2, map);
    }

    private void convertPatriarch(HSSFPatriarch hSSFPatriarch) {
        EscherContainerRecord escherContainerRecord = new EscherContainerRecord();
        EscherContainerRecord escherContainerRecord2 = new EscherContainerRecord();
        EscherContainerRecord escherContainerRecord3 = new EscherContainerRecord();
        EscherSpgrRecord escherSpgrRecord = new EscherSpgrRecord();
        EscherSpRecord escherSpRecord = new EscherSpRecord();
        escherContainerRecord.setRecordId(EscherContainerRecord.DG_CONTAINER);
        escherContainerRecord.setOptions((short) 15);
        EscherDgRecord createDgRecord = this.drawingManager.createDgRecord();
        this.drawingGroupId = createDgRecord.getDrawingGroupId();
        escherContainerRecord2.setRecordId(EscherContainerRecord.SPGR_CONTAINER);
        escherContainerRecord2.setOptions((short) 15);
        escherContainerRecord3.setRecordId(EscherContainerRecord.SP_CONTAINER);
        escherContainerRecord3.setOptions((short) 15);
        escherSpgrRecord.setRecordId(EscherSpgrRecord.RECORD_ID);
        escherSpgrRecord.setOptions((short) 1);
        escherSpgrRecord.setRectX1(hSSFPatriarch.getX1());
        escherSpgrRecord.setRectY1(hSSFPatriarch.getY1());
        escherSpgrRecord.setRectX2(hSSFPatriarch.getX2());
        escherSpgrRecord.setRectY2(hSSFPatriarch.getY2());
        escherSpRecord.setRecordId(EscherSpRecord.RECORD_ID);
        escherSpRecord.setOptions((short) 2);
        escherSpRecord.setShapeId(this.drawingManager.allocateShapeId(createDgRecord.getDrawingGroupId()));
        escherSpRecord.setFlags(5);
        escherContainerRecord.addChildRecord(createDgRecord);
        escherContainerRecord.addChildRecord(escherContainerRecord2);
        escherContainerRecord2.addChildRecord(escherContainerRecord3);
        escherContainerRecord3.addChildRecord(escherSpgrRecord);
        escherContainerRecord3.addChildRecord(escherSpRecord);
        addEscherRecord(escherContainerRecord);
    }

    private void convertShapes(HSSFShapeContainer hSSFShapeContainer, EscherContainerRecord escherContainerRecord, Map map) {
        if (escherContainerRecord != null) {
            for (HSSFShape hSSFShape : hSSFShapeContainer.getChildren()) {
                if (hSSFShape instanceof HSSFShapeGroup) {
                    convertGroup((HSSFShapeGroup) hSSFShape, escherContainerRecord, map);
                } else {
                    AbstractShape createShape = AbstractShape.createShape(hSSFShape, this.drawingManager.allocateShapeId(this.drawingGroupId));
                    map.put(findClientData(createShape.getSpContainer()), createShape.getObjRecord());
                    if (createShape instanceof TextboxShape) {
                        TextboxShape textboxShape = (TextboxShape) createShape;
                        map.put(textboxShape.getEscherTextbox(), textboxShape.getTextObjectRecord());
                        if (createShape instanceof CommentShape) {
                            this.tailRec.add(((CommentShape) createShape).getNoteRecord());
                        }
                    }
                    escherContainerRecord.addChildRecord(createShape.getSpContainer());
                }
            }
            return;
        }
        throw new IllegalArgumentException("Parent record required");
    }

    private void convertUserModelToRecords() {
        if (this.patriarch != null) {
            this.shapeToObj.clear();
            this.tailRec.clear();
            this.chartToObj.clear();
            clearEscherRecords();
            if (this.patriarch.getChildren().size() != 0) {
                convertPatriarch(this.patriarch);
                Iterator<EscherRecord> childIterator = ((EscherContainerRecord) getEscherRecord(0)).getChildIterator();
                EscherContainerRecord escherContainerRecord = null;
                while (childIterator.hasNext()) {
                    EscherRecord next = childIterator.next();
                    if (next.getRecordId() == -4093) {
                        escherContainerRecord = (EscherContainerRecord) next;
                    }
                }
                convertShapes(this.patriarch, escherContainerRecord, this.shapeToObj);
                this.patriarch = null;
            }
        }
    }

    public static EscherAggregate createAggregate(List list, int i10, DrawingManager2 drawingManager2) {
        int i11;
        byte[] data;
        int i12;
        final ArrayList arrayList = new ArrayList();
        EscherRecordFactory escherRecordFactory = new DefaultEscherRecordFactory() { // from class: lib.zj.office.fc.hssf.record.EscherAggregate.1
            @Override // lib.zj.office.fc.ddf.DefaultEscherRecordFactory, lib.zj.office.fc.ddf.EscherRecordFactory
            public EscherRecord createRecord(byte[] bArr, int i13) {
                EscherRecord createRecord = super.createRecord(bArr, i13);
                if (createRecord.getRecordId() == -4079 || createRecord.getRecordId() == -4083) {
                    arrayList.add(createRecord);
                }
                return createRecord;
            }
        };
        EscherAggregate escherAggregate = new EscherAggregate(drawingManager2);
        int i13 = i10;
        int i14 = 0;
        while (i13 > -1 && (i12 = i13 + 1) < list.size() && (sid(list, i13) == 236 || sid(list, i13) == 60)) {
            if (isObjectRecord(list, i12)) {
                if (sid(list, i13) == 60) {
                    i14 += ((ContinueRecord) list.get(i13)).getDataSize();
                } else {
                    i14 += ((DrawingRecord) list.get(i13)).getData().length;
                }
            }
            i13 = nextDrawingRecord(list, i13);
        }
        byte[] bArr = new byte[i14];
        int i15 = i10;
        int i16 = 0;
        while (i15 > -1) {
            int i17 = i15 + 1;
            if (i17 >= list.size() || (sid(list, i15) != 236 && sid(list, i15) != 60)) {
                break;
            }
            if (isObjectRecord(list, i17)) {
                if (sid(list, i15) == 60) {
                    data = ((ContinueRecord) list.get(i15)).getData();
                } else {
                    data = ((DrawingRecord) list.get(i15)).getData();
                }
                if (data != null) {
                    System.arraycopy(data, 0, bArr, i16, data.length);
                    i16 += data.length;
                }
            }
            i15 = nextDrawingRecord(list, i15);
        }
        int i18 = 0;
        while (i18 < i14) {
            try {
                EscherRecord createRecord = escherRecordFactory.createRecord(bArr, i18);
                int fillFields = createRecord.fillFields(bArr, i18, escherRecordFactory);
                escherAggregate.addEscherRecord(createRecord);
                i18 += fillFields;
            } catch (Exception unused) {
            }
        }
        escherAggregate.shapeToObj = new HashMap();
        int i19 = 0;
        while (i10 > -1) {
            int i20 = i10 + 1;
            if (i20 >= list.size() || (sid(list, i10) != 236 && sid(list, i10) != 60)) {
                break;
            } else if (!isObjectRecord(list, i20)) {
                i10 = nextDrawingRecord(list, i10);
            } else {
                Record record = (Record) list.get(i20);
                try {
                    if ((record instanceof ObjRecord) && (((ObjRecord) record).getSubRecords().get(0) instanceof CommonObjectDataSubRecord)) {
                        if (((CommonObjectDataSubRecord) ((ObjRecord) record).getSubRecords().get(0)).getObjectType() == 5) {
                            ArrayList arrayList2 = new ArrayList();
                            int i21 = i10 + 2;
                            Record record2 = (Record) list.get(i21);
                            while (record2.getSid() != 10) {
                                arrayList2.add(record2);
                                i21++;
                                record2 = (Record) list.get(i21);
                            }
                            i11 = i19 + 1;
                            escherAggregate.chartToObj.put((EscherRecord) arrayList.get(i19), arrayList2);
                            i10 = i21 + 1;
                            i19 = i11;
                        } else {
                            i11 = i19 + 1;
                            escherAggregate.shapeToObj.put((EscherRecord) arrayList.get(i19), record);
                        }
                    } else {
                        i11 = i19 + 1;
                        escherAggregate.shapeToObj.put((EscherRecord) arrayList.get(i19), record);
                    }
                    i10 += 2;
                    i19 = i11;
                } catch (Exception unused2) {
                }
            }
        }
        return escherAggregate;
    }

    private EscherRecord findClientData(EscherContainerRecord escherContainerRecord) {
        Iterator<EscherRecord> childIterator = escherContainerRecord.getChildIterator();
        while (childIterator.hasNext()) {
            EscherRecord next = childIterator.next();
            if (next.getRecordId() == -4079) {
                return next;
            }
        }
        throw new IllegalArgumentException("Can not find client data record");
    }

    private int getEscherRecordSize(List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((EscherRecord) it.next()).getRecordSize();
        }
        return i10;
    }

    private static boolean isObjectRecord(List list, int i10) {
        if (sid(list, i10) != 93 && sid(list, i10) != 438) {
            return false;
        }
        return true;
    }

    public static int nextDrawingRecord(List list, int i10) {
        int size = list.size();
        while (true) {
            i10++;
            if (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof Record) {
                    Record record = (Record) obj;
                    if (record.getSid() == 236 || record.getSid() == 60) {
                        break;
                    }
                }
            } else {
                return -1;
            }
        }
        return i10;
    }

    public static int shapeContainRecords(List list, int i10) {
        if (sid(list, i10) != 236 && sid(list, i10) != 60) {
            return 0;
        }
        int i11 = i10 + 1;
        if (!isObjectRecord(list, i11)) {
            return 0;
        }
        Record record = (Record) list.get(i11);
        int i12 = 2;
        if (record instanceof ObjRecord) {
            ObjRecord objRecord = (ObjRecord) record;
            if ((objRecord.getSubRecords().get(0) instanceof CommonObjectDataSubRecord) && ((CommonObjectDataSubRecord) objRecord.getSubRecords().get(0)).getObjectType() == 5) {
                ArrayList arrayList = new ArrayList();
                int i13 = i10 + 2;
                Object obj = list.get(i13);
                while (true) {
                    Record record2 = (Record) obj;
                    if (record2.getSid() != 10) {
                        arrayList.add(record2);
                        i13++;
                        i12++;
                        obj = list.get(i13);
                    } else {
                        return i12 + 1;
                    }
                }
            }
        }
        if (!(list.get(i10 + 2) instanceof NoteRecord)) {
            return 2;
        }
        return 3;
    }

    private static short sid(List list, int i10) {
        return ((Record) list.get(i10)).getSid();
    }

    public Object associateShapeToObjRecord(EscherRecord escherRecord, ObjRecord objRecord) {
        return this.shapeToObj.put(escherRecord, objRecord);
    }

    public void clear() {
        clearEscherRecords();
        this.shapeToObj.clear();
        this.chartToObj.clear();
    }

    public void convertRecordsToUserModel(e eVar) {
        int i10;
        EscherSpgrRecord escherSpgrRecord;
        if (this.patriarch != null) {
            List<EscherContainerRecord> list = getgetEscherContainers();
            if (list.size() == 0) {
                return;
            }
            if (list.get(0).getChildContainers().size() > 0) {
                List<EscherContainerRecord> childContainers = list.get(0).getChildContainers().get(0).getChildContainers();
                if (childContainers.size() != 0) {
                    Iterator<EscherRecord> childIterator = childContainers.get(0).getChildIterator();
                    while (true) {
                        if (!childIterator.hasNext()) {
                            escherSpgrRecord = null;
                            break;
                        }
                        EscherRecord next = childIterator.next();
                        if (next instanceof EscherSpgrRecord) {
                            escherSpgrRecord = (EscherSpgrRecord) next;
                            break;
                        }
                    }
                    if (escherSpgrRecord != null) {
                        this.patriarch.setCoordinates(escherSpgrRecord.getRectX1(), escherSpgrRecord.getRectY1(), escherSpgrRecord.getRectX2(), escherSpgrRecord.getRectY2());
                    }
                    i10 = 1;
                    for (int i11 = 1; i11 < childContainers.size(); i11++) {
                        EscherContainerRecord escherContainerRecord = childContainers.get(i11);
                        HSSFShape createShape = HSSFShapeFactory.createShape(eVar, this.shapeToObj, escherContainerRecord, null);
                        if (createShape != null) {
                            convertRecordsToUserModel(escherContainerRecord, createShape);
                            this.patriarch.addShape(createShape);
                        }
                    }
                } else {
                    throw new IllegalStateException("No child escher containers at the point that should hold the patriach data, and one container per top level shape!");
                }
            } else {
                i10 = 0;
            }
            while (i10 < list.size()) {
                EscherContainerRecord escherContainerRecord2 = list.get(i10);
                HSSFShape createShape2 = HSSFShapeFactory.createShape(eVar, this.shapeToObj, escherContainerRecord2, null);
                if (createShape2 != null) {
                    convertRecordsToUserModel(escherContainerRecord2, createShape2);
                    this.patriarch.addShape(createShape2);
                }
                i10++;
            }
            this.drawingManager.getDgg().setFileIdClusters(new EscherDggRecord.FileIdCluster[0]);
            return;
        }
        throw new IllegalStateException("Must call setPatriarch() first");
    }

    public HSSFPatriarch getPatriarch() {
        return this.patriarch;
    }

    @Override // lib.zj.office.fc.hssf.record.AbstractEscherHolderRecord
    public String getRecordName() {
        return "ESCHERAGGREGATE";
    }

    @Override // lib.zj.office.fc.hssf.record.AbstractEscherHolderRecord, lib.zj.office.fc.hssf.record.RecordBase
    public int getRecordSize() {
        convertUserModelToRecords();
        int size = (this.shapeToObj.size() * 4) + getEscherRecordSize(getEscherRecords());
        int i10 = 0;
        int i11 = 0;
        for (Record record : this.shapeToObj.values()) {
            i11 += record.getRecordSize();
        }
        for (Record record2 : this.tailRec) {
            i10 += record2.getRecordSize();
        }
        return size + i11 + i10;
    }

    @Override // lib.zj.office.fc.hssf.record.AbstractEscherHolderRecord, lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.AbstractEscherHolderRecord, lib.zj.office.fc.hssf.record.RecordBase
    public int serialize(int i10, byte[] bArr) {
        int intValue;
        convertUserModelToRecords();
        List<EscherRecord> escherRecords = getEscherRecords();
        byte[] bArr2 = new byte[getEscherRecordSize(escherRecords)];
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (EscherRecord escherRecord : escherRecords) {
            i11 += escherRecord.serialize(i11, bArr2, new EscherSerializationListener() { // from class: lib.zj.office.fc.hssf.record.EscherAggregate.2
                @Override // lib.zj.office.fc.ddf.EscherSerializationListener
                public void afterRecordSerialize(int i12, short s4, int i13, EscherRecord escherRecord2) {
                    if (s4 == -4079 || s4 == -4083) {
                        arrayList.add(Integer.valueOf(i12));
                        arrayList2.add(escherRecord2);
                    }
                }

                @Override // lib.zj.office.fc.ddf.EscherSerializationListener
                public void beforeRecordSerialize(int i12, short s4, EscherRecord escherRecord2) {
                }
            });
        }
        arrayList2.add(0, null);
        arrayList.add(0, null);
        int i12 = i10;
        for (int i13 = 1; i13 < arrayList2.size(); i13++) {
            int intValue2 = ((Integer) arrayList.get(i13)).intValue() - 1;
            if (i13 == 1) {
                intValue = 0;
            } else {
                intValue = ((Integer) arrayList.get(i13 - 1)).intValue();
            }
            DrawingRecord drawingRecord = new DrawingRecord();
            int i14 = (intValue2 - intValue) + 1;
            byte[] bArr3 = new byte[i14];
            System.arraycopy(bArr2, intValue, bArr3, 0, i14);
            drawingRecord.setData(bArr3);
            int serialize = drawingRecord.serialize(i12, bArr) + i12;
            i12 = this.shapeToObj.get(arrayList2.get(i13)).serialize(serialize, bArr) + serialize;
        }
        for (int i15 = 0; i15 < this.tailRec.size(); i15++) {
            i12 += ((Record) this.tailRec.get(i15)).serialize(i12, bArr);
        }
        int i16 = i12 - i10;
        if (i16 == getRecordSize()) {
            return i16;
        }
        throw new RecordFormatException(i16 + " bytes written but getRecordSize() reports " + getRecordSize());
    }

    public void setPatriarch(HSSFPatriarch hSSFPatriarch) {
        this.patriarch = hSSFPatriarch;
    }

    @Override // lib.zj.office.fc.hssf.record.AbstractEscherHolderRecord, lib.zj.office.fc.hssf.record.Record
    public String toString() {
        String property = System.getProperty("line.separtor");
        StringBuffer stringBuffer = new StringBuffer("[");
        stringBuffer.append(getRecordName());
        stringBuffer.append("]" + property);
        for (EscherRecord escherRecord : getEscherRecords()) {
            stringBuffer.append(escherRecord.toString());
        }
        stringBuffer.append("[/");
        stringBuffer.append(getRecordName());
        stringBuffer.append("]" + property);
        return stringBuffer.toString();
    }

    private void convertRecordsToUserModel(EscherContainerRecord escherContainerRecord, Object obj) {
        Iterator<EscherRecord> childIterator = escherContainerRecord.getChildIterator();
        while (childIterator.hasNext()) {
            EscherRecord next = childIterator.next();
            if (next instanceof EscherSpgrRecord) {
                EscherSpgrRecord escherSpgrRecord = (EscherSpgrRecord) next;
                if (obj instanceof HSSFShapeGroup) {
                    ((HSSFShapeGroup) obj).setCoordinates(escherSpgrRecord.getRectX1(), escherSpgrRecord.getRectY1(), escherSpgrRecord.getRectX2(), escherSpgrRecord.getRectY2());
                } else {
                    throw new IllegalStateException("Got top level anchor but not processing a group");
                }
            } else if (!(next instanceof EscherClientAnchorRecord)) {
                if (next instanceof EscherTextboxRecord) {
                    Record record = this.shapeToObj.get((EscherTextboxRecord) next);
                    if ((record instanceof TextObjectRecord) && (obj instanceof HSSFTextbox)) {
                        TextObjectRecord textObjectRecord = (TextObjectRecord) record;
                        HSSFTextbox hSSFTextbox = (HSSFTextbox) obj;
                        if (!hSSFTextbox.isWordArt()) {
                            hSSFTextbox.setString(textObjectRecord.getStr());
                        }
                        hSSFTextbox.setHorizontalAlignment((short) textObjectRecord.getHorizontalTextAlignment());
                        hSSFTextbox.setVerticalAlignment((short) textObjectRecord.getVerticalTextAlignment());
                    }
                } else if ((next instanceof EscherClientDataRecord) && (obj instanceof HSSFChart)) {
                    HSSFChart.convertRecordsToChart(this.chartToObj.get((EscherClientDataRecord) next), (HSSFChart) obj);
                } else if (!(next instanceof EscherSpRecord)) {
                    boolean z10 = next instanceof EscherOptRecord;
                }
            }
        }
    }
}
