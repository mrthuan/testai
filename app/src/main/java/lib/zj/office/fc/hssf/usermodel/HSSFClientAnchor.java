package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.util.IEEEDouble;

/* loaded from: classes3.dex */
public final class HSSFClientAnchor extends HSSFAnchor implements IClientAnchor {
    int anchorType;
    short col1;
    short col2;
    int row1;
    int row2;

    public HSSFClientAnchor() {
    }

    private void checkRange(int i10, int i11, int i12, String str) {
        if (i10 >= i11 && i10 <= i12) {
            return;
        }
        throw new IllegalArgumentException(str + " must be between " + i11 + " and " + i12);
    }

    private float getRowHeightInPoints(HSSFSheet hSSFSheet, int i10) {
        HSSFRow row = hSSFSheet.getRow(i10);
        if (row == null) {
            return hSSFSheet.getDefaultRowHeightInPoints();
        }
        return row.getHeightInPoints();
    }

    public float getAnchorHeightInPoints(HSSFSheet hSSFSheet) {
        int dy1 = getDy1();
        int dy2 = getDy2();
        int min = Math.min(getRow1(), getRow2());
        int max = Math.max(getRow1(), getRow2());
        if (min == max) {
            return ((dy2 - dy1) / 256.0f) * getRowHeightInPoints(hSSFSheet, max);
        }
        float rowHeightInPoints = ((256.0f - dy1) / 256.0f) * getRowHeightInPoints(hSSFSheet, min);
        float f10 = 0.0f;
        while (true) {
            rowHeightInPoints += f10;
            min++;
            if (min < max) {
                f10 = getRowHeightInPoints(hSSFSheet, min);
            } else {
                return rowHeightInPoints + ((dy2 / 256.0f) * getRowHeightInPoints(hSSFSheet, max));
            }
        }
    }

    @Override // lib.zj.office.fc.hssf.usermodel.IClientAnchor
    public int getAnchorType() {
        return this.anchorType;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.IClientAnchor
    public short getCol1() {
        return this.col1;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.IClientAnchor
    public short getCol2() {
        return this.col2;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.IClientAnchor
    public int getRow1() {
        return this.row1;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.IClientAnchor
    public int getRow2() {
        return this.row2;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.HSSFAnchor
    public boolean isHorizontallyFlipped() {
        short s4 = this.col1;
        short s10 = this.col2;
        if (s4 == s10) {
            if (this.dx1 > this.dx2) {
                return true;
            }
            return false;
        } else if (s4 > s10) {
            return true;
        } else {
            return false;
        }
    }

    @Override // lib.zj.office.fc.hssf.usermodel.HSSFAnchor
    public boolean isVerticallyFlipped() {
        int i10 = this.row1;
        int i11 = this.row2;
        if (i10 == i11) {
            if (this.dy1 > this.dy2) {
                return true;
            }
            return false;
        } else if (i10 > i11) {
            return true;
        } else {
            return false;
        }
    }

    public void setAnchor(short s4, int i10, int i11, int i12, short s10, int i13, int i14, int i15) {
        checkRange(this.dx1, 0, IEEEDouble.EXPONENT_BIAS, "dx1");
        checkRange(this.dx2, 0, IEEEDouble.EXPONENT_BIAS, "dx2");
        checkRange(this.dy1, 0, FunctionEval.FunctionID.EXTERNAL_FUNC, "dy1");
        checkRange(this.dy2, 0, FunctionEval.FunctionID.EXTERNAL_FUNC, "dy2");
        checkRange(s4, 0, FunctionEval.FunctionID.EXTERNAL_FUNC, "col1");
        checkRange(s10, 0, FunctionEval.FunctionID.EXTERNAL_FUNC, "col2");
        checkRange(i10, 0, 65280, "row1");
        checkRange(i13, 0, 65280, "row2");
        this.col1 = s4;
        this.row1 = i10;
        this.dx1 = i11;
        this.dy1 = i12;
        this.col2 = s10;
        this.row2 = i13;
        this.dx2 = i14;
        this.dy2 = i15;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.IClientAnchor
    public void setAnchorType(int i10) {
        this.anchorType = i10;
    }

    public void setCol1(short s4) {
        checkRange(s4, 0, FunctionEval.FunctionID.EXTERNAL_FUNC, "col1");
        this.col1 = s4;
    }

    public void setCol2(short s4) {
        checkRange(s4, 0, FunctionEval.FunctionID.EXTERNAL_FUNC, "col2");
        this.col2 = s4;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.IClientAnchor
    public void setRow1(int i10) {
        checkRange(i10, 0, 65536, "row1");
        this.row1 = i10;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.IClientAnchor
    public void setRow2(int i10) {
        checkRange(i10, 0, 65536, "row2");
        this.row2 = i10;
    }

    public HSSFClientAnchor(int i10, int i11, int i12, int i13, short s4, int i14, short s10, int i15) {
        super(i10, i11, i12, i13);
        checkRange(i10, 0, IEEEDouble.EXPONENT_BIAS, "dx1");
        checkRange(i12, 0, IEEEDouble.EXPONENT_BIAS, "dx2");
        checkRange(i11, 0, FunctionEval.FunctionID.EXTERNAL_FUNC, "dy1");
        checkRange(i13, 0, FunctionEval.FunctionID.EXTERNAL_FUNC, "dy2");
        checkRange(s4, 0, FunctionEval.FunctionID.EXTERNAL_FUNC, "col1");
        checkRange(s10, 0, FunctionEval.FunctionID.EXTERNAL_FUNC, "col2");
        checkRange(i14, 0, 65280, "row1");
        checkRange(i15, 0, 65280, "row2");
        this.col1 = s4;
        this.row1 = i14;
        this.col2 = s10;
        this.row2 = i15;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.IClientAnchor
    public void setCol1(int i10) {
        setCol1((short) i10);
    }

    @Override // lib.zj.office.fc.hssf.usermodel.IClientAnchor
    public void setCol2(int i10) {
        setCol2((short) i10);
    }
}
