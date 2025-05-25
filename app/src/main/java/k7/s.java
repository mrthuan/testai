package k7;

import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class s extends zzbm {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzeu f19638a;

    public /* synthetic */ s(zzeu zzeuVar) {
        this.f19638a = zzeuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zze() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) {
        zzh(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzlVar, int i10) {
        zzm.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzf.f10351b.post(new r(this, 0));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() {
        return false;
    }
}
