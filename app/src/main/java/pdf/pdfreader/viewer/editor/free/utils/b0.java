package pdf.pdfreader.viewer.editor.free.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ListSpaceDecoration.java */
/* loaded from: classes3.dex */
public final class b0 extends RecyclerView.l {

    /* renamed from: d  reason: collision with root package name */
    public final int f28551d;
    public final boolean c = true;

    /* renamed from: a  reason: collision with root package name */
    public final int f28549a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f28550b = 0;

    public b0(int i10) {
        this.f28551d = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        recyclerView.getClass();
        int V = RecyclerView.V(view);
        boolean z10 = this.c;
        int i10 = this.f28550b;
        int i11 = this.f28549a;
        int i12 = this.f28551d;
        if (z10) {
            if (V == 0) {
                rect.top = i11;
            } else {
                rect.top = i12;
            }
            if (V == recyclerView.getAdapter().getItemCount() - 1) {
                rect.bottom = i10;
                return;
            }
            return;
        }
        if (V == 0) {
            rect.left = i11;
        } else {
            rect.left = i12;
        }
        if (V == recyclerView.getAdapter().getItemCount() - 1) {
            rect.right = i10;
        }
    }

    public b0(int i10, int i11) {
        this.f28551d = i10;
    }
}
