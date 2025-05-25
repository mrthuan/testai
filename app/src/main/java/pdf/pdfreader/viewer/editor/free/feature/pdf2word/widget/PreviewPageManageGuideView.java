package pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget;

import am.x1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao.v0;
import b1.e;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: PreviewPageManageGuideView.kt */
/* loaded from: classes3.dex */
public final class PreviewPageManageGuideView extends ConstraintLayout {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f25608s = 0;

    /* renamed from: q  reason: collision with root package name */
    public b f25609q;

    /* renamed from: r  reason: collision with root package name */
    public final x1 f25610r;

    /* compiled from: PreviewPageManageGuideView.kt */
    /* loaded from: classes3.dex */
    public static final class a extends l0 {
        public a() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            g.e(v10, "v");
            PreviewPageManageGuideView previewPageManageGuideView = PreviewPageManageGuideView.this;
            b bVar = previewPageManageGuideView.f25609q;
            if (bVar != null) {
                ReaderPreviewActivity.q2(((v0) bVar).f5141a);
            }
            previewPageManageGuideView.setVisibility(8);
        }
    }

    /* compiled from: PreviewPageManageGuideView.kt */
    /* loaded from: classes3.dex */
    public interface b {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewPageManageGuideView(Context context) {
        this(context, null, 0, 14);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "X50kX26r"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        postDelayed(new e(this, 22), 300L);
        return super.onTouchEvent(motionEvent);
    }

    public final void r() {
        x1 x1Var = this.f25610r;
        if (x1Var != null) {
            setVisibility(8);
            View view = x1Var.f1647e;
            ((LottieAnimationView) view).d();
            ((LottieAnimationView) view).setFrame(0);
        }
    }

    public final void s(AppCompatImageView appCompatImageView) {
        x1 x1Var;
        AppCompatImageView appCompatImageView2;
        if (appCompatImageView != null && (x1Var = this.f25610r) != null && (appCompatImageView2 = x1Var.f1645b) != null) {
            int[] iArr = new int[2];
            appCompatImageView.getLocationOnScreen(iArr);
            int width = appCompatImageView.getWidth();
            int height = appCompatImageView.getHeight();
            ViewParent parent = appCompatImageView2.getParent();
            g.c(parent, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuNW5GbhNsJiA7eUFlWWFZZChvI2RbdgFlQi44aSB3InI1dXA=", "KUenZkfJ"));
            int[] iArr2 = new int[2];
            ((ViewGroup) parent).getLocationOnScreen(iArr2);
            int i10 = iArr[0] - iArr2[0];
            int i11 = iArr[1] - iArr2[1];
            ViewGroup.LayoutParams layoutParams = appCompatImageView2.getLayoutParams();
            g.c(layoutParams, ea.a.p("JHUabFFjWW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA-eQZlUWFWZDpvD2Qadj5lTy4EaSx3cXIbdQEuHGEwZyNuOmEIb010GGEUYVlz", "t4Jvq8Kr"));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = width;
            marginLayoutParams.height = height;
            marginLayoutParams.leftMargin = i10;
            marginLayoutParams.topMargin = i11;
            appCompatImageView2.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setOnPageManageGuideClickListener(b bVar) {
        this.f25609q = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewPageManageGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        g.e(context, ea.a.p("LG9fdBx4dA==", "xriLzoTB"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewPageManageGuideView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        g.e(context, ea.a.p("W287dA14dA==", "HH8Uh46e"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PreviewPageManageGuideView(android.content.Context r11, android.util.AttributeSet r12, int r13, int r14) {
        /*
            r10 = this;
            r0 = r14 & 2
            if (r0 == 0) goto L5
            r12 = 0
        L5:
            r14 = r14 & 4
            r0 = 0
            if (r14 == 0) goto Lb
            r13 = r0
        Lb:
            java.lang.String r14 = "LG9fdBx4dA=="
            java.lang.String r1 = "4xIdjmDC"
            java.lang.String r14 = ea.a.p(r14, r1)
            kotlin.jvm.internal.g.e(r11, r14)
            r10.<init>(r11, r12, r13, r0)
            r12 = 8
            r10.setVisibility(r12)
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            r12 = 2131558752(0x7f0d0160, float:1.8742829E38)
            r11.inflate(r12, r10)
            r11 = 2131361992(0x7f0a00c8, float:1.8343752E38)
            android.view.View r12 = com.google.android.play.core.assetpacks.c.u(r10, r11)
            androidx.appcompat.widget.AppCompatTextView r12 = (androidx.appcompat.widget.AppCompatTextView) r12
            if (r12 == 0) goto La6
            r11 = 2131362946(0x7f0a0482, float:1.8345687E38)
            android.view.View r13 = com.google.android.play.core.assetpacks.c.u(r10, r11)
            androidx.appcompat.widget.AppCompatImageView r13 = (androidx.appcompat.widget.AppCompatImageView) r13
            if (r13 == 0) goto La6
            r11 = 2131363573(0x7f0a06f5, float:1.8346959E38)
            android.view.View r14 = com.google.android.play.core.assetpacks.c.u(r10, r11)
            androidx.appcompat.widget.AppCompatImageView r14 = (androidx.appcompat.widget.AppCompatImageView) r14
            if (r14 == 0) goto La6
            r11 = 2131363574(0x7f0a06f6, float:1.834696E38)
            android.view.View r0 = com.google.android.play.core.assetpacks.c.u(r10, r11)
            r5 = r0
            com.airbnb.lottie.LottieAnimationView r5 = (com.airbnb.lottie.LottieAnimationView) r5
            if (r5 == 0) goto La6
            r11 = 2131364561(0x7f0a0ad1, float:1.8348963E38)
            android.view.View r6 = com.google.android.play.core.assetpacks.c.u(r10, r11)
            if (r6 == 0) goto La6
            r11 = 2131364562(0x7f0a0ad2, float:1.8348965E38)
            android.view.View r7 = com.google.android.play.core.assetpacks.c.u(r10, r11)
            if (r7 == 0) goto La6
            r11 = 2131364563(0x7f0a0ad3, float:1.8348967E38)
            android.view.View r8 = com.google.android.play.core.assetpacks.c.u(r10, r11)
            if (r8 == 0) goto La6
            r11 = 2131364564(0x7f0a0ad4, float:1.8348969E38)
            android.view.View r9 = com.google.android.play.core.assetpacks.c.u(r10, r11)
            if (r9 == 0) goto La6
            am.x1 r11 = new am.x1
            r0 = r11
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f25610r = r11
            java.lang.String r11 = "UmkbbwNUFEMdbkBlB3Q="
            java.lang.String r0 = "F5iw6Ado"
            ea.a.p(r11, r0)
            r11 = 3
            r0 = 2131166609(0x7f070591, float:1.7947468E38)
            kl.h.a(r12, r11, r0)
            pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PreviewPageManageGuideView$a r11 = new pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PreviewPageManageGuideView$a
            r11.<init>()
            r13.setOnClickListener(r11)
            u4.j r11 = new u4.j
            r12 = 15
            r11.<init>(r10, r12)
            r14.setOnClickListener(r11)
            return
        La6:
            android.content.res.Resources r12 = r10.getResources()
            java.lang.String r11 = r12.getResourceName(r11)
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = "AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpMmhqSR46IA=="
            java.lang.String r14 = "hPmvFJZl"
            java.lang.String r13 = ea.a.p(r13, r14)
            java.lang.String r11 = r13.concat(r11)
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PreviewPageManageGuideView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
