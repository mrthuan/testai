package k7;

import android.os.RemoteException;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class o extends zzaz {
    public final /* synthetic */ zzea c;

    public o(zzea zzeaVar) {
        this.c = zzeaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzdq zzl;
        zzea zzeaVar = this.c;
        VideoController videoController = zzeaVar.c;
        zzbu zzbuVar = zzeaVar.f10157i;
        if (zzbuVar != null) {
            try {
                zzl = zzbuVar.zzl();
            } catch (RemoteException e10) {
                zzm.f("#007 Could not call remote method.", e10);
            }
            videoController.b(zzl);
            super.onAdFailedToLoad(loadAdError);
        }
        zzl = null;
        videoController.b(zzl);
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzdq zzl;
        zzea zzeaVar = this.c;
        VideoController videoController = zzeaVar.c;
        zzbu zzbuVar = zzeaVar.f10157i;
        if (zzbuVar != null) {
            try {
                zzl = zzbuVar.zzl();
            } catch (RemoteException e10) {
                zzm.f("#007 Could not call remote method.", e10);
            }
            videoController.b(zzl);
            super.onAdLoaded();
        }
        zzl = null;
        videoController.b(zzl);
        super.onAdLoaded();
    }
}
