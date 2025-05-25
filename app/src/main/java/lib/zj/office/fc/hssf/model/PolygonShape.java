package lib.zj.office.fc.hssf.model;

import lib.zj.office.fc.ddf.EscherArrayProperty;
import lib.zj.office.fc.ddf.EscherClientDataRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherShapePathProperty;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.hssf.record.CommonObjectDataSubRecord;
import lib.zj.office.fc.hssf.record.EndSubRecord;
import lib.zj.office.fc.hssf.record.ObjRecord;
import lib.zj.office.fc.hssf.usermodel.HSSFPolygon;
import lib.zj.office.fc.hssf.usermodel.HSSFShape;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class PolygonShape extends AbstractShape {
    public static final short OBJECT_TYPE_MICROSOFT_OFFICE_DRAWING = 30;
    private ObjRecord objRecord;
    private EscherContainerRecord spContainer;

    public PolygonShape(HSSFPolygon hSSFPolygon, int i10) {
        this.spContainer = createSpContainer(hSSFPolygon, i10);
        this.objRecord = createObjRecord(hSSFPolygon, i10);
    }

    private ObjRecord createObjRecord(HSSFShape hSSFShape, int i10) {
        ObjRecord objRecord = new ObjRecord();
        CommonObjectDataSubRecord commonObjectDataSubRecord = new CommonObjectDataSubRecord();
        commonObjectDataSubRecord.setObjectType((short) 30);
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

    private EscherContainerRecord createSpContainer(HSSFPolygon hSSFPolygon, int i10) {
        EscherContainerRecord escherContainerRecord = new EscherContainerRecord();
        EscherSpRecord escherSpRecord = new EscherSpRecord();
        EscherOptRecord escherOptRecord = new EscherOptRecord();
        EscherRecord escherClientDataRecord = new EscherClientDataRecord();
        escherContainerRecord.setRecordId(EscherContainerRecord.SP_CONTAINER);
        escherContainerRecord.setOptions((short) 15);
        escherSpRecord.setRecordId(EscherSpRecord.RECORD_ID);
        escherSpRecord.setOptions((short) 370);
        escherSpRecord.setShapeId(i10);
        if (hSSFPolygon.getParent() == null) {
            escherSpRecord.setFlags(2560);
        } else {
            escherSpRecord.setFlags(2562);
        }
        escherOptRecord.setRecordId(EscherOptRecord.RECORD_ID);
        escherOptRecord.addEscherProperty(new EscherSimpleProperty((short) 4, false, false, 0));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__RIGHT, false, false, hSSFPolygon.getDrawAreaWidth()));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__BOTTOM, false, false, hSSFPolygon.getDrawAreaHeight()));
        escherOptRecord.addEscherProperty(new EscherShapePathProperty(EscherProperties.GEOMETRY__SHAPEPATH, 4));
        EscherArrayProperty escherArrayProperty = new EscherArrayProperty(EscherProperties.GEOMETRY__VERTICES, false, new byte[0]);
        escherArrayProperty.setNumberOfElementsInArray(hSSFPolygon.getXPoints().length + 1);
        escherArrayProperty.setNumberOfElementsInMemory(hSSFPolygon.getXPoints().length + 1);
        escherArrayProperty.setSizeOfElements(65520);
        for (int i11 = 0; i11 < hSSFPolygon.getXPoints().length; i11++) {
            byte[] bArr = new byte[4];
            LittleEndian.putShort(bArr, 0, (short) hSSFPolygon.getXPoints()[i11]);
            LittleEndian.putShort(bArr, 2, (short) hSSFPolygon.getYPoints()[i11]);
            escherArrayProperty.setElement(i11, bArr);
        }
        int length = hSSFPolygon.getXPoints().length;
        byte[] bArr2 = new byte[4];
        LittleEndian.putShort(bArr2, 0, (short) hSSFPolygon.getXPoints()[0]);
        LittleEndian.putShort(bArr2, 2, (short) hSSFPolygon.getYPoints()[0]);
        escherArrayProperty.setElement(length, bArr2);
        escherOptRecord.addEscherProperty(escherArrayProperty);
        EscherArrayProperty escherArrayProperty2 = new EscherArrayProperty(EscherProperties.GEOMETRY__SEGMENTINFO, false, null);
        escherArrayProperty2.setSizeOfElements(2);
        escherArrayProperty2.setNumberOfElementsInArray((hSSFPolygon.getXPoints().length * 2) + 4);
        escherArrayProperty2.setNumberOfElementsInMemory((hSSFPolygon.getXPoints().length * 2) + 4);
        escherArrayProperty2.setElement(0, new byte[]{0, 64});
        escherArrayProperty2.setElement(1, new byte[]{0, -84});
        for (int i12 = 0; i12 < hSSFPolygon.getXPoints().length; i12++) {
            int i13 = i12 * 2;
            escherArrayProperty2.setElement(i13 + 2, new byte[]{1, 0});
            escherArrayProperty2.setElement(i13 + 3, new byte[]{0, -84});
        }
        escherArrayProperty2.setElement(escherArrayProperty2.getNumberOfElementsInArray() - 2, new byte[]{1, 96});
        escherArrayProperty2.setElement(escherArrayProperty2.getNumberOfElementsInArray() - 1, new byte[]{0, Byte.MIN_VALUE});
        escherOptRecord.addEscherProperty(escherArrayProperty2);
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__FILLOK, false, false, 65537));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.LINESTYLE__LINESTARTARROWHEAD, false, false, 0));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.LINESTYLE__LINEENDARROWHEAD, false, false, 0));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.LINESTYLE__LINEENDCAPSTYLE, false, false, 0));
        addStandardOptions(hSSFPolygon, escherOptRecord);
        EscherRecord createAnchor = createAnchor(hSSFPolygon.getAnchor());
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
