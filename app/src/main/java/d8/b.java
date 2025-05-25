package d8;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class b<T> implements OnSuccessListener, OnFailureListener, OnCanceledListener {

    /* renamed from: a  reason: collision with root package name */
    public final Object f16123a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final int f16124b;
    public final o c;

    /* renamed from: d  reason: collision with root package name */
    public int f16125d;

    /* renamed from: e  reason: collision with root package name */
    public int f16126e;

    /* renamed from: f  reason: collision with root package name */
    public int f16127f;

    /* renamed from: g  reason: collision with root package name */
    public Exception f16128g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16129h;

    public b(int i10, o oVar) {
        this.f16124b = i10;
        this.c = oVar;
    }

    public final void a() {
        int i10 = this.f16125d + this.f16126e + this.f16127f;
        int i11 = this.f16124b;
        if (i10 == i11) {
            Exception exc = this.f16128g;
            o oVar = this.c;
            if (exc != null) {
                int i12 = this.f16126e;
                oVar.t(new ExecutionException(i12 + " out of " + i11 + " underlying tasks failed", this.f16128g));
            } else if (this.f16129h) {
                oVar.v();
            } else {
                oVar.u(null);
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void c() {
        synchronized (this.f16123a) {
            this.f16127f++;
            this.f16129h = true;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.f16123a) {
            this.f16126e++;
            this.f16128g = exc;
            a();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t4) {
        synchronized (this.f16123a) {
            this.f16125d++;
            a();
        }
    }
}
