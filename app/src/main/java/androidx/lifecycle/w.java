package androidx.lifecycle;

/* compiled from: MutableLiveData.java */
/* loaded from: classes.dex */
public class w<T> extends LiveData<T> {
    @Override // androidx.lifecycle.LiveData
    public void j(T t4) {
        super.j(t4);
    }

    public final void k(T t4) {
        boolean z10;
        synchronized (this.f3988a) {
            if (this.f3992f == LiveData.f3987k) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f3992f = t4;
        }
        if (z10) {
            r.b.m().o(this.f3996j);
        }
    }
}
