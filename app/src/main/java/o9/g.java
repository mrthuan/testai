package o9;

import android.content.Context;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class g implements p9.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22766a;

    /* renamed from: b  reason: collision with root package name */
    public final p9.c f22767b;

    public /* synthetic */ g(p9.c cVar, int i10) {
        this.f22766a = i10;
        this.f22767b = cVar;
    }

    @Override // p9.c
    public final Object zza() {
        int i10 = this.f22766a;
        p9.c cVar = this.f22767b;
        switch (i10) {
            case 0:
                f fVar = (f) cVar.zza();
                if (fVar != null) {
                    return fVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                Context context = (Context) ((h) cVar).f22768a.f17514a;
                if (context != null) {
                    return new n(context);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
