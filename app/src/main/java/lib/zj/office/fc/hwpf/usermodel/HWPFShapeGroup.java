package lib.zj.office.fc.hwpf.usermodel;

import a0.a;
import androidx.activity.s;
import java.util.ArrayList;
import java.util.Iterator;
import lib.zj.office.fc.ddf.EscherChildAnchorRecord;
import lib.zj.office.fc.ddf.EscherClientAnchorRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSpgrRecord;
import lib.zj.office.java.awt.Rectangle;

/* loaded from: classes3.dex */
public class HWPFShapeGroup extends HWPFShape {
    public HWPFShapeGroup(EscherContainerRecord escherContainerRecord, HWPFShape hWPFShape) {
        super(escherContainerRecord, hWPFShape);
    }

    public Rectangle getAnchor(float f10, float f11) {
        EscherContainerRecord escherContainerRecord = (EscherContainerRecord) getSpContainer().getChild(0);
        if (escherContainerRecord == null) {
            return null;
        }
        EscherClientAnchorRecord escherClientAnchorRecord = (EscherClientAnchorRecord) s.F(escherContainerRecord, -4080);
        if (escherClientAnchorRecord == null) {
            EscherChildAnchorRecord escherChildAnchorRecord = (EscherChildAnchorRecord) s.F(escherContainerRecord, -4081);
            if (escherChildAnchorRecord == null) {
                return null;
            }
            Rectangle rectangle = new Rectangle();
            rectangle.f20688x = (int) a.a(escherChildAnchorRecord.getDx1(), f10, 96.0f, 914400.0f);
            rectangle.f20689y = (int) a.a(escherChildAnchorRecord.getDy1(), f11, 96.0f, 914400.0f);
            rectangle.width = (int) a.a(escherChildAnchorRecord.getDx2() - escherChildAnchorRecord.getDx1(), f10, 96.0f, 914400.0f);
            rectangle.height = (int) a.a(escherChildAnchorRecord.getDy2() - escherChildAnchorRecord.getDy1(), f11, 96.0f, 914400.0f);
            return rectangle;
        }
        Rectangle rectangle2 = new Rectangle();
        rectangle2.f20688x = (int) a.a(escherClientAnchorRecord.getCol1(), f10, 96.0f, 914400.0f);
        rectangle2.f20689y = (int) a.a(escherClientAnchorRecord.getFlag(), f11, 96.0f, 914400.0f);
        rectangle2.width = (int) a.a(escherClientAnchorRecord.getDx1() - escherClientAnchorRecord.getCol1(), f10, 96.0f, 914400.0f);
        rectangle2.height = (int) a.a(escherClientAnchorRecord.getRow1() - escherClientAnchorRecord.getFlag(), f11, 96.0f, 914400.0f);
        return rectangle2;
    }

    public Rectangle getCoordinates(float f10, float f11) {
        EscherSpgrRecord escherSpgrRecord;
        EscherContainerRecord escherContainerRecord = (EscherContainerRecord) getSpContainer().getChild(0);
        if (escherContainerRecord != null && (escherSpgrRecord = (EscherSpgrRecord) s.F(escherContainerRecord, -4087)) != null) {
            Rectangle rectangle = new Rectangle();
            rectangle.f20688x = (int) a.a(escherSpgrRecord.getRectX1(), f10, 96.0f, 914400.0f);
            rectangle.f20689y = (int) a.a(escherSpgrRecord.getRectY1(), f11, 96.0f, 914400.0f);
            rectangle.width = (int) a.a(escherSpgrRecord.getRectX2() - escherSpgrRecord.getRectX1(), f10, 96.0f, 914400.0f);
            rectangle.height = (int) a.a(escherSpgrRecord.getRectY2() - escherSpgrRecord.getRectY1(), f11, 96.0f, 914400.0f);
            return rectangle;
        }
        return null;
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.HWPFShape
    public boolean getFlipHorizontal() {
        return s.Q(getSpContainer());
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.HWPFShape
    public boolean getFlipVertical() {
        return s.R(getSpContainer());
    }

    public int getGroupRotation() {
        EscherContainerRecord escherContainerRecord = (EscherContainerRecord) getSpContainer().getChild(0);
        if (escherContainerRecord == null) {
            return 0;
        }
        return (s.G(escherContainerRecord, (short) 4, 0) >> 16) % 360;
    }

    public float[] getShapeAnchorFit(Rectangle rectangle, float f10, float f11) {
        EscherSpgrRecord escherSpgrRecord;
        float[] fArr = {1.0f, 1.0f};
        EscherContainerRecord escherContainerRecord = (EscherContainerRecord) getSpContainer().getChild(0);
        if (escherContainerRecord != null && (escherSpgrRecord = (EscherSpgrRecord) s.F(escherContainerRecord, -4087)) != null) {
            float rectX2 = escherSpgrRecord.getRectX2() - escherSpgrRecord.getRectX1();
            float rectY2 = escherSpgrRecord.getRectY2() - escherSpgrRecord.getRectY1();
            if (rectX2 != 0.0f && rectY2 != 0.0f) {
                fArr[0] = (((rectangle.width * 914400) / 96.0f) / f10) / rectX2;
                fArr[1] = (((rectangle.height * 914400) / 96.0f) / f11) / rectY2;
            }
        }
        return fArr;
    }

    public String getShapeName() {
        return s.X(this.escherContainer);
    }

    public HWPFShape[] getShapes() {
        Iterator<EscherRecord> childIterator = getSpContainer().getChildIterator();
        if (childIterator.hasNext()) {
            childIterator.next();
        }
        ArrayList arrayList = new ArrayList();
        while (childIterator.hasNext()) {
            EscherRecord next = childIterator.next();
            if (next instanceof EscherContainerRecord) {
                arrayList.add(HWPFShapeFactory.createShape((EscherContainerRecord) next, this));
            }
        }
        return (HWPFShape[]) arrayList.toArray(new HWPFShape[arrayList.size()]);
    }
}
