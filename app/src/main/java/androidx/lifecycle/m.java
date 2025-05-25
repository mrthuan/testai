package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.b0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f4063a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    /* loaded from: classes.dex */
    public static final class a extends f {
        @Override // androidx.lifecycle.f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.g.e(activity, "activity");
            int i10 = b0.f4028b;
            b0.b.b(activity);
        }
    }
}
