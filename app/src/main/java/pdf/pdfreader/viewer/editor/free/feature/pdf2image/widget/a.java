package pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;

/* compiled from: NoLastDividerItemDecoration.java */
/* loaded from: classes3.dex */
public final class a extends o {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        recyclerView.getClass();
        if (RecyclerView.V(view) < yVar.b() - 1) {
            Drawable drawable = this.f4507a;
            if (drawable == null) {
                rect.set(0, 0, 0, 0);
                return;
            } else if (this.f4508b == 1) {
                rect.set(0, 0, 0, drawable.getIntrinsicHeight());
                return;
            } else {
                rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
                return;
            }
        }
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i10;
        int width;
        int i11;
        if (recyclerView.getLayoutManager() != null && this.f4507a != null) {
            int i12 = this.f4508b;
            Rect rect = this.c;
            int i13 = 0;
            if (i12 == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i11 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i11, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i11 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i13 < childCount) {
                    View childAt = recyclerView.getChildAt(i13);
                    RecyclerView.Y(rect, childAt);
                    int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                    this.f4507a.setBounds(i11, round - this.f4507a.getIntrinsicHeight(), width, round);
                    this.f4507a.draw(canvas);
                    i13++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i10 = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i10, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                i10 = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i13 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i13);
                recyclerView.getLayoutManager().L(rect, childAt2);
                int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
                this.f4507a.setBounds(round2 - this.f4507a.getIntrinsicWidth(), i10, round2, height);
                this.f4507a.draw(canvas);
                i13++;
            }
            canvas.restore();
        }
    }
}
