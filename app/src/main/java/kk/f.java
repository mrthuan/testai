package kk;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import okio.ByteString;
import okio.SegmentedByteString;

/* compiled from: Buffer.kt */
/* loaded from: classes3.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public u f19825a;

    /* renamed from: b  reason: collision with root package name */
    public long f19826b;

    @Override // kk.w
    public final void D(f source, long j10) {
        boolean z10;
        u uVar;
        boolean z11;
        int i10;
        u uVar2;
        boolean z12;
        u b10;
        int i11;
        kotlin.jvm.internal.g.e(source, "source");
        if (source != this) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            androidx.activity.s.u(source.f19826b, 0L, j10);
            while (j10 > 0) {
                u uVar3 = source.f19825a;
                kotlin.jvm.internal.g.b(uVar3);
                int i12 = uVar3.c;
                kotlin.jvm.internal.g.b(source.f19825a);
                if (j10 < i12 - uVar.f19850b) {
                    u uVar4 = this.f19825a;
                    if (uVar4 != null) {
                        uVar2 = uVar4.f19854g;
                    } else {
                        uVar2 = null;
                    }
                    if (uVar2 != null && uVar2.f19852e) {
                        long j11 = uVar2.c + j10;
                        if (uVar2.f19851d) {
                            i11 = 0;
                        } else {
                            i11 = uVar2.f19850b;
                        }
                        if (j11 - i11 <= 8192) {
                            u uVar5 = source.f19825a;
                            kotlin.jvm.internal.g.b(uVar5);
                            uVar5.d(uVar2, (int) j10);
                            source.f19826b -= j10;
                            this.f19826b += j10;
                            return;
                        }
                    }
                    u uVar6 = source.f19825a;
                    kotlin.jvm.internal.g.b(uVar6);
                    int i13 = (int) j10;
                    if (i13 > 0 && i13 <= uVar6.c - uVar6.f19850b) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (i13 >= 1024) {
                            b10 = uVar6.c();
                        } else {
                            b10 = v.b();
                            int i14 = uVar6.f19850b;
                            kotlin.collections.f.x(uVar6.f19849a, 0, i14, b10.f19849a, i14 + i13);
                        }
                        b10.c = b10.f19850b + i13;
                        uVar6.f19850b += i13;
                        u uVar7 = uVar6.f19854g;
                        kotlin.jvm.internal.g.b(uVar7);
                        uVar7.b(b10);
                        source.f19825a = b10;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                u uVar8 = source.f19825a;
                kotlin.jvm.internal.g.b(uVar8);
                long j12 = uVar8.c - uVar8.f19850b;
                source.f19825a = uVar8.a();
                u uVar9 = this.f19825a;
                if (uVar9 == null) {
                    this.f19825a = uVar8;
                    uVar8.f19854g = uVar8;
                    uVar8.f19853f = uVar8;
                } else {
                    u uVar10 = uVar9.f19854g;
                    kotlin.jvm.internal.g.b(uVar10);
                    uVar10.b(uVar8);
                    u uVar11 = uVar8.f19854g;
                    if (uVar11 != uVar8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        kotlin.jvm.internal.g.b(uVar11);
                        if (uVar11.f19852e) {
                            int i15 = uVar8.c - uVar8.f19850b;
                            u uVar12 = uVar8.f19854g;
                            kotlin.jvm.internal.g.b(uVar12);
                            int i16 = 8192 - uVar12.c;
                            u uVar13 = uVar8.f19854g;
                            kotlin.jvm.internal.g.b(uVar13);
                            if (uVar13.f19851d) {
                                i10 = 0;
                            } else {
                                u uVar14 = uVar8.f19854g;
                                kotlin.jvm.internal.g.b(uVar14);
                                i10 = uVar14.f19850b;
                            }
                            if (i15 <= i16 + i10) {
                                u uVar15 = uVar8.f19854g;
                                kotlin.jvm.internal.g.b(uVar15);
                                uVar8.d(uVar15, i15);
                                uVar8.a();
                                v.a(uVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                source.f19826b -= j12;
                this.f19826b += j12;
                j10 -= j12;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // kk.h
    public final boolean E() {
        if (this.f19826b == 0) {
            return true;
        }
        return false;
    }

    @Override // kk.h
    public final long H(ByteString targetBytes) {
        kotlin.jvm.internal.g.e(targetBytes, "targetBytes");
        return f(0L, targetBytes);
    }

    @Override // kk.h
    public final String J(long j10) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long d10 = d(b10, 0L, j11);
            if (d10 != -1) {
                return lk.a.a(this, d10);
            }
            if (j11 < this.f19826b && c(j11 - 1) == ((byte) 13) && c(j11) == b10) {
                return lk.a.a(this, j11);
            }
            f fVar = new f();
            a(fVar, 0L, Math.min(32, this.f19826b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f19826b, j10) + " content=" + fVar.e(fVar.f19826b).hex() + (char) 8230);
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("limit < 0: ", j10).toString());
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g K(String str) {
        x(str);
        return this;
    }

    @Override // kk.g
    public final long M(y source) {
        kotlin.jvm.internal.g.e(source, "source");
        long j10 = 0;
        while (true) {
            long g10 = source.g(this, 8192L);
            if (g10 != -1) {
                j10 += g10;
            } else {
                return j10;
            }
        }
    }

    @Override // kk.h
    public final boolean N(long j10, ByteString bytes) {
        kotlin.jvm.internal.g.e(bytes, "bytes");
        int size = bytes.size();
        if (j10 < 0 || size < 0 || this.f19826b - j10 < size || bytes.size() - 0 < size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (c(i10 + j10) != bytes.getByte(0 + i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // kk.h
    public final String O(Charset charset) {
        return j(this.f19826b, charset);
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g P(long j10) {
        s(j10);
        return this;
    }

    public final void Q(int i10) {
        boolean z10;
        String str;
        if (i10 < 128) {
            q(i10);
        } else if (i10 < 2048) {
            u n10 = n(2);
            int i11 = n10.c;
            byte[] bArr = n10.f19849a;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            n10.c = i11 + 2;
            this.f19826b += 2;
        } else {
            int i12 = 0;
            if (55296 <= i10 && i10 < 57344) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                q(63);
            } else if (i10 < 65536) {
                u n11 = n(3);
                int i13 = n11.c;
                byte[] bArr2 = n11.f19849a;
                bArr2[i13] = (byte) ((i10 >> 12) | 224);
                bArr2[i13 + 1] = (byte) (((i10 >> 6) & 63) | 128);
                bArr2[i13 + 2] = (byte) ((i10 & 63) | 128);
                n11.c = i13 + 3;
                this.f19826b += 3;
            } else if (i10 <= 1114111) {
                u n12 = n(4);
                int i14 = n12.c;
                byte[] bArr3 = n12.f19849a;
                bArr3[i14] = (byte) ((i10 >> 18) | 240);
                bArr3[i14 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                bArr3[i14 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                bArr3[i14 + 3] = (byte) ((i10 & 63) | 128);
                n12.c = i14 + 4;
                this.f19826b += 4;
            } else {
                StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
                if (i10 != 0) {
                    char[] cArr = aj.b.f568p;
                    char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
                    while (i12 < 8 && cArr2[i12] == '0') {
                        i12++;
                    }
                    kotlin.collections.b.Companion.getClass();
                    if (i12 >= 0) {
                        if (i12 <= 8) {
                            str = new String(cArr2, i12, 8 - i12);
                        } else {
                            throw new IllegalArgumentException(a0.a.g("startIndex: ", i12, " > endIndex: 8"));
                        }
                    } else {
                        throw new IndexOutOfBoundsException(a0.a.g("startIndex: ", i12, ", endIndex: 8, size: 8"));
                    }
                } else {
                    str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
                }
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    @Override // kk.h
    public final boolean S(long j10) {
        if (this.f19826b >= j10) {
            return true;
        }
        return false;
    }

    @Override // kk.h
    public final String V() {
        return J(Long.MAX_VALUE);
    }

    @Override // kk.h
    public final int X(p options) {
        kotlin.jvm.internal.g.e(options, "options");
        int b10 = lk.a.b(this, options, false);
        if (b10 == -1) {
            return -1;
        }
        skip(options.f19840a[b10].size());
        return b10;
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g Z(ByteString byteString) {
        p(byteString);
        return this;
    }

    public final void a(f out, long j10, long j11) {
        kotlin.jvm.internal.g.e(out, "out");
        androidx.activity.s.u(this.f19826b, j10, j11);
        if (j11 != 0) {
            out.f19826b += j11;
            u uVar = this.f19825a;
            while (true) {
                kotlin.jvm.internal.g.b(uVar);
                long j12 = uVar.c - uVar.f19850b;
                if (j10 < j12) {
                    break;
                }
                j10 -= j12;
                uVar = uVar.f19853f;
            }
            while (j11 > 0) {
                kotlin.jvm.internal.g.b(uVar);
                u c = uVar.c();
                int i10 = c.f19850b + ((int) j10);
                c.f19850b = i10;
                c.c = Math.min(i10 + ((int) j11), c.c);
                u uVar2 = out.f19825a;
                if (uVar2 == null) {
                    c.f19854g = c;
                    c.f19853f = c;
                    out.f19825a = c;
                } else {
                    u uVar3 = uVar2.f19854g;
                    kotlin.jvm.internal.g.b(uVar3);
                    uVar3.b(c);
                }
                j11 -= c.c - c.f19850b;
                uVar = uVar.f19853f;
                j10 = 0;
            }
        }
    }

    public final byte c(long j10) {
        androidx.activity.s.u(this.f19826b, j10, 1L);
        u uVar = this.f19825a;
        if (uVar != null) {
            long j11 = this.f19826b;
            if (j11 - j10 < j10) {
                while (j11 > j10) {
                    uVar = uVar.f19854g;
                    kotlin.jvm.internal.g.b(uVar);
                    j11 -= uVar.c - uVar.f19850b;
                }
                return uVar.f19849a[(int) ((uVar.f19850b + j10) - j11)];
            }
            long j12 = 0;
            while (true) {
                int i10 = uVar.c;
                int i11 = uVar.f19850b;
                long j13 = (i10 - i11) + j12;
                if (j13 <= j10) {
                    uVar = uVar.f19853f;
                    kotlin.jvm.internal.g.b(uVar);
                    j12 = j13;
                } else {
                    return uVar.f19849a[(int) ((i11 + j10) - j12)];
                }
            }
        } else {
            kotlin.jvm.internal.g.b(null);
            throw null;
        }
    }

    public final void clear() {
        skip(this.f19826b);
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f19826b != 0) {
            u uVar = this.f19825a;
            kotlin.jvm.internal.g.b(uVar);
            u c = uVar.c();
            fVar.f19825a = c;
            c.f19854g = c;
            c.f19853f = c;
            for (u uVar2 = uVar.f19853f; uVar2 != uVar; uVar2 = uVar2.f19853f) {
                u uVar3 = c.f19854g;
                kotlin.jvm.internal.g.b(uVar3);
                kotlin.jvm.internal.g.b(uVar2);
                uVar3.b(uVar2.c());
            }
            fVar.f19826b = this.f19826b;
        }
        return fVar;
    }

    public final long d(byte b10, long j10, long j11) {
        u uVar;
        long j12 = 0;
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (z10) {
            long j13 = this.f19826b;
            if (j11 > j13) {
                j11 = j13;
            }
            if (j10 == j11 || (uVar = this.f19825a) == null) {
                return -1L;
            }
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    uVar = uVar.f19854g;
                    kotlin.jvm.internal.g.b(uVar);
                    j13 -= uVar.c - uVar.f19850b;
                }
                while (j13 < j11) {
                    int min = (int) Math.min(uVar.c, (uVar.f19850b + j11) - j13);
                    for (int i10 = (int) ((uVar.f19850b + j10) - j13); i10 < min; i10++) {
                        if (uVar.f19849a[i10] == b10) {
                            return (i10 - uVar.f19850b) + j13;
                        }
                    }
                    j13 += uVar.c - uVar.f19850b;
                    uVar = uVar.f19853f;
                    kotlin.jvm.internal.g.b(uVar);
                    j10 = j13;
                }
                return -1L;
            }
            while (true) {
                long j14 = (uVar.c - uVar.f19850b) + j12;
                if (j14 > j10) {
                    break;
                }
                uVar = uVar.f19853f;
                kotlin.jvm.internal.g.b(uVar);
                j12 = j14;
            }
            while (j12 < j11) {
                int min2 = (int) Math.min(uVar.c, (uVar.f19850b + j11) - j12);
                for (int i11 = (int) ((uVar.f19850b + j10) - j12); i11 < min2; i11++) {
                    if (uVar.f19849a[i11] == b10) {
                        return (i11 - uVar.f19850b) + j12;
                    }
                }
                j12 += uVar.c - uVar.f19850b;
                uVar = uVar.f19853f;
                kotlin.jvm.internal.g.b(uVar);
                j10 = j12;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f19826b + " fromIndex=" + j10 + " toIndex=" + j11).toString());
    }

    @Override // kk.h
    public final ByteString e(long j10) {
        boolean z10;
        if (j10 >= 0 && j10 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f19826b >= j10) {
                if (j10 >= 4096) {
                    ByteString m10 = m((int) j10);
                    skip(j10);
                    return m10;
                }
                return new ByteString(h(j10));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("byteCount: ", j10).toString());
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g e0(int i10, int i11, byte[] bArr) {
        o(i10, i11, bArr);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j10 = this.f19826b;
                f fVar = (f) obj;
                if (j10 == fVar.f19826b) {
                    if (j10 != 0) {
                        u uVar = this.f19825a;
                        kotlin.jvm.internal.g.b(uVar);
                        u uVar2 = fVar.f19825a;
                        kotlin.jvm.internal.g.b(uVar2);
                        int i10 = uVar.f19850b;
                        int i11 = uVar2.f19850b;
                        long j11 = 0;
                        while (j11 < this.f19826b) {
                            long min = Math.min(uVar.c - i10, uVar2.c - i11);
                            long j12 = 0;
                            while (j12 < min) {
                                int i12 = i10 + 1;
                                byte b10 = uVar.f19849a[i10];
                                int i13 = i11 + 1;
                                if (b10 == uVar2.f19849a[i11]) {
                                    j12++;
                                    i11 = i13;
                                    i10 = i12;
                                }
                            }
                            if (i10 == uVar.c) {
                                u uVar3 = uVar.f19853f;
                                kotlin.jvm.internal.g.b(uVar3);
                                i10 = uVar3.f19850b;
                                uVar = uVar3;
                            }
                            if (i11 == uVar2.c) {
                                uVar2 = uVar2.f19853f;
                                kotlin.jvm.internal.g.b(uVar2);
                                i11 = uVar2.f19850b;
                            }
                            j11 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long f(long j10, ByteString targetBytes) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        kotlin.jvm.internal.g.e(targetBytes, "targetBytes");
        long j11 = 0;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            u uVar = this.f19825a;
            if (uVar == null) {
                return -1L;
            }
            long j12 = this.f19826b;
            if (j12 - j10 < j10) {
                while (j12 > j10) {
                    uVar = uVar.f19854g;
                    kotlin.jvm.internal.g.b(uVar);
                    j12 -= uVar.c - uVar.f19850b;
                }
                if (targetBytes.size() == 2) {
                    byte b10 = targetBytes.getByte(0);
                    byte b11 = targetBytes.getByte(1);
                    while (j12 < this.f19826b) {
                        i12 = (int) ((uVar.f19850b + j10) - j12);
                        int i14 = uVar.c;
                        while (i12 < i14) {
                            byte b12 = uVar.f19849a[i12];
                            if (b12 != b10 && b12 != b11) {
                                i12++;
                            } else {
                                i13 = uVar.f19850b;
                            }
                        }
                        j12 += uVar.c - uVar.f19850b;
                        uVar = uVar.f19853f;
                        kotlin.jvm.internal.g.b(uVar);
                        j10 = j12;
                    }
                    return -1L;
                }
                byte[] internalArray$okio = targetBytes.internalArray$okio();
                while (j12 < this.f19826b) {
                    i12 = (int) ((uVar.f19850b + j10) - j12);
                    int i15 = uVar.c;
                    while (i12 < i15) {
                        byte b13 = uVar.f19849a[i12];
                        for (byte b14 : internalArray$okio) {
                            if (b13 == b14) {
                                i13 = uVar.f19850b;
                            }
                        }
                        i12++;
                    }
                    j12 += uVar.c - uVar.f19850b;
                    uVar = uVar.f19853f;
                    kotlin.jvm.internal.g.b(uVar);
                    j10 = j12;
                }
                return -1L;
                return (i12 - i13) + j12;
            }
            while (true) {
                long j13 = (uVar.c - uVar.f19850b) + j11;
                if (j13 > j10) {
                    break;
                }
                uVar = uVar.f19853f;
                kotlin.jvm.internal.g.b(uVar);
                j11 = j13;
            }
            if (targetBytes.size() == 2) {
                byte b15 = targetBytes.getByte(0);
                byte b16 = targetBytes.getByte(1);
                while (j11 < this.f19826b) {
                    i10 = (int) ((uVar.f19850b + j10) - j11);
                    int i16 = uVar.c;
                    while (i10 < i16) {
                        byte b17 = uVar.f19849a[i10];
                        if (b17 != b15 && b17 != b16) {
                            i10++;
                        } else {
                            i11 = uVar.f19850b;
                        }
                    }
                    j11 += uVar.c - uVar.f19850b;
                    uVar = uVar.f19853f;
                    kotlin.jvm.internal.g.b(uVar);
                    j10 = j11;
                }
                return -1L;
            }
            byte[] internalArray$okio2 = targetBytes.internalArray$okio();
            while (j11 < this.f19826b) {
                i10 = (int) ((uVar.f19850b + j10) - j11);
                int i17 = uVar.c;
                while (i10 < i17) {
                    byte b18 = uVar.f19849a[i10];
                    for (byte b19 : internalArray$okio2) {
                        if (b18 == b19) {
                            i11 = uVar.f19850b;
                        }
                    }
                    i10++;
                }
                j11 += uVar.c - uVar.f19850b;
                uVar = uVar.f19853f;
                kotlin.jvm.internal.g.b(uVar);
                j10 = j11;
            }
            return -1L;
            return (i10 - i11) + j11;
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("fromIndex < 0: ", j10).toString());
    }

    @Override // kk.y
    public final long g(f sink, long j10) {
        boolean z10;
        kotlin.jvm.internal.g.e(sink, "sink");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j11 = this.f19826b;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            sink.D(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("byteCount < 0: ", j10).toString());
    }

    @Override // kk.h
    public final void g0(long j10) {
        if (this.f19826b >= j10) {
            return;
        }
        throw new EOFException();
    }

    public final byte[] h(long j10) {
        boolean z10;
        int i10 = 0;
        if (j10 >= 0 && j10 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f19826b >= j10) {
                int i11 = (int) j10;
                byte[] bArr = new byte[i11];
                while (i10 < i11) {
                    int read = read(bArr, i10, i11 - i10);
                    if (read != -1) {
                        i10 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("byteCount: ", j10).toString());
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g h0(long j10) {
        r(j10);
        return this;
    }

    public final int hashCode() {
        u uVar = this.f19825a;
        if (uVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = uVar.c;
            for (int i12 = uVar.f19850b; i12 < i11; i12++) {
                i10 = (i10 * 31) + uVar.f19849a[i12];
            }
            uVar = uVar.f19853f;
            kotlin.jvm.internal.g.b(uVar);
        } while (uVar != this.f19825a);
        return i10;
    }

    public final long i() {
        int i10;
        String str;
        long j10 = 0;
        if (this.f19826b != 0) {
            long j11 = -7;
            int i11 = 0;
            boolean z10 = false;
            boolean z11 = false;
            do {
                u uVar = this.f19825a;
                kotlin.jvm.internal.g.b(uVar);
                int i12 = uVar.f19850b;
                int i13 = uVar.c;
                while (i12 < i13) {
                    byte b10 = uVar.f19849a[i12];
                    byte b11 = (byte) 48;
                    if (b10 >= b11 && b10 <= ((byte) 57)) {
                        int i14 = b11 - b10;
                        int i15 = (j10 > (-922337203685477580L) ? 1 : (j10 == (-922337203685477580L) ? 0 : -1));
                        if (i15 >= 0 && (i15 != 0 || i14 >= j11)) {
                            j10 = (j10 * 10) + i14;
                        } else {
                            f fVar = new f();
                            fVar.r(j10);
                            fVar.q(b10);
                            if (!z10) {
                                fVar.readByte();
                            }
                            throw new NumberFormatException("Number too large: ".concat(fVar.k()));
                        }
                    } else if (b10 == ((byte) 45) && i11 == 0) {
                        j11--;
                        z10 = true;
                    } else {
                        z11 = true;
                        break;
                    }
                    i12++;
                    i11++;
                }
                if (i12 == i13) {
                    this.f19825a = uVar.a();
                    v.a(uVar);
                } else {
                    uVar.f19850b = i12;
                }
                if (z11) {
                    break;
                }
            } while (this.f19825a != null);
            long j12 = this.f19826b - i11;
            this.f19826b = j12;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (i11 < i10) {
                if (j12 != 0) {
                    if (z10) {
                        str = "Expected a digit";
                    } else {
                        str = "Expected a digit or '-'";
                    }
                    StringBuilder g10 = a0.d.g(str, " but was 0x");
                    byte c = c(0L);
                    char[] cArr = aj.b.f568p;
                    g10.append(new String(new char[]{cArr[(c >> 4) & 15], cArr[c & 15]}));
                    throw new NumberFormatException(g10.toString());
                }
                throw new EOFException();
            } else if (!z10) {
                return -j10;
            } else {
                return j10;
            }
        }
        throw new EOFException();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final String j(long j10, Charset charset) {
        boolean z10;
        kotlin.jvm.internal.g.e(charset, "charset");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0 && j10 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f19826b >= j10) {
                if (i10 == 0) {
                    return "";
                }
                u uVar = this.f19825a;
                kotlin.jvm.internal.g.b(uVar);
                int i11 = uVar.f19850b;
                if (i11 + j10 > uVar.c) {
                    return new String(h(j10), charset);
                }
                int i12 = (int) j10;
                String str = new String(uVar.f19849a, i11, i12, charset);
                int i13 = uVar.f19850b + i12;
                uVar.f19850b = i13;
                this.f19826b -= j10;
                if (i13 == uVar.c) {
                    this.f19825a = uVar.a();
                    v.a(uVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("byteCount: ", j10).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[EDGE_INSN: B:43:0x00a8->B:38:0x00a8 ?: BREAK  , SYNTHETIC] */
    @Override // kk.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j0() {
        /*
            r14 = this;
            long r0 = r14.f19826b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Laf
            r0 = 0
            r1 = r0
            r4 = r1
            r5 = r2
        Lc:
            kk.u r7 = r14.f19825a
            kotlin.jvm.internal.g.b(r7)
            int r8 = r7.f19850b
            int r9 = r7.c
        L15:
            if (r8 >= r9) goto L94
            byte[] r10 = r7.f19849a
            r10 = r10[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L28
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L28
            int r11 = r10 - r11
            goto L41
        L28:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L33
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L33
            goto L3d
        L33:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L6c
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L6c
        L3d:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r5
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r5 = r5 << r10
            long r10 = (long) r11
            long r5 = r5 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L15
        L51:
            kk.f r0 = new kk.f
            r0.<init>()
            r0.s(r5)
            r0.q(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.k()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L6c:
            r4 = 1
            if (r1 == 0) goto L70
            goto L94
        L70:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 2
            char[] r2 = new char[r2]
            char[] r3 = aj.b.f568p
            int r5 = r10 >> 4
            r5 = r5 & 15
            char r5 = r3[r5]
            r2[r0] = r5
            r0 = r10 & 15
            char r0 = r3[r0]
            r2[r4] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L94:
            if (r8 != r9) goto La0
            kk.u r8 = r7.a()
            r14.f19825a = r8
            kk.v.a(r7)
            goto La2
        La0:
            r7.f19850b = r8
        La2:
            if (r4 != 0) goto La8
            kk.u r7 = r14.f19825a
            if (r7 != 0) goto Lc
        La8:
            long r2 = r14.f19826b
            long r0 = (long) r1
            long r2 = r2 - r0
            r14.f19826b = r2
            return r5
        Laf:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.f.j0():long");
    }

    public final String k() {
        return j(this.f19826b, kotlin.text.a.f19966b);
    }

    public final String l(long j10) {
        return j(j10, kotlin.text.a.f19966b);
    }

    public final ByteString m(int i10) {
        if (i10 == 0) {
            return ByteString.EMPTY;
        }
        androidx.activity.s.u(this.f19826b, 0L, i10);
        u uVar = this.f19825a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            kotlin.jvm.internal.g.b(uVar);
            int i14 = uVar.c;
            int i15 = uVar.f19850b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                uVar = uVar.f19853f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        u uVar2 = this.f19825a;
        int i16 = 0;
        while (i11 < i10) {
            kotlin.jvm.internal.g.b(uVar2);
            bArr[i16] = uVar2.f19849a;
            i11 += uVar2.c - uVar2.f19850b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = uVar2.f19850b;
            uVar2.f19851d = true;
            i16++;
            uVar2 = uVar2.f19853f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public final u n(int i10) {
        boolean z10 = true;
        if ((i10 < 1 || i10 > 8192) ? false : false) {
            u uVar = this.f19825a;
            if (uVar == null) {
                u b10 = v.b();
                this.f19825a = b10;
                b10.f19854g = b10;
                b10.f19853f = b10;
                return b10;
            }
            u uVar2 = uVar.f19854g;
            kotlin.jvm.internal.g.b(uVar2);
            if (uVar2.c + i10 <= 8192 && uVar2.f19852e) {
                return uVar2;
            }
            u b11 = v.b();
            uVar2.b(b11);
            return b11;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void o(int i10, int i11, byte[] source) {
        kotlin.jvm.internal.g.e(source, "source");
        long j10 = i11;
        androidx.activity.s.u(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            u n10 = n(1);
            int min = Math.min(i12 - i10, 8192 - n10.c);
            int i13 = i10 + min;
            kotlin.collections.f.x(source, n10.c, i10, n10.f19849a, i13);
            n10.c += min;
            i10 = i13;
        }
        this.f19826b += j10;
    }

    public final void p(ByteString byteString) {
        kotlin.jvm.internal.g.e(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
    }

    public final void q(int i10) {
        u n10 = n(1);
        int i11 = n10.c;
        n10.c = i11 + 1;
        n10.f19849a[i11] = (byte) i10;
        this.f19826b++;
    }

    public final f r(long j10) {
        boolean z10;
        byte[] bArr;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            q(48);
        } else {
            int i11 = 1;
            if (i10 < 0) {
                j10 = -j10;
                if (j10 < 0) {
                    x("-9223372036854775808");
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (j10 < 100000000) {
                if (j10 < 10000) {
                    if (j10 < 100) {
                        if (j10 >= 10) {
                            i11 = 2;
                        }
                    } else if (j10 < 1000) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                } else if (j10 < 1000000) {
                    if (j10 < 100000) {
                        i11 = 5;
                    } else {
                        i11 = 6;
                    }
                } else if (j10 < 10000000) {
                    i11 = 7;
                } else {
                    i11 = 8;
                }
            } else if (j10 < 1000000000000L) {
                if (j10 < 10000000000L) {
                    if (j10 < 1000000000) {
                        i11 = 9;
                    } else {
                        i11 = 10;
                    }
                } else if (j10 < 100000000000L) {
                    i11 = 11;
                } else {
                    i11 = 12;
                }
            } else if (j10 < 1000000000000000L) {
                if (j10 < 10000000000000L) {
                    i11 = 13;
                } else if (j10 < 100000000000000L) {
                    i11 = 14;
                } else {
                    i11 = 15;
                }
            } else if (j10 < 100000000000000000L) {
                if (j10 < 10000000000000000L) {
                    i11 = 16;
                } else {
                    i11 = 17;
                }
            } else if (j10 < 1000000000000000000L) {
                i11 = 18;
            } else {
                i11 = 19;
            }
            if (z10) {
                i11++;
            }
            u n10 = n(i11);
            int i12 = n10.c + i11;
            while (true) {
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                bArr = n10.f19849a;
                if (i13 == 0) {
                    break;
                }
                long j11 = 10;
                i12--;
                bArr[i12] = lk.a.f21759a[(int) (j10 % j11)];
                j10 /= j11;
            }
            if (z10) {
                bArr[i12 - 1] = (byte) 45;
            }
            n10.c += i11;
            this.f19826b += i11;
        }
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.g.e(sink, "sink");
        u uVar = this.f19825a;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), uVar.c - uVar.f19850b);
        sink.put(uVar.f19849a, uVar.f19850b, min);
        int i10 = uVar.f19850b + min;
        uVar.f19850b = i10;
        this.f19826b -= min;
        if (i10 == uVar.c) {
            this.f19825a = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // kk.h
    public final byte readByte() {
        if (this.f19826b != 0) {
            u uVar = this.f19825a;
            kotlin.jvm.internal.g.b(uVar);
            int i10 = uVar.f19850b;
            int i11 = uVar.c;
            int i12 = i10 + 1;
            byte b10 = uVar.f19849a[i10];
            this.f19826b--;
            if (i12 == i11) {
                this.f19825a = uVar.a();
                v.a(uVar);
            } else {
                uVar.f19850b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override // kk.h
    public final int readInt() {
        if (this.f19826b >= 4) {
            u uVar = this.f19825a;
            kotlin.jvm.internal.g.b(uVar);
            int i10 = uVar.f19850b;
            int i11 = uVar.c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            int i12 = i10 + 1;
            byte[] bArr = uVar.f19849a;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & 255) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & 255);
            this.f19826b -= 4;
            if (i17 == i11) {
                this.f19825a = uVar.a();
                v.a(uVar);
            } else {
                uVar.f19850b = i17;
            }
            return i18;
        }
        throw new EOFException();
    }

    @Override // kk.h
    public final short readShort() {
        if (this.f19826b >= 2) {
            u uVar = this.f19825a;
            kotlin.jvm.internal.g.b(uVar);
            int i10 = uVar.f19850b;
            int i11 = uVar.c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i12 = i10 + 1;
            byte[] bArr = uVar.f19849a;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            this.f19826b -= 2;
            if (i13 == i11) {
                this.f19825a = uVar.a();
                v.a(uVar);
            } else {
                uVar.f19850b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    public final f s(long j10) {
        if (j10 == 0) {
            q(48);
        } else {
            long j11 = (j10 >>> 1) | j10;
            long j12 = j11 | (j11 >>> 2);
            long j13 = j12 | (j12 >>> 4);
            long j14 = j13 | (j13 >>> 8);
            long j15 = j14 | (j14 >>> 16);
            long j16 = j15 | (j15 >>> 32);
            long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
            long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
            long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
            long j20 = j19 + (j19 >>> 8);
            long j21 = j20 + (j20 >>> 16);
            int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
            u n10 = n(i10);
            int i11 = n10.c;
            for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
                n10.f19849a[i12] = lk.a.f21759a[(int) (15 & j10)];
                j10 >>>= 4;
            }
            n10.c += i10;
            this.f19826b += i10;
        }
        return this;
    }

    @Override // kk.h
    public final void skip(long j10) {
        while (j10 > 0) {
            u uVar = this.f19825a;
            if (uVar != null) {
                int min = (int) Math.min(j10, uVar.c - uVar.f19850b);
                long j11 = min;
                this.f19826b -= j11;
                j10 -= j11;
                int i10 = uVar.f19850b + min;
                uVar.f19850b = i10;
                if (i10 == uVar.c) {
                    this.f19825a = uVar.a();
                    v.a(uVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final void t(int i10) {
        u n10 = n(4);
        int i11 = n10.c;
        int i12 = i11 + 1;
        byte[] bArr = n10.f19849a;
        bArr[i11] = (byte) ((i10 >>> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        bArr[i14] = (byte) (i10 & FunctionEval.FunctionID.EXTERNAL_FUNC);
        n10.c = i14 + 1;
        this.f19826b += 4;
    }

    public final String toString() {
        boolean z10;
        long j10 = this.f19826b;
        if (j10 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return m((int) j10).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f19826b).toString());
    }

    public final void u(int i10) {
        u n10 = n(2);
        int i11 = n10.c;
        int i12 = i11 + 1;
        byte[] bArr = n10.f19849a;
        bArr[i11] = (byte) ((i10 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        bArr[i12] = (byte) (i10 & FunctionEval.FunctionID.EXTERNAL_FUNC);
        n10.c = i12 + 1;
        this.f19826b += 2;
    }

    public final f v(String string, int i10, int i11, Charset charset) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.g.e(string, "string");
        boolean z12 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 > string.length()) {
                    z12 = false;
                }
                if (z12) {
                    if (kotlin.jvm.internal.g.a(charset, kotlin.text.a.f19966b)) {
                        w(i10, i11, string);
                        return this;
                    }
                    String substring = string.substring(i10, i11);
                    kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                    o(0, bytes.length, bytes);
                    return this;
                }
                StringBuilder e10 = androidx.appcompat.view.menu.d.e("endIndex > string.length: ", i11, " > ");
                e10.append(string.length());
                throw new IllegalArgumentException(e10.toString().toString());
            }
            throw new IllegalArgumentException(a0.d.b("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        throw new IllegalArgumentException(b.a.c("beginIndex < 0: ", i10).toString());
    }

    public final void w(int i10, int i11, String string) {
        boolean z10;
        boolean z11;
        boolean z12;
        char charAt;
        char c;
        boolean z13;
        kotlin.jvm.internal.g.e(string, "string");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 <= string.length()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    while (i10 < i11) {
                        char charAt2 = string.charAt(i10);
                        if (charAt2 < 128) {
                            u n10 = n(1);
                            int i12 = n10.c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            byte[] bArr = n10.f19849a;
                            bArr[i10 + i12] = (byte) charAt2;
                            while (true) {
                                i10 = i13;
                                if (i10 >= min || (charAt = string.charAt(i10)) >= 128) {
                                    break;
                                }
                                i13 = i10 + 1;
                                bArr[i10 + i12] = (byte) charAt;
                            }
                            int i14 = n10.c;
                            int i15 = (i12 + i10) - i14;
                            n10.c = i14 + i15;
                            this.f19826b += i15;
                        } else {
                            if (charAt2 < 2048) {
                                u n11 = n(2);
                                int i16 = n11.c;
                                byte[] bArr2 = n11.f19849a;
                                bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                                n11.c = i16 + 2;
                                this.f19826b += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i17 = i10 + 1;
                                if (i17 < i11) {
                                    c = string.charAt(i17);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c && c < 57344) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        int i18 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                        u n12 = n(4);
                                        int i19 = n12.c;
                                        byte[] bArr3 = n12.f19849a;
                                        bArr3[i19] = (byte) ((i18 >> 18) | 240);
                                        bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                                        bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                                        bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                                        n12.c = i19 + 4;
                                        this.f19826b += 4;
                                        i10 += 2;
                                    }
                                }
                                q(63);
                                i10 = i17;
                            } else {
                                u n13 = n(3);
                                int i20 = n13.c;
                                byte[] bArr4 = n13.f19849a;
                                bArr4[i20] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i20 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i20 + 2] = (byte) ((charAt2 & '?') | 128);
                                n13.c = i20 + 3;
                                this.f19826b += 3;
                            }
                            i10++;
                        }
                    }
                    return;
                }
                StringBuilder e10 = androidx.appcompat.view.menu.d.e("endIndex > string.length: ", i11, " > ");
                e10.append(string.length());
                throw new IllegalArgumentException(e10.toString().toString());
            }
            throw new IllegalArgumentException(a0.d.b("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        throw new IllegalArgumentException(b.a.c("beginIndex < 0: ", i10).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.g.e(source, "source");
        int remaining = source.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            u n10 = n(1);
            int min = Math.min(i10, 8192 - n10.c);
            source.get(n10.f19849a, n10.c, min);
            i10 -= min;
            n10.c += min;
        }
        this.f19826b += remaining;
        return remaining;
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g writeByte(int i10) {
        q(i10);
        return this;
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g writeInt(int i10) {
        t(i10);
        return this;
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g writeShort(int i10) {
        u(i10);
        return this;
    }

    public final void x(String string) {
        kotlin.jvm.internal.g.e(string, "string");
        w(0, string.length(), string);
    }

    @Override // kk.y
    public final z z() {
        return z.f19858d;
    }

    @Override // kk.g
    public final g write(byte[] bArr) {
        o(0, bArr.length, bArr);
        return this;
    }

    public final int read(byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.g.e(sink, "sink");
        androidx.activity.s.u(sink.length, i10, i11);
        u uVar = this.f19825a;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i11, uVar.c - uVar.f19850b);
        int i12 = uVar.f19850b;
        kotlin.collections.f.x(uVar.f19849a, i10, i12, sink, i12 + min);
        int i13 = uVar.f19850b + min;
        uVar.f19850b = i13;
        this.f19826b -= min;
        if (i13 == uVar.c) {
            this.f19825a = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // kk.g
    public final g I() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, kk.w
    public final void close() {
    }

    @Override // kk.g, kk.w, java.io.Flushable
    public final void flush() {
    }

    @Override // kk.h, kk.g
    public final f y() {
        return this;
    }
}
