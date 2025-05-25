package pdf.pdfreader.viewer.editor.free.feature.scan.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ea.a;
import kotlin.jvm.internal.g;
import nn.c;

/* compiled from: SwipeScrollView.kt */
/* loaded from: classes3.dex */
public class SwipeScrollView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public float f25874a;

    /* renamed from: b  reason: collision with root package name */
    public float f25875b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f25876d;

    /* renamed from: e  reason: collision with root package name */
    public c f25877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.e(context, a.p("IW8fdCp4dA==", "CxBqOGyo"));
        this.c = 50;
    }

    public final c getOnSwipeListener() {
        return this.f25877e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r0 != 3) goto L34;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L73
            int r0 = r6.getAction()
            r1 = 0
            if (r0 == 0) goto L65
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L5e
            r4 = 2
            if (r0 == r4) goto L14
            r3 = 3
            if (r0 == r3) goto L5e
            goto L73
        L14:
            float r0 = r6.getX()
            float r1 = r5.f25874a
            float r0 = r0 - r1
            float r1 = r6.getY()
            float r4 = r5.f25875b
            float r1 = r1 - r4
            float r4 = java.lang.Math.abs(r0)
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L59
            float r1 = java.lang.Math.abs(r0)
            int r4 = r5.c
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L59
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L4b
            boolean r6 = r5.f25876d
            if (r6 != 0) goto L58
            nn.c r6 = r5.f25877e
            if (r6 == 0) goto L48
            r6.b()
        L48:
            r5.f25876d = r3
            goto L58
        L4b:
            boolean r6 = r5.f25876d
            if (r6 != 0) goto L58
            nn.c r6 = r5.f25877e
            if (r6 == 0) goto L56
            r6.a()
        L56:
            r5.f25876d = r3
        L58:
            return r3
        L59:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        L5e:
            r5.f25874a = r2
            r5.f25875b = r2
            r5.f25876d = r1
            goto L73
        L65:
            float r0 = r6.getX()
            r5.f25874a = r0
            float r0 = r6.getY()
            r5.f25875b = r0
            r5.f25876d = r1
        L73:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.widget.SwipeScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnSwipeListener(c cVar) {
        this.f25877e = cVar;
    }
}
