package lib.zj.office.fc.hwpf.usermodel;

import androidx.activity.s;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherPropertyFactory;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;

/* loaded from: classes3.dex */
public final class HWPFShapeFactory {
    public static HWPFShape createShape(EscherContainerRecord escherContainerRecord, HWPFShape hWPFShape) {
        if (escherContainerRecord.getRecordId() == -4093) {
            return createShapeGroup(escherContainerRecord, hWPFShape);
        }
        return createSimpeShape(escherContainerRecord, hWPFShape);
    }

    public static HWPFShapeGroup createShapeGroup(EscherContainerRecord escherContainerRecord, HWPFShape hWPFShape) {
        HWPFShapeGroup hWPFShapeGroup;
        EscherRecord F = s.F((EscherContainerRecord) escherContainerRecord.getChild(0), -3806);
        if (F != null) {
            try {
                EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) new EscherPropertyFactory().createProperties(F.serialize(), 8, F.getInstance()).get(0);
                if (escherSimpleProperty.getPropertyNumber() == 927 && escherSimpleProperty.getPropertyValue() == 1) {
                    return null;
                }
                hWPFShapeGroup = new HWPFShapeGroup(escherContainerRecord, hWPFShape);
            } catch (Exception unused) {
                hWPFShapeGroup = new HWPFShapeGroup(escherContainerRecord, hWPFShape);
            }
        } else {
            hWPFShapeGroup = new HWPFShapeGroup(escherContainerRecord, hWPFShape);
        }
        return hWPFShapeGroup;
    }

    public static HWPFAutoShape createSimpeShape(EscherContainerRecord escherContainerRecord, HWPFShape hWPFShape) {
        if (((EscherSpRecord) escherContainerRecord.getChildById(EscherSpRecord.RECORD_ID)) != null) {
            return new HWPFAutoShape(escherContainerRecord, hWPFShape);
        }
        return null;
    }
}
