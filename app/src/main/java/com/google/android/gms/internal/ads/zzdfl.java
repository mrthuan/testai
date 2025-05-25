package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdfl extends zzdch {
    private boolean zzb;

    public zzdfl(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzdcg() { // from class: com.google.android.gms.internal.ads.zzdfi
            @Override // com.google.android.gms.internal.ads.zzdcg
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzq(new zzdcg() { // from class: com.google.android.gms.internal.ads.zzdfh
            @Override // com.google.android.gms.internal.ads.zzdcg
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzq(new zzdfj());
            this.zzb = true;
        }
        zzq(new zzdcg() { // from class: com.google.android.gms.internal.ads.zzdfk
            @Override // com.google.android.gms.internal.ads.zzdcg
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        zzq(new zzdfj());
        this.zzb = true;
    }
}
