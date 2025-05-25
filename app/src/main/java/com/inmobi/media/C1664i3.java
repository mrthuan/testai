package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Pair;

/* renamed from: com.inmobi.media.i3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1664i3 implements Closeable {

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f15166p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: q  reason: collision with root package name */
    public static final C1594d3 f15167q = new C1594d3();

    /* renamed from: a  reason: collision with root package name */
    public final File f15168a;

    /* renamed from: b  reason: collision with root package name */
    public final File f15169b;
    public final File c;

    /* renamed from: d  reason: collision with root package name */
    public final File f15170d;

    /* renamed from: f  reason: collision with root package name */
    public final long f15172f;

    /* renamed from: g  reason: collision with root package name */
    public final zc f15173g;

    /* renamed from: j  reason: collision with root package name */
    public BufferedWriter f15176j;

    /* renamed from: l  reason: collision with root package name */
    public int f15178l;

    /* renamed from: i  reason: collision with root package name */
    public long f15175i = 0;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f15177k = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: m  reason: collision with root package name */
    public long f15179m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final ThreadPoolExecutor f15180n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: o  reason: collision with root package name */
    public final CallableC1580c3 f15181o = new CallableC1580c3(this);

    /* renamed from: e  reason: collision with root package name */
    public final int f15171e = 1;

    /* renamed from: h  reason: collision with root package name */
    public final int f15174h = 2;

    public C1664i3(File file, long j10, zc zcVar) {
        this.f15168a = file;
        this.f15169b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.f15170d = new File(file, "journal.bkp");
        this.f15172f = j10;
        this.f15173g = zcVar;
    }

    public static void a(C1664i3 c1664i3, C1622f3 c1622f3, boolean z10) {
        long[] jArr;
        synchronized (c1664i3) {
            C1636g3 c1636g3 = c1622f3.f15045a;
            if (c1636g3.f15090d == c1622f3) {
                if (z10 && !c1636g3.c) {
                    for (int i10 = 0; i10 < c1664i3.f15174h; i10++) {
                        if (c1622f3.f15046b[i10]) {
                            if (!c1636g3.b(i10).exists()) {
                                a(c1622f3.f15047d, c1622f3, false);
                                return;
                            }
                        } else {
                            a(c1622f3.f15047d, c1622f3, false);
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                        }
                    }
                }
                for (int i11 = 0; i11 < c1664i3.f15174h; i11++) {
                    File b10 = c1636g3.b(i11);
                    if (z10) {
                        if (b10.exists()) {
                            File a10 = c1636g3.a(i11);
                            b10.renameTo(a10);
                            long j10 = c1636g3.f15089b[i11];
                            long length = a10.length();
                            c1636g3.f15089b[i11] = length;
                            c1664i3.f15175i = (c1664i3.f15175i - j10) + length;
                        }
                    } else if (b10.exists() && !b10.delete()) {
                        throw new IOException();
                    }
                }
                c1664i3.f15178l++;
                c1636g3.f15090d = null;
                if (c1636g3.c | z10) {
                    c1636g3.c = true;
                    BufferedWriter bufferedWriter = c1664i3.f15176j;
                    StringBuilder sb2 = new StringBuilder("CLEAN ");
                    sb2.append(c1636g3.f15088a);
                    StringBuilder sb3 = new StringBuilder();
                    for (long j11 : c1636g3.f15089b) {
                        sb3.append(' ');
                        sb3.append(j11);
                    }
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    bufferedWriter.write(sb2.toString());
                    if (z10) {
                        c1664i3.f15179m++;
                    }
                } else {
                    c1664i3.f15177k.remove(c1636g3.f15088a);
                    c1664i3.f15176j.write("REMOVE " + c1636g3.f15088a + '\n');
                }
                c1664i3.f15176j.flush();
                if (c1664i3.f15175i > c1664i3.f15172f || c1664i3.a()) {
                    c1664i3.f15180n.submit(c1664i3.f15181o);
                }
                return;
            }
            throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
        }
    }

    public final void b() {
        File file = this.c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f15177k.values().iterator();
        while (it.hasNext()) {
            C1636g3 c1636g3 = (C1636g3) it.next();
            int i10 = 0;
            if (c1636g3.f15090d == null) {
                while (i10 < this.f15174h) {
                    this.f15175i += c1636g3.f15089b[i10];
                    i10++;
                }
            } else {
                c1636g3.f15090d = null;
                while (i10 < this.f15174h) {
                    File a10 = c1636g3.a(i10);
                    if (a10.exists() && !a10.delete()) {
                        throw new IOException();
                    }
                    File b10 = c1636g3.b(i10);
                    if (b10.exists() && !b10.delete()) {
                        throw new IOException();
                    }
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void c() {
        Ua ua2 = new Ua(new FileInputStream(this.f15169b), Ub.f14741a);
        try {
            String a10 = ua2.a();
            String a11 = ua2.a();
            String a12 = ua2.a();
            String a13 = ua2.a();
            String a14 = ua2.a();
            if (!"libcore.io.DiskLruCache".equals(a10) || !"1".equals(a11) || !Integer.toString(this.f15171e).equals(a12) || !Integer.toString(this.f15174h).equals(a13) || !"".equals(a14)) {
                throw new IOException("unexpected journal header: [" + a10 + ", " + a11 + ", " + a13 + ", " + a14 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    c(ua2.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f15178l = i10 - this.f15177k.size();
                    Ub.a(ua2);
                    return;
                }
            }
        } catch (Throwable th2) {
            Ub.a(ua2);
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f15176j == null) {
            return;
        }
        Iterator it = new ArrayList(this.f15177k.values()).iterator();
        while (it.hasNext()) {
            C1622f3 c1622f3 = ((C1636g3) it.next()).f15090d;
            if (c1622f3 != null) {
                a(c1622f3.f15047d, c1622f3, false);
            }
        }
        while (this.f15175i > this.f15172f) {
            d((String) ((Map.Entry) this.f15177k.entrySet().iterator().next()).getKey());
        }
        this.f15176j.close();
        this.f15176j = null;
    }

    public final synchronized void d() {
        long[] jArr;
        BufferedWriter bufferedWriter = this.f15176j;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), Ub.f14741a));
        bufferedWriter2.write("libcore.io.DiskLruCache");
        bufferedWriter2.write("\n");
        bufferedWriter2.write("1");
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f15171e));
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f15174h));
        bufferedWriter2.write("\n");
        bufferedWriter2.write("\n");
        for (C1636g3 c1636g3 : this.f15177k.values()) {
            if (c1636g3.f15090d != null) {
                bufferedWriter2.write("DIRTY " + c1636g3.f15088a + '\n');
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CLEAN ");
                sb2.append(c1636g3.f15088a);
                StringBuilder sb3 = new StringBuilder();
                for (long j10 : c1636g3.f15089b) {
                    sb3.append(' ');
                    sb3.append(j10);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter2.write(sb2.toString());
            }
        }
        bufferedWriter2.close();
        if (this.f15169b.exists()) {
            File file = this.f15169b;
            File file2 = this.f15170d;
            if (file2.exists() && !file2.delete()) {
                throw new IOException();
            }
            if (!file.renameTo(file2)) {
                throw new IOException();
            }
        }
        if (this.c.renameTo(this.f15169b)) {
            this.f15170d.delete();
            this.f15176j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f15169b, true), Ub.f14741a));
        } else {
            throw new IOException();
        }
    }

    public final void c(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f15177k.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            C1636g3 c1636g3 = (C1636g3) this.f15177k.get(substring);
            if (c1636g3 == null) {
                c1636g3 = new C1636g3(this, substring);
                this.f15177k.put(substring, c1636g3);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c1636g3.c = true;
                c1636g3.f15090d = null;
                if (split.length == c1636g3.f15091e.f15174h) {
                    for (int i11 = 0; i11 < split.length; i11++) {
                        try {
                            c1636g3.f15089b[i11] = Long.parseLong(split[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c1636g3.f15090d = new C1622f3(this, c1636g3);
                return;
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            } else {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized C1650h3 b(String key) {
        InputStream inputStream;
        if (this.f15176j != null) {
            if (f15166p.matcher(key).matches()) {
                C1636g3 c1636g3 = (C1636g3) this.f15177k.get(key);
                if (c1636g3 == null) {
                    return null;
                }
                if (c1636g3.c) {
                    InputStream[] inputStreamArr = new InputStream[this.f15174h];
                    for (int i10 = 0; i10 < this.f15174h; i10++) {
                        try {
                            inputStreamArr[i10] = new FileInputStream(c1636g3.a(i10));
                        } catch (FileNotFoundException unused) {
                            if (this.f15173g != null) {
                                kotlin.jvm.internal.g.e(key, "key");
                                LinkedHashMap B0 = kotlin.collections.q.B0(new Pair("urlKey", key));
                                C1616eb c1616eb = C1616eb.f15034a;
                                C1616eb.b("ResourceDiskCacheFileMissing", B0, EnumC1686jb.f15238a);
                            }
                            for (int i11 = 0; i11 < this.f15174h && (inputStream = inputStreamArr[i11]) != null; i11++) {
                                Ub.a(inputStream);
                            }
                            return null;
                        }
                    }
                    this.f15178l++;
                    this.f15176j.append((CharSequence) ("READ " + key + '\n'));
                    if (a()) {
                        this.f15180n.submit(this.f15181o);
                    }
                    return new C1650h3(inputStreamArr);
                }
                return null;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + key + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void d(String str) {
        if (this.f15176j != null) {
            if (f15166p.matcher(str).matches()) {
                C1636g3 c1636g3 = (C1636g3) this.f15177k.get(str);
                if (c1636g3 != null && c1636g3.f15090d == null) {
                    for (int i10 = 0; i10 < this.f15174h; i10++) {
                        File file = c1636g3.a(i10);
                        if (this.f15173g != null) {
                            kotlin.jvm.internal.g.e(file, "file");
                            if (str != null && i10 == 0) {
                                String str2 = "";
                                try {
                                    String a10 = Ub.a(new InputStreamReader(new FileInputStream(file), Ub.f14742b));
                                    kotlin.jvm.internal.g.d(a10, "readFully(...)");
                                    str2 = a10;
                                } catch (Exception unused) {
                                }
                                LinkedHashMap B0 = kotlin.collections.q.B0(new Pair("urlKey", str), new Pair(InMobiNetworkValues.URL, str2));
                                C1616eb c1616eb = C1616eb.f15034a;
                                C1616eb.b("ResourceDiskCacheFileEvicted", B0, EnumC1686jb.f15238a);
                            }
                        }
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j10 = this.f15175i;
                        long[] jArr = c1636g3.f15089b;
                        this.f15175i = j10 - jArr[i10];
                        jArr[i10] = 0;
                    }
                    this.f15178l++;
                    this.f15176j.append((CharSequence) ("REMOVE " + str + '\n'));
                    this.f15177k.remove(str);
                    if (a()) {
                        this.f15180n.submit(this.f15181o);
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final C1622f3 a(String str) {
        synchronized (this) {
            if (this.f15176j != null) {
                if (f15166p.matcher(str).matches()) {
                    C1636g3 c1636g3 = (C1636g3) this.f15177k.get(str);
                    if (c1636g3 == null) {
                        c1636g3 = new C1636g3(this, str);
                        this.f15177k.put(str, c1636g3);
                    } else if (c1636g3.f15090d != null) {
                        return null;
                    }
                    C1622f3 c1622f3 = new C1622f3(this, c1636g3);
                    c1636g3.f15090d = c1622f3;
                    BufferedWriter bufferedWriter = this.f15176j;
                    bufferedWriter.write("DIRTY " + str + '\n');
                    this.f15176j.flush();
                    return c1622f3;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final boolean a() {
        int i10 = this.f15178l;
        return i10 >= 2000 && i10 >= this.f15177k.size();
    }
}
