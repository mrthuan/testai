package lib.zj.office.thirdpart.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class CategorySeries implements Serializable {
    private String mTitle;
    private List<String> mCategories = new ArrayList();
    private List<Double> mValues = new ArrayList();

    public CategorySeries(String str) {
        this.mTitle = str;
    }

    public synchronized void add(double d10) {
        add((this.mCategories.size() + 1) + "", d10);
    }

    public synchronized void clear() {
        this.mCategories.clear();
        this.mValues.clear();
    }

    public synchronized String getCategory(int i10) {
        return this.mCategories.get(i10);
    }

    public synchronized int getItemCount() {
        return this.mCategories.size();
    }

    public String getTitle() {
        return this.mTitle;
    }

    public synchronized double getValue(int i10) {
        return this.mValues.get(i10).doubleValue();
    }

    public synchronized void remove(int i10) {
        this.mCategories.remove(i10);
        this.mValues.remove(i10);
    }

    public synchronized void set(int i10, String str, double d10) {
        this.mCategories.set(i10, str);
        this.mValues.set(i10, Double.valueOf(d10));
    }

    public XYSeries toXYSeries() {
        XYSeries xYSeries = new XYSeries(this.mTitle);
        int i10 = 0;
        for (Double d10 : this.mValues) {
            i10++;
            xYSeries.add(i10, d10.doubleValue());
        }
        return xYSeries;
    }

    public synchronized void add(String str, double d10) {
        this.mCategories.add(str);
        this.mValues.add(Double.valueOf(d10));
    }
}
