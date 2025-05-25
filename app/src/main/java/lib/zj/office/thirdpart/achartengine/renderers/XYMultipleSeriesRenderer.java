package lib.zj.office.thirdpart.achartengine.renderers;

import android.graphics.Paint;
import eh.b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class XYMultipleSeriesRenderer extends DefaultRenderer {
    private Map<Integer, double[]> initialRange;
    private double mBarSpacing;
    private int mGridColor;
    private int mMarginsColor;
    private double[] mMaxX;
    private double[] mMaxY;
    private double[] mMinX;
    private double[] mMinY;
    private Orientation mOrientation;
    private double[] mPanLimits;
    private boolean mPanXEnabled;
    private boolean mPanYEnabled;
    private float mPointSize;
    private int mXLabels;
    private float mXLabelsAngle;
    private Map<Double, String> mXTextLabels;
    private String mXTitle;
    private float mXTitleTextSize;
    private int mYLabels;
    private float mYLabelsAngle;
    private Map<Integer, Map<Double, String>> mYTextLabels;
    private String[] mYTitle;
    private float mYTitleTextSize;
    private double[] mZoomLimits;
    private boolean mZoomXEnabled;
    private boolean mZoomYEnabled;
    private int scalesCount;
    private b seriesFill;
    private gh.b seriesFrame;
    private Paint.Align xLabelsAlign;
    private Paint.Align[] yAxisAlign;
    private Paint.Align[] yLabelsAlign;

    /* loaded from: classes3.dex */
    public enum Orientation {
        HORIZONTAL(0),
        VERTICAL(90);
        
        private int mAngle;

        Orientation(int i10) {
            this.mAngle = i10;
        }

        public int getAngle() {
            return this.mAngle;
        }
    }

    public XYMultipleSeriesRenderer() {
        this(1);
    }

    public void addTextLabel(double d10, String str) {
        addXTextLabel(d10, str);
    }

    public void addXTextLabel(double d10, String str) {
        this.mXTextLabels.put(Double.valueOf(d10), str);
    }

    public void addYTextLabel(double d10, String str) {
        addYTextLabel(d10, str, 0);
    }

    public void clearTextLabels() {
        clearXTextLabels();
    }

    public void clearXTextLabels() {
        this.mXTextLabels.clear();
    }

    public void clearYTextLabels() {
        this.mYTextLabels.clear();
    }

    public double getBarSpacing() {
        return this.mBarSpacing;
    }

    public double getBarsSpacing() {
        return getBarSpacing();
    }

    public int getGridColor() {
        return this.mGridColor;
    }

    public double[] getInitialRange() {
        return getInitialRange(0);
    }

    public int getMarginsColor() {
        return this.mMarginsColor;
    }

    public Orientation getOrientation() {
        return this.mOrientation;
    }

    public double[] getPanLimits() {
        return this.mPanLimits;
    }

    public float getPointSize() {
        return this.mPointSize;
    }

    public int getScalesCount() {
        return this.scalesCount;
    }

    public b getSeriesBackgroundColor() {
        return this.seriesFill;
    }

    public gh.b getSeriesFrame() {
        return this.seriesFrame;
    }

    public double getXAxisMax() {
        return getXAxisMax(0);
    }

    public double getXAxisMin() {
        return getXAxisMin(0);
    }

    public int getXLabels() {
        return this.mXLabels;
    }

    public Paint.Align getXLabelsAlign() {
        return this.xLabelsAlign;
    }

    public float getXLabelsAngle() {
        return this.mXLabelsAngle;
    }

    public String getXTextLabel(Double d10) {
        return this.mXTextLabels.get(d10);
    }

    public Double[] getXTextLabelLocations() {
        return (Double[]) this.mXTextLabels.keySet().toArray(new Double[0]);
    }

    public int getXTextLabels() {
        return this.mXTextLabels.size();
    }

    public String getXTitle() {
        return this.mXTitle;
    }

    public float getXTitleTextSize() {
        return this.mXTitleTextSize;
    }

    public Paint.Align getYAxisAlign(int i10) {
        return this.yAxisAlign[i10];
    }

    public double getYAxisMax() {
        return getYAxisMax(0);
    }

    public double getYAxisMin() {
        return getYAxisMin(0);
    }

    public int getYLabels() {
        return this.mYLabels;
    }

    public Paint.Align getYLabelsAlign(int i10) {
        return this.yLabelsAlign[i10];
    }

    public float getYLabelsAngle() {
        return this.mYLabelsAngle;
    }

    public String getYTextLabel(Double d10) {
        return getYTextLabel(d10, 0);
    }

    public Double[] getYTextLabelLocations() {
        return getYTextLabelLocations(0);
    }

    public String getYTitle() {
        return getYTitle(0);
    }

    public float getYTitleTextSize() {
        return this.mYTitleTextSize;
    }

    public double[] getZoomLimits() {
        return this.mZoomLimits;
    }

    public void initAxesRange(int i10) {
        this.mYTitle = new String[i10];
        this.yLabelsAlign = new Paint.Align[i10];
        this.yAxisAlign = new Paint.Align[i10];
        this.mMinX = new double[i10];
        this.mMaxX = new double[i10];
        this.mMinY = new double[i10];
        this.mMaxY = new double[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            initAxesRangeForScale(i11);
        }
    }

    public void initAxesRangeForScale(int i10) {
        double[] dArr = this.mMinX;
        dArr[i10] = Double.MAX_VALUE;
        double[] dArr2 = this.mMaxX;
        dArr2[i10] = -1.7976931348623157E308d;
        double[] dArr3 = this.mMinY;
        dArr3[i10] = Double.MAX_VALUE;
        double[] dArr4 = this.mMaxY;
        dArr4[i10] = -1.7976931348623157E308d;
        this.initialRange.put(Integer.valueOf(i10), new double[]{dArr[i10], dArr2[i10], dArr3[i10], dArr4[i10]});
        this.mYTitle[i10] = "";
        this.mYTextLabels.put(Integer.valueOf(i10), new HashMap());
        this.yLabelsAlign[i10] = Paint.Align.CENTER;
        this.yAxisAlign[i10] = Paint.Align.LEFT;
    }

    public boolean isInitialRangeSet() {
        return isInitialRangeSet(0);
    }

    public boolean isMaxXSet() {
        return isMaxXSet(0);
    }

    public boolean isMaxYSet() {
        return isMaxYSet(0);
    }

    public boolean isMinXSet() {
        return isMinXSet(0);
    }

    public boolean isMinYSet() {
        return isMinYSet(0);
    }

    @Override // lib.zj.office.thirdpart.achartengine.renderers.DefaultRenderer
    public boolean isPanEnabled() {
        if (isPanXEnabled() && isPanYEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isPanXEnabled() {
        return this.mPanXEnabled;
    }

    public boolean isPanYEnabled() {
        return this.mPanYEnabled;
    }

    @Override // lib.zj.office.thirdpart.achartengine.renderers.DefaultRenderer
    public boolean isZoomEnabled() {
        if (!isZoomXEnabled() && !isZoomYEnabled()) {
            return false;
        }
        return true;
    }

    public boolean isZoomXEnabled() {
        return this.mZoomXEnabled;
    }

    public boolean isZoomYEnabled() {
        return this.mZoomYEnabled;
    }

    public void setBarSpacing(double d10) {
        this.mBarSpacing = d10;
    }

    public void setChartValuesTextSize(float f10) {
        for (SimpleSeriesRenderer simpleSeriesRenderer : getSeriesRenderers()) {
            simpleSeriesRenderer.setChartValuesTextSize(f10);
        }
    }

    public void setDisplayChartValues(boolean z10) {
        for (SimpleSeriesRenderer simpleSeriesRenderer : getSeriesRenderers()) {
            simpleSeriesRenderer.setDisplayChartValues(z10);
        }
    }

    public void setGridColor(int i10) {
        this.mGridColor = i10;
    }

    public void setInitialRange(double[] dArr) {
        setInitialRange(dArr, 0);
    }

    public void setMarginsColor(int i10) {
        this.mMarginsColor = i10;
    }

    public void setOrientation(Orientation orientation) {
        this.mOrientation = orientation;
    }

    public void setPanEnabled(boolean z10, boolean z11) {
        this.mPanXEnabled = z10;
        this.mPanYEnabled = z11;
    }

    public void setPanLimits(double[] dArr) {
        this.mPanLimits = dArr;
    }

    public void setPointSize(float f10) {
        this.mPointSize = f10;
    }

    public void setRange(double[] dArr) {
        setRange(dArr, 0);
    }

    public void setSeriesBackgroundColor(b bVar) {
        this.seriesFill = bVar;
    }

    public void setSeriesFrame(gh.b bVar) {
        this.seriesFrame = bVar;
    }

    public void setXAxisMax(double d10) {
        setXAxisMax(d10, 0);
    }

    public void setXAxisMin(double d10) {
        setXAxisMin(d10, 0);
    }

    public void setXLabels(int i10) {
        this.mXLabels = i10;
    }

    public void setXLabelsAlign(Paint.Align align) {
        this.xLabelsAlign = align;
    }

    public void setXLabelsAngle(float f10) {
        this.mXLabelsAngle = f10;
    }

    public void setXTitle(String str) {
        this.mXTitle = str;
    }

    public void setXTitleTextSize(float f10) {
        this.mXTitleTextSize = f10;
    }

    public void setYAxisAlign(Paint.Align align, int i10) {
        this.yAxisAlign[i10] = align;
    }

    public void setYAxisMax(double d10) {
        setYAxisMax(d10, 0);
    }

    public void setYAxisMin(double d10) {
        setYAxisMin(d10, 0);
    }

    public void setYLabels(int i10) {
        this.mYLabels = i10;
    }

    public void setYLabelsAlign(Paint.Align align) {
        setYLabelsAlign(align, 0);
    }

    public void setYLabelsAngle(float f10) {
        this.mYLabelsAngle = f10;
    }

    public void setYTitle(String str) {
        setYTitle(str, 0);
    }

    public void setYTitleTextSize(float f10) {
        this.mYTitleTextSize = f10;
    }

    public void setZoomEnabled(boolean z10, boolean z11) {
        this.mZoomXEnabled = z10;
        this.mZoomYEnabled = z11;
    }

    public void setZoomLimits(double[] dArr) {
        this.mZoomLimits = dArr;
    }

    public XYMultipleSeriesRenderer(int i10) {
        this.mXTitle = "";
        this.mXTitleTextSize = 12.0f;
        this.mYTitleTextSize = 12.0f;
        this.mXLabels = 5;
        this.mYLabels = 7;
        this.mOrientation = Orientation.HORIZONTAL;
        this.mXTextLabels = new HashMap();
        this.mYTextLabels = new LinkedHashMap();
        this.mPanXEnabled = true;
        this.mPanYEnabled = true;
        this.mZoomXEnabled = true;
        this.mZoomYEnabled = true;
        this.mBarSpacing = 0.0d;
        this.mMarginsColor = 0;
        this.initialRange = new LinkedHashMap();
        this.mPointSize = 5.0f;
        this.seriesFill = null;
        this.seriesFrame = null;
        this.mGridColor = -16777216;
        this.xLabelsAlign = Paint.Align.CENTER;
        this.scalesCount = i10;
        initAxesRange(i10);
    }

    public void addYTextLabel(double d10, String str, int i10) {
        this.mYTextLabels.get(Integer.valueOf(i10)).put(Double.valueOf(d10), str);
    }

    public double[] getInitialRange(int i10) {
        return this.initialRange.get(Integer.valueOf(i10));
    }

    public double getXAxisMax(int i10) {
        return this.mMaxX[i10];
    }

    public double getXAxisMin(int i10) {
        return this.mMinX[i10];
    }

    public double getYAxisMax(int i10) {
        return this.mMaxY[i10];
    }

    public double getYAxisMin(int i10) {
        return this.mMinY[i10];
    }

    public String getYTextLabel(Double d10, int i10) {
        return this.mYTextLabels.get(Integer.valueOf(i10)).get(d10);
    }

    public Double[] getYTextLabelLocations(int i10) {
        return (Double[]) this.mYTextLabels.get(Integer.valueOf(i10)).keySet().toArray(new Double[0]);
    }

    public String getYTitle(int i10) {
        return this.mYTitle[i10];
    }

    public boolean isInitialRangeSet(int i10) {
        return this.initialRange.get(Integer.valueOf(i10)) != null;
    }

    public boolean isMaxXSet(int i10) {
        return this.mMaxX[i10] != -1.7976931348623157E308d;
    }

    public boolean isMaxYSet(int i10) {
        return this.mMaxY[i10] != -1.7976931348623157E308d;
    }

    public boolean isMinXSet(int i10) {
        return this.mMinX[i10] != Double.MAX_VALUE;
    }

    public boolean isMinYSet(int i10) {
        return this.mMinY[i10] != Double.MAX_VALUE;
    }

    public void setInitialRange(double[] dArr, int i10) {
        this.initialRange.put(Integer.valueOf(i10), dArr);
    }

    public void setRange(double[] dArr, int i10) {
        setXAxisMin(dArr[0], i10);
        setXAxisMax(dArr[1], i10);
        setYAxisMin(dArr[2], i10);
        setYAxisMax(dArr[3], i10);
    }

    public void setXAxisMax(double d10, int i10) {
        if (!isMaxXSet(i10)) {
            this.initialRange.get(Integer.valueOf(i10))[1] = d10;
        }
        this.mMaxX[i10] = d10;
    }

    public void setXAxisMin(double d10, int i10) {
        if (!isMinXSet(i10)) {
            this.initialRange.get(Integer.valueOf(i10))[0] = d10;
        }
        this.mMinX[i10] = d10;
    }

    public void setYAxisMax(double d10, int i10) {
        if (!isMaxYSet(i10)) {
            this.initialRange.get(Integer.valueOf(i10))[3] = d10;
        }
        this.mMaxY[i10] = d10;
    }

    public void setYAxisMin(double d10, int i10) {
        if (!isMinYSet(i10)) {
            this.initialRange.get(Integer.valueOf(i10))[2] = d10;
        }
        this.mMinY[i10] = d10;
    }

    public void setYLabelsAlign(Paint.Align align, int i10) {
        this.yLabelsAlign[i10] = align;
    }

    public void setYTitle(String str, int i10) {
        this.mYTitle[i10] = str;
    }
}
