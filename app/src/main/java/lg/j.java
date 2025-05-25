package lg;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.s;

/* compiled from: Tasks.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final String f20589a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f20590b;
    public static final int c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f20591d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f20592e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f20593f;

    /* renamed from: g  reason: collision with root package name */
    public static final h f20594g;

    /* renamed from: h  reason: collision with root package name */
    public static final h f20595h;

    static {
        String str;
        int i10 = s.f20199a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f20589a = str;
        f20590b = b.b.b0("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = s.f20199a;
        if (i11 < 2) {
            i11 = 2;
        }
        c = b.b.c0("kotlinx.coroutines.scheduler.core.pool.size", i11, 1, 0, 8);
        f20591d = b.b.c0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f20592e = TimeUnit.SECONDS.toNanos(b.b.b0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f20593f = d.f20585a;
        f20594g = new h(0);
        f20595h = new h(1);
    }
}
