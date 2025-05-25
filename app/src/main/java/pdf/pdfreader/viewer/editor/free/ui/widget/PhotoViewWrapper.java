package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* compiled from: PhotoViewWrapper.kt */
/* loaded from: classes3.dex */
public final class PhotoViewWrapper extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f28271a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoViewWrapper(Context context) {
        this(context, null, 0, 14);
        kotlin.jvm.internal.g.e(context, ea.a.p("VW8MdFZ4dA==", "q36b3z3B"));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean z10;
        kotlin.jvm.internal.g.e(ev, "ev");
        boolean z11 = true;
        if (ev.getPointerCount() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            if (!this.f28271a && !z10) {
                z11 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z11);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        this.f28271a = z10;
        if (z10 && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoViewWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "FaOAzgl9"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoViewWrapper(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "Bi4SYHsG"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PhotoViewWrapper(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
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
            java.lang.String r6 = "UG8ldBZ4dA=="
            java.lang.String r1 = "59m6WP26"
            java.lang.String r6 = ea.a.p(r6, r1)
            kotlin.jvm.internal.g.e(r3, r6)
            r2.<init>(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.PhotoViewWrapper.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
