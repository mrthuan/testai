package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f1788a;

    /* renamed from: b  reason: collision with root package name */
    public final kotlin.collections.e<n> f1789b = new kotlin.collections.e<>();
    public final cg.a<tf.d> c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f1790d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f1791e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1792f;

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: classes.dex */
    public final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.n, androidx.activity.a {

        /* renamed from: a  reason: collision with root package name */
        public final Lifecycle f1793a;

        /* renamed from: b  reason: collision with root package name */
        public final n f1794b;
        public b c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f1795d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, n onBackPressedCallback) {
            kotlin.jvm.internal.g.e(onBackPressedCallback, "onBackPressedCallback");
            this.f1795d = onBackPressedDispatcher;
            this.f1793a = lifecycle;
            this.f1794b = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.activity.a
        public final void cancel() {
            this.f1793a.c(this);
            n nVar = this.f1794b;
            nVar.getClass();
            nVar.f1821b.remove(this);
            b bVar = this.c;
            if (bVar != null) {
                bVar.cancel();
            }
            this.c = null;
        }

        @Override // androidx.lifecycle.n
        public final void d(androidx.lifecycle.p pVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.c = this.f1795d.b(this.f1794b);
            } else if (event == Lifecycle.Event.ON_STOP) {
                b bVar = this.c;
                if (bVar != null) {
                    bVar.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1796a = new a();

        public final OnBackInvokedCallback a(cg.a<tf.d> onBackInvoked) {
            kotlin.jvm.internal.g.e(onBackInvoked, "onBackInvoked");
            return new o(onBackInvoked, 0);
        }

        public final void b(Object dispatcher, int i10, Object callback) {
            kotlin.jvm.internal.g.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.g.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
        }

        public final void c(Object dispatcher, Object callback) {
            kotlin.jvm.internal.g.e(dispatcher, "dispatcher");
            kotlin.jvm.internal.g.e(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: classes.dex */
    public final class b implements androidx.activity.a {

        /* renamed from: a  reason: collision with root package name */
        public final n f1797a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f1798b;

        public b(OnBackPressedDispatcher onBackPressedDispatcher, n onBackPressedCallback) {
            kotlin.jvm.internal.g.e(onBackPressedCallback, "onBackPressedCallback");
            this.f1798b = onBackPressedDispatcher;
            this.f1797a = onBackPressedCallback;
        }

        @Override // androidx.activity.a
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f1798b;
            kotlin.collections.e<n> eVar = onBackPressedDispatcher.f1789b;
            n nVar = this.f1797a;
            eVar.remove(nVar);
            nVar.getClass();
            nVar.f1821b.remove(this);
            if (Build.VERSION.SDK_INT >= 33) {
                nVar.c = null;
                onBackPressedDispatcher.d();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f1788a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.c = new cg.a<tf.d>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.d();
                }
            };
            this.f1790d = a.f1796a.a(new cg.a<tf.d>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.c();
                }
            });
        }
    }

    public final void a(androidx.lifecycle.p owner, n onBackPressedCallback) {
        kotlin.jvm.internal.g.e(owner, "owner");
        kotlin.jvm.internal.g.e(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.f1821b.add(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        if (Build.VERSION.SDK_INT >= 33) {
            d();
            onBackPressedCallback.c = this.c;
        }
    }

    public final b b(n onBackPressedCallback) {
        kotlin.jvm.internal.g.e(onBackPressedCallback, "onBackPressedCallback");
        this.f1789b.addLast(onBackPressedCallback);
        b bVar = new b(this, onBackPressedCallback);
        onBackPressedCallback.f1821b.add(bVar);
        if (Build.VERSION.SDK_INT >= 33) {
            d();
            onBackPressedCallback.c = this.c;
        }
        return bVar;
    }

    public final void c() {
        n nVar;
        kotlin.collections.e<n> eVar = this.f1789b;
        ListIterator<n> listIterator = eVar.listIterator(eVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                nVar = listIterator.previous();
                if (nVar.f1820a) {
                    break;
                }
            } else {
                nVar = null;
                break;
            }
        }
        n nVar2 = nVar;
        if (nVar2 != null) {
            nVar2.a();
            return;
        }
        Runnable runnable = this.f1788a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d() {
        boolean z10;
        OnBackInvokedCallback onBackInvokedCallback;
        kotlin.collections.e<n> eVar = this.f1789b;
        if (!(eVar instanceof Collection) || !eVar.isEmpty()) {
            Iterator<n> it = eVar.iterator();
            while (it.hasNext()) {
                if (it.next().f1820a) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1791e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f1790d) != null) {
            a aVar = a.f1796a;
            if (z10 && !this.f1792f) {
                aVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f1792f = true;
            } else if (!z10 && this.f1792f) {
                aVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f1792f = false;
            }
        }
    }
}
