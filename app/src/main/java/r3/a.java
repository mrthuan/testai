package r3;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final File f29436a;

    /* renamed from: b  reason: collision with root package name */
    public final File f29437b;
    public final File c;

    /* renamed from: d  reason: collision with root package name */
    public final File f29438d;

    /* renamed from: f  reason: collision with root package name */
    public final long f29440f;

    /* renamed from: i  reason: collision with root package name */
    public BufferedWriter f29443i;

    /* renamed from: k  reason: collision with root package name */
    public int f29445k;

    /* renamed from: h  reason: collision with root package name */
    public long f29442h = 0;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap<String, d> f29444j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l  reason: collision with root package name */
    public long f29446l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final ThreadPoolExecutor f29447m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* renamed from: n  reason: collision with root package name */
    public final CallableC0368a f29448n = new CallableC0368a();

    /* renamed from: e  reason: collision with root package name */
    public final int f29439e = 1;

    /* renamed from: g  reason: collision with root package name */
    public final int f29441g = 1;

    /* compiled from: DiskLruCache.java */
    /* renamed from: r3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0368a implements Callable<Void> {
        public CallableC0368a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.f29443i != null) {
                    aVar.p();
                    if (a.this.i()) {
                        a.this.n();
                        a.this.f29445k = 0;
                    }
                    return null;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f29450a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f29451b;
        public boolean c;

        public c(d dVar) {
            boolean[] zArr;
            this.f29450a = dVar;
            if (dVar.f29456e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.f29441g];
            }
            this.f29451b = zArr;
        }

        public final void a() {
            a.a(a.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (a.this) {
                d dVar = this.f29450a;
                if (dVar.f29457f == this) {
                    if (!dVar.f29456e) {
                        this.f29451b[0] = true;
                    }
                    file = dVar.f29455d[0];
                    if (!a.this.f29436a.exists()) {
                        a.this.f29436a.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f29453a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f29454b;
        public final File[] c;

        /* renamed from: d  reason: collision with root package name */
        public final File[] f29455d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f29456e;

        /* renamed from: f  reason: collision with root package name */
        public c f29457f;

        public d(String str) {
            this.f29453a = str;
            int i10 = a.this.f29441g;
            this.f29454b = new long[i10];
            this.c = new File[i10];
            this.f29455d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < a.this.f29441g; i11++) {
                sb2.append(i11);
                File[] fileArr = this.c;
                String sb3 = sb2.toString();
                File file = a.this.f29436a;
                fileArr[i11] = new File(file, sb3);
                sb2.append(".tmp");
                this.f29455d[i11] = new File(file, sb2.toString());
                sb2.setLength(length);
            }
        }

        public final String a() {
            long[] jArr;
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f29454b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f29459a;

        public e(File[] fileArr) {
            this.f29459a = fileArr;
        }
    }

    public a(File file, long j10) {
        this.f29436a = file;
        this.f29437b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.f29438d = new File(file, "journal.bkp");
        this.f29440f = j10;
    }

    public static void a(a aVar, c cVar, boolean z10) {
        synchronized (aVar) {
            d dVar = cVar.f29450a;
            if (dVar.f29457f == cVar) {
                if (z10 && !dVar.f29456e) {
                    for (int i10 = 0; i10 < aVar.f29441g; i10++) {
                        if (cVar.f29451b[i10]) {
                            if (!dVar.f29455d[i10].exists()) {
                                cVar.a();
                                return;
                            }
                        } else {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                        }
                    }
                }
                for (int i11 = 0; i11 < aVar.f29441g; i11++) {
                    File file = dVar.f29455d[i11];
                    if (z10) {
                        if (file.exists()) {
                            File file2 = dVar.c[i11];
                            file.renameTo(file2);
                            long j10 = dVar.f29454b[i11];
                            long length = file2.length();
                            dVar.f29454b[i11] = length;
                            aVar.f29442h = (aVar.f29442h - j10) + length;
                        }
                    } else {
                        c(file);
                    }
                }
                aVar.f29445k++;
                dVar.f29457f = null;
                if (dVar.f29456e | z10) {
                    dVar.f29456e = true;
                    aVar.f29443i.append((CharSequence) "CLEAN");
                    aVar.f29443i.append(' ');
                    aVar.f29443i.append((CharSequence) dVar.f29453a);
                    aVar.f29443i.append((CharSequence) dVar.a());
                    aVar.f29443i.append('\n');
                    if (z10) {
                        aVar.f29446l++;
                        dVar.getClass();
                    }
                } else {
                    aVar.f29444j.remove(dVar.f29453a);
                    aVar.f29443i.append((CharSequence) "REMOVE");
                    aVar.f29443i.append(' ');
                    aVar.f29443i.append((CharSequence) dVar.f29453a);
                    aVar.f29443i.append('\n');
                }
                f(aVar.f29443i);
                if (aVar.f29442h > aVar.f29440f || aVar.i()) {
                    aVar.f29447m.submit(aVar.f29448n);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    @TargetApi(26)
    public static void b(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void f(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a j(File file, long j10) {
        if (j10 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    o(file2, file3, false);
                }
            }
            a aVar = new a(file, j10);
            if (aVar.f29437b.exists()) {
                try {
                    aVar.l();
                    aVar.k();
                    return aVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    aVar.close();
                    r3.c.a(aVar.f29436a);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j10);
            aVar2.n();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void o(File file, File file2, boolean z10) {
        if (z10) {
            c(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f29443i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f29444j.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f29457f;
            if (cVar != null) {
                cVar.a();
            }
        }
        p();
        b(this.f29443i);
        this.f29443i = null;
    }

    public final c d(String str) {
        synchronized (this) {
            if (this.f29443i != null) {
                d dVar = this.f29444j.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.f29444j.put(str, dVar);
                } else if (dVar.f29457f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f29457f = cVar;
                this.f29443i.append((CharSequence) "DIRTY");
                this.f29443i.append(' ');
                this.f29443i.append((CharSequence) str);
                this.f29443i.append('\n');
                f(this.f29443i);
                return cVar;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized e h(String str) {
        if (this.f29443i != null) {
            d dVar = this.f29444j.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f29456e) {
                return null;
            }
            for (File file : dVar.c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f29445k++;
            this.f29443i.append((CharSequence) "READ");
            this.f29443i.append(' ');
            this.f29443i.append((CharSequence) str);
            this.f29443i.append('\n');
            if (i()) {
                this.f29447m.submit(this.f29448n);
            }
            return new e(dVar.c);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean i() {
        int i10 = this.f29445k;
        if (i10 >= 2000 && i10 >= this.f29444j.size()) {
            return true;
        }
        return false;
    }

    public final void k() {
        c(this.c);
        Iterator<d> it = this.f29444j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f29457f;
            int i10 = this.f29441g;
            int i11 = 0;
            if (cVar == null) {
                while (i11 < i10) {
                    this.f29442h += next.f29454b[i11];
                    i11++;
                }
            } else {
                next.f29457f = null;
                while (i11 < i10) {
                    c(next.c[i11]);
                    c(next.f29455d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void l() {
        File file = this.f29437b;
        r3.b bVar = new r3.b(new FileInputStream(file), r3.c.f29465a);
        try {
            String a10 = bVar.a();
            String a11 = bVar.a();
            String a12 = bVar.a();
            String a13 = bVar.a();
            String a14 = bVar.a();
            if ("libcore.io.DiskLruCache".equals(a10) && "1".equals(a11) && Integer.toString(this.f29439e).equals(a12) && Integer.toString(this.f29441g).equals(a13) && "".equals(a14)) {
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    try {
                        m(bVar.a());
                        i10++;
                    } catch (EOFException unused) {
                        this.f29445k = i10 - this.f29444j.size();
                        if (bVar.f29463e == -1) {
                            z10 = true;
                        }
                        if (z10) {
                            n();
                        } else {
                            this.f29443i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), r3.c.f29465a));
                        }
                        try {
                            bVar.close();
                            return;
                        } catch (RuntimeException e10) {
                            throw e10;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + a10 + ", " + a11 + ", " + a13 + ", " + a14 + "]");
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final void m(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            LinkedHashMap<String, d> linkedHashMap = this.f29444j;
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            d dVar = linkedHashMap.get(substring);
            if (dVar == null) {
                dVar = new d(substring);
                linkedHashMap.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f29456e = true;
                dVar.f29457f = null;
                if (split.length == a.this.f29441g) {
                    for (int i11 = 0; i11 < split.length; i11++) {
                        try {
                            dVar.f29454b[i11] = Long.parseLong(split[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f29457f = new c(dVar);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void n() {
        BufferedWriter bufferedWriter = this.f29443i;
        if (bufferedWriter != null) {
            b(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), r3.c.f29465a));
        bufferedWriter2.write("libcore.io.DiskLruCache");
        bufferedWriter2.write("\n");
        bufferedWriter2.write("1");
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f29439e));
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f29441g));
        bufferedWriter2.write("\n");
        bufferedWriter2.write("\n");
        for (d dVar : this.f29444j.values()) {
            if (dVar.f29457f != null) {
                bufferedWriter2.write("DIRTY " + dVar.f29453a + '\n');
            } else {
                bufferedWriter2.write("CLEAN " + dVar.f29453a + dVar.a() + '\n');
            }
        }
        b(bufferedWriter2);
        if (this.f29437b.exists()) {
            o(this.f29437b, this.f29438d, true);
        }
        o(this.c, this.f29437b, false);
        this.f29438d.delete();
        this.f29443i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f29437b, true), r3.c.f29465a));
    }

    public final void p() {
        while (this.f29442h > this.f29440f) {
            String key = this.f29444j.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f29443i != null) {
                    d dVar = this.f29444j.get(key);
                    if (dVar != null && dVar.f29457f == null) {
                        for (int i10 = 0; i10 < this.f29441g; i10++) {
                            File file = dVar.c[i10];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j10 = this.f29442h;
                            long[] jArr = dVar.f29454b;
                            this.f29442h = j10 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.f29445k++;
                        this.f29443i.append((CharSequence) "REMOVE");
                        this.f29443i.append(' ');
                        this.f29443i.append((CharSequence) key);
                        this.f29443i.append('\n');
                        this.f29444j.remove(key);
                        if (i()) {
                            this.f29447m.submit(this.f29448n);
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }
}
