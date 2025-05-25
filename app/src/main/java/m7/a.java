package m7;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class a extends zzcz {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f21823a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzay f21824b;

    public a(zzay zzayVar, Context context) {
        this.f21823a = context;
        this.f21824b = zzayVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.f21824b.getClass();
        zzay.e(zzeVar.f10147b, this.f21823a, true, true);
    }
}
