package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog;

/* compiled from: RenameDialog.kt */
/* loaded from: classes3.dex */
public final class RenameDialog extends oo.f {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f27470y = 0;

    /* renamed from: n  reason: collision with root package name */
    public AppCompatEditText f27471n;

    /* renamed from: o  reason: collision with root package name */
    public ImageView f27472o;

    /* renamed from: p  reason: collision with root package name */
    public LinearLayout f27473p;

    /* renamed from: q  reason: collision with root package name */
    public TextView f27474q;

    /* renamed from: r  reason: collision with root package name */
    public ImageView f27475r;

    /* renamed from: s  reason: collision with root package name */
    public ObjectAnimator f27476s;

    /* renamed from: t  reason: collision with root package name */
    public String f27477t;

    /* renamed from: u  reason: collision with root package name */
    public String f27478u;

    /* renamed from: v  reason: collision with root package name */
    public a f27479v;

    /* renamed from: w  reason: collision with root package name */
    public final cg.l<? super String, Boolean> f27480w;

    /* renamed from: x  reason: collision with root package name */
    public String f27481x;

    /* compiled from: RenameDialog.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void c(String str, boolean z10);
    }

    /* compiled from: RenameDialog.kt */
    /* loaded from: classes3.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable s4) {
            kotlin.jvm.internal.g.e(s4, "s");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence s4, int i10, int i11, int i12) {
            kotlin.jvm.internal.g.e(s4, "s");
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence s4, int i10, int i11, int i12) {
            kotlin.jvm.internal.g.e(s4, "s");
            boolean isEmpty = TextUtils.isEmpty(s4);
            RenameDialog renameDialog = RenameDialog.this;
            if (isEmpty) {
                ImageView imageView = renameDialog.f27472o;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("LGxUYQtJWmc=", "ts4Eyjco"));
                    throw null;
                }
            }
            ImageView imageView2 = renameDialog.f27472o;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("G2wiYQRJGGc=", "7cxGvubn"));
                throw null;
            }
        }
    }

    /* compiled from: RenameDialog.kt */
    /* loaded from: classes3.dex */
    public static final class c extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            kotlin.jvm.internal.g.e(v10, "v");
            RenameDialog.this.dismiss();
        }
    }

    /* compiled from: RenameDialog.kt */
    /* loaded from: classes3.dex */
    public static final class d extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public d(TextView textView, TextView textView2) {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            Editable editable;
            kotlin.jvm.internal.g.e(v10, "v");
            RenameDialog renameDialog = RenameDialog.this;
            AppCompatEditText appCompatEditText = renameDialog.f27471n;
            if (appCompatEditText != null) {
                editable = appCompatEditText.getText();
            } else {
                editable = null;
            }
            String obj = kotlin.text.k.n0(String.valueOf(editable)).toString();
            if (!TextUtils.isEmpty(obj)) {
                pdf.pdfreader.viewer.editor.free.utils.t1.b("fileName:" + obj + ",lastName:" + renameDialog.f27481x);
                if (kotlin.jvm.internal.g.a(obj, renameDialog.f27481x)) {
                    renameDialog.dismiss();
                    return;
                } else if (renameDialog.f27480w.invoke(obj).booleanValue()) {
                    LinearLayout linearLayout = renameDialog.f27473p;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                        TextView textView = renameDialog.f27474q;
                        if (textView != null) {
                            textView.setText(renameDialog.getContext().getString(R.string.arg_res_0x7f13036b));
                            renameDialog.A();
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("RHIkbhRUdg==", "BG5cQYo7"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("OHJebh5MbA==", "DCoBgfrV"));
                    throw null;
                } else {
                    a aVar = renameDialog.f27479v;
                    if (aVar != null) {
                        aVar.c(obj, !kotlin.jvm.internal.g.a(obj, renameDialog.f27481x));
                    }
                    renameDialog.getClass();
                    renameDialog.dismiss();
                    return;
                }
            }
            LinearLayout linearLayout2 = renameDialog.f27473p;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
                renameDialog.A();
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("EXJYbjJMbA==", "93f7ULmn"));
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenameDialog(Context context, String str) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("KW8gdBR4dA==", "gCJNqWBc"));
        kotlin.jvm.internal.g.e(str, ea.a.p("BmFDaA==", "Bov7sdGt"));
        this.f27477t = "";
        this.f27478u = str;
        this.f27480w = new cg.l<String, Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog$checkFunction$1
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
                if (new java.io.File(r0 + java.io.File.separator + r9 + "." + r3).exists() != false) goto L12;
             */
            @Override // cg.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke(java.lang.String r9) {
                /*
                    r8 = this;
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.g.e(r9, r0)
                    pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog r0 = pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog.this
                    java.lang.String r0 = r0.f27478u
                    int r0 = r0.length()
                    r1 = 1
                    r2 = 0
                    if (r0 <= 0) goto L13
                    r0 = r1
                    goto L14
                L13:
                    r0 = r2
                L14:
                    if (r0 == 0) goto L98
                    pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog r0 = pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog.this
                    java.lang.String r0 = r0.f27478u
                    java.lang.String r3 = "Lw=="
                    java.lang.String r4 = "nYK672LB"
                    java.lang.String r3 = ea.a.p(r3, r4)
                    r4 = 6
                    int r3 = kotlin.text.k.Y(r0, r3, r4)
                    int r3 = r3 + r1
                    java.lang.String r3 = r0.substring(r3)
                    java.lang.String r4 = "P2gQc1FhOiAiYRBhGmw2bl8uAXQ7aVhnXS4CdTNzNnIibh4oAnQocjxJCGRReCk="
                    java.lang.String r5 = "jbKyqIEX"
                    java.lang.String r4 = ea.a.p(r4, r5)
                    kotlin.jvm.internal.g.d(r3, r4)
                    java.lang.String r4 = "/"
                    java.lang.String r3 = r4.concat(r3)
                    java.lang.String r0 = kotlin.text.k.d0(r0, r3)
                    pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog r3 = pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog.this
                    java.lang.String r3 = r3.f27478u
                    java.lang.String r3 = aj.b.M(r3)
                    int r4 = r3.length()
                    if (r4 <= 0) goto L51
                    r4 = r1
                    goto L52
                L51:
                    r4 = r2
                L52:
                    java.lang.String r5 = "."
                    if (r4 == 0) goto L7c
                    java.io.File r4 = new java.io.File
                    java.lang.String r6 = java.io.File.separator
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r0)
                    r7.append(r6)
                    r7.append(r9)
                    r7.append(r5)
                    r7.append(r3)
                    java.lang.String r6 = r7.toString()
                    r4.<init>(r6)
                    boolean r4 = r4.exists()
                    if (r4 == 0) goto L7c
                    goto L7d
                L7c:
                    r1 = r2
                L7d:
                    java.lang.String r2 = java.io.File.separator
                    java.lang.String r4 = "path:"
                    java.lang.StringBuilder r9 = android.support.v4.media.session.h.f(r4, r0, r2, r9, r5)
                    r9.append(r3)
                    java.lang.String r0 = ",isExit:"
                    r9.append(r0)
                    r9.append(r1)
                    java.lang.String r9 = r9.toString()
                    pdf.pdfreader.viewer.editor.free.utils.t1.b(r9)
                    r2 = r1
                L98:
                    java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog$checkFunction$1.invoke(java.lang.String):java.lang.Boolean");
            }
        };
        this.f27481x = "";
    }

    public final void A() {
        tf.d dVar;
        ObjectAnimator objectAnimator = this.f27476s;
        if (objectAnimator != null) {
            objectAnimator.start();
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            ObjectAnimator a10 = pdf.pdfreader.viewer.editor.free.utils.s1.a(this.f27471n);
            a10.getTarget();
            a10.start();
            this.f27476s = a10;
        }
    }

    public final void B(String name, String path) {
        kotlin.jvm.internal.g.e(name, "name");
        kotlin.jvm.internal.g.e(path, "path");
        this.f27477t = name;
        this.f27478u = path;
    }

    @Override // oo.f, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ObjectAnimator objectAnimator = this.f27476s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f27476s = null;
        }
        super.dismiss();
    }

    @Override // oo.f
    public final int r() {
        return R.layout.dialog_rename;
    }

    @Override // oo.f, android.app.Dialog
    public final void show() {
        super.show();
        t();
    }

    @Override // oo.f
    @SuppressLint({"ClickableViewAccessibility"})
    public final void t() {
        View findViewById = s().findViewById(R.id.title_tv);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiKBEuX2RWdCV0KGVsdD0p", "6xLDMiSU"));
        ((TextView) findViewById).setText(getContext().getString(R.string.arg_res_0x7f130422));
        this.f27471n = (AppCompatEditText) s().findViewById(R.id.dia_enter_file_name_et);
        View findViewById2 = s().findViewById(R.id.wrong_ll);
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiKBEuL2QedzBvXGdsbCcp", "F0B2jswp"));
        this.f27473p = (LinearLayout) findViewById2;
        View findViewById3 = s().findViewById(R.id.wrong_tv);
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("PW9edC9pUnd0ZiNuEVYBZUJCF0khKDcuXWRFdwhvIWcQdEcp", "KizI4kzO"));
        this.f27474q = (TextView) findViewById3;
        View findViewById4 = s().findViewById(R.id.iv_icon);
        kotlin.jvm.internal.g.d(findViewById4, ea.a.p("PW9edC9pUnd0ZiNuEVYBZUJCF0khKDcuW2R_aTRfLWMgbik=", "GR4K2QBD"));
        this.f27475r = (ImageView) findViewById4;
        View findViewById5 = s().findViewById(R.id.save_anim);
        kotlin.jvm.internal.g.d(findViewById5, ea.a.p("PW9edC9pUnd0ZiNuEVYBZUJCF0khKDcuWmRhcyd2Bl8ublhtKQ==", "jtbT3OFc"));
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById5;
        View findViewById6 = s().findViewById(R.id.dia_enter_file_name_cancel);
        kotlin.jvm.internal.g.d(findViewById6, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiPBdl04CVYQxlK3RWchRmGmwHXxxhWWU2YzduJ2VeKQ==", "13SEiJMj"));
        final TextView textView = (TextView) findViewById6;
        View findViewById7 = s().findViewById(R.id.dia_enter_file_name_ok);
        kotlin.jvm.internal.g.d(findViewById7, ea.a.p("PW9edC9pUnd0ZiNuEVYBZUJCF0khPDFlhoDyZGBkPGEQZV90HHJoZjNsL18bYQVlam8FKQ==", "PpyYdTNU"));
        final TextView textView2 = (TextView) findViewById7;
        ImageView imageView = this.f27475r;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_home_rename);
            LinearLayout linearLayout = this.f27473p;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                final AppCompatEditText appCompatEditText = this.f27471n;
                if (appCompatEditText != null) {
                    String str = this.f27477t;
                    appCompatEditText.setHint(" " + str);
                    appCompatEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    appCompatEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(80), new l()});
                    String str2 = this.f27477t;
                    this.f27481x = str2;
                    appCompatEditText.setText(str2);
                    appCompatEditText.setSelection(Math.min(appCompatEditText.length(), 80));
                    appCompatEditText.addTextChangedListener(new b());
                    appCompatEditText.setOnTouchListener(new pb.b(this, 2));
                    appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.v2
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                            String p10 = ea.a.p("R2gic1cw", "gaOgvABl");
                            RenameDialog renameDialog = RenameDialog.this;
                            kotlin.jvm.internal.g.e(renameDialog, p10);
                            String p11 = ea.a.p("Y3QcaSZfRXVu", "vhGtU7Uf");
                            AppCompatEditText appCompatEditText2 = appCompatEditText;
                            kotlin.jvm.internal.g.e(appCompatEditText2, p11);
                            kotlin.jvm.internal.g.e(textView2, ea.a.p("E29r", "cQ7Wqd7x"));
                            kotlin.jvm.internal.g.e(textView, ea.a.p("aGMvbiVlbA==", "ltLNFb78"));
                            if (i10 != 6) {
                                return false;
                            }
                            String obj = kotlin.text.k.n0(textView3.getText().toString()).toString();
                            if (!TextUtils.isEmpty(obj)) {
                                if (renameDialog.f27480w.invoke(obj).booleanValue()) {
                                    LinearLayout linearLayout2 = renameDialog.f27473p;
                                    if (linearLayout2 != null) {
                                        linearLayout2.setVisibility(0);
                                        TextView textView4 = renameDialog.f27474q;
                                        if (textView4 != null) {
                                            textView4.setText(appCompatEditText2.getContext().getString(R.string.arg_res_0x7f13036b));
                                            renameDialog.A();
                                        } else {
                                            kotlin.jvm.internal.g.i(ea.a.p("PXJYblFUdg==", "B4J76Ek2"));
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.g.i(ea.a.p("MXI7bh5MbA==", "PNFTyQ9U"));
                                        throw null;
                                    }
                                } else {
                                    RenameDialog.a aVar = renameDialog.f27479v;
                                    if (aVar != null) {
                                        aVar.c(obj, !kotlin.jvm.internal.g.a(obj, renameDialog.f27481x));
                                    }
                                    renameDialog.dismiss();
                                }
                            } else {
                                LinearLayout linearLayout3 = renameDialog.f27473p;
                                if (linearLayout3 != null) {
                                    linearLayout3.setVisibility(8);
                                    renameDialog.A();
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("OHJebh5MbA==", "XKkpX2k2"));
                                    throw null;
                                }
                            }
                            return true;
                        }
                    });
                }
                View findViewById8 = s().findViewById(R.id.dia_clear_content);
                kotlin.jvm.internal.g.d(findViewById8, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiKBEuEWRdZCFhNWNfZSpyLGMNbgZlWnQp", "xsHjw0H5"));
                ImageView imageView2 = (ImageView) findViewById8;
                this.f27472o = imageView2;
                imageView2.setVisibility(0);
                ImageView imageView3 = this.f27472o;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(new u4.g(this, 21));
                    textView.setOnClickListener(new c());
                    textView2.setOnClickListener(new d(textView2, textView));
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("J2wfYQtJCGc=", "qpDzyeWl"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("OHJebh5MbA==", "eQtc6yNB"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("O2lFbBxJVG9u", "ehg32vXB"));
        throw null;
    }

    @Override // oo.f
    public final EditText u() {
        return this.f27471n;
    }

    @Override // oo.f
    public final boolean v() {
        return true;
    }

    @Override // oo.f
    public final boolean w() {
        return true;
    }
}
