package kk;

import java.nio.ByteBuffer;
import okio.ByteString;

/* compiled from: RealBufferedSink.kt */
/* loaded from: classes3.dex */
public final class r implements g {

    /* renamed from: a  reason: collision with root package name */
    public final w f19844a;

    /* renamed from: b  reason: collision with root package name */
    public final f f19845b;
    public boolean c;

    public r(w sink) {
        kotlin.jvm.internal.g.e(sink, "sink");
        this.f19844a = sink;
        this.f19845b = new f();
    }

    @Override // kk.w
    public final void D(f source, long j10) {
        kotlin.jvm.internal.g.e(source, "source");
        if (!this.c) {
            this.f19845b.D(source, j10);
            I();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.g
    public final g I() {
        int i10;
        if (!this.c) {
            f fVar = this.f19845b;
            long j10 = fVar.f19826b;
            if (j10 == 0) {
                j10 = 0;
            } else {
                u uVar = fVar.f19825a;
                kotlin.jvm.internal.g.b(uVar);
                u uVar2 = uVar.f19854g;
                kotlin.jvm.internal.g.b(uVar2);
                if (uVar2.c < 8192 && uVar2.f19852e) {
                    j10 -= i10 - uVar2.f19850b;
                }
            }
            if (j10 > 0) {
                this.f19844a.D(fVar, j10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.g
    public final g K(String string) {
        kotlin.jvm.internal.g.e(string, "string");
        if (!this.c) {
            this.f19845b.x(string);
            I();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.g
    public final long M(y yVar) {
        long j10 = 0;
        while (true) {
            long g10 = ((n) yVar).g(this.f19845b, 8192L);
            if (g10 != -1) {
                j10 += g10;
                I();
            } else {
                return j10;
            }
        }
    }

    @Override // kk.g
    public final g P(long j10) {
        if (!this.c) {
            this.f19845b.s(j10);
            I();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.g
    public final g Z(ByteString byteString) {
        kotlin.jvm.internal.g.e(byteString, "byteString");
        if (!this.c) {
            this.f19845b.p(byteString);
            I();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.f19844a;
        if (!this.c) {
            try {
                f fVar = this.f19845b;
                long j10 = fVar.f19826b;
                if (j10 > 0) {
                    wVar.D(fVar, j10);
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                wVar.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // kk.g
    public final g e0(int i10, int i11, byte[] source) {
        kotlin.jvm.internal.g.e(source, "source");
        if (!this.c) {
            this.f19845b.o(i10, i11, source);
            I();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.g, kk.w, java.io.Flushable
    public final void flush() {
        if (!this.c) {
            f fVar = this.f19845b;
            long j10 = fVar.f19826b;
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            w wVar = this.f19844a;
            if (i10 > 0) {
                wVar.D(fVar, j10);
            }
            wVar.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.g
    public final g h0(long j10) {
        if (!this.c) {
            this.f19845b.r(j10);
            I();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final String toString() {
        return "buffer(" + this.f19844a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.g.e(source, "source");
        if (!this.c) {
            int write = this.f19845b.write(source);
            I();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.g
    public final g writeByte(int i10) {
        if (!this.c) {
            this.f19845b.q(i10);
            I();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.g
    public final g writeInt(int i10) {
        if (!this.c) {
            this.f19845b.t(i10);
            I();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.g
    public final g writeShort(int i10) {
        if (!this.c) {
            this.f19845b.u(i10);
            I();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.g
    public final f y() {
        return this.f19845b;
    }

    @Override // kk.w
    public final z z() {
        return this.f19844a.z();
    }

    @Override // kk.g
    public final g write(byte[] bArr) {
        if (!this.c) {
            f fVar = this.f19845b;
            fVar.getClass();
            fVar.o(0, bArr.length, bArr);
            I();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
