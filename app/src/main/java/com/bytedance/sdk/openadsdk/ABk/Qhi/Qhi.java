package com.bytedance.sdk.openadsdk.ABk.Qhi;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.utils.ABk;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MonitorSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public class Qhi extends SQLiteOpenHelper {
    private static volatile Qhi cJ;
    final Context Qhi;

    private Qhi(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.Qhi = context;
    }

    public static SQLiteDatabase Qhi() {
        try {
            Qhi ac2 = ac();
            if (ac2 != null) {
                SQLiteDatabase writableDatabase = ac2.getWritableDatabase();
                if (writableDatabase.isOpen()) {
                    return writableDatabase;
                }
                return null;
            }
            return null;
        } catch (Throwable th2) {
            th2.getMessage();
            return null;
        }
    }

    private static Qhi ac() {
        if (cJ == null) {
            synchronized (Qhi.class) {
                if (cJ == null) {
                    cJ = new Qhi(com.bytedance.sdk.openadsdk.ABk.Qhi.Qhi());
                }
            }
        }
        return cJ;
    }

    public static SQLiteDatabase cJ() {
        try {
            Qhi ac2 = ac();
            if (ac2 != null) {
                SQLiteDatabase readableDatabase = ac2.getReadableDatabase();
                if (readableDatabase.isOpen()) {
                    return readableDatabase;
                }
                return null;
            }
            return null;
        } catch (Throwable th2) {
            th2.getMessage();
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 > i11) {
                Qhi(sQLiteDatabase);
                onCreate(sQLiteDatabase);
                return;
            }
            onCreate(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    private void Qhi(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> cJ2 = cJ(sQLiteDatabase);
        if (cJ2 == null || cJ2.size() <= 0) {
            return;
        }
        Iterator<String> it = cJ2.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private ArrayList<String> cJ(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                rawQuery.close();
            }
        } catch (Exception e10) {
            ABk.Qhi("MonitorSQLiteOpenHelper", e10.getMessage());
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
