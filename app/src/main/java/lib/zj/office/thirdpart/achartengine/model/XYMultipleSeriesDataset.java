package lib.zj.office.thirdpart.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class XYMultipleSeriesDataset implements Serializable {
    private List<XYSeries> mSeries = new ArrayList();

    public synchronized void addSeries(XYSeries xYSeries) {
        this.mSeries.add(xYSeries);
    }

    public synchronized XYSeries[] getSeries() {
        return (XYSeries[]) this.mSeries.toArray(new XYSeries[0]);
    }

    public synchronized XYSeries getSeriesAt(int i10) {
        return this.mSeries.get(i10);
    }

    public synchronized int getSeriesCount() {
        return this.mSeries.size();
    }

    public synchronized void removeSeries(int i10) {
        this.mSeries.remove(i10);
    }

    public synchronized void addSeries(int i10, XYSeries xYSeries) {
        this.mSeries.add(i10, xYSeries);
    }

    public synchronized void removeSeries(XYSeries xYSeries) {
        this.mSeries.remove(xYSeries);
    }
}
