package pdf.pdfreader.viewer.editor.free.widget.intercept;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import ea.a;
import kotlin.jvm.internal.g;

/* compiled from: InterceptTouchConstraintLayout.kt */
/* loaded from: classes3.dex */
public final class InterceptTouchConstraintLayout extends ConstraintLayout {

    /* renamed from: q  reason: collision with root package name */
    public final boolean f28817q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptTouchConstraintLayout(Context context) {
        this(context, null, 0, 14);
        g.e(context, a.p("GW8XdBR4dA==", "JnzyqjJU"));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f28817q) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptTouchConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        g.e(context, a.p("LG9fdBx4dA==", "mnTQT8XY"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptTouchConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        g.e(context, a.p("Jm8cdAJ4dA==", "jHErgkZr"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InterceptTouchConstraintLayout(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
        /*
            r2 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            r6 = r6 & 4
            r0 = 0
            if (r6 == 0) goto Lb
            r5 = r0
        Lb:
            java.lang.String r6 = "LG9fdBx4dA=="
            java.lang.String r1 = "8gRYz3Kl"
            java.lang.String r6 = ea.a.p(r6, r1)
            kotlin.jvm.internal.g.e(r3, r6)
            r2.<init>(r3, r4, r5, r0)
            r3 = 1
            r2.f28817q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.widget.intercept.InterceptTouchConstraintLayout.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final void setDispatchTouchListener(kp.a aVar) {
    }
}
