package a8;

import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzlg;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class h0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzgw f186a;

    public h0(zzgw zzgwVar, zzaw zzawVar, String str) {
        this.f186a = zzgwVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzgw zzgwVar = this.f186a;
        zzgwVar.f11800a.a();
        b1 b1Var = zzgwVar.f11800a.f11889h;
        zzlg.C(b1Var);
        b1Var.m();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
