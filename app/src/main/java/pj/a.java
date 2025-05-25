package pj;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PDFThreadPool.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f28965a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f28966b = new Handler(Looper.getMainLooper());
    public LinkedBlockingQueue<Runnable> c;

    /* compiled from: PDFThreadPool.java */
    /* renamed from: pj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0362a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28967a = new a(new ThreadPoolExecutor(1, 1, 5, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadPoolExecutor.CallerRunsPolicy()));
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f28965a = threadPoolExecutor;
    }
}
