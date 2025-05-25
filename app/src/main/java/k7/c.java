package k7;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbyp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f19606b;
    public final /* synthetic */ zzbom c;

    public c(Context context, zzboi zzboiVar) {
        this.f19606b = context;
        this.c = zzboiVar;
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // k7.n
    public final Object b(zzce zzceVar) {
        return zzceVar.i(new ObjectWrapper(this.f19606b), this.c, 242402000);
    }

    @Override // k7.n
    public final Object c() {
        Context context = this.f19606b;
        try {
            return ((zzbyp) zzq.a(context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzad
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    return zzbyo.zzb(obj);
                }
            })).zze(new ObjectWrapper(context), this.c, 242402000);
        } catch (RemoteException | zzp | NullPointerException unused) {
            return null;
        }
    }
}
