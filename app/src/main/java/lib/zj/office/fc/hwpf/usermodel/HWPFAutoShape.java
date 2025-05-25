package lib.zj.office.fc.hwpf.usermodel;

import androidx.activity.s;
import lib.zj.office.fc.ddf.EscherContainerRecord;

/* loaded from: classes3.dex */
public class HWPFAutoShape extends HWPFShape {
    public HWPFAutoShape(EscherContainerRecord escherContainerRecord, HWPFShape hWPFShape) {
        super(escherContainerRecord, hWPFShape);
    }

    public String getShapeName() {
        return s.X(this.escherContainer);
    }
}
