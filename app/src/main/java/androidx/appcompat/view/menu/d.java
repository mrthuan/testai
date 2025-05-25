package androidx.appcompat.view.menu;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d {
    public static int a(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static Object b(ArrayList arrayList, int i10) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static String c(String str, long j10) {
        return str + j10;
    }

    public static String d(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder e(String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static Map f(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ void g() {
    }

    public static void h(String str, String str2, SharedPreferences.Editor editor, long j10) {
        editor.putLong(ea.a.p(str, str2), j10).apply();
    }
}
