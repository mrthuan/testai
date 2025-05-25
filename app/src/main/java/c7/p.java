package c7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import d7.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import y6.a;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
public final class p implements d, d7.a, c {

    /* renamed from: f  reason: collision with root package name */
    public static final s6.b f5653f = new s6.b("proto");

    /* renamed from: a  reason: collision with root package name */
    public final v f5654a;

    /* renamed from: b  reason: collision with root package name */
    public final e7.a f5655b;
    public final e7.a c;

    /* renamed from: d  reason: collision with root package name */
    public final e f5656d;

    /* renamed from: e  reason: collision with root package name */
    public final pf.a<String> f5657e;

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes.dex */
    public interface a<T, U> {
        U apply(T t4);
    }

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f5658a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5659b;

        public b(String str, String str2) {
            this.f5658a = str;
            this.f5659b = str2;
        }
    }

    public p(e7.a aVar, e7.a aVar2, e eVar, v vVar, pf.a<String> aVar3) {
        this.f5654a = vVar;
        this.f5655b = aVar;
        this.c = aVar2;
        this.f5656d = eVar;
        this.f5657e = aVar3;
    }

    public static Long h(SQLiteDatabase sQLiteDatabase, v6.s sVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(sVar.b(), String.valueOf(f7.a.a(sVar.d()))));
        if (sVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(sVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) l(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new t5.e(4));
    }

    public static String k(Iterable<i> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <T> T l(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // c7.d
    public final int A() {
        final long a10 = this.f5655b.a() - this.f5656d.b();
        return ((Integer) i(new a() { // from class: c7.k
            @Override // c7.p.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                p pVar = p.this;
                pVar.getClass();
                String[] strArr = {String.valueOf(a10)};
                p.l(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new com.google.android.tools.d(pVar, 2));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            }
        })).intValue();
    }

    @Override // c7.d
    public final void B(Iterable<i> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        f().compileStatement("DELETE FROM events WHERE _id in " + k(iterable)).execute();
    }

    @Override // c7.d
    public final long C(v6.s sVar) {
        Long l10;
        Cursor rawQuery = f().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(f7.a.a(sVar.d()))});
        try {
            if (rawQuery.moveToNext()) {
                l10 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l10 = 0L;
            }
            rawQuery.close();
            return l10.longValue();
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override // c7.d
    public final Iterable<i> F(v6.s sVar) {
        return (Iterable) i(new androidx.privacysandbox.ads.adservices.java.internal.a(this, sVar));
    }

    @Override // c7.d
    public final Iterable<v6.s> G() {
        SQLiteDatabase f10 = f();
        f10.beginTransaction();
        try {
            List list = (List) l(f10.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new t5.i(4));
            f10.setTransactionSuccessful();
            f10.endTransaction();
            return list;
        } catch (Throwable th2) {
            f10.endTransaction();
            throw th2;
        }
    }

    @Override // d7.a
    public final <T> T a(a.InterfaceC0194a<T> interfaceC0194a) {
        SQLiteDatabase f10 = f();
        e7.a aVar = this.c;
        long a10 = aVar.a();
        while (true) {
            try {
                f10.beginTransaction();
                try {
                    T l10 = interfaceC0194a.l();
                    f10.setTransactionSuccessful();
                    return l10;
                } finally {
                    f10.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.a() < this.f5656d.a() + a10) {
                    SystemClock.sleep(50L);
                } else {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e10);
                }
            }
        }
    }

    @Override // c7.c
    public final void b() {
        i(new a1.e(this, 3));
    }

    @Override // c7.c
    public final y6.a c() {
        int i10 = y6.a.f32076e;
        a.C0418a c0418a = new a.C0418a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase f10 = f();
        f10.beginTransaction();
        try {
            y6.a aVar = (y6.a) l(f10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new c5.f(this, hashMap, c0418a));
            f10.setTransactionSuccessful();
            return aVar;
        } finally {
            f10.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5654a.close();
    }

    @Override // c7.c
    public final void d(final long j10, final LogEventDropped.Reason reason, final String str) {
        i(new a() { // from class: c7.l
            @Override // c7.p.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                LogEventDropped.Reason reason2 = reason;
                String num = Integer.toString(reason2.getNumber());
                String str2 = str;
                boolean booleanValue = ((Boolean) p.l(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, num}), new t5.g(5))).booleanValue();
                long j11 = j10;
                if (!booleanValue) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(reason2.getNumber()));
                    contentValues.put("events_dropped_count", Long.valueOf(j11));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                } else {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j11 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(reason2.getNumber())});
                }
                return null;
            }
        });
    }

    public final SQLiteDatabase f() {
        Object apply;
        v vVar = this.f5654a;
        Objects.requireNonNull(vVar);
        t5.e eVar = new t5.e(3);
        e7.a aVar = this.c;
        long a10 = aVar.a();
        while (true) {
            try {
                apply = vVar.getWritableDatabase();
                break;
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.a() >= this.f5656d.a() + a10) {
                    apply = eVar.apply(e10);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        return (SQLiteDatabase) apply;
    }

    @Override // c7.d
    public final void f0(Iterable<i> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        i(new n(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + k(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 0));
    }

    public final <T> T i(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase f10 = f();
        f10.beginTransaction();
        try {
            T apply = aVar.apply(f10);
            f10.setTransactionSuccessful();
            return apply;
        } finally {
            f10.endTransaction();
        }
    }

    @Override // c7.d
    public final c7.b i0(v6.s sVar, v6.n nVar) {
        Object[] objArr = {sVar.d(), nVar.g(), sVar.b()};
        if (Log.isLoggable(z6.a.b("SQLiteEventStore"), 3)) {
            String.format("Storing event with priority=%s, name=%s for destination %s", objArr);
        }
        long longValue = ((Long) i(new j(this, nVar, sVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new c7.b(longValue, sVar, nVar);
    }

    public final ArrayList j(SQLiteDatabase sQLiteDatabase, v6.s sVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long h10 = h(sQLiteDatabase, sVar);
        if (h10 == null) {
            return arrayList;
        }
        l(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{h10.toString()}, null, null, null, String.valueOf(i10)), new n(this, arrayList, sVar, 1));
        return arrayList;
    }

    @Override // c7.d
    public final void l0(final long j10, final v6.s sVar) {
        i(new a() { // from class: c7.m
            @Override // c7.p.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j10));
                v6.s sVar2 = sVar;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{sVar2.b(), String.valueOf(f7.a.a(sVar2.d()))}) < 1) {
                    contentValues.put("backend_name", sVar2.b());
                    contentValues.put("priority", Integer.valueOf(f7.a.a(sVar2.d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // c7.d
    public final boolean m0(v6.s sVar) {
        return ((Boolean) i(new c5.b(1, this, sVar))).booleanValue();
    }
}
