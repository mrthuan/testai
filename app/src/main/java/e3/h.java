package e3;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class h implements Callable<p<e>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f16361a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f16362b;
    public final /* synthetic */ String c;

    public h(Context context, String str, String str2) {
        this.f16361a = context;
        this.f16362b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final p<e> call() {
        return f.b(this.f16361a, this.f16362b, this.c);
    }
}
