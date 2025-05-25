package lib.zj.office.system;

import android.graphics.Paint;
import android.view.View;

/* compiled from: MainControl.java */
/* loaded from: classes3.dex */
public final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f21047a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f21048b;

    public o(p pVar, boolean z10) {
        this.f21048b = pVar;
        this.f21047a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f21048b;
        try {
            View view = pVar.getView();
            Object invoke = view.getClass().getMethod("isHardwareAccelerated", null).invoke(view, new Object[0]);
            if (invoke != null && (invoke instanceof Boolean) && ((Boolean) invoke).booleanValue()) {
                view.getClass().getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(view, Integer.valueOf(view.getClass().getField("LAYER_TYPE_SOFTWARE").getInt(null)), null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        pVar.r(26, Boolean.FALSE);
        pVar.r(19, null);
        if (pVar.f21051d == 3) {
            if (!this.f21047a) {
                pVar.f21053f.N();
            }
        } else {
            pVar.f21053f.N();
        }
        pVar.getView().postInvalidate();
    }
}
