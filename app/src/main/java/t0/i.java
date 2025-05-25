package t0;

import android.content.Context;
import java.util.concurrent.Callable;
import t0.k;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class i implements Callable<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f29885a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f29886b;
    public final /* synthetic */ f c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f29887d;

    public i(String str, Context context, f fVar, int i10) {
        this.f29885a = str;
        this.f29886b = context;
        this.c = fVar;
        this.f29887d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final k.a call() {
        try {
            return k.a(this.f29885a, this.f29886b, this.c, this.f29887d);
        } catch (Throwable unused) {
            return new k.a(-3);
        }
    }
}
