package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24590a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jl.a f24591b;

    public /* synthetic */ h(jl.a aVar, int i10) {
        this.f24590a = i10;
        this.f24591b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24590a;
        boolean z10 = false;
        jl.a aVar = this.f24591b;
        switch (i10) {
            case 0:
                AIChatActivity aIChatActivity = (AIChatActivity) aVar;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("R2gic1cw", "KpovSkVj"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIChatActivity)) {
                    AIChatRecyclerView aIChatRecyclerView = aIChatActivity.B;
                    if (aIChatRecyclerView != null && aIChatRecyclerView.getScrollState() == 0) {
                        z10 = true;
                    }
                    if (z10) {
                        aIChatActivity.z2();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AIChatActivity aIChatActivity2 = (AIChatActivity) aVar;
                kotlin.jvm.internal.g.e(aIChatActivity2, ea.a.p("R2gic1cw", "EqjxeQwa"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIChatActivity2)) {
                    AIChatActivity.a aVar2 = AIChatActivity.f24356v0;
                    AIChatRecyclerView aIChatRecyclerView2 = aIChatActivity2.B;
                    if (aIChatRecyclerView2 != null) {
                        aIChatRecyclerView2.h0(0);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AIChatActivity aIChatActivity3 = (AIChatActivity) aVar;
                AIChatActivity.a aVar3 = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatActivity3, ea.a.p("Q2gic0Iw", "lZ7KfUPL"));
                if (!aIChatActivity3.isFinishing()) {
                    pdf.pdfreader.viewer.editor.free.utils.j1.e(aIChatActivity3, aIChatActivity3.getString(R.string.arg_res_0x7f13003e), true, null, -1);
                    return;
                }
                return;
            default:
                AIExperienceActivity aIExperienceActivity = (AIExperienceActivity) aVar;
                AIExperienceActivity.a aVar4 = AIExperienceActivity.L;
                kotlin.jvm.internal.g.e(aIExperienceActivity, ea.a.p("R2gic1cw", "qNcV5ACq"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIExperienceActivity)) {
                    aIExperienceActivity.d2().f734m.d();
                    aIExperienceActivity.d2().f734m.setVisibility(8);
                    aIExperienceActivity.d2().f726e.setVisibility(0);
                    aIExperienceActivity.d2().f726e.post(new q0(aIExperienceActivity, 2));
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aIExperienceActivity.d2().f726e, ea.a.p("A2NVbC5Y", "hGp4KVp7"), 0.0f, 1.0f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aIExperienceActivity.d2().f726e, ea.a.p("KWMzbDxZ", "mHZRYpFk"), 0.0f, 1.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aIExperienceActivity.d2().f726e, ea.a.p("Umw7aGE=", "XETxnhak"), 0.0f, 1.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    aIExperienceActivity.I = animatorSet;
                    animatorSet.setDuration(300L);
                    AnimatorSet animatorSet2 = aIExperienceActivity.I;
                    if (animatorSet2 != null) {
                        animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3);
                    }
                    AnimatorSet animatorSet3 = aIExperienceActivity.I;
                    if (animatorSet3 != null) {
                        animatorSet3.addListener(new d0(aIExperienceActivity));
                    }
                    AnimatorSet animatorSet4 = aIExperienceActivity.I;
                    if (animatorSet4 != null) {
                        animatorSet4.start();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
