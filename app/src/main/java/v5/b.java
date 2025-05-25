package v5;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CodelessManager.kt */
/* loaded from: classes.dex */
public final class b {
    public static SensorManager c;

    /* renamed from: d  reason: collision with root package name */
    public static f f30653d;

    /* renamed from: e  reason: collision with root package name */
    public static String f30654e;

    /* renamed from: h  reason: collision with root package name */
    public static volatile boolean f30657h;

    /* renamed from: a  reason: collision with root package name */
    public static final b f30651a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final g f30652b = new g();

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicBoolean f30655f = new AtomicBoolean(true);

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicBoolean f30656g = new AtomicBoolean(false);

    public static final String a() {
        if (k6.a.b(b.class)) {
            return null;
        }
        try {
            if (f30654e == null) {
                f30654e = UUID.randomUUID().toString();
            }
            String str = f30654e;
            kotlin.jvm.internal.g.c(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        } catch (Throwable th2) {
            k6.a.a(b.class, th2);
            return null;
        }
    }
}
