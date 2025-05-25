package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbrm implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrn zza;

    public zzbrm(zzbrn zzbrnVar) {
        this.zza = zzbrnVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzh("User canceled the download.");
    }
}
