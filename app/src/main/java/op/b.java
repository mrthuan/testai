package op;

import android.view.animation.AccelerateDecelerateInterpolator;
import pdf.pdfreader.viewer.editor.free.widget.ticker.TickerView;

/* compiled from: TickerView.java */
/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TickerView f23553a;

    public b(TickerView tickerView) {
        this.f23553a = tickerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = TickerView.f28870u;
        this.f23553a.e();
    }
}
