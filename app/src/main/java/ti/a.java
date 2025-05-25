package ti;

import lib.zj.office.thirdpart.achartengine.model.XYMultipleSeriesDataset;
import lib.zj.office.thirdpart.achartengine.renderers.XYMultipleSeriesRenderer;

/* compiled from: ChartFactory.java */
/* loaded from: classes3.dex */
public final class a {
    public static void a(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        if (xYMultipleSeriesDataset != null && xYMultipleSeriesRenderer != null && xYMultipleSeriesDataset.getSeriesCount() == xYMultipleSeriesRenderer.getSeriesRendererCount()) {
            return;
        }
        throw new IllegalArgumentException("Dataset and renderer should be not null and should have the same number of series");
    }
}
