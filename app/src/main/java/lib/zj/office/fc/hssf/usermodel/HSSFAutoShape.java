package lib.zj.office.fc.hssf.usermodel;

import androidx.activity.s;
import di.e;
import lib.zj.office.fc.ddf.EscherContainerRecord;

/* loaded from: classes3.dex */
public class HSSFAutoShape extends HSSFTextbox {
    private Float[] adjusts;

    public HSSFAutoShape(e eVar, EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape, HSSFAnchor hSSFAnchor, int i10) {
        super(escherContainerRecord, hSSFShape, hSSFAnchor);
        setShapeType(i10);
        processLineWidth();
        processLine(escherContainerRecord, eVar);
        processSimpleBackground(escherContainerRecord, eVar);
        processRotationAndFlip(escherContainerRecord);
        String f02 = s.f0(escherContainerRecord);
        if (f02 != null && f02.length() > 0) {
            setString(new HSSFRichTextString(f02));
            setWordArt(true);
            setNoFill(true);
            setFontColor(getFillColor());
        }
    }

    public Float[] getAdjustmentValue() {
        return this.adjusts;
    }

    public void setAdjustmentValue(EscherContainerRecord escherContainerRecord) {
        this.adjusts = s.z(escherContainerRecord);
    }
}
