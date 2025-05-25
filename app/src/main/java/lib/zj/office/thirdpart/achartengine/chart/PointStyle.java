// Auto-fixed: added missing class declaration
public class PointStyle {
package lib.zj.office.thirdpart.achartengine.chart;

/* loaded from: classes3.dex */
public enum PointStyle {
    X("x"),
    CIRCLE("circle"),
    TRIANGLE("triangle"),
    SQUARE("square"),
    DIAMOND("diamond"),
    POINT("point");
    
    private String mName;

    PointStyle(String str) {
        this.mName = str;
    }

    public static int getIndexForName(String str) {
        PointStyle[] values = values();
        int length = values.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length && i10 < 0; i11++) {
            if (values[i11].mName.equals(str)) {
                i10 = i11;
            }
        }
        return Math.max(0, i10);
    }

    public static PointStyle getPointStyleForName(String str) {
        PointStyle[] values = values();
        int length = values.length;
        PointStyle pointStyle = null;
        for (int i10 = 0; i10 < length && pointStyle == null; i10++) {
            if (values[i10].mName.equals(str)) {
                pointStyle = values[i10];
            }
        }
        return pointStyle;
    }

    public String getName() {
        return this.mName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getName();
    }
}

}
