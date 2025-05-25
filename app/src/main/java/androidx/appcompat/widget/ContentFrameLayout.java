package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public TypedValue f2292a;

    /* renamed from: b  reason: collision with root package name */
    public TypedValue f2293b;
    public TypedValue c;

    /* renamed from: d  reason: collision with root package name */
    public TypedValue f2294d;

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f2295e;

    /* renamed from: f  reason: collision with root package name */
    public TypedValue f2296f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f2297g;

    /* renamed from: h  reason: collision with root package name */
    public a f2298h;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2295e == null) {
            this.f2295e = new TypedValue();
        }
        return this.f2295e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2296f == null) {
            this.f2296f = new TypedValue();
        }
        return this.f2296f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return this.c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2294d == null) {
            this.f2294d = new TypedValue();
        }
        return this.f2294d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2292a == null) {
            this.f2292a = new TypedValue();
        }
        return this.f2292a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2293b == null) {
            this.f2293b = new TypedValue();
        }
        return this.f2293b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f2298h;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f2298h;
        if (aVar != null) {
            l.f fVar = ((l.h) aVar).f20351a;
            w wVar = fVar.f20310r;
            if (wVar != null) {
                wVar.i();
            }
            if (fVar.f20315w != null) {
                fVar.f20304l.getDecorView().removeCallbacks(fVar.f20316x);
                if (fVar.f20315w.isShowing()) {
                    try {
                        fVar.f20315w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                fVar.f20315w = null;
            }
            x0.n0 n0Var = fVar.f20317y;
            if (n0Var != null) {
                n0Var.b();
            }
            androidx.appcompat.view.menu.h hVar = fVar.T(0).f20340h;
            if (hVar != null) {
                hVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f2298h = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2297g = new Rect();
    }
}
