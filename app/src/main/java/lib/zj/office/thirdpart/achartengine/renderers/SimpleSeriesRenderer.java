package lib.zj.office.thirdpart.achartengine.renderers;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class SimpleSeriesRenderer implements Serializable {
    private boolean mDisplayChartValues;
    private int mGradientStartColor;
    private double mGradientStartValue;
    private int mGradientStopColor;
    private double mGradientStopValue;
    private BasicStroke mStroke;
    private int mColor = -16776961;
    private float mChartValuesTextSize = 10.0f;
    private boolean mGradientEnabled = false;

    public float getChartValuesTextSize() {
        return this.mChartValuesTextSize;
    }

    public int getColor() {
        return this.mColor;
    }

    public int getGradientStartColor() {
        return this.mGradientStartColor;
    }

    public double getGradientStartValue() {
        return this.mGradientStartValue;
    }

    public int getGradientStopColor() {
        return this.mGradientStopColor;
    }

    public double getGradientStopValue() {
        return this.mGradientStopValue;
    }

    public BasicStroke getStroke() {
        return this.mStroke;
    }

    public boolean isDisplayChartValues() {
        return this.mDisplayChartValues;
    }

    public boolean isGradientEnabled() {
        return this.mGradientEnabled;
    }

    public void setChartValuesTextSize(float f10) {
        this.mChartValuesTextSize = f10;
    }

    public void setColor(int i10) {
        this.mColor = i10;
    }

    public void setDisplayChartValues(boolean z10) {
        this.mDisplayChartValues = z10;
    }

    public void setGradientEnabled(boolean z10) {
        this.mGradientEnabled = z10;
    }

    public void setGradientStart(double d10, int i10) {
        this.mGradientStartValue = d10;
        this.mGradientStartColor = i10;
    }

    public void setGradientStop(double d10, int i10) {
        this.mGradientStopValue = d10;
        this.mGradientStopColor = i10;
    }

    public void setStroke(BasicStroke basicStroke) {
        this.mStroke = basicStroke;
    }
}
