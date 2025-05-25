package androidx.room;

import a2.c;
import a2.d;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import b2.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import w1.g;
import w1.i;

/* loaded from: classes.dex */
public abstract class RoomDatabase {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public volatile a2.b f4622a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f4623b;
    public a2.c c;

    /* renamed from: d  reason: collision with root package name */
    public final g f4624d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4625e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4626f;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public List<b> f4627g;

    /* renamed from: h  reason: collision with root package name */
    public final ReentrantReadWriteLock f4628h = new ReentrantReadWriteLock();

    /* renamed from: i  reason: collision with root package name */
    public final ThreadLocal<Integer> f4629i = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        @SuppressLint({"NewApi"})
        public JournalMode resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && !activityManager.isLowRamDevice()) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* loaded from: classes.dex */
    public static class a<T extends RoomDatabase> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f4631a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4632b;
        public final Context c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<b> f4633d;

        /* renamed from: e  reason: collision with root package name */
        public Executor f4634e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f4635f;

        /* renamed from: g  reason: collision with root package name */
        public c.InterfaceC0000c f4636g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4637h;

        /* renamed from: k  reason: collision with root package name */
        public boolean f4640k;

        /* renamed from: m  reason: collision with root package name */
        public HashSet f4642m;

        /* renamed from: i  reason: collision with root package name */
        public final JournalMode f4638i = JournalMode.AUTOMATIC;

        /* renamed from: j  reason: collision with root package name */
        public boolean f4639j = true;

        /* renamed from: l  reason: collision with root package name */
        public final c f4641l = new c();

        public a(Context context, Class<T> cls, String str) {
            this.c = context;
            this.f4631a = cls;
            this.f4632b = str;
        }

        public final void a(x1.a... aVarArr) {
            if (this.f4642m == null) {
                this.f4642m = new HashSet();
            }
            for (x1.a aVar : aVarArr) {
                this.f4642m.add(Integer.valueOf(aVar.f31535a));
                this.f4642m.add(Integer.valueOf(aVar.f31536b));
            }
            c cVar = this.f4641l;
            cVar.getClass();
            for (x1.a aVar2 : aVarArr) {
                int i10 = aVar2.f31535a;
                HashMap<Integer, TreeMap<Integer, x1.a>> hashMap = cVar.f4643a;
                TreeMap<Integer, x1.a> treeMap = hashMap.get(Integer.valueOf(i10));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    hashMap.put(Integer.valueOf(i10), treeMap);
                }
                int i11 = aVar2.f31536b;
                x1.a aVar3 = treeMap.get(Integer.valueOf(i11));
                if (aVar3 != null) {
                    aVar3.toString();
                    aVar2.toString();
                }
                treeMap.put(Integer.valueOf(i11), aVar2);
            }
        }

        @SuppressLint({"RestrictedApi"})
        public final T b() {
            Executor executor;
            String str;
            Context context = this.c;
            if (context != null) {
                Class<T> cls = this.f4631a;
                if (cls != null) {
                    Executor executor2 = this.f4634e;
                    if (executor2 == null && this.f4635f == null) {
                        r.a aVar = r.b.c;
                        this.f4635f = aVar;
                        this.f4634e = aVar;
                    } else if (executor2 != null && this.f4635f == null) {
                        this.f4635f = executor2;
                    } else if (executor2 == null && (executor = this.f4635f) != null) {
                        this.f4634e = executor;
                    }
                    if (this.f4636g == null) {
                        this.f4636g = new b2.c();
                    }
                    String str2 = this.f4632b;
                    c.InterfaceC0000c interfaceC0000c = this.f4636g;
                    c cVar = this.f4641l;
                    ArrayList<b> arrayList = this.f4633d;
                    boolean z10 = this.f4637h;
                    JournalMode resolve = this.f4638i.resolve(context);
                    Executor executor3 = this.f4634e;
                    androidx.room.a aVar2 = new androidx.room.a(context, str2, interfaceC0000c, cVar, arrayList, z10, resolve, executor3, this.f4635f, this.f4639j, this.f4640k);
                    String name = cls.getPackage().getName();
                    String canonicalName = cls.getCanonicalName();
                    boolean z11 = true;
                    if (!name.isEmpty()) {
                        canonicalName = canonicalName.substring(name.length() + 1);
                    }
                    String str3 = canonicalName.replace('.', '_') + "_Impl";
                    try {
                        if (name.isEmpty()) {
                            str = str3;
                        } else {
                            str = name + "." + str3;
                        }
                        T t4 = (T) Class.forName(str).newInstance();
                        a2.c f10 = t4.f(aVar2);
                        t4.c = f10;
                        if (f10 instanceof i) {
                            ((i) f10).f30930a = aVar2;
                        }
                        if (resolve != JournalMode.WRITE_AHEAD_LOGGING) {
                            z11 = false;
                        }
                        f10.setWriteAheadLoggingEnabled(z11);
                        t4.f4627g = arrayList;
                        t4.f4623b = executor3;
                        new ArrayDeque();
                        t4.f4625e = z10;
                        t4.f4626f = z11;
                        return t4;
                    } catch (ClassNotFoundException unused) {
                        throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
                    } catch (IllegalAccessException unused2) {
                        throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
                    } catch (InstantiationException unused3) {
                        throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
                    }
                }
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<Integer, TreeMap<Integer, x1.a>> f4643a = new HashMap<>();
    }

    public RoomDatabase() {
        new ConcurrentHashMap();
        this.f4624d = e();
    }

    public final void a() {
        boolean z10;
        if (this.f4625e) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public final void b() {
        if (!((b2.a) this.c.L()).f5307a.inTransaction() && this.f4629i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public final void c() {
        a();
        a2.b L = this.c.L();
        this.f4624d.c(L);
        ((b2.a) L).a();
    }

    public final e d(String str) {
        a();
        b();
        return new e(((b2.a) this.c.L()).f5307a.compileStatement(str));
    }

    public abstract g e();

    public abstract a2.c f(androidx.room.a aVar);

    @Deprecated
    public final void g() {
        ((b2.a) this.c.L()).b();
        if (!((b2.a) this.c.L()).f5307a.inTransaction()) {
            g gVar = this.f4624d;
            if (gVar.f30911d.compareAndSet(false, true)) {
                gVar.c.f4623b.execute(gVar.f30916i);
            }
        }
    }

    public final void h(b2.a aVar) {
        g gVar = this.f4624d;
        synchronized (gVar) {
            if (!gVar.f30912e) {
                aVar.c("PRAGMA temp_store = MEMORY;");
                aVar.c("PRAGMA recursive_triggers='ON';");
                aVar.c("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                gVar.c(aVar);
                gVar.f30913f = new e(aVar.f5307a.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                gVar.f30912e = true;
            }
        }
    }

    public final Cursor i(d dVar) {
        a();
        b();
        return ((b2.a) this.c.L()).d(dVar);
    }

    @Deprecated
    public final void j() {
        ((b2.a) this.c.L()).h();
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(b2.a aVar) {
        }
    }
}
