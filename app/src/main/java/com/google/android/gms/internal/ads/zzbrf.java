package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbrf implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrh zza;

    public zzbrf(zzbrh zzbrhVar) {
        this.zza = zzbrhVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Context context;
        zzbrh zzbrhVar = this.zza;
        Intent zzb = zzbrhVar.zzb();
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        context = zzbrhVar.zzb;
        com.google.android.gms.ads.internal.util.zzt.zzT(context, zzb);
    }
}
