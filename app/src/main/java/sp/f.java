package sp;

import android.app.Activity;
import android.os.Message;

/* compiled from: WPSExporter.java */
/* loaded from: classes3.dex */
public final class f extends a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ h f29850i;

    public f(h hVar) {
        this.f29850i = hVar;
    }

    @Override // lib.zj.office.system.i
    public final void N() {
        ea.a.p("GFBiRQFwWHIuZTg-Sz4=", "JuJJth4X");
        ea.a.p("OnBVYQ1lF1Q1byZiFHJIU0FhGnVz", "enpKoApc");
    }

    @Override // lib.zj.office.system.i
    public final Activity m() {
        return this.f29850i.f29853b;
    }

    @Override // lib.zj.office.system.i
    public final void n1(int i10) {
        Runnable runnable = this.f29838d;
        if (runnable != null) {
            runnable.run();
        }
        this.f29841g = true;
        e eVar = this.f29850i.f29856f;
        if (eVar != null) {
            eVar.removeMessages(4099);
        }
    }

    @Override // lib.zj.office.system.i
    public final void v0(int i10, Throwable th2) {
        h hVar = this.f29850i;
        e eVar = hVar.f29856f;
        if (eVar != null) {
            Message obtainMessage = eVar.obtainMessage(4099);
            obtainMessage.arg1 = i10;
            obtainMessage.obj = th2;
            hVar.f29856f.sendMessageDelayed(obtainMessage, 500L);
        }
    }

    @Override // lib.zj.office.system.i
    public final void T(boolean z10) {
    }
}
