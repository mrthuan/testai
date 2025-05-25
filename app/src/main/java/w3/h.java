package w3;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* loaded from: classes.dex */
public final class h implements w3.b {

    /* renamed from: a  reason: collision with root package name */
    public final f<a, Object> f30948a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f30949b = new b();
    public final HashMap c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f30950d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f30951e;

    /* renamed from: f  reason: collision with root package name */
    public int f30952f;

    /* compiled from: LruArrayPool.java */
    /* loaded from: classes.dex */
    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final b f30953a;

        /* renamed from: b  reason: collision with root package name */
        public int f30954b;
        public Class<?> c;

        public a(b bVar) {
            this.f30953a = bVar;
        }

        @Override // w3.k
        public final void a() {
            this.f30953a.d(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f30954b != aVar.f30954b || this.c != aVar.c) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i10;
            int i11 = this.f30954b * 31;
            Class<?> cls = this.c;
            if (cls != null) {
                i10 = cls.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }

        public final String toString() {
            return "Key{size=" + this.f30954b + "array=" + this.c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    /* loaded from: classes.dex */
    public static final class b extends g1.c {
        public b() {
            super(1);
        }

        @Override // g1.c
        public final k a() {
            return new a(this);
        }
    }

    public h(int i10) {
        this.f30951e = i10;
    }

    @Override // w3.b
    public final synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                f(this.f30951e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // w3.b
    public final synchronized void b() {
        f(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w3.b
    public final synchronized <T> T c(int i10, Class<T> cls) {
        a aVar;
        boolean z10;
        Integer ceilingKey = i(cls).ceilingKey(Integer.valueOf(i10));
        boolean z11 = false;
        if (ceilingKey != null) {
            int i11 = this.f30952f;
            if (i11 != 0 && this.f30951e / i11 < 2) {
                z10 = false;
                if (!z10 || ceilingKey.intValue() <= i10 * 8) {
                    z11 = true;
                }
            }
            z10 = true;
            if (!z10) {
            }
            z11 = true;
        }
        if (z11) {
            b bVar = this.f30949b;
            int intValue = ceilingKey.intValue();
            aVar = (a) bVar.b();
            aVar.f30954b = intValue;
            aVar.c = cls;
        } else {
            a aVar2 = (a) this.f30949b.b();
            aVar2.f30954b = i10;
            aVar2.c = cls;
            aVar = aVar2;
        }
        return (T) h(aVar, cls);
    }

    @Override // w3.b
    public final synchronized Object d() {
        a aVar;
        aVar = (a) this.f30949b.b();
        aVar.f30954b = 8;
        aVar.c = byte[].class;
        return h(aVar, byte[].class);
    }

    public final void e(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> i11 = i(cls);
        Integer num = i11.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                i11.remove(Integer.valueOf(i10));
                return;
            } else {
                i11.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void f(int i10) {
        while (this.f30952f > i10) {
            Object c = this.f30948a.c();
            com.google.android.play.core.assetpacks.c.l(c);
            w3.a g10 = g(c.getClass());
            this.f30952f -= g10.a() * g10.c(c);
            e(g10.c(c), c.getClass());
            if (Log.isLoggable(g10.b(), 2)) {
                g10.b();
                g10.c(c);
            }
        }
    }

    public final <T> w3.a<T> g(Class<T> cls) {
        HashMap hashMap = this.f30950d;
        w3.a<T> aVar = (w3.a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new g();
            } else if (cls.equals(byte[].class)) {
                aVar = new e();
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        w3.a<T> g10 = g(cls);
        T t4 = (T) this.f30948a.a(aVar);
        if (t4 != null) {
            this.f30952f -= g10.a() * g10.c(t4);
            e(g10.c(t4), cls);
        }
        if (t4 == null) {
            if (Log.isLoggable(g10.b(), 2)) {
                g10.b();
            }
            return g10.newArray(aVar.f30954b);
        }
        return t4;
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap hashMap = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // w3.b
    public final synchronized <T> void put(T t4) {
        boolean z10;
        Class<?> cls = t4.getClass();
        w3.a<T> g10 = g(cls);
        int c = g10.c(t4);
        int a10 = g10.a() * c;
        int i10 = 1;
        if (a10 <= this.f30951e / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        a aVar = (a) this.f30949b.b();
        aVar.f30954b = c;
        aVar.c = cls;
        this.f30948a.b(aVar, t4);
        NavigableMap<Integer, Integer> i11 = i(cls);
        Integer num = i11.get(Integer.valueOf(aVar.f30954b));
        Integer valueOf = Integer.valueOf(aVar.f30954b);
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        i11.put(valueOf, Integer.valueOf(i10));
        this.f30952f += a10;
        f(this.f30951e);
    }
}
