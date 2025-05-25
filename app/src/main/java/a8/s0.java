package a8;

import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzjy;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class s0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f319a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f320b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzij f321d;

    public s0(zzij zzijVar, AtomicReference atomicReference, String str, String str2) {
        this.f321d = zzijVar;
        this.f319a = atomicReference;
        this.f320b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjy o10 = ((zzge) this.f321d.f3529a).o();
        AtomicReference atomicReference = this.f319a;
        String str = this.f320b;
        String str2 = this.c;
        o10.m();
        o10.n();
        o10.y(new p1(o10, atomicReference, str, str2, o10.v(false)));
    }
}
