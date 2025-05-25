package com.bykv.vk.openvk.preload.a.d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* compiled from: JsonWriter.java */
/* loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f7392a = new String[128];

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f7393b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7394d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7395e;

    /* renamed from: f  reason: collision with root package name */
    private final Writer f7396f;

    /* renamed from: g  reason: collision with root package name */
    private int[] f7397g = new int[32];

    /* renamed from: h  reason: collision with root package name */
    private int f7398h = 0;

    /* renamed from: i  reason: collision with root package name */
    private String f7399i;

    /* renamed from: j  reason: collision with root package name */
    private String f7400j;

    /* renamed from: k  reason: collision with root package name */
    private String f7401k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f7392a[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f7392a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f7393b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        a(6);
        this.f7400j = ":";
        this.f7395e = true;
        if (writer != null) {
            this.f7396f = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private int f() {
        int i10 = this.f7398h;
        if (i10 != 0) {
            return this.f7397g[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void g() {
        if (this.f7401k != null) {
            i();
            d(this.f7401k);
            this.f7401k = null;
        }
    }

    private void h() {
        if (this.f7399i == null) {
            return;
        }
        this.f7396f.write(10);
        int i10 = this.f7398h;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f7396f.write(this.f7399i);
        }
    }

    private void i() {
        int f10 = f();
        if (f10 == 5) {
            this.f7396f.write(44);
        } else if (f10 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        h();
        b(4);
    }

    private void j() {
        int f10 = f();
        if (f10 != 1) {
            if (f10 != 2) {
                if (f10 != 4) {
                    if (f10 != 6) {
                        if (f10 == 7) {
                            if (!this.c) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    b(7);
                    return;
                }
                this.f7396f.append((CharSequence) this.f7400j);
                b(5);
                return;
            }
            this.f7396f.append(',');
            h();
            return;
        }
        b(2);
        h();
    }

    public c a() {
        g();
        return a(1, '[');
    }

    public c b() {
        return a(1, 2, ']');
    }

    public final void c(String str) {
        if (str.length() == 0) {
            this.f7399i = null;
            this.f7400j = ":";
            return;
        }
        this.f7399i = str;
        this.f7400j = ": ";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7396f.close();
        int i10 = this.f7398h;
        if (i10 <= 1 && (i10 != 1 || this.f7397g[i10 - 1] == 7)) {
            this.f7398h = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d() {
        return a(3, 5, '}');
    }

    public c e() {
        if (this.f7401k != null) {
            if (this.f7395e) {
                g();
            } else {
                this.f7401k = null;
                return this;
            }
        }
        j();
        this.f7396f.write("null");
        return this;
    }

    public void flush() {
        if (this.f7398h != 0) {
            this.f7396f.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void b(int i10) {
        this.f7397g[this.f7398h - 1] = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f7394d
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.bykv.vk.openvk.preload.a.d.c.f7393b
            goto L9
        L7:
            java.lang.String[] r0 = com.bykv.vk.openvk.preload.a.d.c.f7392a
        L9:
            java.io.Writer r1 = r8.f7396f
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f7396f
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f7396f
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f7396f
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f7396f
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.c.d(java.lang.String):void");
    }

    private c a(int i10, char c) {
        j();
        a(i10);
        this.f7396f.write(c);
        return this;
    }

    public c b(String str) {
        if (str == null) {
            return e();
        }
        g();
        j();
        d(str);
        return this;
    }

    private c a(int i10, int i11, char c) {
        int f10 = f();
        if (f10 != i11 && f10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f7401k == null) {
            this.f7398h--;
            if (f10 == i11) {
                h();
            }
            this.f7396f.write(c);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f7401k);
    }

    public c c() {
        g();
        return a(3, '{');
    }

    private void a(int i10) {
        int i11 = this.f7398h;
        int[] iArr = this.f7397g;
        if (i11 == iArr.length) {
            this.f7397g = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f7397g;
        int i12 = this.f7398h;
        this.f7398h = i12 + 1;
        iArr2[i12] = i10;
    }

    public c a(String str) {
        if (str != null) {
            if (this.f7401k == null) {
                if (this.f7398h != 0) {
                    this.f7401k = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public c a(boolean z10) {
        g();
        j();
        this.f7396f.write(z10 ? "true" : "false");
        return this;
    }

    public c a(Boolean bool) {
        if (bool == null) {
            return e();
        }
        g();
        j();
        this.f7396f.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c a(long j10) {
        g();
        j();
        this.f7396f.write(Long.toString(j10));
        return this;
    }

    public c a(Number number) {
        if (number == null) {
            return e();
        }
        g();
        String obj = number.toString();
        if (!this.c && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        j();
        this.f7396f.append((CharSequence) obj);
        return this;
    }
}
