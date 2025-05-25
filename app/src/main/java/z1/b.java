package z1;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.savedstate.Recreator;
import androidx.savedstate.a;
import java.util.Map;
import kotlin.jvm.internal.g;
import s.b;

/* compiled from: SavedStateRegistryController.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f32216a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.savedstate.a f32217b = new androidx.savedstate.a();
    public boolean c;

    public b(c cVar) {
        this.f32216a = cVar;
    }

    public final void a() {
        boolean z10;
        c cVar = this.f32216a;
        Lifecycle lifecycle = cVar.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.INITIALIZED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            lifecycle.a(new Recreator(cVar));
            final androidx.savedstate.a aVar = this.f32217b;
            aVar.getClass();
            if (!aVar.f4661b) {
                lifecycle.a(new n() { // from class: z1.a
                    @Override // androidx.lifecycle.n
                    public final void d(p pVar, Lifecycle.Event event) {
                        androidx.savedstate.a this$0 = androidx.savedstate.a.this;
                        g.e(this$0, "this$0");
                        if (event == Lifecycle.Event.ON_START) {
                            this$0.f4664f = true;
                        } else if (event == Lifecycle.Event.ON_STOP) {
                            this$0.f4664f = false;
                        }
                    }
                });
                aVar.f4661b = true;
                this.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.c) {
            a();
        }
        Lifecycle lifecycle = this.f32216a.getLifecycle();
        if (!lifecycle.b().isAtLeast(Lifecycle.State.STARTED)) {
            androidx.savedstate.a aVar = this.f32217b;
            if (aVar.f4661b) {
                if (!aVar.f4662d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    aVar.c = bundle2;
                    aVar.f4662d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void c(Bundle outBundle) {
        g.e(outBundle, "outBundle");
        androidx.savedstate.a aVar = this.f32217b;
        aVar.getClass();
        Bundle bundle = new Bundle();
        Bundle bundle2 = aVar.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        s.b<String, a.b> bVar = aVar.f4660a;
        bVar.getClass();
        b.d dVar = new b.d();
        bVar.c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        if (!bundle.isEmpty()) {
            outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
    }
}
