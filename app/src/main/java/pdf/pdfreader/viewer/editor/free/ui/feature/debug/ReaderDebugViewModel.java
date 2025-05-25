package pdf.pdfreader.viewer.editor.free.ui.feature.debug;

import androidx.lifecycle.j0;
import kotlinx.coroutines.flow.r;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ReaderDebugViewModel.kt */
/* loaded from: classes3.dex */
public final class ReaderDebugViewModel extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public final tf.c f27850d;

    /* renamed from: e  reason: collision with root package name */
    public final r f27851e;

    /* renamed from: f  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b f27852f;

    /* renamed from: g  reason: collision with root package name */
    public final tf.c f27853g;

    public ReaderDebugViewModel() {
        tf.c a10 = kotlin.a.a(new cg.a<r<Boolean>>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugViewModel$_splashSubscriptionFlow$2
            @Override // cg.a
            public final r<Boolean> invoke() {
                return t0.a(Boolean.FALSE);
            }
        });
        this.f27850d = a10;
        this.f27851e = (r) a10.getValue();
        this.f27853g = kotlin.a.a(new cg.a<f>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugViewModel$shortcutRationaleHelper$2
            @Override // cg.a
            public final f invoke() {
                return new f();
            }
        });
    }
}
