package qb;

import com.inmobi.media.AbstractC1846w0;
import com.inmobi.media.C1756p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29289a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC1846w0 f29290b;

    public /* synthetic */ z0(AbstractC1846w0 abstractC1846w0, int i10) {
        this.f29289a = i10;
        this.f29290b = abstractC1846w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29289a;
        AbstractC1846w0 abstractC1846w0 = this.f29290b;
        switch (i10) {
            case 0:
                C1756p0.a(abstractC1846w0);
                return;
            default:
                AbstractC1846w0.d(abstractC1846w0);
                return;
        }
    }
}
