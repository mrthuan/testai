package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog;

import a6.h;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.activity.s;
import androidx.viewpager2.widget.ViewPager2;
import cg.l;
import cg.p;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import oo.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.v0;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.IsIgnoredBrandUseCase;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.WidgetEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;

/* compiled from: PdfReaderAppWidgetNewDialog.kt */
/* loaded from: classes3.dex */
public final class PdfReaderAppWidgetNewDialog extends g {
    public static final /* synthetic */ int O = 0;
    public final pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b A;
    public LinearLayout B;
    public TextView C;
    public TextView D;
    public ImageView E;
    public ViewPager2 F;
    public RadioGroup G;
    public final boolean H;
    public boolean I;
    public boolean J;
    public ro.a<Boolean> K;
    public int L;
    public AnimatorSet M;
    public pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.g N;

    /* renamed from: y  reason: collision with root package name */
    public final WidgetFromType f24831y;

    /* renamed from: z  reason: collision with root package name */
    public final f f24832z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfReaderAppWidgetNewDialog(Context context, WidgetFromType widgetFromType, f fVar, pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b bVar) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "dAZ5Nzf6"));
        kotlin.jvm.internal.g.e(widgetFromType, ea.a.p("VXIkbQ==", "WeW0CO9V"));
        kotlin.jvm.internal.g.e(fVar, ea.a.p("QGgkcgdjF3QgYUBpBm43bCFIV2w2ZXI=", "YCibD0Rp"));
        kotlin.jvm.internal.g.e(bVar, ea.a.p("UnA7UxZ0FmkcZ2RlG20_czdpXW4PbjdyKmQyYwZy", "EGcEauxY"));
        this.f24831y = widgetFromType;
        this.f24832z = fVar;
        this.A = bVar;
        this.H = IsIgnoredBrandUseCase.a();
    }

    public static ObjectAnimator H(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, ea.a.p("Umw7aGE=", "vaMOVCGL"), 1.0f, 0.0f);
        kotlin.jvm.internal.g.d(ofFloat, ea.a.p("XGYNbBxhFigEaVF3RSB0YShwWmFkLGMxVCxpMBQp", "2IrZK5AH"));
        return ofFloat;
    }

    public static ObjectAnimator I(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, ea.a.p("Umw7aGE=", "rEaDED7S"), 0.0f, 1.0f);
        kotlin.jvm.internal.g.d(ofFloat, ea.a.p("XGYNbBxhFigEaVF3RSB0YShwWmFkLGMwNSx1MSMp", "SUErNpy7"));
        return ofFloat;
    }

    public final void J(int i10) {
        switch (i10) {
            case 0:
            case 1:
                TextView textView = this.C;
                if (textView != null) {
                    textView.setText(R.string.arg_res_0x7f130341);
                }
                TextView textView2 = this.D;
                if (textView2 != null) {
                    textView2.setText(R.string.arg_res_0x7f130342);
                    return;
                }
                return;
            case 2:
            case 5:
                TextView textView3 = this.C;
                if (textView3 != null) {
                    textView3.setText(R.string.arg_res_0x7f13019b);
                }
                TextView textView4 = this.D;
                if (textView4 != null) {
                    textView4.setText(R.string.arg_res_0x7f13019d);
                    return;
                }
                return;
            case 3:
            case 6:
                TextView textView5 = this.C;
                if (textView5 != null) {
                    textView5.setText(R.string.arg_res_0x7f130453);
                }
                TextView textView6 = this.D;
                if (textView6 != null) {
                    textView6.setText(R.string.arg_res_0x7f130451);
                    return;
                }
                return;
            case 4:
            case 7:
                TextView textView7 = this.C;
                if (textView7 != null) {
                    textView7.setText(R.string.arg_res_0x7f13010f);
                }
                TextView textView8 = this.D;
                if (textView8 != null) {
                    textView8.setText(R.string.arg_res_0x7f130110);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.material.bottomsheet.b, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        super.cancel();
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setAlpha(1.0f);
        }
        TextView textView2 = this.D;
        if (textView2 != null) {
            textView2.setAlpha(1.0f);
        }
        ViewPager2 viewPager2 = this.F;
        if (viewPager2 != null) {
            viewPager2.post(new androidx.fragment.app.g(18, viewPager2, this));
        }
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
        this.I = false;
        this.J = false;
        Context context = getContext();
        String p10 = ea.a.p("UHUcZGU=", "RY7upTUX");
        String p11 = ea.a.p("RGkvZxZ0EV8BaFt3", "5zVnhSuS");
        tf.c cVar = WidgetEventCenter.f28682a;
        tn.a.d(context, p10, p11, WidgetEventCenter.b(this.f24831y), false);
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_app_widget_list;
    }

    @Override // oo.g
    public final void z() {
        this.B = (LinearLayout) x().findViewById(R.id.widget_ll_add);
        this.E = (ImageView) x().findViewById(R.id.widget_iv_close);
        this.F = (ViewPager2) x().findViewById(R.id.widget_vp_content);
        this.C = (TextView) x().findViewById(R.id.widget_tv_title);
        this.D = (TextView) x().findViewById(R.id.widget_tv_des);
        RadioGroup radioGroup = (RadioGroup) x().findViewById(R.id.widget_radioGroup);
        this.G = radioGroup;
        if (radioGroup != null) {
            radioGroup.check(R.id.widget_radio1);
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(R.string.arg_res_0x7f130341);
        }
        TextView textView2 = this.D;
        if (textView2 != null) {
            textView2.setText(R.string.arg_res_0x7f130342);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        ViewPager2 viewPager2 = this.F;
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(arrayList.size());
        }
        ViewPager2 viewPager22 = this.F;
        if (viewPager22 != null) {
            viewPager22.setPageTransformer(new mm.b());
        }
        ViewPager2 viewPager23 = this.F;
        if (viewPager23 != null) {
            viewPager23.f(new a());
        }
        ViewPager2 viewPager24 = this.F;
        if (viewPager24 != null) {
            viewPager24.setAdapter(new pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.b(arrayList));
        }
        LinearLayout linearLayout = this.B;
        if (linearLayout != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog$initView$2

                /* compiled from: PdfReaderAppWidgetNewDialog.kt */
                @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog$initView$2$1", f = "PdfReaderAppWidgetNewDialog.kt", l = {ShapeTypes.SQUARE_TABS}, m = "invokeSuspend")
                /* renamed from: pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog$initView$2$1  reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
                    final /* synthetic */ Activity $activity;
                    int label;
                    final /* synthetic */ PdfReaderAppWidgetNewDialog this$0;

                    /* compiled from: PdfReaderAppWidgetNewDialog.kt */
                    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog$initView$2$1$a */
                    /* loaded from: classes3.dex */
                    public static final class a<T> implements kotlinx.coroutines.flow.d {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ PdfReaderAppWidgetNewDialog f24834a;

                        public a(PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog) {
                            this.f24834a = pdfReaderAppWidgetNewDialog;
                        }

                        @Override // kotlinx.coroutines.flow.d
                        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c cVar2 = (pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.c) obj;
                            cVar2.toString();
                            String str = n0.f28727a;
                            if (cVar2 instanceof c.a) {
                                cVar2.toString();
                            } else if ((cVar2 instanceof c.b) && ((c.b) cVar2).f24812b) {
                                PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog = this.f24834a;
                                Context context = pdfReaderAppWidgetNewDialog.getContext();
                                tf.c cVar3 = WidgetEventCenter.f28682a;
                                WidgetFromType widgetFromType = pdfReaderAppWidgetNewDialog.f24831y;
                                tn.a.d(context, "guide", "widgets_add_done", h.c(WidgetEventCenter.b(widgetFromType), "_total"), false);
                                Context context2 = pdfReaderAppWidgetNewDialog.getContext();
                                String b10 = WidgetEventCenter.b(widgetFromType);
                                tn.a.d(context2, "guide", "widgets_add_done", b10 + "_" + (pdfReaderAppWidgetNewDialog.L + 1), false);
                                if (widgetFromType == WidgetFromType.Guide) {
                                    AppCoreFilterEvent.g("widgets_done");
                                }
                            }
                            return d.f30009a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog, Activity activity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.this$0 = pdfReaderAppWidgetNewDialog;
                        this.$activity = activity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass1(this.this$0, this.$activity, cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.label;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                s.u0(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            s.u0(obj);
                            kotlinx.coroutines.flow.c o10 = aj.b.o(aj.b.X(aj.b.X(new e(d.f30009a), new PdfReaderAppWidgetNewDialog$initView$2$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0, this.$activity)), new PdfReaderAppWidgetNewDialog$initView$2$1$invokeSuspend$$inlined$flatMapLatest$2(null, this.this$0, this.$activity)), j0.f20207b);
                            a aVar = new a(this.this$0);
                            this.label = 1;
                            if (o10.a(aVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return d.f30009a;
                    }

                    @Override // cg.p
                    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
                        return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(d.f30009a);
                    }
                }

                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog = PdfReaderAppWidgetNewDialog.this;
                    pdfReaderAppWidgetNewDialog.I = true;
                    if (pdfReaderAppWidgetNewDialog.f24831y == WidgetFromType.Guide) {
                        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                        AppCoreFilterEvent.g(ea.a.p("RGkvZxZ0EV8TZGQ=", "YiZ69pSe"));
                    }
                    PdfReaderAppWidgetNewDialog.this.cancel();
                    Context context = PdfReaderAppWidgetNewDialog.this.getContext();
                    kotlin.jvm.internal.g.d(context, ea.a.p("EW8cdAl4dA==", "cKrrlq3L"));
                    Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(context);
                    if (l10 instanceof androidx.appcompat.app.c) {
                        t0.d0(b.b.x(PdfReaderAppWidgetNewDialog.this), null, null, new AnonymousClass1(PdfReaderAppWidgetNewDialog.this, l10, null), 3);
                    }
                }
            });
        }
        ImageView imageView = this.E;
        if (imageView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog$initView$3
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    PdfReaderAppWidgetNewDialog.this.cancel();
                }
            });
        }
        setOnCancelListener(new v0(this, 1));
    }

    /* compiled from: PdfReaderAppWidgetNewDialog.kt */
    /* loaded from: classes3.dex */
    public static final class a extends ViewPager2.g {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i10) {
            TextView textView;
            PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog = PdfReaderAppWidgetNewDialog.this;
            if (pdfReaderAppWidgetNewDialog.L <= 1 && i10 <= 1) {
                TextView textView2 = pdfReaderAppWidgetNewDialog.C;
                if (textView2 != null) {
                    textView2.setText(R.string.arg_res_0x7f130341);
                }
                TextView textView3 = pdfReaderAppWidgetNewDialog.D;
                if (textView3 != null) {
                    textView3.setText(R.string.arg_res_0x7f130342);
                }
            } else {
                TextView textView4 = pdfReaderAppWidgetNewDialog.C;
                if (textView4 != null && (textView = pdfReaderAppWidgetNewDialog.D) != null) {
                    AnimatorSet animatorSet = pdfReaderAppWidgetNewDialog.M;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ObjectAnimator H = PdfReaderAppWidgetNewDialog.H(textView4);
                    ObjectAnimator H2 = PdfReaderAppWidgetNewDialog.H(textView);
                    ObjectAnimator I = PdfReaderAppWidgetNewDialog.I(textView4);
                    ObjectAnimator I2 = PdfReaderAppWidgetNewDialog.I(textView);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playTogether(H, H2);
                    animatorSet3.addListener(new b(pdfReaderAppWidgetNewDialog, i10));
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(I, I2);
                    animatorSet2.playSequentially(animatorSet3, animatorSet4);
                    animatorSet2.setDuration(300L);
                    animatorSet2.start();
                    pdfReaderAppWidgetNewDialog.M = animatorSet2;
                }
            }
            if (pdfReaderAppWidgetNewDialog.L != i10 && !pdfReaderAppWidgetNewDialog.J) {
                Context m10 = ReaderPdfApplication.m();
                String p10 = ea.a.p("NXVeZGU=", "rwR7EJWe");
                String p11 = ea.a.p("RGkvZxZ0EV8RaFVuDmU=", "0ki26gsU");
                tf.c cVar = WidgetEventCenter.f28682a;
                tn.a.d(m10, p10, p11, WidgetEventCenter.b(pdfReaderAppWidgetNewDialog.f24831y), false);
                pdfReaderAppWidgetNewDialog.J = true;
            }
            switch (i10) {
                case 0:
                    RadioGroup radioGroup = pdfReaderAppWidgetNewDialog.G;
                    if (radioGroup != null) {
                        radioGroup.check(R.id.widget_radio1);
                        break;
                    }
                    break;
                case 1:
                    RadioGroup radioGroup2 = pdfReaderAppWidgetNewDialog.G;
                    if (radioGroup2 != null) {
                        radioGroup2.check(R.id.widget_radio2);
                        break;
                    }
                    break;
                case 2:
                    RadioGroup radioGroup3 = pdfReaderAppWidgetNewDialog.G;
                    if (radioGroup3 != null) {
                        radioGroup3.check(R.id.widget_radio3);
                        break;
                    }
                    break;
                case 3:
                    RadioGroup radioGroup4 = pdfReaderAppWidgetNewDialog.G;
                    if (radioGroup4 != null) {
                        radioGroup4.check(R.id.widget_radio4);
                        break;
                    }
                    break;
                case 4:
                    RadioGroup radioGroup5 = pdfReaderAppWidgetNewDialog.G;
                    if (radioGroup5 != null) {
                        radioGroup5.check(R.id.widget_radio5);
                        break;
                    }
                    break;
                case 5:
                    RadioGroup radioGroup6 = pdfReaderAppWidgetNewDialog.G;
                    if (radioGroup6 != null) {
                        radioGroup6.check(R.id.widget_radio6);
                        break;
                    }
                    break;
                case 6:
                    RadioGroup radioGroup7 = pdfReaderAppWidgetNewDialog.G;
                    if (radioGroup7 != null) {
                        radioGroup7.check(R.id.widget_radio7);
                        break;
                    }
                    break;
                case 7:
                    RadioGroup radioGroup8 = pdfReaderAppWidgetNewDialog.G;
                    if (radioGroup8 != null) {
                        radioGroup8.check(R.id.widget_radio8);
                        break;
                    }
                    break;
            }
            pdfReaderAppWidgetNewDialog.L = i10;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void a(int i10) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void b(int i10, float f10, int i11) {
        }
    }
}
