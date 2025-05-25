package pdf.pdfreader.viewer.editor.free.ui.myview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import ro.d;

/* loaded from: classes3.dex */
public class InterceptTouchRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public d f28095a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f28096b;

    public InterceptTouchRelativeLayout(Context context) {
        super(context);
        this.f28096b = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d dVar = this.f28095a;
        if (dVar != null) {
            dVar.g(motionEvent);
        }
        if (this.f28096b) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public void setDispatchTouchEvent(boolean z10) {
        this.f28096b = z10;
    }

    public void setTopTouchListener(d dVar) {
        this.f28095a = dVar;
    }

    public InterceptTouchRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28096b = true;
    }

    public InterceptTouchRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f28096b = true;
    }
}
