package e3;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* compiled from: LottieAnimationView.java */
/* loaded from: classes.dex */
public final class c implements Callable<p<e>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16337a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f16338b;

    public c(LottieAnimationView lottieAnimationView, int i10) {
        this.f16338b = lottieAnimationView;
        this.f16337a = i10;
    }

    @Override // java.util.concurrent.Callable
    public final p<e> call() {
        LottieAnimationView lottieAnimationView = this.f16338b;
        boolean z10 = lottieAnimationView.f6026p;
        int i10 = this.f16337a;
        if (z10) {
            Context context = lottieAnimationView.getContext();
            return f.e(context, i10, f.h(context, i10));
        }
        return f.e(lottieAnimationView.getContext(), i10, null);
    }
}
