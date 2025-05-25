package q9;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class d0 extends z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i0 f29105b;

    public d0(i0 i0Var) {
        this.f29105b = i0Var;
    }

    @Override // q9.z
    public final void a() {
        synchronized (this.f29105b.f29119f) {
            try {
                if (this.f29105b.f29124k.get() > 0 && this.f29105b.f29124k.decrementAndGet() > 0) {
                    this.f29105b.f29116b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                i0 i0Var = this.f29105b;
                if (i0Var.f29126m != null) {
                    i0Var.f29116b.d("Unbind from service.", new Object[0]);
                    i0 i0Var2 = this.f29105b;
                    i0Var2.f29115a.unbindService(i0Var2.f29125l);
                    i0 i0Var3 = this.f29105b;
                    i0Var3.f29120g = false;
                    i0Var3.f29126m = null;
                    i0Var3.f29125l = null;
                }
                this.f29105b.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
