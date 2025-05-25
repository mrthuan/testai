package k7;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbtq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f19629b;
    public final /* synthetic */ FrameLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Context f19630d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzaw f19631e;

    public l(zzaw zzawVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f19629b = frameLayout;
        this.c = frameLayout2;
        this.f19630d = context;
        this.f19631e = zzawVar;
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.b(this.f19630d, "native_ad_view_delegate");
        return new zzez();
    }

    @Override // k7.n
    public final Object b(zzce zzceVar) {
        return zzceVar.V(new ObjectWrapper(this.f19629b), new ObjectWrapper(this.c));
    }

    @Override // k7.n
    public final Object c() {
        Context context = this.f19630d;
        zzbbw.zza(context);
        boolean booleanValue = ((Boolean) zzba.f10115d.c.zza(zzbbw.zzjN)).booleanValue();
        FrameLayout frameLayout = this.c;
        FrameLayout frameLayout2 = this.f19629b;
        zzaw zzawVar = this.f19631e;
        if (booleanValue) {
            try {
                return zzbfg.zzdA(((zzbfk) zzq.a(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzar
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        return zzbfj.zzb(obj);
                    }
                })).zze(new ObjectWrapper(context), new ObjectWrapper(frameLayout2), new ObjectWrapper(frameLayout), 242402000));
            } catch (RemoteException | zzp | NullPointerException e10) {
                zzawVar.f10106f = zzbtq.zza(context);
                zzawVar.f10106f.zzh(e10, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        return zzawVar.f10104d.zza(context, frameLayout2, frameLayout);
    }
}
