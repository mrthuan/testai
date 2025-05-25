package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import java.util.Iterator;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherPropertyFactory;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.hslf.record.InteractiveInfo;
import lib.zj.office.fc.hslf.record.OEShapeAtom;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.RecordTypes;

/* loaded from: classes3.dex */
public final class ShapeFactory {
    public static Shape createShape(EscherContainerRecord escherContainerRecord, Shape shape) {
        if (escherContainerRecord.getRecordId() == -4093) {
            return createShapeGroup(escherContainerRecord, shape);
        }
        return createSimpeShape(escherContainerRecord, shape);
    }

    public static ShapeGroup createShapeGroup(EscherContainerRecord escherContainerRecord, Shape shape) {
        ShapeGroup shapeGroup;
        EscherRecord F = s.F((EscherContainerRecord) escherContainerRecord.getChild(0), -3806);
        if (F != null) {
            try {
                EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) new EscherPropertyFactory().createProperties(F.serialize(), 8, F.getInstance()).get(0);
                if (escherSimpleProperty.getPropertyNumber() == 927 && escherSimpleProperty.getPropertyValue() == 1) {
                    shapeGroup = new Table(escherContainerRecord, shape);
                } else {
                    shapeGroup = new ShapeGroup(escherContainerRecord, shape);
                }
                return shapeGroup;
            } catch (Exception unused) {
                return new ShapeGroup(escherContainerRecord, shape);
            }
        }
        return new ShapeGroup(escherContainerRecord, shape);
    }

    public static Shape createSimpeShape(EscherContainerRecord escherContainerRecord, Shape shape) {
        EscherSpRecord escherSpRecord = (EscherSpRecord) escherContainerRecord.getChildById(EscherSpRecord.RECORD_ID);
        int options = escherSpRecord.getOptions() >> 4;
        Shape shape2 = null;
        if (options != 0) {
            if (options != 20 && options != 38) {
                if (options != 75) {
                    if (options != 100) {
                        if (options != 201) {
                            if (options != 202) {
                                switch (options) {
                                    case 32:
                                    case 33:
                                    case 34:
                                        break;
                                    default:
                                        shape2 = new AutoShape(escherContainerRecord, shape);
                                        break;
                                }
                            } else {
                                shape2 = new TextBox(escherContainerRecord, shape);
                            }
                            shape2.setShapeId(escherSpRecord.getShapeId());
                            return shape2;
                        }
                    }
                }
                InteractiveInfo interactiveInfo = (InteractiveInfo) getClientDataRecord(escherContainerRecord, RecordTypes.InteractiveInfo.typeID);
                OEShapeAtom oEShapeAtom = (OEShapeAtom) getClientDataRecord(escherContainerRecord, RecordTypes.OEShapeAtom.typeID);
                if ((interactiveInfo == null || interactiveInfo.getInteractiveInfoAtom() == null) && oEShapeAtom != null) {
                    shape2 = new OLEShape(escherContainerRecord, shape);
                }
                if (shape2 == null) {
                    shape2 = new Picture(escherContainerRecord, shape);
                }
                shape2.setShapeId(escherSpRecord.getShapeId());
                return shape2;
            }
            shape2 = new Line(escherContainerRecord, shape);
            shape2.setShapeId(escherSpRecord.getShapeId());
            return shape2;
        }
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(escherContainerRecord, -4085);
        if (escherOptRecord != null && s.H(escherOptRecord, 325) != null) {
            shape2 = new Freeform(escherContainerRecord, shape);
        }
        shape2.setShapeId(escherSpRecord.getShapeId());
        return shape2;
    }

    public static Record getClientDataRecord(EscherContainerRecord escherContainerRecord, int i10) {
        Iterator<EscherRecord> childIterator = escherContainerRecord.getChildIterator();
        while (childIterator.hasNext()) {
            EscherRecord next = childIterator.next();
            if (next.getRecordId() == -4079) {
                byte[] serialize = next.serialize();
                Record[] findChildRecords = Record.findChildRecords(serialize, 8, serialize.length - 8);
                for (int i11 = 0; i11 < findChildRecords.length; i11++) {
                    if (findChildRecords[i11].getRecordType() == i10) {
                        return findChildRecords[i11];
                    }
                }
                continue;
            }
        }
        return null;
    }
}
