package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: MaxHeightRecycleview.kt */
/* loaded from: classes3.dex */
public final class MaxHeightRecycleview extends RecyclerView {
    public float D0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxHeightRecycleview(Context context) {
        this(context, null);
        kotlin.jvm.internal.g.e(context, ea.a.p("K28kdCB4dA==", "2nHJEAYG"));
    }

    public final float getMaxHeight() {
        return this.D0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float f10 = this.D0;
        if (getMeasuredHeight() > f10) {
            setMeasuredDimension(i10, (int) f10);
        }
    }

    public final void setMaxHeight(float f10) {
        this.D0 = f10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxHeightRecycleview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "OGJGlYvc"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightRecycleview(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "bgSPClJL"));
        this.D0 = getResources().getDimension(R.dimen.cm_dp_200);
    }
}
