package lib.zj.office.thirdpart.achartengine.renderers;

import android.graphics.Color;
import lib.zj.office.thirdpart.achartengine.chart.PointStyle;

/* loaded from: classes3.dex */
public class XYSeriesRenderer extends SimpleSeriesRenderer {
    private boolean mFillPoints = true;
    private boolean mFillBelowLine = false;
    private int mFillColor = Color.argb(125, 0, 0, 200);
    private PointStyle mPointStyle = PointStyle.POINT;
    private float mLineWidth = 3.0f;

    public int getFillBelowLineColor() {
        return this.mFillColor;
    }

    public float getLineWidth() {
        return this.mLineWidth;
    }

    public PointStyle getPointStyle() {
        return this.mPointStyle;
    }

    public boolean isFillBelowLine() {
        return this.mFillBelowLine;
    }

    public boolean isFillPoints() {
        return this.mFillPoints;
    }

    public void setFillBelowLine(boolean z10) {
        this.mFillBelowLine = z10;
    }

    public void setFillBelowLineColor(int i10) {
        this.mFillColor = i10;
    }

    public void setFillPoints(boolean z10) {
        this.mFillPoints = z10;
    }

    public void setLineWidth(float f10) {
        this.mLineWidth = f10;
    }

    public void setPointStyle(PointStyle pointStyle) {
        this.mPointStyle = pointStyle;
    }
}
