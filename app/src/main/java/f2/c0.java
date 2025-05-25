package f2;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import f2.k;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public final class c0 extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f17003a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f17004b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d0 f17005d;

    public c0(d0 d0Var, ViewGroup viewGroup, View view, View view2) {
        this.f17005d = d0Var;
        this.f17003a = viewGroup;
        this.f17004b = view;
        this.c = view2;
    }

    @Override // f2.n, f2.k.d
    public final void a() {
        this.f17003a.getOverlay().remove(this.f17004b);
    }

    @Override // f2.k.d
    public final void c(k kVar) {
        this.c.setTag(R.id.save_overlay_view, null);
        this.f17003a.getOverlay().remove(this.f17004b);
        kVar.x(this);
    }

    @Override // f2.n, f2.k.d
    public final void e() {
        View view = this.f17004b;
        if (view.getParent() == null) {
            this.f17003a.getOverlay().add(view);
            return;
        }
        d0 d0Var = this.f17005d;
        ArrayList<Animator> arrayList = d0Var.f17047m;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            arrayList.get(size).cancel();
        }
        ArrayList<k.d> arrayList2 = d0Var.f17051q;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) d0Var.f17051q.clone();
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((k.d) arrayList3.get(i10)).b();
            }
        }
    }
}
