package pdf.pdfreader.viewer.editor.free.widget.scroll;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import tf.c;

/* compiled from: AutoScrollRecyclerView.kt */
/* loaded from: classes3.dex */
public final class AutoScrollRecyclerView extends RecyclerView implements n {
    public int D0;
    public long E0;
    public boolean F0;
    public long G0;
    public boolean H0;
    public final c I0;
    public final a J0;

    /* compiled from: AutoScrollRecyclerView.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            boolean z11;
            AutoScrollRecyclerView autoScrollRecyclerView = AutoScrollRecyclerView.this;
            if (autoScrollRecyclerView.getScrollState() == 0) {
                RecyclerView.m layoutManager = autoScrollRecyclerView.getLayoutManager();
                if (layoutManager != null && layoutManager.q()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (autoScrollRecyclerView.canScrollVertically(1)) {
                        autoScrollRecyclerView.scrollBy(0, autoScrollRecyclerView.getScrollSpeed());
                    }
                } else {
                    RecyclerView.m layoutManager2 = autoScrollRecyclerView.getLayoutManager();
                    if (layoutManager2 != null && layoutManager2.p()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && autoScrollRecyclerView.canScrollHorizontally(1)) {
                        autoScrollRecyclerView.scrollBy(autoScrollRecyclerView.getScrollSpeed(), 0);
                    }
                }
            }
            autoScrollRecyclerView.getMainHandler().postDelayed(this, autoScrollRecyclerView.getScrollInterval());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoScrollRecyclerView(Context context) {
        this(context, null, 6, 0);
        g.e(context, ea.a.p("LG9ZdB14dA==", "FrO7x9Oi"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getMainHandler() {
        return (Handler) this.I0.getValue();
    }

    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        Lifecycle.Event event2 = Lifecycle.Event.ON_START;
        a aVar = this.J0;
        if (event == event2) {
            if (this.H0) {
                this.H0 = false;
                getMainHandler().postDelayed(aVar, this.G0);
                return;
            }
            getMainHandler().post(aVar);
        } else if (event == Lifecycle.Event.ON_STOP) {
            getMainHandler().removeCallbacks(aVar);
        }
    }

    public final boolean getInterceptTouch() {
        return this.F0;
    }

    public final long getScrollInterval() {
        return this.E0;
    }

    public final int getScrollSpeed() {
        return this.D0;
    }

    public final long getStartDelay() {
        return this.G0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.appcompat.app.c cVar;
        Lifecycle lifecycle;
        super.onAttachedToWindow();
        Context context = getContext();
        g.d(context, ea.a.p("UG8ldBZ4dA==", "vNh0Ynlc"));
        Activity c = kl.a.c(context);
        if (c instanceof androidx.appcompat.app.c) {
            cVar = (androidx.appcompat.app.c) c;
        } else {
            cVar = null;
        }
        if (cVar != null && (lifecycle = cVar.getLifecycle()) != null) {
            lifecycle.a(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.appcompat.app.c cVar;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        Context context = getContext();
        g.d(context, ea.a.p("LG9fdBx4dA==", "nxnRWoEv"));
        Activity c = kl.a.c(context);
        if (c instanceof androidx.appcompat.app.c) {
            cVar = (androidx.appcompat.app.c) c;
        } else {
            cVar = null;
        }
        if (cVar != null && (lifecycle = cVar.getLifecycle()) != null) {
            lifecycle.c(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.F0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.F0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setInterceptTouch(boolean z10) {
        this.F0 = z10;
    }

    public final void setScrollInterval(long j10) {
        this.E0 = j10;
    }

    public final void setScrollSpeed(int i10) {
        this.D0 = i10;
    }

    public final void setStartDelay(long j10) {
        this.G0 = j10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoScrollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        g.e(context, ea.a.p("LG9fdBx4dA==", "P1T2LPWO"));
    }

    public /* synthetic */ AutoScrollRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R.attr.recyclerViewStyle : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, ea.a.p("UG82dFx4dA==", "ym3X94uX"));
        this.D0 = (int) (((context.getResources().getDisplayMetrics().density * 1.0f) + 0.5f) / 2.0f);
        this.E0 = 16L;
        this.F0 = true;
        this.G0 = 2500L;
        this.H0 = true;
        this.I0 = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.widget.scroll.AutoScrollRecyclerView$mainHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        this.J0 = new a();
    }
}
