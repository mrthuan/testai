package ek;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.api.Api;
import ek.o;
import ek.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import okio.ByteString;

/* compiled from: Hpack.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ek.a[] f16650a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<ByteString, Integer> f16651b;

    /* compiled from: Hpack.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public final kk.t f16654d;

        /* renamed from: g  reason: collision with root package name */
        public int f16657g;

        /* renamed from: h  reason: collision with root package name */
        public int f16658h;

        /* renamed from: a  reason: collision with root package name */
        public final int f16652a = 4096;

        /* renamed from: b  reason: collision with root package name */
        public int f16653b = 4096;
        public final ArrayList c = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public ek.a[] f16655e = new ek.a[8];

        /* renamed from: f  reason: collision with root package name */
        public int f16656f = 7;

        public a(o.b bVar) {
            this.f16654d = ge.a.m(bVar);
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f16655e.length;
                while (true) {
                    length--;
                    i11 = this.f16656f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    ek.a aVar = this.f16655e[length];
                    kotlin.jvm.internal.g.b(aVar);
                    int i13 = aVar.c;
                    i10 -= i13;
                    this.f16658h -= i13;
                    this.f16657g--;
                    i12++;
                }
                ek.a[] aVarArr = this.f16655e;
                System.arraycopy(aVarArr, i11 + 1, aVarArr, i11 + 1 + i12, this.f16657g);
                this.f16656f += i12;
            }
            return i12;
        }

        public final ByteString b(int i10) {
            boolean z10;
            if (i10 >= 0 && i10 <= b.f16650a.length - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return b.f16650a[i10].f16648a;
            }
            int length = this.f16656f + 1 + (i10 - b.f16650a.length);
            if (length >= 0) {
                ek.a[] aVarArr = this.f16655e;
                if (length < aVarArr.length) {
                    ek.a aVar = aVarArr[length];
                    kotlin.jvm.internal.g.b(aVar);
                    return aVar.f16648a;
                }
            }
            throw new IOException(kotlin.jvm.internal.g.h(Integer.valueOf(i10 + 1), "Header index too large "));
        }

        public final void c(ek.a aVar) {
            this.c.add(aVar);
            int i10 = this.f16653b;
            int i11 = aVar.c;
            if (i11 > i10) {
                kotlin.collections.f.B(this.f16655e, null);
                this.f16656f = this.f16655e.length - 1;
                this.f16657g = 0;
                this.f16658h = 0;
                return;
            }
            a((this.f16658h + i11) - i10);
            int i12 = this.f16657g + 1;
            ek.a[] aVarArr = this.f16655e;
            if (i12 > aVarArr.length) {
                ek.a[] aVarArr2 = new ek.a[aVarArr.length * 2];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f16656f = this.f16655e.length - 1;
                this.f16655e = aVarArr2;
            }
            int i13 = this.f16656f;
            this.f16656f = i13 - 1;
            this.f16655e[i13] = aVar;
            this.f16657g++;
            this.f16658h += i11;
        }

        public final ByteString d() {
            boolean z10;
            int i10;
            kk.t source = this.f16654d;
            byte readByte = source.readByte();
            byte[] bArr = ak.b.f665a;
            int i11 = readByte & 255;
            int i12 = 0;
            if ((i11 & 128) == 128) {
                z10 = true;
            } else {
                z10 = false;
            }
            long e10 = e(i11, ShapeTypes.VERTICAL_SCROLL);
            if (z10) {
                kk.f fVar = new kk.f();
                int[] iArr = r.f16783a;
                kotlin.jvm.internal.g.e(source, "source");
                r.a aVar = r.c;
                long j10 = 0;
                r.a aVar2 = aVar;
                int i13 = 0;
                while (j10 < e10) {
                    j10++;
                    byte readByte2 = source.readByte();
                    byte[] bArr2 = ak.b.f665a;
                    i12 = (i12 << 8) | (readByte2 & 255);
                    i13 += 8;
                    while (i13 >= 8) {
                        int i14 = i13 - 8;
                        int i15 = (i12 >>> i14) & FunctionEval.FunctionID.EXTERNAL_FUNC;
                        r.a[] aVarArr = aVar2.f16785a;
                        kotlin.jvm.internal.g.b(aVarArr);
                        aVar2 = aVarArr[i15];
                        kotlin.jvm.internal.g.b(aVar2);
                        if (aVar2.f16785a == null) {
                            fVar.q(aVar2.f16786b);
                            i13 -= aVar2.c;
                            aVar2 = aVar;
                        } else {
                            i13 = i14;
                        }
                    }
                }
                while (i13 > 0) {
                    int i16 = (i12 << (8 - i13)) & FunctionEval.FunctionID.EXTERNAL_FUNC;
                    r.a[] aVarArr2 = aVar2.f16785a;
                    kotlin.jvm.internal.g.b(aVarArr2);
                    r.a aVar3 = aVarArr2[i16];
                    kotlin.jvm.internal.g.b(aVar3);
                    if (aVar3.f16785a != null || (i10 = aVar3.c) > i13) {
                        break;
                    }
                    fVar.q(aVar3.f16786b);
                    i13 -= i10;
                    aVar2 = aVar;
                }
                return fVar.e(fVar.f19826b);
            }
            return source.e(e10);
        }

        public final int e(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                byte readByte = this.f16654d.readByte();
                byte[] bArr = ak.b.f665a;
                int i14 = readByte & 255;
                if ((i14 & 128) != 0) {
                    i11 += (i14 & ShapeTypes.VERTICAL_SCROLL) << i13;
                    i13 += 7;
                } else {
                    return i11 + (i14 << i13);
                }
            }
        }
    }

    /* compiled from: Hpack.kt */
    /* renamed from: ek.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0212b {

        /* renamed from: b  reason: collision with root package name */
        public final kk.f f16660b;

        /* renamed from: d  reason: collision with root package name */
        public boolean f16661d;

        /* renamed from: h  reason: collision with root package name */
        public int f16665h;

        /* renamed from: i  reason: collision with root package name */
        public int f16666i;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16659a = true;
        public int c = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: e  reason: collision with root package name */
        public int f16662e = 4096;

        /* renamed from: f  reason: collision with root package name */
        public ek.a[] f16663f = new ek.a[8];

        /* renamed from: g  reason: collision with root package name */
        public int f16664g = 7;

        public C0212b(kk.f fVar) {
            this.f16660b = fVar;
        }

        public final void a(int i10) {
            int i11;
            if (i10 > 0) {
                int length = this.f16663f.length - 1;
                int i12 = 0;
                while (true) {
                    i11 = this.f16664g;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    ek.a aVar = this.f16663f[length];
                    kotlin.jvm.internal.g.b(aVar);
                    i10 -= aVar.c;
                    int i13 = this.f16666i;
                    ek.a aVar2 = this.f16663f[length];
                    kotlin.jvm.internal.g.b(aVar2);
                    this.f16666i = i13 - aVar2.c;
                    this.f16665h--;
                    i12++;
                    length--;
                }
                ek.a[] aVarArr = this.f16663f;
                int i14 = i11 + 1;
                System.arraycopy(aVarArr, i14, aVarArr, i14 + i12, this.f16665h);
                ek.a[] aVarArr2 = this.f16663f;
                int i15 = this.f16664g + 1;
                Arrays.fill(aVarArr2, i15, i15 + i12, (Object) null);
                this.f16664g += i12;
            }
        }

        public final void b(ek.a aVar) {
            int i10 = this.f16662e;
            int i11 = aVar.c;
            if (i11 > i10) {
                kotlin.collections.f.B(this.f16663f, null);
                this.f16664g = this.f16663f.length - 1;
                this.f16665h = 0;
                this.f16666i = 0;
                return;
            }
            a((this.f16666i + i11) - i10);
            int i12 = this.f16665h + 1;
            ek.a[] aVarArr = this.f16663f;
            if (i12 > aVarArr.length) {
                ek.a[] aVarArr2 = new ek.a[aVarArr.length * 2];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f16664g = this.f16663f.length - 1;
                this.f16663f = aVarArr2;
            }
            int i13 = this.f16664g;
            this.f16664g = i13 - 1;
            this.f16663f[i13] = aVar;
            this.f16665h++;
            this.f16666i += i11;
        }

        public final void c(ByteString data) {
            kotlin.jvm.internal.g.e(data, "data");
            boolean z10 = this.f16659a;
            kk.f fVar = this.f16660b;
            int i10 = 0;
            if (z10) {
                int[] iArr = r.f16783a;
                int size = data.size();
                int i11 = 0;
                long j10 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    byte b10 = data.getByte(i11);
                    byte[] bArr = ak.b.f665a;
                    j10 += r.f16784b[b10 & 255];
                    i11 = i12;
                }
                if (((int) ((j10 + 7) >> 3)) < data.size()) {
                    kk.f fVar2 = new kk.f();
                    int[] iArr2 = r.f16783a;
                    int size2 = data.size();
                    long j11 = 0;
                    byte b11 = 0;
                    while (i10 < size2) {
                        int i13 = i10 + 1;
                        byte b12 = data.getByte(i10);
                        byte[] bArr2 = ak.b.f665a;
                        int i14 = b12 & 255;
                        int i15 = r.f16783a[i14];
                        byte b13 = r.f16784b[i14];
                        j11 = (j11 << b13) | i15;
                        int i16 = b11 + b13;
                        while (i16 >= 8) {
                            i16 = (i16 == 1 ? 1 : 0) - 8;
                            fVar2.q((int) (j11 >> i16));
                        }
                        i10 = i13;
                        b11 = i16;
                    }
                    if (b11 > 0) {
                        fVar2.q((int) ((255 >>> b11) | (j11 << (8 - b11))));
                    }
                    ByteString e10 = fVar2.e(fVar2.f19826b);
                    e(e10.size(), ShapeTypes.VERTICAL_SCROLL, 128);
                    fVar.p(e10);
                    return;
                }
            }
            e(data.size(), ShapeTypes.VERTICAL_SCROLL, 0);
            fVar.p(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(java.util.ArrayList r14) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ek.b.C0212b.d(java.util.ArrayList):void");
        }

        public final void e(int i10, int i11, int i12) {
            kk.f fVar = this.f16660b;
            if (i10 < i11) {
                fVar.q(i10 | i12);
                return;
            }
            fVar.q(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                fVar.q(128 | (i13 & ShapeTypes.VERTICAL_SCROLL));
                i13 >>>= 7;
            }
            fVar.q(i13);
        }
    }

    static {
        ek.a aVar = new ek.a("", ek.a.f16647i);
        int i10 = 0;
        ByteString byteString = ek.a.f16644f;
        ByteString byteString2 = ek.a.f16645g;
        ByteString byteString3 = ek.a.f16646h;
        ByteString byteString4 = ek.a.f16643e;
        ek.a[] aVarArr = {aVar, new ek.a("GET", byteString), new ek.a("POST", byteString), new ek.a(PackagingURIHelper.FORWARD_SLASH_STRING, byteString2), new ek.a("/index.html", byteString2), new ek.a("http", byteString3), new ek.a(Constants.SCHEME, byteString3), new ek.a("200", byteString4), new ek.a("204", byteString4), new ek.a("206", byteString4), new ek.a("304", byteString4), new ek.a("400", byteString4), new ek.a("404", byteString4), new ek.a("500", byteString4), new ek.a("accept-charset", ""), new ek.a("accept-encoding", "gzip, deflate"), new ek.a("accept-language", ""), new ek.a("accept-ranges", ""), new ek.a("accept", ""), new ek.a("access-control-allow-origin", ""), new ek.a("age", ""), new ek.a("allow", ""), new ek.a("authorization", ""), new ek.a("cache-control", ""), new ek.a("content-disposition", ""), new ek.a("content-encoding", ""), new ek.a("content-language", ""), new ek.a("content-length", ""), new ek.a("content-location", ""), new ek.a("content-range", ""), new ek.a("content-type", ""), new ek.a("cookie", ""), new ek.a("date", ""), new ek.a("etag", ""), new ek.a("expect", ""), new ek.a("expires", ""), new ek.a("from", ""), new ek.a("host", ""), new ek.a("if-match", ""), new ek.a("if-modified-since", ""), new ek.a("if-none-match", ""), new ek.a("if-range", ""), new ek.a("if-unmodified-since", ""), new ek.a("last-modified", ""), new ek.a("link", ""), new ek.a("location", ""), new ek.a("max-forwards", ""), new ek.a("proxy-authenticate", ""), new ek.a("proxy-authorization", ""), new ek.a("range", ""), new ek.a("referer", ""), new ek.a("refresh", ""), new ek.a("retry-after", ""), new ek.a("server", ""), new ek.a("set-cookie", ""), new ek.a("strict-transport-security", ""), new ek.a("transfer-encoding", ""), new ek.a("user-agent", ""), new ek.a("vary", ""), new ek.a("via", ""), new ek.a("www-authenticate", "")};
        f16650a = aVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (i10 < 61) {
            int i11 = i10 + 1;
            if (!linkedHashMap.containsKey(aVarArr[i10].f16648a)) {
                linkedHashMap.put(aVarArr[i10].f16648a, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Map<ByteString, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.g.d(unmodifiableMap, "unmodifiableMap(result)");
        f16651b = unmodifiableMap;
    }

    public static void a(ByteString name) {
        boolean z10;
        kotlin.jvm.internal.g.e(name, "name");
        int size = name.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            byte b10 = name.getByte(i10);
            if (65 <= b10 && b10 <= 90) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i10 = i11;
            } else {
                throw new IOException(kotlin.jvm.internal.g.h(name.utf8(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
        }
    }
}
