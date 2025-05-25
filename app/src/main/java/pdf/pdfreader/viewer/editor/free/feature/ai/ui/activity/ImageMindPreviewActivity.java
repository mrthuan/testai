package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.chrisbanes.photoview.PhotoView;
import com.gyf.immersionbar.BarHide;
import jl.a;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ImageMindPreviewActivity.kt */
/* loaded from: classes3.dex */
public final class ImageMindPreviewActivity extends jl.a {

    /* renamed from: v  reason: collision with root package name */
    public static final String f24429v = ea.a.p("Jm1QZxxfQnI2XyFleQ==", "6ggzIAsV");

    /* renamed from: t  reason: collision with root package name */
    public final tf.c f24430t = kotlin.a.a(new cg.a<am.k>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ImageMindPreviewActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.k invoke() {
            View inflate = ImageMindPreviewActivity.this.getLayoutInflater().inflate(R.layout.activity_image_mind_preview, (ViewGroup) null, false);
            int i10 = R.id.mind_iv_close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.mind_iv_close);
            if (appCompatImageView != null) {
                i10 = R.id.mind_photo_view;
                PhotoView photoView = (PhotoView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.mind_photo_view);
                if (photoView != null) {
                    i10 = R.id.mind_tv_save;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.mind_tv_save);
                    if (appCompatTextView != null) {
                        i10 = R.id.mind_tv_share;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.mind_tv_share);
                        if (appCompatTextView2 != null) {
                            i10 = R.id.top_space;
                            if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_space)) != null) {
                                return new am.k((ConstraintLayout) inflate, appCompatImageView, photoView, appCompatTextView, appCompatTextView2);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException(ea.a.p("IGk_cxBuCyA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "HfmLyl1n").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* renamed from: u  reason: collision with root package name */
    public boolean f24431u = true;

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = a2().f1020a;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0", "0ItJZ5sE"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // jl.a
    public final void K1() {
        final String stringExtra = getIntent().getStringExtra(f24429v);
        com.bumptech.glide.e n10 = com.bumptech.glide.b.c(this).h(this).a().n(3000, 3000);
        n10.F = stringExtra;
        n10.I = true;
        n10.E(a2().c);
        a2().c.setMaximumScale(6.0f);
        a2().c.setMediumScale(3.0f);
        a2().f1021b.setOnClickListener(new f0(this, 1));
        AppCompatTextView appCompatTextView = a2().f1022d;
        kotlin.jvm.internal.g.d(appCompatTextView, ea.a.p("LWlfZBBuUC43aSRkIXY7YUNl", "8BAWshKN"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ImageMindPreviewActivity$initView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                boolean z10;
                kotlin.jvm.internal.g.e(it, "it");
                final ImageMindPreviewActivity imageMindPreviewActivity = ImageMindPreviewActivity.this;
                final String str = stringExtra;
                String str2 = ImageMindPreviewActivity.f24429v;
                imageMindPreviewActivity.getClass();
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(imageMindPreviewActivity) || pdf.pdfreader.viewer.editor.free.utils.h1.c()) {
                    z10 = false;
                } else {
                    imageMindPreviewActivity.R1(new a.d() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.n0
                        @Override // jl.a.d
                        public final void B(boolean z11) {
                            String str3 = ImageMindPreviewActivity.f24429v;
                            String p10 = ea.a.p("O2hYc10w", "I6llKONp");
                            ImageMindPreviewActivity imageMindPreviewActivity2 = ImageMindPreviewActivity.this;
                            kotlin.jvm.internal.g.e(imageMindPreviewActivity2, p10);
                            if (z11) {
                                imageMindPreviewActivity2.b2(str);
                            }
                        }
                    });
                    z10 = true;
                }
                if (z10) {
                    return;
                }
                ImageMindPreviewActivity.this.b2(stringExtra);
            }
        });
        AppCompatTextView appCompatTextView2 = a2().f1023e;
        kotlin.jvm.internal.g.d(appCompatTextView2, ea.a.p("UWklZBpuBS4faVpkPXYFaCVyZQ==", "0qWfuxLO"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ImageMindPreviewActivity$initView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                final ImageMindPreviewActivity imageMindPreviewActivity = ImageMindPreviewActivity.this;
                if (imageMindPreviewActivity.f24431u) {
                    imageMindPreviewActivity.f24431u = false;
                    String str = stringExtra;
                    cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ImageMindPreviewActivity$initView$3.1
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
                            ImageMindPreviewActivity.this.f24431u = true;
                        }
                    };
                    final ImageMindPreviewActivity imageMindPreviewActivity2 = ImageMindPreviewActivity.this;
                    cg.a<tf.d> aVar2 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ImageMindPreviewActivity$initView$3.2
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
                            pdf.pdfreader.viewer.editor.free.utils.w0.a().f28791b.execute(new o0(ImageMindPreviewActivity.this, 0));
                        }
                    };
                    com.bumptech.glide.e<Bitmap> a10 = com.bumptech.glide.b.c(imageMindPreviewActivity).f(imageMindPreviewActivity).a();
                    a10.F = str;
                    a10.I = true;
                    a10.F(new lm.c(imageMindPreviewActivity, aVar, aVar2));
                }
            }
        });
    }

    public final am.k a2() {
        return (am.k) this.f24430t.getValue();
    }

    public final void b2(String str) {
        cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ImageMindPreviewActivity$saveGallery$1
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
                ImageMindPreviewActivity imageMindPreviewActivity = ImageMindPreviewActivity.this;
                imageMindPreviewActivity.runOnUiThread(new p0(imageMindPreviewActivity, 0));
            }
        };
        cg.a<tf.d> aVar2 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ImageMindPreviewActivity$saveGallery$2
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
                ImageMindPreviewActivity imageMindPreviewActivity = ImageMindPreviewActivity.this;
                imageMindPreviewActivity.runOnUiThread(new q0(imageMindPreviewActivity, 0));
            }
        };
        com.bumptech.glide.e<Bitmap> a10 = com.bumptech.glide.b.c(this).f(this).a();
        a10.F = str;
        a10.I = true;
        a10.F(new lm.a(this, aVar2, aVar));
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.gyf.immersionbar.g r4 = com.gyf.immersionbar.g.r(this);
        if (this.f19294h && new com.gyf.immersionbar.a(this).f13751b) {
            r4.e(BarHide.FLAG_HIDE_NAVIGATION_BAR);
        }
        r4.p(r4.f13790a.findViewById(R.id.top_space));
        r4.f13799k.f13757d = true;
        r4.o(false);
        r4.j(false);
        r4.i(R.color.color_100_232528);
        r4.f();
    }

    @Override // jl.a
    public final void C1() {
    }
}
