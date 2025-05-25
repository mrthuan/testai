package kk;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: GzipSource.kt */
/* loaded from: classes3.dex */
public final class l implements y {

    /* renamed from: a  reason: collision with root package name */
    public byte f19830a;

    /* renamed from: b  reason: collision with root package name */
    public final t f19831b;
    public final Inflater c;

    /* renamed from: d  reason: collision with root package name */
    public final m f19832d;

    /* renamed from: e  reason: collision with root package name */
    public final CRC32 f19833e;

    public l(y source) {
        kotlin.jvm.internal.g.e(source, "source");
        t tVar = new t(source);
        this.f19831b = tVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.f19832d = new m(tVar, inflater);
        this.f19833e = new CRC32();
    }

    public static void a(int i10, int i11, String str) {
        if (i11 == i10) {
            return;
        }
        throw new IOException(b.a.f(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3, "%s: actual 0x%08x != expected 0x%08x", "format(this, *args)"));
    }

    public final void b(f fVar, long j10, long j11) {
        int i10;
        u uVar = fVar.f19825a;
        kotlin.jvm.internal.g.b(uVar);
        while (true) {
            int i11 = uVar.c;
            int i12 = uVar.f19850b;
            if (j10 < i11 - i12) {
                break;
            }
            j10 -= i11 - i12;
            uVar = uVar.f19853f;
            kotlin.jvm.internal.g.b(uVar);
        }
        while (j11 > 0) {
            int min = (int) Math.min(uVar.c - i10, j11);
            this.f19833e.update(uVar.f19849a, (int) (uVar.f19850b + j10), min);
            j11 -= min;
            uVar = uVar.f19853f;
            kotlin.jvm.internal.g.b(uVar);
            j10 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19832d.close();
    }

    @Override // kk.y
    public final long g(f sink, long j10) {
        t tVar;
        boolean z10;
        boolean z11;
        boolean z12;
        f fVar;
        long j11;
        long j12;
        kotlin.jvm.internal.g.e(sink, "sink");
        byte b10 = this.f19830a;
        CRC32 crc32 = this.f19833e;
        t tVar2 = this.f19831b;
        if (b10 == 0) {
            tVar2.g0(10L);
            f fVar2 = tVar2.f19848b;
            byte c = fVar2.c(3L);
            boolean z13 = false;
            if (((c >> 1) & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b(tVar2.f19848b, 0L, 10L);
            }
            a(8075, tVar2.readShort(), "ID1ID2");
            tVar2.skip(8L);
            if (((c >> 2) & 1) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                tVar2.g0(2L);
                if (z10) {
                    b(tVar2.f19848b, 0L, 2L);
                }
                int readShort = fVar2.readShort() & 65535;
                long j13 = (short) (((readShort & FunctionEval.FunctionID.EXTERNAL_FUNC) << 8) | ((readShort & 65280) >>> 8));
                tVar2.g0(j13);
                if (z10) {
                    b(tVar2.f19848b, 0L, j13);
                    j12 = j13;
                } else {
                    j12 = j13;
                }
                tVar2.skip(j12);
            }
            if (((c >> 3) & 1) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                fVar = fVar2;
                long a10 = tVar2.a((byte) 0, 0L, Long.MAX_VALUE);
                if (a10 != -1) {
                    if (z10) {
                        tVar = tVar2;
                        j11 = 2;
                        b(tVar2.f19848b, 0L, a10 + 1);
                    } else {
                        tVar = tVar2;
                        j11 = 2;
                    }
                    tVar.skip(a10 + 1);
                } else {
                    throw new EOFException();
                }
            } else {
                tVar = tVar2;
                fVar = fVar2;
                j11 = 2;
            }
            if (((c >> 4) & 1) == 1) {
                z13 = true;
            }
            if (z13) {
                long a11 = tVar.a((byte) 0, 0L, Long.MAX_VALUE);
                if (a11 != -1) {
                    if (z10) {
                        b(tVar.f19848b, 0L, a11 + 1);
                    }
                    tVar.skip(a11 + 1);
                } else {
                    throw new EOFException();
                }
            }
            if (z10) {
                tVar.g0(2L);
                int readShort2 = fVar.readShort() & 65535;
                a((short) (((readShort2 & FunctionEval.FunctionID.EXTERNAL_FUNC) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f19830a = (byte) 1;
        } else {
            tVar = tVar2;
        }
        if (this.f19830a == 1) {
            long j14 = sink.f19826b;
            long g10 = this.f19832d.g(sink, 8192L);
            if (g10 != -1) {
                b(sink, j14, g10);
                return g10;
            }
            this.f19830a = (byte) 2;
        }
        if (this.f19830a == 2) {
            a(tVar.c(), (int) crc32.getValue(), "CRC");
            a(tVar.c(), (int) this.c.getBytesWritten(), "ISIZE");
            this.f19830a = (byte) 3;
            if (!tVar.E()) {
                throw new IOException("gzip finished without exhausting source");
            }
            return -1L;
        }
        return -1L;
    }

    @Override // kk.y
    public final z z() {
        return this.f19831b.z();
    }
}
