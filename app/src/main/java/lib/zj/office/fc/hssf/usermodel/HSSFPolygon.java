package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.ddf.EscherContainerRecord;

/* loaded from: classes3.dex */
public class HSSFPolygon extends HSSFShape {
    int drawAreaHeight;
    int drawAreaWidth;
    int[] xPoints;
    int[] yPoints;

    public HSSFPolygon(EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape, HSSFAnchor hSSFAnchor) {
        super(escherContainerRecord, hSSFShape, hSSFAnchor);
        this.drawAreaWidth = 100;
        this.drawAreaHeight = 100;
    }

    private int[] cloneArray(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = iArr[i10];
        }
        return iArr2;
    }

    public int getDrawAreaHeight() {
        return this.drawAreaHeight;
    }

    public int getDrawAreaWidth() {
        return this.drawAreaWidth;
    }

    public int[] getXPoints() {
        return this.xPoints;
    }

    public int[] getYPoints() {
        return this.yPoints;
    }

    public void setPoints(int[] iArr, int[] iArr2) {
        this.xPoints = cloneArray(iArr);
        this.yPoints = cloneArray(iArr2);
    }

    public void setPolygonDrawArea(int i10, int i11) {
        this.drawAreaWidth = i10;
        this.drawAreaHeight = i11;
    }
}
