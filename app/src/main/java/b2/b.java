package b2;

import a2.c;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.room.c;
import java.io.File;

/* compiled from: FrameworkSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public final class b implements a2.c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5309a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5310b;
    public final c.a c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5311d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f5312e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public a f5313f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5314g;

    /* compiled from: FrameworkSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        public final b2.a[] f5315a;

        /* renamed from: b  reason: collision with root package name */
        public final c.a f5316b;
        public boolean c;

        /* compiled from: FrameworkSQLiteOpenHelper.java */
        /* renamed from: b2.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0034a implements DatabaseErrorHandler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c.a f5317a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ b2.a[] f5318b;

            public C0034a(c.a aVar, b2.a[] aVarArr) {
                this.f5317a = aVar;
                this.f5318b = aVarArr;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
                if (r2 == false) goto L39;
             */
            @Override // android.database.DatabaseErrorHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                /*
                    r3 = this;
                    b2.a[] r0 = r3.f5318b
                    r1 = 0
                    r2 = r0[r1]
                    if (r2 == 0) goto L10
                    android.database.sqlite.SQLiteDatabase r2 = r2.f5307a
                    if (r2 != r4) goto Ld
                    r2 = 1
                    goto Le
                Ld:
                    r2 = r1
                Le:
                    if (r2 != 0) goto L17
                L10:
                    b2.a r2 = new b2.a
                    r2.<init>(r4)
                    r0[r1] = r2
                L17:
                    r4 = r0[r1]
                    a2.c$a r0 = r3.f5317a
                    r0.getClass()
                    android.database.sqlite.SQLiteDatabase r0 = r4.f5307a
                    r0.getPath()
                    android.database.sqlite.SQLiteDatabase r0 = r4.f5307a
                    boolean r1 = r0.isOpen()
                    if (r1 != 0) goto L33
                    java.lang.String r4 = r0.getPath()
                    a2.c.a.a(r4)
                    goto L82
                L33:
                    r1 = 0
                    java.util.List r1 = r0.getAttachedDbs()     // Catch: java.lang.Throwable -> L39 android.database.sqlite.SQLiteException -> L3b
                    goto L3b
                L39:
                    r4 = move-exception
                    goto L3f
                L3b:
                    r4.close()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L61
                    goto L61
                L3f:
                    if (r1 == 0) goto L59
                    java.util.Iterator r0 = r1.iterator()
                L45:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L60
                    java.lang.Object r1 = r0.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    a2.c.a.a(r1)
                    goto L45
                L59:
                    java.lang.String r0 = r0.getPath()
                    a2.c.a.a(r0)
                L60:
                    throw r4
                L61:
                    if (r1 == 0) goto L7b
                    java.util.Iterator r4 = r1.iterator()
                L67:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L82
                    java.lang.Object r0 = r4.next()
                    android.util.Pair r0 = (android.util.Pair) r0
                    java.lang.Object r0 = r0.second
                    java.lang.String r0 = (java.lang.String) r0
                    a2.c.a.a(r0)
                    goto L67
                L7b:
                    java.lang.String r4 = r0.getPath()
                    a2.c.a.a(r4)
                L82:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: b2.b.a.C0034a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public a(Context context, String str, b2.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.f27a, new C0034a(aVar, aVarArr));
            this.f5316b = aVar;
            this.f5315a = aVarArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
            if (r2 == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final b2.a a(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                b2.a[] r0 = r3.f5315a
                r1 = 0
                r2 = r0[r1]
                if (r2 == 0) goto L10
                android.database.sqlite.SQLiteDatabase r2 = r2.f5307a
                if (r2 != r4) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = r1
            Le:
                if (r2 != 0) goto L17
            L10:
                b2.a r2 = new b2.a
                r2.<init>(r4)
                r0[r1] = r2
            L17:
                r4 = r0[r1]
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: b2.b.a.a(android.database.sqlite.SQLiteDatabase):b2.a");
        }

        public final synchronized a2.b b() {
            this.c = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (this.c) {
                close();
                return b();
            }
            return a(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final synchronized void close() {
            super.close();
            this.f5315a[0] = null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
            this.f5316b.getClass();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            b2.a a10 = a(sQLiteDatabase);
            androidx.room.c cVar = (androidx.room.c) this.f5316b;
            cVar.getClass();
            Cursor f10 = a10.f("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z10 = false;
                if (f10.moveToFirst()) {
                    if (f10.getInt(0) == 0) {
                        z10 = true;
                    }
                }
                f10.close();
                c.a aVar = cVar.c;
                aVar.a(a10);
                if (!z10) {
                    c.b g10 = aVar.g(a10);
                    if (!g10.f4656a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f4657b);
                    }
                }
                cVar.c(a10);
                aVar.c();
            } catch (Throwable th2) {
                f10.close();
                throw th2;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.c = true;
            ((androidx.room.c) this.f5316b).b(a(sQLiteDatabase), i10, i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onOpen(android.database.sqlite.SQLiteDatabase r7) {
            /*
                r6 = this;
                boolean r0 = r6.c
                if (r0 != 0) goto L94
                b2.a r7 = r6.a(r7)
                a2.c$a r0 = r6.f5316b
                androidx.room.c r0 = (androidx.room.c) r0
                r0.getClass()
                java.lang.String r1 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
                android.database.Cursor r1 = r7.f(r1)
                boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L8f
                r3 = 0
                if (r2 == 0) goto L24
                int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L8f
                if (r2 == 0) goto L24
                r2 = 1
                goto L25
            L24:
                r2 = r3
            L25:
                r1.close()
                r1 = 0
                androidx.room.c$a r4 = r0.c
                if (r2 == 0) goto L65
                a2.a r2 = new a2.a
                java.lang.String r5 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
                r2.<init>(r5)
                android.database.Cursor r2 = r7.d(r2)
                boolean r5 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L60
                if (r5 == 0) goto L43
                java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L60
                goto L44
            L43:
                r3 = r1
            L44:
                r2.close()
                java.lang.String r2 = r0.f4653d
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L73
                java.lang.String r2 = r0.f4654e
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L58
                goto L73
            L58:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number."
                r7.<init>(r0)
                throw r7
            L60:
                r7 = move-exception
                r2.close()
                throw r7
            L65:
                androidx.room.c$b r2 = r4.g(r7)
                boolean r3 = r2.f4656a
                if (r3 == 0) goto L79
                r4.e()
                r0.c(r7)
            L73:
                r4.d(r7)
                r0.f4652b = r1
                goto L94
            L79:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Pre-packaged database has an invalid schema: "
                r0.<init>(r1)
                java.lang.String r1 = r2.f4657b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L8f:
                r7 = move-exception
                r1.close()
                throw r7
            L94:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b2.b.a.onOpen(android.database.sqlite.SQLiteDatabase):void");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.c = true;
            this.f5316b.b(a(sQLiteDatabase), i10, i11);
        }
    }

    public b(Context context, String str, c.a aVar, boolean z10) {
        this.f5309a = context;
        this.f5310b = str;
        this.c = aVar;
        this.f5311d = z10;
    }

    @Override // a2.c
    public final a2.b L() {
        return a().b();
    }

    public final a a() {
        a aVar;
        synchronized (this.f5312e) {
            if (this.f5313f == null) {
                b2.a[] aVarArr = new b2.a[1];
                if (this.f5310b != null && this.f5311d) {
                    this.f5313f = new a(this.f5309a, new File(this.f5309a.getNoBackupFilesDir(), this.f5310b).getAbsolutePath(), aVarArr, this.c);
                } else {
                    this.f5313f = new a(this.f5309a, this.f5310b, aVarArr, this.c);
                }
                this.f5313f.setWriteAheadLoggingEnabled(this.f5314g);
            }
            aVar = this.f5313f;
        }
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // a2.c
    public final String getDatabaseName() {
        return this.f5310b;
    }

    @Override // a2.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f5312e) {
            a aVar = this.f5313f;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.f5314g = z10;
        }
    }
}
