package op;

import android.animation.ValueAnimator;
import pdf.pdfreader.viewer.editor.free.widget.ticker.TickerView;

/* compiled from: TickerView.java */
/* loaded from: classes3.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TickerView f23552a;

    public a(TickerView tickerView) {
        this.f23552a = tickerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TickerView tickerView = this.f23552a;
        tickerView.f28873d.c(valueAnimator.getAnimatedFraction());
        tickerView.a();
        tickerView.invalidate();
    }
}
