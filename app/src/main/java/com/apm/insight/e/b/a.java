package com.apm.insight.e.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.c;
import com.apm.insight.l.p;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final String f6454a = "_id";

    /* renamed from: b  reason: collision with root package name */
    protected final String f6455b;

    public a(String str) {
        this.f6455b = str;
    }

    public abstract ContentValues a(T t4);

    public abstract HashMap<String, String> a();

    public void a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE TABLE ");
            sb2.append(this.f6455b);
            sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> a10 = a();
            if (a10 != null) {
                for (String str : a10.keySet()) {
                    sb2.append(str);
                    sb2.append(" ");
                    sb2.append(a10.get(str));
                    sb2.append(",");
                }
                sb2.delete(sb2.length() - 1, sb2.length());
                sb2.append(")");
                sQLiteDatabase.execSQL(sb2.toString());
            }
        } catch (Throwable th2) {
            c.a().a("NPTH_CATCH", th2);
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase, T t4) {
        if (sQLiteDatabase == null || t4 == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.f6455b, null, a((a<T>) t4));
        } catch (Throwable th2) {
            p.b(th2);
        }
    }
}
