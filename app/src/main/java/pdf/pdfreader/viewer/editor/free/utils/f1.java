package pdf.pdfreader.viewer.editor.free.utils;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SpacesItemDecoration.java */
/* loaded from: classes3.dex */
public final class f1 extends RecyclerView.l {

    /* renamed from: b  reason: collision with root package name */
    public final int f28696b;

    /* renamed from: a  reason: collision with root package name */
    public final int f28695a = 0;
    public final int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f28697d = 0;

    public f1(int i10) {
        this.f28696b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        super.d(rect, view, recyclerView, yVar);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int i10 = linearLayoutManager.f4184p;
        int i11 = this.c;
        int i12 = this.f28697d;
        int i13 = this.f28696b;
        int i14 = this.f28695a;
        if (i10 == 1) {
            if (RecyclerView.V(view) == 0 && i11 != 0) {
                rect.top = i11 + i13;
            }
            if (RecyclerView.V(view) == linearLayoutManager.M() - 1 && i12 != 0) {
                rect.bottom = i12 + i13;
            } else {
                rect.bottom = i13;
            }
            rect.left = i14;
            rect.right = i14;
            return;
        }
        if (i12 != 0 && RecyclerView.V(view) == linearLayoutManager.M() - 1) {
            rect.right = i12 + i14;
        } else if (RecyclerView.V(view) == linearLayoutManager.M() - 1) {
            rect.right = i14;
        }
        if (i11 != 0 && RecyclerView.V(view) == 0) {
            rect.left = i14 + i11;
        } else {
            rect.left = i14;
        }
        rect.top = i13;
        rect.bottom = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e(Canvas canvas, RecyclerView recyclerView) {
    }
}
