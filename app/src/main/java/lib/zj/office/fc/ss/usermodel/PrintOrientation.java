// Auto-fixed: added missing class declaration
public class PrintOrientation {
package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public enum PrintOrientation {
    DEFAULT(1),
    PORTRAIT(2),
    LANDSCAPE(3);
    
    private static PrintOrientation[] _table = new PrintOrientation[4];
    private int orientation;

    static {
        PrintOrientation[] values;
        for (PrintOrientation printOrientation : values()) {
            _table[printOrientation.getValue()] = printOrientation;
        }
    }

    PrintOrientation(int i10) {
        this.orientation = i10;
    }

    public int getValue() {
        return this.orientation;
    }

    public static PrintOrientation valueOf(int i10) {
        return _table[i10];
    }
}

}
