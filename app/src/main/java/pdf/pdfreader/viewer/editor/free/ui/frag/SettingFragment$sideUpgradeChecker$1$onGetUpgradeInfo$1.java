package pdf.pdfreader.viewer.editor.free.ui.frag;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: SettingFragment.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$sideUpgradeChecker$1$onGetUpgradeInfo$1", f = "SettingFragment.kt", l = {ShapeTypes.FLOW_CHART_INTERNAL_STORAGE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SettingFragment$sideUpgradeChecker$1$onGetUpgradeInfo$1 extends SuspendLambda implements cg.p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ h5.m $appUpdateManager;
    final /* synthetic */ int $version;
    int label;
    final /* synthetic */ SettingFragment$sideUpgradeChecker$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingFragment$sideUpgradeChecker$1$onGetUpgradeInfo$1(Activity activity, int i10, h5.m mVar, SettingFragment$sideUpgradeChecker$1 settingFragment$sideUpgradeChecker$1, kotlin.coroutines.c<? super SettingFragment$sideUpgradeChecker$1$onGetUpgradeInfo$1> cVar) {
        super(2, cVar);
        this.$activity = activity;
        this.$version = i10;
        this.$appUpdateManager = mVar;
        this.this$0 = settingFragment$sideUpgradeChecker$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SettingFragment$sideUpgradeChecker$1$onGetUpgradeInfo$1(this.$activity, this.$version, this.$appUpdateManager, this.this$0, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r1 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r1 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        r7 = "B";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
        r7 = "A";
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            androidx.activity.s.u0(r7)
            goto L31
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            androidx.activity.s.u0(r7)
            android.app.Activity r7 = r6.$activity
            int r1 = r6.$version
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r6.label = r2
            lg.a r3 = kotlinx.coroutines.j0.f20207b
            e5.f r4 = new e5.f
            r5 = 0
            r4.<init>(r7, r1, r5)
            java.lang.Object r7 = pdf.pdfreader.viewer.editor.free.utils.t0.w0(r3, r4, r6)
            if (r7 != r0) goto L31
            return r0
        L31:
            e5.d r7 = (e5.d) r7
            if (r7 == 0) goto L9e
            java.lang.String r7 = r7.f16458b
            java.lang.String r0 = "A"
            boolean r7 = kotlin.jvm.internal.g.a(r7, r0)
            r1 = 0
            java.lang.String r3 = "B"
            if (r7 == 0) goto L52
            h5.m r7 = r6.$appUpdateManager
            o9.a r7 = r7.f18038d
            if (r7 == 0) goto L4f
            boolean r7 = r7.a(r1)
            if (r7 == 0) goto L4f
            r1 = r2
        L4f:
            if (r1 == 0) goto L61
            goto L63
        L52:
            h5.m r7 = r6.$appUpdateManager
            o9.a r7 = r7.f18038d
            if (r7 == 0) goto L5f
            boolean r7 = r7.a(r2)
            if (r7 == 0) goto L5f
            r1 = r2
        L5f:
            if (r1 == 0) goto L63
        L61:
            r7 = r3
            goto L64
        L63:
            r7 = r0
        L64:
            c5.a r1 = c5.a.b()
            r1.getClass()
            ea.a.f16518b = r2
            h5.m r1 = r6.$appUpdateManager
            boolean r2 = kotlin.jvm.internal.g.a(r7, r0)
            r1.f18044j = r2
            pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$sideUpgradeChecker$1 r1 = r6.this$0
            android.app.Activity r2 = r6.$activity
            h5.m r4 = r6.$appUpdateManager
            r1.getClass()
            h5.b.j(r2, r4)
            boolean r0 = kotlin.jvm.internal.g.a(r0, r7)
            if (r0 == 0) goto L90
            android.app.Activity r7 = r6.$activity
            java.lang.String r0 = "update:update_nomal_done:set"
            pdf.pdfreader.viewer.editor.free.utils.q0.B(r7, r0)
            goto L9e
        L90:
            boolean r7 = kotlin.jvm.internal.g.a(r3, r7)
            if (r7 == 0) goto L9e
            android.app.Activity r7 = r6.$activity
            java.lang.String r0 = "update:update_major_done:set"
            pdf.pdfreader.viewer.editor.free.utils.q0.B(r7, r0)
        L9e:
            tf.d r7 = tf.d.f30009a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$sideUpgradeChecker$1$onGetUpgradeInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((SettingFragment$sideUpgradeChecker$1$onGetUpgradeInfo$1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
