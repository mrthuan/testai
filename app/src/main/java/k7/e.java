package k7;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjt;
import com.google.android.gms.internal.ads.zzbkb;
import com.google.android.gms.internal.ads.zzbkc;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbom;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class e extends n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f19608b;
    public final /* synthetic */ zzbom c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ OnH5AdsEventListener f19609d;

    public e(Context context, zzboi zzboiVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.f19608b = context;
        this.c = zzboiVar;
        this.f19609d = onH5AdsEventListener;
    }

    @Override // k7.n
    public final /* synthetic */ Object a() {
        return new zzbkg();
    }

    @Override // k7.n
    public final Object b(zzce zzceVar) {
        return zzceVar.p0(new ObjectWrapper(this.f19608b), this.c, 242402000, new zzbjt(this.f19609d));
    }

    @Override // k7.n
    public final Object c() {
        Context context = this.f19608b;
        try {
            return ((zzbkc) zzq.a(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzah
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    return zzbkb.zzb(obj);
                }
            })).zze(new ObjectWrapper(context), this.c, 242402000, new zzbjt(this.f19609d));
        } catch (RemoteException | zzp | NullPointerException unused) {
            return null;
        }
    }
}
