package k3;

import android.content.Context;
import androidx.activity.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.ArrayList;

/* compiled from: AnimatableTextProperties.java */
/* loaded from: classes.dex */
public final class j implements x6.b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f19560a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f19561b;
    public Object c;

    /* renamed from: d  reason: collision with root package name */
    public Object f19562d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f19560a = obj;
        this.f19561b = obj2;
        this.c = obj3;
        this.f19562d = obj4;
    }

    public final float a() {
        Object obj = this.f19560a;
        int size = ((ArrayList) obj).size();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            pdf.pdfreader.viewer.editor.free.widget.ticker.b bVar = (pdf.pdfreader.viewer.editor.free.widget.ticker.b) ((ArrayList) obj).get(i10);
            bVar.a();
            f10 += bVar.f28917l;
        }
        return f10;
    }

    public final void b() {
        Object obj = this.f19560a;
        int size = ((ArrayList) obj).size();
        for (int i10 = 0; i10 < size; i10++) {
            pdf.pdfreader.viewer.editor.free.widget.ticker.b bVar = (pdf.pdfreader.viewer.editor.free.widget.ticker.b) ((ArrayList) obj).get(i10);
            bVar.a();
            bVar.f28919n = bVar.f28917l;
        }
    }

    public final void c(float f10) {
        Object obj = this.f19560a;
        int size = ((ArrayList) obj).size();
        for (int i10 = 0; i10 < size; i10++) {
            pdf.pdfreader.viewer.editor.free.widget.ticker.b bVar = (pdf.pdfreader.viewer.editor.free.widget.ticker.b) ((ArrayList) obj).get(i10);
            if (f10 == 1.0f) {
                bVar.c = bVar.f28909d;
                bVar.f28920o = 0.0f;
                bVar.f28921p = 0.0f;
            }
            float f11 = bVar.f28908b.c;
            float a10 = a0.a.a(Math.abs(bVar.f28912g - bVar.f28911f), f11, f10, f11);
            int i11 = (int) a10;
            float f12 = (1.0f - f10) * bVar.f28921p;
            int i12 = bVar.f28922q;
            bVar.f28914i = ((a10 - i11) * f11 * i12) + f12;
            bVar.f28913h = (i11 * i12) + bVar.f28911f;
            bVar.f28915j = f11;
            float f13 = bVar.f28916k;
            bVar.f28917l = r.l(bVar.f28918m, f13, f10, f13);
        }
    }

    @Override // pf.a
    public final Object get() {
        e7.a aVar = (e7.a) ((pf.a) this.f19562d).get();
        return new b7.a((Context) ((pf.a) this.f19560a).get(), (c7.d) ((pf.a) this.f19561b).get(), (SchedulerConfig) ((pf.a) this.c).get());
    }

    public j(pdf.pdfreader.viewer.editor.free.widget.ticker.c cVar) {
        this.f19560a = new ArrayList();
        this.f19561b = cVar;
    }
}
