package t0;

import java.util.ArrayList;
import t0.k;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class j implements w0.a<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f29888a;

    public j(String str) {
        this.f29888a = str;
    }

    @Override // w0.a
    public final void accept(k.a aVar) {
        k.a aVar2 = aVar;
        synchronized (k.c) {
            y.i<String, ArrayList<w0.a<k.a>>> iVar = k.f29891d;
            ArrayList<w0.a<k.a>> orDefault = iVar.getOrDefault(this.f29888a, null);
            if (orDefault != null) {
                iVar.remove(this.f29888a);
                for (int i10 = 0; i10 < orDefault.size(); i10++) {
                    orDefault.get(i10).accept(aVar2);
                }
            }
        }
    }
}
