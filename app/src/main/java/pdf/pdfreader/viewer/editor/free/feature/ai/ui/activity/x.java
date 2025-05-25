package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24666a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AIExperienceActivity f24667b;

    public /* synthetic */ x(AIExperienceActivity aIExperienceActivity, int i10) {
        this.f24666a = i10;
        this.f24667b = aIExperienceActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24666a;
        AIExperienceActivity aIExperienceActivity = this.f24667b;
        switch (i10) {
            case 0:
                AIExperienceActivity.a aVar = AIExperienceActivity.L;
                kotlin.jvm.internal.g.e(aIExperienceActivity, ea.a.p("R2gic1cw", "SWNOJyu6"));
                if (aIExperienceActivity.C) {
                    aIExperienceActivity.d2().f737p.f(ShapeTypes.DOUBLE_WAVE);
                    return;
                }
                return;
            default:
                AIExperienceActivity.a aVar2 = AIExperienceActivity.L;
                kotlin.jvm.internal.g.e(aIExperienceActivity, ea.a.p("O2hYc10w", "U6KdCoWK"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(aIExperienceActivity)) {
                    aIExperienceActivity.d2().f739r.setPivotX(0.0f);
                    aIExperienceActivity.d2().f739r.setPivotY(0.0f);
                    return;
                }
                aIExperienceActivity.d2().f739r.setPivotX(aIExperienceActivity.d2().f739r.getMeasuredWidth());
                aIExperienceActivity.d2().f739r.setPivotY(0.0f);
                return;
        }
    }
}
