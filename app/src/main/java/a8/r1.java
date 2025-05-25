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
public final class r1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f313a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f314b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzq f315d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f316e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ zzjy f317f;

    public r1(zzjy zzjyVar, AtomicReference atomicReference, String str, String str2, zzq zzqVar, boolean z10) {
        this.f317f = zzjyVar;
        this.f313a = atomicReference;
        this.f314b = str;
        this.c = str2;
        this.f315d = zzqVar;
        this.f316e = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjy zzjyVar;
        zzek zzekVar;
        synchronized (this.f313a) {
            try {
                zzjyVar = this.f317f;
                zzekVar = zzjyVar.f11858d;
            } catch (RemoteException e10) {
                zzeu zzeuVar = ((zzge) this.f317f.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11712f.d("(legacy) Failed to get user properties; remote exception", null, this.f314b, e10);
                this.f313a.set(Collections.emptyList());
                atomicReference = this.f313a;
            }
            if (zzekVar == null) {
                zzeu zzeuVar2 = ((zzge) zzjyVar.f3529a).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11712f.d("(legacy) Failed to get user properties; not connected to service", null, this.f314b, this.c);
                this.f313a.set(Collections.emptyList());
                this.f313a.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.j(this.f315d);
                this.f313a.set(zzekVar.f0(this.f314b, this.c, this.f316e, this.f315d));
            } else {
                this.f313a.set(zzekVar.e(null, this.f314b, this.c, this.f316e));
            }
            this.f317f.x();
            atomicReference = this.f313a;
            atomicReference.notify();
        }
    }
}
