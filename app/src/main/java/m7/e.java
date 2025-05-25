package m7;

import com.google.android.gms.ads.internal.util.client.zzh;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.internal.ads.zzaqm;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class e extends zzaqm {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ byte[] f21831a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f21832b;
    public final /* synthetic */ zzl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, String str, f fVar, d dVar, byte[] bArr, HashMap hashMap, zzl zzlVar) {
        super(i10, str, fVar, dVar);
        this.f21831a = bArr;
        this.f21832b = hashMap;
        this.c = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    public final Map zzl() {
        Map map = this.f21832b;
        if (map == null) {
            return Collections.emptyMap();
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    public final byte[] zzx() {
        byte[] bArr = this.f21831a;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm, com.google.android.gms.internal.ads.zzaph
    /* renamed from: zzz */
    public final void zzo(String str) {
        zzl zzlVar = this.c;
        zzlVar.getClass();
        if (zzl.c() && str != null) {
            zzlVar.d("onNetworkResponseBody", new zzh(str.getBytes()));
        }
        super.zzo(str);
    }
}
