// Auto-fixed: added missing class declaration
public class FileSectionType {
package androidx.profileinstaller;

/* loaded from: classes.dex */
enum FileSectionType {
    DEX_FILES("DEX_FILES"),
    EXTRA_DESCRIPTORS("EXTRA_DESCRIPTORS"),
    CLASSES("CLASSES"),
    METHODS("METHODS"),
    AGGREGATION_COUNT("AGGREGATION_COUNT");
    
    private final long mValue;

    FileSectionType(String str) {
        this.mValue = r2;
    }

    public static FileSectionType fromValue(long j10) {
        FileSectionType[] values = values();
        for (int i10 = 0; i10 < values.length; i10++) {
            if (values[i10].getValue() == j10) {
                return values[i10];
            }
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("Unsupported FileSection Type ", j10));
    }

    public long getValue() {
        return this.mValue;
    }
}

}
