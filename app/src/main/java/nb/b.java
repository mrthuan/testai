package nb;

import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f22405a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f22406b;

    public /* synthetic */ b(d dVar, e eVar) {
        this.f22405a = dVar;
        this.f22406b = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        d dVar = this.f22405a;
        e eVar = this.f22406b;
        j jVar = dVar.f22412b;
        synchronized (jVar) {
            FileOutputStream openFileOutput = jVar.f22433a.openFileOutput(jVar.f22434b, 0);
            openFileOutput.write(eVar.toString().getBytes("UTF-8"));
            openFileOutput.close();
        }
        return null;
    }
}
