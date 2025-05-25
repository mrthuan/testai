package a8;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzjx;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.tom_roush.fontbox.ttf.NamingTable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class r0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f311a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f312b;
    public final Object c;

    public /* synthetic */ r0(int i10, Object obj, Object obj2) {
        this.f311a = i10;
        this.c = obj;
        this.f312b = obj2;
    }

    private final void a() {
        synchronized (((d8.g) this.c).f16137b) {
            try {
                OnCompleteListener onCompleteListener = ((d8.g) this.c).c;
                if (onCompleteListener != null) {
                    onCompleteListener.onComplete((Task) this.f312b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f311a) {
            case 0:
                zzij zzijVar = (zzij) this.c;
                Bundle bundle = (Bundle) this.f312b;
                zzijVar.m();
                zzijVar.n();
                Preconditions.j(bundle);
                String string = bundle.getString(NamingTable.TAG);
                Preconditions.f(string);
                Object obj = zzijVar.f3529a;
                zzge zzgeVar = (zzge) obj;
                if (!zzgeVar.b()) {
                    zzeu zzeuVar = zzgeVar.f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11720n.a("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                zzlj zzljVar = new zzlj(0L, null, string, "");
                try {
                    zzlo zzloVar = ((zzge) obj).f11783l;
                    zzge.d(zzloVar);
                    bundle.getString("app_id");
                    zzgeVar.o().r(new zzac(bundle.getString("app_id"), "", zzljVar, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), zzloVar.v0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 1:
                zzjy o10 = ((AppMeasurementDynamiteService) this.c).f11514a.o();
                o10.m();
                o10.n();
                o10.y(new j1(o10, o10.v(false), (zzcf) this.f312b));
                return;
            case 2:
                Object obj2 = this.f312b;
                Object obj3 = this.c;
                zzjy zzjyVar = (zzjy) obj3;
                zzek zzekVar = zzjyVar.f11858d;
                if (zzekVar == null) {
                    zzeu zzeuVar2 = ((zzge) zzjyVar.f3529a).f11780i;
                    zzge.f(zzeuVar2);
                    zzeuVar2.f11712f.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    Preconditions.j((zzq) obj2);
                    zzekVar.b((zzq) obj2);
                    ((zzjy) obj3).x();
                    return;
                } catch (RemoteException e10) {
                    zzeu zzeuVar3 = ((zzge) zzjyVar.f3529a).f11780i;
                    zzge.f(zzeuVar3);
                    zzeuVar3.f11712f.b(e10, "Failed to send measurementEnabled to the service");
                    return;
                }
            case 3:
                synchronized (((zzjx) this.c)) {
                    ((zzjx) this.c).f11856a = false;
                    if (!((zzjx) this.c).c.s()) {
                        zzeu zzeuVar4 = ((zzge) ((zzjx) this.c).c.f3529a).f11780i;
                        zzge.f(zzeuVar4);
                        zzeuVar4.f11720n.a("Connected to service");
                        zzjy zzjyVar2 = ((zzjx) this.c).c;
                        zzek zzekVar2 = (zzek) this.f312b;
                        zzjyVar2.m();
                        Preconditions.j(zzekVar2);
                        zzjyVar2.f11858d = zzekVar2;
                        zzjyVar2.x();
                        zzjyVar2.w();
                    }
                }
                return;
            case 4:
                a();
                return;
            case 5:
                ((com.google.android.play.core.assetpacks.m1) this.f312b).f13308b.b((Intent) this.c);
                return;
            default:
                wk.h j10 = ((a2.a) this.f312b).j();
                if (j10 != null) {
                    ((wk.b) this.c).d(j10);
                    return;
                }
                throw new IllegalStateException("No pending post available");
        }
    }

    public /* synthetic */ r0(com.google.android.play.core.assetpacks.m1 m1Var, Intent intent) {
        this.f311a = 5;
        this.f312b = m1Var;
        this.c = intent;
    }

    public r0(wk.b bVar) {
        this.f311a = 6;
        this.c = bVar;
        this.f312b = new a2.a(10);
    }
}
