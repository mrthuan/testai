package androidx.window.java.layout;

import android.app.Activity;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.x;
import kotlinx.coroutines.y0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;
import w0.a;

/* compiled from: WindowInfoTrackerCallbackAdapter.kt */
/* loaded from: classes.dex */
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final Map<a<?>, y0> consumerToJobMap;
    private final ReentrantLock lock;
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker tracker) {
        g.e(tracker, "tracker");
        this.tracker = tracker;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap();
    }

    private final <T> void addListener(Executor executor, a<T> aVar, c<? extends T> cVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                this.consumerToJobMap.put(aVar, t0.d0(x.a(com.google.android.play.core.assetpacks.c.v(executor)), null, null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(cVar, aVar, null), 3));
            }
            d dVar = d.f30009a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(a<?> aVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            y0 y0Var = this.consumerToJobMap.get(aVar);
            if (y0Var != null) {
                y0Var.b(null);
            }
            this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, a<WindowLayoutInfo> consumer) {
        g.e(activity, "activity");
        g.e(executor, "executor");
        g.e(consumer, "consumer");
        addListener(executor, consumer, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(a<WindowLayoutInfo> consumer) {
        g.e(consumer, "consumer");
        removeListener(consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public c<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        g.e(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
