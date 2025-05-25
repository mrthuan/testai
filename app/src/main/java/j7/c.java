package j7;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaun;
import com.google.android.gms.internal.ads.zzauo;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzt f19048a;

    public c(zzt zztVar) {
        this.f19048a = zztVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzt zztVar = this.f19048a;
        return new zzauo(zzaun.zzt(zztVar.f10544a.f10345a, zztVar.f10546d, false));
    }
}
