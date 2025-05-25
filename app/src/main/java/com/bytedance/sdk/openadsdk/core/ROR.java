package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DBHelper.java */
/* loaded from: classes.dex */
public class ROR {

    /* renamed from: ac  reason: collision with root package name */
    private static final Object f8939ac = new Object();
    private ac Qhi;
    private Context cJ;

    /* compiled from: DBHelper.java */
    /* loaded from: classes.dex */
    public class cJ extends AbstractCursor {
        private cJ() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i10) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i10) {
            return true;
        }
    }

    public ROR(Context context) {
        Context applicationContext;
        try {
            if (context == null) {
                applicationContext = HzH.Qhi();
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.cJ = applicationContext;
            if (this.Qhi == null) {
                this.Qhi = new ac();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context ac() {
        Context context = this.cJ;
        if (context == null) {
            return HzH.Qhi();
        }
        return context;
    }

    /* compiled from: DBHelper.java */
    /* loaded from: classes.dex */
    public class ac {
        private SQLiteDatabase cJ = null;

        public ac() {
        }

        private synchronized boolean Tgh() {
            SQLiteDatabase sQLiteDatabase = this.cJ;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized void fl() {
            try {
                synchronized (ROR.f8939ac) {
                    SQLiteDatabase sQLiteDatabase = this.cJ;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        ROR ror = ROR.this;
                        SQLiteDatabase writableDatabase = new Qhi(ror.ac()).getWritableDatabase();
                        this.cJ = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.Qhi("DBHelper", th2.getMessage());
                if (!Tgh()) {
                    return;
                }
                throw th2;
            }
        }

        public synchronized void CJ() {
            fl();
            SQLiteDatabase sQLiteDatabase = this.cJ;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public SQLiteDatabase Qhi() {
            fl();
            return this.cJ;
        }

        public synchronized void ac() {
            fl();
            SQLiteDatabase sQLiteDatabase = this.cJ;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void cJ() {
            fl();
            SQLiteDatabase sQLiteDatabase = this.cJ;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public synchronized void Qhi(String str) {
            try {
                fl();
                this.cJ.execSQL(str);
            } catch (Throwable th2) {
                if (Tgh()) {
                    throw th2;
                }
            }
        }

        public synchronized Cursor Qhi(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                fl();
                cursor = this.cJ.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.Qhi("DBHelper", th2.getMessage());
                cJ cJVar = new cJ();
                if (Tgh()) {
                    throw th2;
                }
                cursor = cJVar;
            }
            return cursor;
        }

        public synchronized int Qhi(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i10;
            try {
                fl();
                i10 = this.cJ.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("DBHelper", e10.getMessage());
                if (Tgh()) {
                    throw e10;
                }
                i10 = 0;
            }
            return i10;
        }

        public synchronized long Qhi(String str, String str2, ContentValues contentValues) {
            long j10;
            try {
                fl();
                j10 = this.cJ.replace(str, str2, contentValues);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("DBHelper", e10.getMessage());
                if (Tgh()) {
                    throw e10;
                }
                j10 = -1;
            }
            return j10;
        }

        public synchronized int Qhi(String str, String str2, String[] strArr) {
            int i10;
            try {
                fl();
                i10 = this.cJ.delete(str, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("DBHelper", e10.getMessage());
                if (Tgh()) {
                    throw e10;
                }
                i10 = 0;
            }
            return i10;
        }
    }

    public ac Qhi() {
        return this.Qhi;
    }

    /* compiled from: DBHelper.java */
    /* loaded from: classes.dex */
    public class Qhi extends SQLiteOpenHelper {
        final Context Qhi;

        public Qhi(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 12);
            this.Qhi = context;
        }

        private void CJ(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> fl2 = fl(sQLiteDatabase);
            if (fl2 != null && fl2.size() > 0) {
                Iterator<String> it = fl2.iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
                }
            }
        }

        private void Qhi(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cJ.fl.Qhi());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cJ.WAv.ac());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cJ.pA.Qhi());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cJ.iMK.Qhi());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.MQ.cJ.Qhi());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cJ.HzH.ac());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.ac());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ugen.Qhi.ac.ac());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cJ.hpZ.Qhi());
        }

        private void ac(SQLiteDatabase sQLiteDatabase) {
            if (!Qhi(sQLiteDatabase, "ugen_template", "rit")) {
                sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ugen.Qhi.ac.CJ());
            }
        }

        private void cJ(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cJ.fl.cJ());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cJ.WAv.CJ());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cJ.pA.cJ());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cJ.iMK.cJ());
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
            if (r1 != null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
            if (r1 != null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
            r1.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.util.ArrayList<java.lang.String> fl(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
                java.lang.String r2 = "select name from sqlite_master where type='table' order by name"
                android.database.Cursor r1 = r4.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                if (r1 == 0) goto L2d
            Le:
                boolean r4 = r1.moveToNext()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                if (r4 == 0) goto L2d
                r4 = 0
                java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                java.lang.String r2 = "android_metadata"
                boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                if (r2 != 0) goto Le
                java.lang.String r2 = "sqlite_sequence"
                boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                if (r2 != 0) goto Le
                r0.add(r4)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L37
                goto Le
            L2d:
                if (r1 == 0) goto L3c
                goto L39
            L30:
                r4 = move-exception
                if (r1 == 0) goto L36
                r1.close()
            L36:
                throw r4
            L37:
                if (r1 == 0) goto L3c
            L39:
                r1.close()
            L3c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ROR.Qhi.fl(android.database.sqlite.SQLiteDatabase):java.util.ArrayList");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                Qhi(sQLiteDatabase, this.Qhi);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.Qhi("DBHelper", th2.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 > i11) {
                try {
                    CJ(sQLiteDatabase);
                    Qhi(sQLiteDatabase, ROR.this.cJ);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ABk.cJ(th2.getMessage());
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 > i11) {
                try {
                    CJ(sQLiteDatabase);
                } catch (Throwable unused) {
                }
            }
            Qhi(sQLiteDatabase, ROR.this.cJ);
            switch (i10) {
                case 1:
                    cJ(sQLiteDatabase);
                    break;
                case 2:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                    cJ(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cJ.pA.Qhi());
                    cJ(sQLiteDatabase);
                    break;
                case 4:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.ac());
                    cJ(sQLiteDatabase);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.cJ.iMK.Qhi());
                    cJ(sQLiteDatabase);
                    break;
                case 6:
                    cJ(sQLiteDatabase);
                    break;
            }
            if (i10 < 12) {
                try {
                    ac(sQLiteDatabase);
                    Qhi(sQLiteDatabase);
                }
            }
        }

        private void Qhi(SQLiteDatabase sQLiteDatabase) {
            if (Qhi(sQLiteDatabase, "trackurl", "ad_id") || Qhi(sQLiteDatabase, "trackurl", "error_code") || Qhi(sQLiteDatabase, "trackurl", "error_msg") || Qhi(sQLiteDatabase, "trackurl", "url_type")) {
                return;
            }
            com.bytedance.sdk.openadsdk.MQ.cJ.Qhi(sQLiteDatabase);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
            if (r1.isClosed() == false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean Qhi(android.database.sqlite.SQLiteDatabase r5, java.lang.String r6, java.lang.String r7) {
            /*
                r4 = this;
                r0 = 0
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                java.lang.String r3 = "SELECT * FROM "
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                r2.append(r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                java.lang.String r6 = " LIMIT 0"
                r2.append(r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                android.database.Cursor r1 = r5.rawQuery(r6, r1)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                if (r1 == 0) goto L24
                int r5 = r1.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                r6 = -1
                if (r5 == r6) goto L24
                r5 = 1
                r0 = r5
            L24:
                if (r1 == 0) goto L53
                boolean r5 = r1.isClosed()
                if (r5 != 0) goto L53
            L2c:
                r1.close()
                goto L53
            L30:
                r5 = move-exception
                goto L54
            L32:
                r5 = move-exception
                java.lang.String r6 = "DBHelper"
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
                java.lang.String r2 = "checkColumnExists1..."
                r7.<init>(r2)     // Catch: java.lang.Throwable -> L30
                java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L30
                r7.append(r5)     // Catch: java.lang.Throwable -> L30
                java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L30
                com.bytedance.sdk.component.utils.ABk.Qhi(r6, r5)     // Catch: java.lang.Throwable -> L30
                if (r1 == 0) goto L53
                boolean r5 = r1.isClosed()
                if (r5 != 0) goto L53
                goto L2c
            L53:
                return r0
            L54:
                if (r1 == 0) goto L5f
                boolean r6 = r1.isClosed()
                if (r6 != 0) goto L5f
                r1.close()
            L5f:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
        }
    }
}
