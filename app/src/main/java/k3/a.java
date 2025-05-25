package k3;

import h3.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimatableColorValue.java */
/* loaded from: classes.dex */
public final class a extends m {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ArrayList arrayList, int i10) {
        super(arrayList, 0);
        this.c = i10;
    }

    @Override // k3.l
    public final h3.a a() {
        int i10 = this.c;
        Object obj = this.f19572b;
        switch (i10) {
            case 0:
                return new h3.b((List) obj);
            default:
                return new n((List) obj);
        }
    }
}
