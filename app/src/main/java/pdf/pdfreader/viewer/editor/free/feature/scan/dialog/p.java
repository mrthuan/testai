package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import android.widget.PopupWindow;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.c;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;

/* compiled from: PopFilterType.kt */
/* loaded from: classes3.dex */
public final class p implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f25707a;

    public p(o oVar) {
        this.f25707a = oVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.adapter.c.a
    public final void a(GroupAiFilterType groupAiFilterType) {
        o oVar = this.f25707a;
        PopupWindow popupWindow = oVar.f25706e;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        oVar.c.a(groupAiFilterType);
    }
}
