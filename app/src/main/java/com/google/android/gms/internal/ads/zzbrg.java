package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbrg implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrh zza;

    public zzbrg(zzbrh zzbrhVar) {
        this.zza = zzbrhVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzh("Operation denied by user.");
    }
}
