package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzav {
    private final zzbg<zzam> zza;
    private final Context zzb;
    private boolean zzc = false;
    private final Map<ListenerHolder.ListenerKey<LocationListener>, zzau> zzd = new HashMap();
    private final Map<ListenerHolder.ListenerKey, zzas> zze = new HashMap();
    private final Map<ListenerHolder.ListenerKey<LocationCallback>, zzar> zzf = new HashMap();

    public zzav(Context context, zzbg<zzam> zzbgVar) {
        this.zzb = context;
        this.zza = zzbgVar;
    }

    public final Location zza(String str) {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzn(str);
    }

    @Deprecated
    public final Location zzb() {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzm();
    }

    public final LocationAvailability zzc() {
        ((zzh) this.zza).zza.checkConnected();
        return ((zzh) this.zza).zza().zzs(this.zzb.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(LocationRequest locationRequest, ListenerHolder<LocationListener> listenerHolder, zzai zzaiVar) {
        zzau zzauVar;
        zzau zzauVar2;
        ((zzh) this.zza).zza.checkConnected();
        ListenerHolder.ListenerKey<LocationListener> listenerKey = listenerHolder.c;
        if (listenerKey == null) {
            zzauVar2 = null;
        } else {
            synchronized (this.zzd) {
                zzauVar = this.zzd.get(listenerKey);
                if (zzauVar == null) {
                    zzauVar = new zzau(listenerHolder);
                }
                this.zzd.put(listenerKey, zzauVar);
            }
            zzauVar2 = zzauVar;
        }
        if (zzauVar2 == null) {
            return;
        }
        ((zzh) this.zza).zza().zzo(new zzbc(1, zzba.zza(null, locationRequest), zzauVar2, null, null, zzaiVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzba zzbaVar, ListenerHolder<LocationCallback> listenerHolder, zzai zzaiVar) {
        zzar zzarVar;
        ((zzh) this.zza).zza.checkConnected();
        ListenerHolder.ListenerKey<LocationCallback> listenerKey = listenerHolder.c;
        if (listenerKey == null) {
            zzarVar = null;
        } else {
            synchronized (this.zzf) {
                zzar zzarVar2 = this.zzf.get(listenerKey);
                if (zzarVar2 == null) {
                    zzarVar2 = new zzar(listenerHolder);
                }
                zzarVar = zzarVar2;
                this.zzf.put(listenerKey, zzarVar);
            }
        }
        zzar zzarVar3 = zzarVar;
        if (zzarVar3 == null) {
            return;
        }
        ((zzh) this.zza).zza().zzo(new zzbc(1, zzbaVar, null, null, zzarVar3, zzaiVar));
    }

    public final void zzf(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(zzbc.zzb(zzbaVar, pendingIntent, zzaiVar));
    }

    public final void zzg(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(zzbc.zzb(zzba.zza(null, locationRequest), pendingIntent, zzaiVar));
    }

    public final void zzh(ListenerHolder.ListenerKey<LocationListener> listenerKey, zzai zzaiVar) {
        ((zzh) this.zza).zza.checkConnected();
        if (listenerKey != null) {
            synchronized (this.zzd) {
                zzau remove = this.zzd.remove(listenerKey);
                if (remove != null) {
                    remove.zzc();
                    ((zzh) this.zza).zza().zzo(zzbc.zza(remove, zzaiVar));
                }
            }
            return;
        }
        throw new NullPointerException("Invalid null listener key");
    }

    public final void zzi(ListenerHolder.ListenerKey<LocationCallback> listenerKey, zzai zzaiVar) {
        ((zzh) this.zza).zza.checkConnected();
        if (listenerKey != null) {
            synchronized (this.zzf) {
                zzar remove = this.zzf.remove(listenerKey);
                if (remove != null) {
                    remove.zzc();
                    ((zzh) this.zza).zza().zzo(zzbc.zzc(remove, zzaiVar));
                }
            }
            return;
        }
        throw new NullPointerException("Invalid null listener key");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzj(PendingIntent pendingIntent, zzai zzaiVar) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzo(new zzbc(2, null, null, pendingIntent, null, zzaiVar));
    }

    public final void zzk(boolean z10) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzp(z10);
        this.zzc = z10;
    }

    public final void zzl(Location location) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzq(location);
    }

    public final void zzm(zzai zzaiVar) {
        ((zzh) this.zza).zza.checkConnected();
        ((zzh) this.zza).zza().zzr(zzaiVar);
    }

    public final void zzn() {
        synchronized (this.zzd) {
            for (zzau zzauVar : this.zzd.values()) {
                if (zzauVar != null) {
                    ((zzh) this.zza).zza().zzo(zzbc.zza(zzauVar, null));
                }
            }
            this.zzd.clear();
        }
        synchronized (this.zzf) {
            for (zzar zzarVar : this.zzf.values()) {
                if (zzarVar != null) {
                    ((zzh) this.zza).zza().zzo(zzbc.zzc(zzarVar, null));
                }
            }
            this.zzf.clear();
        }
        synchronized (this.zze) {
            for (zzas zzasVar : this.zze.values()) {
                if (zzasVar != null) {
                    ((zzh) this.zza).zza().zzu(new zzl(2, null, zzasVar, null));
                }
            }
            this.zze.clear();
        }
    }

    public final void zzo() {
        if (this.zzc) {
            zzk(false);
        }
    }
}
