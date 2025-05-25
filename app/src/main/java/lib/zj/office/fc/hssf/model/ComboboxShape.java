package lib.zj.office.fc.hssf.model;

import lib.zj.office.fc.ddf.EscherBoolProperty;
import lib.zj.office.fc.ddf.EscherClientDataRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.hssf.record.CommonObjectDataSubRecord;
import lib.zj.office.fc.hssf.record.EndSubRecord;
import lib.zj.office.fc.hssf.record.FtCblsSubRecord;
import lib.zj.office.fc.hssf.record.LbsDataSubRecord;
import lib.zj.office.fc.hssf.record.ObjRecord;
import lib.zj.office.fc.hssf.usermodel.HSSFClientAnchor;
import lib.zj.office.fc.hssf.usermodel.HSSFSimpleShape;

/* loaded from: classes3.dex */
public class ComboboxShape extends AbstractShape {
    private ObjRecord objRecord;
    private EscherContainerRecord spContainer;

    public ComboboxShape(HSSFSimpleShape hSSFSimpleShape, int i10) {
        this.spContainer = createSpContainer(hSSFSimpleShape, i10);
        this.objRecord = createObjRecord(hSSFSimpleShape, i10);
    }

    private ObjRecord createObjRecord(HSSFSimpleShape hSSFSimpleShape, int i10) {
        ObjRecord objRecord = new ObjRecord();
        CommonObjectDataSubRecord commonObjectDataSubRecord = new CommonObjectDataSubRecord();
        commonObjectDataSubRecord.setObjectType((short) 20);
        commonObjectDataSubRecord.setObjectId(getCmoObjectId(i10));
        commonObjectDataSubRecord.setLocked(true);
        commonObjectDataSubRecord.setPrintable(false);
        commonObjectDataSubRecord.setAutofill(true);
        commonObjectDataSubRecord.setAutoline(false);
        FtCblsSubRecord ftCblsSubRecord = new FtCblsSubRecord();
        LbsDataSubRecord newAutoFilterInstance = LbsDataSubRecord.newAutoFilterInstance();
        EndSubRecord endSubRecord = new EndSubRecord();
        objRecord.addSubRecord(commonObjectDataSubRecord);
        objRecord.addSubRecord(ftCblsSubRecord);
        objRecord.addSubRecord(newAutoFilterInstance);
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
        escherSpRecord.setOptions((short) 3218);
        escherSpRecord.setShapeId(i10);
        escherSpRecord.setFlags(2560);
        escherOptRecord.setRecordId(EscherOptRecord.RECORD_ID);
        escherOptRecord.addEscherProperty(new EscherBoolProperty(EscherProperties.PROTECTION__LOCKAGAINSTGROUPING, 17039620));
        escherOptRecord.addEscherProperty(new EscherBoolProperty(EscherProperties.TEXT__SIZE_TEXT_TO_FIT_SHAPE, 524296));
        escherOptRecord.addEscherProperty(new EscherBoolProperty(EscherProperties.LINESTYLE__NOLINEDRAWDASH, 524288));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty((short) 959, 131072));
        HSSFClientAnchor hSSFClientAnchor = (HSSFClientAnchor) hSSFSimpleShape.getAnchor();
        hSSFClientAnchor.setAnchorType(1);
        EscherRecord createAnchor = createAnchor(hSSFClientAnchor);
        escherClientDataRecord.setRecordId(EscherClientDataRecord.RECORD_ID);
        escherClientDataRecord.setOptions((short) 0);
        escherContainerRecord.addChildRecord(escherSpRecord);
        escherContainerRecord.addChildRecord(escherOptRecord);
        escherContainerRecord.addChildRecord(createAnchor);
        escherContainerRecord.addChildRecord(escherClientDataRecord);
        return escherContainerRecord;
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
