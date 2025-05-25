package mj;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: TextEditorExecutor.java */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final ExecutorService f22078d = Executors.newSingleThreadExecutor();

    /* renamed from: e  reason: collision with root package name */
    public static final Object f22079e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static volatile boolean f22080f = false;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f22081a = false;

    /* renamed from: b  reason: collision with root package name */
    public final PriorityBlockingQueue<d0> f22082b = new PriorityBlockingQueue<>(10, new c0());
    public final Handler c = new Handler(Looper.getMainLooper());

    public final void a() {
        if (!this.f22081a && f22080f) {
            f22080f = false;
            Object obj = f22079e;
            synchronized (obj) {
                obj.notifyAll();
            }
            f22078d.execute(new androidx.activity.k(this, 17));
        } else if (this.f22081a) {
        } else {
            f22080f = true;
            this.f22081a = true;
            f22078d.execute(new androidx.activity.b(this, 19));
        }
    }
}
