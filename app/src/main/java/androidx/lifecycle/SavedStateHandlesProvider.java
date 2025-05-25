package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class SavedStateHandlesProvider implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.savedstate.a f4018a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4019b;
    public Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public final tf.c f4020d;

    public SavedStateHandlesProvider(androidx.savedstate.a savedStateRegistry, final p0 viewModelStoreOwner) {
        kotlin.jvm.internal.g.e(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.g.e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f4018a = savedStateRegistry;
        this.f4020d = kotlin.a.a(new cg.a<f0>() { // from class: androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final f0 invoke() {
                return SavedStateHandleSupport.c(p0.this);
            }
        });
    }

    @Override // androidx.savedstate.a.b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((f0) this.f4020d.getValue()).f4045d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((e0) entry.getValue()).f4042e.a();
            if (!kotlin.jvm.internal.g.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f4019b = false;
        return bundle;
    }
}
