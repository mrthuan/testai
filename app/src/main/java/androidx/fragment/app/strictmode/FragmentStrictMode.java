package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.jvm.internal.g;

/* compiled from: FragmentStrictMode.kt */
/* loaded from: classes.dex */
public final class FragmentStrictMode {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3929a = a.c;

    /* compiled from: FragmentStrictMode.kt */
    /* loaded from: classes.dex */
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a c = new a(EmptySet.INSTANCE, q.y0());

        /* renamed from: a  reason: collision with root package name */
        public final Set<Flag> f3931a;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedHashMap f3932b;

        public a(EmptySet flags, Map map) {
            g.e(flags, "flags");
            this.f3931a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f3932b = linkedHashMap;
        }
    }

    public static a a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.D()) {
                fragment.u();
            }
            fragment = fragment.f3689v;
        }
        return f3929a;
    }

    public static void b(a aVar, Violation violation) {
        Fragment fragment = violation.getFragment();
        String name = fragment.getClass().getName();
        Flag flag = Flag.PENALTY_LOG;
        Set<Flag> set = aVar.f3931a;
        set.contains(flag);
        if (set.contains(Flag.PENALTY_DEATH)) {
            l1.a aVar2 = new l1.a(0, name, violation);
            if (fragment.D()) {
                Handler handler = fragment.u().f3794t.f3963f;
                g.d(handler, "fragment.parentFragmentManager.host.handler");
                if (g.a(handler.getLooper(), Looper.myLooper())) {
                    aVar2.run();
                    return;
                } else {
                    handler.post(aVar2);
                    return;
                }
            }
            aVar2.run();
        }
    }

    public static void c(Violation violation) {
        if (g0.J(3)) {
            violation.getFragment().getClass();
        }
    }

    public static final void d(Fragment fragment, String previousFragmentId) {
        g.e(fragment, "fragment");
        g.e(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        c(fragmentReuseViolation);
        a a10 = a(fragment);
        if (a10.f3931a.contains(Flag.DETECT_FRAGMENT_REUSE) && e(a10, fragment.getClass(), FragmentReuseViolation.class)) {
            b(a10, fragmentReuseViolation);
        }
    }

    public static boolean e(a aVar, Class cls, Class cls2) {
        Set set = (Set) aVar.f3932b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!g.a(cls2.getSuperclass(), Violation.class) && m.o0(set, cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
