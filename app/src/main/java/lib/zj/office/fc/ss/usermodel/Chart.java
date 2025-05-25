package lib.zj.office.fc.ss.usermodel;

import java.util.List;
import lib.zj.office.fc.ss.usermodel.charts.ChartAxis;
import lib.zj.office.fc.ss.usermodel.charts.ChartAxisFactory;
import lib.zj.office.fc.ss.usermodel.charts.ChartData;
import lib.zj.office.fc.ss.usermodel.charts.ChartDataFactory;
import lib.zj.office.fc.ss.usermodel.charts.ChartLegend;
import lib.zj.office.fc.ss.usermodel.charts.ManuallyPositionable;

/* loaded from: classes3.dex */
public interface Chart extends ManuallyPositionable {
    void deleteLegend();

    List<? extends ChartAxis> getAxis();

    ChartAxisFactory getChartAxisFactory();

    ChartDataFactory getChartDataFactory();

    ChartLegend getOrCreateLegend();

    void plot(ChartData chartData, ChartAxis... chartAxisArr);
}
