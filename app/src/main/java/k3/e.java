package k3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zaca;
import com.google.android.gms.common.internal.zaj;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* loaded from: classes.dex */
public final class e implements l, zaj, p9.c, x6.b {

    /* renamed from: a  reason: collision with root package name */
    public Object f19557a;

    public /* synthetic */ e(Object obj) {
        this.f19557a = obj;
    }

    @Override // k3.l
    public h3.a a() {
        if (((q3.a) ((List) this.f19557a).get(0)).c()) {
            return new h3.j((List) this.f19557a);
        }
        return new h3.i((List) this.f19557a);
    }

    @Override // k3.l
    public List b() {
        return (List) this.f19557a;
    }

    @Override // k3.l
    public boolean c() {
        if (((List) this.f19557a).size() != 1 || !((q3.a) ((List) this.f19557a).get(0)).c()) {
            return false;
        }
        return true;
    }

    public void d(Canvas canvas) {
        ji.a[] aVarArr;
        int i10;
        int i11;
        Paint a10 = sg.d.f29801b.a();
        int color = a10.getColor();
        canvas.save();
        ei.c cVar = ((oi.f) this.f19557a).f23076b;
        ji.d dVar = cVar.f16601a.f16632j;
        ArrayList arrayList = cVar.f16623x;
        if (arrayList != null) {
            aVarArr = (ji.a[]) arrayList.toArray(new ji.a[arrayList.size()]);
        } else {
            aVarArr = null;
        }
        ji.a[] aVarArr2 = aVarArr;
        if (aVarArr2 != null && dVar != null) {
            for (ji.a aVar : aVarArr2) {
                if (aVar.f19253b && ((i11 = aVar.f19260j) >= 0 || aVar.f19261k >= 0)) {
                    ei.d dVar2 = ((oi.f) this.f19557a).f23076b.f16601a;
                    ci.a aVar2 = aVar.f19252a;
                    ii.e a11 = dVar.a(i11);
                    ii.e a12 = dVar.a(aVar.f19261k);
                    RectF c = mi.a.f22038b.c((oi.f) this.f19557a, aVar2.f5690a, aVar2.f5691b, aVar2.f5692d);
                    if (a11 != null) {
                        e(canvas, a10, dVar2, a11, c);
                    }
                    if (a12 != null) {
                        e(canvas, a10, dVar2, a12, c);
                    }
                }
                if (aVar.c && ((i10 = aVar.f19262l) >= 0 || aVar.f19263m >= 0)) {
                    ei.d dVar3 = ((oi.f) this.f19557a).f23076b.f16601a;
                    ci.a aVar3 = aVar.f19252a;
                    ii.e a13 = dVar.a(i10);
                    ii.e a14 = dVar.a(aVar.f19263m);
                    RectF c10 = mi.a.f22038b.c((oi.f) this.f19557a, aVar3.c, aVar3.f5691b, aVar3.f5692d);
                    if (a13 != null) {
                        e(canvas, a10, dVar3, a13, c10);
                    }
                    if (a14 != null) {
                        e(canvas, a10, dVar3, a14, c10);
                    }
                }
                if (aVar.f19259i >= 0) {
                    e(canvas, a10, ((oi.f) this.f19557a).f23076b.f16601a, dVar.a(aVar.f19259i), mi.a.f22038b.e((oi.f) this.f19557a, aVar.f19252a));
                }
            }
        }
        a10.setColor(color);
        canvas.restore();
    }

    public void e(Canvas canvas, Paint paint, ei.d dVar, ii.e eVar, RectF rectF) {
        if (rectF.left > ((oi.f) this.f19557a).c.f23072b && eVar.e() != 0) {
            eVar.b();
            paint.setColor(dVar.i(eVar.f18504d.f18499a.f18497b));
            float f10 = rectF.left;
            canvas.drawRect(f10, rectF.top, f10 + 1.0f, rectF.bottom, paint);
        }
        if (rectF.top > ((oi.f) this.f19557a).f23077d.f23069b && eVar.g() != 0) {
            eVar.b();
            paint.setColor(dVar.i(eVar.f18504d.f18500b.f18497b));
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.drawRect(f11, f12, rectF.right, f12 + 1.0f, paint);
        }
        if (rectF.right > ((oi.f) this.f19557a).c.f23072b && eVar.f() != 0) {
            eVar.b();
            paint.setColor(dVar.i(eVar.f18504d.c.f18497b));
            float f13 = rectF.right;
            canvas.drawRect(f13, rectF.top, f13 + 1.0f, rectF.bottom, paint);
        }
        if (rectF.bottom > ((oi.f) this.f19557a).f23077d.f23069b && eVar.d() != 0) {
            eVar.b();
            paint.setColor(dVar.i(eVar.f18504d.f18501d.f18497b));
            float f14 = rectF.left;
            float f15 = rectF.bottom;
            canvas.drawRect(f14, f15, rectF.right, f15 + 1.0f, paint);
        }
    }

    @Override // pf.a
    public Object get() {
        return this.f19557a;
    }

    @Override // com.google.android.gms.common.internal.zaj
    public boolean isConnected() {
        zaca zacaVar = ((zabe) this.f19557a).f11074d;
        if (zacaVar != null && zacaVar.c()) {
            return true;
        }
        return false;
    }

    @Override // p9.c
    public Object zza() {
        Context context = (Context) ((o9.h) ((p9.c) this.f19557a)).f22768a.f17514a;
        if (context != null) {
            return new o9.e(context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
