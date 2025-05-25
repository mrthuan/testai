package kk;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: Sink.kt */
/* loaded from: classes3.dex */
public interface w extends Closeable, Flushable {
    void D(f fVar, long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    z z();
}
