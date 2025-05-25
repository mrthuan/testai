package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: ReaderPermissionChecker.java */
/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f28536a;

    /* renamed from: b  reason: collision with root package name */
    public final c f28537b;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f28539e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f28540f = false;
    public final ExecutorService c = Executors.newCachedThreadPool();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f28538d = new Handler(Looper.getMainLooper());

    /* compiled from: ReaderPermissionChecker.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f28541a;

        public a(Activity activity) {
            this.f28541a = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            t1.b(ea.a.p("HWVQZBxyZ2UobSNzBmkHbnZoC2MuZRcgCXQDchsgNmgqY1ogCWVFbTNzOWkabkYuGy4=", "JFcMzboU"));
            while (true) {
                Activity activity = this.f28541a;
                if (com.google.android.play.core.assetpacks.c.W(activity) && !Thread.currentThread().isInterrupted() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.d(activity)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    synchronized (this) {
                        try {
                            wait(200L);
                        } catch (InterruptedException e10) {
                            t1.b(ea.a.p("YGUWZDdyZ2U6bQ9zR2k4bntoN2MiZUQgB3QQciUgIWhXYxwgImVFbSFzFWlbbnkuFi43IHQg", "6Y2wR7pj") + e10);
                            e10.printStackTrace();
                        }
                    }
                } else {
                    a1.a(a1.this, this.f28541a);
                    return;
                }
            }
        }
    }

    /* compiled from: ReaderPermissionChecker.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f28543a;

        public b(Activity activity) {
            this.f28543a = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            t1.b(ea.a.p("YWUqZBZyMmUAbV1zGmk5bgdoV2MtZTEgEnQych8gBWhWYyAgA2UQbRtzR2kGbnguai4=", "aSkfeXjK"));
            while (true) {
                Activity activity = this.f28543a;
                if (com.google.android.play.core.assetpacks.c.W(activity) && !Thread.currentThread().isInterrupted() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.a(activity)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    synchronized (this) {
                        try {
                            wait(200L);
                        } catch (InterruptedException e10) {
                            t1.b(ea.a.p("HWVQZBxyZ2UobSNzBmkHbnZoC2MuZRcgJ3QgcgAgEGgqY1ogCWVFbTNzOWkabkYuGy4LIHgg", "d2vwTAts") + e10);
                            e10.printStackTrace();
                        }
                    }
                } else {
                    a1.a(a1.this, this.f28543a);
                    return;
                }
            }
        }
    }

    /* compiled from: ReaderPermissionChecker.java */
    /* loaded from: classes3.dex */
    public interface c {
    }

    /* compiled from: ReaderPermissionChecker.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f28545a;

        public d(Activity activity) {
            this.f28545a = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            t1.b(ea.a.p("YWUqZBZyMmUAbV1zGmk5bgdoV2MtZTEgRHQKchMgF2hWYyAgA2UQbRtzR2kGbnguai4=", "7kgtML0w"));
            while (true) {
                Activity activity = this.f28545a;
                if (com.google.android.play.core.assetpacks.c.W(activity) && !Thread.currentThread().isInterrupted() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.c(activity)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    synchronized (this) {
                        try {
                            wait(200L);
                        } catch (InterruptedException e10) {
                            t1.b(ea.a.p("Y2UoZCByBWU6bQ9zR2k4bntoN2MiZUQgB3QQciUgIWhUYyIgNWUnbSFzFWlbbnkuFi43IHQg", "9A1IEUVg") + e10);
                            e10.printStackTrace();
                        }
                    }
                } else {
                    a1.a(a1.this, this.f28545a);
                    return;
                }
            }
        }
    }

    /* compiled from: ReaderPermissionChecker.java */
    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f28547a;

        public e(Activity activity) {
            this.f28547a = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            t1.b(ea.a.p("HWVQZBxyZ2UobSNzBmkHbnZoC2MuZRcgNHQwciAgBmgqY1ogCWVFbTNzOWkabkYuGy4=", "uwRQGQTe"));
            while (true) {
                Activity activity = this.f28547a;
                if (com.google.android.play.core.assetpacks.c.W(activity) && !Thread.currentThread().isInterrupted() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(activity) && !a1.this.f28540f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    synchronized (this) {
                        try {
                            wait(200L);
                        } catch (InterruptedException e10) {
                            t1.b(ea.a.p("YWUqZBZyMmUAbV1zGmk5bgdoV2MtZTEgG3Qich0gLmhWYyAgA2UQbRtzR2kGbnguai5XIHsg", "hCiM1SC9") + e10);
                            e10.printStackTrace();
                        }
                    }
                } else {
                    a1.a(a1.this, this.f28547a);
                    return;
                }
            }
        }
    }

    public a1(Activity activity, Class cls, h5.a aVar) {
        this.f28536a = activity;
        this.f28537b = aVar;
        this.f28539e = cls;
    }

    public static void a(a1 a1Var, Activity activity) {
        a1Var.getClass();
        if (com.google.android.play.core.assetpacks.c.W(activity) && !a1Var.f28540f) {
            a1Var.f28538d.post(new z0(a1Var, activity));
        }
    }

    public final void b() {
        t1.b(ea.a.p("YWUqZBZyMmUAbV1zGmk5bgdoV2MtZTEgKGUcdBNveQ==", "LoaWRYiL"));
        this.f28540f = true;
        ExecutorService executorService = this.c;
        if (!executorService.isShutdown()) {
            executorService.shutdownNow();
        }
        Handler handler = this.f28538d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 30) {
            Activity activity = this.f28536a;
            if (com.google.android.play.core.assetpacks.c.W(activity)) {
                this.f28540f = false;
                this.c.execute(new e(activity));
                return;
            }
            return;
        }
        t1.b(ea.a.p("YWUqZBZyMmUAbV1zGmk5bgdoV2MtZTEgP3QAch9DWmVQa3oxIHQNchNnUVAMcjtpN3NbbygsY2IpbA1vHCADMR8gOWUHdRBu", "Lak2v6N7"));
    }
}
