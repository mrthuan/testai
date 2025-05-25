package pb;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C1720m3;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23842a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f23843b;

    public /* synthetic */ b(KeyEvent.Callback callback, int i10) {
        this.f23842a = i10;
        this.f23843b = callback;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f23842a;
        KeyEvent.Callback callback = this.f23843b;
        switch (i10) {
            case 0:
                return InMobiAdActivity.b((InMobiAdActivity) callback, view, motionEvent);
            case 1:
                return C1720m3.b((C1720m3) callback, view, motionEvent);
            default:
                RenameDialog renameDialog = (RenameDialog) callback;
                int i11 = RenameDialog.f27470y;
                g.e(renameDialog, ea.a.p("R2gic1cw", "jf3mEis5"));
                if (motionEvent.getAction() == 1) {
                    AppCompatEditText appCompatEditText = renameDialog.f27471n;
                    if (appCompatEditText != null) {
                        appCompatEditText.setSelectAllOnFocus(true);
                    }
                    AppCompatEditText appCompatEditText2 = renameDialog.f27471n;
                    if (appCompatEditText2 != null) {
                        appCompatEditText2.selectAll();
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
