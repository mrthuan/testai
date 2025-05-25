package wk;

import a8.r0;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;
import wk.l;

/* compiled from: EventBus.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: q  reason: collision with root package name */
    public static volatile b f31304q;

    /* renamed from: r  reason: collision with root package name */
    public static final wk.c f31305r = new wk.c();

    /* renamed from: s  reason: collision with root package name */
    public static final HashMap f31306s = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f31307a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f31308b;
    public final ConcurrentHashMap c;

    /* renamed from: d  reason: collision with root package name */
    public final a f31309d = new a();

    /* renamed from: e  reason: collision with root package name */
    public final f f31310e;

    /* renamed from: f  reason: collision with root package name */
    public final d f31311f;

    /* renamed from: g  reason: collision with root package name */
    public final wk.a f31312g;

    /* renamed from: h  reason: collision with root package name */
    public final r0 f31313h;

    /* renamed from: i  reason: collision with root package name */
    public final l f31314i;

    /* renamed from: j  reason: collision with root package name */
    public final ExecutorService f31315j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f31316k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f31317l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f31318m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f31319n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f31320o;

    /* renamed from: p  reason: collision with root package name */
    public final e f31321p;

    /* compiled from: EventBus.java */
    /* loaded from: classes3.dex */
    public class a extends ThreadLocal<c> {
        @Override // java.lang.ThreadLocal
        public final c initialValue() {
            return new c();
        }
    }

    /* compiled from: EventBus.java */
    /* renamed from: wk.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C0398b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31322a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f31322a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31322a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31322a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31322a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31322a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: EventBus.java */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f31323a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public boolean f31324b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public Object f31325d;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b() {
        /*
            r4 = this;
            r4.<init>()
            wk.b$a r0 = new wk.b$a
            r0.<init>()
            r4.f31309d = r0
            wk.c r0 = wk.b.f31305r
            r0.getClass()
            boolean r1 = wk.e.a.f31331a
            r2 = 0
            if (r1 == 0) goto L22
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L19
            goto L1a
        L19:
            r3 = r2
        L1a:
            if (r3 == 0) goto L22
            wk.e$a r3 = new wk.e$a
            r3.<init>()
            goto L27
        L22:
            wk.e$b r3 = new wk.e$b
            r3.<init>()
        L27:
            r4.f31321p = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4.f31307a = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4.f31308b = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r4.c = r3
            if (r1 == 0) goto L4f
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L45
            goto L46
        L45:
            r1 = r2
        L46:
            if (r1 != 0) goto L49
            goto L4f
        L49:
            wk.f r3 = new wk.f
            r3.<init>(r1)
            goto L50
        L4f:
            r3 = r2
        L50:
            r4.f31310e = r3
            if (r3 == 0) goto L5b
            wk.d r2 = new wk.d
            android.os.Looper r1 = r3.f31332a
            r2.<init>(r4, r1)
        L5b:
            r4.f31311f = r2
            wk.a r1 = new wk.a
            r1.<init>(r4)
            r4.f31312g = r1
            a8.r0 r1 = new a8.r0
            r1.<init>(r4)
            r4.f31313h = r1
            wk.l r1 = new wk.l
            r1.<init>()
            r4.f31314i = r1
            r1 = 1
            r4.f31316k = r1
            r4.f31317l = r1
            r4.f31318m = r1
            r4.f31319n = r1
            r4.f31320o = r1
            java.util.concurrent.ExecutorService r0 = r0.f31327a
            r4.f31315j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wk.b.<init>():void");
    }

    public static void a(ArrayList arrayList, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                a(arrayList, cls.getInterfaces());
            }
        }
    }

    public static b b() {
        if (f31304q == null) {
            synchronized (b.class) {
                if (f31304q == null) {
                    f31304q = new b();
                }
            }
        }
        return f31304q;
    }

    public final void c(Object obj, m mVar) {
        try {
            mVar.f31353b.f31340a.invoke(mVar.f31352a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            boolean z10 = obj instanceof j;
            boolean z11 = this.f31316k;
            e eVar = this.f31321p;
            if (z10) {
                if (z11) {
                    Level level = Level.SEVERE;
                    eVar.b(level, "SubscriberExceptionEvent subscriber " + mVar.f31352a.getClass() + " threw an exception", cause);
                    j jVar = (j) obj;
                    eVar.b(level, "Initial event " + jVar.f31339b + " caused exception in " + jVar.c, jVar.f31338a);
                    return;
                }
                return;
            }
            if (z11) {
                Level level2 = Level.SEVERE;
                eVar.b(level2, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + mVar.f31352a.getClass(), cause);
            }
            if (this.f31318m) {
                e(new j(cause, obj, mVar.f31352a));
            }
        }
    }

    public final void d(h hVar) {
        Object obj = hVar.f31336a;
        m mVar = hVar.f31337b;
        hVar.f31336a = null;
        hVar.f31337b = null;
        hVar.c = null;
        ArrayList arrayList = h.f31335d;
        synchronized (arrayList) {
            if (arrayList.size() < 10000) {
                arrayList.add(hVar);
            }
        }
        if (mVar.c) {
            c(obj, mVar);
        }
    }

    public final void e(Object obj) {
        boolean z10;
        c cVar = this.f31309d.get();
        ArrayList arrayList = cVar.f31323a;
        arrayList.add(obj);
        if (!cVar.f31324b) {
            f fVar = this.f31310e;
            if (fVar != null && fVar.f31332a != Looper.myLooper()) {
                z10 = false;
            } else {
                z10 = true;
            }
            cVar.c = z10;
            cVar.f31324b = true;
            while (!arrayList.isEmpty()) {
                try {
                    f(arrayList.remove(0), cVar);
                } finally {
                    cVar.f31324b = false;
                    cVar.c = false;
                }
            }
        }
    }

    public final void f(Object obj, c cVar) {
        boolean g10;
        ArrayList arrayList;
        Class<?> cls = obj.getClass();
        if (this.f31320o) {
            HashMap hashMap = f31306s;
            synchronized (hashMap) {
                try {
                    List list = (List) hashMap.get(cls);
                    arrayList = list;
                    if (list == null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                            arrayList2.add(cls2);
                            a(arrayList2, cls2.getInterfaces());
                        }
                        f31306s.put(cls, arrayList2);
                        arrayList = arrayList2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int size = arrayList.size();
            g10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                g10 |= g(obj, cVar, (Class) arrayList.get(i10));
            }
        } else {
            g10 = g(obj, cVar, cls);
        }
        if (!g10) {
            if (this.f31317l) {
                this.f31321p.a(Level.FINE, "No subscribers registered for event " + cls);
            }
            if (this.f31319n && cls != g.class && cls != j.class) {
                e(new g(this, obj));
            }
        }
    }

    public final boolean g(Object obj, c cVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f31307a.get(cls);
        }
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                cVar.f31325d = obj;
                h((m) it.next(), obj, cVar.c);
            }
            return true;
        }
        return false;
    }

    public final void h(m mVar, Object obj, boolean z10) {
        int i10 = C0398b.f31322a[mVar.f31353b.f31341b.ordinal()];
        if (i10 != 1) {
            d dVar = this.f31311f;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            r0 r0Var = this.f31313h;
                            r0Var.getClass();
                            ((a2.a) r0Var.f312b).f(h.a(obj, mVar));
                            ((b) r0Var.c).f31315j.execute(r0Var);
                            return;
                        }
                        throw new IllegalStateException("Unknown thread mode: " + mVar.f31353b.f31341b);
                    } else if (z10) {
                        wk.a aVar = this.f31312g;
                        aVar.getClass();
                        h a10 = h.a(obj, mVar);
                        synchronized (aVar) {
                            aVar.f31302a.f(a10);
                            if (!aVar.c) {
                                aVar.c = true;
                                aVar.f31303b.f31315j.execute(aVar);
                            }
                        }
                        return;
                    } else {
                        c(obj, mVar);
                        return;
                    }
                } else if (dVar != null) {
                    dVar.a(obj, mVar);
                    return;
                } else {
                    c(obj, mVar);
                    return;
                }
            } else if (z10) {
                c(obj, mVar);
                return;
            } else {
                dVar.a(obj, mVar);
                return;
            }
        }
        c(obj, mVar);
    }

    public final void i(Object obj) {
        Method[] methods;
        i iVar;
        boolean a10;
        Class<?> cls = obj.getClass();
        this.f31314i.getClass();
        ConcurrentHashMap concurrentHashMap = l.f31345a;
        List list = (List) concurrentHashMap.get(cls);
        List<k> list2 = list;
        if (list == null) {
            l.a b10 = l.b();
            b10.f31350e = cls;
            int i10 = 0;
            b10.f31351f = false;
            while (true) {
                Class<?> cls2 = b10.f31350e;
                if (cls2 != null) {
                    try {
                        methods = cls2.getDeclaredMethods();
                    } catch (Throwable unused) {
                        methods = b10.f31350e.getMethods();
                        b10.f31351f = true;
                    }
                    int length = methods.length;
                    int i11 = i10;
                    while (i11 < length) {
                        Method method = methods[i11];
                        int modifiers = method.getModifiers();
                        if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes.length == 1 && (iVar = (i) method.getAnnotation(i.class)) != null) {
                                Class<?> cls3 = parameterTypes[i10];
                                HashMap hashMap = b10.f31348b;
                                Object put = hashMap.put(cls3, method);
                                if (put == null) {
                                    a10 = true;
                                } else {
                                    if (put instanceof Method) {
                                        if (b10.a((Method) put, cls3)) {
                                            hashMap.put(cls3, b10);
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    a10 = b10.a(method, cls3);
                                }
                                if (a10) {
                                    b10.f31347a.add(new k(method, cls3, iVar.threadMode(), iVar.priority(), iVar.sticky()));
                                }
                            }
                        }
                        i11++;
                        i10 = 0;
                    }
                    if (b10.f31351f) {
                        b10.f31350e = null;
                    } else {
                        Class<? super Object> superclass = b10.f31350e.getSuperclass();
                        b10.f31350e = superclass;
                        String name = superclass.getName();
                        if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                            b10.f31350e = null;
                        }
                    }
                    i10 = 0;
                } else {
                    ArrayList a11 = l.a(b10);
                    if (!a11.isEmpty()) {
                        concurrentHashMap.put(cls, a11);
                        list2 = a11;
                    } else {
                        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
                    }
                }
            }
        }
        synchronized (this) {
            for (k kVar : list2) {
                j(obj, kVar);
            }
        }
    }

    public final void j(Object obj, k kVar) {
        Object value;
        boolean z10;
        Class<?> cls = kVar.c;
        m mVar = new m(obj, kVar);
        HashMap hashMap = this.f31307a;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) hashMap.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            hashMap.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(mVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 <= size; i10++) {
            if (i10 != size) {
                if (kVar.f31342d <= ((m) copyOnWriteArrayList.get(i10)).f31353b.f31342d) {
                }
            }
            copyOnWriteArrayList.add(i10, mVar);
            break;
        }
        HashMap hashMap2 = this.f31308b;
        List list = (List) hashMap2.get(obj);
        if (list == null) {
            list = new ArrayList();
            hashMap2.put(obj, list);
        }
        list.add(cls);
        if (kVar.f31343e) {
            ConcurrentHashMap concurrentHashMap = this.c;
            f fVar = this.f31310e;
            if (this.f31320o) {
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (cls.isAssignableFrom((Class) entry.getKey()) && (value = entry.getValue()) != null) {
                        if (fVar != null && fVar.f31332a != Looper.myLooper()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        h(mVar, value, z10);
                    }
                }
                return;
            }
            Object obj2 = concurrentHashMap.get(cls);
            if (obj2 != null) {
                h(mVar, obj2, (fVar == null || fVar.f31332a == Looper.myLooper()) ? true : true);
            }
        }
    }

    public final synchronized void k(Object obj) {
        List<Class> list = (List) this.f31308b.get(obj);
        if (list != null) {
            for (Class cls : list) {
                List list2 = (List) this.f31307a.get(cls);
                if (list2 != null) {
                    int size = list2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        m mVar = (m) list2.get(i10);
                        if (mVar.f31352a == obj) {
                            mVar.c = false;
                            list2.remove(i10);
                            i10--;
                            size--;
                        }
                        i10++;
                    }
                }
            }
            this.f31308b.remove(obj);
        } else {
            this.f31321p.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public final String toString() {
        return "EventBus[indexCount=0, eventInheritance=" + this.f31320o + "]";
    }
}
