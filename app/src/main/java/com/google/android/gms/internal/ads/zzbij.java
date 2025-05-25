package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbij implements zzbix {
    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzcej zzcejVar = (zzcej) obj;
        try {
            zzfsb.zzj(zzcejVar.getContext()).zzk();
            zzfsc.zzi(zzcejVar.getContext()).zzj();
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
