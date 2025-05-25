package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class R2 {

    /* renamed from: b  reason: collision with root package name */
    public static final SQLiteDatabase f14605b;

    /* renamed from: a  reason: collision with root package name */
    public static final R2 f14604a = new R2();
    public static final Object c = new Object();

    static {
        try {
            f14605b = new Q2(Ha.d()).getWritableDatabase();
        } catch (Exception unused) {
        }
    }

    public static final int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        synchronized (c) {
            long a10 = a(str, contentValues);
            if (a10 == -1) {
                return b(str, contentValues, str2, strArr);
            }
            return (int) a10;
        }
    }

    public static final int b(String str, ContentValues contentValues, String str2, String[] strArr) {
        int updateWithOnConflict;
        synchronized (c) {
            SQLiteDatabase sQLiteDatabase = f14605b;
            updateWithOnConflict = sQLiteDatabase != null ? sQLiteDatabase.updateWithOnConflict(str, contentValues, str2, strArr, 4) : -1;
        }
        return updateWithOnConflict;
    }

    public static final List<ContentValues> b(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        Cursor query;
        synchronized (c) {
            SQLiteDatabase sQLiteDatabase = f14605b;
            query = sQLiteDatabase != null ? sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6) : null;
            tf.d dVar = tf.d.f30009a;
        }
        if (query != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (query.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(query, contentValues);
                        arrayList.add(contentValues);
                    } while (query.moveToNext());
                    o9.d.l(query, null);
                    return arrayList;
                }
                o9.d.l(query, null);
                return arrayList;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    o9.d.l(query, th2);
                    throw th3;
                }
            }
        }
        return EmptyList.INSTANCE;
    }

    public static final long a(String str, ContentValues contentValues) {
        long insertWithOnConflict;
        synchronized (c) {
            SQLiteDatabase sQLiteDatabase = f14605b;
            insertWithOnConflict = sQLiteDatabase != null ? sQLiteDatabase.insertWithOnConflict(str, null, contentValues, 4) : -1L;
        }
        return insertWithOnConflict;
    }

    public static final int a(String str, String str2, String[] strArr) {
        int delete;
        synchronized (c) {
            SQLiteDatabase sQLiteDatabase = f14605b;
            delete = sQLiteDatabase != null ? sQLiteDatabase.delete(str, str2, strArr) : 0;
        }
        return delete;
    }

    public static final void a(String tableName) {
        kotlin.jvm.internal.g.e(tableName, "tableName");
        String str = "DROP TABLE IF EXISTS \"" + tableName + '\"';
        synchronized (c) {
            SQLiteDatabase sQLiteDatabase = f14605b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(str);
                tf.d dVar = tf.d.f30009a;
            }
        }
    }

    public final void a(String tableName, String tableSchema) {
        kotlin.jvm.internal.g.e(tableName, "tableName");
        kotlin.jvm.internal.g.e(tableSchema, "tableSchema");
        String str = "CREATE TABLE IF NOT EXISTS " + tableName + tableSchema + ';';
        synchronized (c) {
            SQLiteDatabase sQLiteDatabase = f14605b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(str);
                tf.d dVar = tf.d.f30009a;
            }
        }
    }

    public static final int a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        int i10;
        Cursor query;
        synchronized (c) {
            SQLiteDatabase sQLiteDatabase = f14605b;
            query = sQLiteDatabase != null ? sQLiteDatabase.query(str, new String[]{"COUNT(*) AS count"}, str2, strArr2, str3, str4, str5, str6) : null;
            tf.d dVar = tf.d.f30009a;
        }
        if (query != null) {
            try {
                i10 = query.moveToFirst() ? query.getInt(query.getColumnIndex("count")) : 0;
                o9.d.l(query, null);
            } catch (Exception unused) {
            }
        }
        return i10;
    }
}
