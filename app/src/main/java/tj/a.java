package tj;

import c7.w;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
import net.lingala.zip4j.progress.ProgressMonitor;
import u8.b;
import wj.g;
import xj.f;
import xj.h;
import xj.k;
import xj.l;
import yj.c;
import yj.d;

/* compiled from: ZipFile.java */
/* loaded from: classes3.dex */
public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final File f30050a;

    /* renamed from: b  reason: collision with root package name */
    public l f30051b;
    public boolean c;

    /* renamed from: g  reason: collision with root package name */
    public ThreadFactory f30055g;

    /* renamed from: h  reason: collision with root package name */
    public ExecutorService f30056h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f30057i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final boolean f30058j = true;

    /* renamed from: f  reason: collision with root package name */
    public char[] f30054f = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f30053e = false;

    /* renamed from: d  reason: collision with root package name */
    public final ProgressMonitor f30052d = new ProgressMonitor();

    public a(File file) {
        this.f30050a = file;
    }

    public final void a(String str, h hVar) {
        boolean z10;
        long j10;
        if (str != null && str.trim().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            File file = new File(str);
            if (file.exists()) {
                if (!file.isDirectory()) {
                    throw new ZipException("output directory is not valid");
                }
            } else if (!file.mkdirs()) {
                throw new ZipException("Cannot create output directories");
            }
            if (this.f30051b == null) {
                f();
            }
            l lVar = this.f30051b;
            if (lVar != null) {
                char[] cArr = this.f30054f;
                if (this.f30053e) {
                    if (this.f30055g == null) {
                        this.f30055g = Executors.defaultThreadFactory();
                    }
                    this.f30056h = Executors.newSingleThreadExecutor(this.f30055g);
                }
                d dVar = new d(lVar, cArr, hVar, new c.a(this.f30056h, this.f30053e, this.f30052d));
                d.a aVar = new d.a(str, new b(4096, this.f30058j));
                ProgressMonitor progressMonitor = dVar.f32168a;
                boolean z11 = dVar.f32169b;
                if (z11 && ProgressMonitor.State.BUSY.equals(progressMonitor.f22453a)) {
                    throw new ZipException("invalid operation - Zip4j is in busy state");
                }
                progressMonitor.f22454b = 0L;
                progressMonitor.c = 0L;
                progressMonitor.f22455d = 0;
                progressMonitor.f22453a = ProgressMonitor.State.BUSY;
                progressMonitor.f22456e = ProgressMonitor.Task.EXTRACT_ENTRY;
                if (z11) {
                    long j11 = 0;
                    for (f fVar : (List) lVar.f31850a.f30907b) {
                        k kVar = fVar.f31829m;
                        if (kVar != null) {
                            j10 = kVar.c;
                            if (j10 > 0) {
                                j11 += j10;
                            }
                        }
                        j10 = fVar.f31823g;
                        j11 += j10;
                    }
                    progressMonitor.f22454b = j11;
                    dVar.c.execute(new yj.b(dVar, aVar));
                    return;
                }
                dVar.b(aVar, progressMonitor);
                return;
            }
            throw new ZipException("Internal error occurred when extracting zip file");
        }
        throw new ZipException("output path is null or invalid");
    }

    public final ProgressMonitor b() {
        return this.f30052d;
    }

    public final RandomAccessFile c() {
        File file = this.f30050a;
        if (file.getName().endsWith(".zip.001")) {
            g gVar = new g(file, RandomAccessFileMode.READ.getValue(), zj.a.b(file));
            gVar.a(gVar.f31281b.length - 1);
            return gVar;
        }
        return new RandomAccessFile(file, RandomAccessFileMode.READ.getValue());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f30057i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InputStream) it.next()).close();
        }
        arrayList.clear();
    }

    public final boolean d() {
        if (this.f30051b == null) {
            f();
            if (this.f30051b == null) {
                throw new ZipException("Zip Model is null");
            }
        }
        w1.f fVar = this.f30051b.f31850a;
        if (fVar != null) {
            Object obj = fVar.f30907b;
            if (((List) obj) != null) {
                Iterator it = ((List) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f fVar2 = (f) it.next();
                    if (fVar2 != null && fVar2.f31826j) {
                        this.c = true;
                        break;
                    }
                }
                return this.c;
            }
        }
        throw new ZipException("invalid zip file");
    }

    public final void f() {
        if (this.f30051b != null) {
            return;
        }
        File file = this.f30050a;
        if (!file.exists()) {
            l lVar = new l();
            this.f30051b = lVar;
            lVar.f31854f = file;
        } else if (file.canRead()) {
            try {
                RandomAccessFile c = c();
                l d10 = new w().d(c, new b(4096, this.f30058j));
                this.f30051b = d10;
                d10.f31854f = file;
                c.close();
            } catch (ZipException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new ZipException(e11);
            }
        } else {
            throw new ZipException("no read access for the input zip file");
        }
    }

    public final void h(char[] cArr) {
        this.f30054f = cArr;
    }

    public final void i() {
        this.f30053e = true;
    }

    public final String toString() {
        return this.f30050a.toString();
    }
}
