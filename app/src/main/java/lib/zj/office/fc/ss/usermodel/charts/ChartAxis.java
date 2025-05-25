package lib.zj.office.fc.ss.usermodel.charts;

/* loaded from: classes3.dex */
public interface ChartAxis {
    void crossAxis(ChartAxis chartAxis);

    AxisCrosses getCrosses();

    long getId();

    double getLogBase();

    double getMaximum();

    double getMinimum();

    String getNumberFormat();

    AxisOrientation getOrientation();

    AxisPosition getPosition();

    boolean isSetLogBase();

    boolean isSetMaximum();

    boolean isSetMinimum();

    void setCrosses(AxisCrosses axisCrosses);

    void setLogBase(double d10);

    void setMaximum(double d10);

    void setMinimum(double d10);

    void setNumberFormat(String str);

    void setOrientation(AxisOrientation axisOrientation);

    void setPosition(AxisPosition axisPosition);
}
