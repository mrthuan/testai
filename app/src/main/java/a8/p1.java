package a8;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class p1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f284a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f285b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzq f286d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzjy f287e;

    public p1(zzjy zzjyVar, AtomicReference atomicReference, String str, String str2, zzq zzqVar) {
        this.f287e = zzjyVar;
        this.f284a = atomicReference;
        this.f285b = str;
        this.c = str2;
        this.f286d = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjy zzjyVar;
        zzek zzekVar;
        synchronized (this.f284a) {
            try {
                zzjyVar = this.f287e;
                zzekVar = zzjyVar.f11858d;
            } catch (RemoteException e10) {
                zzeu zzeuVar = ((zzge) this.f287e.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.d("(legacy) Failed to get conditional properties; remote exception", null, this.f285b, e10);
                this.f284a.set(Collections.emptyList());
                atomicReference = this.f284a;
            }
            if (zzekVar == null) {
                zzeu zzeuVar2 = ((zzge) zzjyVar.f3529a).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11712f.d("(legacy) Failed to get conditional properties; not connected to service", null, this.f285b, this.c);
                this.f284a.set(Collections.emptyList());
                this.f284a.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.j(this.f286d);
                this.f284a.set(zzekVar.M(this.f285b, this.c, this.f286d));
            } else {
                this.f284a.set(zzekVar.t(null, this.f285b, this.c));
            }
            this.f287e.x();
            atomicReference = this.f284a;
            atomicReference.notify();
        }
    }
}
