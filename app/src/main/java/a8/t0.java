package a8;

import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class t0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f325a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f326b;
    public final /* synthetic */ zzij c;

    public /* synthetic */ t0(zzij zzijVar, AtomicReference atomicReference, int i10) {
        this.f325a = i10;
        this.c = zzijVar;
        this.f326b = atomicReference;
    }

    private final void a() {
        synchronized (this.f326b) {
            AtomicReference atomicReference = this.f326b;
            Object obj = this.c.f3529a;
            atomicReference.set(Integer.valueOf(((zzge) obj).f11778g.p(((zzge) obj).k().r(), zzeh.O)));
            this.f326b.notify();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f325a) {
            case 0:
                synchronized (this.f326b) {
                    AtomicReference atomicReference = this.f326b;
                    Object obj = this.c.f3529a;
                    atomicReference.set(Boolean.valueOf(((zzge) obj).f11778g.v(((zzge) obj).k().r(), zzeh.L)));
                    this.f326b.notify();
                }
                return;
            default:
                a();
                return;
        }
    }
}
