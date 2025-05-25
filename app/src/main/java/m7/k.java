package m7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzhfv;
import u.e;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class k implements zzbcs {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzbct f21838a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f21839b;
    public final /* synthetic */ Uri c;

    public k(zzbct zzbctVar, Context context, Uri uri) {
        this.f21838a = zzbctVar;
        this.f21839b = context;
        this.c = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbcs
    public final void zza() {
        zzbct zzbctVar = this.f21838a;
        u.e a10 = new e.b(zzbctVar.zza()).a();
        Context context = this.f21839b;
        String zza = zzhfv.zza(context);
        Intent intent = a10.f30089a;
        intent.setPackage(zza);
        intent.setData(this.c);
        androidx.core.content.a.startActivity(context, intent, null);
        zzbctVar.zzf((Activity) context);
    }
}
