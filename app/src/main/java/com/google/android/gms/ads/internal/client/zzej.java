package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbld;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzboe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzej {

    /* renamed from: i  reason: collision with root package name */
    public static zzej f10168i;

    /* renamed from: f  reason: collision with root package name */
    public zzco f10173f;

    /* renamed from: a  reason: collision with root package name */
    public final Object f10169a = new Object();
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10171d = false;

    /* renamed from: e  reason: collision with root package name */
    public final Object f10172e = new Object();

    /* renamed from: g  reason: collision with root package name */
    public OnAdInspectorClosedListener f10174g = null;

    /* renamed from: h  reason: collision with root package name */
    public RequestConfiguration f10175h = new RequestConfiguration.Builder().a();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f10170b = new ArrayList();

    private zzej() {
    }

    public static zzej b() {
        zzej zzejVar;
        synchronized (zzej.class) {
            if (f10168i == null) {
                f10168i = new zzej();
            }
            zzejVar = f10168i;
        }
        return zzejVar;
    }

    public static zzble c(List list) {
        AdapterStatus.State state;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbkv zzbkvVar = (zzbkv) it.next();
            String str = zzbkvVar.zza;
            if (zzbkvVar.zzb) {
                state = AdapterStatus.State.READY;
            } else {
                state = AdapterStatus.State.NOT_READY;
            }
            hashMap.put(str, new zzbld(state, zzbkvVar.zzd, zzbkvVar.zzc));
        }
        return new zzble(hashMap);
    }

    public final InitializationStatus a() {
        boolean z10;
        zzble c;
        synchronized (this.f10172e) {
            if (this.f10173f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.l("MobileAds.initialize() must be called prior to getting initialization status.", z10);
            try {
                c = c(this.f10173f.zzg());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.c("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                };
            }
        }
        return c;
    }

    public final void d(Context context) {
        try {
            zzboe.zza().zzb(context, null);
            this.f10173f.zzk();
            this.f10173f.zzl(null, new ObjectWrapper(null));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }
}
