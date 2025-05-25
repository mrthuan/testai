package qh;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import qh.d;

/* compiled from: EmphanceAnimation.java */
/* loaded from: classes3.dex */
public final class b extends a {
    public b(e eVar, int i10) {
        super(eVar, i10);
        this.f29342h = new d.a(0);
    }

    @Override // qh.d
    public final void c(int i10) {
        e eVar = this.f29336a;
        if (eVar != null && eVar.f29346b == 1) {
            int i11 = i10 * this.f29338d;
            d.a aVar = this.f29342h;
            if (aVar != null) {
                float f10 = i11;
                float f11 = this.f29337b;
                if (f10 < f11) {
                    float f12 = f10 / f11;
                    aVar.c = f12;
                    aVar.f29344b = (int) (f12 * 360.0f);
                    return;
                }
                this.f29339e = (byte) 2;
                aVar.c = 1.0f;
                aVar.f29344b = 0;
            }
        }
    }

    @Override // qh.d
    public final void start() {
        this.f29339e = (byte) 1;
        d.a aVar = this.f29342h;
        aVar.f29343a = FunctionEval.FunctionID.EXTERNAL_FUNC;
        aVar.f29344b = 0;
        aVar.c = 0.0f;
    }

    @Override // qh.d
    public final void stop() {
        this.f29339e = (byte) 2;
        d.a aVar = this.f29342h;
        if (aVar != null) {
            aVar.f29344b = 0;
            aVar.f29343a = FunctionEval.FunctionID.EXTERNAL_FUNC;
            aVar.c = 1.0f;
        }
    }
}
