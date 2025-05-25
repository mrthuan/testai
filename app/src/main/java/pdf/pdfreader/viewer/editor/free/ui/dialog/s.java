package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: GoToPageDialog.kt */
/* loaded from: classes3.dex */
public final class s extends oo.f {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f27735u = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f27736n;

    /* renamed from: o  reason: collision with root package name */
    public AppCompatEditText f27737o;

    /* renamed from: p  reason: collision with root package name */
    public ImageView f27738p;

    /* renamed from: q  reason: collision with root package name */
    public LinearLayout f27739q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f27740r;

    /* renamed from: s  reason: collision with root package name */
    public ObjectAnimator f27741s;

    /* renamed from: t  reason: collision with root package name */
    public a f27742t;

    /* compiled from: GoToPageDialog.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(int i10);

        void b();
    }

    /* compiled from: GoToPageDialog.kt */
    /* loaded from: classes3.dex */
    public static final class b implements InputFilter {
        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
            if ((i12 == 0 && i13 == 0 && charSequence != null && kotlin.jvm.internal.g.a(charSequence, ea.a.p("MA==", "9qIFPhCi"))) || charSequence == null) {
                return "";
            }
            return charSequence;
        }
    }

    /* compiled from: GoToPageDialog.kt */
    /* loaded from: classes3.dex */
    public static final class c extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            kotlin.jvm.internal.g.e(v10, "v");
            s.this.dismiss();
        }
    }

    /* compiled from: GoToPageDialog.kt */
    /* loaded from: classes3.dex */
    public static final class d extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
            if (r1 != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
            if (r0 <= r4.f27736n) goto L9;
         */
        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(android.view.View r4) {
            /*
                r3 = this;
                java.lang.String r0 = "v"
                kotlin.jvm.internal.g.e(r4, r0)
                pdf.pdfreader.viewer.editor.free.ui.dialog.s r4 = pdf.pdfreader.viewer.editor.free.ui.dialog.s.this
                androidx.appcompat.widget.AppCompatEditText r0 = r4.f27737o
                if (r0 == 0) goto L29
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L24
                r1 = 1
                if (r1 > r0) goto L20
                int r2 = r4.f27736n     // Catch: java.lang.Exception -> L24
                if (r0 > r2) goto L20
                goto L21
            L20:
                r1 = 0
            L21:
                if (r1 == 0) goto L24
                goto L25
            L24:
                r0 = -1
            L25:
                r4.A(r0)
                return
            L29:
                java.lang.String r4 = "U2RQdGdlFHQ="
                java.lang.String r0 = "Gm693lO2"
                java.lang.String r4 = ea.a.p(r4, r0)
                kotlin.jvm.internal.g.i(r4)
                r4 = 0
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.dialog.s.d.a(android.view.View):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, int i10) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "YgIIWXu0"));
        this.f27736n = i10;
    }

    public final void A(int i10) {
        tf.d dVar;
        if (i10 != -1) {
            LinearLayout linearLayout = this.f27739q;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                a aVar = this.f27742t;
                if (aVar != null) {
                    aVar.a(i10);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("RHIkbhRMbA==", "PLSdSA1b"));
            throw null;
        }
        a aVar2 = this.f27742t;
        if (aVar2 != null) {
            aVar2.b();
        }
        if (this.f23535k == 2) {
            AppCompatEditText appCompatEditText = this.f27737o;
            if (appCompatEditText != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.a(appCompatEditText);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "McVCO0K2"));
                throw null;
            }
        }
        LinearLayout linearLayout2 = this.f27739q;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
            ObjectAnimator objectAnimator = this.f27741s;
            if (objectAnimator != null) {
                objectAnimator.start();
                dVar = tf.d.f30009a;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                AppCompatEditText appCompatEditText2 = this.f27737o;
                if (appCompatEditText2 != null) {
                    ObjectAnimator a10 = pdf.pdfreader.viewer.editor.free.utils.s1.a(appCompatEditText2);
                    a10.getTarget();
                    a10.start();
                    this.f27741s = a10;
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "rrTDSHcV"));
                throw null;
            }
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("RHIkbhRMbA==", "T8x55YiY"));
        throw null;
    }

    public final void B() {
        if (this.f23531g) {
            LinearLayout linearLayout = this.f27739q;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                TextView textView = this.f27740r;
                if (textView != null) {
                    textView.setVisibility(0);
                    TextView textView2 = this.f27740r;
                    if (textView2 != null) {
                        textView2.setText(getContext().getString(R.string.arg_res_0x7f1301bd));
                        if (isShowing() && this.f23535k == 2) {
                            AppCompatEditText appCompatEditText = this.f27737o;
                            if (appCompatEditText != null) {
                                pdf.pdfreader.viewer.editor.free.utils.extension.g.a(appCompatEditText);
                                return;
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "UbAdbeba"));
                                throw null;
                            }
                        }
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("OHJebh5Udg==", "1pdnElMn"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("RHIkbhRUdg==", "AwCaAzGS"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("RHIkbhRMbA==", "YLZ4t0RJ"));
            throw null;
        }
    }

    public final void C(int i10) {
        this.f27736n = i10;
        if (this.f23531g) {
            TextView textView = this.f27740r;
            if (textView != null) {
                if (textView.getVisibility() == 0) {
                    TextView textView2 = this.f27740r;
                    if (textView2 != null) {
                        textView2.setText(getContext().getString(R.string.arg_res_0x7f130405, String.valueOf(i10)));
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("OHJebh5Udg==", "Jo2bZZRl"));
                        throw null;
                    }
                }
                AppCompatEditText appCompatEditText = this.f27737o;
                if (appCompatEditText != null) {
                    String string = getContext().getString(R.string.arg_res_0x7f1303c2);
                    appCompatEditText.setHint(string + " (1-" + i10 + ")");
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "F4K1mgp8"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("EnI-bjNUdg==", "WJeQTUbq"));
            throw null;
        }
    }

    @Override // oo.f, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ObjectAnimator objectAnimator = this.f27741s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f27741s = null;
        }
        super.dismiss();
    }

    @Override // oo.f
    public final int r() {
        return R.layout.dialog_go_to_page;
    }

    @Override // oo.f
    @SuppressLint({"ClickableViewAccessibility", "StringFormatMatches"})
    public final void t() {
        View findViewById = s().findViewById(R.id.dia_go_to_page_et);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiKBEuPmR7ZDthamdcXz9vLHADZxdfUXQp", "WUR5V7Kg"));
        this.f27737o = (AppCompatEditText) findViewById;
        View findViewById2 = s().findViewById(R.id.wrong_ll);
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("PW9edC9pUnd0ZiNuEVYBZUJCF0khKDcuD2RedwtvHGcQbF0p", "oA8lfpyr"));
        this.f27739q = (LinearLayout) findViewById2;
        View findViewById3 = s().findViewById(R.id.wrong_tv);
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiKBEuOmRLdzRvI2dsdD0p", "SeFM3fZl"));
        TextView textView = (TextView) findViewById3;
        this.f27740r = textView;
        textView.setText(getContext().getString(R.string.arg_res_0x7f130405, Integer.valueOf(this.f27736n)));
        LinearLayout linearLayout = this.f27739q;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            AppCompatEditText appCompatEditText = this.f27737o;
            if (appCompatEditText != null) {
                appCompatEditText.setText("");
                String string = appCompatEditText.getContext().getString(R.string.arg_res_0x7f1303c2);
                int i10 = this.f27736n;
                appCompatEditText.setHint(" " + string + " (1-" + i10 + ")");
                appCompatEditText.addTextChangedListener(new e());
                appCompatEditText.setOnTouchListener(new View.OnTouchListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.q
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        String p10 = ea.a.p("BmgYc00w", "hmrqi4vR");
                        s sVar = s.this;
                        kotlin.jvm.internal.g.e(sVar, p10);
                        if (motionEvent.getAction() == 1) {
                            AppCompatEditText appCompatEditText2 = sVar.f27737o;
                            if (appCompatEditText2 != null) {
                                appCompatEditText2.setSelectAllOnFocus(true);
                                AppCompatEditText appCompatEditText3 = sVar.f27737o;
                                if (appCompatEditText3 != null) {
                                    appCompatEditText3.selectAll();
                                    return false;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "Exxhpbut"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "gtsdjDXo"));
                            throw null;
                        }
                        return false;
                    }
                });
                appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.r
                    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
                        if (r1 != false) goto L13;
                     */
                    @Override // android.widget.TextView.OnEditorActionListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final boolean onEditorAction(android.widget.TextView r3, int r4, android.view.KeyEvent r5) {
                        /*
                            r2 = this;
                            java.lang.String r5 = "O2hYc10w"
                            java.lang.String r0 = "kgVUOvPN"
                            java.lang.String r5 = ea.a.p(r5, r0)
                            pdf.pdfreader.viewer.editor.free.ui.dialog.s r0 = pdf.pdfreader.viewer.editor.free.ui.dialog.s.this
                            kotlin.jvm.internal.g.e(r0, r5)
                            r5 = 6
                            r1 = 0
                            if (r4 != r5) goto L2d
                            java.lang.CharSequence r3 = r3.getText()
                            java.lang.String r3 = r3.toString()
                            r4 = 1
                            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L28
                            if (r4 > r3) goto L25
                            int r5 = r0.f27736n     // Catch: java.lang.Exception -> L28
                            if (r3 > r5) goto L25
                            r1 = r4
                        L25:
                            if (r1 == 0) goto L28
                            goto L29
                        L28:
                            r3 = -1
                        L29:
                            r0.A(r3)
                            r1 = r4
                        L2d:
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.dialog.r.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
                    }
                });
                appCompatEditText.setFilters(new b[]{new b()});
                View findViewById4 = s().findViewById(R.id.dia_go_to_page_cancel);
                kotlin.jvm.internal.g.d(findViewById4, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiPBdlsYDSaVwuF2lSXyxvLHQNXwJhU2U2YzduJ2VeKQ==", "St8s9XPA"));
                TextView textView2 = (TextView) findViewById4;
                View findViewById5 = s().findViewById(R.id.dia_go_to_page_ok);
                kotlin.jvm.internal.g.d(findViewById5, ea.a.p("S28LdDBpAXdmZg9uUFY-ZU9CK0ktPGJlloDXPnlSbGldLgBpB18Dbxd0CV9EYTBlZ285KQ==", "7q9dfdHp"));
                TextView textView3 = (TextView) findViewById5;
                View findViewById6 = s().findViewById(R.id.dia_clear_content);
                kotlin.jvm.internal.g.d(findViewById6, ea.a.p("PW9edC9pUnd0ZiNuEVYBZUJCF0khKDcuE2R4ZB9hGmMjZVByJmNYbi5lJHQp", "UwlbzVvE"));
                ImageView imageView = (ImageView) findViewById6;
                this.f27738p = imageView;
                imageView.setVisibility(4);
                ImageView imageView2 = this.f27738p;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(new qb.j0(this, 20));
                    ((ImageView) s().findViewById(R.id.iv_icon)).setImageResource(R.drawable.ic_view_page);
                    textView2.setOnClickListener(new c());
                    textView3.setOnClickListener(new d());
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("CWwcYQBJWmc=", "ykjyr7Fy"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "Ok0a6NFU"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("RHIkbhRMbA==", "4tmM4M0e"));
        throw null;
    }

    @Override // oo.f
    public final EditText u() {
        AppCompatEditText appCompatEditText = this.f27737o;
        if (appCompatEditText != null) {
            return appCompatEditText;
        }
        kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "fZSFZnta"));
        throw null;
    }

    @Override // oo.f
    public final void z() {
        AppCompatEditText appCompatEditText = this.f27737o;
        if (appCompatEditText != null) {
            appCompatEditText.setText("");
            LinearLayout linearLayout = this.f27739q;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("RHIkbhRMbA==", "4WZIsPE0"));
                throw null;
            }
        }
        kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "K7AdSkZz"));
        throw null;
    }

    /* compiled from: TextView.kt */
    /* loaded from: classes3.dex */
    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            s sVar = s.this;
            if (isEmpty) {
                ImageView imageView = sVar.f27738p;
                if (imageView != null) {
                    imageView.setVisibility(4);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("LGxUYQtJWmc=", "bWGAtCZ4"));
                    throw null;
                }
            }
            ImageView imageView2 = sVar.f27738p;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("K2xWYQhJCmc=", "kpH3zgeB"));
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
