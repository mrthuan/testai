package m7;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapq;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class d implements zzapl {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21829a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f21830b;

    public d(String str, f fVar) {
        this.f21829a = str;
        this.f21830b = fVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final void zza(zzapq zzapqVar) {
        String obj = zzapqVar.toString();
        zzm.e("Failed to load URL: " + this.f21829a + "\n" + obj);
        this.f21830b.zza((Object) null);
    }
}
