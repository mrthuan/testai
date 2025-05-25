package w8;

import android.view.View;
import w8.i;
import y0.f;

/* compiled from: NavigationMenuPresenter.java */
/* loaded from: classes2.dex */
public final class j extends x0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f31039d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f31040e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i.c f31041f;

    public j(i.c cVar, int i10, boolean z10) {
        this.f31041f = cVar;
        this.f31039d = i10;
        this.f31040e = z10;
    }

    @Override // x0.a
    public final void d(View view, y0.f fVar) {
        i iVar;
        this.f31416a.onInitializeAccessibilityNodeInfo(view, fVar.f31951a);
        int i10 = this.f31039d;
        int i11 = 0;
        int i12 = i10;
        while (true) {
            iVar = i.this;
            if (i11 >= i10) {
                break;
            }
            if (iVar.f31007e.getItemViewType(i11) == 2) {
                i12--;
            }
            i11++;
        }
        if (iVar.f31005b.getChildCount() == 0) {
            i12--;
        }
        fVar.i(f.c.a(i12, 1, 1, this.f31040e, view.isSelected(), 1));
    }
}
