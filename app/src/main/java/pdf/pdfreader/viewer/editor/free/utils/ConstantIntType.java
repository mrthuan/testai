// Auto-fixed: added missing class declaration
public class ConstantIntType {
package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;

/* loaded from: classes3.dex */
public enum ConstantIntType {
    OpenHomeCount(ea.a.p("1YnY5c-Ai6bk6ZW1j6z35tGw", "0Zzn7RAu"), ea.a.p("JGVIXxZwUm4FaCVtEF8Lb0BudA==", "zjXrRQCn"), 2),
    OpenPreviewCount(ea.a.p("1YnY5c-Ai6L26JOIgKHj5uih1JWw", "0AyDzKdA"), ea.a.p("WGUyXxxwB24tcEZlH2kzdxtjXXUodA==", "hqYS282b"), 3),
    MinReqDataMemory(ea.a.p("1ZzL5cOPh63q5baojqns6dO0", "Kt8PaGsU"), ea.a.p("WGUyXx5pDF8AZUVfDWEiYRttV20=", "ngAZd02K"), 50),
    Max;
    

    /* renamed from: a  reason: collision with root package name */
    public static ConstantIntType[] f28515a = null;
    private final int count;
    private final int defValue;
    private final String key;
    private final String name;

    ConstantIntType() {
        throw null;
    }

    ConstantIntType(String str, String str2, int i10) {
        this.name = str;
        this.count = 0;
        this.key = str2;
        this.defValue = i10;
    }

    public static ConstantIntType getFromOrdinal(int i10) {
        if (f28515a == null) {
            f28515a = values();
        }
        return f28515a[(i10 >= Max.ordinal() || i10 < 0) ? 0 : 0];
    }

    public int getCount() {
        return this.count;
    }

    public int getDefValue(Context context) {
        return this.defValue;
    }

    public String getKey() {
        return this.key;
    }

    @Override // java.lang.Enum
    public String toString() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return super.toString();
    }

    ConstantIntType(String str) {
        this.name = null;
        this.count = 0;
        this.key = null;
        this.defValue = 0;
    }
}

}
