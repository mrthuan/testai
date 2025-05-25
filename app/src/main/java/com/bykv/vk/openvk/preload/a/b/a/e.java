package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import lib.zj.pdfeditor.Annotation;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes.dex */
public final class e extends com.bykv.vk.openvk.preload.a.d.a {
    private static final Reader c = new Reader() { // from class: com.bykv.vk.openvk.preload.a.b.a.e.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static final Object f7196d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private Object[] f7197e;

    /* renamed from: f  reason: collision with root package name */
    private int f7198f;

    /* renamed from: g  reason: collision with root package name */
    private String[] f7199g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f7200h;

    private Object s() {
        Object[] objArr = this.f7197e;
        int i10 = this.f7198f - 1;
        this.f7198f = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private String t() {
        return " at path " + p();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void a() {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY);
        a(((com.bykv.vk.openvk.preload.a.i) g()).iterator());
        this.f7200h[this.f7198f - 1] = 0;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void b() {
        a(com.bykv.vk.openvk.preload.a.d.b.END_ARRAY);
        s();
        s();
        int i10 = this.f7198f;
        if (i10 > 0) {
            int[] iArr = this.f7200h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void c() {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT);
        a(((com.bykv.vk.openvk.preload.a.n) g()).f7445a.entrySet().iterator());
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7197e = new Object[]{f7196d};
        this.f7198f = 1;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void d() {
        a(com.bykv.vk.openvk.preload.a.d.b.END_OBJECT);
        s();
        s();
        int i10 = this.f7198f;
        if (i10 > 0) {
            int[] iArr = this.f7200h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean e() {
        com.bykv.vk.openvk.preload.a.d.b f10 = f();
        if (f10 != com.bykv.vk.openvk.preload.a.d.b.END_OBJECT && f10 != com.bykv.vk.openvk.preload.a.d.b.END_ARRAY) {
            return true;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final com.bykv.vk.openvk.preload.a.d.b f() {
        while (this.f7198f != 0) {
            Object g10 = g();
            if (g10 instanceof Iterator) {
                boolean z10 = this.f7197e[this.f7198f - 2] instanceof com.bykv.vk.openvk.preload.a.n;
                Iterator it = (Iterator) g10;
                if (it.hasNext()) {
                    if (z10) {
                        return com.bykv.vk.openvk.preload.a.d.b.NAME;
                    }
                    a(it.next());
                } else if (z10) {
                    return com.bykv.vk.openvk.preload.a.d.b.END_OBJECT;
                } else {
                    return com.bykv.vk.openvk.preload.a.d.b.END_ARRAY;
                }
            } else if (g10 instanceof com.bykv.vk.openvk.preload.a.n) {
                return com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT;
            } else {
                if (g10 instanceof com.bykv.vk.openvk.preload.a.i) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY;
                }
                if (g10 instanceof p) {
                    Object obj = ((p) g10).f7446a;
                    if (obj instanceof String) {
                        return com.bykv.vk.openvk.preload.a.d.b.STRING;
                    }
                    if (obj instanceof Boolean) {
                        return com.bykv.vk.openvk.preload.a.d.b.BOOLEAN;
                    }
                    if (obj instanceof Number) {
                        return com.bykv.vk.openvk.preload.a.d.b.NUMBER;
                    }
                    throw new AssertionError();
                } else if (g10 instanceof com.bykv.vk.openvk.preload.a.m) {
                    return com.bykv.vk.openvk.preload.a.d.b.NULL;
                } else {
                    if (g10 == f7196d) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
        return com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT;
    }

    public final Object g() {
        return this.f7197e[this.f7198f - 1];
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String h() {
        a(com.bykv.vk.openvk.preload.a.d.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) g()).next();
        String str = (String) entry.getKey();
        this.f7199g[this.f7198f - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String i() {
        com.bykv.vk.openvk.preload.a.d.b f10 = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.STRING;
        if (f10 != bVar && f10 != com.bykv.vk.openvk.preload.a.d.b.NUMBER) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f10 + t());
        }
        String b10 = ((p) s()).b();
        int i10 = this.f7198f;
        if (i10 > 0) {
            int[] iArr = this.f7200h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return b10;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean j() {
        a(com.bykv.vk.openvk.preload.a.d.b.BOOLEAN);
        boolean f10 = ((p) s()).f();
        int i10 = this.f7198f;
        if (i10 > 0) {
            int[] iArr = this.f7200h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return f10;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void k() {
        a(com.bykv.vk.openvk.preload.a.d.b.NULL);
        s();
        int i10 = this.f7198f;
        if (i10 > 0) {
            int[] iArr = this.f7200h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final double l() {
        com.bykv.vk.openvk.preload.a.d.b f10 = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.NUMBER;
        if (f10 != bVar && f10 != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f10 + t());
        }
        double c10 = ((p) g()).c();
        if (!this.f7368a && (Double.isNaN(c10) || Double.isInfinite(c10))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(c10)));
        }
        s();
        int i10 = this.f7198f;
        if (i10 > 0) {
            int[] iArr = this.f7200h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return c10;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final long m() {
        com.bykv.vk.openvk.preload.a.d.b f10 = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.NUMBER;
        if (f10 != bVar && f10 != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f10 + t());
        }
        long d10 = ((p) g()).d();
        s();
        int i10 = this.f7198f;
        if (i10 > 0) {
            int[] iArr = this.f7200h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return d10;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final int n() {
        com.bykv.vk.openvk.preload.a.d.b f10 = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.NUMBER;
        if (f10 != bVar && f10 != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + f10 + t());
        }
        int e10 = ((p) g()).e();
        s();
        int i10 = this.f7198f;
        if (i10 > 0) {
            int[] iArr = this.f7200h;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return e10;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void o() {
        if (f() == com.bykv.vk.openvk.preload.a.d.b.NAME) {
            h();
            this.f7199g[this.f7198f - 2] = "null";
        } else {
            s();
            int i10 = this.f7198f;
            if (i10 > 0) {
                this.f7199g[i10 - 1] = "null";
            }
        }
        int i11 = this.f7198f;
        if (i11 > 0) {
            int[] iArr = this.f7200h;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String p() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (i10 < this.f7198f) {
            Object[] objArr = this.f7197e;
            Object obj = objArr[i10];
            if (obj instanceof com.bykv.vk.openvk.preload.a.i) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('[');
                    sb2.append(this.f7200h[i10]);
                    sb2.append(']');
                }
            } else if (obj instanceof com.bykv.vk.openvk.preload.a.n) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('.');
                    String str = this.f7199g[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String toString() {
        return Annotation.KEY_E;
    }

    public final void a(com.bykv.vk.openvk.preload.a.d.b bVar) {
        if (f() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + f() + t());
    }

    public final void a(Object obj) {
        int i10 = this.f7198f;
        Object[] objArr = this.f7197e;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.f7197e = Arrays.copyOf(objArr, i11);
            this.f7200h = Arrays.copyOf(this.f7200h, i11);
            this.f7199g = (String[]) Arrays.copyOf(this.f7199g, i11);
        }
        Object[] objArr2 = this.f7197e;
        int i12 = this.f7198f;
        this.f7198f = i12 + 1;
        objArr2[i12] = obj;
    }
}
