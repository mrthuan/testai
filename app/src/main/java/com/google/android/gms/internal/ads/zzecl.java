package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbbc;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzecl extends zzecm {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcvu zzd;
    private final TelephonyManager zze;
    private final zzecd zzf;
    private zzbbc.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbbc.zzaf.zzd.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbbc.zzaf.zzd zzdVar = zzbbc.zzaf.zzd.CONNECTING;
        sparseArray.put(ordinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbbc.zzaf.zzd.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbbc.zzaf.zzd zzdVar2 = zzbbc.zzaf.zzd.DISCONNECTED;
        sparseArray.put(ordinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbbc.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzecl(Context context, zzcvu zzcvuVar, zzecd zzecdVar, zzebz zzebzVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzebzVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcvuVar;
        this.zzf = zzecdVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzbbc.zzab zza(zzecl zzeclVar, Bundle bundle) {
        zzbbc.zzab.zzb zzbVar;
        zzbbc.zzab.zza zza = zzbbc.zzab.zza();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        if (i10 == -1) {
            zzeclVar.zzg = zzbbc.zzq.ENUM_TRUE;
        } else {
            zzeclVar.zzg = zzbbc.zzq.ENUM_FALSE;
            if (i10 != 0) {
                if (i10 != 1) {
                    zza.zzd(zzbbc.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
                } else {
                    zza.zzd(zzbbc.zzab.zzc.WIFI);
                }
            } else {
                zza.zzd(zzbbc.zzab.zzc.CELL);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbbc.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbbc.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbbc.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbbc.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zza.zzc(zzbVar);
        }
        return zza.zzbr();
    }

    public static /* bridge */ /* synthetic */ zzbbc.zzaf.zzd zzb(zzecl zzeclVar, Bundle bundle) {
        return (zzbbc.zzaf.zzd) zzb.get(zzffu.zza(zzffu.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbbc.zzaf.zzd.UNSPECIFIED);
    }

    public static byte[] zze(zzecl zzeclVar, boolean z10, ArrayList arrayList, zzbbc.zzab zzabVar, zzbbc.zzaf.zzd zzdVar) {
        boolean z11;
        zzbbc.zzaf.zza.C0159zza zzn = zzbbc.zzaf.zza.zzn();
        zzn.zzn(arrayList);
        boolean z12 = false;
        if (Settings.Global.getInt(zzeclVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzn.zzD(zzg(z11));
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzn.zzE(zzuVar.f10555e.c(zzeclVar.zzc, zzeclVar.zze));
        zzn.zzM(zzeclVar.zzf.zze());
        zzn.zzL(zzeclVar.zzf.zzb());
        zzn.zzG(zzeclVar.zzf.zza());
        zzn.zzH(zzdVar);
        zzn.zzJ(zzabVar);
        zzn.zzK(zzeclVar.zzg);
        zzn.zzN(zzg(z10));
        zzn.zzP(zzeclVar.zzf.zzd());
        zzuVar.f10560j.getClass();
        zzn.zzO(System.currentTimeMillis());
        if (Settings.Global.getInt(zzeclVar.zzc.getContentResolver(), "wifi_on", 0) != 0) {
            z12 = true;
        }
        zzn.zzQ(zzg(z12));
        return zzn.zzbr().zzaV();
    }

    private static final zzbbc.zzq zzg(boolean z10) {
        if (z10) {
            return zzbbc.zzq.ENUM_TRUE;
        }
        return zzbbc.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z10) {
        zzgcj.zzr(this.zzd.zzb(new Bundle()), new zzeck(this, z10), zzbzo.zzf);
    }
}
