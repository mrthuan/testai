package wk;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SubscriberMethodFinder.java */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap f31345a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final a[] f31346b = new a[4];

    /* compiled from: SubscriberMethodFinder.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f31347a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f31348b = new HashMap();
        public final HashMap c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        public final StringBuilder f31349d = new StringBuilder(128);

        /* renamed from: e  reason: collision with root package name */
        public Class<?> f31350e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f31351f;

        public final boolean a(Method method, Class<?> cls) {
            StringBuilder sb2 = this.f31349d;
            sb2.setLength(0);
            sb2.append(method.getName());
            sb2.append('>');
            sb2.append(cls.getName());
            String sb3 = sb2.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            HashMap hashMap = this.c;
            Class cls2 = (Class) hashMap.put(sb3, declaringClass);
            if (cls2 != null && !cls2.isAssignableFrom(declaringClass)) {
                hashMap.put(sb3, cls2);
                return false;
            }
            return true;
        }
    }

    public static ArrayList a(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f31347a);
        aVar.f31347a.clear();
        aVar.f31348b.clear();
        aVar.c.clear();
        int i10 = 0;
        aVar.f31349d.setLength(0);
        aVar.f31350e = null;
        aVar.f31351f = false;
        synchronized (f31346b) {
            while (true) {
                if (i10 >= 4) {
                    break;
                }
                a[] aVarArr = f31346b;
                if (aVarArr[i10] == null) {
                    aVarArr[i10] = aVar;
                    break;
                }
                i10++;
            }
        }
        return arrayList;
    }

    public static a b() {
        synchronized (f31346b) {
            for (int i10 = 0; i10 < 4; i10++) {
                a[] aVarArr = f31346b;
                a aVar = aVarArr[i10];
                if (aVar != null) {
                    aVarArr[i10] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }
}
