package pdf.pdfreader.viewer.editor.free.ui.convert;

import a6.h;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m0;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import com.lib.flutter.encrypt.EngineHelper;
import gl.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.data.ImageChooseWorkFlow;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.q;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.OCRTransportImageExecutor;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.CameraMode;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.TurnPageMode;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.single_choose.SingleImageChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.GalleryAdapter;
import pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g;
import pdf.pdfreader.viewer.editor.free.ui.dialog.n;
import pdf.pdfreader.viewer.editor.free.ui.dialog.o;
import pdf.pdfreader.viewer.editor.free.ui.dialog.p;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.utils.a1;
import pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.extension.i;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.r0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;
import u4.j;

/* compiled from: ReaderImg2PDFChooseActivity.kt */
/* loaded from: classes3.dex */
public class ReaderImg2PDFChooseActivity extends pdf.pdfreader.viewer.editor.free.ui.act.a {
    public static final a M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;

    /* renamed from: c1  reason: collision with root package name */
    public static final String f27335c1;

    /* renamed from: i1  reason: collision with root package name */
    public static final String f27336i1;

    /* renamed from: j1  reason: collision with root package name */
    public static final String f27337j1;

    /* renamed from: k1  reason: collision with root package name */
    public static final String f27338k1;

    /* renamed from: l1  reason: collision with root package name */
    public static final String f27339l1;

    /* renamed from: m1  reason: collision with root package name */
    public static final String f27340m1;

    /* renamed from: n1  reason: collision with root package name */
    public static final String f27341n1;
    public int A0;
    public boolean B0;
    public int C0;
    public final b D0;
    public ValueAnimator E0;
    public boolean F0;
    public boolean G0;
    public long H0;
    public int I0;
    public boolean J0;
    public View K;
    public boolean K0;
    public View L;
    public final pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b L0;
    public AppCompatTextView M;
    public FrameLayout N;
    public LinearLayout O;
    public AppCompatTextView P;
    public RecyclerView Q;
    public RecyclerView R;
    public LinearLayout S;
    public LinearLayout T;
    public View U;
    public ImageView V;
    public ImageView W;
    public View X;
    public AppCompatImageView Y;
    public ConstraintLayout Z;

    /* renamed from: a0  reason: collision with root package name */
    public TextView f27342a0;

    /* renamed from: b0  reason: collision with root package name */
    public LinearLayout f27343b0;

    /* renamed from: c0  reason: collision with root package name */
    public LinearLayout f27344c0;

    /* renamed from: d0  reason: collision with root package name */
    public ProgressView f27345d0;

    /* renamed from: e0  reason: collision with root package name */
    public g f27346e0;

    /* renamed from: f0  reason: collision with root package name */
    public a1 f27347f0;

    /* renamed from: g0  reason: collision with root package name */
    public r f27348g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f27349h0;

    /* renamed from: i0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f27350i0;

    /* renamed from: j0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f27351j0;

    /* renamed from: k0  reason: collision with root package name */
    public final androidx.activity.result.c<String[]> f27352k0;

    /* renamed from: l0  reason: collision with root package name */
    public final androidx.activity.result.c<String[]> f27353l0;

    /* renamed from: m0  reason: collision with root package name */
    public final tf.c f27354m0;

    /* renamed from: n0  reason: collision with root package name */
    public final tf.c f27355n0;

    /* renamed from: o0  reason: collision with root package name */
    public n f27356o0;

    /* renamed from: p0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.utils.drag.a f27357p0;

    /* renamed from: q0  reason: collision with root package name */
    public final tf.c f27358q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f27359r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f27360s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f27361t0;

    /* renamed from: u0  reason: collision with root package name */
    public String f27362u0;

    /* renamed from: v0  reason: collision with root package name */
    public String f27363v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f27364w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f27365x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f27366y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f27367z0;
    public final tf.c I = kotlin.a.a(new cg.a<uo.a>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$viewModel$2
        {
            super(0);
        }

        @Override // cg.a
        public final uo.a invoke() {
            return (uo.a) new m0(ReaderImg2PDFChooseActivity.this).a(uo.a.class);
        }
    });
    public final Handler J = new Handler(Looper.getMainLooper());

    /* compiled from: ReaderImg2PDFChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, boolean z10, String str, String workflow, boolean z11, String str2, CameraMode cameraMode, TurnPageMode turnPageMode) {
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(workflow, "workflow");
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.g();
            String h10 = v.h();
            new ArrayList();
            List<ul.a> d10 = ImageConvertDataRepository.f26541g.d();
            if (d10 != null) {
                for (ul.a aVar : d10) {
                    if (kotlin.jvm.internal.g.a(h10, aVar.f30401a)) {
                        ImageConvertDataRepository.f26543i.j(aVar);
                        ImageConvertDataRepository.f26547m.j(aVar.f30401a);
                    }
                }
            }
            Intent intent = new Intent(context, ReaderImg2PDFChooseActivity.class);
            intent.putExtra(ea.a.p("WGUyXxpuC3QtZ1VsBWUkeQ==", "dqSPTsv5"), false);
            intent.putExtra(ea.a.p("XXNuZhRvD188aA9yZA==", "nf41fbgH"), z10);
            intent.putExtra(ea.a.p("KXJebSZzWHUoY2U=", "edZLbcL1"), str);
            intent.putExtra(ea.a.p("KXJebSZ3WHIxZiZvdw==", "NNN4y8D6"), workflow);
            intent.putExtra(ea.a.p("JnNucxFvQF85YSdlB2E=", "oZTJfiNt"), z11);
            intent.putExtra(ea.a.p("WGUyXxVyDW0=", "tSz4tya9"), str2);
            if (cameraMode != null) {
                intent.putExtra(ea.a.p("UGEmZQFhPW0dZGU=", "0m4BTLgX"), cameraMode.ordinal());
            }
            if (turnPageMode != null) {
                intent.putExtra(ea.a.p("Q3UlbgN5PWU=", "Zx7WWM9x"), turnPageMode.ordinal());
            }
            context.startActivity(intent);
        }

        public static void b(Activity context, String source, String str) {
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(source, "source");
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.g();
            Intent intent = new Intent(context, ReaderImg2PDFChooseActivity.class);
            intent.putExtra(ea.a.p("UmU1XzxuB3QXZwdsWGUleQ==", "YP9LUnej"), true);
            intent.putExtra(ea.a.p("UXIebW5zCHU6Y2U=", "lx7q1gBC"), source);
            intent.putExtra(ea.a.p("VXIkbSx3DXIZZlhvdw==", "PUFkzy85"), str);
            context.startActivityForResult(intent, 205);
        }
    }

    /* compiled from: ReaderImg2PDFChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements com.lib.flutter.encrypt.e {
        public b() {
        }

        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerImg2PDFChooseActivity)) {
                return;
            }
            if (BillingConfigImpl.c.w()) {
                String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTmkoYQJlZ1A0RixvL3YqckVCGG5ZZSggOWgadw==", "WI24UpoA");
                int i10 = zk.a.f32399a;
                t1.b(p10);
                return;
            }
            k kVar = k.f17927a;
            ea.a.p("YWUqZBZyK20VMmREL0M-bytzV0EldCp2GHQtIBZoWHc=", "qTe7FY51");
            kVar.getClass();
            ea.a.p("em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg==", "JWRUSUMZ");
            tn.a.d(readerImg2PDFChooseActivity, ea.a.p("LG9fdhxyQ3A-ZhVhZA==", "rV1OADeZ"), ea.a.p("UG8ldhZyFnAWZmtiCG44ZTZfQWgpdw==", "aHEQKsFT"), ea.a.p("UmwpdW0=", "5hBjKUys"), false);
            LinearLayout linearLayout = readerImg2PDFChooseActivity.T;
            if (linearLayout != null) {
                k.e(str, linearLayout);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("I2FIbwx0dmQYbz50Gm0=", "ocT6FmVx"));
                throw null;
            }
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
            ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerImg2PDFChooseActivity)) {
                return;
            }
            k kVar = k.f17927a;
            ea.a.p("HWVQZBxyfm09MhpEM0MAb1pzC0EmdAx2J3RPIABuCWkrZXBkK29YdBlvJHQUaQZlcg==", "m6kJN6oA");
            kVar.getClass();
            ea.a.p("em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg==", "JWRUSUMZ");
            LinearLayout linearLayout = readerImg2PDFChooseActivity.T;
            if (linearLayout != null) {
                if (linearLayout.getChildCount() > 0) {
                    LinearLayout linearLayout2 = readerImg2PDFChooseActivity.T;
                    if (linearLayout2 != null) {
                        View childAt = linearLayout2.getChildAt(0);
                        if (childAt != null && (childAt instanceof BannerLoadingAnimation)) {
                            LinearLayout linearLayout3 = readerImg2PDFChooseActivity.T;
                            if (linearLayout3 != null) {
                                linearLayout3.removeAllViews();
                                return;
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("BGFKbyB0CWQKbxJ0W20=", "r7h3UHTg"));
                                throw null;
                            }
                        }
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("I2FIbwx0dmQYbz50Gm0=", "wkPrOkeB"));
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("X2EybwZ0I2Qwb0B0Bm0=", "6xfaZJUT"));
            throw null;
        }
    }

    /* compiled from: ReaderImg2PDFChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements DragSelectionProcessor.b {
        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
        public final void a(int i10, int i11, boolean z10, boolean z11) {
            boolean z12;
            boolean z13;
            ul.b bVar;
            ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
            if (z11) {
                dp.a a10 = dp.a.a();
                String p10 = ea.a.p("Bm1WMilEcUE5dCN2HHQRLRgtQy0hcgRnZWUmZS90AW8hUENvGmVEczVyamkGUw1sUGMaZWQ=", "vAzv6JLh");
                a10.getClass();
                dp.a.c(p10);
                ArrayList<ul.b> arrayList = readerImg2PDFChooseActivity.v2().f27149f;
                if (arrayList != null && (bVar = arrayList.get(i10)) != null) {
                    z13 = bVar.f30407e;
                } else {
                    z13 = false;
                }
                readerImg2PDFChooseActivity.f27359r0 = !z13;
            }
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    ul.b bVar2 = (ul.b) m.t0(i12, readerImg2PDFChooseActivity.v2().f27149f);
                    if (bVar2 != null) {
                        boolean z14 = readerImg2PDFChooseActivity.f27359r0;
                        tf.c cVar = readerImg2PDFChooseActivity.f27358q0;
                        if (z14) {
                            if (!bVar2.f30407e && !bVar2.a()) {
                                if (readerImg2PDFChooseActivity.h2()) {
                                    ImageConvertDataRepository.f26536a.getClass();
                                    if (ImageConvertDataRepository.d()) {
                                        String string = readerImg2PDFChooseActivity.getString(R.string.arg_res_0x7f130257);
                                        kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG0neBxsCm0CdCdyCGFQaC5kLGcSdCk=", "ckxmCoL5"));
                                        ReaderImg2PDFChooseActivity.o2(readerImg2PDFChooseActivity, string);
                                        return;
                                    }
                                }
                                if (readerImg2PDFChooseActivity.f27006y == CameraMode.Ocr) {
                                    ImageConvertDataRepository.f26536a.getClass();
                                    if (ImageConvertDataRepository.e(40)) {
                                        String string2 = readerImg2PDFChooseActivity.getString(R.string.arg_res_0x7f130257);
                                        kotlin.jvm.internal.g.d(string2, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQG0keDpsOG0-dGdyA2EsaFRkJmdHdCk=", "y8dJQW8f"));
                                        ReaderImg2PDFChooseActivity.o2(readerImg2PDFChooseActivity, string2);
                                        return;
                                    }
                                }
                                readerImg2PDFChooseActivity.x2().getClass();
                                ImageConvertDataRepository.f26536a.getClass();
                                ImageConvertDataRepository.i(bVar2);
                                readerImg2PDFChooseActivity.v2().notifyItemChanged(i12, (ArrayList) cVar.getValue());
                            }
                        } else if (bVar2.f30407e) {
                            readerImg2PDFChooseActivity.x2().getClass();
                            ImageConvertDataRepository imageConvertDataRepository = ImageConvertDataRepository.f26536a;
                            imageConvertDataRepository.getClass();
                            ImageConvertDataRepository.l(bVar2);
                            imageConvertDataRepository.getClass();
                            ArrayList arrayList2 = (ArrayList) ImageConvertDataRepository.f26546l.d();
                            if (arrayList2 != null && arrayList2.size() == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                readerImg2PDFChooseActivity.v2().notifyItemChanged(i12, (ArrayList) cVar.getValue());
                            } else {
                                readerImg2PDFChooseActivity.z2();
                            }
                        }
                    }
                    if (i12 == i11) {
                        break;
                    }
                    i12++;
                }
            }
            dp.a a11 = dp.a.a();
            StringBuilder f10 = a0.d.f("Img2PDFActivity-----updateSelection start: ", i10, " end: ", i11, " isSelected: ");
            f10.append(z10);
            String sb2 = f10.toString();
            a11.getClass();
            dp.a.c(sb2);
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
        public final Set<Integer> q() {
            androidx.activity.f.q("Bm1WMilEcUE5dCN2HHQRLRgtQy0hcgRnOWU7ZQl0DG8hUENvGmVEczVyamcQdDtlWWUNdCxvbg==", "Ny3ojWje", dp.a.a());
            return null;
        }
    }

    /* compiled from: ReaderImg2PDFChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements n.a {
        public d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.n.a
        public final void a(ul.a aVar) {
            ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
            if (!kotlin.jvm.internal.g.a(readerImg2PDFChooseActivity.x2().f30454g.d(), aVar.f30401a)) {
                tn.a.d(readerImg2PDFChooseActivity, ea.a.p("Wm0scxZsB2N0", "T5Y3LO5N"), ea.a.p("C21fcx1sFGM8XxV3XXQ0aGdjPmkqaw==", "Aeb8xqhd"), readerImg2PDFChooseActivity.c2().concat("_total"), false);
                tn.a.d(readerImg2PDFChooseActivity, ea.a.p("Wm0scxZsB2N0", "SC4UHfV8"), ea.a.p("K20NczBsNWM8XxV3XXQ0aGdjPmkqaw==", "QyBjUPWq"), androidx.activity.f.m(readerImg2PDFChooseActivity.c2(), "_", readerImg2PDFChooseActivity.u2()), false);
            }
            readerImg2PDFChooseActivity.x2().getClass();
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.j(aVar);
        }
    }

    /* compiled from: ReaderImg2PDFChooseActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f27371a;

        public e(l lVar) {
            ea.a.p("FnUdYwNpG24=", "PHpswtNC");
            this.f27371a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final l a() {
            return this.f27371a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f27371a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f27371a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f27371a.invoke(obj);
        }
    }

    /* compiled from: Animator.kt */
    /* loaded from: classes3.dex */
    public static final class f implements Animator.AnimatorListener {
        public f() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            kotlin.jvm.internal.g.e(animator, "animator");
            ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
            readerImg2PDFChooseActivity.F0 = false;
            readerImg2PDFChooseActivity.G0 = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            kotlin.jvm.internal.g.e(animator, "animator");
            ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
            readerImg2PDFChooseActivity.F0 = false;
            readerImg2PDFChooseActivity.G0 = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            kotlin.jvm.internal.g.e(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            kotlin.jvm.internal.g.e(animator, "animator");
        }
    }

    static {
        ea.a.p("em0sMiNEJEERdF12AHR5", "RhL0lUhi");
        N0 = ea.a.p("JGVIXxBuXnQFZytsGWUaeQ==", "JFmwgtgM");
        O0 = ea.a.p("OXMFZkVvB188aA9yZA==", "2YPZ7jxU");
        P0 = ea.a.p("VXIkbSxzDXUAY2U=", "wJaIE60h");
        f27335c1 = ea.a.p("WnMUbhZlBl8BY1VuNm0zZC1h", "tovRDu57");
        f27336i1 = ea.a.p("W2E9ZSxhDmwtbVFkAGEJcCFyX2k1cypvbg==", "g8weD0DO");
        f27337j1 = ea.a.p("WnMYcw5vEV8rYQtlRmE=", "DH3GffbE");
        f27338k1 = ea.a.p("JGVIXx9yWG0=", "efltNeUd");
        f27339l1 = ea.a.p("WnMUchZ0A2tl", "XjanYXyJ");
        f27340m1 = ea.a.p("PWVFYRJlaHA1cyN0HG9u", "pnVcDvzm");
        f27341n1 = ea.a.p("LGFcZQthaG01ZGU=", "N6iGvnl4");
        M0 = new a();
    }

    public ReaderImg2PDFChooseActivity() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new j.d(), new t5.f(17));
        kotlin.jvm.internal.g.d(registerForActivityResult, ea.a.p("QWUsaQB0B3I0b0ZBCnQ_di10S1IjczZssYDXdDBkCW9HdCRtXyBAYR5iQW1LKVwgZCASfQ==", "SqqKepii"));
        this.f27350i0 = registerForActivityResult;
        androidx.activity.result.c<Intent> registerForActivityResult2 = registerForActivityResult(new j.d(), new t5.g(15));
        kotlin.jvm.internal.g.d(registerForActivityResult2, ea.a.p("QWUsaQB0B3I0b0ZBCnQ_di10S1IjczZstIDQdAZkN29HdCRtXyBAYR5iQW1LKVwgZCASfQ==", "VvGuMd25"));
        this.f27351j0 = registerForActivityResult2;
        androidx.activity.result.c<String[]> registerForActivityResult3 = registerForActivityResult(new j.b(), new h5.e(this, 15));
        kotlin.jvm.internal.g.d(registerForActivityResult3, ea.a.p("PWVWaQp0UnIcbzhBFnQBdlx0F1IgcxBsjYDqfW0gZCBvIBEgWSAXIHp9QCBVIEggFSBOfQ==", "LMD6oLgD"));
        this.f27352k0 = registerForActivityResult3;
        androidx.activity.result.c<String[]> registerForActivityResult4 = registerForActivityResult(new j.b(), new androidx.appcompat.libconvert.helper.b(this, 15));
        kotlin.jvm.internal.g.d(registerForActivityResult4, ea.a.p("QWUsaQB0B3I0b0ZBCnQ_di10S1IjczZsrIDTfWIgRyATIGsgUyBCIFJ9PiBJIHYgZCASfQ==", "NuhgY3PS"));
        this.f27353l0 = registerForActivityResult4;
        this.f27354m0 = kotlin.a.a(new cg.a<GalleryAdapter>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$galleryAdapter$2

            /* compiled from: ReaderImg2PDFChooseActivity.kt */
            /* loaded from: classes3.dex */
            public static final class a implements GalleryAdapter.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ ReaderImg2PDFChooseActivity f27373a;

                public a(ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity) {
                    this.f27373a = readerImg2PDFChooseActivity;
                }

                @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.GalleryAdapter.a
                public final void a(int i10) {
                    pdf.pdfreader.viewer.editor.free.utils.drag.a aVar = this.f27373a.f27357p0;
                    if (aVar != null) {
                        aVar.d(i10);
                    }
                }

                @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.GalleryAdapter.a
                public final void b(long j10, String str) {
                    ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = this.f27373a;
                    readerImg2PDFChooseActivity.getClass();
                    tn.a.d(readerImg2PDFChooseActivity, ea.a.p("OW0Ec1NsFGN0", "AqPc6qRB"), ea.a.p("Jm1WcxxsUmMuXzxpEHc3Y1lpDWs=", "khnRtXR2"), readerImg2PDFChooseActivity.c2().concat("_total"), false);
                    tn.a.d(readerImg2PDFChooseActivity, ea.a.p("Wm0scxZsB2N0", "Mt5PeALN"), ea.a.p("HW0Wcw5sD2M8XxBpUXcIY1RpMWs=", "Y1tqkjnW"), androidx.activity.f.m(readerImg2PDFChooseActivity.c2(), "_", readerImg2PDFChooseActivity.u2()), false);
                    LinearLayout linearLayout = readerImg2PDFChooseActivity.T;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                        readerImg2PDFChooseActivity.B2(j10);
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("X2EybwZ0I2Qwb0B0Bm0=", "PXq6x4vS"));
                    throw null;
                }

                @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.GalleryAdapter.a
                public final void c() {
                    ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = this.f27373a;
                    if (readerImg2PDFChooseActivity.h2()) {
                        ImageConvertDataRepository.f26536a.getClass();
                        if (ImageConvertDataRepository.d()) {
                            String string = readerImg2PDFChooseActivity.getString(R.string.arg_res_0x7f130257);
                            kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG0neBxsBW06dCVyVGFQaC5kLGcSdCk=", "lSz1cAJH"));
                            ReaderImg2PDFChooseActivity.o2(readerImg2PDFChooseActivity, string);
                            return;
                        }
                    }
                    ImageConvertDataRepository imageConvertDataRepository = ImageConvertDataRepository.f26536a;
                    imageConvertDataRepository.getClass();
                    if (ImageConvertDataRepository.f26540f == null) {
                        ImageConvertDataRepository.f26540f = new ArrayList<>();
                    }
                    ArrayList<ul.b> arrayList = ImageConvertDataRepository.f26540f;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList<ul.b> arrayList2 = ImageConvertDataRepository.f26540f;
                    if (arrayList2 != null) {
                        ArrayList arrayList3 = (ArrayList) readerImg2PDFChooseActivity.x2().f30453f.d();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList2.addAll(arrayList3);
                    }
                    readerImg2PDFChooseActivity.x2().getClass();
                    imageConvertDataRepository.getClass();
                    ImageConvertDataRepository.k();
                    readerImg2PDFChooseActivity.z2();
                    readerImg2PDFChooseActivity.D2();
                    readerImg2PDFChooseActivity.A2();
                }
            }

            {
                super(0);
            }

            @Override // cg.a
            public final GalleryAdapter invoke() {
                return new GalleryAdapter(ReaderImg2PDFChooseActivity.this.x2(), new a(ReaderImg2PDFChooseActivity.this));
            }
        });
        this.f27355n0 = kotlin.a.a(new cg.a<SelectGalleryAdapter>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$selectAdapter$2

            /* compiled from: ReaderImg2PDFChooseActivity.kt */
            /* loaded from: classes3.dex */
            public static final class a implements SelectGalleryAdapter.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ ReaderImg2PDFChooseActivity f27378a;

                public a(ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity) {
                    this.f27378a = readerImg2PDFChooseActivity;
                }

                @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter.a
                public final void a(ul.b bVar, int i10) {
                    this.f27378a.E2(bVar);
                }

                @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.convert.SelectGalleryAdapter.a
                public final void b(ul.b bVar, int i10) {
                    boolean z10;
                    ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = this.f27378a;
                    readerImg2PDFChooseActivity.x2().getClass();
                    ImageConvertDataRepository imageConvertDataRepository = ImageConvertDataRepository.f26536a;
                    imageConvertDataRepository.getClass();
                    ImageConvertDataRepository.l(bVar);
                    imageConvertDataRepository.getClass();
                    ArrayList arrayList = (ArrayList) ImageConvertDataRepository.f26546l.d();
                    if (arrayList != null && arrayList.size() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int indexOf = readerImg2PDFChooseActivity.v2().f27149f.indexOf(bVar);
                        if (indexOf >= 0) {
                            readerImg2PDFChooseActivity.v2().notifyItemChanged(indexOf, (ArrayList) readerImg2PDFChooseActivity.f27358q0.getValue());
                            return;
                        }
                        return;
                    }
                    readerImg2PDFChooseActivity.z2();
                }
            }

            {
                super(0);
            }

            @Override // cg.a
            public final SelectGalleryAdapter invoke() {
                ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
                a aVar = new a(readerImg2PDFChooseActivity);
                readerImg2PDFChooseActivity.getClass();
                return new SelectGalleryAdapter(aVar, 1, readerImg2PDFChooseActivity instanceof SingleImageChooseActivity);
            }
        });
        this.f27358q0 = kotlin.a.a(new cg.a<ArrayList<String>>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$payloads$2
            @Override // cg.a
            public final ArrayList<String> invoke() {
                return ge.a.j("");
            }
        });
        this.f27361t0 = true;
        this.f27362u0 = "";
        this.f27363v0 = "";
        this.f27365x0 = true;
        this.f27366y0 = true;
        this.f27367z0 = -1;
        this.A0 = 3;
        this.C0 = -1;
        this.D0 = new b();
        this.L0 = new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(this, 8);
    }

    private final void X1(final boolean z10) {
        this.f27348g0 = new r(this, z10 ? 1 : 0, "", "", new l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$showStoragePermissionDialog$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z11) {
                if (z11) {
                    if (z10) {
                        ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = this;
                        readerImg2PDFChooseActivity.I0 = 2;
                        readerImg2PDFChooseActivity.y2(false);
                        return;
                    }
                    ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity2 = this;
                    readerImg2PDFChooseActivity2.I0 = 1;
                    readerImg2PDFChooseActivity2.p2();
                    return;
                }
                this.onBackPressed();
            }
        });
        if (z10) {
            K2(3);
        } else {
            K2(2);
        }
        r rVar = this.f27348g0;
        if (rVar != null) {
            rVar.show();
        }
    }

    public static void l2(ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity, Map map) {
        kotlin.jvm.internal.g.e(readerImg2PDFChooseActivity, ea.a.p("O2hYc10w", "344bRIgu"));
        readerImg2PDFChooseActivity.J.removeCallbacks(readerImg2PDFChooseActivity.L0);
        readerImg2PDFChooseActivity.H0 = System.currentTimeMillis();
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        if (!z10 && !pdf.pdfreader.viewer.editor.free.utils.extension.c.c(readerImg2PDFChooseActivity)) {
            if (!k0.b.b(readerImg2PDFChooseActivity, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFIDQQdfBFg4RR5OcUxsUx9PIUElRQ==", "AlL0s5hE")) && !k0.b.b(readerImg2PDFChooseActivity, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFKUUBVCtSO0EDX2JUNlJ2R0U=", "yNOdvYnu"))) {
                readerImg2PDFChooseActivity.X1(true);
                return;
            } else {
                readerImg2PDFChooseActivity.X1(false);
                return;
            }
        }
        readerImg2PDFChooseActivity.J2();
        readerImg2PDFChooseActivity.C2();
    }

    public static void m2(ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity, Map map) {
        kotlin.jvm.internal.g.e(readerImg2PDFChooseActivity, ea.a.p("Jmhac0Mw", "1tR3go9p"));
        readerImg2PDFChooseActivity.J.removeCallbacks(readerImg2PDFChooseActivity.L0);
        readerImg2PDFChooseActivity.H0 = System.currentTimeMillis();
        boolean z10 = false;
        boolean z11 = false;
        for (Map.Entry entry : map.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11 && !pdf.pdfreader.viewer.editor.free.utils.extension.c.c(readerImg2PDFChooseActivity)) {
            if (k0.b.b(readerImg2PDFChooseActivity, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFIDQQdfJ0UwSTdfK01yRw5T", "jtvbSgK3"))) {
                readerImg2PDFChooseActivity.X1(false);
                return;
            } else {
                readerImg2PDFChooseActivity.X1(true);
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 33) {
            z10 = true;
        }
        if (z10 && !pdf.pdfreader.viewer.editor.free.utils.extension.c.d(readerImg2PDFChooseActivity)) {
            jn.a.c.getClass();
            if (jn.a.l() < 2) {
                jn.a.f19332m.c(jn.a.f19323d[8], Integer.valueOf(jn.a.l() + 1));
            }
        }
        readerImg2PDFChooseActivity.J2();
        readerImg2PDFChooseActivity.B0 = true;
        readerImg2PDFChooseActivity.C2();
    }

    public static final boolean n2(ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity) {
        ArrayList<ul.b> arrayList;
        boolean z10;
        int i10;
        boolean z11;
        ArrayList<ul.b> arrayList2;
        ArrayList<ul.b> arrayList3;
        ul.a aVar = (ul.a) readerImg2PDFChooseActivity.x2().f30452e.d();
        if (aVar != null) {
            arrayList = aVar.f30402b;
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ul.a aVar2 = (ul.a) readerImg2PDFChooseActivity.x2().f30452e.d();
            if (aVar2 != null && (arrayList3 = aVar2.f30402b) != null) {
                i10 = 0;
                for (ul.b bVar : arrayList3) {
                    if (bVar.a()) {
                        i10++;
                    }
                    if (!bVar.f30407e && !bVar.a()) {
                        break;
                    }
                }
            } else {
                i10 = 0;
            }
            if (i10 == 0) {
                return true;
            }
            ul.a aVar3 = (ul.a) readerImg2PDFChooseActivity.x2().f30452e.d();
            if (aVar3 != null && (arrayList2 = aVar3.f30402b) != null && i10 == arrayList2.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return true;
            }
        }
        return false;
    }

    public static final void o2(ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity, String str) {
        int dimension;
        int[] iArr = new int[2];
        RecyclerView recyclerView = readerImg2PDFChooseActivity.Q;
        if (recyclerView != null) {
            recyclerView.getLocationInWindow(iArr);
            int U = iArr[1] - t0.U(readerImg2PDFChooseActivity);
            if (U < 0) {
                dimension = -1;
            } else {
                dimension = (int) (readerImg2PDFChooseActivity.getResources().getDimension(R.dimen.dp_6) + U);
            }
            j1.e(readerImg2PDFChooseActivity, str, false, null, dimension);
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("VGEnbBZyG1J2", "WuYm56MP"));
        throw null;
    }

    public void A2() {
        String p10 = ea.a.p("BW1n", "qLlwrohg");
        String workflow = this.f27001t;
        boolean z10 = this.f27364w0;
        TurnPageMode e22 = e2();
        kotlin.jvm.internal.g.e(workflow, "workflow");
        Intent intent = new Intent(this, CameraActivity.class);
        intent.putExtra(ea.a.p("KXJebSZzWHUoY2U=", "kmJIwfBJ"), p10);
        intent.putExtra(ea.a.p("WnMNchxtNmgbcmQ=", "QUfHjBSH"), z10);
        intent.putExtra(ea.a.p("WnMYaBx3K20TZ1FMAHMiSSdvbg==", "lRjdP5ba"), false);
        intent.putExtra(ea.a.p("VXIkbSx3DXIZZlhvdw==", "WzjrPmag"), workflow);
        intent.putExtra(ea.a.p("WGUyXxpzPWMTbVFyCF8waTZzRl8jbjdyMG5WZQ==", "Q5tylhrO"), false);
        if (e22 != null) {
            intent.putExtra(ea.a.p("R3U5bid5EmU=", "NAgfma5w"), e22.ordinal());
        }
        startActivity(intent);
    }

    public void B2(long j10) {
        Intent intent = new Intent(this, ReaderImgPreviewActivity.class);
        intent.putExtra(ea.a.p("WGUyXxdpEXAeYU1fGXIzdi1lRV8vZA==", "Uf5cO3WP"), j10);
        intent.putExtra(ea.a.p("KXJebSZ3WHIxZiZvdw==", "uNdrfc6N"), this.f27001t);
        intent.putExtra(ea.a.p("WnMNchxtNmgbcmQ=", "HQyhGae0"), this.f27364w0);
        intent.putExtra(ea.a.p("InU1bm15P2U=", "MZVG9ODv"), this.f27005x);
        CameraMode cameraMode = this.f27006y;
        if (cameraMode != null) {
            intent.putExtra(ea.a.p("WGUyXxBhD2UAYWttBmRl", "h0vLoceb"), cameraMode.name());
        }
        this.f27350i0.a(intent);
    }

    @Override // jl.a
    public final void C1() {
        View findViewById = findViewById(R.id.view_status_bar);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("KWlfZC9pUncYeQNkSVYBZUI-RlJraQEuG2kAdzxzB2E7dUJfG2FFKQ==", "F83hmecs"));
        this.X = findViewById;
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = aj.b.B(this);
        View view = this.X;
        if (view != null) {
            view.setLayoutParams(layoutParams);
            View findViewById2 = findViewById(R.id.lyLoading);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXnkKbyJkIG4NKQ==", "Ij1gw4aW"));
            this.f27344c0 = (LinearLayout) findViewById2;
            View findViewById3 = findViewById(R.id.progressView);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQnIpZzFlI3NjaSp3KQ==", "P5ODZwPV"));
            this.f27345d0 = (ProgressView) findViewById3;
            View findViewById4 = findViewById(R.id.viewBottomGallery);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGGkgdydvRnRbbRdhCmwqckgp", "ACnv24Pf"));
            this.f27343b0 = (LinearLayout) findViewById4;
            View findViewById5 = findViewById(R.id.layout_ad_bottom);
            kotlin.jvm.internal.g.d(findViewById5, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXmE_bzZ0E2EyX1JvEHRcbSk=", "LV0dlwgZ"));
            this.T = (LinearLayout) findViewById5;
            View findViewById6 = findViewById(R.id.titleTv);
            kotlin.jvm.internal.g.d(findViewById6, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGmkxbABUDyk=", "zWJ4yAeW"));
            this.S = (LinearLayout) findViewById6;
            View findViewById7 = findViewById(R.id.view_popu_overlay);
            kotlin.jvm.internal.g.d(findViewById7, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRGkjdxxwDXARXwV2AHJfYTIp", "bdjeAyak"));
            this.U = findViewById7;
            View findViewById8 = findViewById(R.id.backImg);
            kotlin.jvm.internal.g.d(findViewById8, ea.a.p("KWlfZC9pUncYeQNkSUEYcHZvA3AkdCxtMGdTViBlNT5nUh9pHS5VYTlrA20SKQ==", "YALOQ6IB"));
            this.Y = (AppCompatImageView) findViewById8;
            View findViewById9 = findViewById(R.id.permissionTipsLayout);
            kotlin.jvm.internal.g.d(findViewById9, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHmU3bQxzJ2lbbjlpSHMDYUhvDHQp", "FCgnT4m8"));
            this.Z = (ConstraintLayout) findViewById9;
            View findViewById10 = findViewById(R.id.tvPermissionTips);
            kotlin.jvm.internal.g.d(findViewById10, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGnYVZRdtL3M9aSVuHmk_cyk=", "o22wFNJJ"));
            this.f27342a0 = (TextView) findViewById10;
            AppCompatImageView appCompatImageView = this.Y;
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new f5.e(this, 20));
                LinearLayout linearLayout = this.S;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(new k9.c(this, 22));
                    ConstraintLayout constraintLayout = this.Z;
                    if (constraintLayout != null) {
                        constraintLayout.setOnClickListener(new u4.g(this, 17));
                        View findViewById11 = findViewById(R.id.cancelAllFl);
                        ((FrameLayout) findViewById11).setOnClickListener(new j(this, 19));
                        kotlin.jvm.internal.g.d(findViewById11, ea.a.p("CGk5ZARpCHcKeS9kCEYlYVVlHmEwb0N0loDXKCVoK3NUOjhuEWwEYyMpbCAUIHcgGCByfQ==", "7PnWRmpZ"));
                        this.N = (FrameLayout) findViewById11;
                        View findViewById12 = findViewById(R.id.selectAllFl);
                        ((LinearLayout) findViewById12).setOnClickListener(new d9.f(this, 18));
                        kotlin.jvm.internal.g.d(findViewById12, ea.a.p("VWklZCVpB3cweX1kVUw_biFhQEwneSx1gIDqKAdoIHMJOiRuMGwLYxkpPiBJIHYgZCASfQ==", "bLsIMb0W"));
                        this.O = (LinearLayout) findViewById12;
                        View findViewById13 = findViewById(R.id.continueTv);
                        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById13;
                        kotlin.jvm.internal.g.d(appCompatTextView, ea.a.p("JnQ=", "khBMMhuZ"));
                        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView, new ReaderImg2PDFChooseActivity$findView$6$1(this));
                        kotlin.jvm.internal.g.d(findViewById13, ea.a.p("VWklZCVpB3cweX1kVUEmcAdvX3AndBdlroDHKEdoB3MJOiRuMGwLYxkpPiBJIHYgZCASfQ==", "La3neQur"));
                        this.M = (AppCompatTextView) findViewById13;
                        View findViewById14 = findViewById(R.id.galleryTv);
                        kotlin.jvm.internal.g.d(findViewById14, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuVWEqbCZyDVQzKQ==", "tE56W2HU"));
                        this.P = (AppCompatTextView) findViewById14;
                        View findViewById15 = findViewById(R.id.galleryRv);
                        kotlin.jvm.internal.g.d(findViewById15, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuVWEqbCZyKlIeKQ==", "ShTOKtcK"));
                        this.Q = (RecyclerView) findViewById15;
                        View findViewById16 = findViewById(R.id.selectRv);
                        kotlin.jvm.internal.g.d(findViewById16, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQWUqZSB0a3Yp", "9f0tM8mS"));
                        this.R = (RecyclerView) findViewById16;
                        View findViewById17 = findViewById(R.id.rootView);
                        kotlin.jvm.internal.g.d(findViewById17, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQG8pdBVpDXcp", "hskrSPhx"));
                        this.K = findViewById17;
                        View findViewById18 = findViewById(R.id.toolBarBg);
                        kotlin.jvm.internal.g.d(findViewById18, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGm8qbCdhM0IFKQ==", "QfQTAbF4"));
                        this.L = findViewById18;
                        View findViewById19 = findViewById(R.id.openGalleryImg);
                        kotlin.jvm.internal.g.d(findViewById19, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuAXAgbiJhDmwMcj9JAmcp", "YJu1biFo"));
                        this.V = (ImageView) findViewById19;
                        View findViewById20 = findViewById(R.id.ivSelectAll);
                        kotlin.jvm.internal.g.d(findViewById20, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuW3YVZS9lF3QTbCgp", "tRDSBKCQ"));
                        this.W = (ImageView) findViewById20;
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("P2VDbRBzRGk1bh5pBXMkYUxvG3Q=", "XUN4UAKY"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("O2lFbBxUdg==", "p2tF1hOp"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UWEoazptZw==", "1z3LMS9b"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PVY-ZSZTHmE8dRVCVXI=", "7HPWQjZN"));
        throw null;
    }

    public final void C2() {
        AppCompatImageView appCompatImageView = this.Y;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
            if (this.B0) {
                this.B0 = false;
                ImageConvertDataRepository imageConvertDataRepository = ImageConvertDataRepository.f26536a;
                imageConvertDataRepository.getClass();
                ArrayList arrayList = (ArrayList) ImageConvertDataRepository.f26550p.d();
                if (arrayList != null && (!arrayList.isEmpty())) {
                    if (ImageConvertDataRepository.f26538d == null) {
                        ImageConvertDataRepository.f26538d = new ArrayList<>();
                    }
                    ArrayList<ul.b> arrayList2 = ImageConvertDataRepository.f26538d;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    ArrayList<ul.b> arrayList3 = ImageConvertDataRepository.f26538d;
                    if (arrayList3 != null) {
                        arrayList3.addAll(arrayList);
                    }
                }
                ArrayList arrayList4 = (ArrayList) ImageConvertDataRepository.f26552r.d();
                if (arrayList4 != null && (!arrayList4.isEmpty())) {
                    if (ImageConvertDataRepository.f26539e == null) {
                        ImageConvertDataRepository.f26539e = new ArrayList<>();
                    }
                    ArrayList<ul.b> arrayList5 = ImageConvertDataRepository.f26539e;
                    if (arrayList5 != null) {
                        arrayList5.clear();
                    }
                    ArrayList<ul.b> arrayList6 = ImageConvertDataRepository.f26539e;
                    if (arrayList6 != null) {
                        arrayList6.addAll(arrayList4);
                    }
                }
                ImageConvertDataRepository.f26537b = null;
                if (vl.e.c == null) {
                    vl.e.c = new vl.e();
                }
                vl.e.c.getClass();
                vl.e.f30849b = imageConvertDataRepository;
                if (vl.e.c == null) {
                    vl.e.c = new vl.e();
                }
                vl.e eVar = vl.e.c;
                eVar.getClass();
                ea.a.p("QHQqcgdTAWEcIERyDCA0cit3QWVmcCtvQW8=", "5iXovTB3");
                if (eVar.f30850a == null) {
                    vl.b bVar = new vl.b(ReaderPdfApplication.m(), new vl.d(), eVar);
                    eVar.f30850a = bVar;
                    bVar.start();
                }
                LinearLayout linearLayout = this.f27344c0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("X3kHbxJkC25n", "zFqaep9l"));
                    throw null;
                }
            }
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("W2FXa31tZw==", "Qo94426v"));
        throw null;
    }

    @Override // jl.a
    public final View D1() {
        View view = this.K;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "SMKhLjVd"));
        throw null;
    }

    public void D2() {
        tn.a.d(this, ea.a.p("Wm0scxZsB2N0", "gEbSRsFl"), ea.a.p("Wm0scxZsB2MGX1dhBGUkYRtjXmklaw==", "fAg0fQdR"), c2().concat("_total"), false);
        tn.a.d(this, ea.a.p("UG1ecxZsCGN0", "iW99smB9"), ea.a.p("Wm0scxZsB2MGX1dhBGUkYRtjXmklaw==", "7ZpuOcSX"), androidx.activity.f.m(c2(), "_", u2()), false);
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_r3_img_convert_pdf;
    }

    public void E2(ul.b bVar) {
        tn.a.d(this, ea.a.p("HWULZSh0CmklYQFl", "98ngKUpI"), ea.a.p("Wm0scxZsB2MGX1dsAGNr", "TBBYaf70"), c2().concat("_imgselect"), false);
        tn.a.d(this, ea.a.p("PGVdZRp0aGk3YS1l", "lYhnzEYF"), ea.a.p("QGUnZRB0FGkXd2tzAW93", "gy090UYR"), c2().concat("_imgselect"), false);
        LinearLayout linearLayout = this.T;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            Intent intent = new Intent(this, ReaderSelectImagePreviewActivity.class);
            intent.putExtra(ea.a.p("WGUyXxdpEXAeYU1fGXIzdi1lRV8vZA==", "O0I65fhO"), bVar.f30405b);
            intent.putExtra(ea.a.p("QG8-chBl", "SMJ3t0iJ"), ea.a.p("Wm0scxZsB2N0", "3cxoJk5i"));
            CameraMode cameraMode = this.f27006y;
            if (cameraMode != null) {
                intent.putExtra(ea.a.p("WGUyXxBhD2UAYWttBmRl", "J5kQtsrh"), cameraMode.name());
            }
            intent.putExtra(ea.a.p("WnMNchxtNmgbcmQ=", "sW0PhN43"), this.f27364w0);
            intent.putExtra(ea.a.p("KXJebSZ3WHIxZiZvdw==", "BLDlWmNh"), this.f27001t);
            intent.putExtra(ea.a.p("O3VDbi15R2U=", "UAQkyUOV"), this.f27005x);
            this.f27351j0.a(intent);
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("X2EybwZ0I2Qwb0B0Bm0=", "exCjaIbZ"));
        throw null;
    }

    public void F2(boolean z10) {
        if (z10) {
            ImageView imageView = this.W;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_home_selected);
                return;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("WnYYZR9lAXQzbGw=", "SPvskjkt"));
                throw null;
            }
        }
        ImageView imageView2 = this.W;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.ic_home_unselected_gray);
        } else {
            kotlin.jvm.internal.g.i(ea.a.p("WnYYZR9lAXQzbGw=", "SPvskjkt"));
            throw null;
        }
    }

    public final void G2(boolean z10) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator;
        if (!z10 || !this.F0) {
            if (!z10 && this.G0) {
                return;
            }
            boolean z11 = true;
            if (z10) {
                this.F0 = true;
            } else {
                this.G0 = true;
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_78);
            if (z10) {
                LinearLayout linearLayout = this.f27343b0;
                if (linearLayout != null) {
                    if (dimensionPixelSize == linearLayout.getHeight()) {
                        this.F0 = false;
                        return;
                    }
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("OWlUdztvQ3Q1bQ1hGWwNcnk=", "epTCAC8D"));
                    throw null;
                }
            }
            if (!z10) {
                LinearLayout linearLayout2 = this.f27343b0;
                if (linearLayout2 != null) {
                    if (linearLayout2.getHeight() == 0) {
                        this.G0 = false;
                        return;
                    }
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("OWlUdztvQ3Q1bQ1hGWwNcnk=", "fAJyxYPz"));
                    throw null;
                }
            }
            ValueAnimator valueAnimator2 = this.E0;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                z11 = false;
            }
            if (z11 && (valueAnimator = this.E0) != null) {
                valueAnimator.cancel();
            }
            LinearLayout linearLayout3 = this.f27343b0;
            if (linearLayout3 != null) {
                int height = linearLayout3.getHeight();
                if (z10) {
                    ofInt = ValueAnimator.ofInt(height, dimensionPixelSize);
                } else {
                    ofInt = ValueAnimator.ofInt(height, 0);
                }
                this.E0 = ofInt;
                if (ofInt != null) {
                    ofInt.setInterpolator(new LinearInterpolator());
                }
                ValueAnimator valueAnimator3 = this.E0;
                if (valueAnimator3 != null) {
                    valueAnimator3.setDuration(100L);
                }
                ValueAnimator valueAnimator4 = this.E0;
                if (valueAnimator4 != null) {
                    valueAnimator4.addUpdateListener(new k9.a(this, 4));
                }
                ValueAnimator valueAnimator5 = this.E0;
                if (valueAnimator5 != null) {
                    valueAnimator5.addListener(new f());
                }
                ValueAnimator valueAnimator6 = this.E0;
                if (valueAnimator6 != null) {
                    valueAnimator6.start();
                    return;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("OWlUdztvQ3Q1bQ1hGWwNcnk=", "yw8JhIiz"));
            throw null;
        }
    }

    public void H2() {
        if (!h2() && !this.f27366y0 && this.f27006y != CameraMode.Ocr) {
            w2().setVisibility(0);
        } else {
            w2().setVisibility(4);
        }
    }

    public void I2(final List<? extends ul.a> it) {
        int i10;
        kotlin.jvm.internal.g.e(it, "it");
        if (this.A0 == 3) {
            if (this.f27365x0) {
                i10 = 5;
            } else {
                i10 = 6;
            }
        } else if (this.f27365x0) {
            i10 = 7;
        } else {
            i10 = 8;
        }
        pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
        if (pdf.pdfreader.viewer.editor.free.utils.c.f28559b.getBoolean(ea.a.p("JGVIXxBtUDIqZCxfBmUEZVZ0MWcwaQFl", "muvgfPWQ"), true) && it.get(0).f30402b.size() >= i10) {
            View view = this.K;
            if (view != null) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$showUseGuide$1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        int i11;
                        final ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
                        if (!readerImg2PDFChooseActivity.J0) {
                            View view2 = readerImg2PDFChooseActivity.K;
                            if (view2 != null) {
                                if (view2.getMeasuredHeight() > 0) {
                                    View view3 = readerImg2PDFChooseActivity.L;
                                    if (view3 != null) {
                                        if (view3.getMeasuredHeight() > 0) {
                                            View view4 = readerImg2PDFChooseActivity.X;
                                            if (view4 != null) {
                                                if (view4.getMeasuredHeight() > 0) {
                                                    readerImg2PDFChooseActivity.J0 = true;
                                                    if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.f(readerImg2PDFChooseActivity) && !pdf.pdfreader.viewer.editor.free.utils.extension.c.d(readerImg2PDFChooseActivity) && pdf.pdfreader.viewer.editor.free.utils.extension.c.e(readerImg2PDFChooseActivity)) {
                                                        i11 = readerImg2PDFChooseActivity.getResources().getDimensionPixelSize(R.dimen.dp_62);
                                                    } else {
                                                        i11 = 0;
                                                    }
                                                    View view5 = readerImg2PDFChooseActivity.K;
                                                    if (view5 != null) {
                                                        view5.getMeasuredHeight();
                                                        View view6 = readerImg2PDFChooseActivity.L;
                                                        if (view6 != null) {
                                                            view6.getBottom();
                                                            View view7 = readerImg2PDFChooseActivity.X;
                                                            if (view7 != null) {
                                                                int measuredHeight = view7.getMeasuredHeight();
                                                                View view8 = readerImg2PDFChooseActivity.L;
                                                                if (view8 != null) {
                                                                    int measuredHeight2 = view8.getMeasuredHeight() + measuredHeight + i11;
                                                                    int i12 = readerImg2PDFChooseActivity.A0;
                                                                    boolean z10 = readerImg2PDFChooseActivity.f27365x0;
                                                                    ArrayList<ul.b> arrayList = it.get(0).f30402b;
                                                                    kotlin.jvm.internal.g.d(arrayList, ea.a.p("WnQQMC4uC20TZ1Fz", "a0Q0b3vW"));
                                                                    g gVar = new g(readerImg2PDFChooseActivity, measuredHeight2, i12, z10, arrayList);
                                                                    readerImg2PDFChooseActivity.f27346e0 = gVar;
                                                                    gVar.f27571f = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$showUseGuide$1$onGlobalLayout$1
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        @Override // cg.a
                                                                        public /* bridge */ /* synthetic */ tf.d invoke() {
                                                                            invoke2();
                                                                            return tf.d.f30009a;
                                                                        }

                                                                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                                                        public final void invoke2() {
                                                                            tn.a.d(ReaderImg2PDFChooseActivity.this, ea.a.p("Jm1WcxxsUmN0", "zIJOl6Lc"), ea.a.p("Jm1WcxxsUmMuXy1vAWkcX1ZsB2Nr", "pCCMF4zv"), ReaderImg2PDFChooseActivity.this.c2().concat("_total"), false);
                                                                            tn.a.d(ReaderImg2PDFChooseActivity.this, ea.a.p("Jm1WcxxsUmN0", "PPDcPo3O"), ea.a.p("Wm0scxZsB2MGX1NvHWkiXydsW2Nr", "F1KCfe5M"), androidx.activity.f.m(ReaderImg2PDFChooseActivity.this.c2(), "_", ReaderImg2PDFChooseActivity.this.u2()), false);
                                                                        }
                                                                    };
                                                                    g gVar2 = readerImg2PDFChooseActivity.f27346e0;
                                                                    if (gVar2 != null) {
                                                                        gVar2.show();
                                                                    }
                                                                    tn.a.d(readerImg2PDFChooseActivity, ea.a.p("KG0zc1xsLmN0", "EyAT9KPl"), ea.a.p("DG0pcz1sFGM8XwFvQGkjX0toPXc=", "W8eNXqyA"), readerImg2PDFChooseActivity.c2().concat("_total"), false);
                                                                    tn.a.d(readerImg2PDFChooseActivity, ea.a.p("Jm0FcydsUmN0", "EFObB7P9"), ea.a.p("Wm0scxZsB2MGX1NvHWkiXzdoXXc=", "J5NdljRl"), androidx.activity.f.m(readerImg2PDFChooseActivity.c2(), "_", readerImg2PDFChooseActivity.u2()), false);
                                                                    h.j("XWVOXyFtFDI4ZABfR2U7ZVt0DWc8aVJl", "ij67HsAX", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), false);
                                                                    View view9 = readerImg2PDFChooseActivity.K;
                                                                    if (view9 != null) {
                                                                        view9.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                                                        return;
                                                                    } else {
                                                                        kotlin.jvm.internal.g.i(ea.a.p("PW9edC9pUnc=", "6liQeBnm"));
                                                                        throw null;
                                                                    }
                                                                }
                                                                kotlin.jvm.internal.g.i(ea.a.p("O29ebBthcg==", "rfBVGbT3"));
                                                                throw null;
                                                            }
                                                            kotlin.jvm.internal.g.i(ea.a.p("J1YAZRtTLGE8dRVCVXI=", "9dJilXEf"));
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.g.i(ea.a.p("R28kbBFhcg==", "p56zhdYY"));
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.g.i(ea.a.p("PW9edC9pUnc=", "InsAXWTV"));
                                                    throw null;
                                                }
                                                return;
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("XlYiZQRTFmEGdUdCCHI=", "kjaeSmFk"));
                                            throw null;
                                        }
                                        return;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("HG9WbCBhcg==", "oYh9BkVC"));
                                    throw null;
                                }
                                return;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "8QwSjUxT"));
                            throw null;
                        }
                    }
                });
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("Om9edDVpMXc=", "BcH1cTs7"));
                throw null;
            }
        }
    }

    public final void J2() {
        String eventValue;
        int i10 = this.I0;
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            eventValue = d2().concat("_sys");
                        } else {
                            eventValue = d2().concat("_notice");
                        }
                    } else {
                        eventValue = d2().concat("_perm2");
                    }
                } else {
                    eventValue = d2().concat("_perm1");
                }
            } else {
                eventValue = d2().concat("_sys");
            }
            kotlin.jvm.internal.g.e(eventValue, "eventValue");
            jn.a.c.getClass();
            if (!kotlin.text.k.O(jn.a.k(), "storage_done_".concat(eventValue), false)) {
                tn.a.d(this, ea.a.p("P2VDbRBzRGk1bg==", "Cv2CNKsR"), ea.a.p("QHQkchJnB18Wb1pl", "u5UrJZru"), ea.a.p("R28_YWw=", "ETVprh0p"), false);
                tn.a.d(this, ea.a.p("Q2U5bRpzEWkdbg==", "3tG2SwjH"), ea.a.p("QHQkchJnB18Wb1pl", "SDzxe7vS"), eventValue, false);
                String k10 = jn.a.k();
                jn.a.p(k10 + "|storage_done_" + eventValue);
            }
        }
        this.I0 = 0;
    }

    @Override // jl.a
    public final void K1() {
        boolean z10;
        int i10;
        if (Build.VERSION.SDK_INT >= 34) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String string = getString(R.string.arg_res_0x7f130461);
            kotlin.jvm.internal.g.d(string, ea.a.p("AmU7U0NyIm4vKDQuR3QlaVZnfHMsbFNjAF8cbyNlHWEJbBBhVGMuczsp", "xZeO7KNH"));
            int V = kotlin.text.k.V(string, ea.a.p("c2I-", "pRuJNTpX"), 0, false, 6);
            int V2 = kotlin.text.k.V(string, ea.a.p("cy9TPg==", "gd1CQzks"), 0, false, 6) - 3;
            String K = kotlin.text.j.K(kotlin.text.j.K(string, ea.a.p("c2I-", "RCCPJvTd"), ""), ea.a.p("Si8hPg==", "Z6vCy9nD"), "");
            if (V >= 0 && V2 >= 0) {
                SpannableString spannableString = new SpannableString(K);
                spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(this, R.color.colorAccent)), V, V2, 17);
                TextView textView = this.f27342a0;
                if (textView != null) {
                    textView.setText(spannableString);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("BXZoZQptG3M7aQluYGkncw==", "xiq8xrcT"));
                    throw null;
                }
            } else {
                TextView textView2 = this.f27342a0;
                if (textView2 != null) {
                    textView2.setText(K);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("R3YmZRVtL3M7aQluYGkncw==", "3V3vgF2H"));
                    throw null;
                }
            }
        }
        if (kotlin.jvm.internal.g.a(this.f27363v0, ea.a.p("KmErZTBh", "owIFBxNq"))) {
            AppCompatImageView appCompatImageView = this.Y;
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(R.drawable.ic_home_arrow);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("LWFSazBtZw==", "6ONuvX1m"));
                throw null;
            }
        }
        if (getResources().getDisplayMetrics().heightPixels > getResources().getDisplayMetrics().widthPixels * 1.35d) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        this.A0 = i10;
        if (h2()) {
            v2().f27152i = ImageChooseWorkFlow.PageManger;
        } else if (this.f27006y == CameraMode.Ocr) {
            v2().f27152i = ImageChooseWorkFlow.OCR;
        }
        v2().f27154k = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$initView$1
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
                String string2 = readerImg2PDFChooseActivity.getString(R.string.arg_res_0x7f130257);
                kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG0neBxsG20PdAxyD2FQaC5kLGcSdCk=", "rfSj0JKC"));
                ReaderImg2PDFChooseActivity.o2(readerImg2PDFChooseActivity, string2);
            }
        };
        RecyclerView recyclerView = this.Q;
        if (recyclerView != null) {
            recyclerView.setAdapter(v2());
            recyclerView.setLayoutManager(new GridLayoutManager(this.A0));
            recyclerView.setHasFixedSize(true);
            s2(recyclerView);
            RecyclerView recyclerView2 = this.R;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(0));
                recyclerView2.setAdapter((SelectGalleryAdapter) this.f27355n0.getValue());
                AppCompatTextView appCompatTextView = this.M;
                if (appCompatTextView != null) {
                    if (this.f27366y0) {
                        appCompatTextView.setText(getString(R.string.arg_res_0x7f130423));
                    }
                    appCompatTextView.setEnabled(false);
                    G2(false);
                    if (this.f27006y == CameraMode.Ocr) {
                        v2().f27155l = 40;
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("LG9fdBBuQmUOdg==", "Up3geocu"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("QGUnZRB0MHY=", "arcmjbYy"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("IWEkbCNyKFJ2", "ViFHFQ9m"));
        throw null;
    }

    public final void K2(int i10) {
        String concat;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        concat = d2().concat("_sys");
                    } else {
                        concat = d2().concat("_notice");
                    }
                } else {
                    concat = d2().concat("_perm2");
                }
            } else {
                concat = d2().concat("_perm1");
            }
        } else {
            concat = d2().concat("_sys");
        }
        jn.a.c.getClass();
        String k10 = jn.a.k();
        if (!kotlin.text.k.O(k10, "storage_show_" + concat, false)) {
            tn.a.d(this, ea.a.p("HWUgbQRzC2knbg==", "iWmRmxHM"), ea.a.p("QHQkchJnB18BaFt3", "UelMMz20"), ea.a.p("R28_YWw=", "j1aZIBIc"), false);
            tn.a.d(this, ea.a.p("AmUKbVBzNGknbg==", "I7rx9GeZ"), ea.a.p("PHRechhnUl8paCV3", "b2jWM4At"), concat, false);
            String k11 = jn.a.k();
            jn.a.p(k11 + "|storage_show_" + concat);
        }
    }

    @Override // jl.a
    public final void L1() {
        x2().f30454g.e(this, new e(new l<String, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(String str) {
                invoke2(str);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                LinearLayout linearLayout = ReaderImg2PDFChooseActivity.this.S;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    AppCompatTextView appCompatTextView = ReaderImg2PDFChooseActivity.this.P;
                    if (appCompatTextView != null) {
                        kotlin.jvm.internal.g.b(str);
                        appCompatTextView.setText(aj.b.N(str));
                        AppCompatTextView appCompatTextView2 = ReaderImg2PDFChooseActivity.this.P;
                        if (appCompatTextView2 != null) {
                            appCompatTextView2.requestLayout();
                            return;
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("KGFdbBxyTlR2", "cGmtcrOW"));
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("KGFdbBxyTlR2", "mbkGjZ2l"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("NmkNbAFUdg==", "WuBydMHZ"));
                throw null;
            }
        }));
        x2().f30452e.e(this, new e(new l<ul.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$initViewModel$2
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(ul.a aVar) {
                invoke2(aVar);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ul.a aVar) {
                if (aVar != null) {
                    dp.a a10 = dp.a.a();
                    a10.getClass();
                    dp.a.c("Img2PDFActivity-----------refresh----it.images.size=" + aVar.f30402b.size() + "-------");
                    LinearLayout linearLayout = ReaderImg2PDFChooseActivity.this.f27344c0;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                        GalleryAdapter v22 = ReaderImg2PDFChooseActivity.this.v2();
                        ArrayList<ul.b> arrayList = aVar.f30402b;
                        kotlin.jvm.internal.g.d(arrayList, ea.a.p("JnQfaRRhUGVz", "OOhjsJUF"));
                        v22.getClass();
                        ArrayList<ul.b> arrayList2 = v22.f27149f;
                        arrayList2.clear();
                        if (v22.f27156m) {
                            ul.b bVar = new ul.b();
                            bVar.f30412j = true;
                            arrayList2.add(bVar);
                        }
                        arrayList2.addAll(arrayList);
                        v22.notifyDataSetChanged();
                        RecyclerView recyclerView = ReaderImg2PDFChooseActivity.this.Q;
                        if (recyclerView != null) {
                            recyclerView.r0(0);
                            ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
                            readerImg2PDFChooseActivity.F2(ReaderImg2PDFChooseActivity.n2(readerImg2PDFChooseActivity));
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("KGFdbBxyTlJ2", "KKecRsdj"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("W3l7byhkL25n", "ud77IFWh"));
                    throw null;
                }
            }
        }));
        x2().f30453f.e(this, new e(new l<ArrayList<ul.b>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$initViewModel$3
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(ArrayList<ul.b> arrayList) {
                invoke2(arrayList);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(ArrayList<ul.b> arrayList) {
                ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
                ReaderImg2PDFChooseActivity.a aVar = ReaderImg2PDFChooseActivity.M0;
                readerImg2PDFChooseActivity.getClass();
                boolean z10 = false;
                if (arrayList == null || arrayList.isEmpty()) {
                    AppCompatTextView appCompatTextView = ReaderImg2PDFChooseActivity.this.M;
                    if (appCompatTextView != null) {
                        appCompatTextView.setEnabled(false);
                        ReaderImg2PDFChooseActivity.this.G2(false);
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("LG9fdBBuQmUOdg==", "LLLf1tEo"));
                        throw null;
                    }
                } else {
                    AppCompatTextView appCompatTextView2 = ReaderImg2PDFChooseActivity.this.M;
                    if (appCompatTextView2 != null) {
                        appCompatTextView2.setEnabled(true);
                        ReaderImg2PDFChooseActivity.this.G2(true);
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("W28JdFhuPmUcdg==", "qZ8g1KCH"));
                        throw null;
                    }
                }
                ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity2 = ReaderImg2PDFChooseActivity.this;
                readerImg2PDFChooseActivity2.F2(ReaderImg2PDFChooseActivity.n2(readerImg2PDFChooseActivity2));
                ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity3 = ReaderImg2PDFChooseActivity.this;
                readerImg2PDFChooseActivity3.getClass();
                if (readerImg2PDFChooseActivity3 instanceof SingleImageChooseActivity) {
                    RecyclerView recyclerView = ReaderImg2PDFChooseActivity.this.R;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.g.i(ea.a.p("QGUnZRB0MHY=", "4g4TBaRX"));
                        throw null;
                    }
                    recyclerView.setVisibility(8);
                } else {
                    RecyclerView recyclerView2 = ReaderImg2PDFChooseActivity.this.R;
                    if (recyclerView2 == null) {
                        kotlin.jvm.internal.g.i(ea.a.p("PGVdZRp0ZXY=", "hegoXZ4b"));
                        throw null;
                    }
                    recyclerView2.setVisibility(arrayList == null || arrayList.isEmpty() ? 8 : 0);
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    z10 = true;
                }
                if (!z10) {
                    ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity4 = ReaderImg2PDFChooseActivity.this;
                    if (!readerImg2PDFChooseActivity4.f27360s0) {
                        readerImg2PDFChooseActivity4.f27360s0 = true;
                    }
                }
                if (arrayList != null) {
                    ((SelectGalleryAdapter) ReaderImg2PDFChooseActivity.this.f27355n0.getValue()).i(arrayList);
                }
            }
        }));
        x2().f30451d.e(this, new e(new l<List<? extends ul.a>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$initViewModel$4
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(List<? extends ul.a> list) {
                invoke2(list);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends ul.a> list) {
                if (list != null) {
                    LinearLayout linearLayout = ReaderImg2PDFChooseActivity.this.f27344c0;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                        if ((list.size() == 1 && list.get(0).f30402b.isEmpty()) || list.isEmpty()) {
                            LinearLayout linearLayout2 = ReaderImg2PDFChooseActivity.this.S;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(4);
                                ReaderImg2PDFChooseActivity.this.w2().setVisibility(4);
                                return;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("R2k_bBZUdg==", "iQ703Cti"));
                            throw null;
                        }
                        LinearLayout linearLayout3 = ReaderImg2PDFChooseActivity.this.S;
                        if (linearLayout3 != null) {
                            linearLayout3.setVisibility(0);
                            ReaderImg2PDFChooseActivity.this.H2();
                            ReaderImg2PDFChooseActivity.this.I2(list);
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("O2lFbBxUdg==", "PioKdIlr"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("W3l7byhkL25n", "ud77IFWh"));
                    throw null;
                }
            }
        }));
        t0.d0(b.b.x(this), null, null, new ReaderImg2PDFChooseActivity$initViewModel$5(this, null), 3);
        t0.d0(b.b.x(this), null, null, new ReaderImg2PDFChooseActivity$initViewModel$6(this, null), 3);
        t0.d0(b.b.x(this), null, null, new ReaderImg2PDFChooseActivity$initViewModel$7(this, null), 3);
        t0.d0(b.b.x(this), null, null, new ReaderImg2PDFChooseActivity$initViewModel$8(this, null), 3);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, android.app.Activity
    public final void finish() {
        if (vl.e.c == null) {
            vl.e.c = new vl.e();
        }
        vl.e eVar = vl.e.c;
        eVar.getClass();
        ea.a.p("UG5FZTZyO3A8UwVhWiAncl0gMHImd0VlVHAZbyVv", "fX91DN2r");
        try {
            vl.b bVar = eVar.f30850a;
            if (bVar != null) {
                bVar.interrupt();
                eVar.f30850a = null;
            }
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        n nVar = this.f27356o0;
        boolean z10 = false;
        if (nVar != null && nVar.isShowing()) {
            z10 = true;
        }
        if (z10) {
            n nVar2 = this.f27356o0;
            if (nVar2 != null) {
                nVar2.dismiss();
                return;
            }
            return;
        }
        q2();
    }

    public final void onClick(View view) {
        boolean z10;
        ul.b bVar;
        boolean z11;
        boolean z12;
        ArrayList<ul.b> arrayList;
        ArrayList<ul.b> arrayList2;
        ArrayList<ul.b> arrayList3;
        boolean z13;
        ArrayList<ul.b> arrayList4;
        Object obj;
        boolean z14;
        boolean z15;
        Object obj2 = null;
        switch (view.getId()) {
            case R.id.backImg /* 2131362082 */:
                onBackPressed();
                return;
            case R.id.cancelAllFl /* 2131362199 */:
                x2().getClass();
                ImageConvertDataRepository.f26536a.getClass();
                ImageConvertDataRepository.k();
                z2();
                return;
            case R.id.continueTv /* 2131362333 */:
                r2();
                return;
            case R.id.permissionTipsLayout /* 2131363599 */:
                K2(4);
                if (Build.VERSION.SDK_INT >= 34) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    jn.a.c.getClass();
                    if (jn.a.l() < 2) {
                        this.f27353l0.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfL0V2SRtfHk0OR3RT", "XJvNb2ZW"), ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFIDQQdfLEUpSXNfDElgVQpMLFUxRSBfZ0UlRRVUAUQ=", "am2ZTH7I")});
                        return;
                    }
                    this.I0 = 3;
                    this.C0 = 0;
                    y2(true);
                    return;
                }
                return;
            case R.id.selectAllFl /* 2131363910 */:
                x2().getClass();
                ImageConvertDataRepository.f26536a.getClass();
                ul.a d10 = ImageConvertDataRepository.f26543i.d();
                if (d10 != null && (arrayList4 = d10.f30402b) != null) {
                    Iterator<T> it = arrayList4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            ul.b bVar2 = (ul.b) obj;
                            if (!bVar2.f30407e && !bVar2.a()) {
                                z14 = true;
                                continue;
                            } else {
                                z14 = false;
                                continue;
                            }
                            if (z14) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    bVar = (ul.b) obj;
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    F2(false);
                    tn.a.d(this, ea.a.p("Wm03c1FsB2N0", "I33P4b9O"), ea.a.p("Wm0scxZsB2MGX0FuCGw6XydsW2Nr", "4E0GZWNR"), c2().concat("_total"), false);
                    tn.a.d(this, ea.a.p("Wm0scxZsB2N0", "ZaCe3pXz"), ea.a.p("GG1Uc1FsC2M8XxNuVWw7X1tsO2Nr", "8zq34n6F"), androidx.activity.f.m(c2(), "_", u2()), false);
                } else {
                    F2(true);
                    tn.a.d(this, ea.a.p("Jm1WcxxsUmN0", "VwC4btUV"), ea.a.p("B20Wcw5sDGM8XwdsWF80bFFjaw==", "BFnqkieP"), c2().concat("_total"), false);
                    tn.a.d(this, ea.a.p("Wm0scxZsB2N0", "ti0pub1k"), ea.a.p("Jm1WcxxsUmMuXytsGV8LbFxjaw==", "ddhFBwQn"), androidx.activity.f.m(c2(), "_", u2()), false);
                }
                x2().getClass();
                ImageConvertDataRepository.f26536a.getClass();
                w<ul.a> wVar = ImageConvertDataRepository.f26543i;
                ul.a d11 = wVar.d();
                if (d11 != null && (arrayList3 = d11.f30402b) != null) {
                    Iterator<T> it2 = arrayList3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            ul.b bVar3 = (ul.b) next;
                            if (!bVar3.f30407e && !bVar3.a()) {
                                z13 = true;
                                continue;
                            } else {
                                z13 = false;
                                continue;
                            }
                            if (z13) {
                                obj2 = next;
                            }
                        }
                    }
                    obj2 = (ul.b) obj2;
                }
                if (obj2 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ArrayList<ul.b> h10 = ImageConvertDataRepository.h();
                w<ArrayList<ul.b>> wVar2 = ImageConvertDataRepository.f26545k;
                if (z12) {
                    int size = h10.size();
                    ul.a d12 = wVar.d();
                    if (d12 != null && (arrayList2 = d12.f30402b) != null) {
                        for (ul.b bVar4 : arrayList2) {
                            if (!bVar4.f30407e && !bVar4.a()) {
                                bVar4.b(true);
                                size++;
                                bVar4.c(size);
                                h10.add(bVar4);
                            }
                        }
                    }
                    wVar2.j(h10);
                } else {
                    ul.a d13 = wVar.d();
                    if (d13 != null && (arrayList = d13.f30402b) != null) {
                        for (ul.b bVar5 : arrayList) {
                            bVar5.b(false);
                        }
                    }
                    ArrayList<ul.b> arrayList5 = new ArrayList<>();
                    for (ul.b bVar6 : h10) {
                        if (bVar6.f30407e) {
                            bVar6.c(arrayList5.size() + 1);
                            arrayList5.add(bVar6);
                        }
                    }
                    wVar2.j(arrayList5);
                }
                z2();
                return;
            case R.id.titleTv /* 2131364215 */:
                if (this.f27356o0 == null) {
                    View inflate = LayoutInflater.from(this).inflate(R.layout.layout_gallery_chooser, (ViewGroup) null, false);
                    kotlin.jvm.internal.g.d(inflate, ea.a.p("Wm4tbBJ0ZQ==", "ub0TAQZG"));
                    n nVar = new n(inflate);
                    this.f27356o0 = nVar;
                    nVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.a
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            ReaderImg2PDFChooseActivity.a aVar = ReaderImg2PDFChooseActivity.M0;
                            String p10 = ea.a.p("O2hYc10w", "tre338nh");
                            ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
                            kotlin.jvm.internal.g.e(readerImg2PDFChooseActivity, p10);
                            LinearLayout linearLayout = readerImg2PDFChooseActivity.S;
                            if (linearLayout != null) {
                                linearLayout.postDelayed(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(readerImg2PDFChooseActivity, 11), 50L);
                                ImageView imageView = readerImg2PDFChooseActivity.V;
                                if (imageView != null) {
                                    imageView.setRotation(0.0f);
                                    if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(readerImg2PDFChooseActivity)) {
                                        Window window = readerImg2PDFChooseActivity.getWindow();
                                        if (window != null) {
                                            i.g(window, 0, readerImg2PDFChooseActivity.F1());
                                        }
                                        Window window2 = readerImg2PDFChooseActivity.getWindow();
                                        if (window2 != null) {
                                            i.a(window2, !pdf.pdfreader.viewer.editor.free.utils.extension.c.h(readerImg2PDFChooseActivity));
                                        }
                                        Window window3 = readerImg2PDFChooseActivity.getWindow();
                                        if (window3 != null) {
                                            i.j(window3, 1280);
                                        }
                                    }
                                    AppCompatImageView appCompatImageView = readerImg2PDFChooseActivity.Y;
                                    if (appCompatImageView != null) {
                                        appCompatImageView.setVisibility(0);
                                        readerImg2PDFChooseActivity.H2();
                                        return;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWFSazBtZw==", "vtPX4W3w"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("XHAubjRhDmwXck1JBGc=", "1u1m4haW"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("MGkAbDJUdg==", "iqDtWx8G"));
                            throw null;
                        }
                    });
                }
                n nVar2 = this.f27356o0;
                if (nVar2 != null && nVar2.isShowing()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    n nVar3 = this.f27356o0;
                    if (nVar3 != null) {
                        nVar3.dismiss();
                        return;
                    }
                    return;
                }
                int[] iArr = new int[2];
                View view2 = this.L;
                if (view2 != null) {
                    view2.getLocationInWindow(iArr);
                    AppCompatImageView appCompatImageView = this.Y;
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(4);
                        w2().setVisibility(4);
                        n nVar4 = this.f27356o0;
                        if (nVar4 != null) {
                            View view3 = this.L;
                            if (view3 != null) {
                                int height = view3.getHeight() + iArr[1];
                                String str = (String) x2().f30454g.d();
                                if (str == null) {
                                    str = "";
                                }
                                List items = (List) x2().f30451d.d();
                                if (items == null) {
                                    items = EmptyList.INSTANCE;
                                }
                                d dVar = new d();
                                kotlin.jvm.internal.g.e(items, "items");
                                nVar4.showAtLocation(view3, 8388661, 0, height);
                                try {
                                    ((pdf.pdfreader.viewer.editor.free.ui.dialog.m) nVar4.f27698b.getValue()).h(str, items, new o(dVar, nVar4));
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                                int i10 = pdf.pdfreader.viewer.editor.free.utils.m0.f28725a;
                                if (Build.MANUFACTURER.toLowerCase().contains(ea.a.p("OWlHbw==", "8gfTtjYR")) && Build.VERSION.SDK_INT == 33) {
                                    View view4 = nVar4.f27697a;
                                    Animation loadAnimation = AnimationUtils.loadAnimation(view4.getContext(), R.anim.popu_top_in);
                                    loadAnimation.setAnimationListener(new p(nVar4));
                                    view4.startAnimation(loadAnimation);
                                }
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("R28kbBFhcg==", "2xqDwUSX"));
                                throw null;
                            }
                        }
                        LinearLayout linearLayout = this.S;
                        if (linearLayout != null) {
                            linearLayout.setEnabled(false);
                            AppCompatImageView appCompatImageView2 = this.Y;
                            if (appCompatImageView2 != null) {
                                appCompatImageView2.setEnabled(false);
                                w2().setEnabled(false);
                                ImageView imageView = this.V;
                                if (imageView != null) {
                                    imageView.setRotation(180.0f);
                                    View view5 = this.U;
                                    if (view5 != null) {
                                        view5.setOnClickListener(new q(2));
                                        View view6 = this.U;
                                        if (view6 != null) {
                                            view6.setVisibility(0);
                                            if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
                                                Window window = getWindow();
                                                if (window != null) {
                                                    i.g(window, 0, androidx.core.content.a.getColor(this, R.color.colorDialogNav));
                                                }
                                                Window window2 = getWindow();
                                                if (window2 != null) {
                                                    i.a(window2, false);
                                                }
                                                Window window3 = getWindow();
                                                if (window3 != null) {
                                                    i.j(window3, 1280);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("OWlUdylvR3UVdi9yGWF5", "nfDQAknc"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("Mmk_d2NvMnUHdgNyWGF5", "eFDZ3BqE"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("IHBUbj5hW2w_cjNJGGc=", "G1OAO4WD"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("MGEbayZtZw==", "n1RxoQQH"));
                            throw null;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("O2lFbBxUdg==", "ZwtMxzom"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("UWEoazptZw==", "oMSUUWOA"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("R28kbBFhcg==", "2h5vIPm1"));
                throw null;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        if (r0 <= 1) goto L54;
     */
    @Override // pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity.onCreate(android.os.Bundle):void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        r rVar;
        n nVar;
        g gVar;
        g gVar2 = this.f27346e0;
        boolean z13 = true;
        if (gVar2 != null && gVar2.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (gVar = this.f27346e0) != null) {
            gVar.dismiss();
        }
        n nVar2 = this.f27356o0;
        if (nVar2 != null && nVar2.isShowing()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && (nVar = this.f27356o0) != null) {
            nVar.dismiss();
        }
        r rVar2 = this.f27348g0;
        if (rVar2 != null && rVar2.isShowing()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && (rVar = this.f27348g0) != null) {
            rVar.dismiss();
        }
        ProgressView progressView = this.f27345d0;
        if (progressView != null) {
            progressView.d();
            a1 a1Var = this.f27347f0;
            if (a1Var != null) {
                a1Var.b();
            }
            this.f27347f0 = null;
            this.J.removeCallbacks(this.L0);
            super.onDestroy();
            ValueAnimator valueAnimator2 = this.E0;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                z13 = false;
            }
            if (z13 && (valueAnimator = this.E0) != null) {
                valueAnimator.cancel();
            }
            k kVar = k.f17927a;
            ea.a.p("ZmVSZBRyHW0vMjZEckM_b1dzN0EqdF92HXQIID5uBmVHdEFvCCAmZSVvEGUUbD5zTGU8ZXI=", "1143qTyA");
            kVar.getClass();
            ea.a.p("em0qZxYyMkQ0Q1tuH2UkdAZhXG4jcg==", "JWRUSUMZ");
            EngineHelper.f15726a.getClass();
            EngineHelper.e(this.D0);
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("P3JeZwtlRHMMaS93", "QUBnoGW2"));
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            setIntent(intent);
            this.f27365x0 = intent.getBooleanExtra(f27337j1, true);
            v2().i(this.f27365x0);
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        k.f17927a.getClass();
        gl.l.f17929o.l();
        gl.m.f17930o.l();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ed, code lost:
        if (r3 == 0) goto L61;
     */
    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity.onResume():void");
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(f27335c1, this.B0);
        outState.putInt(f27336i1, this.C0);
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStart() {
        super.onStart();
        v2().notifyDataSetChanged();
        ((SelectGalleryAdapter) this.f27355n0.getValue()).notifyDataSetChanged();
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStop() {
        super.onStop();
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public final void p2() {
        boolean z10;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            C2();
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (i10 >= 34) {
            z10 = true;
        } else {
            z10 = false;
        }
        pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b bVar = this.L0;
        Handler handler = this.J;
        androidx.activity.result.c<String[]> cVar = this.f27353l0;
        if (z10) {
            if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.e(this) && !pdf.pdfreader.viewer.editor.free.utils.extension.c.d(this)) {
                handler.postDelayed(bVar, 500L);
                cVar.a(new String[]{ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFIDQQdfF0UlSTZfCE1yRw5T", "ZawAR7s6"), ea.a.p("GG5dcihpMy44ZRRtXXMkaVdufFIMQXJfOUU1SRBfFEkqVXhMGFUERRpfNUV4RRRUfUQ=", "Apy9GWGW")});
                return;
            }
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.e(this) && !pdf.pdfreader.viewer.editor.free.utils.extension.c.d(this)) {
                this.f27349h0 = true;
            }
            C2();
            return;
        }
        if (i10 >= 33) {
            z11 = true;
        }
        if (z11) {
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.d(this)) {
                C2();
                return;
            }
            handler.postDelayed(bVar, 500L);
            cVar.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfP0U2SRFfGU0OR3RT", "z4dgrrPP")});
        } else if (pdf.pdfreader.viewer.editor.free.utils.extension.c.b(this)) {
            C2();
        } else {
            handler.postDelayed(bVar, 500L);
            this.f27352k0.a(new String[]{ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFIDQQdfLFgzRTtOEkxsUx9PIUElRQ==", "igiSKKNm"), ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFcUSRdFEkUwVH1SP0F_XxhUPFIjR0U=", "Mh8q0Go6")});
        }
    }

    public void q2() {
        if (!h2() && !kotlin.jvm.internal.g.a(this.f27363v0, ea.a.p("LGFcZQth", "2NPlYMym"))) {
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.c(this, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$checkShowBackConvertFullAd$1
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ReaderImg2PDFChooseActivity.this.t2();
                }
            }, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$checkShowBackConvertFullAd$2
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ReaderImg2PDFChooseActivity.this.K0 = true;
                }
            });
        } else {
            t2();
        }
    }

    public void r2() {
        final ArrayList arrayList = (ArrayList) x2().f30453f.d();
        if (arrayList != null && (!arrayList.isEmpty())) {
            if (this.f27006y == CameraMode.Ocr) {
                tf.c cVar = OCREventCenter.f28670a;
                OCREventCenter.c(arrayList.size(), ea.a.p("Wm0scxZsB2N0", "yvwXFPw0"));
                new OCRTransportImageExecutor(this, new l<List<? extends um.a>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$clickContinue$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(List<um.a> result) {
                        kotlin.jvm.internal.g.e(result, "result");
                        if (!result.isEmpty()) {
                            if (result.size() < arrayList.size()) {
                                ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = this;
                                j1.e(readerImg2PDFChooseActivity, readerImg2PDFChooseActivity.getResources().getString(R.string.arg_res_0x7f130569), false, null, -1);
                            }
                            pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.a(result);
                            OCRPreviewActivity.a aVar = OCRPreviewActivity.f25092x;
                            ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity2 = this;
                            OCRWorkFlow oCRWorkFlow = OCRWorkFlow.TOOLS_CHOOSE;
                            aVar.getClass();
                            OCRPreviewActivity.a.a(readerImg2PDFChooseActivity2, oCRWorkFlow);
                            return;
                        }
                        ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity3 = this;
                        j1.e(readerImg2PDFChooseActivity3, readerImg2PDFChooseActivity3.getResources().getString(R.string.arg_res_0x7f13019f), false, null, -1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(List<? extends um.a> list) {
                        invoke2((List<um.a>) list);
                        return tf.d.f30009a;
                    }
                }).l(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.j(arrayList));
                return;
            }
            k2(ea.a.p("Jm1WcxxsUmN0", "iByMdwuE"), arrayList.size(), new l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity$clickContinue$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return tf.d.f30009a;
                }

                public final void invoke(boolean z10) {
                    ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = ReaderImg2PDFChooseActivity.this;
                    ArrayList<ul.b> arrayList2 = arrayList;
                    kotlin.jvm.internal.g.d(arrayList2, ea.a.p("DHQ=", "lse7cX1D"));
                    readerImg2PDFChooseActivity.f2(arrayList2);
                }
            });
        }
    }

    public void s2(RecyclerView recyclerView) {
        DragSelectionProcessor dragSelectionProcessor = new DragSelectionProcessor(new c());
        dragSelectionProcessor.f28620a = DragSelectionProcessor.Mode.Simple;
        pdf.pdfreader.viewer.editor.free.utils.drag.a aVar = new pdf.pdfreader.viewer.editor.free.utils.drag.a();
        aVar.f28634k = dragSelectionProcessor;
        recyclerView.r(aVar);
        this.f27357p0 = aVar;
    }

    public final void t2() {
        super.onBackPressed();
        if (this.f27361t0) {
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.f();
        }
        ImageConvertDataRepository.f26536a.getClass();
        ImageConvertDataRepository.g();
        k.f17927a.getClass();
        k.b(this);
    }

    public final String u2() {
        if (this.f27364w0) {
            return ea.a.p("GGgEcmQ=", "qQlmbgo7");
        }
        return this.f27362u0;
    }

    public final GalleryAdapter v2() {
        return (GalleryAdapter) this.f27354m0.getValue();
    }

    public final LinearLayout w2() {
        LinearLayout linearLayout = this.O;
        if (linearLayout != null) {
            return linearLayout;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PGVdZRp0dmw2Rmw=", "wjnuPpXZ"));
        throw null;
    }

    public final uo.a x2() {
        return (uo.a) this.I.getValue();
    }

    public final void y2(boolean z10) {
        Class cls;
        r0.b(this);
        if (this.f27347f0 == null) {
            if (this instanceof SingleImageChooseActivity) {
                cls = SingleImageChooseActivity.class;
            } else {
                cls = ReaderImg2PDFChooseActivity.class;
            }
            this.f27347f0 = new a1(this, cls, new h5.a(this, 20));
        }
        if (z10) {
            a1 a1Var = this.f27347f0;
            if (a1Var != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    Activity activity = a1Var.f28536a;
                    if (com.google.android.play.core.assetpacks.c.W(activity)) {
                        a1Var.f28540f = false;
                        a1Var.c.execute(new a1.a(activity));
                        return;
                    }
                    return;
                }
                t1.b(ea.a.p("HWVQZBxyZ2UobSNzBmkHbnZoC2MuZRcgH3QRchNDOmUsa3BsFU1SZDNhA20UZw1zZWUcbSxzFmkDbg==", "Vk3wlpgR"));
                return;
            }
            return;
        }
        a1 a1Var2 = this.f27347f0;
        if (a1Var2 != null) {
            Activity activity2 = a1Var2.f28536a;
            if (com.google.android.play.core.assetpacks.c.W(activity2)) {
                a1Var2.f28540f = false;
                a1Var2.c.execute(new a1.d(activity2));
            }
        }
    }

    public final void z2() {
        v2().notifyItemRangeChanged(0, v2().getItemCount(), (ArrayList) this.f27358q0.getValue());
    }
}
