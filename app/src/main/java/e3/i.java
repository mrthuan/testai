package e3;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class i implements Callable<p<e>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f16363a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f16364b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f16365d;

    public i(WeakReference weakReference, Context context, int i10, String str) {
        this.f16363a = weakReference;
        this.f16364b = context;
        this.c = i10;
        this.f16365d = str;
    }

    @Override // java.util.concurrent.Callable
    public final p<e> call() {
        Context context = (Context) this.f16363a.get();
        if (context == null) {
            context = this.f16364b;
        }
        return f.e(context, this.c, this.f16365d);
    }
}
