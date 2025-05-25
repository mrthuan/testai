package mo;

import android.text.TextUtils;
import androidx.lifecycle.x;
import pdf.pdfreader.viewer.editor.free.ui.adapter.d;
import pdf.pdfreader.viewer.editor.free.ui.frag.n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22152a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f22153b;

    public /* synthetic */ b(c cVar, int i10) {
        this.f22152a = i10;
        this.f22153b = cVar;
    }

    @Override // androidx.lifecycle.x
    public final void m(Object obj) {
        d dVar;
        int i10 = this.f22152a;
        c cVar = this.f22153b;
        switch (i10) {
            case 0:
                nl.a aVar = (nl.a) obj;
                if (aVar != null) {
                    if (TextUtils.equals(cVar.f22155d0, aVar.f22580b)) {
                        cVar.K0(aVar.f22579a, aVar.c);
                        return;
                    }
                    return;
                }
                int i11 = c.f22154z0;
                cVar.getClass();
                return;
            default:
                n nVar = (n) cVar;
                Boolean bool = (Boolean) obj;
                int i12 = n.f28058c1;
                nVar.getClass();
                if (bool != null && bool.booleanValue() && (dVar = nVar.E0) != null && dVar.getItemCount() > 0) {
                    nVar.E0.notifyItemChanged(0);
                    return;
                }
                return;
        }
    }
}
