package wd;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: TaiChiHelper.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f31176a;

    /* renamed from: b  reason: collision with root package name */
    public static SharedPreferences.Editor f31177b;

    public static void a(Context context, float f10) {
        kotlin.jvm.internal.g.e(context, "context");
        if (f31177b == null) {
            if (f31176a == null) {
                f31176a = context.getSharedPreferences("sp_tai_chi", 0);
            }
            SharedPreferences sharedPreferences = f31176a;
            kotlin.jvm.internal.g.b(sharedPreferences);
            f31177b = sharedPreferences.edit();
        }
        SharedPreferences.Editor editor = f31177b;
        kotlin.jvm.internal.g.b(editor);
        editor.putFloat("taichiTroasCache", f10).apply();
    }
}
