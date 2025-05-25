package q9;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final String f29138a;

    public y(String str) {
        this.f29138a = androidx.activity.f.k("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = a0.a.j(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return androidx.activity.f.m(str, " : ", str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            f(this.f29138a, str, objArr);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            f(this.f29138a, str, objArr);
        }
    }

    public final void c(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            f(this.f29138a, str, objArr);
        }
    }

    public final void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            f(this.f29138a, str, objArr);
        }
    }

    public final void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            f(this.f29138a, str, objArr);
        }
    }
}
