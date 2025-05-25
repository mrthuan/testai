package lib.zj.office.thirdpart.achartengine.renderers;

import android.graphics.Typeface;
import eh.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class DefaultRenderer implements Serializable {
    public static final int BACKGROUND_COLOR = -16777216;
    public static final int NO_COLOR = 0;
    public static final int TEXT_COLOR = -16777216;

    /* renamed from: a  reason: collision with root package name */
    public static final Typeface f21082a = Typeface.create(Typeface.SERIF, 0);
    private float defaultFontSize = 12.0f;
    private String textTypefaceName = f21082a.toString();
    private int textTypefaceStyle = 0;
    private b chartFill = null;
    private gh.b frame = null;
    private boolean mApplyBackgroundColor = true;
    private boolean mShowChartTitle = true;
    private float mChartTitleTextSize = 15.0f;
    private String mChartTitle = "";
    private boolean mShowAxes = true;
    private int mAxesColor = -16777216;
    private boolean mShowLabels = true;
    private int mLabelsColor = -16777216;
    private float mLabelsTextSize = 10.0f;
    private boolean mShowLegend = true;
    private float mLegendTextSize = 12.0f;
    private boolean mFitLegend = false;
    private boolean mXShowGrid = false;
    private boolean mYShowGrid = false;
    private boolean mShowCustomTextGrid = false;
    private List<SimpleSeriesRenderer> mRenderers = new ArrayList();
    private boolean antialiasing = true;
    private int mLegendHeight = 0;
    private double[] mMargins = {0.1d, 0.05d, 0.1d, 0.05d};
    private float mScale = 1.0f;
    private boolean mZoomEnabled = true;
    private boolean mZoomButtonsVisible = false;
    private float mZoomRate = 1.0f;
    private float mOriginalScale = 1.0f;

    public void addSeriesRenderer(SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.add(simpleSeriesRenderer);
    }

    public int getAxesColor() {
        return this.mAxesColor;
    }

    public b getBackgroundAndFill() {
        return this.chartFill;
    }

    public int getBackgroundColor() {
        return -16777216;
    }

    public gh.b getChartFrame() {
        return this.frame;
    }

    public String getChartTitle() {
        return this.mChartTitle;
    }

    public float getChartTitleTextSize() {
        return this.mChartTitleTextSize;
    }

    public float getDefaultFontSize() {
        return this.defaultFontSize;
    }

    public int getLabelsColor() {
        return this.mLabelsColor;
    }

    public float getLabelsTextSize() {
        return this.mLabelsTextSize;
    }

    public int getLegendHeight() {
        return this.mLegendHeight;
    }

    public float getLegendTextSize() {
        return this.mLegendTextSize;
    }

    public double[] getMargins() {
        return this.mMargins;
    }

    public float getOriginalScale() {
        return this.mOriginalScale;
    }

    public float getScale() {
        return this.mScale;
    }

    public SimpleSeriesRenderer getSeriesRendererAt(int i10) {
        return this.mRenderers.get(i10);
    }

    public int getSeriesRendererCount() {
        return this.mRenderers.size();
    }

    public SimpleSeriesRenderer[] getSeriesRenderers() {
        return (SimpleSeriesRenderer[]) this.mRenderers.toArray(new SimpleSeriesRenderer[0]);
    }

    public String getTextTypefaceName() {
        return this.textTypefaceName;
    }

    public int getTextTypefaceStyle() {
        return this.textTypefaceStyle;
    }

    public float getZoomRate() {
        return this.mZoomRate;
    }

    public boolean isAntialiasing() {
        return this.antialiasing;
    }

    public boolean isApplyBackgroundColor() {
        return this.mApplyBackgroundColor;
    }

    public boolean isFitLegend() {
        return this.mFitLegend;
    }

    public boolean isPanEnabled() {
        return false;
    }

    public boolean isShowAxes() {
        return this.mShowAxes;
    }

    public boolean isShowChartTitle() {
        return this.mShowChartTitle;
    }

    public boolean isShowCustomTextGrid() {
        return this.mShowCustomTextGrid;
    }

    public boolean isShowGridH() {
        return this.mXShowGrid;
    }

    public boolean isShowGridV() {
        return this.mYShowGrid;
    }

    public boolean isShowLabels() {
        return this.mShowLabels;
    }

    public boolean isShowLegend() {
        return this.mShowLegend;
    }

    public boolean isZoomButtonsVisible() {
        return this.mZoomButtonsVisible;
    }

    public boolean isZoomEnabled() {
        return this.mZoomEnabled;
    }

    public void removeSeriesRenderer(SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.remove(simpleSeriesRenderer);
    }

    public void setAntialiasing(boolean z10) {
        this.antialiasing = z10;
    }

    public void setApplyBackgroundColor(boolean z10) {
        this.mApplyBackgroundColor = z10;
    }

    public void setAxesColor(int i10) {
        this.mAxesColor = i10;
    }

    public void setBackgroundAndFill(b bVar) {
        this.chartFill = bVar;
    }

    public void setChartFrame(gh.b bVar) {
        this.frame = bVar;
    }

    public void setChartTitle(String str) {
        this.mChartTitle = str;
    }

    public void setChartTitleTextSize(float f10) {
        this.mChartTitleTextSize = f10;
    }

    public void setDefaultFontSize(float f10) {
        this.defaultFontSize = f10;
    }

    public void setFitLegend(boolean z10) {
        this.mFitLegend = z10;
    }

    public void setLabelsColor(int i10) {
        this.mLabelsColor = i10;
    }

    public void setLabelsTextSize(float f10) {
        this.mLabelsTextSize = f10;
    }

    public void setLegendHeight(int i10) {
        this.mLegendHeight = i10;
    }

    public void setLegendTextSize(float f10) {
        this.mLegendTextSize = f10;
    }

    public void setMargins(double[] dArr) {
        this.mMargins = dArr;
    }

    public void setScale(float f10) {
        if (this.mOriginalScale == 1.0f) {
            this.mOriginalScale = f10;
        }
        this.mScale = f10;
    }

    public void setShowAxes(boolean z10) {
        this.mShowAxes = z10;
    }

    public void setShowChartTitle(boolean z10) {
        this.mShowChartTitle = z10;
    }

    public void setShowCustomTextGrid(boolean z10) {
        this.mShowCustomTextGrid = z10;
    }

    public void setShowGridH(boolean z10) {
        this.mXShowGrid = z10;
    }

    public void setShowGridV(boolean z10) {
        this.mYShowGrid = z10;
    }

    public void setShowLabels(boolean z10) {
        this.mShowLabels = z10;
    }

    public void setShowLegend(boolean z10) {
        this.mShowLegend = z10;
    }

    public void setTextTypeface(String str, int i10) {
        this.textTypefaceName = str;
        this.textTypefaceStyle = i10;
    }

    public void setZoomButtonsVisible(boolean z10) {
        this.mZoomButtonsVisible = z10;
    }

    public void setZoomEnabled(boolean z10) {
        this.mZoomEnabled = z10;
    }

    public void setZoomRate(float f10) {
        this.mZoomRate = f10;
    }

    public void addSeriesRenderer(int i10, SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.add(i10, simpleSeriesRenderer);
    }

    public void setBackgroundColor(int i10) {
    }
}
