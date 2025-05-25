package e2;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f16334a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f16335b;
    public static Method c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f16336d;

    public static void a(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean b() {
        boolean isEnabled;
        try {
            if (f16335b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f16335b == null) {
                f16334a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f16335b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f16335b.invoke(null, Long.valueOf(f16334a))).booleanValue();
        } catch (Exception e10) {
            a(e10);
            return false;
        }
    }
}
