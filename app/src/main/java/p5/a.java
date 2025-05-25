package p5;

import a6.h;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: FilePrinter.java */
/* loaded from: classes.dex */
public final class a implements o5.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f23706a;

    /* renamed from: b  reason: collision with root package name */
    public final s5.b f23707b;
    public final t0 c;

    /* renamed from: d  reason: collision with root package name */
    public final r5.a f23708d;

    /* renamed from: e  reason: collision with root package name */
    public final l5.a f23709e;

    /* renamed from: f  reason: collision with root package name */
    public final d f23710f;

    /* renamed from: g  reason: collision with root package name */
    public volatile c f23711g;

    /* compiled from: FilePrinter.java */
    /* renamed from: p5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0325a {

        /* renamed from: a  reason: collision with root package name */
        public final String f23712a;

        /* renamed from: b  reason: collision with root package name */
        public s5.b f23713b;
        public t0 c;

        /* renamed from: d  reason: collision with root package name */
        public r5.a f23714d;

        /* renamed from: e  reason: collision with root package name */
        public l5.a f23715e;

        public C0325a(String str) {
            this.f23712a = str;
        }
    }

    /* compiled from: FilePrinter.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f23716a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23717b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final String f23718d;

        public b(int i10, String str, String str2, long j10) {
            this.f23716a = j10;
            this.f23717b = i10;
            this.c = str;
            this.f23718d = str2;
        }
    }

    /* compiled from: FilePrinter.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedBlockingQueue f23719a = new LinkedBlockingQueue();

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f23720b;

        public c() {
        }

        public final void a() {
            synchronized (this) {
                new Thread(this).start();
                this.f23720b = true;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    b bVar = (b) this.f23719a.take();
                    if (bVar != null) {
                        a.b(a.this, bVar.f23716a, bVar.f23717b, bVar.c, bVar.f23718d);
                    } else {
                        return;
                    }
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                    synchronized (this) {
                        this.f23720b = false;
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: FilePrinter.java */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public String f23721a;

        /* renamed from: b  reason: collision with root package name */
        public File f23722b;
        public BufferedWriter c;

        public d() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.io.BufferedWriter, java.lang.String, java.io.File] */
        public final void a() {
            BufferedWriter bufferedWriter = this.c;
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                } finally {
                    this.c = null;
                    this.f23721a = null;
                    this.f23722b = null;
                }
            }
        }

        public final boolean b(String str) {
            this.f23721a = str;
            File file = new File(a.this.f23706a, str);
            this.f23722b = file;
            if (!file.exists()) {
                try {
                    File parentFile = this.f23722b.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    this.f23722b.createNewFile();
                } catch (IOException e10) {
                    e10.printStackTrace();
                    this.f23721a = null;
                    this.f23722b = null;
                    return false;
                }
            }
            try {
                this.c = new BufferedWriter(new FileWriter(this.f23722b, true));
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f23721a = null;
                this.f23722b = null;
                return false;
            }
        }
    }

    public a(C0325a c0325a) {
        String str = c0325a.f23712a;
        this.f23706a = str;
        this.f23707b = c0325a.f23713b;
        this.c = c0325a.c;
        this.f23708d = c0325a.f23714d;
        this.f23709e = c0325a.f23715e;
        this.f23710f = new d();
        this.f23711g = new c();
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static void b(a aVar, long j10, int i10, String str, String str2) {
        boolean z10;
        d dVar = aVar.f23710f;
        String str3 = dVar.f23721a;
        boolean z11 = true;
        String str4 = aVar.f23706a;
        s5.b bVar = aVar.f23707b;
        if (str3 != null) {
            bVar.b();
        } else {
            System.currentTimeMillis();
            String a10 = bVar.a();
            if (a10 != null && a10.trim().length() != 0) {
                if (!a10.equals(str3)) {
                    if (dVar.c != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        dVar.a();
                    }
                    File[] listFiles = new File(str4).listFiles();
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (aVar.f23708d.b(file)) {
                                file.delete();
                            }
                        }
                    }
                    if (dVar.b(a10)) {
                        str3 = a10;
                    } else {
                        return;
                    }
                }
            } else {
                throw new IllegalArgumentException("File name should not be empty.");
            }
        }
        File file2 = dVar.f23722b;
        aVar.c.getClass();
        if (file2.length() <= 1048576) {
            z11 = false;
        }
        if (z11) {
            dVar.a();
            File file3 = new File(str4, h.c(str3, ".bak"));
            if (file3.exists()) {
                file3.delete();
            }
            file2.renameTo(file3);
            if (!dVar.b(str3)) {
                return;
            }
        }
        try {
            dVar.c.write(aVar.f23709e.c(i10, str, str2, j10).toString());
            dVar.c.newLine();
            dVar.c.flush();
        } catch (IOException unused) {
        }
    }

    @Override // o5.a
    public final void a(int i10, String str, String str2) {
        boolean z10;
        long currentTimeMillis = System.currentTimeMillis();
        c cVar = this.f23711g;
        synchronized (cVar) {
            z10 = cVar.f23720b;
        }
        if (!z10) {
            this.f23711g.a();
        }
        c cVar2 = this.f23711g;
        b bVar = new b(i10, str, str2, currentTimeMillis);
        cVar2.getClass();
        try {
            cVar2.f23719a.put(bVar);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }
}
