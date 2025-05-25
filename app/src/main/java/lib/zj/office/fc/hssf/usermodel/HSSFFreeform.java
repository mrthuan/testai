package lib.zj.office.fc.hssf.usermodel;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.activity.s;
import di.e;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.java.awt.Rectangle;
import ug.a;

/* loaded from: classes3.dex */
public class HSSFFreeform extends HSSFAutoShape {
    public HSSFFreeform(e eVar, EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape, HSSFAnchor hSSFAnchor, int i10) {
        super(eVar, escherContainerRecord, hSSFShape, hSSFAnchor, i10);
        processLineWidth();
        processArrow(escherContainerRecord);
    }

    public a getEndArrowPath(Rectangle rectangle) {
        return s.C(this.escherContainer, rectangle);
    }

    public Path[] getFreeformPath(Rectangle rectangle, PointF pointF, byte b10, PointF pointF2, byte b11) {
        return s.P(this.escherContainer, rectangle, pointF, b10, pointF2, b11);
    }

    public a getStartArrowPath(Rectangle rectangle) {
        return s.Z(this.escherContainer, rectangle);
    }
}
