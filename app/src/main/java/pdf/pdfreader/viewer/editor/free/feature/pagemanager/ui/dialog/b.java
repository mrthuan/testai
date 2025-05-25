package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog;

import am.e0;
import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import cg.l;
import k9.c;
import kotlin.jvm.internal.g;
import kotlin.text.i;
import oo.k;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity;
import pdf.pdfreader.viewer.editor.free.utils.l0;
import pdf.pdfreader.viewer.editor.free.utils.s1;
import tf.d;

/* compiled from: PageCountSettingDialog.kt */
/* loaded from: classes3.dex */
public final class b extends k<e0> {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f25366r = 0;

    /* renamed from: o  reason: collision with root package name */
    public l<? super String, d> f25367o;

    /* renamed from: p  reason: collision with root package name */
    public ObjectAnimator f25368p;

    /* renamed from: q  reason: collision with root package name */
    public String f25369q;

    /* compiled from: PageCountSettingDialog.kt */
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0342b extends l0 {
        public C0342b() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            g.e(v10, "v");
            b.this.A();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PDFCreatorActivity pDFCreatorActivity) {
        super(pDFCreatorActivity);
        g.e(pDFCreatorActivity, ea.a.p("LG9fdBx4dA==", "n1hWKeM6"));
        this.f25369q = ea.a.p("MQ==", "59UEDR4R");
    }

    public final void A() {
        d dVar;
        e0 e0Var = this.f23549n;
        g.b(e0Var);
        String obj = kotlin.text.k.n0(String.valueOf(e0Var.f851d.getText())).toString();
        if (!TextUtils.isEmpty(obj)) {
            l<? super String, d> lVar = this.f25367o;
            if (lVar != null) {
                lVar.invoke(obj);
            }
            dismiss();
            return;
        }
        ObjectAnimator objectAnimator = this.f25368p;
        if (objectAnimator != null) {
            objectAnimator.start();
            dVar = d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            e0 e0Var2 = this.f23549n;
            g.b(e0Var2);
            ObjectAnimator a10 = s1.a(e0Var2.f851d);
            a10.getTarget();
            a10.start();
            this.f25368p = a10;
        }
    }

    @Override // oo.f, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ObjectAnimator objectAnimator = this.f25368p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f25368p = null;
        }
        super.dismiss();
    }

    @Override // oo.f
    public final void t() {
        e0 e0Var = this.f23549n;
        g.b(e0Var);
        AppCompatEditText appCompatEditText = e0Var.f851d;
        appCompatEditText.setHint(appCompatEditText.getContext().getString(R.string.arg_res_0x7f13011c, ea.a.p("MQ==", "E2XgB7AE"), ea.a.p("AjAw", "8W1Wf81a")));
        appCompatEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        appCompatEditText.setText(this.f25369q);
        appCompatEditText.addTextChangedListener(new a(appCompatEditText));
        appCompatEditText.setOnTouchListener(new pb.a(this, 2));
        appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                String p10 = ea.a.p("O2hYc10w", "oefUGDxR");
                b bVar = b.this;
                g.e(bVar, p10);
                if (i10 == 6) {
                    bVar.A();
                    return true;
                }
                return false;
            }
        });
        e0 e0Var2 = this.f23549n;
        g.b(e0Var2);
        e0Var2.f850b.setOnClickListener(new c(this, 10));
        e0 e0Var3 = this.f23549n;
        g.b(e0Var3);
        e0Var3.f852e.setOnClickListener(new C0342b());
        e0 e0Var4 = this.f23549n;
        g.b(e0Var4);
        e0Var4.c.setOnClickListener(new u4.g(this, 11));
    }

    @Override // oo.f
    public final EditText u() {
        e0 e0Var = this.f23549n;
        g.b(e0Var);
        return e0Var.f851d;
    }

    /* compiled from: PageCountSettingDialog.kt */
    /* loaded from: classes3.dex */
    public static final class a implements TextWatcher {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AppCompatEditText f25371b;

        public a(AppCompatEditText appCompatEditText) {
            this.f25371b = appCompatEditText;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z10;
            Integer E;
            int intValue;
            int o10;
            if (editable != null) {
                String obj = editable.toString();
                if (obj.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (E = i.E(kotlin.text.l.p0(4, obj))) != null && intValue != (o10 = ge.a.o((intValue = E.intValue()), 1, 100))) {
                    String valueOf = String.valueOf(o10);
                    AppCompatEditText appCompatEditText = this.f25371b;
                    appCompatEditText.setText(valueOf);
                    appCompatEditText.setSelection(String.valueOf(o10).length());
                }
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            b bVar = b.this;
            if (isEmpty) {
                e0 e0Var = bVar.f23549n;
                g.b(e0Var);
                e0Var.f850b.setVisibility(8);
                return;
            }
            e0 e0Var2 = bVar.f23549n;
            g.b(e0Var2);
            e0Var2.f850b.setVisibility(0);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
