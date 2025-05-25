package k0;

import k0.f;

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.a f19461a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19462b;

    public c(f.a aVar, Object obj) {
        this.f19461a = aVar;
        this.f19462b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19461a.f19473a = this.f19462b;
    }
}
