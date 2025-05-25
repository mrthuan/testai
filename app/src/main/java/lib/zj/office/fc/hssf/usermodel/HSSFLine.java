package lib.zj.office.fc.hssf.usermodel;

import androidx.activity.s;
import di.e;
import lib.zj.office.fc.ddf.EscherContainerRecord;

/* loaded from: classes3.dex */
public class HSSFLine extends HSSFSimpleShape {
    private Float[] adjusts;

    public HSSFLine(e eVar, EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape, HSSFAnchor hSSFAnchor, int i10) {
        super(escherContainerRecord, hSSFShape, hSSFAnchor);
        setShapeType(i10);
        processLineWidth();
        processLine(escherContainerRecord, eVar);
        processArrow(escherContainerRecord);
        setAdjustmentValue(escherContainerRecord);
        processRotationAndFlip(escherContainerRecord);
    }

    public Float[] getAdjustmentValue() {
        return this.adjusts;
    }

    public void setAdjustmentValue(EscherContainerRecord escherContainerRecord) {
        this.adjusts = s.z(escherContainerRecord);
    }
}
