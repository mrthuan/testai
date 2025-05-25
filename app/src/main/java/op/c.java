package op;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import pdf.pdfreader.viewer.editor.free.widget.ticker.TickerView;

/* compiled from: TickerView.java */
/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f23554a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TickerView f23555b;

    public c(TickerView tickerView, b bVar) {
        this.f23555b = tickerView;
        this.f23554a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TickerView tickerView = this.f23555b;
        tickerView.f28873d.b();
        tickerView.a();
        tickerView.invalidate();
        int i10 = Build.VERSION.SDK_INT;
        Runnable runnable = this.f23554a;
        if (i10 >= 26) {
            runnable.run();
        } else {
            tickerView.post(runnable);
        }
    }
}
