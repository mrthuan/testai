package k7;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbom;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class g extends n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f19614b;
    public final /* synthetic */ zzq c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f19615d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzbom f19616e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ zzaw f19617f;

    public g(zzaw zzawVar, Context context, zzq zzqVar, String str, zzboi zzboiVar) {
        this.f19614b = context;
        this.c = zzqVar;
        this.f19615d = str;
        this.f19616e = zzboiVar;
        this.f19617f = zzawVar;
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.b(this.f19614b, "app_open");
        return new zzew();
    }

    @Override // k7.n
    public final Object b(zzce zzceVar) {
        return zzceVar.a(new ObjectWrapper(this.f19614b), this.c, this.f19615d, this.f19616e, 242402000);
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f19617f.f10102a.a(this.f19614b, this.c, this.f19615d, this.f19616e, 4);
    }
}
