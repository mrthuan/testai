package qb;

import com.inmobi.media.C1619f0;
import com.inmobi.media.C1633g0;
import com.inmobi.media.C1870xb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29243a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ byte f29244b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0(Object obj, byte b10, int i10) {
        this.f29243a = i10;
        this.c = obj;
        this.f29244b = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29243a;
        byte b10 = this.f29244b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                C1619f0.a((C1633g0) obj, b10);
                return;
            default:
                C1870xb.a((C1870xb) obj, b10);
                return;
        }
    }
}
