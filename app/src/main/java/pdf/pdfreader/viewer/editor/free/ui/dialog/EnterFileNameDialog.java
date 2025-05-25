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
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: EnterFileNameDialog.kt */
/* loaded from: classes3.dex */
public final class EnterFileNameDialog extends oo.f {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f27427x = 0;

    /* renamed from: n  reason: collision with root package name */
    public final a f27428n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f27429o;

    /* renamed from: p  reason: collision with root package name */
    public AppCompatEditText f27430p;

    /* renamed from: q  reason: collision with root package name */
    public ImageView f27431q;

    /* renamed from: r  reason: collision with root package name */
    public LinearLayout f27432r;

    /* renamed from: s  reason: collision with root package name */
    public TextView f27433s;

    /* renamed from: t  reason: collision with root package name */
    public ObjectAnimator f27434t;

    /* renamed from: u  reason: collision with root package name */
    public cg.a<String> f27435u;

    /* renamed from: v  reason: collision with root package name */
    public cg.l<? super String, Boolean> f27436v;

    /* renamed from: w  reason: collision with root package name */
    public String f27437w;

    /* compiled from: EnterFileNameDialog.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void c(String str, boolean z10);
    }

    /* compiled from: EnterFileNameDialog.kt */
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
            EnterFileNameDialog enterFileNameDialog = EnterFileNameDialog.this;
            if (isEmpty) {
                ImageView imageView = enterFileNameDialog.f27431q;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("B2wMYUtJJmc=", "9zdi9KcH"));
                    throw null;
                }
            }
            ImageView imageView2 = enterFileNameDialog.f27431q;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("LGxUYQtJWmc=", "edrd8F24"));
                throw null;
            }
        }
    }

    /* compiled from: EnterFileNameDialog.kt */
    /* loaded from: classes3.dex */
    public static final class c extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            kotlin.jvm.internal.g.e(v10, "v");
            EnterFileNameDialog.this.dismiss();
        }
    }

    /* compiled from: EnterFileNameDialog.kt */
    /* loaded from: classes3.dex */
    public static final class d extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            Editable editable;
            kotlin.jvm.internal.g.e(v10, "v");
            EnterFileNameDialog enterFileNameDialog = EnterFileNameDialog.this;
            AppCompatEditText appCompatEditText = enterFileNameDialog.f27430p;
            if (appCompatEditText != null) {
                editable = appCompatEditText.getText();
            } else {
                editable = null;
            }
            String K = kotlin.text.j.K(kotlin.text.j.K(kotlin.text.k.n0(String.valueOf(editable)).toString(), "\n", ""), "\r", "");
            if (!TextUtils.isEmpty(K)) {
                if (enterFileNameDialog.f27436v.invoke(K).booleanValue()) {
                    LinearLayout linearLayout = enterFileNameDialog.f27432r;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                        TextView textView = enterFileNameDialog.f27433s;
                        if (textView != null) {
                            textView.setText(enterFileNameDialog.getContext().getString(R.string.arg_res_0x7f13036b));
                            enterFileNameDialog.A();
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("RHIkbhRUdg==", "CgScXiae"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("OHJebh5MbA==", "8ostDAkd"));
                    throw null;
                }
                enterFileNameDialog.f27428n.c(K, !kotlin.jvm.internal.g.a(K, enterFileNameDialog.f27437w));
                enterFileNameDialog.dismiss();
                return;
            }
            LinearLayout linearLayout2 = enterFileNameDialog.f27432r;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
                enterFileNameDialog.A();
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("MnIFbipMbA==", "31EjMkHR"));
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterFileNameDialog(Context context, a aVar, boolean z10) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "5QLjkjMx"));
        kotlin.jvm.internal.g.e(aVar, ea.a.p("HmkldCRuK3I=", "THrVANYw"));
        this.f27428n = aVar;
        this.f27429o = z10;
        this.f27435u = new cg.a<String>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog$getDefaultName$1
            @Override // cg.a
            public final String invoke() {
                return "";
            }
        };
        this.f27436v = new cg.l<String, Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog$checkFunction$1
            @Override // cg.l
            public final Boolean invoke(String it) {
                kotlin.jvm.internal.g.e(it, "it");
                sn.d d10 = sn.d.d();
                String concat = it.concat(".pdf");
                String p10 = ea.a.p("XmU5ZxZk", "6mQGFqZa");
                d10.getClass();
                return Boolean.valueOf(sn.d.a(concat, p10));
            }
        };
        this.f27437w = "";
    }

    public final void A() {
        tf.d dVar;
        ObjectAnimator objectAnimator = this.f27434t;
        if (objectAnimator != null) {
            objectAnimator.start();
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            ObjectAnimator a10 = pdf.pdfreader.viewer.editor.free.utils.s1.a(this.f27430p);
            a10.getTarget();
            a10.start();
            this.f27434t = a10;
        }
    }

    @Override // oo.f, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ObjectAnimator objectAnimator = this.f27434t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f27434t = null;
        }
        super.dismiss();
    }

    @Override // oo.f
    public final int r() {
        return R.layout.dialog_enter_file_name;
    }

    @Override // oo.f
    @SuppressLint({"ClickableViewAccessibility"})
    public final void t() {
        this.f27430p = (AppCompatEditText) s().findViewById(R.id.dia_enter_file_name_et);
        View findViewById = s().findViewById(R.id.wrong_ll);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiKBEuMGR6d0tvDWdsbCcp", "YT9cSvJh"));
        this.f27432r = (LinearLayout) findViewById;
        View findViewById2 = s().findViewById(R.id.wrong_tv);
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiKBEuLmRddzxvKmdsdD0p", "GsNDBGS2"));
        this.f27433s = (TextView) findViewById2;
        LinearLayout linearLayout = this.f27432r;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            final AppCompatEditText appCompatEditText = this.f27430p;
            if (appCompatEditText != null) {
                appCompatEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                appCompatEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(80), new k()});
                this.f27437w = this.f27435u.invoke();
                String string = appCompatEditText.getContext().getResources().getString(R.string.arg_res_0x7f130388);
                appCompatEditText.setHint(" " + string);
                appCompatEditText.setText(this.f27437w);
                appCompatEditText.setSelection(Math.min(appCompatEditText.length(), 80));
                appCompatEditText.addTextChangedListener(new b());
                appCompatEditText.setOnTouchListener(new pb.a(this, 3));
                appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.j
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                        String p10 = ea.a.p("R2gic1cw", "ZJSO4P2S");
                        EnterFileNameDialog enterFileNameDialog = EnterFileNameDialog.this;
                        kotlin.jvm.internal.g.e(enterFileNameDialog, p10);
                        String p11 = ea.a.p("F3QjaQBfEHVu", "jcWSgXxS");
                        AppCompatEditText appCompatEditText2 = appCompatEditText;
                        kotlin.jvm.internal.g.e(appCompatEditText2, p11);
                        if (i10 != 6) {
                            return false;
                        }
                        String K = kotlin.text.j.K(kotlin.text.j.K(kotlin.text.k.n0(textView.getText().toString()).toString(), "\n", ""), "\r", "");
                        if (!TextUtils.isEmpty(K)) {
                            if (enterFileNameDialog.f27436v.invoke(K).booleanValue()) {
                                LinearLayout linearLayout2 = enterFileNameDialog.f27432r;
                                if (linearLayout2 != null) {
                                    linearLayout2.setVisibility(0);
                                    TextView textView2 = enterFileNameDialog.f27433s;
                                    if (textView2 != null) {
                                        textView2.setText(appCompatEditText2.getContext().getString(R.string.arg_res_0x7f13036b));
                                        enterFileNameDialog.A();
                                    } else {
                                        kotlin.jvm.internal.g.i(ea.a.p("RHIkbhRUdg==", "PJ5nqVcH"));
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("PXIKbl9MbA==", "kmJe8r19"));
                                    throw null;
                                }
                            } else {
                                enterFileNameDialog.f27428n.c(K, !kotlin.jvm.internal.g.a(K, enterFileNameDialog.f27437w));
                                enterFileNameDialog.dismiss();
                            }
                        } else {
                            LinearLayout linearLayout3 = enterFileNameDialog.f27432r;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(8);
                                enterFileNameDialog.A();
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("OnI3bi9MbA==", "PkMXHKFl"));
                                throw null;
                            }
                        }
                        return true;
                    }
                });
            }
            View findViewById3 = s().findViewById(R.id.dia_enter_file_name_cancel);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiPBdlqICeYT5lWHRWchRmGmwHXxxhWWU2YzduJ2VeKQ==", "J8a6VqTw"));
            TextView textView = (TextView) findViewById3;
            View findViewById4 = s().findViewById(R.id.dia_enter_file_name_ok);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("PW9edC9pUnd0ZiNuEVYBZUJCF0khPDFljYDUZEFkCmEQZV90HHJoZjNsL18bYQVlam8FKQ==", "yROloroc"));
            TextView textView2 = (TextView) findViewById4;
            if (this.f27429o) {
                textView2.setText(R.string.arg_res_0x7f1300c8);
            }
            View findViewById5 = s().findViewById(R.id.dia_clear_content);
            kotlin.jvm.internal.g.d(findViewById5, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiKBEuKmR6ZF5hHWNfZSpyLGMNbgZlWnQp", "CT7BRz54"));
            ImageView imageView = (ImageView) findViewById5;
            this.f27431q = imageView;
            imageView.setVisibility(0);
            ImageView imageView2 = this.f27431q;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new k9.c(this, 24));
                ((ImageView) s().findViewById(R.id.iv_icon)).setImageResource(R.drawable.ic_home_rename);
                textView.setOnClickListener(new c());
                textView2.setOnClickListener(new d());
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UGwuYQFJD2c=", "drcf7E51"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("RHIkbhRMbA==", "1i4RRiaA"));
        throw null;
    }

    @Override // oo.f
    public final EditText u() {
        return this.f27430p;
    }

    @Override // oo.f
    public final void z() {
        AppCompatEditText appCompatEditText = this.f27430p;
        if (appCompatEditText != null) {
            String invoke = this.f27435u.invoke();
            this.f27437w = invoke;
            appCompatEditText.setText(invoke);
            appCompatEditText.setSelection(this.f27437w.length());
        }
    }
}
