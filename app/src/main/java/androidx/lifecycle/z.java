package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;

/* compiled from: ProcessLifecycleOwner.kt */
/* loaded from: classes.dex */
public final class z implements p {

    /* renamed from: i  reason: collision with root package name */
    public static final z f4083i = new z();

    /* renamed from: a  reason: collision with root package name */
    public int f4084a;

    /* renamed from: b  reason: collision with root package name */
    public int f4085b;

    /* renamed from: e  reason: collision with root package name */
    public Handler f4087e;
    public boolean c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4086d = true;

    /* renamed from: f  reason: collision with root package name */
    public final q f4088f = new q(this);

    /* renamed from: g  reason: collision with root package name */
    public final androidx.activity.b f4089g = new androidx.activity.b(this, 5);

    /* renamed from: h  reason: collision with root package name */
    public final b f4090h = new b();

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.g.e(activity, "activity");
            kotlin.jvm.internal.g.e(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    public final void a() {
        int i10 = this.f4085b + 1;
        this.f4085b = i10;
        if (i10 == 1) {
            if (this.c) {
                this.f4088f.f(Lifecycle.Event.ON_RESUME);
                this.c = false;
                return;
            }
            Handler handler = this.f4087e;
            kotlin.jvm.internal.g.b(handler);
            handler.removeCallbacks(this.f4089g);
        }
    }

    @Override // androidx.lifecycle.p
    public final Lifecycle getLifecycle() {
        return this.f4088f;
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    /* loaded from: classes.dex */
    public static final class b implements b0.a {
        public b() {
        }

        @Override // androidx.lifecycle.b0.a
        public final void onResume() {
            z.this.a();
        }

        @Override // androidx.lifecycle.b0.a
        public final void onStart() {
            z zVar = z.this;
            int i10 = zVar.f4084a + 1;
            zVar.f4084a = i10;
            if (i10 == 1 && zVar.f4086d) {
                zVar.f4088f.f(Lifecycle.Event.ON_START);
                zVar.f4086d = false;
            }
        }

        @Override // androidx.lifecycle.b0.a
        public final void onCreate() {
        }
    }
}
