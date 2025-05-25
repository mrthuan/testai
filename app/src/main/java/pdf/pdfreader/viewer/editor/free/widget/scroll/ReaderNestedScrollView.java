package pdf.pdfreader.viewer.editor.free.widget.scroll;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import ea.a;
import kotlin.jvm.internal.g;

/* compiled from: ReaderNestedScrollView.kt */
/* loaded from: classes3.dex */
public class ReaderNestedScrollView extends NestedScrollView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderNestedScrollView(Context context) {
        super(context);
        g.e(context, a.p("LG9fdBx4dA==", "dVXI34e1"));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getBottomFadingEdgeStrength() {
        return super.getBottomFadingEdgeStrength();
    }

    public final lp.a getOnScrollChangedListener() {
        return null;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return super.getTopFadingEdgeStrength();
    }

    @Override // android.view.View
    public int getVerticalFadingEdgeLength() {
        return super.getVerticalFadingEdgeLength();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderNestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, a.p("LG9fdBx4dA==", "yuxiNgEJ"));
        g.e(attributeSet, a.p("LnRFcnM=", "YycAJnKF"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.e(context, a.p("Om8mdCF4dA==", "IEYHDob4"));
        g.e(attributeSet, a.p("LnRFcnM=", "pAfcYM6v"));
    }

    public final void setOnScrollChangedListener(lp.a aVar) {
    }
}
