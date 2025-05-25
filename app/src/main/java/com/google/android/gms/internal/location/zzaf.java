package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzaf implements GeofencingApi {
    public final PendingResult<Status> addGeofences(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return googleApiClient.g(new zzac(this, googleApiClient, geofencingRequest, pendingIntent));
    }

    public final PendingResult<Status> removeGeofences(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        Parcelable.Creator<com.google.android.gms.location.zzbq> creator = com.google.android.gms.location.zzbq.CREATOR;
        if (pendingIntent != null) {
            return zza(googleApiClient, new com.google.android.gms.location.zzbq(null, pendingIntent, ""));
        }
        throw new NullPointerException("PendingIntent can not be null.");
    }

    public final PendingResult<Status> zza(GoogleApiClient googleApiClient, com.google.android.gms.location.zzbq zzbqVar) {
        return googleApiClient.g(new zzad(this, googleApiClient, zzbqVar));
    }

    @Deprecated
    public final PendingResult<Status> addGeofences(GoogleApiClient googleApiClient, List<Geofence> list, PendingIntent pendingIntent) {
        GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
        ArrayList arrayList = builder.f11448a;
        if (list != null && !list.isEmpty()) {
            for (Geofence geofence : list) {
                if (geofence != null) {
                    Preconditions.a("Geofence must be created using Geofence.Builder.", geofence instanceof zzbe);
                    arrayList.add((zzbe) geofence);
                }
            }
        }
        builder.f11449b = 5;
        Preconditions.a("No geofence has been added to this request.", !arrayList.isEmpty());
        return googleApiClient.g(new zzac(this, googleApiClient, new GeofencingRequest(builder.c, arrayList, builder.f11449b, null), pendingIntent));
    }

    public final PendingResult<Status> removeGeofences(GoogleApiClient googleApiClient, List<String> list) {
        Parcelable.Creator<com.google.android.gms.location.zzbq> creator = com.google.android.gms.location.zzbq.CREATOR;
        if (list != null) {
            Preconditions.a("Geofences must contains at least one id.", !list.isEmpty());
            return zza(googleApiClient, new com.google.android.gms.location.zzbq(list, null, ""));
        }
        throw new NullPointerException("geofence can't be null.");
    }
}
