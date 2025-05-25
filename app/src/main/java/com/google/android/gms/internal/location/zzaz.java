package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzaz extends zzi {
    private final zzav zzf;

    public zzaz(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, ClientSettings clientSettings) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, clientSettings);
        this.zzf = new zzav(context, this.zze);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (Exception unused) {
                }
            }
            super.disconnect();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final LocationAvailability zzA() {
        return this.zzf.zzc();
    }

    public final void zzB(zzba zzbaVar, ListenerHolder<LocationCallback> listenerHolder, zzai zzaiVar) {
        synchronized (this.zzf) {
            this.zzf.zze(zzbaVar, listenerHolder, zzaiVar);
        }
    }

    public final void zzC(LocationRequest locationRequest, ListenerHolder<LocationListener> listenerHolder, zzai zzaiVar) {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, listenerHolder, zzaiVar);
        }
    }

    public final void zzD(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzf(zzbaVar, pendingIntent, zzaiVar);
    }

    public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzg(locationRequest, pendingIntent, zzaiVar);
    }

    public final void zzF(ListenerHolder.ListenerKey<LocationListener> listenerKey, zzai zzaiVar) {
        this.zzf.zzh(listenerKey, zzaiVar);
    }

    public final void zzG(PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzj(pendingIntent, zzaiVar);
    }

    public final void zzH(ListenerHolder.ListenerKey<LocationCallback> listenerKey, zzai zzaiVar) {
        this.zzf.zzi(listenerKey, zzaiVar);
    }

    public final void zzI(boolean z10) {
        this.zzf.zzk(z10);
    }

    public final void zzJ(Location location) {
        this.zzf.zzl(location);
    }

    public final void zzK(zzai zzaiVar) {
        this.zzf.zzm(zzaiVar);
    }

    public final void zzL(LocationSettingsRequest locationSettingsRequest, BaseImplementation.ResultHolder<LocationSettingsResult> resultHolder, String str) {
        boolean z10;
        checkConnected();
        boolean z11 = true;
        if (locationSettingsRequest != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.a("locationSettingsRequest can't be null nor empty.", z10);
        if (resultHolder == null) {
            z11 = false;
        }
        Preconditions.a("listener can't be null.", z11);
        ((zzam) getService()).zzt(locationSettingsRequest, new zzay(resultHolder), null);
    }

    public final void zzq(long j10, PendingIntent pendingIntent) {
        boolean z10;
        checkConnected();
        Preconditions.j(pendingIntent);
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.a("detectionIntervalMillis must be >= 0", z10);
        ((zzam) getService()).zzh(j10, true, pendingIntent);
    }

    public final void zzr(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) {
        checkConnected();
        if (activityTransitionRequest != null) {
            if (pendingIntent != null) {
                if (resultHolder != null) {
                    ((zzam) getService()).zzi(activityTransitionRequest, pendingIntent, new StatusCallback(resultHolder));
                    return;
                }
                throw new NullPointerException("ResultHolder not provided.");
            }
            throw new NullPointerException("PendingIntent must be specified.");
        }
        throw new NullPointerException("activityTransitionRequest must be specified.");
    }

    public final void zzs(PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) {
        checkConnected();
        if (resultHolder != null) {
            ((zzam) getService()).zzj(pendingIntent, new StatusCallback(resultHolder));
            return;
        }
        throw new NullPointerException("ResultHolder not provided.");
    }

    public final void zzt(PendingIntent pendingIntent) {
        checkConnected();
        Preconditions.j(pendingIntent);
        ((zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) {
        checkConnected();
        if (pendingIntent != null) {
            if (resultHolder != null) {
                ((zzam) getService()).zzl(pendingIntent, new StatusCallback(resultHolder));
                return;
            }
            throw new NullPointerException("ResultHolder not provided.");
        }
        throw new NullPointerException("PendingIntent must be specified.");
    }

    public final void zzv(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) {
        checkConnected();
        if (geofencingRequest != null) {
            if (pendingIntent != null) {
                if (resultHolder != null) {
                    ((zzam) getService()).zzd(geofencingRequest, pendingIntent, new zzaw(resultHolder));
                    return;
                }
                throw new NullPointerException("ResultHolder not provided.");
            }
            throw new NullPointerException("PendingIntent must be specified.");
        }
        throw new NullPointerException("geofencingRequest can't be null.");
    }

    public final void zzw(com.google.android.gms.location.zzbq zzbqVar, BaseImplementation.ResultHolder<Status> resultHolder) {
        checkConnected();
        if (zzbqVar != null) {
            if (resultHolder != null) {
                ((zzam) getService()).zzg(zzbqVar, new zzax(resultHolder));
                return;
            }
            throw new NullPointerException("ResultHolder not provided.");
        }
        throw new NullPointerException("removeGeofencingRequest can't be null.");
    }

    public final void zzx(PendingIntent pendingIntent, BaseImplementation.ResultHolder<Status> resultHolder) {
        checkConnected();
        if (pendingIntent != null) {
            if (resultHolder != null) {
                ((zzam) getService()).zze(pendingIntent, new zzax(resultHolder), getContext().getPackageName());
                return;
            }
            throw new NullPointerException("ResultHolder not provided.");
        }
        throw new NullPointerException("PendingIntent must be specified.");
    }

    public final void zzy(List<String> list, BaseImplementation.ResultHolder<Status> resultHolder) {
        boolean z10;
        checkConnected();
        if (list != null && list.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.a("geofenceRequestIds can't be null nor empty.", z10);
        if (resultHolder != null) {
            ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(resultHolder), getContext().getPackageName());
            return;
        }
        throw new NullPointerException("ResultHolder not provided.");
    }

    public final Location zzz(String str) {
        if (ArrayUtils.a(com.google.android.gms.location.zzu.f11507a, getAvailableFeatures())) {
            return this.zzf.zza(str);
        }
        return this.zzf.zzb();
    }
}
