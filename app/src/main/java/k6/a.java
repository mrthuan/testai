package k6;

import com.facebook.d;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.n;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.g;

/* compiled from: CrashShieldHandler.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Object> f19602a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public static boolean f19603b;

    public static final void a(Object o10, Throwable th2) {
        g.e(o10, "o");
        if (!f19603b) {
            return;
        }
        f19602a.add(o10);
        d dVar = d.f9685a;
        if (n.c()) {
            h6.a.a(th2);
            InstrumentData.Type t4 = InstrumentData.Type.CrashShield;
            g.e(t4, "t");
            new InstrumentData(th2, t4).c();
        }
    }

    public static final boolean b(Object o10) {
        g.e(o10, "o");
        return f19602a.contains(o10);
    }
}
