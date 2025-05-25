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
public final class f extends n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f19610b;
    public final /* synthetic */ zzq c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f19611d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzbom f19612e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ zzaw f19613f;

    public f(zzaw zzawVar, Context context, zzq zzqVar, String str, zzboi zzboiVar) {
        this.f19610b = context;
        this.c = zzqVar;
        this.f19611d = str;
        this.f19612e = zzboiVar;
        this.f19613f = zzawVar;
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.b(this.f19610b, "banner");
        return new zzew();
    }

    @Override // k7.n
    public final Object b(zzce zzceVar) {
        return zzceVar.k(new ObjectWrapper(this.f19610b), this.c, this.f19611d, this.f19612e, 242402000);
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f19613f.f10102a.a(this.f19610b, this.c, this.f19611d, this.f19612e, 1);
    }
}
