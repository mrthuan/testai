package lib.zj.office.fc.ss.usermodel.charts;

import java.util.List;
import lib.zj.office.fc.ss.util.DataMarker;

/* loaded from: classes3.dex */
public interface ScatterChartData extends ChartData {
    ScatterChartSerie addSerie(DataMarker dataMarker, DataMarker dataMarker2);

    List<? extends ScatterChartSerie> getSeries();
}
