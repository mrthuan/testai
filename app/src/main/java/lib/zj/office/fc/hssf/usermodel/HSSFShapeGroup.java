package lib.zj.office.fc.hssf.usermodel;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.util.IEEEDouble;

/* loaded from: classes3.dex */
public class HSSFShapeGroup extends HSSFShape implements HSSFShapeContainer {
    private List<HSSFShape> shapes;

    /* renamed from: x1  reason: collision with root package name */
    private int f20669x1;

    /* renamed from: x2  reason: collision with root package name */
    private int f20670x2;

    /* renamed from: y1  reason: collision with root package name */
    private int f20671y1;

    /* renamed from: y2  reason: collision with root package name */
    private int f20672y2;

    public HSSFShapeGroup(EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape, HSSFAnchor hSSFAnchor) {
        super(escherContainerRecord, hSSFShape, hSSFAnchor);
        this.f20669x1 = 0;
        this.f20671y1 = 0;
        this.f20670x2 = IEEEDouble.EXPONENT_BIAS;
        this.f20672y2 = FunctionEval.FunctionID.EXTERNAL_FUNC;
        this.shapes = new ArrayList();
    }

    public void addChildShape(HSSFShape hSSFShape) {
        this.shapes.add(hSSFShape);
    }

    @Override // lib.zj.office.fc.hssf.usermodel.HSSFShape
    public int countOfAllChildren() {
        int size = this.shapes.size();
        for (HSSFShape hSSFShape : this.shapes) {
            size += hSSFShape.countOfAllChildren();
        }
        return size;
    }

    public HSSFShapeGroup createGroup(HSSFChildAnchor hSSFChildAnchor) {
        HSSFShapeGroup hSSFShapeGroup = new HSSFShapeGroup(null, this, hSSFChildAnchor);
        hSSFShapeGroup.setAnchor(hSSFChildAnchor);
        this.shapes.add(hSSFShapeGroup);
        return hSSFShapeGroup;
    }

    public HSSFPicture createPicture(HSSFChildAnchor hSSFChildAnchor, int i10) {
        HSSFPicture hSSFPicture = new HSSFPicture(null, this, hSSFChildAnchor);
        hSSFPicture.setAnchor(hSSFChildAnchor);
        hSSFPicture.setPictureIndex(i10);
        this.shapes.add(hSSFPicture);
        return hSSFPicture;
    }

    public HSSFPolygon createPolygon(HSSFChildAnchor hSSFChildAnchor) {
        HSSFPolygon hSSFPolygon = new HSSFPolygon(null, this, hSSFChildAnchor);
        hSSFPolygon.setAnchor(hSSFChildAnchor);
        this.shapes.add(hSSFPolygon);
        return hSSFPolygon;
    }

    public HSSFSimpleShape createShape(HSSFChildAnchor hSSFChildAnchor) {
        HSSFSimpleShape hSSFSimpleShape = new HSSFSimpleShape(null, this, hSSFChildAnchor);
        hSSFSimpleShape.setAnchor(hSSFChildAnchor);
        this.shapes.add(hSSFSimpleShape);
        return hSSFSimpleShape;
    }

    public HSSFTextbox createTextbox(HSSFChildAnchor hSSFChildAnchor) {
        HSSFTextbox hSSFTextbox = new HSSFTextbox(null, this, hSSFChildAnchor);
        hSSFTextbox.setAnchor(hSSFChildAnchor);
        this.shapes.add(hSSFTextbox);
        return hSSFTextbox;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.HSSFShapeContainer
    public List<HSSFShape> getChildren() {
        return this.shapes;
    }

    public int getX1() {
        return this.f20669x1;
    }

    public int getX2() {
        return this.f20670x2;
    }

    public int getY1() {
        return this.f20671y1;
    }

    public int getY2() {
        return this.f20672y2;
    }

    public void setCoordinates(int i10, int i11, int i12, int i13) {
        this.f20669x1 = i10;
        this.f20671y1 = i11;
        this.f20670x2 = i12;
        this.f20672y2 = i13;
    }
}
