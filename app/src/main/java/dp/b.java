package dp;

import android.os.Looper;
import java.lang.Thread;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: ReaderUCEHandler.kt */
/* loaded from: classes3.dex */
public final class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final long f16312a = Looper.getMainLooper().getThread().getId();

    /* renamed from: b  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f16313b = Thread.getDefaultUncaughtExceptionHandler();

    public b() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t4, Throwable e10) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        boolean z10;
        boolean z11;
        g.e(t4, "t");
        g.e(e10, "e");
        t1.c(t4.getName(), e10);
        boolean z12 = false;
        if (t4.getId() != this.f16312a) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            g.d(stackTrace, "e.stackTrace");
            if (stackTrace.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                String stackTraceElement = e10.getStackTrace()[0].toString();
                g.d(stackTraceElement, "e.stackTrace[0].toString()");
                if (k.O(stackTraceElement, "com.google.android.gms", false)) {
                    String message = e10.getMessage();
                    if (message != null && k.O(message, "Results have already been set", false)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        t1.c(t4.getName(), e10);
                        z12 = true;
                    }
                }
            }
        }
        if (!z12 && (uncaughtExceptionHandler = this.f16313b) != null) {
            uncaughtExceptionHandler.uncaughtException(t4, e10);
        }
    }
}
