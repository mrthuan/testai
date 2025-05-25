package lib.zj.office.fc.hssf.model;

import lib.zj.office.fc.ddf.EscherClientDataRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.hssf.record.CommonObjectDataSubRecord;
import lib.zj.office.fc.hssf.record.EndSubRecord;
import lib.zj.office.fc.hssf.record.ObjRecord;
import lib.zj.office.fc.hssf.usermodel.HSSFAnchor;
import lib.zj.office.fc.hssf.usermodel.HSSFPicture;
import lib.zj.office.fc.hssf.usermodel.HSSFShape;
import lib.zj.office.fc.hssf.usermodel.HSSFSimpleShape;

/* loaded from: classes3.dex */
public class PictureShape extends AbstractShape {
    private ObjRecord objRecord;
    private EscherContainerRecord spContainer;

    public PictureShape(HSSFSimpleShape hSSFSimpleShape, int i10) {
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
        commonObjectDataSubRecord.setReserved2(0);
        EndSubRecord endSubRecord = new EndSubRecord();
        objRecord.addSubRecord(commonObjectDataSubRecord);
        objRecord.addSubRecord(endSubRecord);
        return objRecord;
    }

    private EscherContainerRecord createSpContainer(HSSFSimpleShape hSSFSimpleShape, int i10) {
        HSSFPicture hSSFPicture = (HSSFPicture) hSSFSimpleShape;
        EscherContainerRecord escherContainerRecord = new EscherContainerRecord();
        EscherSpRecord escherSpRecord = new EscherSpRecord();
        EscherOptRecord escherOptRecord = new EscherOptRecord();
        EscherClientDataRecord escherClientDataRecord = new EscherClientDataRecord();
        escherContainerRecord.setRecordId(EscherContainerRecord.SP_CONTAINER);
        escherContainerRecord.setOptions((short) 15);
        escherSpRecord.setRecordId(EscherSpRecord.RECORD_ID);
        escherSpRecord.setOptions((short) 1202);
        escherSpRecord.setShapeId(i10);
        escherSpRecord.setFlags(2560);
        escherOptRecord.setRecordId(EscherOptRecord.RECORD_ID);
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.BLIP__BLIPTODISPLAY, false, true, hSSFPicture.getPictureIndex()));
        addStandardOptions(hSSFPicture, escherOptRecord);
        HSSFAnchor anchor = hSSFPicture.getAnchor();
        if (anchor.isHorizontallyFlipped()) {
            escherSpRecord.setFlags(escherSpRecord.getFlags() | 64);
        }
        if (anchor.isVerticallyFlipped()) {
            escherSpRecord.setFlags(escherSpRecord.getFlags() | 128);
        }
        EscherRecord createAnchor = createAnchor(anchor);
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
