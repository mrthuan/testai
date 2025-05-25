package w3;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy.java */
/* loaded from: classes.dex */
public final class l implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f30960d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f30961e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f30962f;

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f30963g;

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f30964h;

    /* renamed from: a  reason: collision with root package name */
    public final c f30965a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final f<b, Bitmap> f30966b = new f<>();
    public final HashMap c = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30967a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f30967a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30967a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30967a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30967a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public final c f30968a;

        /* renamed from: b  reason: collision with root package name */
        public int f30969b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.f30968a = cVar;
        }

        @Override // w3.k
        public final void a() {
            this.f30968a.d(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f30969b != bVar.f30969b || !p4.j.a(this.c, bVar.c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i10;
            int i11 = this.f30969b * 31;
            Bitmap.Config config = this.c;
            if (config != null) {
                i10 = config.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }

        public final String toString() {
            return l.c(this.f30969b, this.c);
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static class c extends g1.c {
        public c() {
            super(1);
        }

        @Override // g1.c
        public final k a() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            config = Bitmap.Config.RGBA_F16;
            configArr[configArr.length - 1] = config;
        }
        f30960d = configArr;
        f30961e = configArr;
        f30962f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f30963g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f30964h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num2 = d10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d10.remove(num);
                return;
            } else {
                d10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[EDGE_INSN: B:40:0x008c->B:35:0x008c ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            int r0 = p4.j.b(r11, r12, r13)
            w3.l$c r1 = r10.f30965a
            w3.k r2 = r1.b()
            w3.l$b r2 = (w3.l.b) r2
            r2.f30969b = r0
            r2.c = r13
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            r5 = 0
            if (r3 < r4) goto L24
            android.graphics.Bitmap$Config r3 = bb.j.i()
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L24
            android.graphics.Bitmap$Config[] r3 = w3.l.f30961e
            goto L48
        L24:
            int[] r3 = w3.l.a.f30967a
            int r4 = r13.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L46
            r6 = 2
            if (r3 == r6) goto L43
            r6 = 3
            if (r3 == r6) goto L40
            r6 = 4
            if (r3 == r6) goto L3d
            android.graphics.Bitmap$Config[] r3 = new android.graphics.Bitmap.Config[r4]
            r3[r5] = r13
            goto L48
        L3d:
            android.graphics.Bitmap$Config[] r3 = w3.l.f30964h
            goto L48
        L40:
            android.graphics.Bitmap$Config[] r3 = w3.l.f30963g
            goto L48
        L43:
            android.graphics.Bitmap$Config[] r3 = w3.l.f30962f
            goto L48
        L46:
            android.graphics.Bitmap$Config[] r3 = w3.l.f30960d
        L48:
            int r4 = r3.length
        L49:
            if (r5 >= r4) goto L8c
            r6 = r3[r5]
            java.util.NavigableMap r7 = r10.d(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Object r7 = r7.ceilingKey(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L89
            int r8 = r7.intValue()
            int r9 = r0 * 8
            if (r8 > r9) goto L89
            int r3 = r7.intValue()
            if (r3 != r0) goto L76
            if (r6 != 0) goto L70
            if (r13 == 0) goto L8c
            goto L76
        L70:
            boolean r0 = r6.equals(r13)
            if (r0 != 0) goto L8c
        L76:
            r1.d(r2)
            int r0 = r7.intValue()
            w3.k r1 = r1.b()
            r2 = r1
            w3.l$b r2 = (w3.l.b) r2
            r2.f30969b = r0
            r2.c = r6
            goto L8c
        L89:
            int r5 = r5 + 1
            goto L49
        L8c:
            w3.f<w3.l$b, android.graphics.Bitmap> r0 = r10.f30966b
            java.lang.Object r0 = r0.a(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto La2
            int r1 = r2.f30969b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.a(r1, r0)
            r0.reconfigure(r11, r12, r13)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.l.b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap hashMap = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final String e(Bitmap bitmap) {
        return c(p4.j.c(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        int c10 = p4.j.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        b bVar = (b) this.f30965a.b();
        bVar.f30969b = c10;
        bVar.c = config;
        this.f30966b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num = d10.get(Integer.valueOf(bVar.f30969b));
        Integer valueOf = Integer.valueOf(bVar.f30969b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        d10.put(valueOf, Integer.valueOf(i10));
    }

    public final String toString() {
        StringBuilder k10 = a0.a.k("SizeConfigStrategy{groupedMap=");
        k10.append(this.f30966b);
        k10.append(", sortedSizes=(");
        HashMap hashMap = this.c;
        for (Map.Entry entry : hashMap.entrySet()) {
            k10.append(entry.getKey());
            k10.append('[');
            k10.append(entry.getValue());
            k10.append("], ");
        }
        if (!hashMap.isEmpty()) {
            k10.replace(k10.length() - 2, k10.length(), "");
        }
        k10.append(")}");
        return k10.toString();
    }
}
