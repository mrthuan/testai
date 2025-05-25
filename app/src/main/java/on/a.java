package on;

import androidx.lifecycle.j0;
import ig.h;
import kotlinx.coroutines.flow.StateFlowImpl;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: CameraViewModel.kt */
/* loaded from: classes3.dex */
public final class a extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public final StateFlowImpl f23509d;

    /* renamed from: e  reason: collision with root package name */
    public final StateFlowImpl f23510e;

    public a() {
        jn.a.c.getClass();
        h<Object>[] hVarArr = jn.a.f19323d;
        StateFlowImpl a10 = t0.a(new mn.a(((Boolean) jn.a.f19328i.b(hVarArr[4])).booleanValue(), ((Boolean) jn.a.f19329j.b(hVarArr[5])).booleanValue(), 7));
        this.f23509d = a10;
        this.f23510e = a10;
    }

    public final void d() {
        StateFlowImpl stateFlowImpl = this.f23509d;
        stateFlowImpl.setValue(mn.a.a((mn.a) stateFlowImpl.b(), !((mn.a) stateFlowImpl.b()).f22145a, false, false, false, false, 30));
    }
}
