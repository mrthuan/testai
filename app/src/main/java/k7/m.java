package k7;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzfc;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzbws;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f19632b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzbom f19633d;

    public m(Context context, String str, zzboi zzboiVar) {
        this.f19632b = context;
        this.c = str;
        this.f19633d = zzboiVar;
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.b(this.f19632b, "rewarded");
        return new zzfc();
    }

    @Override // k7.n
    public final Object b(zzce zzceVar) {
        return zzceVar.a0(new ObjectWrapper(this.f19632b), this.c, this.f19633d, 242402000);
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object c() {
        return zzbws.zza(this.f19632b, this.c, this.f19633d);
    }
}
