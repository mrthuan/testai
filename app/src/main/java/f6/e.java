package f6;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.z0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;

/* compiled from: ViewObserver.kt */
/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f17132d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Activity> f17133a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f17134b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: ViewObserver.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Activity activity) {
            View b10;
            g.e(activity, "activity");
            int hashCode = activity.hashCode();
            HashMap hashMap = e.f17132d;
            HashMap hashMap2 = null;
            if (!k6.a.b(e.class)) {
                try {
                    hashMap2 = e.f17132d;
                } catch (Throwable th2) {
                    k6.a.a(e.class, th2);
                }
            }
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = hashMap2.get(valueOf);
            if (obj == null) {
                obj = new e(activity);
                hashMap2.put(valueOf, obj);
            }
            e eVar = (e) obj;
            if (!k6.a.b(e.class)) {
                try {
                    if (!k6.a.b(eVar) && !eVar.c.getAndSet(true) && (b10 = c6.f.b(eVar.f17133a.get())) != null) {
                        ViewTreeObserver viewTreeObserver = b10.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(eVar);
                            eVar.a();
                        }
                    }
                } catch (Throwable th3) {
                    k6.a.a(e.class, th3);
                }
            }
        }

        public static void b(Activity activity) {
            View b10;
            g.e(activity, "activity");
            int hashCode = activity.hashCode();
            HashMap hashMap = e.f17132d;
            HashMap hashMap2 = null;
            if (!k6.a.b(e.class)) {
                try {
                    hashMap2 = e.f17132d;
                } catch (Throwable th2) {
                    k6.a.a(e.class, th2);
                }
            }
            e eVar = (e) hashMap2.remove(Integer.valueOf(hashCode));
            if (eVar != null && !k6.a.b(e.class)) {
                try {
                    if (!k6.a.b(eVar) && eVar.c.getAndSet(false) && (b10 = c6.f.b(eVar.f17133a.get())) != null) {
                        ViewTreeObserver viewTreeObserver = b10.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener(eVar);
                        }
                    }
                } catch (Throwable th3) {
                    k6.a.a(e.class, th3);
                }
            }
        }
    }

    public e(Activity activity) {
        this.f17133a = new WeakReference<>(activity);
    }

    public final void a() {
        if (k6.a.b(this)) {
            return;
        }
        try {
            z0 z0Var = new z0(this, 1);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                z0Var.run();
            } else {
                this.f17134b.post(z0Var);
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (k6.a.b(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
