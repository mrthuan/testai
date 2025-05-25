package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* compiled from: ReportFragment.kt */
/* loaded from: classes.dex */
public final class b0 extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f4028b = 0;

    /* renamed from: a  reason: collision with root package name */
    public a f4029a;

    /* compiled from: ReportFragment.kt */
    /* loaded from: classes.dex */
    public interface a {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* compiled from: ReportFragment.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(Activity activity, Lifecycle.Event event) {
            kotlin.jvm.internal.g.e(activity, "activity");
            kotlin.jvm.internal.g.e(event, "event");
            if (activity instanceof r) {
                ((r) activity).getLifecycle().f(event);
            } else if (activity instanceof p) {
                Lifecycle lifecycle = ((p) activity).getLifecycle();
                if (lifecycle instanceof q) {
                    ((q) lifecycle).f(event);
                }
            }
        }

        public static void b(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.getClass();
                activity.registerActivityLifecycleCallbacks(new c());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new b0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* compiled from: ReportFragment.kt */
    /* loaded from: classes.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a();

        /* compiled from: ReportFragment.kt */
        /* loaded from: classes.dex */
        public static final class a {
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.g.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new c());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.g.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.g.e(activity, "activity");
            int i10 = b0.f4028b;
            b.a(activity, Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
            int i10 = b0.f4028b;
            b.a(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
            int i10 = b0.f4028b;
            b.a(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
            int i10 = b0.f4028b;
            b.a(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
            int i10 = b0.f4028b;
            b.a(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
            int i10 = b0.f4028b;
            b.a(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.g.e(activity, "activity");
            kotlin.jvm.internal.g.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
        }
    }

    public final void a(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.g.d(activity, "activity");
            b.a(activity, event);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a aVar = this.f4029a;
        if (aVar != null) {
            aVar.onCreate();
        }
        a(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(Lifecycle.Event.ON_DESTROY);
        this.f4029a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a aVar = this.f4029a;
        if (aVar != null) {
            aVar.onResume();
        }
        a(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a aVar = this.f4029a;
        if (aVar != null) {
            aVar.onStart();
        }
        a(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(Lifecycle.Event.ON_STOP);
    }
}
