package w1;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.room.RoomDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s.b;

/* compiled from: InvalidationTracker.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f30908j = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b  reason: collision with root package name */
    public final String[] f30910b;
    public final RoomDatabase c;

    /* renamed from: f  reason: collision with root package name */
    public volatile b2.e f30913f;

    /* renamed from: g  reason: collision with root package name */
    public final b f30914g;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f30911d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f30912e = false;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: h  reason: collision with root package name */
    public final s.b<c, d> f30915h = new s.b<>();

    /* renamed from: i  reason: collision with root package name */
    public final a f30916i = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Integer> f30909a = new HashMap<>();

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        public final HashSet a() {
            HashSet hashSet = new HashSet();
            Cursor i10 = g.this.c.i(new a2.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (i10.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(i10.getInt(0)));
                } catch (Throwable th2) {
                    i10.close();
                    throw th2;
                }
            }
            i10.close();
            if (!hashSet.isEmpty()) {
                g.this.f30913f.h();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReentrantReadWriteLock.ReadLock readLock = g.this.c.f4628h.readLock();
            HashSet hashSet = null;
            try {
                readLock.lock();
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th2) {
                readLock.unlock();
                throw th2;
            }
            if (!g.this.a()) {
                readLock.unlock();
            } else if (!g.this.f30911d.compareAndSet(true, false)) {
                readLock.unlock();
            } else if (((b2.a) g.this.c.c.L()).f5307a.inTransaction()) {
                readLock.unlock();
            } else {
                RoomDatabase roomDatabase = g.this.c;
                if (roomDatabase.f4626f) {
                    b2.a aVar = (b2.a) roomDatabase.c.L();
                    aVar.a();
                    try {
                        hashSet = a();
                        aVar.h();
                        aVar.b();
                    } catch (Throwable th3) {
                        aVar.b();
                        throw th3;
                    }
                } else {
                    hashSet = a();
                }
                readLock.unlock();
                if (hashSet != null && !hashSet.isEmpty()) {
                    synchronized (g.this.f30915h) {
                        b.e eVar = (b.e) g.this.f30915h.iterator();
                        if (eVar.hasNext()) {
                            ((d) ((Map.Entry) eVar.next()).getValue()).getClass();
                            throw null;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f30918a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f30919b;
        public final int[] c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f30920d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f30921e;

        public b(int i10) {
            long[] jArr = new long[i10];
            this.f30918a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f30919b = zArr;
            this.c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public final int[] a() {
            boolean z10;
            synchronized (this) {
                if (this.f30920d && !this.f30921e) {
                    int length = this.f30918a.length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 < length) {
                            if (this.f30918a[i10] > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            boolean[] zArr = this.f30919b;
                            if (z10 != zArr[i10]) {
                                int[] iArr = this.c;
                                if (!z10) {
                                    i11 = 2;
                                }
                                iArr[i10] = i11;
                            } else {
                                this.c[i10] = 0;
                            }
                            zArr[i10] = z10;
                            i10++;
                        } else {
                            this.f30921e = true;
                            this.f30920d = false;
                            return this.c;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(Set<String> set);
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class d {
    }

    public g(RoomDatabase roomDatabase, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.c = roomDatabase;
        this.f30914g = new b(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f30910b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f30909a.put(lowerCase, Integer.valueOf(i10));
            String str2 = (String) hashMap.get(strArr[i10]);
            if (str2 != null) {
                this.f30910b[i10] = str2.toLowerCase(locale);
            } else {
                this.f30910b[i10] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            if (this.f30909a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap3 = this.f30909a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        boolean z10;
        a2.b bVar = this.c.f4622a;
        if (bVar != null && ((b2.a) bVar).f5307a.isOpen()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (!this.f30912e) {
            this.c.c.L();
        }
        if (this.f30912e) {
            return true;
        }
        return false;
    }

    public final void b(a2.b bVar, int i10) {
        b2.a aVar = (b2.a) bVar;
        aVar.c(a0.a.g("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i10, ", 0)"));
        String str = this.f30910b[i10];
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = f30908j;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append("`");
            sb2.append("room_table_modification_trigger_");
            a6.h.l(sb2, str, "_", str2, "`");
            a6.h.l(sb2, " AFTER ", str2, " ON `", str);
            a6.h.l(sb2, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            a6.h.l(sb2, " = 1", " WHERE ", "table_id", " = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            aVar.c(sb2.toString());
        }
    }

    public final void c(a2.b bVar) {
        b2.a aVar = (b2.a) bVar;
        if (aVar.f5307a.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.c.f4628h.readLock();
                readLock.lock();
                int[] a10 = this.f30914g.a();
                if (a10 == null) {
                    readLock.unlock();
                    return;
                }
                int length = a10.length;
                aVar.a();
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = a10[i10];
                    if (i11 != 1) {
                        if (i11 == 2) {
                            String str = this.f30910b[i10];
                            StringBuilder sb2 = new StringBuilder();
                            String[] strArr = f30908j;
                            for (int i12 = 0; i12 < 3; i12++) {
                                String str2 = strArr[i12];
                                sb2.setLength(0);
                                sb2.append("DROP TRIGGER IF EXISTS ");
                                sb2.append("`");
                                sb2.append("room_table_modification_trigger_");
                                sb2.append(str);
                                sb2.append("_");
                                sb2.append(str2);
                                sb2.append("`");
                                aVar.c(sb2.toString());
                            }
                        }
                    } else {
                        b(aVar, i10);
                    }
                }
                aVar.h();
                aVar.b();
                b bVar2 = this.f30914g;
                synchronized (bVar2) {
                    bVar2.f30921e = false;
                }
                readLock.unlock();
            } catch (SQLiteException | IllegalStateException unused) {
                return;
            }
        }
    }
}
