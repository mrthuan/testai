package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.f;
import j.a;

/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1806a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.C0256a f1807b;
    public final /* synthetic */ ComponentActivity.b c;

    public g(ComponentActivity.b bVar, int i10, a.C0256a c0256a) {
        this.c = bVar;
        this.f1806a = i10;
        this.f1807b = c0256a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.b<O> bVar;
        T t4 = this.f1807b.f18971a;
        ComponentActivity.b bVar2 = this.c;
        String str = (String) bVar2.f1835b.get(Integer.valueOf(this.f1806a));
        if (str != null) {
            f.a aVar = (f.a) bVar2.f1838f.get(str);
            if (aVar != null && (bVar = aVar.f1841a) != 0) {
                if (bVar2.f1837e.remove(str)) {
                    bVar.c(t4);
                    return;
                }
                return;
            }
            bVar2.f1840h.remove(str);
            bVar2.f1839g.put(str, t4);
        }
    }
}
