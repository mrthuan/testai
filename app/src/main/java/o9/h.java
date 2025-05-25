package o9;

import android.content.Context;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class h implements p9.c {

    /* renamed from: a  reason: collision with root package name */
    public final g3.b f22768a;

    public h(g3.b bVar) {
        this.f22768a = bVar;
    }

    @Override // p9.c
    public final Object zza() {
        Context context = (Context) this.f22768a.f17514a;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
