// Auto-fixed: added missing class declaration
public class FontFamily {
package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public enum FontFamily {
    NOT_APPLICABLE(0),
    ROMAN(1),
    SWISS(2),
    MODERN(3),
    SCRIPT(4),
    DECORATIVE(5);
    
    private static FontFamily[] _table = new FontFamily[6];
    private int family;

    static {
        FontFamily[] values;
        for (FontFamily fontFamily : values()) {
            _table[fontFamily.getValue()] = fontFamily;
        }
    }

    FontFamily(int i10) {
        this.family = i10;
    }

    public int getValue() {
        return this.family;
    }

    public static FontFamily valueOf(int i10) {
        return _table[i10];
    }
}

}
