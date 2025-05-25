package dp;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import pdf.pdfreader.viewer.editor.free.utils.d0;
import pdf.pdfreader.viewer.editor.free.utils.g0;

/* compiled from: CrashlyticsUtils.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f16311a;

    static {
        ea.a.p("cHIqcxtsG3QbY0dVHWk6cw==", "4IsPaFwD");
    }

    public static a a() {
        if (f16311a == null) {
            f16311a = new a();
        }
        return f16311a;
    }

    public static void b(Context context, String str) {
        if (TextUtils.isEmpty(str) || g0.a(context)) {
            return;
        }
        try {
            FirebaseCrashlytics.getInstance().log(str);
        } catch (Exception unused) {
            int i10 = d0.f28617a;
            ea.a.p("I29WRQFjUnAuaSVuTyA=", "1dz1nGIW");
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            FirebaseCrashlytics.getInstance().log(str);
        } catch (Exception unused) {
            int i10 = d0.f28617a;
            ea.a.p("I29WRQFjUnAuaSVuTyA=", "1dz1nGIW");
        }
    }

    public static void d(Context context, Throwable th2) {
        if (th2 == null || g0.a(context)) {
            return;
        }
        try {
            FirebaseCrashlytics.getInstance().recordException(th2);
        } catch (Exception unused) {
            int i10 = d0.f28617a;
            ea.a.p("I29WRQFjUnAuaSVuTyA=", "1dz1nGIW");
        }
    }

    public static void e(Throwable th2) {
        if (th2 == null) {
            return;
        }
        try {
            FirebaseCrashlytics.getInstance().recordException(th2);
        } catch (Exception unused) {
            int i10 = d0.f28617a;
            ea.a.p("I29WRQFjUnAuaSVuTyA=", "1dz1nGIW");
        }
    }
}
