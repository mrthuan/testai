package lib.zj.office.fc.ss.usermodel.charts;

/* loaded from: classes3.dex */
public interface ManualLayout {
    LayoutMode getHeightMode();

    double getHeightRatio();

    LayoutTarget getTarget();

    LayoutMode getWidthMode();

    double getWidthRatio();

    double getX();

    LayoutMode getXMode();

    double getY();

    LayoutMode getYMode();

    void setHeightMode(LayoutMode layoutMode);

    void setHeightRatio(double d10);

    void setTarget(LayoutTarget layoutTarget);

    void setWidthMode(LayoutMode layoutMode);

    void setWidthRatio(double d10);

    void setX(double d10);

    void setXMode(LayoutMode layoutMode);

    void setY(double d10);

    void setYMode(LayoutMode layoutMode);
}
