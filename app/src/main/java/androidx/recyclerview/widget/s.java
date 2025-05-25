package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import java.util.ArrayList;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r.f f4597a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f4598b;

    public s(r rVar, r.f fVar, int i10) {
        this.f4598b = rVar;
        this.f4597a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.f4598b;
        RecyclerView recyclerView = rVar.f4567r;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            r.f fVar = this.f4597a;
            if (!fVar.f4594k) {
                RecyclerView.b0 b0Var = fVar.f4588e;
                if (b0Var.getAbsoluteAdapterPosition() != -1) {
                    RecyclerView.j itemAnimator = rVar.f4567r.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList = rVar.f4565p;
                        int size = arrayList.size();
                        boolean z10 = false;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                break;
                            } else if (!((r.f) arrayList.get(i10)).f4595l) {
                                z10 = true;
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (!z10) {
                            rVar.f4562m.h(b0Var);
                            return;
                        }
                    }
                    rVar.f4567r.post(this);
                }
            }
        }
    }
}
