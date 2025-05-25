package okhttp3.internal.cache;

import cg.l;
import gk.h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kk.n;
import kk.q;
import kk.r;
import kk.t;
import kk.w;
import kk.y;
import kotlin.text.Regex;
import kotlin.text.j;
import kotlin.text.k;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
public final class DiskLruCache implements Closeable, Flushable {

    /* renamed from: v  reason: collision with root package name */
    public static final Regex f23214v = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: w  reason: collision with root package name */
    public static final String f23215w = "CLEAN";

    /* renamed from: x  reason: collision with root package name */
    public static final String f23216x = "DIRTY";

    /* renamed from: y  reason: collision with root package name */
    public static final String f23217y = "REMOVE";

    /* renamed from: z  reason: collision with root package name */
    public static final String f23218z = "READ";

    /* renamed from: a  reason: collision with root package name */
    public final fk.b f23219a;

    /* renamed from: b  reason: collision with root package name */
    public final File f23220b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23221d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23222e;

    /* renamed from: f  reason: collision with root package name */
    public final File f23223f;

    /* renamed from: g  reason: collision with root package name */
    public final File f23224g;

    /* renamed from: h  reason: collision with root package name */
    public final File f23225h;

    /* renamed from: i  reason: collision with root package name */
    public long f23226i;

    /* renamed from: j  reason: collision with root package name */
    public kk.g f23227j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap<String, a> f23228k;

    /* renamed from: l  reason: collision with root package name */
    public int f23229l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f23230m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f23231n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f23232o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f23233p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f23234q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f23235r;

    /* renamed from: s  reason: collision with root package name */
    public long f23236s;

    /* renamed from: t  reason: collision with root package name */
    public final bk.c f23237t;

    /* renamed from: u  reason: collision with root package name */
    public final f f23238u;

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes3.dex */
    public final class Editor {

        /* renamed from: a  reason: collision with root package name */
        public final a f23239a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f23240b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f23241d;

        public Editor(DiskLruCache this$0, a aVar) {
            boolean[] zArr;
            kotlin.jvm.internal.g.e(this$0, "this$0");
            this.f23241d = this$0;
            this.f23239a = aVar;
            if (aVar.f23245e) {
                zArr = null;
            } else {
                zArr = new boolean[this$0.f23221d];
            }
            this.f23240b = zArr;
        }

        public final void a() {
            DiskLruCache diskLruCache = this.f23241d;
            synchronized (diskLruCache) {
                if (!this.c) {
                    if (kotlin.jvm.internal.g.a(this.f23239a.f23247g, this)) {
                        diskLruCache.b(this, false);
                    }
                    this.c = true;
                    tf.d dVar = tf.d.f30009a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void b() {
            DiskLruCache diskLruCache = this.f23241d;
            synchronized (diskLruCache) {
                if (!this.c) {
                    if (kotlin.jvm.internal.g.a(this.f23239a.f23247g, this)) {
                        diskLruCache.b(this, true);
                    }
                    this.c = true;
                    tf.d dVar = tf.d.f30009a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void c() {
            a aVar = this.f23239a;
            if (kotlin.jvm.internal.g.a(aVar.f23247g, this)) {
                DiskLruCache diskLruCache = this.f23241d;
                if (diskLruCache.f23231n) {
                    diskLruCache.b(this, false);
                } else {
                    aVar.f23246f = true;
                }
            }
        }

        public final w d(int i10) {
            final DiskLruCache diskLruCache = this.f23241d;
            synchronized (diskLruCache) {
                if (!this.c) {
                    if (!kotlin.jvm.internal.g.a(this.f23239a.f23247g, this)) {
                        return new kk.d();
                    }
                    if (!this.f23239a.f23245e) {
                        boolean[] zArr = this.f23240b;
                        kotlin.jvm.internal.g.b(zArr);
                        zArr[i10] = true;
                    }
                    try {
                        return new g(diskLruCache.f23219a.b((File) this.f23239a.f23244d.get(i10)), new l<IOException, tf.d>() { // from class: okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cg.l
                            public /* bridge */ /* synthetic */ tf.d invoke(IOException iOException) {
                                invoke2(iOException);
                                return tf.d.f30009a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(IOException it) {
                                kotlin.jvm.internal.g.e(it, "it");
                                DiskLruCache diskLruCache2 = DiskLruCache.this;
                                DiskLruCache.Editor editor = this;
                                synchronized (diskLruCache2) {
                                    editor.c();
                                    tf.d dVar = tf.d.f30009a;
                                }
                            }
                        });
                    } catch (FileNotFoundException unused) {
                        return new kk.d();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes3.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f23242a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f23243b;
        public final ArrayList c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f23244d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f23245e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f23246f;

        /* renamed from: g  reason: collision with root package name */
        public Editor f23247g;

        /* renamed from: h  reason: collision with root package name */
        public int f23248h;

        /* renamed from: i  reason: collision with root package name */
        public long f23249i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f23250j;

        public a(DiskLruCache this$0, String key) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            kotlin.jvm.internal.g.e(key, "key");
            this.f23250j = this$0;
            this.f23242a = key;
            int i10 = this$0.f23221d;
            this.f23243b = new long[i10];
            this.c = new ArrayList();
            this.f23244d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(i11);
                this.c.add(new File(this.f23250j.f23220b, sb2.toString()));
                sb2.append(".tmp");
                this.f23244d.add(new File(this.f23250j.f23220b, sb2.toString()));
                sb2.setLength(length);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v5, types: [okhttp3.internal.cache.e] */
        public final b a() {
            byte[] bArr = ak.b.f665a;
            if (!this.f23245e) {
                return null;
            }
            DiskLruCache diskLruCache = this.f23250j;
            if (!diskLruCache.f23231n && (this.f23247g != null || this.f23246f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f23243b.clone();
            try {
                int i10 = diskLruCache.f23221d;
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    n a10 = diskLruCache.f23219a.a((File) this.c.get(i11));
                    if (!diskLruCache.f23231n) {
                        this.f23248h++;
                        a10 = new e(a10, diskLruCache, this);
                    }
                    arrayList.add(a10);
                    i11 = i12;
                }
                return new b(this.f23250j, this.f23242a, this.f23249i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ak.b.c((y) it.next());
                }
                try {
                    diskLruCache.m(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes3.dex */
    public final class b implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public final String f23251a;

        /* renamed from: b  reason: collision with root package name */
        public final long f23252b;
        public final List<y> c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f23253d;

        public b(DiskLruCache this$0, String key, long j10, ArrayList arrayList, long[] lengths) {
            kotlin.jvm.internal.g.e(this$0, "this$0");
            kotlin.jvm.internal.g.e(key, "key");
            kotlin.jvm.internal.g.e(lengths, "lengths");
            this.f23253d = this$0;
            this.f23251a = key;
            this.f23252b = j10;
            this.c = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (y yVar : this.c) {
                ak.b.c(yVar);
            }
        }
    }

    public DiskLruCache(File directory, long j10, bk.d taskRunner) {
        fk.a aVar = fk.b.f17306a;
        kotlin.jvm.internal.g.e(directory, "directory");
        kotlin.jvm.internal.g.e(taskRunner, "taskRunner");
        this.f23219a = aVar;
        this.f23220b = directory;
        this.c = 201105;
        this.f23221d = 2;
        this.f23222e = j10;
        this.f23228k = new LinkedHashMap<>(0, 0.75f, true);
        this.f23237t = taskRunner.f();
        this.f23238u = new f(this, kotlin.jvm.internal.g.h(" Cache", ak.b.f670g));
        if (j10 > 0) {
            this.f23223f = new File(directory, "journal");
            this.f23224g = new File(directory, "journal.tmp");
            this.f23225h = new File(directory, "journal.bkp");
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public static void o(String str) {
        if (f23214v.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final synchronized void a() {
        if (!(!this.f23233p)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public final synchronized void b(Editor editor, boolean z10) {
        kotlin.jvm.internal.g.e(editor, "editor");
        a aVar = editor.f23239a;
        if (kotlin.jvm.internal.g.a(aVar.f23247g, editor)) {
            int i10 = 0;
            if (z10 && !aVar.f23245e) {
                int i11 = this.f23221d;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    boolean[] zArr = editor.f23240b;
                    kotlin.jvm.internal.g.b(zArr);
                    if (zArr[i12]) {
                        if (!this.f23219a.d((File) aVar.f23244d.get(i12))) {
                            editor.a();
                            return;
                        }
                        i12 = i13;
                    } else {
                        editor.a();
                        throw new IllegalStateException(kotlin.jvm.internal.g.h(Integer.valueOf(i12), "Newly created entry didn't create value for index "));
                    }
                }
            }
            int i14 = this.f23221d;
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                File file = (File) aVar.f23244d.get(i15);
                if (z10 && !aVar.f23246f) {
                    if (this.f23219a.d(file)) {
                        File file2 = (File) aVar.c.get(i15);
                        this.f23219a.e(file, file2);
                        long j10 = aVar.f23243b[i15];
                        long h10 = this.f23219a.h(file2);
                        aVar.f23243b[i15] = h10;
                        this.f23226i = (this.f23226i - j10) + h10;
                    }
                } else {
                    this.f23219a.f(file);
                }
                i15 = i16;
            }
            aVar.f23247g = null;
            if (aVar.f23246f) {
                m(aVar);
                return;
            }
            this.f23229l++;
            kk.g gVar = this.f23227j;
            kotlin.jvm.internal.g.b(gVar);
            if (!aVar.f23245e && !z10) {
                this.f23228k.remove(aVar.f23242a);
                gVar.K(f23217y).writeByte(32);
                gVar.K(aVar.f23242a);
                gVar.writeByte(10);
                gVar.flush();
                if (this.f23226i <= this.f23222e || h()) {
                    this.f23237t.c(this.f23238u, 0L);
                }
                return;
            }
            aVar.f23245e = true;
            gVar.K(f23215w).writeByte(32);
            gVar.K(aVar.f23242a);
            long[] jArr = aVar.f23243b;
            int length = jArr.length;
            while (i10 < length) {
                long j11 = jArr[i10];
                i10++;
                gVar.writeByte(32).h0(j11);
            }
            gVar.writeByte(10);
            if (z10) {
                long j12 = this.f23236s;
                this.f23236s = 1 + j12;
                aVar.f23249i = j12;
            }
            gVar.flush();
            if (this.f23226i <= this.f23222e) {
            }
            this.f23237t.c(this.f23238u, 0L);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final synchronized Editor c(long j10, String key) {
        Editor editor;
        kotlin.jvm.internal.g.e(key, "key");
        f();
        a();
        o(key);
        a aVar = this.f23228k.get(key);
        if (j10 != -1 && (aVar == null || aVar.f23249i != j10)) {
            return null;
        }
        if (aVar == null) {
            editor = null;
        } else {
            editor = aVar.f23247g;
        }
        if (editor != null) {
            return null;
        }
        if (aVar != null && aVar.f23248h != 0) {
            return null;
        }
        if (!this.f23234q && !this.f23235r) {
            kk.g gVar = this.f23227j;
            kotlin.jvm.internal.g.b(gVar);
            gVar.K(f23216x).writeByte(32).K(key).writeByte(10);
            gVar.flush();
            if (this.f23230m) {
                return null;
            }
            if (aVar == null) {
                aVar = new a(this, key);
                this.f23228k.put(key, aVar);
            }
            Editor editor2 = new Editor(this, aVar);
            aVar.f23247g = editor2;
            return editor2;
        }
        this.f23237t.c(this.f23238u, 0L);
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f23232o && !this.f23233p) {
            Collection<a> values = this.f23228k.values();
            kotlin.jvm.internal.g.d(values, "lruEntries.values");
            int i10 = 0;
            Object[] array = values.toArray(new a[0]);
            if (array != null) {
                a[] aVarArr = (a[]) array;
                int length = aVarArr.length;
                while (i10 < length) {
                    a aVar = aVarArr[i10];
                    i10++;
                    Editor editor = aVar.f23247g;
                    if (editor != null && editor != null) {
                        editor.c();
                    }
                }
                n();
                kk.g gVar = this.f23227j;
                kotlin.jvm.internal.g.b(gVar);
                gVar.close();
                this.f23227j = null;
                this.f23233p = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        this.f23233p = true;
    }

    public final synchronized b d(String key) {
        kotlin.jvm.internal.g.e(key, "key");
        f();
        a();
        o(key);
        a aVar = this.f23228k.get(key);
        if (aVar == null) {
            return null;
        }
        b a10 = aVar.a();
        if (a10 == null) {
            return null;
        }
        this.f23229l++;
        kk.g gVar = this.f23227j;
        kotlin.jvm.internal.g.b(gVar);
        gVar.K(f23218z).writeByte(32).K(key).writeByte(10);
        if (h()) {
            this.f23237t.c(this.f23238u, 0L);
        }
        return a10;
    }

    public final synchronized void f() {
        boolean z10;
        byte[] bArr = ak.b.f665a;
        if (this.f23232o) {
            return;
        }
        if (this.f23219a.d(this.f23225h)) {
            if (this.f23219a.d(this.f23223f)) {
                this.f23219a.f(this.f23225h);
            } else {
                this.f23219a.e(this.f23225h, this.f23223f);
            }
        }
        fk.b bVar = this.f23219a;
        File file = this.f23225h;
        kotlin.jvm.internal.g.e(bVar, "<this>");
        kotlin.jvm.internal.g.e(file, "file");
        q b10 = bVar.b(file);
        try {
            bVar.f(file);
            o9.d.l(b10, null);
            z10 = true;
        } catch (IOException unused) {
            tf.d dVar = tf.d.f30009a;
            o9.d.l(b10, null);
            bVar.f(file);
            z10 = false;
        }
        this.f23231n = z10;
        if (this.f23219a.d(this.f23223f)) {
            try {
                j();
                i();
                this.f23232o = true;
                return;
            } catch (IOException e10) {
                h hVar = h.f17912a;
                h.f17912a.getClass();
                h.i(5, "DiskLruCache " + this.f23220b + " is corrupt: " + ((Object) e10.getMessage()) + ", removing", e10);
                close();
                this.f23219a.c(this.f23220b);
                this.f23233p = false;
            }
        }
        l();
        this.f23232o = true;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.f23232o) {
            return;
        }
        a();
        n();
        kk.g gVar = this.f23227j;
        kotlin.jvm.internal.g.b(gVar);
        gVar.flush();
    }

    public final boolean h() {
        int i10 = this.f23229l;
        if (i10 >= 2000 && i10 >= this.f23228k.size()) {
            return true;
        }
        return false;
    }

    public final void i() {
        File file = this.f23224g;
        fk.b bVar = this.f23219a;
        bVar.f(file);
        Iterator<a> it = this.f23228k.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            kotlin.jvm.internal.g.d(next, "i.next()");
            a aVar = next;
            Editor editor = aVar.f23247g;
            int i10 = this.f23221d;
            int i11 = 0;
            if (editor == null) {
                while (i11 < i10) {
                    this.f23226i += aVar.f23243b[i11];
                    i11++;
                }
            } else {
                aVar.f23247g = null;
                while (i11 < i10) {
                    bVar.f((File) aVar.c.get(i11));
                    bVar.f((File) aVar.f23244d.get(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void j() {
        boolean z10;
        File file = this.f23223f;
        fk.b bVar = this.f23219a;
        t m10 = ge.a.m(bVar.a(file));
        try {
            String V = m10.V();
            String V2 = m10.V();
            String V3 = m10.V();
            String V4 = m10.V();
            String V5 = m10.V();
            if (kotlin.jvm.internal.g.a("libcore.io.DiskLruCache", V) && kotlin.jvm.internal.g.a("1", V2) && kotlin.jvm.internal.g.a(String.valueOf(this.c), V3) && kotlin.jvm.internal.g.a(String.valueOf(this.f23221d), V4)) {
                int i10 = 0;
                if (V5.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    while (true) {
                        try {
                            k(m10.V());
                            i10++;
                        } catch (EOFException unused) {
                            this.f23229l = i10 - this.f23228k.size();
                            if (!m10.E()) {
                                l();
                            } else {
                                this.f23227j = ge.a.l(new g(bVar.g(file), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
                            }
                            tf.d dVar = tf.d.f30009a;
                            o9.d.l(m10, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + V + ", " + V2 + ", " + V4 + ", " + V5 + ']');
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o9.d.l(m10, th2);
                throw th3;
            }
        }
    }

    public final void k(String str) {
        String substring;
        int i10 = 0;
        int U = k.U(str, ' ', 0, false, 6);
        if (U != -1) {
            int i11 = U + 1;
            int U2 = k.U(str, ' ', i11, false, 4);
            LinkedHashMap<String, a> linkedHashMap = this.f23228k;
            if (U2 == -1) {
                substring = str.substring(i11);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String).substring(startIndex)");
                String str2 = f23217y;
                if (U == str2.length() && j.M(str, str2, false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i11, U2);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            a aVar = linkedHashMap.get(substring);
            if (aVar == null) {
                aVar = new a(this, substring);
                linkedHashMap.put(substring, aVar);
            }
            if (U2 != -1) {
                String str3 = f23215w;
                if (U == str3.length() && j.M(str, str3, false)) {
                    String substring2 = str.substring(U2 + 1);
                    kotlin.jvm.internal.g.d(substring2, "this as java.lang.String).substring(startIndex)");
                    List g02 = k.g0(substring2, new char[]{' '});
                    aVar.f23245e = true;
                    aVar.f23247g = null;
                    if (g02.size() == aVar.f23250j.f23221d) {
                        try {
                            int size = g02.size();
                            while (i10 < size) {
                                int i12 = i10 + 1;
                                aVar.f23243b[i10] = Long.parseLong((String) g02.get(i10));
                                i10 = i12;
                            }
                            return;
                        } catch (NumberFormatException unused) {
                            throw new IOException(kotlin.jvm.internal.g.h(g02, "unexpected journal line: "));
                        }
                    }
                    throw new IOException(kotlin.jvm.internal.g.h(g02, "unexpected journal line: "));
                }
            }
            if (U2 == -1) {
                String str4 = f23216x;
                if (U == str4.length() && j.M(str, str4, false)) {
                    aVar.f23247g = new Editor(this, aVar);
                    return;
                }
            }
            if (U2 == -1) {
                String str5 = f23218z;
                if (U == str5.length() && j.M(str, str5, false)) {
                    return;
                }
            }
            throw new IOException(kotlin.jvm.internal.g.h(str, "unexpected journal line: "));
        }
        throw new IOException(kotlin.jvm.internal.g.h(str, "unexpected journal line: "));
    }

    public final synchronized void l() {
        kk.g gVar = this.f23227j;
        if (gVar != null) {
            gVar.close();
        }
        r l10 = ge.a.l(this.f23219a.b(this.f23224g));
        l10.K("libcore.io.DiskLruCache");
        l10.writeByte(10);
        l10.K("1");
        l10.writeByte(10);
        l10.h0(this.c);
        l10.writeByte(10);
        l10.h0(this.f23221d);
        l10.writeByte(10);
        l10.writeByte(10);
        Iterator<a> it = this.f23228k.values().iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            if (next.f23247g != null) {
                l10.K(f23216x);
                l10.writeByte(32);
                l10.K(next.f23242a);
                l10.writeByte(10);
            } else {
                l10.K(f23215w);
                l10.writeByte(32);
                l10.K(next.f23242a);
                long[] jArr = next.f23243b;
                int length = jArr.length;
                while (i10 < length) {
                    long j10 = jArr[i10];
                    i10++;
                    l10.writeByte(32);
                    l10.h0(j10);
                }
                l10.writeByte(10);
            }
        }
        tf.d dVar = tf.d.f30009a;
        o9.d.l(l10, null);
        if (this.f23219a.d(this.f23223f)) {
            this.f23219a.e(this.f23223f, this.f23225h);
        }
        this.f23219a.e(this.f23224g, this.f23223f);
        this.f23219a.f(this.f23225h);
        this.f23227j = ge.a.l(new g(this.f23219a.g(this.f23223f), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
        this.f23230m = false;
        this.f23235r = false;
    }

    public final void m(a entry) {
        kk.g gVar;
        kotlin.jvm.internal.g.e(entry, "entry");
        boolean z10 = this.f23231n;
        String str = entry.f23242a;
        if (!z10) {
            if (entry.f23248h > 0 && (gVar = this.f23227j) != null) {
                gVar.K(f23216x);
                gVar.writeByte(32);
                gVar.K(str);
                gVar.writeByte(10);
                gVar.flush();
            }
            if (entry.f23248h > 0 || entry.f23247g != null) {
                entry.f23246f = true;
                return;
            }
        }
        Editor editor = entry.f23247g;
        if (editor != null) {
            editor.c();
        }
        for (int i10 = 0; i10 < this.f23221d; i10++) {
            this.f23219a.f((File) entry.c.get(i10));
            long j10 = this.f23226i;
            long[] jArr = entry.f23243b;
            this.f23226i = j10 - jArr[i10];
            jArr[i10] = 0;
        }
        this.f23229l++;
        kk.g gVar2 = this.f23227j;
        if (gVar2 != null) {
            gVar2.K(f23217y);
            gVar2.writeByte(32);
            gVar2.K(str);
            gVar2.writeByte(10);
        }
        this.f23228k.remove(str);
        if (h()) {
            this.f23237t.c(this.f23238u, 0L);
        }
    }

    public final void n() {
        boolean z10;
        do {
            z10 = false;
            if (this.f23226i > this.f23222e) {
                Iterator<a> it = this.f23228k.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        a next = it.next();
                        if (!next.f23246f) {
                            m(next);
                            z10 = true;
                            continue;
                            break;
                        }
                    }
                }
            } else {
                this.f23234q = false;
                return;
            }
        } while (z10);
    }
}
