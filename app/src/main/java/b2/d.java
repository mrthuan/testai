package b2;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* compiled from: FrameworkSQLiteProgram.java */
/* loaded from: classes.dex */
public class d implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteProgram f5319a;

    public d(SQLiteProgram sQLiteProgram) {
        this.f5319a = sQLiteProgram;
    }

    public final void a(int i10, byte[] bArr) {
        this.f5319a.bindBlob(i10, bArr);
    }

    public final void b(double d10, int i10) {
        this.f5319a.bindDouble(i10, d10);
    }

    public final void c(int i10, long j10) {
        this.f5319a.bindLong(i10, j10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5319a.close();
    }

    public final void d(int i10) {
        this.f5319a.bindNull(i10);
    }

    public final void f(int i10, String str) {
        this.f5319a.bindString(i10, str);
    }
}
