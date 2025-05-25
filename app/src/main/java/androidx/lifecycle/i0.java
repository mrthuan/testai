package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* compiled from: ServiceLifecycleDispatcher.kt */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final q f4052a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f4053b;
    public a c;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final q f4054a;

        /* renamed from: b  reason: collision with root package name */
        public final Lifecycle.Event f4055b;
        public boolean c;

        public a(q registry, Lifecycle.Event event) {
            kotlin.jvm.internal.g.e(registry, "registry");
            kotlin.jvm.internal.g.e(event, "event");
            this.f4054a = registry;
            this.f4055b = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.c) {
                this.f4054a.f(this.f4055b);
                this.c = true;
            }
        }
    }

    public i0(p provider) {
        kotlin.jvm.internal.g.e(provider, "provider");
        this.f4052a = new q(provider);
        this.f4053b = new Handler();
    }

    public final void a(Lifecycle.Event event) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f4052a, event);
        this.c = aVar2;
        this.f4053b.postAtFrontOfQueue(aVar2);
    }
}
