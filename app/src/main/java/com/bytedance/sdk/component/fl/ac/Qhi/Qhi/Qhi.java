package com.bytedance.sdk.component.fl.ac.Qhi.Qhi;

import a6.h;
import androidx.appcompat.view.menu.d;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class Qhi implements Closeable {
    static final Pattern Qhi = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: ac  reason: collision with root package name */
    public static final OutputStream f8377ac = new OutputStream() { // from class: com.bytedance.sdk.component.fl.ac.Qhi.Qhi.Qhi.2
        @Override // java.io.OutputStream
        public void write(int i10) {
        }
    };
    private final File CJ;
    private final File ROR;
    private final int Sf;
    private final File Tgh;
    private final int WAv;
    final ExecutorService cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final File f8378fl;

    /* renamed from: hm  reason: collision with root package name */
    private long f8379hm;
    private int iMK;

    /* renamed from: zc  reason: collision with root package name */
    private Writer f8380zc;
    private long Gm = 0;
    private final LinkedHashMap<String, cJ> ABk = new LinkedHashMap<>(0, 0.75f, true);
    private long pA = -1;
    private long hpZ = 0;
    private final Callable<Void> HzH = new Callable<Void>() { // from class: com.bytedance.sdk.component.fl.ac.Qhi.Qhi.Qhi.1
        @Override // java.util.concurrent.Callable
        /* renamed from: Qhi */
        public Void call() {
            synchronized (Qhi.this) {
                if (Qhi.this.f8380zc != null) {
                    Qhi.this.Sf();
                    if (Qhi.this.Tgh()) {
                        Qhi.this.fl();
                        Qhi.this.iMK = 0;
                    }
                    return null;
                }
                return null;
            }
        }
    };

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bytedance.sdk.component.fl.ac.Qhi.Qhi.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0096Qhi {
        private boolean CJ;

        /* renamed from: ac  reason: collision with root package name */
        private final boolean[] f8381ac;
        private final cJ cJ;

        /* renamed from: fl  reason: collision with root package name */
        private boolean f8382fl;

        /* compiled from: DiskLruCache.java */
        /* renamed from: com.bytedance.sdk.component.fl.ac.Qhi.Qhi.Qhi$Qhi$Qhi  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0097Qhi extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0096Qhi.this.CJ = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0096Qhi.this.CJ = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    C0096Qhi.this.CJ = true;
                }
            }

            private C0097Qhi(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    C0096Qhi.this.CJ = true;
                }
            }
        }

        private C0096Qhi(cJ cJVar) {
            this.cJ = cJVar;
            this.f8381ac = cJVar.CJ ? null : new boolean[Qhi.this.WAv];
        }

        public void cJ() {
            Qhi.this.Qhi(this, false);
        }

        public OutputStream Qhi(int i10) {
            FileOutputStream fileOutputStream;
            C0097Qhi c0097Qhi;
            if (i10 >= 0 && i10 < Qhi.this.WAv) {
                synchronized (Qhi.this) {
                    if (this.cJ.f8386fl == this) {
                        if (!this.cJ.CJ) {
                            this.f8381ac[i10] = true;
                        }
                        File cJ = this.cJ.cJ(i10);
                        try {
                            fileOutputStream = new FileOutputStream(cJ);
                        } catch (FileNotFoundException unused) {
                            Qhi.this.CJ.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(cJ);
                            } catch (FileNotFoundException unused2) {
                                return Qhi.f8377ac;
                            }
                        }
                        c0097Qhi = new C0097Qhi(fileOutputStream);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                return c0097Qhi;
            }
            StringBuilder e10 = d.e("Expected index ", i10, " to be greater than 0 and less than the maximum value count of ");
            e10.append(Qhi.this.WAv);
            throw new IllegalArgumentException(e10.toString());
        }

        public void Qhi() {
            if (this.CJ) {
                Qhi.this.Qhi(this, false);
                Qhi.this.ac(this.cJ.cJ);
            } else {
                Qhi.this.Qhi(this, true);
            }
            this.f8382fl = true;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class ac implements Closeable {
        private final InputStream[] CJ;

        /* renamed from: ac  reason: collision with root package name */
        private final long f8383ac;
        private final String cJ;

        /* renamed from: fl  reason: collision with root package name */
        private final long[] f8384fl;

        public InputStream Qhi(int i10) {
            return this.CJ[i10];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.CJ) {
                com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(inputStream);
            }
        }

        private ac(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.cJ = str;
            this.f8383ac = j10;
            this.CJ = inputStreamArr;
            this.f8384fl = jArr;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class cJ {
        private boolean CJ;
        private long Tgh;

        /* renamed from: ac  reason: collision with root package name */
        private final long[] f8385ac;
        private final String cJ;

        /* renamed from: fl  reason: collision with root package name */
        private C0096Qhi f8386fl;

        private cJ(String str) {
            this.cJ = str;
            this.f8385ac = new long[Qhi.this.WAv];
        }

        private IOException cJ(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File cJ(int i10) {
            File file = Qhi.this.CJ;
            return new File(file, this.cJ + "." + i10 + ".tmp");
        }

        public String Qhi() {
            long[] jArr;
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f8385ac) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qhi(String[] strArr) {
            if (strArr.length == Qhi.this.WAv) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.f8385ac[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw cJ(strArr);
                    }
                }
                return;
            }
            throw cJ(strArr);
        }

        public File Qhi(int i10) {
            File file = Qhi.this.CJ;
            return new File(file, this.cJ + "." + i10);
        }
    }

    private Qhi(File file, int i10, int i11, long j10, ExecutorService executorService) {
        this.CJ = file;
        this.Sf = i10;
        this.f8378fl = new File(file, "journal");
        this.Tgh = new File(file, "journal.tmp");
        this.ROR = new File(file, "journal.bkp");
        this.WAv = i11;
        this.f8379hm = j10;
        this.cJ = executorService;
    }

    private void ROR() {
        if (this.f8380zc != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sf() {
        long j10 = this.f8379hm;
        long j11 = this.pA;
        if (j11 >= 0) {
            j10 = j11;
        }
        while (this.Gm > j10) {
            ac(this.ABk.entrySet().iterator().next().getKey());
        }
        this.pA = -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f8380zc == null) {
            return;
        }
        Iterator it = new ArrayList(this.ABk.values()).iterator();
        while (it.hasNext()) {
            cJ cJVar = (cJ) it.next();
            if (cJVar.f8386fl != null) {
                cJVar.f8386fl.cJ();
            }
        }
        Sf();
        this.f8380zc.close();
        this.f8380zc = null;
    }

    private void CJ(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.ABk.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            cJ cJVar = this.ABk.get(substring);
            if (cJVar == null) {
                cJVar = new cJ(substring);
                this.ABk.put(substring, cJVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                cJVar.CJ = true;
                cJVar.f8386fl = null;
                cJVar.Qhi(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                cJVar.f8386fl = new C0096Qhi(cJVar);
                return;
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            } else {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Tgh() {
        int i10 = this.iMK;
        return i10 >= 2000 && i10 >= this.ABk.size();
    }

    private void ac() {
        com.bytedance.sdk.component.fl.ac.Qhi.Qhi.ac acVar = new com.bytedance.sdk.component.fl.ac.Qhi.Qhi.ac(new FileInputStream(this.f8378fl), fl.Qhi);
        try {
            String Qhi2 = acVar.Qhi();
            String Qhi3 = acVar.Qhi();
            String Qhi4 = acVar.Qhi();
            String Qhi5 = acVar.Qhi();
            String Qhi6 = acVar.Qhi();
            if (!"libcore.io.DiskLruCache".equals(Qhi2) || !"1".equals(Qhi3) || !Integer.toString(this.Sf).equals(Qhi4) || !Integer.toString(this.WAv).equals(Qhi5) || !"".equals(Qhi6)) {
                throw new IOException("unexpected journal header: [" + Qhi2 + ", " + Qhi3 + ", " + Qhi5 + ", " + Qhi6 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    CJ(acVar.Qhi());
                    i10++;
                } catch (EOFException unused) {
                    this.iMK = i10 - this.ABk.size();
                    if (acVar.cJ()) {
                        fl();
                    } else {
                        this.f8380zc = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8378fl, true), fl.Qhi));
                    }
                    com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(acVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(acVar);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void fl() {
        Writer writer = this.f8380zc;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.Tgh), fl.Qhi));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.Sf));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.WAv));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (cJ cJVar : this.ABk.values()) {
            if (cJVar.f8386fl != null) {
                bufferedWriter.write("DIRTY " + cJVar.cJ + '\n');
            } else {
                bufferedWriter.write("CLEAN " + cJVar.cJ + cJVar.Qhi() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f8378fl.exists()) {
            Qhi(this.f8378fl, this.ROR, true);
        }
        Qhi(this.Tgh, this.f8378fl, false);
        this.ROR.delete();
        this.f8380zc = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f8378fl, true), fl.Qhi));
    }

    public C0096Qhi cJ(String str) {
        return Qhi(str, -1L);
    }

    public void cJ() {
        close();
        fl.Qhi(this.CJ);
    }

    public static Qhi Qhi(File file, int i10, int i11, long j10, ExecutorService executorService) {
        if (j10 > 0) {
            if (i11 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        Qhi(file2, file3, false);
                    }
                }
                Qhi qhi = new Qhi(file, i10, i11, j10, executorService);
                if (qhi.f8378fl.exists()) {
                    try {
                        qhi.ac();
                        qhi.CJ();
                        return qhi;
                    } catch (IOException e10) {
                        Objects.toString(file);
                        e10.getMessage();
                        qhi.cJ();
                    }
                }
                file.mkdirs();
                Qhi qhi2 = new Qhi(file, i10, i11, j10, executorService);
                qhi2.fl();
                return qhi2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void CJ() {
        Qhi(this.Tgh);
        Iterator<cJ> it = this.ABk.values().iterator();
        while (it.hasNext()) {
            cJ next = it.next();
            int i10 = 0;
            if (next.f8386fl != null) {
                next.f8386fl = null;
                while (i10 < this.WAv) {
                    Qhi(next.Qhi(i10));
                    Qhi(next.cJ(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.WAv) {
                    this.Gm += next.f8385ac[i10];
                    i10++;
                }
            }
        }
    }

    public synchronized boolean ac(String str) {
        ROR();
        fl(str);
        cJ cJVar = this.ABk.get(str);
        if (cJVar != null && cJVar.f8386fl == null) {
            for (int i10 = 0; i10 < this.WAv; i10++) {
                File Qhi2 = cJVar.Qhi(i10);
                if (Qhi2.exists() && !Qhi2.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(Qhi2)));
                }
                this.Gm -= cJVar.f8385ac[i10];
                cJVar.f8385ac[i10] = 0;
            }
            this.iMK++;
            this.f8380zc.append((CharSequence) ("REMOVE " + str + '\n'));
            this.ABk.remove(str);
            if (Tgh()) {
                this.cJ.submit(this.HzH);
            }
            return true;
        }
        return false;
    }

    private static void Qhi(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void Qhi(File file, File file2, boolean z10) {
        if (z10) {
            Qhi(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void fl(String str) {
        if (!Qhi.matcher(str).matches()) {
            throw new IllegalArgumentException(h.d("keys must match regex [a-z0-9_-]{1,120}: \"", str, OperatorName.SHOW_TEXT_LINE_AND_SPACE));
        }
    }

    public synchronized ac Qhi(String str) {
        InputStream inputStream;
        ROR();
        fl(str);
        cJ cJVar = this.ABk.get(str);
        if (cJVar == null) {
            return null;
        }
        if (cJVar.CJ) {
            InputStream[] inputStreamArr = new InputStream[this.WAv];
            for (int i10 = 0; i10 < this.WAv; i10++) {
                try {
                    inputStreamArr[i10] = new FileInputStream(cJVar.Qhi(i10));
                } catch (FileNotFoundException unused) {
                    for (int i11 = 0; i11 < this.WAv && (inputStream = inputStreamArr[i11]) != null; i11++) {
                        com.bytedance.sdk.component.fl.ac.ac.cJ.Qhi(inputStream);
                    }
                    return null;
                }
            }
            this.iMK++;
            this.f8380zc.append((CharSequence) ("READ " + str + '\n'));
            if (Tgh()) {
                this.cJ.submit(this.HzH);
            }
            return new ac(str, cJVar.Tgh, inputStreamArr, cJVar.f8385ac);
        }
        return null;
    }

    private synchronized C0096Qhi Qhi(String str, long j10) {
        ROR();
        fl(str);
        cJ cJVar = this.ABk.get(str);
        if (j10 == -1 || (cJVar != null && cJVar.Tgh == j10)) {
            if (cJVar != null) {
                if (cJVar.f8386fl != null) {
                    return null;
                }
            } else {
                cJVar = new cJ(str);
                this.ABk.put(str, cJVar);
            }
            C0096Qhi c0096Qhi = new C0096Qhi(cJVar);
            cJVar.f8386fl = c0096Qhi;
            Writer writer = this.f8380zc;
            writer.write("DIRTY " + str + '\n');
            this.f8380zc.flush();
            return c0096Qhi;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Qhi(C0096Qhi c0096Qhi, boolean z10) {
        cJ cJVar = c0096Qhi.cJ;
        if (cJVar.f8386fl == c0096Qhi) {
            if (z10 && !cJVar.CJ) {
                for (int i10 = 0; i10 < this.WAv; i10++) {
                    if (c0096Qhi.f8381ac[i10]) {
                        if (!cJVar.cJ(i10).exists()) {
                            c0096Qhi.cJ();
                            return;
                        }
                    } else {
                        c0096Qhi.cJ();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i10)));
                    }
                }
            }
            for (int i11 = 0; i11 < this.WAv; i11++) {
                File cJ2 = cJVar.cJ(i11);
                if (z10) {
                    if (cJ2.exists()) {
                        File Qhi2 = cJVar.Qhi(i11);
                        cJ2.renameTo(Qhi2);
                        long j10 = cJVar.f8385ac[i11];
                        long length = Qhi2.length();
                        cJVar.f8385ac[i11] = length;
                        this.Gm = (this.Gm - j10) + length;
                    }
                } else {
                    Qhi(cJ2);
                }
            }
            this.iMK++;
            cJVar.f8386fl = null;
            if (!(cJVar.CJ | z10)) {
                this.ABk.remove(cJVar.cJ);
                this.f8380zc.write("REMOVE " + cJVar.cJ + '\n');
            } else {
                cJVar.CJ = true;
                this.f8380zc.write("CLEAN " + cJVar.cJ + cJVar.Qhi() + '\n');
                if (z10) {
                    long j11 = this.hpZ;
                    this.hpZ = 1 + j11;
                    cJVar.Tgh = j11;
                }
            }
            this.f8380zc.flush();
            if (this.Gm > this.f8379hm || Tgh()) {
                this.cJ.submit(this.HzH);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized void Qhi() {
        ROR();
        Sf();
        this.f8380zc.flush();
    }
}
