package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import x0.f0;

/* compiled from: PreviewAddTextDialog.kt */
/* loaded from: classes3.dex */
public final class PreviewAddTextDialog extends androidx.activity.l implements ComponentCallbacks {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f27451o = 0;

    /* renamed from: d  reason: collision with root package name */
    public final View f27452d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27453e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27454f;

    /* renamed from: g  reason: collision with root package name */
    public final tf.c f27455g;

    /* renamed from: h  reason: collision with root package name */
    public int f27456h;

    /* renamed from: i  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.a f27457i;

    /* renamed from: j  reason: collision with root package name */
    public final int f27458j;

    /* renamed from: k  reason: collision with root package name */
    public long f27459k;

    /* renamed from: l  reason: collision with root package name */
    public String f27460l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f27461m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f27462n;

    /* compiled from: PreviewAddTextDialog.kt */
    /* loaded from: classes3.dex */
    public static final class a extends androidx.activity.n {
        public a() {
            super(true);
        }

        @Override // androidx.activity.n
        public final void a() {
            PreviewAddTextDialog.this.q();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAddTextDialog(Context context, ViewGroup viewGroup, int i10, int i11) {
        super(context, R.style.TransparentDialog);
        kotlin.jvm.internal.g.e(context, ea.a.p("Lm8fdFZ4dA==", "e7Mq3v2I"));
        ea.a.p("Q2EsZSdlGnQ=", "UaREIfFj");
        this.f27452d = viewGroup;
        this.f27453e = i10;
        this.f27454f = i11;
        this.f27455g = kotlin.a.a(new cg.a<am.i0>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog$binding$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final am.i0 invoke() {
                View inflate = PreviewAddTextDialog.this.getLayoutInflater().inflate(R.layout.dialog_preview_add_text, (ViewGroup) null, false);
                int i12 = R.id.ad_space;
                InterceptTouchFrameLayout interceptTouchFrameLayout = (InterceptTouchFrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ad_space);
                if (interceptTouchFrameLayout != null) {
                    i12 = R.id.content_edit;
                    EditText editText = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.content_edit);
                    if (editText != null) {
                        i12 = R.id.dialog_add_text_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.dialog_add_text_container);
                        if (constraintLayout != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                            i12 = R.id.ruler_space;
                            Space space = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ruler_space);
                            if (space != null) {
                                i12 = R.id.toolbar_back_img;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.toolbar_back_img);
                                if (appCompatImageView != null) {
                                    i12 = R.id.toolbar_clear_text;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.toolbar_clear_text);
                                    if (appCompatTextView != null) {
                                        i12 = R.id.toolbar_ll;
                                        if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.toolbar_ll)) != null) {
                                            i12 = R.id.toolbar_ok_img;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.toolbar_ok_img);
                                            if (appCompatImageView2 != null) {
                                                return new am.i0(constraintLayout2, interceptTouchFrameLayout, editText, constraintLayout, constraintLayout2, space, appCompatImageView, appCompatTextView, appCompatImageView2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpFWhlST46IA==", "aEzzmTU3").concat(inflate.getResources().getResourceName(i12)));
            }
        });
        this.f27456h = 1;
        this.f27458j = i10;
        this.f27459k = -1L;
        this.f27460l = "";
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            EditText editText = p().c;
            kotlin.jvm.internal.g.d(editText, ea.a.p("LWlfZBBuUC45byR0EG4cRVFpdA==", "3QEflB6B"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editText);
            super.dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.g.e(newConfig, "newConfig");
        int i10 = newConfig.orientation;
        if (i10 != this.f27456h) {
            this.f27456h = i10;
        }
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i10 = Build.VERSION.SDK_INT;
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(SlideAtom.USES_MASTER_SLIDE_ID);
            window.setStatusBarColor(0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (i10 >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        }
        ConstraintLayout constraintLayout = p().f969a;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("KmkUZDhuJS46bwl0", "HMHzQBwT"));
        setContentView(constraintLayout);
        getContext().getResources().getDimensionPixelSize(R.dimen.dp_10);
        this.f27456h = getContext().getResources().getConfiguration().orientation;
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
            window2.setSoftInputMode(18);
            ConstraintLayout constraintLayout2 = p().f972e;
            androidx.privacysandbox.ads.adservices.java.internal.a aVar = new androidx.privacysandbox.ads.adservices.java.internal.a(window2, this);
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            f0.i.u(constraintLayout2, aVar);
        }
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        r(new cg.l<androidx.constraintlayout.widget.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog$onCreate$2
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(androidx.constraintlayout.widget.a aVar2) {
                invoke2(aVar2);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.constraintlayout.widget.a it) {
                kotlin.jvm.internal.g.e(it, "it");
                Context context = PreviewAddTextDialog.this.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("LG9fdBx4dA==", "1ixT4jZ1"));
                it.k(R.id.content_edit).f3373e.f3395d0 = context.getResources().getDisplayMetrics().heightPixels / 2;
            }
        });
        p().f972e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.l2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z10;
                String p10 = ea.a.p("O2hYc10w", "FcA18VcE");
                final PreviewAddTextDialog previewAddTextDialog = PreviewAddTextDialog.this;
                kotlin.jvm.internal.g.e(previewAddTextDialog, p10);
                Rect rect = new Rect();
                previewAddTextDialog.p().f972e.getWindowVisibleDisplayFrame(rect);
                int height = previewAddTextDialog.p().f972e.getRootView().getHeight();
                if (height - rect.bottom > height * 0.15d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 != previewAddTextDialog.f27461m) {
                    previewAddTextDialog.f27461m = z10;
                    if (z10) {
                        ea.a.p("DmRVVBx4Q0QzYSZvZw==", "vdPtyWOz");
                        ea.a.p("QGgkd1NrB3kQb1VyZA==", "kKg3WwXS");
                        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                        previewAddTextDialog.r(new cg.l<androidx.constraintlayout.widget.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog$onCreate$3$1
                            {
                                super(1);
                            }

                            @Override // cg.l
                            public /* bridge */ /* synthetic */ tf.d invoke(androidx.constraintlayout.widget.a aVar2) {
                                invoke2(aVar2);
                                return tf.d.f30009a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.constraintlayout.widget.a it) {
                                kotlin.jvm.internal.g.e(it, "it");
                                PreviewAddTextDialog previewAddTextDialog2 = PreviewAddTextDialog.this;
                                int i11 = PreviewAddTextDialog.f27451o;
                                it.k(R.id.content_edit).f3373e.f3395d0 = previewAddTextDialog2.p().f973f.getMeasuredHeight();
                            }
                        });
                        return;
                    }
                    ea.a.p("cmQvVBZ4FkQbYVhvZw==", "yQV0skcV");
                    ea.a.p("J2lVZVlrUnk4bytyZA==", "GQbxsNO1");
                    String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                }
            }
        });
        p().f973f.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog$onCreate$4

            /* renamed from: a  reason: collision with root package name */
            public int f27466a = -1;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View v10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                kotlin.jvm.internal.g.e(v10, "v");
                if (this.f27466a == v10.getMeasuredHeight()) {
                    return;
                }
                this.f27466a = v10.getMeasuredHeight();
                final PreviewAddTextDialog previewAddTextDialog = PreviewAddTextDialog.this;
                previewAddTextDialog.r(new cg.l<androidx.constraintlayout.widget.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog$onCreate$4$onLayoutChange$1
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(androidx.constraintlayout.widget.a aVar2) {
                        invoke2(aVar2);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.constraintlayout.widget.a it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        PreviewAddTextDialog previewAddTextDialog2 = PreviewAddTextDialog.this;
                        int i19 = PreviewAddTextDialog.f27451o;
                        it.k(R.id.content_edit).f3373e.f3392b0 = previewAddTextDialog2.p().f973f.getMeasuredHeight();
                    }
                });
            }
        });
        p().f972e.addOnLayoutChangeListener(new pdf.pdfreader.viewer.editor.free.feature.ai.widget.c(this, 2));
        p().f970b.setOnClickListener(new m2(0));
        p().f970b.setTopTouchListener(new androidx.appcompat.libconvert.helper.b(this, 16));
        p().f974g.setOnClickListener(new d9.f(this, 25));
        p().f976i.setOnClickListener(new qb.j0(this, 22));
        EditText editText = p().c;
        String string = editText.getContext().getString(R.string.arg_res_0x7f1304e0);
        editText.setHint(" " + string);
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM)});
        ea.a.p("IG5ychxhQ2V-bCttF2QJJDk=", "z1uWiG1T");
        editText.addTextChangedListener(new b(editText));
        editText.setText("");
        p().f975h.setOnClickListener(new f5.d(this, 22));
        a aVar2 = new a();
        OnBackPressedDispatcher onBackPressedDispatcher = this.c;
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.b(aVar2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        getContext().unregisterComponentCallbacks(this);
        super.onDetachedFromWindow();
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void onStart() {
        super.onStart();
        getContext().registerComponentCallbacks(this);
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void onStop() {
        getContext().unregisterComponentCallbacks(this);
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10 && isShowing()) {
            p().c.postDelayed(new pdf.pdfreader.viewer.editor.free.ui.act.tools.h(this, 1), 200L);
        }
    }

    public final am.i0 p() {
        return (am.i0) this.f27455g.getValue();
    }

    public final void q() {
        pdf.pdfreader.viewer.editor.free.ui.dialog.a aVar;
        long j10 = this.f27459k;
        if (j10 > 0 && (aVar = this.f27457i) != null) {
            ((ReaderPreviewActivity) aVar).I3(this.f27460l, this.f27453e, this.f27454f, j10, false);
        }
        dismiss();
    }

    public final void r(cg.l<? super androidx.constraintlayout.widget.a, tf.d> lVar) {
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.f(p().f971d);
        if (lVar != null) {
            lVar.invoke(aVar);
        }
        aVar.b(p().f971d);
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            super.show();
            EditText editText = p().c;
            kotlin.jvm.internal.g.d(editText, ea.a.p("LWlfZBBuUC45byR0EG4cRVFpdA==", "sU1jsfIC"));
            editText.getViewTreeObserver().addOnWindowFocusChangeListener(new pdf.pdfreader.viewer.editor.free.utils.extension.h(editText));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    /* compiled from: TextView.kt */
    /* loaded from: classes3.dex */
    public static final class b implements TextWatcher {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ EditText f27465b;

        public b(EditText editText) {
            this.f27465b = editText;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            boolean z10;
            if (charSequence != null && charSequence.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            PreviewAddTextDialog previewAddTextDialog = PreviewAddTextDialog.this;
            if (!z10 && !kotlin.text.j.H(charSequence)) {
                if (!previewAddTextDialog.f27462n) {
                    previewAddTextDialog.f27462n = true;
                    tn.a.b(this.f27465b.getContext(), ea.a.p("I2QXXzhlCXQ=", "wrBsLqhD"), ea.a.p("R2UzdCxpDHAHdGtjBWU3chtzWm93", "4GYSQEE8"));
                }
                previewAddTextDialog.p().f975h.setVisibility(0);
                return;
            }
            previewAddTextDialog.p().f975h.setVisibility(4);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
