package pb;

import am.e0;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C1720m3;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23840a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f23841b;

    public /* synthetic */ a(KeyEvent.Callback callback, int i10) {
        this.f23840a = i10;
        this.f23841b = callback;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f23840a;
        KeyEvent.Callback callback = this.f23841b;
        switch (i10) {
            case 0:
                return InMobiAdActivity.a((InMobiAdActivity) callback, view, motionEvent);
            case 1:
                return C1720m3.c((C1720m3) callback, view, motionEvent);
            case 2:
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.b bVar = (pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.b) callback;
                int i11 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.b.f25366r;
                g.e(bVar, ea.a.p("O2hYc10w", "6gC1K4sz"));
                if (motionEvent.getAction() == 1) {
                    e0 e0Var = bVar.f23549n;
                    g.b(e0Var);
                    e0Var.f851d.setSelectAllOnFocus(true);
                    e0 e0Var2 = bVar.f23549n;
                    g.b(e0Var2);
                    e0Var2.f851d.selectAll();
                }
                return false;
            default:
                EnterFileNameDialog enterFileNameDialog = (EnterFileNameDialog) callback;
                int i12 = EnterFileNameDialog.f27427x;
                g.e(enterFileNameDialog, ea.a.p("R2gic1cw", "cmyNaMg5"));
                if (motionEvent.getAction() == 1) {
                    AppCompatEditText appCompatEditText = enterFileNameDialog.f27430p;
                    if (appCompatEditText != null) {
                        appCompatEditText.setSelectAllOnFocus(true);
                    }
                    AppCompatEditText appCompatEditText2 = enterFileNameDialog.f27430p;
                    if (appCompatEditText2 != null) {
                        appCompatEditText2.selectAll();
                    }
                }
                return false;
        }
    }
}
