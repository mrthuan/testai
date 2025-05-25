package dc;

import com.google.android.material.appbar.AppBarLayout;

/* compiled from: DesignUtil.java */
/* loaded from: classes2.dex */
public final class a implements AppBarLayout.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ bc.a f16185a;

    public a(ec.a aVar) {
        this.f16185a = aVar;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void a(AppBarLayout appBarLayout, int i10) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (appBarLayout.getTotalScrollRange() + i10 > 0) {
            z11 = false;
        }
        ec.a aVar = (ec.a) this.f16185a;
        aVar.f16556g = z10;
        aVar.f16557h = z11;
    }
}
