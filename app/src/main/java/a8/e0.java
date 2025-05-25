package a8;

import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzlg;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class e0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f145a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f146b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzgw f147d;

    public e0(zzgw zzgwVar, String str, String str2, String str3) {
        this.f147d = zzgwVar;
        this.f145a = str;
        this.f146b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzgw zzgwVar = this.f147d;
        zzgwVar.f11800a.a();
        e eVar = zzgwVar.f11800a.c;
        zzlg.C(eVar);
        return eVar.O(this.f145a, this.f146b, this.c);
    }
}
