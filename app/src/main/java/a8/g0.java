package a8;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f173a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f174b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f175d;

    public /* synthetic */ g0(int i10, Object obj, Object obj2, Object obj3) {
        this.f173a = i10;
        this.f175d = obj;
        this.f174b = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        v vVar;
        AtomicReference atomicReference2;
        switch (this.f173a) {
            case 0:
                zzgw zzgwVar = (zzgw) this.f175d;
                zzgwVar.f11800a.a();
                zzgwVar.f11800a.e((zzaw) this.f174b, (String) this.c);
                return;
            default:
                synchronized (((AtomicReference) this.f174b)) {
                    try {
                        vVar = ((zzge) ((zzjy) this.f175d).f3529a).f11779h;
                        zzge.d(vVar);
                    } catch (RemoteException e10) {
                        zzeu zzeuVar = ((zzge) ((zzjy) this.f175d).f3529a).f11780i;
                        zzge.f(zzeuVar);
                        zzeuVar.f11712f.b(e10, "Failed to get app instance id");
                        atomicReference = (AtomicReference) this.f174b;
                    }
                    if (!vVar.s().f(zzah.ANALYTICS_STORAGE)) {
                        zzeu zzeuVar2 = ((zzge) ((zzjy) this.f175d).f3529a).f11780i;
                        zzge.f(zzeuVar2);
                        zzeuVar2.f11717k.a("Analytics storage consent denied; will not get app instance id");
                        zzij zzijVar = ((zzge) ((zzjy) this.f175d).f3529a).f11787p;
                        zzge.e(zzijVar);
                        zzijVar.f11829g.set(null);
                        v vVar2 = ((zzge) ((zzjy) this.f175d).f3529a).f11779h;
                        zzge.d(vVar2);
                        vVar2.f343f.b(null);
                        ((AtomicReference) this.f174b).set(null);
                        atomicReference2 = (AtomicReference) this.f174b;
                    } else {
                        zzjy zzjyVar = (zzjy) this.f175d;
                        zzek zzekVar = zzjyVar.f11858d;
                        if (zzekVar == null) {
                            zzeu zzeuVar3 = ((zzge) zzjyVar.f3529a).f11780i;
                            zzge.f(zzeuVar3);
                            zzeuVar3.f11712f.a("Failed to get app instance id");
                            atomicReference2 = (AtomicReference) this.f174b;
                        } else {
                            Preconditions.j((zzq) this.c);
                            ((AtomicReference) this.f174b).set(zzekVar.p((zzq) this.c));
                            String str = (String) ((AtomicReference) this.f174b).get();
                            if (str != null) {
                                zzij zzijVar2 = ((zzge) ((zzjy) this.f175d).f3529a).f11787p;
                                zzge.e(zzijVar2);
                                zzijVar2.f11829g.set(str);
                                v vVar3 = ((zzge) ((zzjy) this.f175d).f3529a).f11779h;
                                zzge.d(vVar3);
                                vVar3.f343f.b(str);
                            }
                            ((zzjy) this.f175d).x();
                            atomicReference = (AtomicReference) this.f174b;
                            atomicReference.notify();
                            return;
                        }
                    }
                    atomicReference2.notify();
                    return;
                }
        }
    }
}
