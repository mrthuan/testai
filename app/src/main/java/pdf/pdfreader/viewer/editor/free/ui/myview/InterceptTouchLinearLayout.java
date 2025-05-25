package pdf.pdfreader.viewer.editor.free.ui.myview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import ro.d;

/* loaded from: classes3.dex */
public class InterceptTouchLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public d f28093a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f28094b;

    public InterceptTouchLinearLayout(Context context) {
        super(context);
        this.f28094b = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d dVar = this.f28093a;
        if (dVar != null) {
            dVar.g(motionEvent);
        }
        if (this.f28094b) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public void setDispatchTouchEvent(boolean z10) {
        this.f28094b = z10;
    }

    public void setTopTouchListener(d dVar) {
        this.f28093a = dVar;
    }

    public InterceptTouchLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28094b = true;
    }

    public InterceptTouchLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f28094b = true;
    }
}
