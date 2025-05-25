package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
final class zzn extends zzx {
    final /* synthetic */ LocationCallback zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(zzz zzzVar, GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        super(googleApiClient);
        this.zza = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(zzaz zzazVar) {
        zzazVar.zzH(ListenerHolders.b(this.zza, "LocationCallback"), new zzy(this));
    }
}
