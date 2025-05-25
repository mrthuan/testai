package lib.zj.office.fc.hssf.model;

import lib.zj.office.fc.ddf.EscherClientAnchorRecord;
import lib.zj.office.fc.ddf.EscherClientDataRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.ddf.EscherTextboxRecord;
import lib.zj.office.fc.hssf.record.CommonObjectDataSubRecord;
import lib.zj.office.fc.hssf.record.EndSubRecord;
import lib.zj.office.fc.hssf.record.ObjRecord;
import lib.zj.office.fc.hssf.record.TextObjectRecord;
import lib.zj.office.fc.hssf.usermodel.HSSFTextbox;

/* loaded from: classes3.dex */
public class TextboxShape extends AbstractShape {
    private EscherTextboxRecord escherTextbox;
    private ObjRecord objRecord;
    private EscherContainerRecord spContainer;
    private TextObjectRecord textObjectRecord;

    public TextboxShape(HSSFTextbox hSSFTextbox, int i10) {
        this.spContainer = createSpContainer(hSSFTextbox, i10);
        this.objRecord = createObjRecord(hSSFTextbox, i10);
        this.textObjectRecord = createTextObjectRecord(hSSFTextbox, i10);
    }

    private ObjRecord createObjRecord(HSSFTextbox hSSFTextbox, int i10) {
        ObjRecord objRecord = new ObjRecord();
        CommonObjectDataSubRecord commonObjectDataSubRecord = new CommonObjectDataSubRecord();
        commonObjectDataSubRecord.setObjectType((short) hSSFTextbox.getShapeType());
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

    private EscherContainerRecord createSpContainer(HSSFTextbox hSSFTextbox, int i10) {
        EscherContainerRecord escherContainerRecord = new EscherContainerRecord();
        EscherSpRecord escherSpRecord = new EscherSpRecord();
        EscherOptRecord escherOptRecord = new EscherOptRecord();
        new EscherClientAnchorRecord();
        EscherClientDataRecord escherClientDataRecord = new EscherClientDataRecord();
        this.escherTextbox = new EscherTextboxRecord();
        escherContainerRecord.setRecordId(EscherContainerRecord.SP_CONTAINER);
        escherContainerRecord.setOptions((short) 15);
        escherSpRecord.setRecordId(EscherSpRecord.RECORD_ID);
        escherSpRecord.setOptions((short) 3234);
        escherSpRecord.setShapeId(i10);
        escherSpRecord.setFlags(2560);
        escherOptRecord.setRecordId(EscherOptRecord.RECORD_ID);
        escherOptRecord.addEscherProperty(new EscherSimpleProperty((short) 128, 0));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty((short) 129, hSSFTextbox.getMarginLeft()));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty((short) 131, hSSFTextbox.getMarginRight()));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty((short) 132, hSSFTextbox.getMarginBottom()));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty((short) 130, hSSFTextbox.getMarginTop()));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty((short) 133, 0));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.TEXT__ANCHORTEXT, 0));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty((short) 959, 524288));
        addStandardOptions(hSSFTextbox, escherOptRecord);
        EscherRecord createAnchor = createAnchor(hSSFTextbox.getAnchor());
        escherClientDataRecord.setRecordId(EscherClientDataRecord.RECORD_ID);
        escherClientDataRecord.setOptions((short) 0);
        this.escherTextbox.setRecordId(EscherTextboxRecord.RECORD_ID);
        this.escherTextbox.setOptions((short) 0);
        escherContainerRecord.addChildRecord(escherSpRecord);
        escherContainerRecord.addChildRecord(escherOptRecord);
        escherContainerRecord.addChildRecord(createAnchor);
        escherContainerRecord.addChildRecord(escherClientDataRecord);
        escherContainerRecord.addChildRecord(this.escherTextbox);
        return escherContainerRecord;
    }

    private TextObjectRecord createTextObjectRecord(HSSFTextbox hSSFTextbox, int i10) {
        TextObjectRecord textObjectRecord = new TextObjectRecord();
        textObjectRecord.setHorizontalTextAlignment(hSSFTextbox.getHorizontalAlignment());
        textObjectRecord.setVerticalTextAlignment(hSSFTextbox.getVerticalAlignment());
        textObjectRecord.setTextLocked(true);
        textObjectRecord.setTextOrientation(0);
        textObjectRecord.setStr(hSSFTextbox.getString());
        return textObjectRecord;
    }

    public EscherRecord getEscherTextbox() {
        return this.escherTextbox;
    }

    @Override // lib.zj.office.fc.hssf.model.AbstractShape
    public ObjRecord getObjRecord() {
        return this.objRecord;
    }

    @Override // lib.zj.office.fc.hssf.model.AbstractShape
    public EscherContainerRecord getSpContainer() {
        return this.spContainer;
    }

    public TextObjectRecord getTextObjectRecord() {
        return this.textObjectRecord;
    }
}
