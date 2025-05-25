package w6;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry.java */
/* loaded from: classes.dex */
public final class h implements d {

    /* renamed from: a  reason: collision with root package name */
    public final a f30986a;

    /* renamed from: b  reason: collision with root package name */
    public final g f30987b;
    public final HashMap c;

    /* compiled from: MetadataBackendRegistry.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f30988a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f30989b = null;

        public a(Context context) {
            this.f30988a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final w6.c a(java.lang.String r14) {
            /*
                r13 = this;
                java.lang.String r0 = "Could not instantiate %s"
                java.lang.String r1 = "Could not instantiate %s."
                java.util.Map<java.lang.String, java.lang.String> r2 = r13.f30989b
                r3 = 0
                r4 = 0
                if (r2 != 0) goto L80
                android.content.Context r2 = r13.f30988a
                android.content.pm.PackageManager r5 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
                if (r5 != 0) goto L13
                goto L26
            L13:
                android.content.ComponentName r6 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
                java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r7 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
                r6.<init>(r2, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
                r2 = 128(0x80, float:1.8E-43)
                android.content.pm.ServiceInfo r2 = r5.getServiceInfo(r6, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
                if (r2 != 0) goto L23
                goto L26
            L23:
                android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
                goto L27
            L26:
                r2 = r3
            L27:
                if (r2 != 0) goto L2e
                java.util.Map r2 = java.util.Collections.emptyMap()
                goto L7e
            L2e:
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.util.Set r6 = r2.keySet()
                java.util.Iterator r6 = r6.iterator()
            L3b:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L7d
                java.lang.Object r7 = r6.next()
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r2.get(r7)
                boolean r9 = r8 instanceof java.lang.String
                if (r9 == 0) goto L3b
                java.lang.String r9 = "backend:"
                boolean r9 = r7.startsWith(r9)
                if (r9 == 0) goto L3b
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r9 = ","
                r10 = -1
                java.lang.String[] r8 = r8.split(r9, r10)
                int r9 = r8.length
                r10 = r4
            L62:
                if (r10 >= r9) goto L3b
                r11 = r8[r10]
                java.lang.String r11 = r11.trim()
                boolean r12 = r11.isEmpty()
                if (r12 == 0) goto L71
                goto L7a
            L71:
                r12 = 8
                java.lang.String r12 = r7.substring(r12)
                r5.put(r11, r12)
            L7a:
                int r10 = r10 + 1
                goto L62
            L7d:
                r2 = r5
            L7e:
                r13.f30989b = r2
            L80:
                java.util.Map<java.lang.String, java.lang.String> r2 = r13.f30989b
                java.lang.Object r14 = r2.get(r14)
                java.lang.String r14 = (java.lang.String) r14
                if (r14 != 0) goto L8b
                return r3
            L8b:
                r2 = 1
                java.lang.Class r5 = java.lang.Class.forName(r14)     // Catch: java.lang.reflect.InvocationTargetException -> La5 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb5 java.lang.IllegalAccessException -> Lbd java.lang.ClassNotFoundException -> Lc5
                java.lang.Class<w6.c> r6 = w6.c.class
                java.lang.Class r5 = r5.asSubclass(r6)     // Catch: java.lang.reflect.InvocationTargetException -> La5 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb5 java.lang.IllegalAccessException -> Lbd java.lang.ClassNotFoundException -> Lc5
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> La5 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb5 java.lang.IllegalAccessException -> Lbd java.lang.ClassNotFoundException -> Lc5
                java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r6)     // Catch: java.lang.reflect.InvocationTargetException -> La5 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb5 java.lang.IllegalAccessException -> Lbd java.lang.ClassNotFoundException -> Lc5
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> La5 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb5 java.lang.IllegalAccessException -> Lbd java.lang.ClassNotFoundException -> Lc5
                java.lang.Object r5 = r5.newInstance(r6)     // Catch: java.lang.reflect.InvocationTargetException -> La5 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb5 java.lang.IllegalAccessException -> Lbd java.lang.ClassNotFoundException -> Lc5
                w6.c r5 = (w6.c) r5     // Catch: java.lang.reflect.InvocationTargetException -> La5 java.lang.NoSuchMethodException -> Lad java.lang.InstantiationException -> Lb5 java.lang.IllegalAccessException -> Lbd java.lang.ClassNotFoundException -> Lc5
                return r5
            La5:
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r4] = r14
                java.lang.String.format(r0, r1)
                goto Lce
            Lad:
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r4] = r14
                java.lang.String.format(r0, r1)
                goto Lce
            Lb5:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r4] = r14
                java.lang.String.format(r1, r0)
                goto Lce
            Lbd:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r4] = r14
                java.lang.String.format(r1, r0)
                goto Lce
            Lc5:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r4] = r14
                java.lang.String r14 = "Class %s is not found."
                java.lang.String.format(r14, r0)
            Lce:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: w6.h.a.a(java.lang.String):w6.c");
        }
    }

    public h(Context context, g gVar) {
        a aVar = new a(context);
        this.c = new HashMap();
        this.f30986a = aVar;
        this.f30987b = gVar;
    }

    @Override // w6.d
    public final synchronized i get(String str) {
        if (this.c.containsKey(str)) {
            return (i) this.c.get(str);
        }
        c a10 = this.f30986a.a(str);
        if (a10 == null) {
            return null;
        }
        g gVar = this.f30987b;
        i create = a10.create(new b(gVar.f30984a, gVar.f30985b, gVar.c, str));
        this.c.put(str, create);
        return create;
    }
}
