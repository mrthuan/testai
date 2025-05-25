package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.bumptech.glide.Priority;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;

/* compiled from: ConvertGuideDialog.kt */
/* loaded from: classes3.dex */
public final class g extends oo.i {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f27566g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f27567a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27568b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<ul.b> f27569d;

    /* renamed from: e  reason: collision with root package name */
    public MotionLayout f27570e;

    /* renamed from: f  reason: collision with root package name */
    public cg.a<tf.d> f27571f;

    /* compiled from: ConvertGuideDialog.kt */
    /* loaded from: classes3.dex */
    public static final class a extends androidx.constraintlayout.motion.widget.c {
        public a() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public final void b(int i10, MotionLayout motionLayout) {
            if (g.this.isShowing()) {
                if (motionLayout != null) {
                    motionLayout.setProgress(0.0f);
                }
                if (motionLayout != null) {
                    motionLayout.H();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity, int i10, int i11, boolean z10, ArrayList arrayList) {
        super(readerImg2PDFChooseActivity, R.style.ConvertGuideDialog);
        kotlin.jvm.internal.g.e(readerImg2PDFChooseActivity, ea.a.p("LG9fdBx4dA==", "QUVtR8sk"));
        ea.a.p("I2lCdA==", "vA3AbgJ2");
        this.f27567a = i10;
        this.f27568b = i11;
        this.c = z10;
        this.f27569d = arrayList;
    }

    public static Priority c(ul.b bVar) {
        long j10 = bVar.f30406d;
        if (j10 < 10485760) {
            return Priority.HIGH;
        }
        if (j10 > 52428800) {
            return Priority.LOW;
        }
        return Priority.NORMAL;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        boolean z10 = this.c;
        int i10 = this.f27568b;
        if (i10 == 3) {
            if (z10) {
                setContentView(R.layout.dialog_convert_guide);
            } else {
                setContentView(R.layout.dialog_convert_guide_no_camera);
            }
        } else if (z10) {
            setContentView(R.layout.dialog_convert_guide4);
        } else {
            setContentView(R.layout.dialog_convert_guide4_no_camera);
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.bg_img_to_pdf_guide_dialog);
            window.setGravity(48);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                ea.a.p("UnQ_chpiF3QXcw==", "OKi5IW49");
                attributes.width = -1;
                attributes.height = -1;
            }
            attributes.flags |= 1024;
            window.setAttributes(attributes);
        }
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.f
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                String p10 = ea.a.p("O2hYc10w", "Edtr433m");
                g gVar = g.this;
                kotlin.jvm.internal.g.e(gVar, p10);
                if (i11 == 4) {
                    cg.a<tf.d> aVar = gVar.f27571f;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    gVar.cancel();
                    return false;
                }
                return false;
            }
        });
        findViewById(R.id.rulerView);
        View findViewById = findViewById(R.id.viewPlaceholder);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = this.f27567a;
        findViewById.setLayoutParams(layoutParams);
        ArrayList<ul.b> arrayList = this.f27569d;
        if (i10 == 3 && arrayList.size() >= 5) {
            com.bumptech.glide.e<Drawable> o10 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(0).f30404a);
            o10.E = com.bumptech.glide.a.c();
            Context context = getContext();
            kotlin.jvm.internal.g.d(context, ea.a.p("UG8ldBZ4dA==", "SbgZsXry"));
            com.bumptech.glide.e<Drawable> C = o10.C(b.b.C(context));
            ul.b bVar = arrayList.get(0);
            kotlin.jvm.internal.g.d(bVar, ea.a.p("JGkddDIwXQ==", "UYHni9RX"));
            com.bumptech.glide.e c = C.q(c(bVar)).c();
            String str = arrayList.get(0).f30404a;
            if (str == null) {
                str = "";
            }
            c.u(new o4.d(Long.valueOf(new File(str).lastModified()))).E((ImageView) findViewById(R.id.img1));
            com.bumptech.glide.e<Drawable> o11 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(1).f30404a);
            o11.E = com.bumptech.glide.a.c();
            Context context2 = getContext();
            kotlin.jvm.internal.g.d(context2, ea.a.p("LG9fdBx4dA==", "FdbJrONv"));
            com.bumptech.glide.e<Drawable> C2 = o11.C(b.b.C(context2));
            ul.b bVar2 = arrayList.get(1);
            kotlin.jvm.internal.g.d(bVar2, ea.a.p("I2lCdCIxXQ==", "JkuA4YLL"));
            com.bumptech.glide.e c10 = C2.q(c(bVar2)).c();
            String str2 = arrayList.get(1).f30404a;
            if (str2 == null) {
                str2 = "";
            }
            c10.u(new o4.d(Long.valueOf(new File(str2).lastModified()))).E((ImageView) findViewById(R.id.img2));
            com.bumptech.glide.e<Drawable> o12 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(2).f30404a);
            o12.E = com.bumptech.glide.a.c();
            Context context3 = getContext();
            kotlin.jvm.internal.g.d(context3, ea.a.p("LG9fdBx4dA==", "vlmBwCVZ"));
            com.bumptech.glide.e<Drawable> C3 = o12.C(b.b.C(context3));
            ul.b bVar3 = arrayList.get(2);
            kotlin.jvm.internal.g.d(bVar3, ea.a.p("I2lCdCIyXQ==", "lFxxzjkw"));
            com.bumptech.glide.e c11 = C3.q(c(bVar3)).c();
            String str3 = arrayList.get(2).f30404a;
            if (str3 == null) {
                str3 = "";
            }
            c11.u(new o4.d(Long.valueOf(new File(str3).lastModified()))).E((ImageView) findViewById(R.id.img3));
            com.bumptech.glide.e<Drawable> o13 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(3).f30404a);
            o13.E = com.bumptech.glide.a.c();
            Context context4 = getContext();
            kotlin.jvm.internal.g.d(context4, ea.a.p("LG9fdBx4dA==", "I4G1xXJn"));
            com.bumptech.glide.e<Drawable> C4 = o13.C(b.b.C(context4));
            ul.b bVar4 = arrayList.get(3);
            kotlin.jvm.internal.g.d(bVar4, ea.a.p("X2k4dCgzXQ==", "Bxo0WSkS"));
            com.bumptech.glide.e c12 = C4.q(c(bVar4)).c();
            String str4 = arrayList.get(3).f30404a;
            if (str4 == null) {
                str4 = "";
            }
            c12.u(new o4.d(Long.valueOf(new File(str4).lastModified()))).E((ImageView) findViewById(R.id.img4));
            com.bumptech.glide.e<Drawable> o14 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(4).f30404a);
            o14.E = com.bumptech.glide.a.c();
            Context context5 = getContext();
            kotlin.jvm.internal.g.d(context5, ea.a.p("LG9fdBx4dA==", "bPhU8IBv"));
            com.bumptech.glide.e<Drawable> C5 = o14.C(b.b.C(context5));
            ul.b bVar5 = arrayList.get(4);
            kotlin.jvm.internal.g.d(bVar5, ea.a.p("I2lCdCI0XQ==", "iUlm6lgt"));
            com.bumptech.glide.e c13 = C5.q(c(bVar5)).c();
            String str5 = arrayList.get(4).f30404a;
            if (str5 == null) {
                str5 = "";
            }
            c13.u(new o4.d(Long.valueOf(new File(str5).lastModified()))).E((ImageView) findViewById(R.id.img5));
            if (!z10 && arrayList.size() >= 6) {
                com.bumptech.glide.e<Drawable> o15 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(5).f30404a);
                o15.E = com.bumptech.glide.a.c();
                Context context6 = getContext();
                kotlin.jvm.internal.g.d(context6, ea.a.p("UG8ldBZ4dA==", "an6Y90iz"));
                com.bumptech.glide.e<Drawable> C6 = o15.C(b.b.C(context6));
                ul.b bVar6 = arrayList.get(5);
                kotlin.jvm.internal.g.d(bVar6, ea.a.p("I2lCdCI1XQ==", "cQ33Mgyk"));
                com.bumptech.glide.e c14 = C6.q(c(bVar6)).c();
                String str6 = arrayList.get(5).f30404a;
                if (str6 == null) {
                    str6 = "";
                }
                c14.u(new o4.d(Long.valueOf(new File(str6).lastModified()))).E((ImageView) findViewById(R.id.img6));
            }
        } else if (i10 == 4 && arrayList.size() >= 7) {
            com.bumptech.glide.e<Drawable> o16 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(0).f30404a);
            o16.E = com.bumptech.glide.a.c();
            Context context7 = getContext();
            kotlin.jvm.internal.g.d(context7, ea.a.p("C29YdC54dA==", "Hfh6KmGM"));
            com.bumptech.glide.e<Drawable> C7 = o16.C(b.b.C(context7));
            ul.b bVar7 = arrayList.get(0);
            kotlin.jvm.internal.g.d(bVar7, ea.a.p("I2lCdCIwXQ==", "CVFD46LR"));
            com.bumptech.glide.e c15 = C7.q(c(bVar7)).c();
            String str7 = arrayList.get(0).f30404a;
            if (str7 == null) {
                str7 = "";
            }
            c15.u(new o4.d(Long.valueOf(new File(str7).lastModified()))).E((ImageView) findViewById(R.id.img1));
            com.bumptech.glide.e<Drawable> o17 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(1).f30404a);
            o17.E = com.bumptech.glide.a.c();
            Context context8 = getContext();
            kotlin.jvm.internal.g.d(context8, ea.a.p("UG8ldBZ4dA==", "XRdxp5J3"));
            com.bumptech.glide.e<Drawable> C8 = o17.C(b.b.C(context8));
            ul.b bVar8 = arrayList.get(1);
            kotlin.jvm.internal.g.d(bVar8, ea.a.p("HWkldCgxXQ==", "rYqVsHcc"));
            com.bumptech.glide.e c16 = C8.q(c(bVar8)).c();
            String str8 = arrayList.get(1).f30404a;
            if (str8 == null) {
                str8 = "";
            }
            c16.u(new o4.d(Long.valueOf(new File(str8).lastModified()))).E((ImageView) findViewById(R.id.img2));
            com.bumptech.glide.e<Drawable> o18 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(2).f30404a);
            o18.E = com.bumptech.glide.a.c();
            Context context9 = getContext();
            kotlin.jvm.internal.g.d(context9, ea.a.p("UG8ldBZ4dA==", "tu5L0KzA"));
            com.bumptech.glide.e<Drawable> C9 = o18.C(b.b.C(context9));
            ul.b bVar9 = arrayList.get(2);
            kotlin.jvm.internal.g.d(bVar9, ea.a.p("I2lCdCIyXQ==", "3YACODWt"));
            com.bumptech.glide.e c17 = C9.q(c(bVar9)).c();
            String str9 = arrayList.get(2).f30404a;
            if (str9 == null) {
                str9 = "";
            }
            c17.u(new o4.d(Long.valueOf(new File(str9).lastModified()))).E((ImageView) findViewById(R.id.img3));
            com.bumptech.glide.e<Drawable> o19 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(3).f30404a);
            o19.E = com.bumptech.glide.a.c();
            Context context10 = getContext();
            kotlin.jvm.internal.g.d(context10, ea.a.p("JW8jdCN4dA==", "jqFMFoNQ"));
            com.bumptech.glide.e<Drawable> C10 = o19.C(b.b.C(context10));
            ul.b bVar10 = arrayList.get(3);
            kotlin.jvm.internal.g.d(bVar10, ea.a.p("BGlKdCEzXQ==", "d8h9zo7Z"));
            com.bumptech.glide.e c18 = C10.q(c(bVar10)).c();
            String str10 = arrayList.get(3).f30404a;
            if (str10 == null) {
                str10 = "";
            }
            c18.u(new o4.d(Long.valueOf(new File(str10).lastModified()))).E((ImageView) findViewById(R.id.img4));
            com.bumptech.glide.e<Drawable> o20 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(4).f30404a);
            o20.E = com.bumptech.glide.a.c();
            Context context11 = getContext();
            kotlin.jvm.internal.g.d(context11, ea.a.p("LG9fdBx4dA==", "JD3TsbPo"));
            com.bumptech.glide.e<Drawable> C11 = o20.C(b.b.C(context11));
            ul.b bVar11 = arrayList.get(4);
            kotlin.jvm.internal.g.d(bVar11, ea.a.p("I2lCdCI0XQ==", "nO8hZdOM"));
            com.bumptech.glide.e c19 = C11.q(c(bVar11)).c();
            String str11 = arrayList.get(4).f30404a;
            if (str11 == null) {
                str11 = "";
            }
            c19.u(new o4.d(Long.valueOf(new File(str11).lastModified()))).E((ImageView) findViewById(R.id.img5));
            com.bumptech.glide.e<Drawable> o21 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(5).f30404a);
            o21.E = com.bumptech.glide.a.c();
            Context context12 = getContext();
            kotlin.jvm.internal.g.d(context12, ea.a.p("UG8ldBZ4dA==", "6VZvhDS9"));
            com.bumptech.glide.e<Drawable> C12 = o21.C(b.b.C(context12));
            ul.b bVar12 = arrayList.get(5);
            kotlin.jvm.internal.g.d(bVar12, ea.a.p("I2lCdCI1XQ==", "BC1rCBrp"));
            com.bumptech.glide.e c20 = C12.q(c(bVar12)).c();
            String str12 = arrayList.get(5).f30404a;
            if (str12 == null) {
                str12 = "";
            }
            c20.u(new o4.d(Long.valueOf(new File(str12).lastModified()))).E((ImageView) findViewById(R.id.img6));
            com.bumptech.glide.e<Drawable> o22 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(6).f30404a);
            o22.E = com.bumptech.glide.a.c();
            Context context13 = getContext();
            kotlin.jvm.internal.g.d(context13, ea.a.p("F28fdAt4dA==", "IhtqnF6s"));
            com.bumptech.glide.e<Drawable> C13 = o22.C(b.b.C(context13));
            ul.b bVar13 = arrayList.get(6);
            kotlin.jvm.internal.g.d(bVar13, ea.a.p("IWkEdD42XQ==", "r7MwexNq"));
            com.bumptech.glide.e c21 = C13.q(c(bVar13)).c();
            String str13 = arrayList.get(6).f30404a;
            if (str13 == null) {
                str13 = "";
            }
            c21.u(new o4.d(Long.valueOf(new File(str13).lastModified()))).E((ImageView) findViewById(R.id.img7));
            if (!z10 && arrayList.size() >= 8) {
                com.bumptech.glide.e<Drawable> o23 = com.bumptech.glide.b.f(getContext()).o(arrayList.get(7).f30404a);
                o23.E = com.bumptech.glide.a.c();
                Context context14 = getContext();
                kotlin.jvm.internal.g.d(context14, ea.a.p("UG8ldBZ4dA==", "rqIXStZk"));
                com.bumptech.glide.e<Drawable> C14 = o23.C(b.b.C(context14));
                ul.b bVar14 = arrayList.get(7);
                kotlin.jvm.internal.g.d(bVar14, ea.a.p("X2k4dCg3XQ==", "BeX8SHHH"));
                com.bumptech.glide.e c22 = C14.q(c(bVar14)).c();
                String str14 = arrayList.get(7).f30404a;
                if (str14 == null) {
                    str14 = "";
                }
                c22.u(new o4.d(Long.valueOf(new File(str14).lastModified()))).E((ImageView) findViewById(R.id.img8));
            }
        }
        View findViewById2 = findViewById(R.id.motionLayout);
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuA28xaQpuJmEwbxx0KQ==", "CWvkjIiE"));
        MotionLayout motionLayout = (MotionLayout) findViewById2;
        this.f27570e = motionLayout;
        a aVar = new a();
        if (motionLayout.f3003e0 == null) {
            motionLayout.f3003e0 = new CopyOnWriteArrayList<>();
        }
        motionLayout.f3003e0.add(aVar);
        MotionLayout motionLayout2 = this.f27570e;
        if (motionLayout2 != null) {
            motionLayout2.setTransitionListener(new b());
            findViewById(R.id.gotTv).setOnClickListener(new u4.g(this, 18));
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("Xm8_aRxuLmELb0F0", "JvmTKR60"));
        throw null;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        a();
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            if (Build.VERSION.SDK_INT > 29) {
                super.show();
            } else {
                Window window = getWindow();
                window.setFlags(8, 8);
                super.show();
                oo.i.b(window);
                window.clearFlags(8);
            }
            MotionLayout motionLayout = this.f27570e;
            if (motionLayout != null) {
                motionLayout.post(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.f(this, 8));
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("Xm8_aRxuLmELb0F0", "koMVZXd0"));
                throw null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* compiled from: ConvertGuideDialog.kt */
    /* loaded from: classes3.dex */
    public static final class b implements MotionLayout.i {
        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public final void a() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public final void c() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public final void d() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public final void b(int i10, MotionLayout motionLayout) {
        }
    }
}
