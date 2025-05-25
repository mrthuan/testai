package pdf.pdfreader.viewer.editor.free.ui.myview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class TouchMonitorRecyclerView extends RecyclerView {
    public float D0;
    public a E0;
    public int F0;
    public float G0;

    /* loaded from: classes3.dex */
    public interface a {
    }

    public TouchMonitorRecyclerView(Context context) {
        super(context);
        this.D0 = 0.0f;
        this.F0 = 0;
        this.G0 = 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L19
            if (r0 == r2) goto L12
            if (r0 == r1) goto L21
            r1 = 3
            if (r0 == r1) goto L12
            goto L9a
        L12:
            r6.G0 = r3
            r0 = 0
            r6.F0 = r0
            goto L9a
        L19:
            float r0 = r7.getRawY()
            r6.D0 = r0
            r6.G0 = r3
        L21:
            float r0 = r6.G0
            float r4 = r7.getRawY()
            float r5 = r6.D0
            float r4 = r4 - r5
            float r4 = r4 + r0
            r6.G0 = r4
            int r0 = r6.computeVerticalScrollOffset()
            if (r0 != 0) goto L49
            float r0 = r7.getRawY()
            float r4 = r6.D0
            float r0 = r0 - r4
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L49
            float r0 = r6.G0
            float r0 = java.lang.Math.abs(r0)
            r4 = 20
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
        L49:
            float r0 = r7.getRawY()
            float r4 = r6.D0
            float r0 = r0 - r4
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L79
            boolean r0 = r6.canScrollVertically(r2)
            if (r0 != 0) goto L79
            pdf.pdfreader.viewer.editor.free.ui.myview.TouchMonitorRecyclerView$a r0 = r6.E0
            if (r0 == 0) goto L79
            pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity$f r0 = (pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.f) r0
            pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity r0 = pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.this
            android.view.ViewGroup r4 = r0.f26699x
            if (r4 == 0) goto L79
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.f3487a
            pdf.pdfreader.viewer.editor.free.ui.widget.behavior.HideBottomViewOnScrollBehavior r4 = (pdf.pdfreader.viewer.editor.free.ui.widget.behavior.HideBottomViewOnScrollBehavior) r4
            if (r4 == 0) goto L79
            android.view.ViewGroup r0 = r0.f26699x
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.t(r0)
        L79:
            float r0 = r7.getRawY()
            float r4 = r6.D0
            float r0 = r0 - r4
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L87
            r6.F0 = r1
            goto L94
        L87:
            float r0 = r7.getRawY()
            float r1 = r6.D0
            float r0 = r0 - r1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L94
            r6.F0 = r2
        L94:
            float r0 = r7.getRawY()
            r6.D0 = r0
        L9a:
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.myview.TouchMonitorRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getDistance() {
        return this.G0;
    }

    public int getTouchModel() {
        return this.F0;
    }

    public void setScrollOnTouchListener(a aVar) {
        this.E0 = aVar;
    }

    public TouchMonitorRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D0 = 0.0f;
        this.F0 = 0;
        this.G0 = 0.0f;
    }

    public TouchMonitorRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.D0 = 0.0f;
        this.F0 = 0;
        this.G0 = 0.0f;
    }
}
