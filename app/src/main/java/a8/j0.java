package a8;

import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzlg;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class j0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f205a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzgw f206b;

    public j0(zzgw zzgwVar, String str) {
        this.f206b = zzgwVar;
        this.f205a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzgw zzgwVar = this.f206b;
        zzgwVar.f11800a.a();
        e eVar = zzgwVar.f11800a.c;
        zzlg.C(eVar);
        return eVar.Q(this.f205a);
    }
}
