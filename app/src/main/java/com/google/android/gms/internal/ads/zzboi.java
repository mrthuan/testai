package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzboi extends zzbol {
    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbop zzb(String str) {
        zzbpn zzbpnVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzboi.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbpn((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbpn((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                com.google.android.gms.ads.internal.util.client.zzm.e("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzm.b("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    zzbpnVar = new zzbpn(new AdMobAdapter());
                } else {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        zzbpnVar = new zzbpn(new CustomEventAdapter());
                    }
                    throw new RemoteException();
                }
                return zzbpnVar;
            }
        } catch (Throwable unused2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final zzbql zzc(String str) {
        return new zzbqy((RtbAdapter) Class.forName(str, false, zzbqp.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean zzd(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzboi.class.getClassLoader()));
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final boolean zze(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzboi.class.getClassLoader()));
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
