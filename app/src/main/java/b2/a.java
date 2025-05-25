package b2;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* compiled from: FrameworkSQLiteDatabase.java */
/* loaded from: classes.dex */
public final class a implements a2.b {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f5306b = new String[0];

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteDatabase f5307a;

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* renamed from: b2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0033a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a2.d f5308a;

        public C0033a(a2.d dVar) {
            this.f5308a = dVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f5308a.a(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f5307a = sQLiteDatabase;
    }

    public final void a() {
        this.f5307a.beginTransaction();
    }

    public final void b() {
        this.f5307a.endTransaction();
    }

    public final void c(String str) {
        this.f5307a.execSQL(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5307a.close();
    }

    public final Cursor d(a2.d dVar) {
        return this.f5307a.rawQueryWithFactory(new C0033a(dVar), dVar.c(), f5306b, null);
    }

    public final Cursor f(String str) {
        return d(new a2.a(str));
    }

    public final void h() {
        this.f5307a.setTransactionSuccessful();
    }
}
