package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.i;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f6450a;

    /* renamed from: b  reason: collision with root package name */
    private com.apm.insight.e.b.b f6451b;
    private SQLiteDatabase c;

    private a() {
    }

    public static a a() {
        if (f6450a == null) {
            synchronized (a.class) {
                if (f6450a == null) {
                    f6450a = new a();
                }
            }
        }
        return f6450a;
    }

    private void b() {
        if (this.f6451b == null) {
            a(i.g());
        }
    }

    public synchronized void a(Context context) {
        try {
            this.c = new b(context).getWritableDatabase();
            this.f6451b = new com.apm.insight.e.b.b();
        }
    }

    public synchronized void a(com.apm.insight.e.a.a aVar) {
        b();
        com.apm.insight.e.b.b bVar = this.f6451b;
        if (bVar != null) {
            bVar.a(this.c, aVar);
        }
    }

    public synchronized boolean a(String str) {
        b();
        com.apm.insight.e.b.b bVar = this.f6451b;
        if (bVar != null) {
            return bVar.a(this.c, str);
        }
        return false;
    }
}
