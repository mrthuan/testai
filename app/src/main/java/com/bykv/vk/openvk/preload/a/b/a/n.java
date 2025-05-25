package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: TypeAdapters.java */
/* loaded from: classes.dex */
public final class n {
    public static final t<String> A;
    public static final t<BigDecimal> B;
    public static final t<BigInteger> C;
    public static final u D;
    public static final t<StringBuilder> E;
    public static final u F;
    public static final t<StringBuffer> G;
    public static final u H;
    public static final t<URL> I;
    public static final u J;
    public static final t<URI> K;
    public static final u L;
    public static final t<InetAddress> M;
    public static final u N;
    public static final t<UUID> O;
    public static final u P;
    public static final t<Currency> Q;
    public static final u R;
    public static final u S;
    public static final t<Calendar> T;
    public static final u U;
    public static final t<Locale> V;
    public static final u W;
    public static final t<com.bykv.vk.openvk.preload.a.k> X;
    public static final u Y;
    public static final u Z;

    /* renamed from: a  reason: collision with root package name */
    public static final t<Class> f7242a;

    /* renamed from: b  reason: collision with root package name */
    public static final u f7243b;
    public static final t<BitSet> c;

    /* renamed from: d  reason: collision with root package name */
    public static final u f7244d;

    /* renamed from: e  reason: collision with root package name */
    public static final t<Boolean> f7245e;

    /* renamed from: f  reason: collision with root package name */
    public static final t<Boolean> f7246f;

    /* renamed from: g  reason: collision with root package name */
    public static final u f7247g;

    /* renamed from: h  reason: collision with root package name */
    public static final t<Number> f7248h;

    /* renamed from: i  reason: collision with root package name */
    public static final u f7249i;

    /* renamed from: j  reason: collision with root package name */
    public static final t<Number> f7250j;

    /* renamed from: k  reason: collision with root package name */
    public static final u f7251k;

    /* renamed from: l  reason: collision with root package name */
    public static final t<Number> f7252l;

    /* renamed from: m  reason: collision with root package name */
    public static final u f7253m;

    /* renamed from: n  reason: collision with root package name */
    public static final t<AtomicInteger> f7254n;

    /* renamed from: o  reason: collision with root package name */
    public static final u f7255o;

    /* renamed from: p  reason: collision with root package name */
    public static final t<AtomicBoolean> f7256p;

    /* renamed from: q  reason: collision with root package name */
    public static final u f7257q;

    /* renamed from: r  reason: collision with root package name */
    public static final t<AtomicIntegerArray> f7258r;

    /* renamed from: s  reason: collision with root package name */
    public static final u f7259s;

    /* renamed from: t  reason: collision with root package name */
    public static final t<Number> f7260t;

    /* renamed from: u  reason: collision with root package name */
    public static final t<Number> f7261u;

    /* renamed from: v  reason: collision with root package name */
    public static final t<Number> f7262v;

    /* renamed from: w  reason: collision with root package name */
    public static final t<Number> f7263w;

    /* renamed from: x  reason: collision with root package name */
    public static final u f7264x;

    /* renamed from: y  reason: collision with root package name */
    public static final t<Character> f7265y;

    /* renamed from: z  reason: collision with root package name */
    public static final u f7266z;

    /* compiled from: TypeAdapters.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.a.n$30  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass30 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7281a;

        static {
            int[] iArr = new int[com.bykv.vk.openvk.preload.a.d.b.values().length];
            f7281a = iArr;
            try {
                iArr[com.bykv.vk.openvk.preload.a.d.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7281a[com.bykv.vk.openvk.preload.a.d.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7281a[com.bykv.vk.openvk.preload.a.d.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7281a[com.bykv.vk.openvk.preload.a.d.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7281a[com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7281a[com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7281a[com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7281a[com.bykv.vk.openvk.preload.a.d.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7281a[com.bykv.vk.openvk.preload.a.d.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7281a[com.bykv.vk.openvk.preload.a.d.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        t<Class> a10 = new t<Class>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.1
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Class a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
        }.a();
        f7242a = a10;
        f7243b = a(Class.class, a10);
        t<BitSet> a11 = new t<BitSet>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.12
            /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
                r5 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
                if (r7.n() != 0) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.util.BitSet b(com.bykv.vk.openvk.preload.a.d.a r7) {
                /*
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r7.a()
                    com.bykv.vk.openvk.preload.a.d.b r1 = r7.f()
                    r2 = 0
                    r3 = r2
                Le:
                    com.bykv.vk.openvk.preload.a.d.b r4 = com.bykv.vk.openvk.preload.a.d.b.END_ARRAY
                    if (r1 == r4) goto L67
                    int[] r4 = com.bykv.vk.openvk.preload.a.b.a.n.AnonymousClass30.f7281a
                    int r5 = r1.ordinal()
                    r4 = r4[r5]
                    r5 = 1
                    if (r4 == r5) goto L55
                    r6 = 2
                    if (r4 == r6) goto L50
                    r6 = 3
                    if (r4 != r6) goto L40
                    java.lang.String r1 = r7.i()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                    if (r1 == 0) goto L2e
                    goto L5b
                L2e:
                    r5 = r2
                    goto L5b
                L30:
                    com.bykv.vk.openvk.preload.a.r r7 = new com.bykv.vk.openvk.preload.a.r
                    java.lang.String r0 = java.lang.String.valueOf(r1)
                    java.lang.String r1 = "Error: Expecting: bitset number value (1, 0), Found: "
                    java.lang.String r0 = r1.concat(r0)
                    r7.<init>(r0)
                    throw r7
                L40:
                    com.bykv.vk.openvk.preload.a.r r7 = new com.bykv.vk.openvk.preload.a.r
                    java.lang.String r0 = java.lang.String.valueOf(r1)
                    java.lang.String r1 = "Invalid bitset value type: "
                    java.lang.String r0 = r1.concat(r0)
                    r7.<init>(r0)
                    throw r7
                L50:
                    boolean r5 = r7.j()
                    goto L5b
                L55:
                    int r1 = r7.n()
                    if (r1 == 0) goto L2e
                L5b:
                    if (r5 == 0) goto L60
                    r0.set(r3)
                L60:
                    int r3 = r3 + 1
                    com.bykv.vk.openvk.preload.a.d.b r1 = r7.f()
                    goto Le
                L67:
                    r7.b()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.b.a.n.AnonymousClass12.b(com.bykv.vk.openvk.preload.a.d.a):java.util.BitSet");
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ BitSet a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, BitSet bitSet) {
                BitSet bitSet2 = bitSet;
                cVar.a();
                int length = bitSet2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.a(bitSet2.get(i10) ? 1L : 0L);
                }
                cVar.b();
            }
        }.a();
        c = a11;
        f7244d = a(BitSet.class, a11);
        t<Boolean> tVar = new t<Boolean>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.23
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Boolean bool) {
                cVar.a(bool);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Boolean a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                com.bykv.vk.openvk.preload.a.d.b f10 = aVar.f();
                if (f10 == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                } else if (f10 == com.bykv.vk.openvk.preload.a.d.b.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.i()));
                } else {
                    return Boolean.valueOf(aVar.j());
                }
            }
        };
        f7245e = tVar;
        f7246f = new t<Boolean>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.31
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Boolean bool) {
                Boolean bool2 = bool;
                cVar.b(bool2 == null ? "null" : bool2.toString());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Boolean a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return Boolean.valueOf(aVar.i());
            }
        };
        f7247g = a(Boolean.TYPE, Boolean.class, tVar);
        t<Number> tVar2 = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.32
            private static Number b(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) aVar.n());
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) {
                cVar.a(number);
            }
        };
        f7248h = tVar2;
        f7249i = a(Byte.TYPE, Byte.class, tVar2);
        t<Number> tVar3 = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.33
            private static Number b(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return Short.valueOf((short) aVar.n());
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) {
                cVar.a(number);
            }
        };
        f7250j = tVar3;
        f7251k = a(Short.TYPE, Short.class, tVar3);
        t<Number> tVar4 = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.34
            private static Number b(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.n());
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) {
                cVar.a(number);
            }
        };
        f7252l = tVar4;
        f7253m = a(Integer.TYPE, Integer.class, tVar4);
        t<AtomicInteger> a12 = new t<AtomicInteger>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.35
            private static AtomicInteger b(com.bykv.vk.openvk.preload.a.d.a aVar) {
                try {
                    return new AtomicInteger(aVar.n());
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ AtomicInteger a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, AtomicInteger atomicInteger) {
                cVar.a(atomicInteger.get());
            }
        }.a();
        f7254n = a12;
        f7255o = a(AtomicInteger.class, a12);
        t<AtomicBoolean> a13 = new t<AtomicBoolean>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.36
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, AtomicBoolean atomicBoolean) {
                cVar.a(atomicBoolean.get());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ AtomicBoolean a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return new AtomicBoolean(aVar.j());
            }
        }.a();
        f7256p = a13;
        f7257q = a(AtomicBoolean.class, a13);
        t<AtomicIntegerArray> a14 = new t<AtomicIntegerArray>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.2
            private static AtomicIntegerArray b(com.bykv.vk.openvk.preload.a.d.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.n()));
                    } catch (NumberFormatException e10) {
                        throw new r(e10);
                    }
                }
                aVar.b();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ AtomicIntegerArray a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, AtomicIntegerArray atomicIntegerArray) {
                AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
                cVar.a();
                int length = atomicIntegerArray2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.a(atomicIntegerArray2.get(i10));
                }
                cVar.b();
            }
        }.a();
        f7258r = a14;
        f7259s = a(AtomicIntegerArray.class, a14);
        f7260t = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.3
            private static Number b(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.m());
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) {
                cVar.a(number);
            }
        };
        f7261u = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.4
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) {
                cVar.a(number);
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
        f7262v = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.5
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) {
                cVar.a(number);
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
        t<Number> tVar5 = new t<Number>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.6
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Number number) {
                cVar.a(number);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                com.bykv.vk.openvk.preload.a.d.b f10 = aVar.f();
                int i10 = AnonymousClass30.f7281a[f10.ordinal()];
                if (i10 == 1 || i10 == 3) {
                    return new com.bykv.vk.openvk.preload.a.b.g(aVar.i());
                }
                if (i10 == 4) {
                    aVar.k();
                    return null;
                }
                throw new r("Expecting number, got: ".concat(String.valueOf(f10)));
            }
        };
        f7263w = tVar5;
        f7264x = a(Number.class, tVar5);
        t<Character> tVar6 = new t<Character>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.7
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Character ch2) {
                Character ch3 = ch2;
                cVar.b(ch3 == null ? null : String.valueOf(ch3));
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Character a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                String i10 = aVar.i();
                if (i10.length() == 1) {
                    return Character.valueOf(i10.charAt(0));
                }
                throw new r("Expecting character, got: ".concat(i10));
            }
        };
        f7265y = tVar6;
        f7266z = a(Character.TYPE, Character.class, tVar6);
        t<String> tVar7 = new t<String>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.8
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, String str) {
                cVar.b(str);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ String a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                com.bykv.vk.openvk.preload.a.d.b f10 = aVar.f();
                if (f10 == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                } else if (f10 == com.bykv.vk.openvk.preload.a.d.b.BOOLEAN) {
                    return Boolean.toString(aVar.j());
                } else {
                    return aVar.i();
                }
            }
        };
        A = tVar7;
        B = new t<BigDecimal>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.9
            private static BigDecimal b(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return new BigDecimal(aVar.i());
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ BigDecimal a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, BigDecimal bigDecimal) {
                cVar.a(bigDecimal);
            }
        };
        C = new t<BigInteger>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.10
            private static BigInteger b(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    return new BigInteger(aVar.i());
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ BigInteger a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, BigInteger bigInteger) {
                cVar.a(bigInteger);
            }
        };
        D = a(String.class, tVar7);
        t<StringBuilder> tVar8 = new t<StringBuilder>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.11
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, StringBuilder sb2) {
                StringBuilder sb3 = sb2;
                cVar.b(sb3 == null ? null : sb3.toString());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ StringBuilder a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return new StringBuilder(aVar.i());
            }
        };
        E = tVar8;
        F = a(StringBuilder.class, tVar8);
        t<StringBuffer> tVar9 = new t<StringBuffer>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.13
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, StringBuffer stringBuffer) {
                StringBuffer stringBuffer2 = stringBuffer;
                cVar.b(stringBuffer2 == null ? null : stringBuffer2.toString());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ StringBuffer a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return new StringBuffer(aVar.i());
            }
        };
        G = tVar9;
        H = a(StringBuffer.class, tVar9);
        t<URL> tVar10 = new t<URL>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.14
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, URL url) {
                URL url2 = url;
                cVar.b(url2 == null ? null : url2.toExternalForm());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ URL a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                String i10 = aVar.i();
                if ("null".equals(i10)) {
                    return null;
                }
                return new URL(i10);
            }
        };
        I = tVar10;
        J = a(URL.class, tVar10);
        t<URI> tVar11 = new t<URI>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.15
            private static URI b(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                try {
                    String i10 = aVar.i();
                    if ("null".equals(i10)) {
                        return null;
                    }
                    return new URI(i10);
                } catch (URISyntaxException e10) {
                    throw new com.bykv.vk.openvk.preload.a.l(e10);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ URI a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return b(aVar);
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, URI uri) {
                URI uri2 = uri;
                cVar.b(uri2 == null ? null : uri2.toASCIIString());
            }
        };
        K = tVar11;
        L = a(URI.class, tVar11);
        t<InetAddress> tVar12 = new t<InetAddress>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.16
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, InetAddress inetAddress) {
                InetAddress inetAddress2 = inetAddress;
                cVar.b(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ InetAddress a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return InetAddress.getByName(aVar.i());
            }
        };
        M = tVar12;
        N = b(InetAddress.class, tVar12);
        t<UUID> tVar13 = new t<UUID>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.17
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, UUID uuid) {
                UUID uuid2 = uuid;
                cVar.b(uuid2 == null ? null : uuid2.toString());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ UUID a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return UUID.fromString(aVar.i());
            }
        };
        O = tVar13;
        P = a(UUID.class, tVar13);
        t<Currency> a15 = new t<Currency>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.18
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Currency currency) {
                cVar.b(currency.getCurrencyCode());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Currency a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                return Currency.getInstance(aVar.i());
            }
        }.a();
        Q = a15;
        R = a(Currency.class, a15);
        S = new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.19
            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
                if (aVar.f7360b != Timestamp.class) {
                    return null;
                }
                final t<T> a16 = fVar.a((Class) Date.class);
                return (t<T>) new t<Timestamp>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.19.1
                    @Override // com.bykv.vk.openvk.preload.a.t
                    public final /* bridge */ /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Timestamp timestamp) {
                        a16.a(cVar, timestamp);
                    }

                    @Override // com.bykv.vk.openvk.preload.a.t
                    public final /* synthetic */ Timestamp a(com.bykv.vk.openvk.preload.a.d.a aVar2) {
                        Date date = (Date) a16.a(aVar2);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }
                };
            }
        };
        final t<Calendar> tVar14 = new t<Calendar>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.20
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Calendar calendar) {
                Calendar calendar2 = calendar;
                if (calendar2 == null) {
                    cVar.e();
                    return;
                }
                cVar.c();
                cVar.a("year");
                cVar.a(calendar2.get(1));
                cVar.a("month");
                cVar.a(calendar2.get(2));
                cVar.a("dayOfMonth");
                cVar.a(calendar2.get(5));
                cVar.a("hourOfDay");
                cVar.a(calendar2.get(11));
                cVar.a("minute");
                cVar.a(calendar2.get(12));
                cVar.a("second");
                cVar.a(calendar2.get(13));
                cVar.d();
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Calendar a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                aVar.c();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (aVar.f() != com.bykv.vk.openvk.preload.a.d.b.END_OBJECT) {
                    String h10 = aVar.h();
                    int n10 = aVar.n();
                    if ("year".equals(h10)) {
                        i10 = n10;
                    } else if ("month".equals(h10)) {
                        i11 = n10;
                    } else if ("dayOfMonth".equals(h10)) {
                        i12 = n10;
                    } else if ("hourOfDay".equals(h10)) {
                        i13 = n10;
                    } else if ("minute".equals(h10)) {
                        i14 = n10;
                    } else if ("second".equals(h10)) {
                        i15 = n10;
                    }
                }
                aVar.d();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }
        };
        T = tVar14;
        U = new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.28
            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
                Class<? super T> cls = aVar.f7360b;
                if (cls != r1 && cls != r2) {
                    return null;
                }
                return tVar14;
            }

            public final String toString() {
                return "Factory[type=" + r1.getName() + "+" + r2.getName() + ",adapter=" + tVar14 + "]";
            }
        };
        t<Locale> tVar15 = new t<Locale>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.21
            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Locale locale) {
                Locale locale2 = locale;
                cVar.b(locale2 == null ? null : locale2.toString());
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final /* synthetic */ Locale a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.i(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (nextToken2 == null && nextToken3 == null) {
                    return new Locale(nextToken);
                }
                if (nextToken3 == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, nextToken3);
            }
        };
        V = tVar15;
        W = a(Locale.class, tVar15);
        t<com.bykv.vk.openvk.preload.a.k> tVar16 = new t<com.bykv.vk.openvk.preload.a.k>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.22
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.bykv.vk.openvk.preload.a.t
            /* renamed from: b */
            public com.bykv.vk.openvk.preload.a.k a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                switch (AnonymousClass30.f7281a[aVar.f().ordinal()]) {
                    case 1:
                        return new p(new com.bykv.vk.openvk.preload.a.b.g(aVar.i()));
                    case 2:
                        return new p(Boolean.valueOf(aVar.j()));
                    case 3:
                        return new p(aVar.i());
                    case 4:
                        aVar.k();
                        return com.bykv.vk.openvk.preload.a.m.f7444a;
                    case 5:
                        com.bykv.vk.openvk.preload.a.i iVar = new com.bykv.vk.openvk.preload.a.i();
                        aVar.a();
                        while (aVar.e()) {
                            iVar.a(a(aVar));
                        }
                        aVar.b();
                        return iVar;
                    case 6:
                        com.bykv.vk.openvk.preload.a.n nVar = new com.bykv.vk.openvk.preload.a.n();
                        aVar.c();
                        while (aVar.e()) {
                            nVar.a(aVar.h(), a(aVar));
                        }
                        aVar.d();
                        return nVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.bykv.vk.openvk.preload.a.t
            public void a(com.bykv.vk.openvk.preload.a.d.c cVar, com.bykv.vk.openvk.preload.a.k kVar) {
                if (kVar != null && !(kVar instanceof com.bykv.vk.openvk.preload.a.m)) {
                    if (kVar instanceof p) {
                        p g10 = kVar.g();
                        Object obj = g10.f7446a;
                        if (obj instanceof Number) {
                            cVar.a(g10.a());
                            return;
                        } else if (obj instanceof Boolean) {
                            cVar.a(g10.f());
                            return;
                        } else {
                            cVar.b(g10.b());
                            return;
                        }
                    }
                    boolean z10 = kVar instanceof com.bykv.vk.openvk.preload.a.i;
                    if (z10) {
                        cVar.a();
                        if (z10) {
                            Iterator<com.bykv.vk.openvk.preload.a.k> it = ((com.bykv.vk.openvk.preload.a.i) kVar).iterator();
                            while (it.hasNext()) {
                                a(cVar, it.next());
                            }
                            cVar.b();
                            return;
                        }
                        throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(kVar)));
                    }
                    boolean z11 = kVar instanceof com.bykv.vk.openvk.preload.a.n;
                    if (z11) {
                        cVar.c();
                        if (z11) {
                            for (Map.Entry<String, com.bykv.vk.openvk.preload.a.k> entry : ((com.bykv.vk.openvk.preload.a.n) kVar).f7445a.entrySet()) {
                                cVar.a(entry.getKey());
                                a(cVar, entry.getValue());
                            }
                            cVar.d();
                            return;
                        }
                        throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(kVar)));
                    }
                    throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
                }
                cVar.e();
            }
        };
        X = tVar16;
        Y = b(com.bykv.vk.openvk.preload.a.k.class, tVar16);
        Z = new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.24
            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
                Class<? super T> cls = aVar.f7360b;
                if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
                    if (!cls.isEnum()) {
                        cls = cls.getSuperclass();
                    }
                    return new a(cls);
                }
                return null;
            }
        };
    }

    public static <TT> u a(final com.bykv.vk.openvk.preload.a.c.a<TT> aVar, final t<TT> tVar) {
        return new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.25
            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar2) {
                if (aVar2.equals(com.bykv.vk.openvk.preload.a.c.a.this)) {
                    return tVar;
                }
                return null;
            }
        };
    }

    private static <T1> u b(final Class<T1> cls, final t<T1> tVar) {
        return new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.29
            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T2> t<T2> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T2> aVar) {
                final Class<? super T2> cls2 = aVar.f7360b;
                if (!cls.isAssignableFrom(cls2)) {
                    return null;
                }
                return (t<T2>) new t<T1>() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.29.1
                    @Override // com.bykv.vk.openvk.preload.a.t
                    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T1 t12) {
                        tVar.a(cVar, t12);
                    }

                    @Override // com.bykv.vk.openvk.preload.a.t
                    public final T1 a(com.bykv.vk.openvk.preload.a.d.a aVar2) {
                        T1 t12 = (T1) tVar.a(aVar2);
                        if (t12 == null || cls2.isInstance(t12)) {
                            return t12;
                        }
                        throw new r("Expected a " + cls2.getName() + " but was " + t12.getClass().getName());
                    }
                };
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + tVar + "]";
            }
        };
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public static final class a<T extends Enum<T>> extends t<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, T> f7282a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<T, String> f7283b = new HashMap();

        public a(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t4 : cls.getEnumConstants()) {
                    String name = t4.name();
                    com.bykv.vk.openvk.preload.a.a.c cVar = (com.bykv.vk.openvk.preload.a.a.c) cls.getField(name).getAnnotation(com.bykv.vk.openvk.preload.a.a.c.class);
                    if (cVar != null) {
                        name = cVar.a();
                        for (String str : cVar.b()) {
                            this.f7282a.put(str, t4);
                        }
                    }
                    this.f7282a.put(name, t4);
                    this.f7283b.put(t4, name);
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) {
            Enum r32 = (Enum) obj;
            cVar.b(r32 == null ? null : this.f7283b.get(r32));
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.d.a aVar) {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.k();
                return null;
            }
            return this.f7282a.get(aVar.i());
        }
    }

    public static <TT> u a(final Class<TT> cls, final t<TT> tVar) {
        return new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.26
            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
                if (aVar.f7360b == cls) {
                    return tVar;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + tVar + "]";
            }
        };
    }

    public static <TT> u a(final Class<TT> cls, final Class<TT> cls2, final t<? super TT> tVar) {
        return new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.n.27
            @Override // com.bykv.vk.openvk.preload.a.u
            public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
                Class<? super T> cls3 = aVar.f7360b;
                if (cls3 != cls && cls3 != cls2) {
                    return null;
                }
                return tVar;
            }

            public final String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + tVar + "]";
            }
        };
    }
}
