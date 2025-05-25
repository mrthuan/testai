package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import android.widget.PopupWindow;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.a;

/* compiled from: PopCropType.kt */
/* loaded from: classes3.dex */
public final class n implements a.InterfaceC0346a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f25702a;

    public n(m mVar) {
        this.f25702a = mVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.a.InterfaceC0346a
    public final void a(int i10) {
        m mVar = this.f25702a;
        PopupWindow popupWindow = mVar.f25701d;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        mVar.c.a(i10);
    }
}
