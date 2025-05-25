package k7;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzbtq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class b extends n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f19605b;
    public final /* synthetic */ zzbom c;

    public b(Context context, zzboi zzboiVar) {
        this.f19605b = context;
        this.c = zzboiVar;
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.b(this.f19605b, "out_of_context_tester");
        return null;
    }

    @Override // k7.n
    public final Object b(zzce zzceVar) {
        Context context = this.f19605b;
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        zzbbw.zza(context);
        if (((Boolean) zzba.f10115d.c.zza(zzbbw.zziz)).booleanValue()) {
            return zzceVar.v0(objectWrapper, this.c, 242402000);
        }
        return null;
    }

    @Override // k7.n
    public final Object c() {
        Context context = this.f19605b;
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        zzbbw.zza(context);
        if (((Boolean) zzba.f10115d.c.zza(zzbbw.zziz)).booleanValue()) {
            try {
                return ((zzdk) zzq.a(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzab
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        if (queryLocalInterface instanceof zzdk) {
                            return (zzdk) queryLocalInterface;
                        }
                        return new zzdk(obj);
                    }
                })).K(objectWrapper, this.c);
            } catch (RemoteException | zzp | NullPointerException e10) {
                zzbtq.zza(context).zzh(e10, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }
}
