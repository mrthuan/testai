package pdf.pdfreader.viewer.editor.free.feature.guide.vm;

import androidx.lifecycle.j0;
import ea.a;
import kotlinx.coroutines.flow.v;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: UserGuideViewModel.kt */
/* loaded from: classes3.dex */
public final class UserGuideViewModel extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public boolean f25050d;

    /* renamed from: e  reason: collision with root package name */
    public final v f25051e;

    /* renamed from: f  reason: collision with root package name */
    public final v f25052f;

    public UserGuideViewModel() {
        v d10 = a.d(0, 7);
        this.f25051e = d10;
        this.f25052f = d10;
    }

    public final void d() {
        t0.d0(t0.X(this), null, null, new UserGuideViewModel$sendGuideFinishEvent$1(this, null), 3);
    }

    public final void e() {
        t0.d0(t0.X(this), null, null, new UserGuideViewModel$sendInquiryFinishEvent$1(this, null), 3);
    }
}
