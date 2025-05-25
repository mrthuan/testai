package e2;

import android.os.Trace;

/* compiled from: TraceApi29Impl.java */
/* loaded from: classes.dex */
public final class b {
    public static void a(int i10, String str) {
        Trace.beginAsyncSection(str, i10);
    }

    public static void b(int i10, String str) {
        Trace.endAsyncSection(str, i10);
    }
}
