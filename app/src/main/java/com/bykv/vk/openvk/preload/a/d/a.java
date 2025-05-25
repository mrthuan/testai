package com.bykv.vk.openvk.preload.a.d;

import com.bykv.vk.openvk.preload.a.b.a.e;
import com.bykv.vk.openvk.preload.a.b.f;
import com.bykv.vk.openvk.preload.a.p;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonReader.java */
/* loaded from: classes.dex */
public class a implements Closeable {
    private final Reader c;

    /* renamed from: i  reason: collision with root package name */
    private long f7375i;

    /* renamed from: j  reason: collision with root package name */
    private int f7376j;

    /* renamed from: k  reason: collision with root package name */
    private String f7377k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f7378l;

    /* renamed from: n  reason: collision with root package name */
    private String[] f7380n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f7381o;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7368a = false;

    /* renamed from: d  reason: collision with root package name */
    private final char[] f7370d = new char[1024];

    /* renamed from: e  reason: collision with root package name */
    private int f7371e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f7372f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f7373g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f7374h = 0;

    /* renamed from: b  reason: collision with root package name */
    int f7369b = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f7379m = 0 + 1;

    static {
        f.f7327a = new f() { // from class: com.bykv.vk.openvk.preload.a.d.a.1
            @Override // com.bykv.vk.openvk.preload.a.b.f
            public final void a(a aVar) {
                if (aVar instanceof e) {
                    e eVar = (e) aVar;
                    eVar.a(b.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) eVar.g()).next();
                    eVar.a(entry.getValue());
                    eVar.a(new p((String) entry.getKey()));
                    return;
                }
                int i10 = aVar.f7369b;
                if (i10 == 0) {
                    i10 = aVar.q();
                }
                if (i10 == 13) {
                    aVar.f7369b = 9;
                } else if (i10 == 12) {
                    aVar.f7369b = 8;
                } else if (i10 == 14) {
                    aVar.f7369b = 10;
                } else {
                    throw new IllegalStateException("Expected a name but was " + aVar.f() + aVar.r());
                }
            }
        };
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f7378l = iArr;
        iArr[0] = 6;
        this.f7380n = new String[32];
        this.f7381o = new int[32];
        this.c = reader;
    }

    private int g() {
        String str;
        String str2;
        int i10;
        char c = this.f7370d[this.f7371e];
        if (c != 't' && c != 'T') {
            if (c != 'f' && c != 'F') {
                if (c != 'n' && c != 'N') {
                    return 0;
                }
                str = "null";
                str2 = "NULL";
                i10 = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i10 = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f7371e + i11 >= this.f7372f && !b(i11 + 1)) {
                return 0;
            }
            char c10 = this.f7370d[this.f7371e + i11];
            if (c10 != str.charAt(i11) && c10 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f7371e + length < this.f7372f || b(length + 1)) && a(this.f7370d[this.f7371e + length])) {
            return 0;
        }
        this.f7371e += length;
        this.f7369b = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
        if (a(r14) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0093, code lost:
        if (r9 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0095, code lost:
        if (r10 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009b, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009d, code lost:
        if (r13 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a3, code lost:
        if (r11 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a5, code lost:
        if (r13 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a7, code lost:
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00aa, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ab, code lost:
        r18.f7375i = r11;
        r18.f7371e += r8;
        r18.f7369b = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
        if (r9 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ba, code lost:
        if (r9 == 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bd, code lost:
        if (r9 != 7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c2, code lost:
        r18.f7376j = r8;
        r18.f7369b = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c8, code lost:
        return 16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int s() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.a.s():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        u();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String t() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f7371e
            int r4 = r3 + r2
            int r5 = r6.f7372f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f7370d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.u()
            goto L5c
        L4e:
            char[] r3 = r6.f7370d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.b(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f7370d
            int r4 = r6.f7371e
            r0.append(r3, r4, r2)
            int r3 = r6.f7371e
            int r3 = r3 + r2
            r6.f7371e = r3
            r2 = 1
            boolean r2 = r6.b(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f7370d
            int r3 = r6.f7371e
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f7370d
            int r3 = r6.f7371e
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f7371e
            int r2 = r2 + r1
            r6.f7371e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.d.a.t():java.lang.String");
    }

    private void u() {
        if (this.f7368a) {
            return;
        }
        throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private void v() {
        char c;
        do {
            if (this.f7371e < this.f7372f || b(1)) {
                char[] cArr = this.f7370d;
                int i10 = this.f7371e;
                int i11 = i10 + 1;
                this.f7371e = i11;
                c = cArr[i10];
                if (c == '\n') {
                    this.f7373g++;
                    this.f7374h = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    private char w() {
        int i10;
        int i11;
        if (this.f7371e == this.f7372f && !b(1)) {
            throw b("Unterminated escape sequence");
        }
        char[] cArr = this.f7370d;
        int i12 = this.f7371e;
        int i13 = i12 + 1;
        this.f7371e = i13;
        char c = cArr[i12];
        if (c != '\n') {
            if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                if (c != 'b') {
                    if (c != 'f') {
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i13 + 4 > this.f7372f && !b(4)) {
                                        throw b("Unterminated escape sequence");
                                    }
                                    int i14 = this.f7371e;
                                    int i15 = i14 + 4;
                                    char c10 = 0;
                                    while (i14 < i15) {
                                        char c11 = this.f7370d[i14];
                                        char c12 = (char) (c10 << 4);
                                        if (c11 >= '0' && c11 <= '9') {
                                            i11 = c11 - '0';
                                        } else {
                                            if (c11 >= 'a' && c11 <= 'f') {
                                                i10 = c11 - 'a';
                                            } else if (c11 >= 'A' && c11 <= 'F') {
                                                i10 = c11 - 'A';
                                            } else {
                                                throw new NumberFormatException("\\u".concat(new String(this.f7370d, this.f7371e, 4)));
                                            }
                                            i11 = i10 + 10;
                                        }
                                        c10 = (char) (i11 + c12);
                                        i14++;
                                    }
                                    this.f7371e += 4;
                                    return c10;
                                }
                                throw b("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f7373g++;
            this.f7374h = i13;
        }
        return c;
    }

    private void x() {
        a(true);
        int i10 = this.f7371e - 1;
        this.f7371e = i10;
        if (i10 + 5 > this.f7372f && !b(5)) {
            return;
        }
        char[] cArr = this.f7370d;
        if (cArr[i10] == ')' && cArr[i10 + 1] == ']' && cArr[i10 + 2] == '}' && cArr[i10 + 3] == '\'' && cArr[i10 + 4] == '\n') {
            this.f7371e += 5;
        }
    }

    public void a() {
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 3) {
            a(1);
            this.f7381o[this.f7379m - 1] = 0;
            this.f7369b = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + f() + r());
    }

    public void b() {
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 4) {
            int i11 = this.f7379m - 1;
            this.f7379m = i11;
            int[] iArr = this.f7381o;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f7369b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + f() + r());
    }

    public void c() {
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 1) {
            a(3);
            this.f7369b = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + f() + r());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7369b = 0;
        this.f7378l[0] = 8;
        this.f7379m = 1;
        this.c.close();
    }

    public void d() {
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 2) {
            int i11 = this.f7379m - 1;
            this.f7379m = i11;
            this.f7380n[i11] = null;
            int[] iArr = this.f7381o;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f7369b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + f() + r());
    }

    public boolean e() {
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 != 2 && i10 != 4) {
            return true;
        }
        return false;
    }

    public b f() {
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String h() {
        String b10;
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 14) {
            b10 = t();
        } else if (i10 == 12) {
            b10 = b('\'');
        } else if (i10 == 13) {
            b10 = b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + f() + r());
        }
        this.f7369b = 0;
        this.f7380n[this.f7379m - 1] = b10;
        return b10;
    }

    public String i() {
        String str;
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 10) {
            str = t();
        } else if (i10 == 8) {
            str = b('\'');
        } else if (i10 == 9) {
            str = b('\"');
        } else if (i10 == 11) {
            str = this.f7377k;
            this.f7377k = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f7375i);
        } else if (i10 == 16) {
            str = new String(this.f7370d, this.f7371e, this.f7376j);
            this.f7371e += this.f7376j;
        } else {
            throw new IllegalStateException("Expected a string but was " + f() + r());
        }
        this.f7369b = 0;
        int[] iArr = this.f7381o;
        int i11 = this.f7379m - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public boolean j() {
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 5) {
            this.f7369b = 0;
            int[] iArr = this.f7381o;
            int i11 = this.f7379m - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f7369b = 0;
            int[] iArr2 = this.f7381o;
            int i12 = this.f7379m - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + f() + r());
        }
    }

    public void k() {
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 7) {
            this.f7369b = 0;
            int[] iArr = this.f7381o;
            int i11 = this.f7379m - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + f() + r());
    }

    public double l() {
        char c;
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            this.f7369b = 0;
            int[] iArr = this.f7381o;
            int i11 = this.f7379m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f7375i;
        }
        if (i10 == 16) {
            this.f7377k = new String(this.f7370d, this.f7371e, this.f7376j);
            this.f7371e += this.f7376j;
        } else if (i10 != 8 && i10 != 9) {
            if (i10 == 10) {
                this.f7377k = t();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + f() + r());
            }
        } else {
            if (i10 == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.f7377k = b(c);
        }
        this.f7369b = 11;
        double parseDouble = Double.parseDouble(this.f7377k);
        if (!this.f7368a && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + r());
        }
        this.f7377k = null;
        this.f7369b = 0;
        int[] iArr2 = this.f7381o;
        int i12 = this.f7379m - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public long m() {
        char c;
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            this.f7369b = 0;
            int[] iArr = this.f7381o;
            int i11 = this.f7379m - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f7375i;
        }
        if (i10 == 16) {
            this.f7377k = new String(this.f7370d, this.f7371e, this.f7376j);
            this.f7371e += this.f7376j;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw new IllegalStateException("Expected a long but was " + f() + r());
        } else {
            if (i10 == 10) {
                this.f7377k = t();
            } else {
                if (i10 == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f7377k = b(c);
            }
            try {
                long parseLong = Long.parseLong(this.f7377k);
                this.f7369b = 0;
                int[] iArr2 = this.f7381o;
                int i12 = this.f7379m - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f7369b = 11;
        double parseDouble = Double.parseDouble(this.f7377k);
        long j10 = (long) parseDouble;
        if (j10 == parseDouble) {
            this.f7377k = null;
            this.f7369b = 0;
            int[] iArr3 = this.f7381o;
            int i13 = this.f7379m - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.f7377k + r());
    }

    public int n() {
        char c;
        int i10 = this.f7369b;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            long j10 = this.f7375i;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f7369b = 0;
                int[] iArr = this.f7381o;
                int i12 = this.f7379m - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f7375i + r());
        }
        if (i10 == 16) {
            this.f7377k = new String(this.f7370d, this.f7371e, this.f7376j);
            this.f7371e += this.f7376j;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw new IllegalStateException("Expected an int but was " + f() + r());
        } else {
            if (i10 == 10) {
                this.f7377k = t();
            } else {
                if (i10 == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f7377k = b(c);
            }
            try {
                int parseInt = Integer.parseInt(this.f7377k);
                this.f7369b = 0;
                int[] iArr2 = this.f7381o;
                int i13 = this.f7379m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f7369b = 11;
        double parseDouble = Double.parseDouble(this.f7377k);
        int i14 = (int) parseDouble;
        if (i14 == parseDouble) {
            this.f7377k = null;
            this.f7369b = 0;
            int[] iArr3 = this.f7381o;
            int i15 = this.f7379m - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f7377k + r());
    }

    public void o() {
        int i10 = 0;
        do {
            int i11 = this.f7369b;
            if (i11 == 0) {
                i11 = q();
            }
            if (i11 == 3) {
                a(1);
            } else if (i11 == 1) {
                a(3);
            } else {
                if (i11 == 4) {
                    this.f7379m--;
                } else if (i11 == 2) {
                    this.f7379m--;
                } else {
                    if (i11 != 14 && i11 != 10) {
                        if (i11 != 8 && i11 != 12) {
                            if (i11 != 9 && i11 != 13) {
                                if (i11 == 16) {
                                    this.f7371e += this.f7376j;
                                }
                            } else {
                                c('\"');
                            }
                        } else {
                            c('\'');
                        }
                    } else {
                        do {
                            int i12 = 0;
                            while (true) {
                                int i13 = this.f7371e;
                                if (i13 + i12 < this.f7372f) {
                                    char c = this.f7370d[i13 + i12];
                                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                        if (c != '#') {
                                            if (c != ',') {
                                                if (c != '/' && c != '=') {
                                                    if (c != '{' && c != '}' && c != ':') {
                                                        if (c != ';') {
                                                            switch (c) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i12++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f7371e = i13 + i12;
                                }
                            }
                            u();
                            this.f7371e += i12;
                        } while (b(1));
                    }
                    this.f7369b = 0;
                }
                i10--;
                this.f7369b = 0;
            }
            i10++;
            this.f7369b = 0;
        } while (i10 != 0);
        int[] iArr = this.f7381o;
        int i14 = this.f7379m;
        int i15 = i14 - 1;
        iArr[i15] = iArr[i15] + 1;
        this.f7380n[i14 - 1] = "null";
    }

    public String p() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.f7379m;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f7378l[i11];
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3 || i12 == 4 || i12 == 5) {
                    sb2.append('.');
                    String str = this.f7380n[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(this.f7381o[i11]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }

    public final int q() {
        int a10;
        int[] iArr = this.f7378l;
        int i10 = this.f7379m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int a11 = a(true);
            if (a11 != 44) {
                if (a11 != 59) {
                    if (a11 == 93) {
                        this.f7369b = 4;
                        return 4;
                    }
                    throw b("Unterminated array");
                }
                u();
            }
        } else if (i11 != 3 && i11 != 5) {
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int a12 = a(true);
                if (a12 != 58) {
                    if (a12 == 61) {
                        u();
                        if (this.f7371e < this.f7372f || b(1)) {
                            char[] cArr = this.f7370d;
                            int i12 = this.f7371e;
                            if (cArr[i12] == '>') {
                                this.f7371e = i12 + 1;
                            }
                        }
                    } else {
                        throw b("Expected ':'");
                    }
                }
            } else if (i11 == 6) {
                if (this.f7368a) {
                    x();
                }
                this.f7378l[this.f7379m - 1] = 7;
            } else if (i11 == 7) {
                if (a(false) == -1) {
                    this.f7369b = 17;
                    return 17;
                }
                u();
                this.f7371e--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i10 - 1] = 4;
            if (i11 == 5 && (a10 = a(true)) != 44) {
                if (a10 != 59) {
                    if (a10 == 125) {
                        this.f7369b = 2;
                        return 2;
                    }
                    throw b("Unterminated object");
                }
                u();
            }
            int a13 = a(true);
            if (a13 != 34) {
                if (a13 != 39) {
                    if (a13 != 125) {
                        u();
                        this.f7371e--;
                        if (a((char) a13)) {
                            this.f7369b = 14;
                            return 14;
                        }
                        throw b("Expected name");
                    } else if (i11 != 5) {
                        this.f7369b = 2;
                        return 2;
                    } else {
                        throw b("Expected name");
                    }
                }
                u();
                this.f7369b = 12;
                return 12;
            }
            this.f7369b = 13;
            return 13;
        }
        int a14 = a(true);
        if (a14 != 34) {
            if (a14 != 39) {
                if (a14 != 44 && a14 != 59) {
                    if (a14 != 91) {
                        if (a14 != 93) {
                            if (a14 != 123) {
                                this.f7371e--;
                                int g10 = g();
                                if (g10 != 0) {
                                    return g10;
                                }
                                int s4 = s();
                                if (s4 != 0) {
                                    return s4;
                                }
                                if (a(this.f7370d[this.f7371e])) {
                                    u();
                                    this.f7369b = 10;
                                    return 10;
                                }
                                throw b("Expected value");
                            }
                            this.f7369b = 1;
                            return 1;
                        } else if (i11 == 1) {
                            this.f7369b = 4;
                            return 4;
                        }
                    } else {
                        this.f7369b = 3;
                        return 3;
                    }
                }
                if (i11 != 1 && i11 != 2) {
                    throw b("Unexpected value");
                }
                u();
                this.f7371e--;
                this.f7369b = 7;
                return 7;
            }
            u();
            this.f7369b = 8;
            return 8;
        }
        this.f7369b = 9;
        return 9;
    }

    public final String r() {
        StringBuilder f10 = a0.d.f(" at line ", this.f7373g + 1, " column ", (this.f7371e - this.f7374h) + 1, " path ");
        f10.append(p());
        return f10.toString();
    }

    public String toString() {
        return getClass().getSimpleName() + r();
    }

    private void c(char c) {
        char[] cArr = this.f7370d;
        while (true) {
            int i10 = this.f7371e;
            int i11 = this.f7372f;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c10 = cArr[i10];
                    if (c10 == c) {
                        this.f7371e = i12;
                        return;
                    } else if (c10 == '\\') {
                        this.f7371e = i12;
                        w();
                        break;
                    } else {
                        if (c10 == '\n') {
                            this.f7373g++;
                            this.f7374h = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f7371e = i10;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    private boolean a(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        u();
        return false;
    }

    private String b(char c) {
        char[] cArr = this.f7370d;
        StringBuilder sb2 = null;
        while (true) {
            int i10 = this.f7371e;
            int i11 = this.f7372f;
            int i12 = i10;
            while (true) {
                if (i12 < i11) {
                    int i13 = i12 + 1;
                    char c10 = cArr[i12];
                    if (c10 == c) {
                        this.f7371e = i13;
                        int i14 = (i13 - i10) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i10, i14);
                        }
                        sb2.append(cArr, i10, i14);
                        return sb2.toString();
                    } else if (c10 == '\\') {
                        this.f7371e = i13;
                        int i15 = (i13 - i10) - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max((i15 + 1) * 2, 16));
                        }
                        sb2.append(cArr, i10, i15);
                        sb2.append(w());
                    } else {
                        if (c10 == '\n') {
                            this.f7373g++;
                            this.f7374h = i13;
                        }
                        i12 = i13;
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i12 - i10) * 2, 16));
                    }
                    sb2.append(cArr, i10, i12 - i10);
                    this.f7371e = i12;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                }
            }
        }
    }

    private void a(int i10) {
        int i11 = this.f7379m;
        int[] iArr = this.f7378l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f7378l = Arrays.copyOf(iArr, i12);
            this.f7381o = Arrays.copyOf(this.f7381o, i12);
            this.f7380n = (String[]) Arrays.copyOf(this.f7380n, i12);
        }
        int[] iArr2 = this.f7378l;
        int i13 = this.f7379m;
        this.f7379m = i13 + 1;
        iArr2[i13] = i10;
    }

    private int a(boolean z10) {
        char[] cArr = this.f7370d;
        int i10 = this.f7371e;
        int i11 = this.f7372f;
        while (true) {
            if (i10 == i11) {
                this.f7371e = i10;
                if (!b(1)) {
                    if (z10) {
                        throw new EOFException("End of input" + r());
                    }
                    return -1;
                }
                i10 = this.f7371e;
                i11 = this.f7372f;
            }
            int i12 = i10 + 1;
            char c = cArr[i10];
            if (c == '\n') {
                this.f7373g++;
                this.f7374h = i12;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f7371e = i12;
                    if (i12 == i11) {
                        this.f7371e = i12 - 1;
                        boolean b10 = b(2);
                        this.f7371e++;
                        if (!b10) {
                            return c;
                        }
                    }
                    u();
                    int i13 = this.f7371e;
                    char c10 = cArr[i13];
                    if (c10 == '*') {
                        this.f7371e = i13 + 1;
                        if (a("*/")) {
                            i10 = this.f7371e + 2;
                            i11 = this.f7372f;
                        } else {
                            throw b("Unterminated comment");
                        }
                    } else if (c10 != '/') {
                        return c;
                    } else {
                        this.f7371e = i13 + 1;
                        v();
                        i10 = this.f7371e;
                        i11 = this.f7372f;
                    }
                } else if (c == '#') {
                    this.f7371e = i12;
                    u();
                    v();
                    i10 = this.f7371e;
                    i11 = this.f7372f;
                } else {
                    this.f7371e = i12;
                    return c;
                }
            }
            i10 = i12;
        }
    }

    private boolean b(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f7370d;
        int i13 = this.f7374h;
        int i14 = this.f7371e;
        this.f7374h = i13 - i14;
        int i15 = this.f7372f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f7372f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f7372f = 0;
        }
        this.f7371e = 0;
        do {
            Reader reader = this.c;
            int i17 = this.f7372f;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f7372f + read;
            this.f7372f = i11;
            if (this.f7373g == 0 && (i12 = this.f7374h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f7371e++;
                this.f7374h = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    private IOException b(String str) {
        StringBuilder k10 = a0.a.k(str);
        k10.append(r());
        throw new d(k10.toString());
    }

    private boolean a(String str) {
        int i10;
        int length = str.length();
        while (true) {
            if (this.f7371e + length > this.f7372f && !b(length)) {
                return false;
            }
            char[] cArr = this.f7370d;
            int i11 = this.f7371e;
            if (cArr[i11] != '\n') {
                while (i10 < length) {
                    i10 = this.f7370d[this.f7371e + i10] == str.charAt(i10) ? i10 + 1 : 0;
                }
                return true;
            }
            this.f7373g++;
            this.f7374h = i11 + 1;
            this.f7371e++;
        }
    }
