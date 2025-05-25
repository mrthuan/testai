package qb;

import com.inmobi.media.Qb;
import jm.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29241a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f29242b;

    public /* synthetic */ m(boolean z10, int i10) {
        this.f29241a = i10;
        this.f29242b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29241a;
        boolean z10 = this.f29242b;
        switch (i10) {
            case 0:
                Qb.b(z10);
                return;
            default:
                if (z10) {
                    jm.c.c = true;
                    c.a.InterfaceC0260a interfaceC0260a = jm.c.f19316b;
                    if (interfaceC0260a != null) {
                        interfaceC0260a.u0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
