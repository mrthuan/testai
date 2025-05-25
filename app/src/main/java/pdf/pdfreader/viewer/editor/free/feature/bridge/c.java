package pdf.pdfreader.viewer.editor.free.feature.bridge;

import androidx.lifecycle.j0;
import androidx.lifecycle.w;

/* compiled from: SplashLoadingViewModel.kt */
/* loaded from: classes3.dex */
public final class c extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public final w<Boolean> f24975d;

    /* renamed from: e  reason: collision with root package name */
    public final w<Boolean> f24976e;

    /* renamed from: f  reason: collision with root package name */
    public final w<Boolean> f24977f;

    /* renamed from: g  reason: collision with root package name */
    public final w<Boolean> f24978g;

    public c() {
        w<Boolean> wVar = new w<>();
        this.f24975d = wVar;
        this.f24976e = wVar;
        w<Boolean> wVar2 = new w<>();
        this.f24977f = wVar2;
        this.f24978g = wVar2;
        new w();
    }

    public final boolean d() {
        Boolean d10 = this.f24977f.d();
        if (d10 == null) {
            return false;
        }
        return d10.booleanValue();
    }

    public final void e(boolean z10) {
        this.f24975d.j(Boolean.valueOf(z10));
    }

    @Override // androidx.lifecycle.j0
    public final void b() {
    }
}
