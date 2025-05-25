package lib.zj.office.fc.hssf.usermodel;

import di.c;
import di.e;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.ddf.EscherBSERecord;
import lib.zj.office.fc.ddf.EscherComplexProperty;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperty;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.record.EscherAggregate;
import lib.zj.office.fc.ss.usermodel.Chart;
import lib.zj.office.fc.ss.usermodel.Drawing;
import lib.zj.office.fc.ss.util.IEEEDouble;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class HSSFPatriarch implements HSSFShapeContainer, Drawing {
    private EscherAggregate _boundAggregate;
    protected c _sheet;
    private List<HSSFShape> _shapes = new ArrayList();
    private int _x1 = 0;
    private int _y1 = 0;
    private int _x2 = IEEEDouble.EXPONENT_BIAS;
    private int _y2 = FunctionEval.FunctionID.EXTERNAL_FUNC;

    public HSSFPatriarch(c cVar, EscherAggregate escherAggregate) {
        this._sheet = cVar;
        this._boundAggregate = escherAggregate;
    }

    public EscherAggregate _getBoundAggregate() {
        return this._boundAggregate;
    }

    @Internal
    public void addShape(HSSFShape hSSFShape) {
        hSSFShape._patriarch = this;
        this._shapes.add(hSSFShape);
    }

    public boolean containsChart() {
        EscherOptRecord escherOptRecord = (EscherOptRecord) this._boundAggregate.findFirstWithId(EscherOptRecord.RECORD_ID);
        if (escherOptRecord == null) {
            return false;
        }
        for (EscherProperty escherProperty : escherOptRecord.getEscherProperties()) {
            if (escherProperty.getPropertyNumber() == 896 && escherProperty.isComplex() && StringUtil.getFromUnicodeLE(((EscherComplexProperty) escherProperty).getComplexData()).equals("Chart 1\u0000")) {
                return true;
            }
        }
        return false;
    }

    public int countOfAllChildren() {
        int size = this._shapes.size();
        for (HSSFShape hSSFShape : this._shapes) {
            size += hSSFShape.countOfAllChildren();
        }
        return size;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Drawing
    public Chart createChart(IClientAnchor iClientAnchor) {
        throw new RuntimeException("NotImplemented");
    }

    public HSSFSimpleShape createComboBox(HSSFAnchor hSSFAnchor) {
        HSSFSimpleShape hSSFSimpleShape = new HSSFSimpleShape(null, null, hSSFAnchor);
        hSSFSimpleShape.setShapeType(20);
        hSSFSimpleShape.setAnchor(hSSFAnchor);
        addShape(hSSFSimpleShape);
        return hSSFSimpleShape;
    }

    public HSSFComment createComment(HSSFAnchor hSSFAnchor) {
        HSSFComment hSSFComment = new HSSFComment(null, null, hSSFAnchor);
        hSSFComment.setAnchor(hSSFAnchor);
        addShape(hSSFComment);
        return hSSFComment;
    }

    public HSSFShapeGroup createGroup(HSSFClientAnchor hSSFClientAnchor) {
        HSSFShapeGroup hSSFShapeGroup = new HSSFShapeGroup(null, null, hSSFClientAnchor);
        hSSFShapeGroup.setAnchor(hSSFClientAnchor);
        addShape(hSSFShapeGroup);
        return hSSFShapeGroup;
    }

    public HSSFPolygon createPolygon(HSSFClientAnchor hSSFClientAnchor) {
        HSSFPolygon hSSFPolygon = new HSSFPolygon(null, null, hSSFClientAnchor);
        hSSFPolygon.setAnchor(hSSFClientAnchor);
        addShape(hSSFPolygon);
        return hSSFPolygon;
    }

    public HSSFSimpleShape createSimpleShape(HSSFClientAnchor hSSFClientAnchor) {
        HSSFSimpleShape hSSFSimpleShape = new HSSFSimpleShape(null, null, hSSFClientAnchor);
        hSSFSimpleShape.setAnchor(hSSFClientAnchor);
        addShape(hSSFSimpleShape);
        return hSSFSimpleShape;
    }

    public HSSFTextbox createTextbox(HSSFClientAnchor hSSFClientAnchor) {
        HSSFTextbox hSSFTextbox = new HSSFTextbox(null, null, hSSFClientAnchor);
        hSSFTextbox.setAnchor(hSSFClientAnchor);
        addShape(hSSFTextbox);
        return hSSFTextbox;
    }

    public void dispose() {
        this._shapes.clear();
    }

    @Override // lib.zj.office.fc.hssf.usermodel.HSSFShapeContainer
    public List<HSSFShape> getChildren() {
        return this._shapes;
    }

    public int getX1() {
        return this._x1;
    }

    public int getX2() {
        return this._x2;
    }

    public int getY1() {
        return this._y1;
    }

    public int getY2() {
        return this._y2;
    }

    public void setCoordinates(int i10, int i11, int i12, int i13) {
        this._x1 = i10;
        this._y1 = i11;
        this._x2 = i12;
        this._y2 = i13;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Drawing
    public HSSFClientAnchor createAnchor(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return new HSSFClientAnchor(i10, i11, i12, i13, (short) i14, i15, (short) i16, i17);
    }

    @Override // lib.zj.office.fc.ss.usermodel.Drawing
    public HSSFComment createCellComment(IClientAnchor iClientAnchor) {
        return createComment((HSSFAnchor) iClientAnchor);
    }

    public HSSFPicture createPicture(HSSFClientAnchor hSSFClientAnchor, int i10) {
        HSSFPicture hSSFPicture = new HSSFPicture(null, null, hSSFClientAnchor);
        hSSFPicture.setPictureIndex(i10);
        hSSFPicture.setAnchor(hSSFClientAnchor);
        addShape(hSSFPicture);
        EscherBSERecord bSERecord = ((e) this._sheet.f16601a).f16209m.getBSERecord(i10);
        bSERecord.setRef(bSERecord.getRef() + 1);
        return hSSFPicture;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Drawing
    public HSSFPicture createPicture(IClientAnchor iClientAnchor, int i10) {
        return createPicture((HSSFClientAnchor) iClientAnchor, i10);
    }
}
