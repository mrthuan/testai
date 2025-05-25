package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.z;

/* compiled from: ProcessLifecycleOwner.kt */
/* loaded from: classes.dex */
public final class a0 extends f {
    final /* synthetic */ z this$0;

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class a extends f {
        final /* synthetic */ z this$0;

        public a(z zVar) {
            this.this$0 = zVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.g.e(activity, "activity");
            z zVar = this.this$0;
            int i10 = zVar.f4084a + 1;
            zVar.f4084a = i10;
            if (i10 == 1 && zVar.f4086d) {
                zVar.f4088f.f(Lifecycle.Event.ON_START);
                zVar.f4086d = false;
            }
        }
    }

    public a0(z zVar) {
        this.this$0 = zVar;
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.g.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = b0.f4028b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.g.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((b0) findFragmentByTag).f4029a = this.this$0.f4090h;
        }
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        z zVar = this.this$0;
        int i10 = zVar.f4085b - 1;
        zVar.f4085b = i10;
        if (i10 == 0) {
            Handler handler = zVar.f4087e;
            kotlin.jvm.internal.g.b(handler);
            handler.postDelayed(zVar.f4089g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.g.e(activity, "activity");
        z.a.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        z zVar = this.this$0;
        int i10 = zVar.f4084a - 1;
        zVar.f4084a = i10;
        if (i10 == 0 && zVar.c) {
            zVar.f4088f.f(Lifecycle.Event.ON_STOP);
            zVar.f4086d = true;
        }
    }
}
