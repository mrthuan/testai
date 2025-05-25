package n2;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import n2.k;

/* compiled from: ApiFeature.java */
/* loaded from: classes.dex */
public abstract class a implements n2.d {
    public static final HashSet c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final String f22318a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22319b;

    /* compiled from: ApiFeature.java */
    /* renamed from: n2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0299a {

        /* renamed from: a  reason: collision with root package name */
        public static final HashSet f22320a = new HashSet(Arrays.asList(k.a.f22330a.d()));
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // n2.a
        public final boolean c() {
            return true;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class c extends a {
        @Override // n2.a
        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 24) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class d extends a {
        @Override // n2.a
        public final boolean c() {
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class e extends a {
        @Override // n2.a
        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 26) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class f extends a {
        @Override // n2.a
        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 27) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class g extends a {
        public g() {
            super("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        }

        @Override // n2.a
        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 28) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class h extends a {
        @Override // n2.a
        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    /* loaded from: classes.dex */
    public static class i extends a {
        public i() {
            super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        }

        @Override // n2.a
        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 33) {
                return true;
            }
            return false;
        }
    }

    public a(String str, String str2) {
        this.f22318a = str;
        this.f22319b = str2;
        c.add(this);
    }

    @Override // n2.d
    public final boolean a() {
        if (!c() && !d()) {
            return false;
        }
        return true;
    }

    @Override // n2.d
    public final String b() {
        return this.f22318a;
    }

    public abstract boolean c();

    public boolean d() {
        boolean z10;
        HashSet hashSet = C0299a.f22320a;
        String str = this.f22319b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (hashSet.contains(str + ":dev")) {
                return true;
            }
        }
        return false;
    }
}
