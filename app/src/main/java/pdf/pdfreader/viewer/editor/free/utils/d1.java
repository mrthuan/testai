package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: SharePreferenceUtils.java */
/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: b  reason: collision with root package name */
    public static d1 f28618b;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f28619a;

    public d1(Context context) {
        if (this.f28619a == null) {
            this.f28619a = context.getSharedPreferences("user_public_name", 0);
        }
    }

    public static d1 b(Context context) {
        if (f28618b == null) {
            f28618b = new d1(context);
        }
        return f28618b;
    }

    public final boolean a(String str, boolean z10) {
        SharedPreferences sharedPreferences = this.f28619a;
        if (sharedPreferences == null) {
            return z10;
        }
        return sharedPreferences.getBoolean(str, z10);
    }

    public final void c(String str, boolean z10) {
        SharedPreferences sharedPreferences = this.f28619a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(str, z10).apply();
        }
    }
}
