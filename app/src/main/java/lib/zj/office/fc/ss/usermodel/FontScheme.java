// Auto-fixed: added missing class declaration
public class FontScheme {
package lib.zj.office.fc.ss.usermodel;

/* loaded from: classes3.dex */
public enum FontScheme {
    NONE(1),
    MAJOR(2),
    MINOR(3);
    
    private static FontScheme[] _table = new FontScheme[4];
    private int value;

    static {
        FontScheme[] values;
        for (FontScheme fontScheme : values()) {
            _table[fontScheme.getValue()] = fontScheme;
        }
    }

    FontScheme(int i10) {
        this.value = i10;
    }

    public int getValue() {
        return this.value;
    }

    public static FontScheme valueOf(int i10) {
        return _table[i10];
    }
}

}
