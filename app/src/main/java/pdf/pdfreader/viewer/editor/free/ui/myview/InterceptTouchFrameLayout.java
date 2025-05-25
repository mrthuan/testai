package pdf.pdfreader.viewer.editor.free.ui.myview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import ro.d;

/* loaded from: classes3.dex */
public class InterceptTouchFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public d f28091a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f28092b;

    public InterceptTouchFrameLayout(Context context) {
        super(context);
        this.f28092b = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d dVar = this.f28091a;
        if (dVar != null) {
            dVar.g(motionEvent);
        }
        if (this.f28092b) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public void setDispatchTouchEvent(boolean z10) {
        this.f28092b = z10;
    }

    public void setTopTouchListener(d dVar) {
        this.f28091a = dVar;
    }

    public InterceptTouchFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28092b = true;
    }

    public InterceptTouchFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f28092b = true;
    }
}
