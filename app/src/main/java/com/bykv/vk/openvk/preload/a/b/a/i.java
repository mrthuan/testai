package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class i implements u {

    /* renamed from: a  reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.c f7214a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.e f7215b;
    private final com.bykv.vk.openvk.preload.a.b.d c;

    /* renamed from: d  reason: collision with root package name */
    private final d f7216d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b.b f7217e = com.bykv.vk.openvk.preload.a.b.b.b.a();

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: h  reason: collision with root package name */
        final String f7226h;

        /* renamed from: i  reason: collision with root package name */
        final boolean f7227i;

        /* renamed from: j  reason: collision with root package name */
        final boolean f7228j;

        public b(String str, boolean z10, boolean z11) {
            this.f7226h = str;
            this.f7227i = z10;
            this.f7228j = z11;
        }

        public abstract void a(com.bykv.vk.openvk.preload.a.d.a aVar, Object obj);

        public abstract void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj);

        public abstract boolean a(Object obj);
    }

    public i(com.bykv.vk.openvk.preload.a.b.c cVar, com.bykv.vk.openvk.preload.a.e eVar, com.bykv.vk.openvk.preload.a.b.d dVar, d dVar2) {
        this.f7214a = cVar;
        this.f7215b = eVar;
        this.c = dVar;
        this.f7216d = dVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.reflect.Field r9, boolean r10) {
        /*
            r8 = this;
            com.bykv.vk.openvk.preload.a.b.d r0 = r8.c
            java.lang.Class r1 = r9.getType()
            boolean r1 = r0.a(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L17
            boolean r1 = r0.a(r10)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = r2
            goto L18
        L17:
            r1 = r3
        L18:
            if (r1 != 0) goto Lb2
            int r1 = r0.c
            int r4 = r9.getModifiers()
            r1 = r1 & r4
            if (r1 == 0) goto L26
        L23:
            r9 = r3
            goto Laf
        L26:
            double r4 = r0.f7316b
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L45
            java.lang.Class<com.bykv.vk.openvk.preload.a.a.d> r1 = com.bykv.vk.openvk.preload.a.a.d.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            com.bykv.vk.openvk.preload.a.a.d r1 = (com.bykv.vk.openvk.preload.a.a.d) r1
            java.lang.Class<com.bykv.vk.openvk.preload.a.a.e> r4 = com.bykv.vk.openvk.preload.a.a.e.class
            java.lang.annotation.Annotation r4 = r9.getAnnotation(r4)
            com.bykv.vk.openvk.preload.a.a.e r4 = (com.bykv.vk.openvk.preload.a.a.e) r4
            boolean r1 = r0.a(r1, r4)
            if (r1 != 0) goto L45
            goto L23
        L45:
            boolean r1 = r9.isSynthetic()
            if (r1 == 0) goto L4c
            goto L23
        L4c:
            boolean r1 = r0.f7318e
            if (r1 == 0) goto L6a
            java.lang.Class<com.bykv.vk.openvk.preload.a.a.a> r1 = com.bykv.vk.openvk.preload.a.a.a.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            com.bykv.vk.openvk.preload.a.a.a r1 = (com.bykv.vk.openvk.preload.a.a.a) r1
            if (r1 == 0) goto L23
            if (r10 == 0) goto L63
            boolean r1 = r1.a()
            if (r1 != 0) goto L6a
            goto L69
        L63:
            boolean r1 = r1.b()
            if (r1 != 0) goto L6a
        L69:
            goto L23
        L6a:
            boolean r1 = r0.f7317d
            if (r1 != 0) goto L79
            java.lang.Class r1 = r9.getType()
            boolean r1 = com.bykv.vk.openvk.preload.a.b.d.c(r1)
            if (r1 == 0) goto L79
            goto L23
        L79:
            java.lang.Class r1 = r9.getType()
            boolean r1 = com.bykv.vk.openvk.preload.a.b.d.b(r1)
            if (r1 == 0) goto L84
            goto L23
        L84:
            if (r10 == 0) goto L89
            java.util.List<com.bykv.vk.openvk.preload.a.b> r10 = r0.f7319f
            goto L8b
        L89:
            java.util.List<com.bykv.vk.openvk.preload.a.b> r10 = r0.f7320g
        L8b:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto Lae
            com.bykv.vk.openvk.preload.a.c r0 = new com.bykv.vk.openvk.preload.a.c
            r0.<init>(r9)
            java.util.Iterator r9 = r10.iterator()
        L9a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lae
            java.lang.Object r10 = r9.next()
            com.bykv.vk.openvk.preload.a.b r10 = (com.bykv.vk.openvk.preload.a.b) r10
            boolean r10 = r10.a()
            if (r10 == 0) goto L9a
            goto L23
        Lae:
            r9 = r2
        Laf:
            if (r9 != 0) goto Lb2
            return r3
        Lb2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.b.a.i.a(java.lang.reflect.Field, boolean):boolean");
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* loaded from: classes.dex */
    public static final class a<T> extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.b.i<T> f7224a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, b> f7225b;

        public a(com.bykv.vk.openvk.preload.a.b.i<T> iVar, Map<String, b> map) {
            this.f7224a = iVar;
            this.f7225b = map;
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.k();
                return null;
            }
            T a10 = this.f7224a.a();
            try {
                aVar.c();
                while (aVar.e()) {
                    b bVar = this.f7225b.get(aVar.h());
                    if (bVar != null && bVar.f7228j) {
                        bVar.a(aVar, a10);
                    }
                    aVar.o();
                }
                aVar.d();
                return a10;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new r(e11);
            }
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t4) {
            if (t4 == null) {
                cVar.e();
                return;
            }
            cVar.c();
            try {
                for (b bVar : this.f7225b.values()) {
                    if (bVar.a(t4)) {
                        cVar.a(bVar.f7226h);
                        bVar.a(cVar, t4);
                    }
                }
                cVar.d();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    private List<String> a(Field field) {
        com.bykv.vk.openvk.preload.a.a.c cVar = (com.bykv.vk.openvk.preload.a.a.c) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f7215b.a(field));
        }
        String a10 = cVar.a();
        String[] b10 = cVar.b();
        if (b10.length == 0) {
            return Collections.singletonList(a10);
        }
        ArrayList arrayList = new ArrayList(b10.length + 1);
        arrayList.add(a10);
        for (String str : b10) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    private Map<String, b> a(final com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<?> aVar, Class<?> cls) {
        com.bykv.vk.openvk.preload.a.c.a<?> aVar2;
        int i10;
        boolean z10;
        int i11;
        Field[] fieldArr;
        Class<?> cls2;
        Type type;
        i iVar = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type2 = aVar.c;
        Class<?> cls3 = cls;
        com.bykv.vk.openvk.preload.a.c.a<?> aVar3 = aVar;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            int length = declaredFields.length;
            boolean z11 = false;
            int i12 = 0;
            while (i12 < length) {
                final Field field = declaredFields[i12];
                boolean a10 = iVar.a(field, true);
                boolean a11 = iVar.a(field, z11);
                if (a10 || a11) {
                    iVar.f7217e.a(field);
                    Type a12 = com.bykv.vk.openvk.preload.a.b.b.a(aVar3.c, cls3, field.getGenericType());
                    List<String> a13 = iVar.a(field);
                    int size = a13.size();
                    int i13 = z11;
                    aVar2 = aVar3;
                    b bVar = null;
                    while (i13 < size) {
                        Type type3 = type2;
                        String str = a13.get(i13);
                        boolean z12 = i13 != 0 ? z11 : a10;
                        final com.bykv.vk.openvk.preload.a.c.a<?> a14 = com.bykv.vk.openvk.preload.a.c.a.a(a12);
                        Class<? super Object> cls4 = a14.f7360b;
                        boolean z13 = (cls4 instanceof Class) && cls4.isPrimitive();
                        com.bykv.vk.openvk.preload.a.a.b bVar2 = (com.bykv.vk.openvk.preload.a.a.b) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.b.class);
                        t<?> a15 = bVar2 != null ? d.a(iVar.f7214a, fVar, a14, bVar2) : null;
                        boolean z14 = a15 != null;
                        if (a15 == null) {
                            a15 = fVar.a((com.bykv.vk.openvk.preload.a.c.a) a14);
                        }
                        final t<?> tVar = a15;
                        int i14 = i13;
                        int i15 = size;
                        List<String> list = a13;
                        Field field2 = field;
                        int i16 = i12;
                        final boolean z15 = z14;
                        int i17 = length;
                        Field[] fieldArr2 = declaredFields;
                        Class<?> cls5 = cls3;
                        final boolean z16 = z13;
                        b bVar3 = (b) linkedHashMap.put(str, new b(str, z12, a11) { // from class: com.bykv.vk.openvk.preload.a.b.a.i.1
                            @Override // com.bykv.vk.openvk.preload.a.b.a.i.b
                            public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) {
                                (z15 ? tVar : new m(fVar, tVar, a14.c)).a(cVar, field.get(obj));
                            }

                            @Override // com.bykv.vk.openvk.preload.a.b.a.i.b
                            public final void a(com.bykv.vk.openvk.preload.a.d.a aVar4, Object obj) {
                                Object a16 = tVar.a(aVar4);
                                if (a16 == null && z16) {
                                    return;
                                }
                                field.set(obj, a16);
                            }

                            @Override // com.bykv.vk.openvk.preload.a.b.a.i.b
                            public final boolean a(Object obj) {
                                return this.f7227i && field.get(obj) != obj;
                            }
                        });
                        if (bVar == null) {
                            bVar = bVar3;
                        }
                        iVar = this;
                        cls3 = cls5;
                        a10 = z12;
                        type2 = type3;
                        z11 = false;
                        length = i17;
                        size = i15;
                        a13 = list;
                        field = field2;
                        i12 = i16;
                        declaredFields = fieldArr2;
                        i13 = i14 + 1;
                    }
                    i10 = i12;
                    z10 = z11;
                    i11 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    type = type2;
                    if (bVar != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar.f7226h);
                    }
                } else {
                    i10 = i12;
                    z10 = z11;
                    i11 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    type = type2;
                    aVar2 = aVar3;
                }
                i12 = i10 + 1;
                iVar = this;
                aVar3 = aVar2;
                cls3 = cls2;
                type2 = type;
                z11 = z10;
                length = i11;
                declaredFields = fieldArr;
            }
            Class<?> cls6 = cls3;
            aVar3 = com.bykv.vk.openvk.preload.a.c.a.a(com.bykv.vk.openvk.preload.a.b.b.a(aVar3.c, cls6, cls6.getGenericSuperclass()));
            cls3 = aVar3.f7360b;
            iVar = this;
        }
        return linkedHashMap;
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        Class<? super T> cls = aVar.f7360b;
        if (Object.class.isAssignableFrom(cls)) {
            return new a(this.f7214a.a(aVar), a(fVar, aVar, cls));
        }
        return null;
    }
}
