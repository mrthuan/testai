package a8;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzlg;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class e2 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzq f150a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzlg f151b;

    public e2(zzlg zzlgVar, zzq zzqVar) {
        this.f151b = zzlgVar;
        this.f150a = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzq zzqVar = this.f150a;
        String str = zzqVar.f11920a;
        Preconditions.j(str);
        zzlg zzlgVar = this.f151b;
        zzai F = zzlgVar.F(str);
        zzah zzahVar = zzah.ANALYTICS_STORAGE;
        if (F.f(zzahVar) && zzai.b(zzqVar.f11940v).f(zzahVar)) {
            return zzlgVar.D(zzqVar).F();
        }
        zzlgVar.zzaA().f11720n.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
