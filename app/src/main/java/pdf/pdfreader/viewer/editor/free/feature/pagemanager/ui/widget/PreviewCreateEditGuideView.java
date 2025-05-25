package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget;

import am.x2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import b1.e;
import cg.a;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.g;
import tf.d;

/* compiled from: PreviewCreateEditGuideView.kt */
/* loaded from: classes3.dex */
public final class PreviewCreateEditGuideView extends ConstraintLayout {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f25425s = 0;

    /* renamed from: q  reason: collision with root package name */
    public final x2 f25426q;

    /* renamed from: r  reason: collision with root package name */
    public a<d> f25427r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewCreateEditGuideView(Context context) {
        this(context, null, 0, 14);
        g.e(context, ea.a.p("LG9fdBx4dA==", "1YjgEIuG"));
    }

    public final a<d> getOnCloseCallBack() {
        return this.f25427r;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        postDelayed(new e(this, 20), 300L);
        return super.onTouchEvent(motionEvent);
    }

    public final void r() {
        x2 x2Var = this.f25426q;
        if (x2Var != null) {
            setVisibility(8);
            LottieAnimationView lottieAnimationView = x2Var.c;
            lottieAnimationView.d();
            lottieAnimationView.setFrame(0);
        }
    }

    public final void setOnCloseCallBack(a<d> aVar) {
        this.f25427r = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewCreateEditGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "ZnR5VKjk"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewCreateEditGuideView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        g.e(context, ea.a.p("LG8gdAx4dA==", "nGONi9HD"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PreviewCreateEditGuideView(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13) {
        /*
            r9 = this;
            r0 = r13 & 2
            if (r0 == 0) goto L5
            r11 = 0
        L5:
            r13 = r13 & 4
            r0 = 0
            if (r13 == 0) goto Lb
            r12 = r0
        Lb:
            java.lang.String r13 = "LG9fdBx4dA=="
            java.lang.String r1 = "gYrXRmXy"
            java.lang.String r13 = ea.a.p(r13, r1)
            kotlin.jvm.internal.g.e(r10, r13)
            r9.<init>(r10, r11, r12, r0)
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r10)
            r12 = 2131558747(0x7f0d015b, float:1.8742819E38)
            r11.inflate(r12, r9)
            r11 = 2131362367(0x7f0a023f, float:1.8344513E38)
            android.view.View r12 = com.google.android.play.core.assetpacks.c.u(r9, r11)
            androidx.appcompat.widget.AppCompatImageView r12 = (androidx.appcompat.widget.AppCompatImageView) r12
            if (r12 == 0) goto L8f
            r11 = 2131362368(0x7f0a0240, float:1.8344515E38)
            android.view.View r13 = com.google.android.play.core.assetpacks.c.u(r9, r11)
            r4 = r13
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            if (r4 == 0) goto L8f
            r11 = 2131362369(0x7f0a0241, float:1.8344517E38)
            android.view.View r13 = com.google.android.play.core.assetpacks.c.u(r9, r11)
            com.airbnb.lottie.LottieAnimationView r13 = (com.airbnb.lottie.LottieAnimationView) r13
            if (r13 == 0) goto L8f
            r11 = 2131362684(0x7f0a037c, float:1.8345156E38)
            android.view.View r5 = com.google.android.play.core.assetpacks.c.u(r9, r11)
            if (r5 == 0) goto L8f
            r11 = 2131362685(0x7f0a037d, float:1.8345158E38)
            android.view.View r6 = com.google.android.play.core.assetpacks.c.u(r9, r11)
            if (r6 == 0) goto L8f
            r11 = 2131362686(0x7f0a037e, float:1.834516E38)
            android.view.View r7 = com.google.android.play.core.assetpacks.c.u(r9, r11)
            if (r7 == 0) goto L8f
            r11 = 2131362687(0x7f0a037f, float:1.8345162E38)
            android.view.View r8 = com.google.android.play.core.assetpacks.c.u(r9, r11)
            if (r8 == 0) goto L8f
            am.x2 r11 = new am.x2
            r0 = r11
            r1 = r9
            r2 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f25426q = r11
            boolean r10 = pdf.pdfreader.viewer.editor.free.utils.a0.i(r10)
            if (r10 == 0) goto L80
            r10 = 1127481344(0x43340000, float:180.0)
            r13.setRotationY(r10)
            goto L84
        L80:
            r10 = 0
            r13.setRotationY(r10)
        L84:
            k9.c r10 = new k9.c
            r11 = 11
            r10.<init>(r9, r11)
            r12.setOnClickListener(r10)
            return
        L8f:
            android.content.res.Resources r10 = r9.getResources()
            java.lang.String r10 = r10.getResourceName(r11)
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "FWkfcxtuVCA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA=="
            java.lang.String r13 = "qkXlr3Kt"
            java.lang.String r12 = ea.a.p(r12, r13)
            java.lang.String r10 = r12.concat(r10)
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.PreviewCreateEditGuideView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
