package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import am.t1;
import am.x;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.l1;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.vm.SubscriptionViewModel;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import qb.j0;

/* compiled from: SubscriptionDarkTestJActivity.kt */
/* loaded from: classes3.dex */
public final class SubscriptionDarkTestJActivity extends BaseSubscriptionActivity {

    /* renamed from: b0  reason: collision with root package name */
    public static final a f24905b0;
    public final tf.c S = kotlin.a.a(new cg.a<x>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final x invoke() {
            return x.a(SubscriptionDarkTestJActivity.this.getLayoutInflater());
        }
    });
    public t1 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public l1 Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public ValueAnimator f24906a0;

    /* compiled from: SubscriptionDarkTestJActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: SubscriptionDarkTestJActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24907a;

        static {
            int[] iArr = new int[SubscriptionType.values().length];
            try {
                iArr[SubscriptionType.MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionType.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_3D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_7D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_14D.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f24907a = iArr;
        }
    }

    /* compiled from: SubscriptionDarkTestJActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f24910e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f24911f;

        public d(String str, String str2) {
            this.f24910e = str;
            this.f24911f = str2;
        }

        @Override // oo.a
        public final void a() {
            SubscriptionType subscriptionType;
            Context m10 = ReaderPdfApplication.m();
            String p10 = ea.a.p("JmFw", "JKeAt8MJ");
            String p11 = ea.a.p("WmE7chZ0A2kcX0d0CHIiXydsW2Nr", "dX3MLTb5");
            SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = SubscriptionDarkTestJActivity.this;
            String str = this.f24910e;
            String str2 = this.f24911f;
            tn.a.d(m10, p10, p11, subscriptionDarkTestJActivity.g2(str, str2, false), false);
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("WmFw", "Iuaf2D1X"), ea.a.p("WmE7chZ0A2kcX0d0CHIiXydsW2Nr", "i0aYIsUC"), subscriptionDarkTestJActivity.g2(str, str2, true), false);
            if (subscriptionDarkTestJActivity.C) {
                subscriptionType = SubscriptionType.YEAR_TRIAL_7D;
            } else {
                subscriptionType = SubscriptionType.YEAR_TRIAL_14D;
            }
            subscriptionDarkTestJActivity.J = subscriptionType;
            subscriptionDarkTestJActivity.w2(subscriptionType, str);
        }

        @Override // androidx.fragment.app.w, oo.a
        public final void cancel() {
            Context m10 = ReaderPdfApplication.m();
            String p10 = ea.a.p("JmFw", "PYYJhJGL");
            String p11 = ea.a.p("WmE7chZ0A2kcX1hlCHYzXydsW2Nr", "N36s0Glw");
            SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = SubscriptionDarkTestJActivity.this;
            String str = this.f24910e;
            String str2 = this.f24911f;
            tn.a.d(m10, p10, p11, subscriptionDarkTestJActivity.g2(str, str2, false), false);
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("JmFw", "N1bXhQGz"), ea.a.p("JmFBchx0Vmk0XyZlFHYNX1ZsB2Nr", "f22MvQJZ"), subscriptionDarkTestJActivity.g2(str, str2, true), false);
            subscriptionDarkTestJActivity.finish();
        }
    }

    static {
        ea.a.p("GXUXcxJyGXA8aQlucGEla2xlIXRK", "jsJuqpIV");
        f24905b0 = new a();
    }

    public final void B2() {
        if (C2().f1611b.getVisibility() != 0 && hasWindowFocus()) {
            C2().f1611b.postDelayed(new androidx.activity.k(this, 23), c1.c(this));
        }
    }

    public final x C2() {
        return (x) this.S.getValue();
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = C2().f1610a;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0", "CWDSQwc4"));
        return constraintLayout;
    }

    public final void D2(int i10) {
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.C) {
            i11 = 4;
        } else {
            i11 = 3;
        }
        AppCompatImageView appCompatImageView = C2().f1613e;
        int i12 = i10 % i11;
        boolean z13 = false;
        if (i12 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        appCompatImageView.setSelected(z10);
        AppCompatImageView appCompatImageView2 = C2().f1614f;
        if (i12 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        appCompatImageView2.setSelected(z11);
        AppCompatImageView appCompatImageView3 = C2().f1615g;
        if (i12 == 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        appCompatImageView3.setSelected(z12);
        AppCompatImageView appCompatImageView4 = C2().f1616h;
        if (i12 == 3) {
            z13 = true;
        }
        appCompatImageView4.setSelected(z13);
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    public final void E2() {
        l1 l1Var = this.Y;
        if (l1Var != null) {
            l1Var.b(null);
        }
        this.Y = t0.d0(b.b.x(this), null, null, new SubscriptionDarkTestJActivity$reinitScrollTask$1(this, null), 3);
    }

    @Override // jl.a
    public final int F1() {
        return -16645881;
    }

    public final void F2(int i10, final ViewPager2 viewPager2) {
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(this) && i10 != viewPager2.getCurrentItem() && kl.i.a(i10, viewPager2) && !viewPager2.e()) {
            ValueAnimator valueAnimator = this.f24906a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            final boolean j10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, (i10 - viewPager2.getCurrentItem()) * viewPager2.getMeasuredWidth());
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.m
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SubscriptionDarkTestJActivity.a aVar = SubscriptionDarkTestJActivity.f24905b0;
                    String p10 = ea.a.p("ZXAkZRJpG3U7VgdsQWU=", "PqAVdtol");
                    Ref$IntRef ref$IntRef2 = Ref$IntRef.this;
                    kotlin.jvm.internal.g.e(ref$IntRef2, p10);
                    String p11 = ea.a.p("a3ZYZQ5QVmc_cg==", "DxzwM38D");
                    ViewPager2 viewPager22 = viewPager2;
                    kotlin.jvm.internal.g.e(viewPager22, p11);
                    kotlin.jvm.internal.g.e(valueAnimator2, ea.a.p("M2EddQxBB2klYRJvcg==", "Z7EqiiNo"));
                    Object animatedValue = valueAnimator2.getAnimatedValue();
                    kotlin.jvm.internal.g.c(animatedValue, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuXG5pbgJsFSA7eUFlWWtYdDZpJC48bnQ=", "XfYO3Dwy"));
                    int intValue = ((Integer) animatedValue).intValue();
                    float f10 = intValue - ref$IntRef2.element;
                    if (!j10) {
                        f10 = -f10;
                    }
                    viewPager22.c(f10);
                    ref$IntRef2.element = intValue;
                }
            });
            ofInt.addListener(new p(viewPager2));
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(550L);
            ofInt.start();
            this.f24906a0 = ofInt;
            D2(i10);
        }
    }

    @Override // jl.a
    public final void J1(Bundle bundle) {
        int i10;
        if (bundle != null) {
            i10 = bundle.getInt(ea.a.p("F3UqcjxuGUk8ZW0=", "39tXYmoc"));
        } else {
            i10 = 0;
        }
        this.Z = i10;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a
    @SuppressLint({"ClickableViewAccessibility"})
    public final void K1() {
        int i10;
        RecyclerView recyclerView;
        super.K1();
        AppCompatImageView appCompatImageView = C2().f1616h;
        boolean z10 = this.C;
        boolean z11 = false;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        appCompatImageView.setVisibility(i10);
        ViewPager2 viewPager2 = C2().f1624p;
        viewPager2.setAdapter(new om.e(z10));
        View childAt = viewPager2.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            recyclerView = (RecyclerView) childAt;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            recyclerView.setOnTouchListener(new k9.k(this, 3));
        }
        viewPager2.f(new c());
        if (this.Z > 0) {
            ea.a.p("OWlUdylhUGVy", "MpTDYUdR");
            kl.i.c(this.Z, viewPager2);
        } else if (TextUtils.equals(this.f24888v, ea.a.p("VmQidA==", "Ae0chNXR"))) {
            ea.a.p("OWlUdylhUGVy", "CvrhAcoT");
            kl.i.c(12000, viewPager2);
        } else if (TextUtils.equals(this.f24888v, ea.a.p("N2kqbg==", "GiDMGqz3"))) {
            ea.a.p("OWlUdylhUGVy", "bydEmCoh");
            kl.i.c(12001, viewPager2);
        } else if (z10) {
            ea.a.p("RWkudyNhBWVy", "acZkX1PU");
            kl.i.c(12003, viewPager2);
        } else {
            ea.a.p("OWlUdylhUGVy", "ECT4kvJn");
            kl.i.c(12002, viewPager2);
        }
        viewPager2.getCurrentItem();
        viewPager2.setPageTransformer(new om.f());
        C2().f1622n.getPaint().setFlags(C2().f1622n.getPaintFlags() | 8);
        C2().f1619k.getPaint().setFlags(C2().f1619k.getPaintFlags() | 8);
        C2().c.j();
        C2().f1611b.setOnClickListener(new u4.j(this, 8));
        C2().f1620l.setOnClickListener(new d9.f(this, 7));
        C2().f1612d.setOnClickListener(new j0(this, 6));
        C2().f1622n.setOnClickListener(new f5.d(this, 8));
        C2().f1619k.setOnClickListener(new f5.e(this, 6));
        C2().f1625q.setOnClickListener(new k9.c(this, 5));
        C2().f1618j.setOnClickListener(new u4.g(this, 6));
        C2().f1617i.setOnInflateListener(new n(this, 0));
        if (!this.c) {
            j2();
            if (SubscriptionViewModel.h(this.f24891y) && m2() && !this.W) {
                no.f.b(this).getClass();
                if (no.f.d(this) && c1.K(this)) {
                    z11 = true;
                }
            }
            if (z11) {
                C2().f1617i.inflate();
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a
    public final void L1() {
        super.L1();
        t0.d0(b.b.x(this), null, null, new SubscriptionDarkTestJActivity$initViewModel$1(this, null), 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0331, code lost:
        if (r5.equals(ea.a.p("HWEFZS5wKWYXdAlfQ28lZA==", "YtmbqMsm")) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0335, code lost:
        tn.a.a(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.m(), ea.a.p("EW9FZRFwTW93", "GIr7N9vb"));
        r2.setClass(r11, pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0357, code lost:
        if (r5.equals(ea.a.p("P2FWZSZwRWUsaS93Km8OZlxjZQ==", "AuZpQdki")) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x035b, code lost:
        r2.setClass(r11, pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x036e, code lost:
        if (r5.equals(ea.a.p("NWElZRJwC2U-aQN3a3AzZg==", "C3EBMyqT")) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0372, code lost:
        r2.setClass(r11, pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0385, code lost:
        if (r5.equals(ea.a.p("KmEpZRBwEGYXdAlfXW02Z2U=", "hEZNOt7w")) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0389, code lost:
        tn.a.a(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.m(), ea.a.p("UG85ZSxwFm9p", "bE5EkAfa"));
        ge.a.q(r1, r2, ea.a.p("LHMzbFZuC18hbQdnZQ==", "FHEl9lDB"));
        r2.setClass(r11, pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03b3, code lost:
        if (r5.equals(ea.a.p("P2FWZSZ3WHI-Xz5vKnAMZg==", "ruogzCp4")) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03b6, code lost:
        tn.a.a(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.m(), ea.a.p("LG9DZSZ3Q29w", "xDEtfw1s"));
        r2.setClass(r11, pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03d8, code lost:
        if (r5.equals(ea.a.p("OWExZRhwHWYXdAlfWG85Z2dpP2EuZQ==", "bDIVGyHA")) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03db, code lost:
        tn.a.a(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.m(), ea.a.p("UG85ZSxwFm9s", "C8HS3Qw6"));
        ge.a.q(r1, r2, ea.a.p("WnMUbBxuBV8bbVVnZQ==", "TtJPY0VM"));
        r2.setClass(r11, pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0128, code lost:
        if (r3.equals(ea.a.p("CGErZWZoGm0tXxZwdA==", "CdxL9uti")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0138, code lost:
        if (r3.equals(ea.a.p("Q2EsZSxoDW0XX0RkZg==", "YplBkwSw")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0148, code lost:
        if (r3.equals(ea.a.p("Q2EsZSxoDW0XX0BvBmxz", "5BCD1ajZ")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0158, code lost:
        if (r3.equals(ea.a.p("P2FWZSZoWG0_Xy94FmVs", "G1QExfrh")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0168, code lost:
        if (r3.equals(ea.a.p("A2FeZSd3JGQvZRJfUWQ-dA==", "hAs9xM4q")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0178, code lost:
        if (r3.equals(ea.a.p("PGEtZQdoXG0tXxFvRmQ=", "BtLJX37P")) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0187, code lost:
        if (r3.equals(ea.a.p("P2FWZSZoWG0_XyhvGmsFYUdr", "T8pklmfI")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0197, code lost:
        if (r3.equals(ea.a.p("P2FWZSZoWG0_XytsGV8OaVll", "KtR33Ujg")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a7, code lost:
        if (r3.equals(ea.a.p("Q2EsZSx3C2QVZUBfGmM3bnZwVmY=", "LHa79gWs")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b7, code lost:
        if (r3.equals(ea.a.p("P2FWZSZzUmEoY2g=", "drLQz61I")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c7, code lost:
        if (r3.equals(ea.a.p("Q2EsZSx3C2QVZUBfAG0xMjRkZg==", "9hSxomie")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d7, code lost:
        if (r3.equals(ea.a.p("Q2EsZSxoDW0XX0ZlCmU4dA==", "VXLZ7I5x")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01db, code lost:
        r2.setClass(r11, pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.class);
        ea.a.p("X28oYR9JDHQXbnQ=", "zpFgaFFo");
        ge.a.s(r1, r2, ea.a.p("P2FWZSZ0bw==", "2orVV2UW"));
        ge.a.s(r1, r2, ea.a.p("VXIkbQ==", "Vs5zpvkX"));
        ge.a.s(r1, r2, ea.a.p("M2FeZTFmA28lMg==", "3YC9nqnN"));
        startActivity(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023f, code lost:
        if (r5.equals(ea.a.p("P2FWZSZwU2YFdCVfAm8aZA==", "3vZr88dl")) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024f, code lost:
        if (r5.equals(ea.a.p("NGEvZSlwBmU-aQN3a28xZlFjZQ==", "1oDHvtsC")) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x025f, code lost:
        if (r5.equals(ea.a.p("JWE2ZS5wBmU-aQN3a3AzZg==", "oFUQqt7B")) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x026f, code lost:
        if (r5.equals(ea.a.p("EmELZW5wA2YXdAlfXW02Z2U=", "9zbl1ghm")) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c8, code lost:
        if (r5.equals(ea.a.p("Q2EsZSx3DXIWX0BvNnAyZg==", "aGZ7f0Zg")) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02d8, code lost:
        if (r5.equals(ea.a.p("Q2EsZSxwBmYtdFtfBW84ZxtpX2EhZQ==", "quaW6zhk")) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02dc, code lost:
        r2.setAction(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjNJE1c=", "coIsVimt"));
        ea.a.p("I29SYRVJWXQ_bnQ=", "fgbXA6M6");
        ge.a.r(r1, r2, ea.a.p("WGUyXwdoC3IWX0doCHJl", "Kp2WfSyO"));
        ge.a.q(r1, r2, ea.a.p("JGVIXw1oXnI-XzloFHINX0BpMXMxYRFl", "MmBOeRex"));
        ge.a.s(r1, r2, ea.a.p("HHJbbQ==", "EKz4qWGI"));
        ge.a.s(r1, r2, ea.a.p("R3k7ZTdlEWMmZUx0", "Xnbj5SV9"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0320, code lost:
        switch(r5.hashCode()) {
            case -2057610273: goto L74;
            case -1156599213: goto L71;
            case 346516212: goto L68;
            case 1138557515: goto L65;
            case 1383514819: goto L62;
            case 2089807441: goto L59;
            default: goto L77;
        };
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void finish() {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity.finish():void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final Space i2() {
        Space space = C2().f1623o;
        kotlin.jvm.internal.g.d(space, ea.a.p("UWklZBpuBS4Gb0RTGWE1ZQ==", "TaosRbJa"));
        return space;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final boolean k2() {
        return false;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        if (getIntent().hasExtra(ea.a.p("J2ElZQZmRm8lMg==", "XAWBY47R")) && TextUtils.equals(getIntent().getStringExtra(ea.a.p("Q2EsZSxmEG8fMg==", "D99iLL52")), ea.a.p("Q2EsZSxsA24VdVVnDF81aCtvQWU=", "Q2i1GRau"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.W = z10;
        super.onCreate(bundle);
        ea.a.p("IG5ychxhQ2U=", "ulXWryxn");
        this.f19294h = true;
        Window window = getWindow();
        kotlin.jvm.internal.g.d(window, ea.a.p("OGlfZBZ3", "gilUK2fM"));
        pdf.pdfreader.viewer.editor.free.utils.extension.i.b(window, false);
        Window window2 = getWindow();
        kotlin.jvm.internal.g.d(window2, ea.a.p("RGklZBx3", "Cd0s8Aaq"));
        pdf.pdfreader.viewer.editor.free.utils.extension.i.a(window2, false);
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ValueAnimator valueAnimator = this.f24906a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(ea.a.p("UHU5chZuFkkGZW0=", "8E5AyZ6l"), C2().f1624p.getCurrentItem());
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        LottieAnimationView lottieAnimationView;
        super.onWindowFocusChanged(z10);
        j2().o(z10);
        if (z10) {
            if (this.U) {
                t1 t1Var = this.T;
                if (t1Var != null && (lottieAnimationView = (LottieAnimationView) t1Var.c) != null) {
                    lottieAnimationView.j();
                }
                t0.d0(b.b.x(this), null, null, new SubscriptionDarkTestJActivity$onWindowFocusChanged$1(this, null), 3);
                return;
            }
            if (C2().f1611b.getVisibility() != 0) {
                B2();
            }
            if (this.Y == null && hasWindowFocus()) {
                E2();
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void p2() {
        boolean f10;
        Object obj;
        boolean z10;
        if (this.U) {
            return;
        }
        s2();
        SubscriptionViewModel j22 = j2();
        boolean z11 = this.C;
        if (z11) {
            f10 = j22.g(this.f24891y);
        } else {
            f10 = j22.f(this.f24891y);
        }
        if (m2() && !this.f24892z && f10) {
            Iterator<T> it = j2().e(this.f24891y).c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    ol.i iVar = (ol.i) obj;
                    if (!z11 ? iVar.f23489a == SubscriptionType.YEAR_TRIAL_14D : iVar.f23489a == SubscriptionType.YEAR_TRIAL_7D) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ol.i iVar2 = (ol.i) obj;
            if (iVar2 != null) {
                String p10 = ea.a.p("E2whc2U=", "ccpNHXDT");
                String str = iVar2.f23491d;
                d dVar = new d(p10, str);
                if (l2()) {
                    pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a aVar = new pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a(this, iVar2.f23491d, iVar2.c, iVar2.f23492e);
                    aVar.f23542t = dVar;
                    aVar.show();
                } else {
                    pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b bVar = new pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b(this, str, iVar2.c);
                    bVar.f23542t = dVar;
                    bVar.show();
                }
                this.f24892z = true;
                tn.a.d(this, ea.a.p("JmFw", "1z1niswP"), ea.a.p("WmE7chZ0A2kcX0doBnc=", "taDbwujL"), g2(p10, str, false), false);
                tn.a.d(this, ea.a.p("DGFw", "ZCe99HcR"), ea.a.p("DmEyclJ0EWkmXxVoW3c=", "36gB7pLL"), g2(p10, str, true), false);
                return;
            }
        }
        finish();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void q2(boolean z10, boolean z11) {
        int i10;
        int i11;
        C2().f1625q.setSelected(z10);
        C2().f1618j.setSelected(!z10);
        AppCompatImageView appCompatImageView = C2().f1628t;
        int i12 = 0;
        if (z10 && z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        appCompatImageView.setVisibility(i10);
        TextView textView = C2().f1629u;
        if (z10 && z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        TextView textView2 = C2().f1627s;
        if (!z11) {
            i12 = 8;
        }
        textView2.setVisibility(i12);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void u2(ol.d info) {
        kotlin.jvm.internal.g.e(info, "info");
        TextView textView = C2().f1629u;
        String string = getString(R.string.arg_res_0x7f13034e, info.f23477b);
        textView.setText(string + " ");
        for (ol.i iVar : info.c) {
            int i10 = b.f24907a[iVar.f23489a.ordinal()];
            String str = iVar.c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        C2().f1627s.setText(getString(R.string.arg_res_0x7f13057d, str));
                        C2().f1626r.setText(getString(R.string.arg_res_0x7f1300e1, iVar.f23491d));
                    }
                } else {
                    C2().f1626r.setText(getString(R.string.arg_res_0x7f130263, str));
                }
            } else {
                C2().f1618j.setText(getString(R.string.arg_res_0x7f130268, str));
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void z2(String str, boolean z10) {
        int i10;
        boolean z11 = !z10;
        if (z10) {
            i10 = R.drawable.ic_subscription_positive;
        } else {
            i10 = R.drawable.ic_subscription_negative;
        }
        j1.i(this, str, z11, i10);
    }

    @Override // jl.a
    public final void C1() {
    }

    /* compiled from: SubscriptionDarkTestJActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c extends ViewPager2.g {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i10) {
            a aVar = SubscriptionDarkTestJActivity.f24905b0;
            SubscriptionDarkTestJActivity.this.D2(i10);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void a(int i10) {
        }
    }
}
