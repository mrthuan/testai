package pdf.pdfreader.viewer.editor.free.ui.myview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import ea.a;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import ro.d;

/* compiled from: InterceptRecyclerView.kt */
/* loaded from: classes3.dex */
public final class InterceptRecyclerView extends RecyclerView {
    public d D0;
    public boolean E0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptRecyclerView(Context context) {
        this(context, null, 6, 0);
        g.e(context, a.p("UG8ldBZ4dA==", "9lebJ58X"));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d dVar = this.D0;
        if (dVar != null) {
            dVar.g(motionEvent);
        }
        if (this.E0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setDispatchTouchEvent(boolean z10) {
        this.E0 = z10;
    }

    public final void setTopTouchListener(d dVar) {
        this.D0 = dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        g.e(context, a.p("UG8ldBZ4dA==", "wp5Ko1OM"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterceptRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, a.p("LG9fdBx4dA==", "inEPvEGt"));
        this.E0 = true;
    }

    public /* synthetic */ InterceptRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R.attr.recyclerViewStyle : 0);
    }
}
