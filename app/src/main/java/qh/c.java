package qh;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import qh.d;

/* compiled from: FadeAnimation.java */
/* loaded from: classes3.dex */
public final class c extends a {
    public c(e eVar, int i10) {
        super(eVar, i10);
        int i11;
        int i12;
        int i13 = FunctionEval.FunctionID.EXTERNAL_FUNC;
        byte b10 = eVar.f29346b;
        if (b10 == 0) {
            i11 = 0;
        } else {
            i11 = 255;
        }
        this.f29340f = new d.a(i11);
        if (b10 == 0) {
            i12 = 255;
        } else {
            i12 = 0;
        }
        this.f29341g = new d.a(i12);
        this.f29342h = new d.a(b10 == 0 ? 0 : i13);
    }

    @Override // qh.d
    public final void c(int i10) {
        d.a aVar;
        e eVar = this.f29336a;
        if (eVar != null && (aVar = this.f29342h) != null) {
            byte b10 = eVar.f29346b;
            int i11 = this.f29338d;
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 == 2) {
                        float f10 = i10 * i11;
                        float f11 = this.f29337b;
                        if (f10 < f11) {
                            float f12 = f10 / f11;
                            aVar.c = f12;
                            aVar.f29343a = (int) ((1.0f - f12) * 255.0f);
                            return;
                        }
                        this.f29339e = (byte) 2;
                        aVar.c = 1.0f;
                        aVar.f29343a = 0;
                        return;
                    }
                    return;
                }
                f(i10 * i11);
                return;
            }
            f(i10 * i11);
        }
    }

    public final void f(int i10) {
        float f10 = i10;
        float f11 = this.f29337b;
        if (f10 < f11) {
            float f12 = f10 / f11;
            d.a aVar = this.f29342h;
            aVar.c = f12;
            aVar.f29343a = (int) (f12 * 255.0f);
            return;
        }
        this.f29339e = (byte) 2;
        d.a aVar2 = this.f29342h;
        aVar2.c = 1.0f;
        aVar2.f29343a = FunctionEval.FunctionID.EXTERNAL_FUNC;
    }

    @Override // qh.d
    public final void start() {
        this.f29339e = (byte) 1;
        this.f29342h.c = 0.0f;
    }

    @Override // qh.d
    public final void stop() {
        this.f29339e = (byte) 2;
        d.a aVar = this.f29342h;
        if (aVar != null) {
            aVar.f29344b = 0;
            aVar.c = 1.0f;
            e eVar = this.f29336a;
            if (eVar != null) {
                byte b10 = eVar.f29346b;
                if (b10 != 0) {
                    if (b10 == 2) {
                        aVar.f29343a = 0;
                        return;
                    }
                    return;
                }
                aVar.f29343a = FunctionEval.FunctionID.EXTERNAL_FUNC;
            }
        }
    }
}
