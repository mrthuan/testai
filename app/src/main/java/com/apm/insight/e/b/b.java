package com.apm.insight.e.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.l.p;
import java.util.HashMap;

/* loaded from: classes.dex */
public class b extends a<com.apm.insight.e.a.a> {
    public b() {
        super("duplicatelog");
    }

    @Override // com.apm.insight.e.b.a
    public ContentValues a(com.apm.insight.e.a.a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", aVar.f6452a);
        contentValues.put("insert_time", Long.valueOf(aVar.f6453b));
        return contentValues;
    }

    @Override // com.apm.insight.e.b.a
    public HashMap<String, String> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("path", "TEXT");
        hashMap.put("insert_time", "INTEGER");
        hashMap.put("ext1", "TEXT");
        hashMap.put("ext2", "TEXT");
        return hashMap;
    }

    @Override // com.apm.insight.e.b.a
    public void a(SQLiteDatabase sQLiteDatabase, com.apm.insight.e.a.a aVar) {
        if (aVar == null || a(sQLiteDatabase, aVar.f6452a)) {
            return;
        }
        super.a(sQLiteDatabase, (SQLiteDatabase) aVar);
        try {
            sQLiteDatabase.execSQL("delete from " + this.f6455b + " where _id in (select _id from " + this.f6455b + " order by insert_time desc limit 1000 offset 500)");
        } catch (Exception e10) {
            p.b((Throwable) e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.database.sqlite.SQLiteDatabase r11, java.lang.String r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L2d
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto La
            goto L2d
        La:
            java.lang.String r3 = r10.f6455b     // Catch: java.lang.Throwable -> L25
            r4 = 0
            java.lang.String r5 = "path=?"
            java.lang.String[] r6 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L25
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L25
            int r12 = r11.getCount()     // Catch: java.lang.Throwable -> L25
            r11.close()     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r11 = move-exception
            goto L27
        L25:
            r11 = move-exception
            r12 = r0
        L27:
            com.apm.insight.l.p.b(r11)
        L2a:
            if (r12 <= 0) goto L2d
            r0 = 1
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.e.b.b.a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }
}
