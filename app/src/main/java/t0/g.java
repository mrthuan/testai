package t0;

import android.content.Context;
import java.util.concurrent.Callable;
import t0.k;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class g implements Callable<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f29881a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f29882b;
    public final /* synthetic */ f c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f29883d;

    public g(String str, Context context, f fVar, int i10) {
        this.f29881a = str;
        this.f29882b = context;
        this.c = fVar;
        this.f29883d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final k.a call() {
        return k.a(this.f29881a, this.f29882b, this.c, this.f29883d);
    }
}
