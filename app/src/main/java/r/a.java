package r;

import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29425a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f29425a) {
            case 0:
                b.m().f29427a.f29429b.execute(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
