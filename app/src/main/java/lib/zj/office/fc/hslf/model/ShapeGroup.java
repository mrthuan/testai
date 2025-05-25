package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import java.util.ArrayList;
import java.util.Iterator;
import lib.zj.office.fc.ddf.EscherChildAnchorRecord;
import lib.zj.office.fc.ddf.EscherClientAnchorRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.ddf.EscherSpgrRecord;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public class ShapeGroup extends Shape {
    public ShapeGroup() {
        this(null, null);
        this._escherContainer = createSpContainer(false);
    }

    public void addShape(Shape shape) {
        this._escherContainer.addChildRecord(shape.getSpContainer());
        Sheet sheet = getSheet();
        shape.setSheet(sheet);
        shape.setShapeId(sheet.allocateShapeId());
        shape.afterInsert(sheet);
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public EscherContainerRecord createSpContainer(boolean z10) {
        EscherContainerRecord escherContainerRecord = new EscherContainerRecord();
        escherContainerRecord.setRecordId(EscherContainerRecord.SPGR_CONTAINER);
        escherContainerRecord.setOptions((short) 15);
        EscherContainerRecord escherContainerRecord2 = new EscherContainerRecord();
        escherContainerRecord2.setRecordId(EscherContainerRecord.SP_CONTAINER);
        escherContainerRecord2.setOptions((short) 15);
        EscherSpgrRecord escherSpgrRecord = new EscherSpgrRecord();
        escherSpgrRecord.setOptions((short) 1);
        escherContainerRecord2.addChildRecord(escherSpgrRecord);
        EscherSpRecord escherSpRecord = new EscherSpRecord();
        escherSpRecord.setOptions((short) 2);
        escherSpRecord.setFlags(513);
        escherContainerRecord2.addChildRecord(escherSpRecord);
        escherContainerRecord2.addChildRecord(new EscherClientAnchorRecord());
        escherContainerRecord.addChildRecord(escherContainerRecord2);
        return escherContainerRecord;
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public void dispose() {
        super.dispose();
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public Rectangle2D getAnchor2D() {
        EscherContainerRecord escherContainerRecord = (EscherContainerRecord) this._escherContainer.getChild(0);
        EscherClientAnchorRecord escherClientAnchorRecord = (EscherClientAnchorRecord) s.F(escherContainerRecord, -4080);
        Rectangle2D.Float r22 = new Rectangle2D.Float();
        if (escherClientAnchorRecord == null) {
            EscherChildAnchorRecord escherChildAnchorRecord = (EscherChildAnchorRecord) s.F(escherContainerRecord, -4081);
            return new Rectangle2D.Float((escherChildAnchorRecord.getDx1() * 72.0f) / 576.0f, (escherChildAnchorRecord.getDy1() * 72.0f) / 576.0f, ((escherChildAnchorRecord.getDx2() - escherChildAnchorRecord.getDx1()) * 72.0f) / 576.0f, ((escherChildAnchorRecord.getDy2() - escherChildAnchorRecord.getDy1()) * 72.0f) / 576.0f);
        }
        r22.f20726x = (escherClientAnchorRecord.getCol1() * 72.0f) / 576.0f;
        r22.f20727y = (escherClientAnchorRecord.getFlag() * 72.0f) / 576.0f;
        r22.width = ((escherClientAnchorRecord.getDx1() - escherClientAnchorRecord.getCol1()) * 72.0f) / 576.0f;
        r22.height = ((escherClientAnchorRecord.getRow1() - escherClientAnchorRecord.getFlag()) * 72.0f) / 576.0f;
        return r22;
    }

    public Rectangle2D getClientAnchor2D(Shape shape) {
        Rectangle2D anchor2D = shape.getAnchor2D();
        if (shape.getParent() != null) {
            Rectangle2D clientAnchor2D = ((ShapeGroup) shape.getParent()).getClientAnchor2D(shape.getParent());
            Rectangle2D coordinates = ((ShapeGroup) shape.getParent()).getCoordinates();
            double width = coordinates.getWidth() / clientAnchor2D.getWidth();
            double height = coordinates.getHeight() / clientAnchor2D.getHeight();
            return new Rectangle2D.Double(((anchor2D.getX() - coordinates.getX()) / width) + clientAnchor2D.getX(), ((anchor2D.getY() - coordinates.getY()) / height) + clientAnchor2D.getY(), anchor2D.getWidth() / width, anchor2D.getHeight() / height);
        }
        return anchor2D;
    }

    public Rectangle2D getCoordinates() {
        EscherSpgrRecord escherSpgrRecord = (EscherSpgrRecord) s.F((EscherContainerRecord) this._escherContainer.getChild(0), -4087);
        Rectangle2D.Float r12 = new Rectangle2D.Float();
        r12.f20726x = (escherSpgrRecord.getRectX1() * 72.0f) / 576.0f;
        r12.f20727y = (escherSpgrRecord.getRectY1() * 72.0f) / 576.0f;
        r12.width = ((escherSpgrRecord.getRectX2() - escherSpgrRecord.getRectX1()) * 72.0f) / 576.0f;
        r12.height = ((escherSpgrRecord.getRectY2() - escherSpgrRecord.getRectY1()) * 72.0f) / 576.0f;
        return r12;
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public boolean getFlipHorizontal() {
        return s.Q(getSpContainer());
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public boolean getFlipVertical() {
        return s.R(getSpContainer());
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public Hyperlink getHyperlink() {
        return null;
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public int getRotation() {
        EscherContainerRecord escherContainerRecord = (EscherContainerRecord) getSpContainer().getChild(0);
        if (escherContainerRecord == null) {
            return 0;
        }
        return (s.G(escherContainerRecord, (short) 4, 0) >> 16) % 360;
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public int getShapeId() {
        Iterator<EscherRecord> childIterator = this._escherContainer.getChildIterator();
        if (childIterator.hasNext()) {
            EscherRecord next = childIterator.next();
            if (next instanceof EscherContainerRecord) {
                return ((EscherSpRecord) ((EscherContainerRecord) next).getChildById(EscherSpRecord.RECORD_ID)).getShapeId();
            }
        }
        return 0;
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public int getShapeType() {
        return ((EscherSpRecord) ((EscherContainerRecord) this._escherContainer.getChild(0)).getChildById(EscherSpRecord.RECORD_ID)).getOptions() >> 4;
    }

    public Shape[] getShapes() {
        Iterator<EscherRecord> childIterator = this._escherContainer.getChildIterator();
        if (childIterator.hasNext()) {
            childIterator.next();
        }
        ArrayList arrayList = new ArrayList();
        while (childIterator.hasNext()) {
            EscherRecord next = childIterator.next();
            if (next instanceof EscherContainerRecord) {
                Shape createShape = ShapeFactory.createShape((EscherContainerRecord) next, this);
                createShape.setSheet(getSheet());
                arrayList.add(createShape);
            }
        }
        return (Shape[]) arrayList.toArray(new Shape[arrayList.size()]);
    }

    public void moveTo(int i10, int i11) {
        Rectangle anchor = getAnchor();
        int i12 = i10 - anchor.f20688x;
        int i13 = i11 - anchor.f20689y;
        anchor.translate(i12, i13);
        setAnchor(anchor);
        Shape[] shapes = getShapes();
        for (int i14 = 0; i14 < shapes.length; i14++) {
            Rectangle anchor2 = shapes[i14].getAnchor();
            anchor2.translate(i12, i13);
            shapes[i14].setAnchor(anchor2);
        }
    }

    public void setAnchor(Rectangle rectangle) {
        EscherContainerRecord escherContainerRecord = (EscherContainerRecord) this._escherContainer.getChild(0);
        EscherClientAnchorRecord escherClientAnchorRecord = (EscherClientAnchorRecord) s.F(escherContainerRecord, -4080);
        byte[] bArr = new byte[16];
        LittleEndian.putUShort(bArr, 0, 0);
        LittleEndian.putUShort(bArr, 2, 0);
        LittleEndian.putInt(bArr, 4, 8);
        escherClientAnchorRecord.fillFields(bArr, 0, null);
        escherClientAnchorRecord.setFlag((short) ((rectangle.f20689y * 576) / 72.0f));
        escherClientAnchorRecord.setCol1((short) ((rectangle.f20688x * 576) / 72.0f));
        escherClientAnchorRecord.setDx1((short) (((rectangle.width + rectangle.f20688x) * 576) / 72.0f));
        escherClientAnchorRecord.setRow1((short) (((rectangle.height + rectangle.f20689y) * 576) / 72.0f));
        EscherSpgrRecord escherSpgrRecord = (EscherSpgrRecord) s.F(escherContainerRecord, -4087);
        escherSpgrRecord.setRectX1((int) ((rectangle.f20688x * 576) / 72.0f));
        escherSpgrRecord.setRectY1((int) ((rectangle.f20689y * 576) / 72.0f));
        escherSpgrRecord.setRectX2((int) (((rectangle.f20688x + rectangle.width) * 576) / 72.0f));
        escherSpgrRecord.setRectY2((int) (((rectangle.f20689y + rectangle.height) * 576) / 72.0f));
    }

    public void setCoordinates(Rectangle2D rectangle2D) {
        EscherSpgrRecord escherSpgrRecord = (EscherSpgrRecord) s.F((EscherContainerRecord) this._escherContainer.getChild(0), -4087);
        int round = (int) Math.round((rectangle2D.getY() * 576.0d) / 72.0d);
        double x4 = rectangle2D.getX();
        double y10 = rectangle2D.getY();
        escherSpgrRecord.setRectX1((int) Math.round((rectangle2D.getX() * 576.0d) / 72.0d));
        escherSpgrRecord.setRectY1(round);
        escherSpgrRecord.setRectX2((int) Math.round(((rectangle2D.getWidth() + x4) * 576.0d) / 72.0d));
        escherSpgrRecord.setRectY2((int) Math.round(((rectangle2D.getHeight() + y10) * 576.0d) / 72.0d));
    }

    public ShapeGroup(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }
}
