package k7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.util.client.zzc;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdn;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzfru;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final zzce f19634a;

    static {
        zzce zzccVar;
        zzce zzceVar = null;
        try {
            Object newInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzm.e("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof zzce) {
                        zzccVar = (zzce) queryLocalInterface;
                    } else {
                        zzccVar = new zzcc(iBinder);
                    }
                    zzceVar = zzccVar;
                }
            }
        } catch (Exception unused) {
            zzm.e("Failed to instantiate ClientApi class.");
        }
        f19634a = zzceVar;
    }

    public abstract Object a();

    public abstract Object b(zzce zzceVar);

    public abstract Object c();

    public final Object d(Context context, boolean z10) {
        boolean z11;
        boolean z12;
        Object obj;
        Object obj2;
        boolean z13;
        boolean z14 = false;
        if (!z10) {
            zzf zzfVar = zzay.f10107f.f10108a;
            zzfru zzfruVar = zzf.f10351b;
            if (GoogleApiAvailabilityLight.f10884b.c(context, 12451000) == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                zzm.b("Google Play Services is not available.");
                z10 = true;
            }
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z15 = !z11;
        zzbbw.zza(context);
        if (((Boolean) zzbdn.zza.zze()).booleanValue()) {
            z12 = false;
        } else if (((Boolean) zzbdn.zzb.zze()).booleanValue()) {
            z12 = true;
            z14 = true;
        } else {
            z14 = z10 | z15;
            z12 = false;
        }
        zzce zzceVar = f19634a;
        Object obj3 = null;
        if (z14) {
            if (zzceVar != null) {
                try {
                    obj2 = b(zzceVar);
                } catch (RemoteException unused) {
                    zzm.g(5);
                }
                if (obj2 == null && !z12) {
                    try {
                        obj3 = c();
                    } catch (RemoteException unused2) {
                        zzm.g(5);
                    }
                    obj2 = obj3;
                }
            } else {
                zzm.e("ClientApi class cannot be loaded.");
            }
            obj2 = null;
            if (obj2 == null) {
                obj3 = c();
                obj2 = obj3;
            }
        } else {
            try {
                obj = c();
            } catch (RemoteException unused3) {
                zzm.g(5);
                obj = null;
            }
            if (obj == null) {
                int intValue = ((Long) zzbeb.zza.zze()).intValue();
                zzay zzayVar = zzay.f10107f;
                if (zzayVar.f10111e.nextInt(intValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    String str = zzayVar.f10110d.f10345a;
                    zzf zzfVar2 = zzayVar.f10108a;
                    zzfVar2.getClass();
                    zzf.n(context, str, bundle, new zzc(zzfVar2));
                }
            }
            if (obj == null) {
                if (zzceVar != null) {
                    try {
                        obj3 = b(zzceVar);
                    } catch (RemoteException unused4) {
                        zzm.g(5);
                    }
                } else {
                    zzm.e("ClientApi class cannot be loaded.");
                }
                obj2 = obj3;
            } else {
                obj2 = obj;
            }
        }
        if (obj2 == null) {
            return a();
        }
        return obj2;
    }
}
