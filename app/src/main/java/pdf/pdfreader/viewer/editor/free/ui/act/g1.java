package pdf.pdfreader.viewer.editor.free.ui.act;

import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26936a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RecentAddedActivity f26937b;

    public /* synthetic */ g1(RecentAddedActivity recentAddedActivity, int i10) {
        this.f26936a = i10;
        this.f26937b = recentAddedActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26936a;
        RecentAddedActivity recentAddedActivity = this.f26937b;
        switch (i10) {
            case 0:
                RecentAddedActivity.l2(recentAddedActivity);
                return;
            default:
                RecentAddedActivity.a aVar = RecentAddedActivity.f26850l0;
                kotlin.jvm.internal.g.e(recentAddedActivity, ea.a.p("R2gic1cw", "wqjaA59s"));
                recentAddedActivity.t2();
                return;
        }
    }
}
