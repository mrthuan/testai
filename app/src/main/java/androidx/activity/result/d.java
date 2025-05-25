package androidx.activity.result;

import java.util.HashMap;

/* compiled from: ActivityResultRegistry.java */
/* loaded from: classes.dex */
public final class d extends c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f1830a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j.a f1831b;
    public final /* synthetic */ f c;

    public d(f fVar, String str, j.a aVar) {
        this.c = fVar;
        this.f1830a = str;
        this.f1831b = aVar;
    }

    @Override // androidx.activity.result.c
    public final void a(Object obj) {
        f fVar = this.c;
        HashMap hashMap = fVar.c;
        String str = this.f1830a;
        Integer num = (Integer) hashMap.get(str);
        j.a aVar = this.f1831b;
        if (num != null) {
            fVar.f1837e.add(str);
            try {
                fVar.b(num.intValue(), aVar, obj);
                return;
            } catch (Exception e10) {
                fVar.f1837e.remove(str);
                throw e10;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }
}
