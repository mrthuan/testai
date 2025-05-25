package yj;

import java.util.concurrent.ExecutorService;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.progress.ProgressMonitor;

/* compiled from: AsyncZipTask.java */
/* loaded from: classes3.dex */
public abstract class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ProgressMonitor f32168a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32169b;
    public final ExecutorService c;

    /* compiled from: AsyncZipTask.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ProgressMonitor f32170a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f32171b;
        public final ExecutorService c;

        public a(ExecutorService executorService, boolean z10, ProgressMonitor progressMonitor) {
            this.c = executorService;
            this.f32171b = z10;
            this.f32170a = progressMonitor;
        }
    }

    public c(a aVar) {
        this.f32168a = aVar.f32170a;
        this.f32169b = aVar.f32171b;
        this.c = aVar.c;
    }

    public abstract void a(T t4, ProgressMonitor progressMonitor);

    public final void b(T t4, ProgressMonitor progressMonitor) {
        try {
            a(t4, progressMonitor);
            progressMonitor.f22457f = ProgressMonitor.Result.SUCCESS;
            progressMonitor.f22455d = 100;
            progressMonitor.f22456e = ProgressMonitor.Task.NONE;
            progressMonitor.f22453a = ProgressMonitor.State.READY;
        } catch (ZipException e10) {
            progressMonitor.f22457f = ProgressMonitor.Result.ERROR;
            progressMonitor.f22458g = e10;
            progressMonitor.f22456e = ProgressMonitor.Task.NONE;
            progressMonitor.f22453a = ProgressMonitor.State.READY;
            throw e10;
        } catch (Exception e11) {
            progressMonitor.f22457f = ProgressMonitor.Result.ERROR;
            progressMonitor.f22458g = e11;
            progressMonitor.f22456e = ProgressMonitor.Task.NONE;
            progressMonitor.f22453a = ProgressMonitor.State.READY;
            throw new ZipException(e11);
        }
    }
}
