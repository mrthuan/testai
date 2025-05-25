package c7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c7.p;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import v6.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements p.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5647a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f5648b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f5649d;

    public /* synthetic */ n(p pVar, Serializable serializable, Object obj, int i10) {
        this.f5647a = i10;
        this.f5648b = pVar;
        this.c = serializable;
        this.f5649d = obj;
    }

    @Override // c7.p.a
    public final Object apply(Object obj) {
        boolean z10;
        s6.b bVar;
        s6.b bVar2;
        int i10 = this.f5647a;
        p pVar = this.f5648b;
        Object obj2 = this.f5649d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                pVar.getClass();
                sQLiteDatabase.compileStatement((String) obj3).execute();
                Cursor rawQuery = sQLiteDatabase.rawQuery((String) obj2, null);
                try {
                    s6.b bVar3 = p.f5653f;
                    while (rawQuery.moveToNext()) {
                        pVar.d(rawQuery.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    return null;
                } catch (Throwable th2) {
                    rawQuery.close();
                    throw th2;
                }
            default:
                List list = (List) obj3;
                v6.s sVar = (v6.s) obj2;
                Cursor cursor = (Cursor) obj;
                pVar.getClass();
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    if (cursor.getInt(7) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h.a aVar = new h.a();
                    aVar.f30706f = new HashMap();
                    aVar.d(cursor.getString(1));
                    aVar.f30704d = Long.valueOf(cursor.getLong(2));
                    aVar.f30705e = Long.valueOf(cursor.getLong(3));
                    if (z10) {
                        String string = cursor.getString(4);
                        if (string == null) {
                            bVar2 = p.f5653f;
                        } else {
                            bVar2 = new s6.b(string);
                        }
                        aVar.c(new v6.m(bVar2, cursor.getBlob(5)));
                    } else {
                        String string2 = cursor.getString(4);
                        if (string2 == null) {
                            bVar = p.f5653f;
                        } else {
                            bVar = new s6.b(string2);
                        }
                        aVar.c(new v6.m(bVar, (byte[]) p.l(pVar.f().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new t5.e(5))));
                    }
                    if (!cursor.isNull(6)) {
                        aVar.f30703b = Integer.valueOf(cursor.getInt(6));
                    }
                    list.add(new b(j10, sVar, aVar.b()));
                }
                return null;
        }
    }
}
