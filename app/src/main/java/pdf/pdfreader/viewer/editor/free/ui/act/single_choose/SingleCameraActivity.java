package pdf.pdfreader.viewer.editor.free.ui.act.single_choose;

import android.animation.AnimatorSet;
import android.content.Intent;
import android.view.animation.ScaleAnimation;
import ea.a;
import gn.b;
import java.io.File;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.single_choose.SingleImageChooseActivity;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import tf.d;

/* compiled from: SingleCameraActivity.kt */
/* loaded from: classes3.dex */
public final class SingleCameraActivity extends CameraActivity {
    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity
    public final void A2() {
        SingleImageChooseActivity.a aVar = SingleImageChooseActivity.f26980o1;
        boolean z10 = this.f25718j0;
        String str = this.f27001t;
        String p10 = a.p("Jm5CZQt0", "kJGPVbXO");
        aVar.getClass();
        SingleImageChooseActivity.a.a(this, z10, str, p10, false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity
    public final void D2(String eventValue) {
        g.e(eventValue, "eventValue");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity
    public final void E2() {
        super.E2();
        b.a aVar = b.f17937a;
        String p10 = a.p("UmQvaR5nPXAab0BvNnM-byt0bWMqaSBr", "0Ht8xuTT");
        aVar.getClass();
        b.a.b(this, p10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity
    public final void o2() {
        finish();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity, rl.a
    public final void s0() {
        d dVar;
        if (this.f25727s0) {
            AnimatorSet animatorSet = this.f25728t0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ScaleAnimation scaleAnimation = this.f25729u0;
            if (scaleAnimation != null) {
                scaleAnimation.cancel();
            }
        }
        q2().L.setVisibility(8);
        q2().N.setEnabled(true);
        this.Z = false;
        ul.b bVar = this.f25726r0;
        if (bVar != null) {
            File file = new File(bVar.f30404a);
            if (file.exists() && file.length() > 0) {
                Intent intent = new Intent();
                intent.putExtra(a.p("QWU4dR90MmEGaA==", "pf0W3ssu"), bVar.f30404a);
                setResult(-1, intent);
                finish();
                dVar = d.f30009a;
            } else {
                t1.b(a.p("XG4fYRhlMmgddFtGAG4_cyxlViA2YTdoVG4pdBFlGmlAdDgsU3IHdAdyWiAw", "tF1bS0ay"));
                j1.e(this, getResources().getString(R.string.arg_res_0x7f130096), true, null, -1);
                return;
            }
        } else {
            dVar = null;
        }
        if (dVar == null) {
            j1.e(this, getResources().getString(R.string.arg_res_0x7f130096), true, null, -1);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity
    public final Class<?> t2() {
        return SingleCameraActivity.class;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity
    public final void C2() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity
    public final void H2() {
    }
}
