package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzboi;
import k7.k;
import k7.q;
import wd.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public class MobileAds {
    private MobileAds() {
    }

    public static void a(final Context context, a.C0390a c0390a) {
        final zzej b10 = zzej.b();
        synchronized (b10.f10169a) {
            if (b10.c) {
                b10.f10170b.add(c0390a);
            } else if (b10.f10171d) {
                b10.a();
                c0390a.a();
            } else {
                b10.c = true;
                b10.f10170b.add(c0390a);
                if (context != null) {
                    synchronized (b10.f10172e) {
                        try {
                            try {
                                if (b10.f10173f == null) {
                                    b10.f10173f = (zzco) new k(zzay.f10107f.f10109b, context).d(context, false);
                                }
                                b10.f10173f.zzs(new q(b10));
                                b10.f10173f.zzo(new zzboi());
                                RequestConfiguration requestConfiguration = b10.f10175h;
                                if (requestConfiguration.f10040a != -1 || requestConfiguration.f10041b != -1) {
                                    try {
                                        b10.f10173f.zzu(new zzff(requestConfiguration));
                                    } catch (RemoteException unused) {
                                        zzm.g(6);
                                    }
                                }
                            } catch (RemoteException unused2) {
                                zzm.g(5);
                            }
                            zzbbw.zza(context);
                            if (((Boolean) zzbdq.zza.zze()).booleanValue()) {
                                if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkk)).booleanValue()) {
                                    zzm.b("Initializing on bg thread");
                                    com.google.android.gms.ads.internal.util.client.zzb.f10349a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzec
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzej zzejVar = zzej.this;
                                            Context context2 = context;
                                            synchronized (zzejVar.f10172e) {
                                                zzejVar.d(context2);
                                            }
                                        }
                                    });
                                }
                            }
                            if (((Boolean) zzbdq.zzb.zze()).booleanValue()) {
                                if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkk)).booleanValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzb.f10350b.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzed
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzej zzejVar = zzej.this;
                                            Context context2 = context;
                                            synchronized (zzejVar.f10172e) {
                                                zzejVar.d(context2);
                                            }
                                        }
                                    });
                                }
                            }
                            zzm.b("Initializing on calling thread");
                            b10.d(context);
                        } finally {
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Context cannot be null.");
            }
        }
    }

    public static void b(RequestConfiguration requestConfiguration) {
        zzej b10 = zzej.b();
        b10.getClass();
        synchronized (b10.f10172e) {
            RequestConfiguration requestConfiguration2 = b10.f10175h;
            b10.f10175h = requestConfiguration;
            zzco zzcoVar = b10.f10173f;
            if (zzcoVar != null) {
                if (requestConfiguration2.f10040a != requestConfiguration.f10040a || requestConfiguration2.f10041b != requestConfiguration.f10041b) {
                    try {
                        zzcoVar.zzu(new zzff(requestConfiguration));
                    } catch (RemoteException unused) {
                        zzm.g(6);
                    }
                }
            }
        }
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        boolean z10;
        zzej b10 = zzej.b();
        synchronized (b10.f10172e) {
            if (b10.f10173f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.l("MobileAds.initialize() must be called prior to setting the plugin.", z10);
            try {
                b10.f10173f.zzt(str);
            } catch (RemoteException unused) {
                zzm.g(6);
            }
        }
    }
}
