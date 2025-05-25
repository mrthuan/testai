package w1;

import java.io.File;

/* compiled from: SQLiteCopyOpenHelper.java */
/* loaded from: classes.dex */
public final class i implements a2.c {

    /* renamed from: a  reason: collision with root package name */
    public androidx.room.a f30930a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f30931b;

    @Override // a2.c
    public final synchronized a2.b L() {
        if (!this.f30931b) {
            b();
            this.f30931b = true;
        }
        throw null;
    }

    public final void a(File file) {
        throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
    }

    public final void b() {
        getDatabaseName();
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // a2.c
    public final String getDatabaseName() {
        throw null;
    }

    @Override // a2.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        throw null;
    }
}
