package e3;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: LottieAnimationView.java */
/* loaded from: classes.dex */
public final class d implements Callable<p<e>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f16339a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f16340b;

    public d(LottieAnimationView lottieAnimationView, String str) {
        this.f16340b = lottieAnimationView;
        this.f16339a = str;
    }

    @Override // java.util.concurrent.Callable
    public final p<e> call() {
        LottieAnimationView lottieAnimationView = this.f16340b;
        boolean z10 = lottieAnimationView.f6026p;
        String str = this.f16339a;
        if (z10) {
            Context context = lottieAnimationView.getContext();
            HashMap hashMap = f.f16355a;
            return f.b(context, str, "asset_" + str);
        }
        return f.b(lottieAnimationView.getContext(), str, null);
    }
}
