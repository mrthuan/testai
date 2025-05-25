package kk;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.kt */
/* loaded from: classes3.dex */
public final class m implements y {

    /* renamed from: a  reason: collision with root package name */
    public final h f19834a;

    /* renamed from: b  reason: collision with root package name */
    public final Inflater f19835b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19836d;

    public m(t tVar, Inflater inflater) {
        this.f19834a = tVar;
        this.f19835b = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f19836d) {
            return;
        }
        this.f19835b.end();
        this.f19836d = true;
        this.f19834a.close();
    }

    @Override // kk.y
    public final long g(f sink, long j10) {
        long j11;
        kotlin.jvm.internal.g.e(sink, "sink");
        while (!this.f19836d) {
            Inflater inflater = this.f19835b;
            try {
                u n10 = sink.n(1);
                int min = (int) Math.min(8192L, 8192 - n10.c);
                boolean needsInput = inflater.needsInput();
                h hVar = this.f19834a;
                if (needsInput && !hVar.E()) {
                    u uVar = hVar.y().f19825a;
                    kotlin.jvm.internal.g.b(uVar);
                    int i10 = uVar.c;
                    int i11 = uVar.f19850b;
                    int i12 = i10 - i11;
                    this.c = i12;
                    inflater.setInput(uVar.f19849a, i11, i12);
                }
                int inflate = inflater.inflate(n10.f19849a, n10.c, min);
                int i13 = this.c;
                if (i13 != 0) {
                    int remaining = i13 - inflater.getRemaining();
                    this.c -= remaining;
                    hVar.skip(remaining);
                }
                if (inflate > 0) {
                    n10.c += inflate;
                    j11 = inflate;
                    sink.f19826b += j11;
                } else {
                    if (n10.f19850b == n10.c) {
                        sink.f19825a = n10.a();
                        v.a(n10);
                    }
                    j11 = 0;
                }
                if (j11 > 0) {
                    return j11;
                }
                if (!inflater.finished() && !inflater.needsDictionary()) {
                    if (hVar.E()) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } else {
                    return -1L;
                }
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // kk.y
    public final z z() {
        return this.f19834a.z();
    }
}
