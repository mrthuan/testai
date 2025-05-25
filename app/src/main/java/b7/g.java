package b7;

import am.x2;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.inmobi.media.C1;
import com.inmobi.media.C1619f0;
import com.inmobi.media.C1633g0;
import com.inmobi.media.C1666i5;
import com.inmobi.media.C1761p5;
import com.inmobi.media.C1770q1;
import com.inmobi.media.M6;
import com.inmobi.media.X0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.text.editor.EditorView;
import mj.b0;
import mj.l;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner$load$adRequestList$1;
import pdf.pdfreader.viewer.editor.free.convert.opt.OptTaskWrapper;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.l0;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.TypingTextView;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.PreviewCreateEditGuideView;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.y;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5368a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5369b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f5368a = i10;
        this.f5369b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5368a;
        Object obj = this.f5369b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                hVar.getClass();
                hVar.f5372d.a(new androidx.appcompat.libconvert.a(hVar, 3));
                return;
            case 1:
            case 21:
            default:
                RecentAddedActivity recentAddedActivity = (RecentAddedActivity) obj;
                RecentAddedActivity.a aVar = RecentAddedActivity.f26850l0;
                kotlin.jvm.internal.g.e(recentAddedActivity, ea.a.p("R2gic1cw", "LlRqTz50"));
                recentAddedActivity.u2();
                return;
            case 2:
                com.google.android.material.search.e eVar = (com.google.android.material.search.e) obj;
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = eVar.c;
                clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
                AnimatorSet g10 = eVar.g(true);
                g10.addListener(new com.google.android.material.search.c(eVar));
                g10.start();
                return;
            case 3:
                ((k9.g) obj).t(true);
                return;
            case 4:
                C1.a((C1) obj);
                return;
            case 5:
                M6.e((M6) obj);
                return;
            case 6:
                X0.b((String) obj);
                return;
            case 7:
                C1619f0.a((C1633g0) obj);
                return;
            case 8:
                C1666i5.c((C1666i5) obj);
                return;
            case 9:
                C1761p5.b((C1761p5) obj);
                return;
            case 10:
                C1770q1.e((C1770q1) obj);
                return;
            case 11:
                ((mj.g) obj).a();
                return;
            case 12:
                ((b0) obj).t();
                return;
            case 13:
                EditorView editorView = ((l) obj).f22113g.f21687f.getEditorView();
                if (editorView != null) {
                    editorView.d();
                    return;
                }
                return;
            case 14:
                lib.zj.pdfeditor.text.editor.a.this.l();
                return;
            case 15:
                ((AppOpenManager) obj).f23909i = false;
                return;
            case 16:
                FlutterBanner$load$adRequestList$1.f((FlutterBanner) obj);
                return;
            case 17:
                OptTaskWrapper optTaskWrapper = (OptTaskWrapper) obj;
                kotlin.jvm.internal.g.e(optTaskWrapper, ea.a.p("Emhbc2kw", "R9f2MliG"));
                y yVar = optTaskWrapper.f24130e;
                if (yVar != null) {
                    yVar.cancel();
                }
                List<? extends ul.b> list = optTaskWrapper.f24135j;
                if (list != null) {
                    optTaskWrapper.f24129d.invoke(list);
                    return;
                }
                return;
            case 18:
                pdf.pdfreader.viewer.editor.free.decrypt.d dVar = (pdf.pdfreader.viewer.editor.free.decrypt.d) obj;
                kotlin.jvm.internal.g.e(dVar, ea.a.p("R2gic1cw", "ntdaz1Iz"));
                HashMap<String, ReaderPDFCore> hashMap = dVar.f24254e;
                for (Map.Entry<String, ReaderPDFCore> entry : hashMap.entrySet()) {
                    try {
                        o9.d.r(ea.a.p("DmUGck5wNkEmZCVvRHkCSXBlPnAscgQgEGUCdCNvOyApbxdl", "ncJe7BsT"));
                        entry.getValue().onDestroy();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        androidx.activity.f.q("C2VScgBwQ0E0ZAlvBXk9SX1lAnAgclcgC2UZdBFvHyAsb0NlWWVPYz9wPmkabg==", "OzBfojcf", dp.a.a());
                    }
                }
                hashMap.clear();
                return;
            case 19:
                AIHistoryActivity aIHistoryActivity = (AIHistoryActivity) obj;
                int i11 = AIHistoryActivity.A;
                kotlin.jvm.internal.g.e(aIHistoryActivity, ea.a.p("A2g8c34w", "tOwUZHxA"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIHistoryActivity)) {
                    aIHistoryActivity.c2().f780k.c.setVisibility(8);
                    return;
                }
                return;
            case 20:
                final AISelfInfoActivity aISelfInfoActivity = (AISelfInfoActivity) obj;
                AISelfInfoActivity.a aVar2 = AISelfInfoActivity.G;
                kotlin.jvm.internal.g.e(aISelfInfoActivity, ea.a.p("O2hYc10w", "zQJrZmMf"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aISelfInfoActivity)) {
                    final int width = aISelfInfoActivity.b2().f873d.getWidth();
                    final int height = aISelfInfoActivity.b2().f873d.getHeight();
                    float textSize = aISelfInfoActivity.b2().f881l.getTextSize();
                    final int dimensionPixelSize = aISelfInfoActivity.getResources().getDimensionPixelSize(R.dimen.sp_13);
                    final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    float f10 = textSize - dimensionPixelSize;
                    ref$FloatRef.element = f10;
                    if (f10 < 0.0f) {
                        ref$FloatRef.element = 0.0f;
                    }
                    int[] iArr = new int[2];
                    aISelfInfoActivity.b2().f873d.getLocationInWindow(iArr);
                    final Ref$IntRef ref$IntRef = new Ref$IntRef();
                    int height2 = ((iArr[1] - aISelfInfoActivity.b2().f888s.getHeight()) - aISelfInfoActivity.b2().f872b.getHeight()) - ((int) (aISelfInfoActivity.b2().f879j.getHeight() * 0.035d));
                    ref$IntRef.element = height2;
                    if (height2 < 0) {
                        ref$IntRef.element = 0;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    aISelfInfoActivity.F = ofFloat;
                    if (ofFloat != null) {
                        ofFloat.setDuration(600L);
                    }
                    ValueAnimator valueAnimator = aISelfInfoActivity.F;
                    if (valueAnimator != null) {
                        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.i0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                Ref$IntRef ref$IntRef2;
                                AISelfInfoActivity.a aVar3 = AISelfInfoActivity.G;
                                String p10 = ea.a.p("O2hYc10w", "lW84YJzE");
                                AISelfInfoActivity aISelfInfoActivity2 = AISelfInfoActivity.this;
                                kotlin.jvm.internal.g.e(aISelfInfoActivity2, p10);
                                String p11 = ea.a.p("a2FfaRRUUnguUyN6ZQ==", "gK8hJmxX");
                                Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                                kotlin.jvm.internal.g.e(ref$FloatRef2, p11);
                                String p12 = ea.a.p("a3RecDRhRWczbg==", "xAWFyxAr");
                                kotlin.jvm.internal.g.e(ref$IntRef, p12);
                                kotlin.jvm.internal.g.e(valueAnimator2, ea.a.p("Lm4qbQN0Xm9u", "JqOCb7HP"));
                                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aISelfInfoActivity2)) {
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    kotlin.jvm.internal.g.c(animatedValue, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuPW5ibkVsGyBHeTtlU2sNdB5pWi4vbDlhdA==", "RO0wnZxI"));
                                    float floatValue = ((Float) animatedValue).floatValue();
                                    LottieAnimationView lottieAnimationView = aISelfInfoActivity2.b2().f873d;
                                    kotlin.jvm.internal.g.d(lottieAnimationView, ea.a.p("UWklZBpuBS4bdnVpO280b3Q=", "LAI15tqO"));
                                    ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
                                    if (layoutParams != null) {
                                        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                                        float f11 = width;
                                        ((ViewGroup.MarginLayoutParams) bVar).width = (int) ((f11 * 0.27f * floatValue) + (f11 * 0.73f));
                                        float f12 = height;
                                        ((ViewGroup.MarginLayoutParams) bVar).height = (int) ((f12 * 0.27f * floatValue) + (0.73f * f12));
                                        ((ViewGroup.MarginLayoutParams) bVar).topMargin = -((int) ((1 - floatValue) * ref$IntRef2.element));
                                        lottieAnimationView.setLayoutParams(bVar);
                                        aISelfInfoActivity2.b2().f881l.setTextSize(0, (ref$FloatRef2.element * floatValue) + dimensionPixelSize);
                                        TypingTextView typingTextView = aISelfInfoActivity2.b2().f881l;
                                        float f13 = floatValue - 0.7f;
                                        if (f13 <= 0.0f) {
                                            f13 = 0.0f;
                                        }
                                        typingTextView.setAlpha(f13);
                                        return;
                                    }
                                    throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuV25bbjtsCiA7eUFlWWFZZChvI2QNLgtvW3MaciRpC3RUYQ9vO3RIdyZkVmUNLnRvNHM-chRpBnR5YRdvMHRLTFl5GXU6UAdyLm1z", "lLUU8vNf"));
                                }
                            }
                        });
                    }
                    ValueAnimator valueAnimator2 = aISelfInfoActivity.F;
                    if (valueAnimator2 != null) {
                        valueAnimator2.addListener(new l0(aISelfInfoActivity));
                    }
                    ValueAnimator valueAnimator3 = aISelfInfoActivity.F;
                    if (valueAnimator3 != null) {
                        valueAnimator3.start();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                AIChatRecyclerView aIChatRecyclerView = (AIChatRecyclerView) obj;
                int i12 = AIChatRecyclerView.L0;
                kotlin.jvm.internal.g.e(aIChatRecyclerView, ea.a.p("R2gic1cw", "5Ygcy8oK"));
                if (aIChatRecyclerView.getScrollState() == 0) {
                    aIChatRecyclerView.z0();
                    return;
                }
                return;
            case 23:
                SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = (SubscriptionBlackFridayActivity) obj;
                int i13 = SubscriptionBlackFridayActivity.f24898a0;
                kotlin.jvm.internal.g.e(subscriptionBlackFridayActivity, ea.a.p("R2gic1cw", "YO5pkv1T"));
                if (!subscriptionBlackFridayActivity.isFinishing()) {
                    subscriptionBlackFridayActivity.C2().c.setVisibility(0);
                    return;
                }
                return;
            case 24:
                OCRResultActivity oCRResultActivity = (OCRResultActivity) obj;
                kotlin.jvm.internal.g.e(oCRResultActivity, ea.a.p("Q2gYc3Mw", "4V7qW8Ru"));
                OCRWorkFlow oCRWorkFlow = oCRResultActivity.f25107w;
                if (oCRWorkFlow != OCRWorkFlow.SCAN2PDF && oCRWorkFlow != OCRWorkFlow.IMG2PDF) {
                    v.b();
                    v.a();
                    return;
                }
                return;
            case 25:
                x2 x2Var = (x2) obj;
                int i14 = PreviewCreateEditGuideView.f25425s;
                kotlin.jvm.internal.g.e(x2Var, ea.a.p("F3QjaQBfEHVu", "35q5NVq9"));
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.92f, 1, 1.0f);
                scaleAnimation.setAnimationListener(new zm.a(x2Var));
                scaleAnimation.setDuration(500L);
                scaleAnimation.setFillAfter(true);
                x2Var.f1653b.startAnimation(scaleAnimation);
                return;
            case 26:
                CameraActivity cameraActivity = (CameraActivity) obj;
                int i15 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "OoGcjKGi"));
                cameraActivity.I2(1);
                return;
            case 27:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) obj;
                ImageAdjustActivity.a aVar3 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("IWhfc2ww", "NpU6HppP"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(imageAdjustActivity)) {
                    imageAdjustActivity.w2();
                    return;
                }
                return;
            case 28:
                ReaderPreviewActivity.this.V1.setVisibility(8);
                return;
        }
    }
}
