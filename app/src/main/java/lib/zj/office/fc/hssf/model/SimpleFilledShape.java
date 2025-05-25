package lib.zj.office.fc.hssf.model;

import lib.zj.office.fc.ddf.EscherClientDataRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.hssf.record.CommonObjectDataSubRecord;
import lib.zj.office.fc.hssf.record.EndSubRecord;
import lib.zj.office.fc.hssf.record.ObjRecord;
import lib.zj.office.fc.hssf.usermodel.HSSFShape;
import lib.zj.office.fc.hssf.usermodel.HSSFSimpleShape;

/* loaded from: classes3.dex */
public class SimpleFilledShape extends AbstractShape {
    private ObjRecord objRecord;
    private EscherContainerRecord spContainer;

    public SimpleFilledShape(HSSFSimpleShape hSSFSimpleShape, int i10) {
        this.spContainer = createSpContainer(hSSFSimpleShape, i10);
        this.objRecord = createObjRecord(hSSFSimpleShape, i10);
    }

    private ObjRecord createObjRecord(HSSFShape hSSFShape, int i10) {
        ObjRecord objRecord = new ObjRecord();
        CommonObjectDataSubRecord commonObjectDataSubRecord = new CommonObjectDataSubRecord();
        commonObjectDataSubRecord.setObjectType((short) ((HSSFSimpleShape) hSSFShape).getShapeType());
        commonObjectDataSubRecord.setObjectId(getCmoObjectId(i10));
        commonObjectDataSubRecord.setLocked(true);
        commonObjectDataSubRecord.setPrintable(true);
        commonObjectDataSubRecord.setAutofill(true);
        commonObjectDataSubRecord.setAutoline(true);
        EndSubRecord endSubRecord = new EndSubRecord();
        objRecord.addSubRecord(commonObjectDataSubRecord);
        objRecord.addSubRecord(endSubRecord);
        return objRecord;
    }

    private EscherContainerRecord createSpContainer(HSSFSimpleShape hSSFSimpleShape, int i10) {
        EscherContainerRecord escherContainerRecord = new EscherContainerRecord();
        EscherSpRecord escherSpRecord = new EscherSpRecord();
        EscherOptRecord escherOptRecord = new EscherOptRecord();
        EscherClientDataRecord escherClientDataRecord = new EscherClientDataRecord();
        escherContainerRecord.setRecordId(EscherContainerRecord.SP_CONTAINER);
        escherContainerRecord.setOptions((short) 15);
        escherSpRecord.setRecordId(EscherSpRecord.RECORD_ID);
        escherSpRecord.setOptions((short) ((objTypeToShapeType(hSSFSimpleShape.getShapeType()) << 4) | 2));
        escherSpRecord.setShapeId(i10);
        escherSpRecord.setFlags(2560);
        escherOptRecord.setRecordId(EscherOptRecord.RECORD_ID);
        addStandardOptions(hSSFSimpleShape, escherOptRecord);
        EscherRecord createAnchor = createAnchor(hSSFSimpleShape.getAnchor());
        escherClientDataRecord.setRecordId(EscherClientDataRecord.RECORD_ID);
        escherClientDataRecord.setOptions((short) 0);
        escherContainerRecord.addChildRecord(escherSpRecord);
        escherContainerRecord.addChildRecord(escherOptRecord);
        escherContainerRecord.addChildRecord(createAnchor);
        escherContainerRecord.addChildRecord(escherClientDataRecord);
        return escherContainerRecord;
    }

    private short objTypeToShapeType(int i10) {
        if (i10 == 3) {
            return (short) 3;
        }
        if (i10 == 2) {
            return (short) 1;
        }
        throw new IllegalArgumentException("Unable to handle an object of this type");
    }

    @Override // lib.zj.office.fc.hssf.model.AbstractShape
    public ObjRecord getObjRecord() {
        return this.objRecord;
    }

    @Override // lib.zj.office.fc.hssf.model.AbstractShape
    public EscherContainerRecord getSpContainer() {
        return this.spContainer;
    }
}
