package k7;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f19618b;
    public final /* synthetic */ zzq c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f19619d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzaw f19620e;

    public h(zzaw zzawVar, Context context, zzq zzqVar, String str) {
        this.f19618b = context;
        this.c = zzqVar;
        this.f19619d = str;
        this.f19620e = zzawVar;
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.b(this.f19618b, "search");
        return new zzew();
    }

    @Override // k7.n
    public final Object b(zzce zzceVar) {
        return zzceVar.Q(new ObjectWrapper(this.f19618b), this.c, this.f19619d, 242402000);
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object c() {
        return this.f19620e.f10102a.a(this.f19618b, this.c, this.f19619d, null, 3);
    }
}
