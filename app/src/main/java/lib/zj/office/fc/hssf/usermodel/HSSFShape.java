package lib.zj.office.fc.hssf.usermodel;

import androidx.activity.s;
import di.e;
import gh.b;
import lh.d;
import lib.zj.office.fc.ddf.EscherBSERecord;
import lib.zj.office.fc.ddf.EscherBlipRecord;
import lib.zj.office.fc.ddf.EscherChildAnchorRecord;
import lib.zj.office.fc.ddf.EscherClientAnchorRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.java.awt.Color;

/* loaded from: classes3.dex */
public abstract class HSSFShape {
    private int _fillType;
    HSSFPatriarch _patriarch;
    private HSSFAnchor anchor;
    private int angle;
    private byte[] bgPictureData;
    private d endArrow;
    protected EscherContainerRecord escherContainer;
    private boolean flipH;
    private boolean flipV;
    final HSSFShape parent;
    private d startArrow;
    private int shapeType = 0;
    private boolean _noBorder = false;
    private int _lineStyleColor = 134217792;
    private int _lineWidth = 9525;
    private int _lineStyle = 0;
    private boolean _noFill = false;
    private int _fillColor = 134217737;

    public HSSFShape(EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape, HSSFAnchor hSSFAnchor) {
        this.escherContainer = escherContainerRecord;
        this.parent = hSSFShape;
        this.anchor = hSSFAnchor;
    }

    public static HSSFChildAnchor toChildAnchor(EscherChildAnchorRecord escherChildAnchorRecord) {
        return new HSSFChildAnchor(escherChildAnchorRecord.getDx1(), escherChildAnchorRecord.getDy1(), escherChildAnchorRecord.getDx2(), escherChildAnchorRecord.getDy2());
    }

    public static HSSFClientAnchor toClientAnchor(EscherClientAnchorRecord escherClientAnchorRecord) {
        HSSFClientAnchor hSSFClientAnchor = new HSSFClientAnchor();
        hSSFClientAnchor.setAnchorType(escherClientAnchorRecord.getFlag());
        hSSFClientAnchor.setCol1(escherClientAnchorRecord.getCol1());
        hSSFClientAnchor.setCol2(escherClientAnchorRecord.getCol2());
        hSSFClientAnchor.setDx1(escherClientAnchorRecord.getDx1());
        hSSFClientAnchor.setDx2(escherClientAnchorRecord.getDx2());
        hSSFClientAnchor.setDy1(escherClientAnchorRecord.getDy1());
        hSSFClientAnchor.setDy2(escherClientAnchorRecord.getDy2());
        hSSFClientAnchor.setRow1(escherClientAnchorRecord.getRow1());
        hSSFClientAnchor.setRow2(escherClientAnchorRecord.getRow2());
        return hSSFClientAnchor;
    }

    public boolean checkPatriarch() {
        HSSFPatriarch hSSFPatriarch;
        HSSFShape hSSFShape = this.parent;
        while (true) {
            hSSFPatriarch = this._patriarch;
            if (hSSFPatriarch != null || hSSFShape == null) {
                break;
            }
            this._patriarch = hSSFShape._patriarch;
            hSSFShape = hSSFShape.getParent();
        }
        if (hSSFPatriarch != null) {
            return true;
        }
        return false;
    }

    public int countOfAllChildren() {
        return 1;
    }

    public HSSFAnchor getAnchor() {
        return this.anchor;
    }

    public byte[] getBGPictureData() {
        return this.bgPictureData;
    }

    public int getEndArrowLength() {
        return this.endArrow.f20614b;
    }

    public int getEndArrowType() {
        return this.endArrow.c;
    }

    public int getEndArrowWidth() {
        return this.endArrow.f20613a;
    }

    public int getFillColor() {
        return this._fillColor;
    }

    public int getFillType() {
        return this._fillType;
    }

    public boolean getFlipH() {
        return this.flipH;
    }

    public boolean getFlipV() {
        return this.flipV;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r11 != 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public eh.b getGradientTileBackground(di.e r18, lib.zj.office.system.f r19) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.usermodel.HSSFShape.getGradientTileBackground(di.e, lib.zj.office.system.f):eh.b");
    }

    public b getLine() {
        boolean z10;
        eh.b bVar = new eh.b();
        bVar.f16571d = this._lineStyleColor;
        b bVar2 = new b();
        bVar2.f17807b = bVar;
        bVar2.f17806a = this._lineWidth;
        if (this._lineStyle > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar2.c = z10;
        return bVar2;
    }

    public int getLineStyle() {
        return this._lineStyle;
    }

    public int getLineStyleColor() {
        return this._lineStyleColor;
    }

    public int getLineWidth() {
        return this._lineWidth;
    }

    public HSSFShape getParent() {
        return this.parent;
    }

    public int getRotation() {
        return this.angle;
    }

    public int getShapeType() {
        return this.shapeType;
    }

    public int getStartArrowLength() {
        return this.startArrow.f20614b;
    }

    public int getStartArrowType() {
        return this.startArrow.c;
    }

    public int getStartArrowWidth() {
        return this.startArrow.f20613a;
    }

    public boolean isGradientTile() {
        int K = s.K(this.escherContainer);
        if (K != 7 && K != 4 && K != 5 && K != 6 && K != 2) {
            return false;
        }
        return true;
    }

    public boolean isNoBorder() {
        return this._noBorder;
    }

    public boolean isNoFill() {
        return this._noFill;
    }

    public void processLineWidth() {
        this._lineWidth = s.T(this.escherContainer);
    }

    public void processSimpleBackground(EscherContainerRecord escherContainerRecord, e eVar) {
        EscherBSERecord bSERecord;
        EscherBlipRecord blipRecord;
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(escherContainerRecord, -4085);
        int K = s.K(escherContainerRecord);
        if (K == 3) {
            EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H(escherOptRecord, 390);
            if (escherSimpleProperty != null && (bSERecord = eVar.f16209m.getBSERecord(escherSimpleProperty.getPropertyValue())) != null && (blipRecord = bSERecord.getBlipRecord()) != null) {
                setFillType(3);
                setBGPictureData(blipRecord.getPicturedata());
                return;
            }
        } else if (K == 1) {
            Color L = s.L(escherContainerRecord, eVar, 1);
            if (L != null) {
                setFillType(0);
                setFillColor(L.getRGB(), FunctionEval.FunctionID.EXTERNAL_FUNC);
                return;
            }
        } else if (isGradientTile()) {
            setFillType(K);
            return;
        } else {
            Color O = s.O(escherContainerRecord, eVar, 1);
            if (O != null) {
                setFillType(0);
                setFillColor(O.getRGB(), FunctionEval.FunctionID.EXTERNAL_FUNC);
                return;
            }
        }
        setNoFill(true);
    }

    public void setAnchor(HSSFAnchor hSSFAnchor) {
        if (this.parent == null) {
            if (hSSFAnchor instanceof HSSFChildAnchor) {
                throw new IllegalArgumentException("Must use client anchors for shapes directly attached to sheet.");
            }
        } else if (hSSFAnchor instanceof HSSFClientAnchor) {
            throw new IllegalArgumentException("Must use child anchors for shapes attached to groups.");
        }
        this.anchor = hSSFAnchor;
    }

    public void setBGPictureData(byte[] bArr) {
        this.bgPictureData = bArr;
    }

    public void setEndArrow(byte b10, int i10, int i11) {
        this.endArrow = new d(b10, i10, i11);
    }

    public void setFillColor(int i10, int i11) {
        this._fillColor = (i10 & 16777215) | (i11 << 24);
    }

    public void setFillType(int i10) {
        this._fillType = i10;
    }

    public void setFilpH(boolean z10) {
        this.flipH = z10;
    }

    public void setFlipV(boolean z10) {
        this.flipV = z10;
    }

    public void setLineStyle(int i10) {
        this._lineStyle = i10;
    }

    public void setLineStyleColor(int i10) {
        this._lineStyleColor = (i10 & 16777215) | (-16777216);
    }

    public void setLineWidth(int i10) {
        this._lineWidth = i10;
    }

    public void setNoBorder(boolean z10) {
        this._noBorder = z10;
    }

    public void setNoFill(boolean z10) {
        this._noFill = z10;
    }

    public void setRotation(int i10) {
        this.angle = i10;
    }

    public void setShapeType(int i10) {
        this.shapeType = i10;
    }

    public void setStartArrow(byte b10, int i10, int i11) {
        this.startArrow = new d(b10, i10, i11);
    }

    public void setFillColor(int i10, int i11, int i12, int i13) {
        this._fillColor = ((i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 16) | ((i13 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 24) | ((i11 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 8) | ((i12 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 0);
    }

    public void setLineStyleColor(int i10, int i11, int i12) {
        this._lineStyleColor = ((i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 16) | (-16777216) | ((i11 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 8) | ((i12 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 0);
    }
}
