package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import kk.f;
import kk.h;
import kk.t;
import okio.ByteString;

/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes.dex */
public final class a extends JsonReader {

    /* renamed from: l  reason: collision with root package name */
    public static final ByteString f6160l = ByteString.encodeUtf8("'\\");

    /* renamed from: m  reason: collision with root package name */
    public static final ByteString f6161m = ByteString.encodeUtf8("\"\\");

    /* renamed from: n  reason: collision with root package name */
    public static final ByteString f6162n = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: f  reason: collision with root package name */
    public final h f6163f;

    /* renamed from: g  reason: collision with root package name */
    public final f f6164g;

    /* renamed from: h  reason: collision with root package name */
    public int f6165h = 0;

    /* renamed from: i  reason: collision with root package name */
    public long f6166i;

    /* renamed from: j  reason: collision with root package name */
    public int f6167j;

    /* renamed from: k  reason: collision with root package name */
    public String f6168k;

    static {
        ByteString.encodeUtf8("\n\r");
        ByteString.encodeUtf8("*/");
    }

    public a(t tVar) {
        this.f6163f = tVar;
        this.f6164g = tVar.f19848b;
        n(6);
    }

    public final String Q(ByteString byteString) {
        StringBuilder sb2 = null;
        while (true) {
            long H = this.f6163f.H(byteString);
            if (H != -1) {
                f fVar = this.f6164g;
                if (fVar.c(H) == 92) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(fVar.l(H));
                    fVar.readByte();
                    sb2.append(T());
                } else if (sb2 == null) {
                    String l10 = fVar.l(H);
                    fVar.readByte();
                    return l10;
                } else {
                    sb2.append(fVar.l(H));
                    fVar.readByte();
                    return sb2.toString();
                }
            } else {
                r("Unterminated string");
                throw null;
            }
        }
    }

    public final String R() {
        long H = this.f6163f.H(f6162n);
        int i10 = (H > (-1L) ? 1 : (H == (-1L) ? 0 : -1));
        f fVar = this.f6164g;
        if (i10 != 0) {
            return fVar.l(H);
        }
        return fVar.k();
    }

    public final char T() {
        int i10;
        int i11;
        h hVar = this.f6163f;
        if (hVar.S(1L)) {
            f fVar = this.f6164g;
            byte readByte = fVar.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte == 117) {
                                    if (hVar.S(4L)) {
                                        char c = 0;
                                        for (int i12 = 0; i12 < 4; i12++) {
                                            byte c10 = fVar.c(i12);
                                            char c11 = (char) (c << 4);
                                            if (c10 >= 48 && c10 <= 57) {
                                                i11 = c10 - 48;
                                            } else {
                                                if (c10 >= 97 && c10 <= 102) {
                                                    i10 = c10 - 97;
                                                } else if (c10 < 65 || c10 > 70) {
                                                    r("\\u".concat(fVar.l(4L)));
                                                    throw null;
                                                } else {
                                                    i10 = c10 - 65;
                                                }
                                                i11 = i10 + 10;
                                            }
                                            c = (char) (i11 + c11);
                                        }
                                        fVar.skip(4L);
                                        return c;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path " + f());
                                }
                                r("Invalid escape sequence: \\" + ((char) readByte));
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        r("Unterminated escape sequence");
        throw null;
    }

    public final void U(ByteString byteString) {
        while (true) {
            long H = this.f6163f.H(byteString);
            if (H != -1) {
                f fVar = this.f6164g;
                if (fVar.c(H) == 92) {
                    fVar.skip(H + 1);
                    T();
                } else {
                    fVar.skip(H + 1);
                    return;
                }
            } else {
                r("Unterminated string");
                throw null;
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void a() {
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        if (i10 == 3) {
            n(1);
            this.f6156d[this.f6154a - 1] = 0;
            this.f6165h = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + m() + " at path " + f());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void b() {
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        if (i10 == 1) {
            n(3);
            this.f6165h = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + m() + " at path " + f());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void c() {
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        if (i10 == 4) {
            int i11 = this.f6154a - 1;
            this.f6154a = i11;
            int[] iArr = this.f6156d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f6165h = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + m() + " at path " + f());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6165h = 0;
        this.f6155b[0] = 8;
        this.f6154a = 1;
        this.f6164g.clear();
        this.f6163f.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void d() {
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        if (i10 == 2) {
            int i11 = this.f6154a - 1;
            this.f6154a = i11;
            this.c[i11] = null;
            int[] iArr = this.f6156d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f6165h = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + m() + " at path " + f());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean h() {
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        if (i10 != 2 && i10 != 4 && i10 != 18) {
            return true;
        }
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean i() {
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        if (i10 == 5) {
            this.f6165h = 0;
            int[] iArr = this.f6156d;
            int i11 = this.f6154a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f6165h = 0;
            int[] iArr2 = this.f6156d;
            int i12 = this.f6154a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + m() + " at path " + f());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double j() {
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        if (i10 == 16) {
            this.f6165h = 0;
            int[] iArr = this.f6156d;
            int i11 = this.f6154a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f6166i;
        }
        if (i10 == 17) {
            this.f6168k = this.f6164g.l(this.f6167j);
        } else if (i10 == 9) {
            this.f6168k = Q(f6161m);
        } else if (i10 == 8) {
            this.f6168k = Q(f6160l);
        } else if (i10 == 10) {
            this.f6168k = R();
        } else if (i10 != 11) {
            throw new JsonDataException("Expected a double but was " + m() + " at path " + f());
        }
        this.f6165h = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6168k);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.f6168k = null;
                this.f6165h = 0;
                int[] iArr2 = this.f6156d;
                int i12 = this.f6154a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseDouble;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + f());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f6168k + " at path " + f());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int k() {
        String Q;
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        if (i10 == 16) {
            long j10 = this.f6166i;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f6165h = 0;
                int[] iArr = this.f6156d;
                int i12 = this.f6154a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new JsonDataException("Expected an int but was " + this.f6166i + " at path " + f());
        }
        if (i10 == 17) {
            this.f6168k = this.f6164g.l(this.f6167j);
        } else if (i10 != 9 && i10 != 8) {
            if (i10 != 11) {
                throw new JsonDataException("Expected an int but was " + m() + " at path " + f());
            }
        } else {
            if (i10 == 9) {
                Q = Q(f6161m);
            } else {
                Q = Q(f6160l);
            }
            this.f6168k = Q;
            try {
                int parseInt = Integer.parseInt(Q);
                this.f6165h = 0;
                int[] iArr2 = this.f6156d;
                int i13 = this.f6154a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f6165h = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6168k);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.f6168k = null;
                this.f6165h = 0;
                int[] iArr3 = this.f6156d;
                int i15 = this.f6154a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new JsonDataException("Expected an int but was " + this.f6168k + " at path " + f());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f6168k + " at path " + f());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String l() {
        String l10;
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        if (i10 == 10) {
            l10 = R();
        } else if (i10 == 9) {
            l10 = Q(f6161m);
        } else if (i10 == 8) {
            l10 = Q(f6160l);
        } else if (i10 == 11) {
            l10 = this.f6168k;
            this.f6168k = null;
        } else if (i10 == 16) {
            l10 = Long.toString(this.f6166i);
        } else if (i10 == 17) {
            l10 = this.f6164g.l(this.f6167j);
        } else {
            throw new JsonDataException("Expected a string but was " + m() + " at path " + f());
        }
        this.f6165h = 0;
        int[] iArr = this.f6156d;
        int i11 = this.f6154a - 1;
        iArr[i11] = iArr[i11] + 1;
        return l10;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final JsonReader.Token m() {
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        switch (i10) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int o(JsonReader.a aVar) {
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return u(this.f6168k, aVar);
        }
        int X = this.f6163f.X(aVar.f6159b);
        if (X != -1) {
            this.f6165h = 0;
            this.c[this.f6154a - 1] = aVar.f6158a[X];
            return X;
        }
        String str = this.c[this.f6154a - 1];
        String w7 = w();
        int u7 = u(w7, aVar);
        if (u7 == -1) {
            this.f6165h = 15;
            this.f6168k = w7;
            this.c[this.f6154a - 1] = str;
        }
        return u7;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void p() {
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        if (i10 == 14) {
            long H = this.f6163f.H(f6162n);
            int i11 = (H > (-1L) ? 1 : (H == (-1L) ? 0 : -1));
            f fVar = this.f6164g;
            if (i11 == 0) {
                H = fVar.f19826b;
            }
            fVar.skip(H);
        } else if (i10 == 13) {
            U(f6161m);
        } else if (i10 == 12) {
            U(f6160l);
        } else if (i10 != 15) {
            throw new JsonDataException("Expected a name but was " + m() + " at path " + f());
        }
        this.f6165h = 0;
        this.c[this.f6154a - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void q() {
        int i10 = 0;
        do {
            int i11 = this.f6165h;
            if (i11 == 0) {
                i11 = t();
            }
            if (i11 == 3) {
                n(1);
            } else if (i11 == 1) {
                n(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 >= 0) {
                        this.f6154a--;
                    } else {
                        throw new JsonDataException("Expected a value but was " + m() + " at path " + f());
                    }
                } else if (i11 == 2) {
                    i10--;
                    if (i10 >= 0) {
                        this.f6154a--;
                    } else {
                        throw new JsonDataException("Expected a value but was " + m() + " at path " + f());
                    }
                } else {
                    f fVar = this.f6164g;
                    if (i11 != 14 && i11 != 10) {
                        if (i11 != 9 && i11 != 13) {
                            if (i11 != 8 && i11 != 12) {
                                if (i11 == 17) {
                                    fVar.skip(this.f6167j);
                                } else if (i11 == 18) {
                                    throw new JsonDataException("Expected a value but was " + m() + " at path " + f());
                                }
                            } else {
                                U(f6160l);
                            }
                        } else {
                            U(f6161m);
                        }
                    } else {
                        long H = this.f6163f.H(f6162n);
                        if (H == -1) {
                            H = fVar.f19826b;
                        }
                        fVar.skip(H);
                    }
                }
                this.f6165h = 0;
            }
            i10++;
            this.f6165h = 0;
        } while (i10 != 0);
        int[] iArr = this.f6156d;
        int i12 = this.f6154a;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.c[i12 - 1] = "null";
    }

    public final void s() {
        r("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0193, code lost:
        if (v(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0195, code lost:
        if (r4 != 2) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0197, code lost:
        if (r6 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x019d, code lost:
        if (r10 != Long.MIN_VALUE) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x019f, code lost:
        if (r7 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a5, code lost:
        if (r10 != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a7, code lost:
        if (r7 != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a9, code lost:
        if (r7 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ac, code lost:
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01ad, code lost:
        r17.f6166i = r10;
        r5.skip(r3);
        r8 = 16;
        r17.f6165h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b8, code lost:
        if (r4 == 2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01bb, code lost:
        if (r4 == 4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01be, code lost:
        if (r4 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c0, code lost:
        r17.f6167j = r3;
        r8 = 17;
        r17.f6165h = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int t() {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.a.t():int");
    }

    public final String toString() {
        return "JsonReader(" + this.f6163f + ")";
    }

    public final int u(String str, JsonReader.a aVar) {
        int length = aVar.f6158a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f6158a[i10])) {
                this.f6165h = 0;
                this.c[this.f6154a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean v(int i10) {
        if (i10 != 9 && i10 != 10 && i10 != 12 && i10 != 13 && i10 != 32) {
            if (i10 != 35) {
                if (i10 != 44) {
                    if (i10 != 47 && i10 != 61) {
                        if (i10 != 123 && i10 != 125 && i10 != 58) {
                            if (i10 != 59) {
                                switch (i10) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            s();
            throw null;
        }
        return false;
    }

    public final String w() {
        String str;
        int i10 = this.f6165h;
        if (i10 == 0) {
            i10 = t();
        }
        if (i10 == 14) {
            str = R();
        } else if (i10 == 13) {
            str = Q(f6161m);
        } else if (i10 == 12) {
            str = Q(f6160l);
        } else if (i10 == 15) {
            str = this.f6168k;
        } else {
            throw new JsonDataException("Expected a name but was " + m() + " at path " + f());
        }
        this.f6165h = 0;
        this.c[this.f6154a - 1] = str;
        return str;
    }

    public final int x(boolean z10) {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            h hVar = this.f6163f;
            if (hVar.S(i11)) {
                long j10 = i10;
                f fVar = this.f6164g;
                byte c = fVar.c(j10);
                if (c != 10 && c != 32 && c != 13 && c != 9) {
                    fVar.skip(i11 - 1);
                    if (c == 47) {
                        if (!hVar.S(2L)) {
                            return c;
                        }
                        s();
                        throw null;
                    } else if (c != 35) {
                        return c;
                    } else {
                        s();
                        throw null;
                    }
                }
                i10 = i11;
            } else if (!z10) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }
}
