package kk;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import okio.ByteString;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: RealBufferedSource.kt */
/* loaded from: classes3.dex */
public final class t implements h {

    /* renamed from: a  reason: collision with root package name */
    public final y f19847a;

    /* renamed from: b  reason: collision with root package name */
    public final f f19848b;
    public boolean c;

    public t(y source) {
        kotlin.jvm.internal.g.e(source, "source");
        this.f19847a = source;
        this.f19848b = new f();
    }

    @Override // kk.h
    public final boolean E() {
        if (!this.c) {
            f fVar = this.f19848b;
            if (fVar.E() && this.f19847a.g(fVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.h
    public final long H(ByteString targetBytes) {
        kotlin.jvm.internal.g.e(targetBytes, "targetBytes");
        if (!this.c) {
            long j10 = 0;
            while (true) {
                f fVar = this.f19848b;
                long f10 = fVar.f(j10, targetBytes);
                if (f10 == -1) {
                    long j11 = fVar.f19826b;
                    if (this.f19847a.g(fVar, 8192L) == -1) {
                        return -1L;
                    }
                    j10 = Math.max(j10, j11);
                } else {
                    return f10;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // kk.h
    public final String J(long j10) {
        boolean z10;
        long j11;
        f fVar;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (j10 == Long.MAX_VALUE) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long a10 = a(b10, 0L, j11);
            int i10 = (a10 > (-1L) ? 1 : (a10 == (-1L) ? 0 : -1));
            f fVar2 = this.f19848b;
            if (i10 != 0) {
                return lk.a.a(fVar2, a10);
            }
            if (j11 < Long.MAX_VALUE && S(j11) && fVar2.c(j11 - 1) == ((byte) 13) && S(1 + j11) && fVar2.c(j11) == b10) {
                return lk.a.a(fVar2, j11);
            }
            fVar2.a(new f(), 0L, Math.min(32, fVar2.f19826b));
            throw new EOFException("\\n not found: limit=" + Math.min(fVar2.f19826b, j10) + " content=" + fVar.e(fVar.f19826b).hex() + (char) 8230);
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("limit < 0: ", j10).toString());
    }

    @Override // kk.h
    public final boolean N(long j10, ByteString bytes) {
        kotlin.jvm.internal.g.e(bytes, "bytes");
        int size = bytes.size();
        if (!this.c) {
            if (j10 >= 0 && size >= 0 && bytes.size() - 0 >= size) {
                for (int i10 = 0; i10 < size; i10++) {
                    long j11 = i10 + j10;
                    if (S(1 + j11) && this.f19848b.c(j11) == bytes.getByte(0 + i10)) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.h
    public final String O(Charset charset) {
        f fVar = this.f19848b;
        fVar.M(this.f19847a);
        return fVar.j(fVar.f19826b, charset);
    }

    @Override // kk.h
    public final boolean S(long j10) {
        boolean z10;
        f fVar;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!this.c) {
                do {
                    fVar = this.f19848b;
                    if (fVar.f19826b >= j10) {
                        return true;
                    }
                } while (this.f19847a.g(fVar, 8192L) != -1);
                return false;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("byteCount < 0: ", j10).toString());
    }

    @Override // kk.h
    public final String V() {
        return J(Long.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        return -1;
     */
    @Override // kk.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int X(kk.p r8) {
        /*
            r7 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g.e(r8, r0)
            boolean r0 = r7.c
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L36
        Lb:
            kk.f r0 = r7.f19848b
            int r2 = lk.a.b(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L26
            if (r2 == r4) goto L24
            okio.ByteString[] r8 = r8.f19840a
            r8 = r8[r2]
            int r8 = r8.size()
            long r3 = (long) r8
            r0.skip(r3)
            goto L35
        L24:
            r2 = r4
            goto L35
        L26:
            kk.y r2 = r7.f19847a
            r5 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.g(r0, r5)
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb
            goto L24
        L35:
            return r2
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.t.X(kk.p):int");
    }

    public final long a(byte b10, long j10, long j11) {
        boolean z10 = true;
        if (!this.c) {
            long j12 = 0;
            if (0 > j11) {
                z10 = false;
            }
            if (z10) {
                while (j12 < j11) {
                    long d10 = this.f19848b.d(b10, j12, j11);
                    if (d10 != -1) {
                        return d10;
                    }
                    f fVar = this.f19848b;
                    long j13 = fVar.f19826b;
                    if (j13 >= j11 || this.f19847a.g(fVar, 8192L) == -1) {
                        return -1L;
                    }
                    j12 = Math.max(j12, j13);
                }
                return -1L;
            }
            throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("fromIndex=0 toIndex=", j11).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        pdf.pdfreader.viewer.editor.free.utils.t0.w(16);
        pdf.pdfreader.viewer.editor.free.utils.t0.w(16);
        r1 = java.lang.Integer.toString(r8, 16);
        kotlin.jvm.internal.g.d(r1, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b() {
        /*
            r11 = this;
            r0 = 1
            r11.g0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.S(r6)
            kk.f r9 = r11.f19848b
            if (r8 == 0) goto L4d
            byte r8 = r9.c(r4)
            r10 = 48
            byte r10 = (byte) r10
            if (r8 < r10) goto L20
            r10 = 57
            byte r10 = (byte) r10
            if (r8 <= r10) goto L2a
        L20:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r4 == 0) goto L2f
            goto L4d
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            pdf.pdfreader.viewer.editor.free.utils.t0.w(r1)
            pdf.pdfreader.viewer.editor.free.utils.t0.w(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.g.d(r1, r2)
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L4d:
            long r0 = r9.i()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.t.b():long");
    }

    public final int c() {
        g0(4L);
        int readInt = this.f19848b.readInt();
        return ((readInt & FunctionEval.FunctionID.EXTERNAL_FUNC) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.c) {
            this.c = true;
            this.f19847a.close();
            this.f19848b.clear();
        }
    }

    @Override // kk.h
    public final ByteString e(long j10) {
        g0(j10);
        return this.f19848b.e(j10);
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
            if (!this.c) {
                f fVar = this.f19848b;
                if (fVar.f19826b == 0 && this.f19847a.g(fVar, 8192L) == -1) {
                    return -1L;
                }
                return fVar.g(sink, Math.min(j10, fVar.f19826b));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.d.c("byteCount < 0: ", j10).toString());
    }

    @Override // kk.h
    public final void g0(long j10) {
        if (S(j10)) {
            return;
        }
        throw new EOFException();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // kk.h
    public final long j0() {
        f fVar;
        byte c;
        g0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            boolean S = S(i11);
            fVar = this.f19848b;
            if (!S) {
                break;
            }
            c = fVar.c(i10);
            if ((c < ((byte) 48) || c > ((byte) 57)) && ((c < ((byte) 97) || c > ((byte) 102)) && (c < ((byte) 65) || c > ((byte) 70)))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            t0.w(16);
            t0.w(16);
            String num = Integer.toString(c, 16);
            kotlin.jvm.internal.g.d(num, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(num));
        }
        return fVar.j0();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.g.e(sink, "sink");
        f fVar = this.f19848b;
        if (fVar.f19826b == 0 && this.f19847a.g(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(sink);
    }

    @Override // kk.h
    public final byte readByte() {
        g0(1L);
        return this.f19848b.readByte();
    }

    @Override // kk.h
    public final int readInt() {
        g0(4L);
        return this.f19848b.readInt();
    }

    @Override // kk.h
    public final short readShort() {
        g0(2L);
        return this.f19848b.readShort();
    }

    @Override // kk.h
    public final void skip(long j10) {
        if (!this.c) {
            while (j10 > 0) {
                f fVar = this.f19848b;
                if (fVar.f19826b == 0 && this.f19847a.g(fVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, fVar.f19826b);
                fVar.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        return "buffer(" + this.f19847a + ')';
    }

    @Override // kk.h, kk.g
    public final f y() {
        return this.f19848b;
    }

    @Override // kk.y
    public final z z() {
        return this.f19847a.z();
    }
}
