package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ao.d0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i2.a;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.preview.GraffitiBottomSheetView;

/* loaded from: classes3.dex */
public abstract class BaseBottomSheetView<T extends i2.a> extends CoordinatorLayout {
    public b A;

    /* renamed from: y  reason: collision with root package name */
    public T f28172y;

    /* renamed from: z  reason: collision with root package name */
    public BottomSheetBehavior<View> f28173z;

    /* loaded from: classes3.dex */
    public interface b {
    }

    public BaseBottomSheetView(Context context) {
        super(context);
        G(context);
    }

    public final void C() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.f28173z;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.C(true);
        this.f28173z.E(5);
    }

    public abstract T D(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void E();

    public abstract void F(Context context);

    public final void G(Context context) {
        T D = D(LayoutInflater.from(context), this);
        this.f28172y = D;
        ((CoordinatorLayout.f) D.b().getLayoutParams()).b(new BottomSheetBehavior());
        BottomSheetBehavior<View> x4 = BottomSheetBehavior.x(this.f28172y.b());
        this.f28173z = x4;
        x4.D(0);
        BottomSheetBehavior<View> bottomSheetBehavior = this.f28173z;
        bottomSheetBehavior.J = true;
        bottomSheetBehavior.C(true);
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.f28173z;
        a aVar = new a();
        ArrayList<BottomSheetBehavior.c> arrayList = bottomSheetBehavior2.X;
        if (!arrayList.contains(aVar)) {
            arrayList.add(aVar);
        }
        E();
        F(context);
    }

    public final boolean H() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void I() {
        setVisibility(0);
        post(new pdf.pdfreader.viewer.editor.free.ui.act.tools.j(this, 5));
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
    }

    public void setOnSheetViewStateChangedListener(b bVar) {
        this.A = bVar;
    }

    public BaseBottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        G(context);
    }

    public BaseBottomSheetView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        G(context);
    }

    /* loaded from: classes3.dex */
    public class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void c(View view, int i10) {
            b bVar;
            View view2;
            BaseBottomSheetView baseBottomSheetView = BaseBottomSheetView.this;
            if (i10 == 5) {
                baseBottomSheetView.setVisibility(8);
                b bVar2 = baseBottomSheetView.A;
                if (bVar2 != null && (view2 = ((d0) bVar2).f5027a.F0) != null) {
                    view2.setVisibility(8);
                }
            } else if (i10 == 3 && (bVar = baseBottomSheetView.A) != null) {
                ReaderPreviewActivity readerPreviewActivity = ((d0) bVar).f5027a;
                View view3 = readerPreviewActivity.F0;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                if (readerPreviewActivity.f26293y5) {
                    readerPreviewActivity.f26293y5 = false;
                    GraffitiBottomSheetView graffitiBottomSheetView = readerPreviewActivity.f26282x0;
                    zl.b.c.getClass();
                    graffitiBottomSheetView.K(zl.b.h());
                }
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view) {
        }
    }
}
