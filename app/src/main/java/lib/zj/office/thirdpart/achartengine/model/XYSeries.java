package lib.zj.office.thirdpart.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class XYSeries implements Serializable {
    private double mMaxX;
    private double mMaxY;
    private double mMinX;
    private double mMinY;
    private int mScaleNumber;
    private String mTitle;
    private List<Double> mX;
    private List<Double> mY;

    public XYSeries(String str) {
        this(str, 0);
    }

    public final void a() {
        this.mMinX = Double.MAX_VALUE;
        this.mMaxX = -1.7976931348623157E308d;
        this.mMinY = Double.MAX_VALUE;
        this.mMaxY = -1.7976931348623157E308d;
        int itemCount = getItemCount();
        for (int i10 = 0; i10 < itemCount; i10++) {
            b(getX(i10), getY(i10));
        }
    }

    public synchronized void add(double d10, double d11) {
        this.mX.add(Double.valueOf(d10));
        this.mY.add(Double.valueOf(d11));
        b(d10, d11);
    }

    public final void b(double d10, double d11) {
        this.mMinX = Math.min(this.mMinX, d10);
        this.mMaxX = Math.max(this.mMaxX, d10);
        this.mMinY = Math.min(this.mMinY, d11);
        this.mMaxY = Math.max(this.mMaxY, d11);
    }

    public synchronized void clear() {
        this.mX.clear();
        this.mY.clear();
        a();
    }

    public synchronized int getItemCount() {
        return this.mX.size();
    }

    public double getMaxX() {
        return this.mMaxX;
    }

    public double getMaxY() {
        return this.mMaxY;
    }

    public double getMinX() {
        return this.mMinX;
    }

    public double getMinY() {
        return this.mMinY;
    }

    public int getScaleNumber() {
        return this.mScaleNumber;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public synchronized double getX(int i10) {
        return this.mX.get(i10).doubleValue();
    }

    public synchronized double getY(int i10) {
        return this.mY.get(i10).doubleValue();
    }

    public synchronized void remove(int i10) {
        double doubleValue = this.mX.remove(i10).doubleValue();
        double doubleValue2 = this.mY.remove(i10).doubleValue();
        if (doubleValue == this.mMinX || doubleValue == this.mMaxX || doubleValue2 == this.mMinY || doubleValue2 == this.mMaxY) {
            a();
        }
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public XYSeries(String str, int i10) {
        this.mX = new ArrayList();
        this.mY = new ArrayList();
        this.mMinX = Double.MAX_VALUE;
        this.mMaxX = -1.7976931348623157E308d;
        this.mMinY = Double.MAX_VALUE;
        this.mMaxY = -1.7976931348623157E308d;
        this.mTitle = str;
        this.mScaleNumber = i10;
        a();
    }
}
