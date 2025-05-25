package a8;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzlg;
import com.google.android.gms.measurement.internal.zzq;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.t2;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class a0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f103a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Parcelable f104b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f105d;

    public a0(zzgw zzgwVar, zzac zzacVar, zzq zzqVar) {
        this.f105d = zzgwVar;
        this.c = zzacVar;
        this.f104b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f103a;
        Parcelable parcelable = this.f104b;
        Object obj = this.c;
        Object obj2 = this.f105d;
        switch (i10) {
            case 0:
                zzgw zzgwVar = (zzgw) obj2;
                zzgwVar.f11800a.a();
                zzac zzacVar = (zzac) obj;
                Object d10 = zzacVar.c.d();
                zzlg zzlgVar = zzgwVar.f11800a;
                if (d10 == null) {
                    zzlgVar.i(zzacVar, (zzq) parcelable);
                    return;
                } else {
                    zzlgVar.l(zzacVar, (zzq) parcelable);
                    return;
                }
            case 1:
                zzjy zzjyVar = (zzjy) obj2;
                zzek zzekVar = zzjyVar.f11858d;
                Object obj3 = zzjyVar.f3529a;
                if (zzekVar == null) {
                    zzeu zzeuVar = ((zzge) obj3).f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11712f.a("Failed to send default event parameters to service");
                    return;
                }
                try {
                    Preconditions.j((zzq) parcelable);
                    zzekVar.c((Bundle) obj, (zzq) parcelable);
                    return;
                } catch (RemoteException e10) {
                    zzeu zzeuVar2 = ((zzge) obj3).f11780i;
                    zzge.f(zzeuVar2);
                    zzeuVar2.f11712f.b(e10, "Failed to send default event parameters to service");
                    return;
                }
            default:
                com.google.android.play.core.assetpacks.a0 a0Var = (com.google.android.play.core.assetpacks.a0) obj;
                AssetPackState assetPackState = (AssetPackState) obj2;
                com.google.android.play.core.assetpacks.g1 g1Var = a0Var.f13156g;
                g1Var.getClass();
                if (((Boolean) g1Var.c(new a2.a(6, g1Var, (Bundle) parcelable))).booleanValue()) {
                    a0Var.f13161l.post(new com.android.billingclient.api.e0(6, a0Var, assetPackState));
                    ((t2) a0Var.f13162m.a()).f();
                    return;
                }
                return;
        }
    }

    public a0(zzjy zzjyVar, zzq zzqVar, Bundle bundle) {
        this.f105d = zzjyVar;
        this.f104b = zzqVar;
        this.c = bundle;
    }

    public /* synthetic */ a0(com.google.android.play.core.assetpacks.a0 a0Var, Bundle bundle, com.google.android.play.core.assetpacks.i0 i0Var) {
        this.c = a0Var;
        this.f104b = bundle;
        this.f105d = i0Var;
    }
}
