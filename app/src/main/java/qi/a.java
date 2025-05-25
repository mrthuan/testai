package qi;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.system.f;

/* compiled from: CalloutManager.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f29348a = FunctionEval.FunctionID.EXTERNAL_FUNC;

    /* renamed from: b  reason: collision with root package name */
    public int f29349b = -65536;
    public int c = 10;

    /* renamed from: d  reason: collision with root package name */
    public int f29350d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<Integer, List<e>> f29351e = new HashMap<>();

    public a(f fVar) {
    }

    public final void a(Canvas canvas, int i10, float f10) {
        canvas.scale(f10, f10);
        List<e> list = this.f29351e.get(Integer.valueOf(i10));
        Paint a10 = sg.d.f29801b.a();
        if (list != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                e eVar = list.get(i11);
                a10.setStrokeWidth(eVar.f29354b);
                a10.setColor(eVar.c);
                canvas.drawPath(eVar.f29353a, a10);
            }
        }
    }

    public final List<e> b(int i10, boolean z10) {
        HashMap<Integer, List<e>> hashMap = this.f29351e;
        if (z10 && hashMap.get(Integer.valueOf(i10)) == null) {
            hashMap.put(Integer.valueOf(i10), new ArrayList());
        }
        return hashMap.get(Integer.valueOf(i10));
    }

    public final void c(int i10) {
        if (i10 >= 0 && i10 <= 2) {
            this.f29350d = i10;
        }
    }
}
