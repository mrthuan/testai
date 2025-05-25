package a2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.io.File;

/* compiled from: SupportSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public interface c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f27a;

        public a(int i10) {
            this.f27a = i10;
        }

        public static void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception unused) {
                }
            }
        }

        public abstract void b(b2.a aVar, int i10, int i11);
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f28a;

        /* renamed from: b  reason: collision with root package name */
        public final String f29b;
        public final a c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f30d;

        public b(Context context, String str, a aVar, boolean z10) {
            this.f28a = context;
            this.f29b = str;
            this.c = aVar;
            this.f30d = z10;
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: a2.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0000c {
        c a(b bVar);
    }

    a2.b L();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
