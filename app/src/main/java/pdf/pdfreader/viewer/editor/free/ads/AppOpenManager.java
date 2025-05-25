package pdf.pdfreader.viewer.editor.free.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.z;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.ui.act.PreInstallOpenAdActivity;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* loaded from: classes3.dex */
public class AppOpenManager implements Application.ActivityLifecycleCallbacks, o {

    /* renamed from: m  reason: collision with root package name */
    public static volatile AppOpenManager f23901m;
    public Application c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f23904d;

    /* renamed from: e  reason: collision with root package name */
    public Activity f23905e;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f23902a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f23903b = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final Handler f23906f = new Handler(Looper.getMainLooper());

    /* renamed from: g  reason: collision with root package name */
    public boolean f23907g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f23908h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f23909i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f23910j = false;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.activity.b f23911k = new androidx.activity.b(this, 22);

    /* renamed from: l  reason: collision with root package name */
    public final b7.g f23912l = new b7.g(this, 15);

    static {
        ea.a.p("G2RtZUF0Wk84ZQhBRHAWZEsgE3A5T0ZlGk0QbjBnJ3Ig", "FpZ92zb8");
        f23901m = null;
    }

    public static synchronized AppOpenManager c() {
        AppOpenManager appOpenManager;
        synchronized (AppOpenManager.class) {
            if (f23901m == null) {
                f23901m = new AppOpenManager();
            }
            appOpenManager = f23901m;
        }
        return appOpenManager;
    }

    public final void f() {
        Activity activity;
        t1.b(ea.a.p("cmQfZQB0Qk8CZVpBGXAXZDcgc3A2TzNlFE02bidnKHITICRwFm4jZFJzXG8eTjd0LXZXTzZlLUEeSTFXJ2k5aV1na3MGcBJsF21Rbh1TPm8zTlN0L3YmTwplOUEiOg==", "zWFMOVaD") + this.f23909i);
        if (!this.f23909i) {
            return;
        }
        this.f23909i = false;
        if (z.f4083i.f4088f.f4071d.isAtLeast(Lifecycle.State.STARTED) && (activity = this.f23904d) != null) {
            int i10 = PreInstallOpenAdActivity.f26628u;
            PreInstallOpenAdActivity.a.a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f23905e == activity) {
            this.f23905e = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f23904d = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        SystemClock.elapsedRealtime();
        this.f23905e = activity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r0 != false) goto L16;
     */
    @androidx.lifecycle.y(androidx.lifecycle.Lifecycle.Event.ON_START)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAppForegrounded() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ads.AppOpenManager.onAppForegrounded():void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
