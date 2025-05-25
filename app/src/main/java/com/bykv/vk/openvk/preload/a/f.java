package com.bykv.vk.openvk.preload.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: r  reason: collision with root package name */
    private static final com.bykv.vk.openvk.preload.a.c.a<?> f7402r = com.bykv.vk.openvk.preload.a.c.a.a(Object.class);

    /* renamed from: a  reason: collision with root package name */
    final List<u> f7403a;

    /* renamed from: b  reason: collision with root package name */
    final com.bykv.vk.openvk.preload.a.b.d f7404b;
    final e c;

    /* renamed from: d  reason: collision with root package name */
    final Map<Type, h<?>> f7405d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f7406e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f7407f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f7408g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f7409h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f7410i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f7411j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f7412k;

    /* renamed from: l  reason: collision with root package name */
    final String f7413l;

    /* renamed from: m  reason: collision with root package name */
    final int f7414m;

    /* renamed from: n  reason: collision with root package name */
    final int f7415n;

    /* renamed from: o  reason: collision with root package name */
    final s f7416o;

    /* renamed from: p  reason: collision with root package name */
    final List<u> f7417p;

    /* renamed from: q  reason: collision with root package name */
    final List<u> f7418q;

    /* renamed from: s  reason: collision with root package name */
    private final ThreadLocal<Map<com.bykv.vk.openvk.preload.a.c.a<?>, a<?>>> f7419s;

    /* renamed from: t  reason: collision with root package name */
    private final Map<com.bykv.vk.openvk.preload.a.c.a<?>, t<?>> f7420t;

    /* renamed from: u  reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.c f7421u;

    /* renamed from: v  reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.a.d f7422v;

    public f() {
        this(com.bykv.vk.openvk.preload.a.b.d.f7315a, d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, s.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f7406e + ",factories:" + this.f7403a + ",instanceCreators:" + this.f7421u + "}";
    }

    /* compiled from: Gson.java */
    /* loaded from: classes.dex */
    public static class a<T> extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        t<T> f7427a;

        @Override // com.bykv.vk.openvk.preload.a.t
        public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) {
            t<T> tVar = this.f7427a;
            if (tVar != null) {
                return tVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t4) {
            t<T> tVar = this.f7427a;
            if (tVar != null) {
                tVar.a(cVar, t4);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        boolean z10;
        t<T> tVar = (t<T>) this.f7420t.get(aVar == null ? f7402r : aVar);
        if (tVar != null) {
            return tVar;
        }
        Map<com.bykv.vk.openvk.preload.a.c.a<?>, a<?>> map = this.f7419s.get();
        if (map == null) {
            map = new HashMap<>();
            this.f7419s.set(map);
            z10 = true;
        } else {
            z10 = false;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            for (u uVar : this.f7403a) {
                t<T> a10 = uVar.a(this, aVar);
                if (a10 != null) {
                    if (aVar3.f7427a == null) {
                        aVar3.f7427a = a10;
                        this.f7420t.put(aVar, a10);
                        return a10;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (pangle-v3200) cannot handle ".concat(String.valueOf(aVar)));
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f7419s.remove();
            }
        }
    }

    public f(com.bykv.vk.openvk.preload.a.b.d dVar, e eVar, Map<Type, h<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, s sVar, String str, int i10, int i11, List<u> list, List<u> list2, List<u> list3) {
        final t<Number> tVar;
        t<Number> tVar2;
        t<Number> tVar3;
        this.f7419s = new ThreadLocal<>();
        this.f7420t = new ConcurrentHashMap();
        this.f7404b = dVar;
        this.c = eVar;
        this.f7405d = map;
        com.bykv.vk.openvk.preload.a.b.c cVar = new com.bykv.vk.openvk.preload.a.b.c(map);
        this.f7421u = cVar;
        this.f7406e = z10;
        this.f7407f = z11;
        this.f7408g = z12;
        this.f7409h = z13;
        this.f7410i = z14;
        this.f7411j = z15;
        this.f7412k = z16;
        this.f7416o = sVar;
        this.f7413l = str;
        this.f7414m = i10;
        this.f7415n = i11;
        this.f7417p = list;
        this.f7418q = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.Y);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.h.f7211a);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.D);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f7253m);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f7247g);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f7249i);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f7251k);
        if (sVar == s.DEFAULT) {
            tVar = com.bykv.vk.openvk.preload.a.b.a.n.f7260t;
        } else {
            tVar = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.f.3
                @Override // com.bykv.vk.openvk.preload.a.t
                public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar2, Number number) {
                    Number number2 = number;
                    if (number2 == null) {
                        cVar2.e();
                    } else {
                        cVar2.b(number2.toString());
                    }
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                    if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                        aVar.k();
                        return null;
                    }
                    return Long.valueOf(aVar.m());
                }
            };
        }
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(Long.TYPE, Long.class, tVar));
        Class cls = Double.TYPE;
        if (z16) {
            tVar2 = com.bykv.vk.openvk.preload.a.b.a.n.f7262v;
        } else {
            tVar2 = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.f.1
                @Override // com.bykv.vk.openvk.preload.a.t
                public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar2, Number number) {
                    Number number2 = number;
                    if (number2 == null) {
                        cVar2.e();
                        return;
                    }
                    f.a(number2.doubleValue());
                    cVar2.a(number2);
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                    if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                        aVar.k();
                        return null;
                    }
                    return Double.valueOf(aVar.l());
                }
            };
        }
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(cls, Double.class, tVar2));
        Class cls2 = Float.TYPE;
        if (z16) {
            tVar3 = com.bykv.vk.openvk.preload.a.b.a.n.f7261u;
        } else {
            tVar3 = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.f.2
                @Override // com.bykv.vk.openvk.preload.a.t
                public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar2, Number number) {
                    Number number2 = number;
                    if (number2 == null) {
                        cVar2.e();
                        return;
                    }
                    f.a(number2.floatValue());
                    cVar2.a(number2);
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                    if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                        aVar.k();
                        return null;
                    }
                    return Float.valueOf((float) aVar.l());
                }
            };
        }
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(cls2, Float.class, tVar3));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f7264x);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f7255o);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f7257q);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(AtomicLong.class, new t<AtomicLong>() { // from class: com.bykv.vk.openvk.preload.a.f.4
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar2, AtomicLong atomicLong) {
                t.this.a(cVar2, Long.valueOf(atomicLong.get()));
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ AtomicLong a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return new AtomicLong(((Number) t.this.a(aVar)).longValue());
            }
        }.a()));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(AtomicLongArray.class, new t<AtomicLongArray>() { // from class: com.bykv.vk.openvk.preload.a.f.5
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar2, AtomicLongArray atomicLongArray) {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                cVar2.a();
                int length = atomicLongArray2.length();
                for (int i12 = 0; i12 < length; i12++) {
                    t.this.a(cVar2, Long.valueOf(atomicLongArray2.get(i12)));
                }
                cVar2.b();
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ AtomicLongArray a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                ArrayList arrayList2 = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList2.add(Long.valueOf(((Number) t.this.a(aVar)).longValue()));
                }
                aVar.b();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i12 = 0; i12 < size; i12++) {
                    atomicLongArray.set(i12, ((Long) arrayList2.get(i12)).longValue());
                }
                return atomicLongArray;
            }
        }.a()));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f7259s);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f7266z);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.F);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.H);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(BigDecimal.class, com.bykv.vk.openvk.preload.a.b.a.n.B));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.a(BigInteger.class, com.bykv.vk.openvk.preload.a.b.a.n.C));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.J);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.L);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.P);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.R);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.W);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.N);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f7244d);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.c.f7193a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.U);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.k.f7231a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.j.f7229a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.S);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.a.f7187a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.f7243b);
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.b(cVar));
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.g(cVar, z11));
        com.bykv.vk.openvk.preload.a.b.a.d dVar2 = new com.bykv.vk.openvk.preload.a.b.a.d(cVar);
        this.f7422v = dVar2;
        arrayList.add(dVar2);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.n.Z);
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.i(cVar, eVar, dVar, dVar2));
        this.f7403a = Collections.unmodifiableList(arrayList);
    }

    public final <T> t<T> a(u uVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        if (!this.f7403a.contains(uVar)) {
            uVar = this.f7422v;
        }
        boolean z10 = false;
        for (u uVar2 : this.f7403a) {
            if (z10) {
                t<T> a10 = uVar2.a(this, aVar);
                if (a10 != null) {
                    return a10;
                }
            } else if (uVar2 == uVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(aVar)));
    }

    public final <T> t<T> a(Class<T> cls) {
        return a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a((Class) cls));
    }

    public final String a(Object obj) {
        if (obj == null) {
            return a((k) m.f7444a);
        }
        return a(obj, obj.getClass());
    }

    private String a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    private void a(Object obj, Type type, Appendable appendable) {
        try {
            a(obj, type, a(com.bykv.vk.openvk.preload.a.b.k.a(appendable)));
        } catch (IOException e10) {
            throw new l(e10);
        }
    }

    private void a(Object obj, Type type, com.bykv.vk.openvk.preload.a.d.c cVar) {
        t a10 = a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type));
        boolean z10 = cVar.c;
        cVar.c = true;
        boolean z11 = cVar.f7394d;
        cVar.f7394d = this.f7409h;
        boolean z12 = cVar.f7395e;
        cVar.f7395e = this.f7406e;
        try {
            try {
                try {
                    a10.a(cVar, obj);
                } catch (AssertionError e10) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e10.getMessage());
                    assertionError.initCause(e10);
                    throw assertionError;
                }
            } catch (IOException e11) {
                throw new l(e11);
            }
        } finally {
            cVar.c = z10;
            cVar.f7394d = z11;
            cVar.f7395e = z12;
        }
    }

    private String a(k kVar) {
        StringWriter stringWriter = new StringWriter();
        a(kVar, stringWriter);
        return stringWriter.toString();
    }

    private void a(k kVar, Appendable appendable) {
        try {
            a(kVar, a(com.bykv.vk.openvk.preload.a.b.k.a(appendable)));
        } catch (IOException e10) {
            throw new l(e10);
        }
    }

    private com.bykv.vk.openvk.preload.a.d.c a(Writer writer) {
        if (this.f7408g) {
            writer.write(")]}'\n");
        }
        com.bykv.vk.openvk.preload.a.d.c cVar = new com.bykv.vk.openvk.preload.a.d.c(writer);
        if (this.f7410i) {
            cVar.c("  ");
        }
        cVar.f7395e = this.f7406e;
        return cVar;
    }

    public static void a(Object obj, com.bykv.vk.openvk.preload.a.d.a aVar) {
        if (obj != null) {
            try {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT) {
                    return;
                }
                throw new l("JSON document was not fully consumed.");
            } catch (com.bykv.vk.openvk.preload.a.d.d e10) {
                throw new r(e10);
            } catch (IOException e11) {
                throw new l(e11);
            }
        }
    }

    private void a(k kVar, com.bykv.vk.openvk.preload.a.d.c cVar) {
        boolean z10 = cVar.c;
        cVar.c = true;
        boolean z11 = cVar.f7394d;
        cVar.f7394d = this.f7409h;
        boolean z12 = cVar.f7395e;
        cVar.f7395e = this.f7406e;
        try {
            try {
                com.bykv.vk.openvk.preload.a.b.k.a(kVar, cVar);
            } catch (IOException e10) {
                throw new l(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            cVar.c = z10;
            cVar.f7394d = z11;
            cVar.f7395e = z12;
        }
    }

    public final <T> T a(com.bykv.vk.openvk.preload.a.d.a aVar, Type type) {
        boolean z10 = aVar.f7368a;
        boolean z11 = true;
        aVar.f7368a = true;
        try {
            try {
                try {
                    aVar.f();
                    z11 = false;
                    return a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type)).a(aVar);
                } catch (IOException e10) {
                    throw new r(e10);
                } catch (IllegalStateException e11) {
                    throw new r(e11);
                }
            } catch (EOFException e12) {
                if (z11) {
                    aVar.f7368a = z10;
                    return null;
                }
                throw new r(e12);
            } catch (AssertionError e13) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e13.getMessage());
                assertionError.initCause(e13);
                throw assertionError;
            }
        } finally {
            aVar.f7368a = z10;
        }
    }
