package k7;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.internal.ads.zzblb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class q extends zzblb {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzej f19635a;

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zzb(List list) {
        int i10;
        ArrayList arrayList;
        synchronized (this.f19635a.f10169a) {
            zzej zzejVar = this.f19635a;
            zzejVar.c = false;
            zzejVar.f10171d = true;
            arrayList = new ArrayList(this.f19635a.f10170b);
            this.f19635a.f10170b.clear();
        }
        zzej.c(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).a();
        }
    }
}
