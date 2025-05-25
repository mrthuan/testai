package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: InputPwdDialog.java */
/* loaded from: classes3.dex */
public final class v extends oo.d {
    public int A;

    /* renamed from: s  reason: collision with root package name */
    public EditText f27767s;

    /* renamed from: t  reason: collision with root package name */
    public ObjectAnimator f27768t;

    /* renamed from: u  reason: collision with root package name */
    public LinearLayout f27769u;

    /* renamed from: v  reason: collision with root package name */
    public View f27770v;

    /* renamed from: w  reason: collision with root package name */
    public TextView f27771w;

    /* renamed from: x  reason: collision with root package name */
    public String f27772x;

    /* renamed from: y  reason: collision with root package name */
    public String f27773y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f27774z;

    /* compiled from: InputPwdDialog.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f27775a;

        public a(ImageView imageView) {
            this.f27775a = imageView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            v vVar = v.this;
            boolean z10 = !vVar.f27774z;
            vVar.f27774z = z10;
            ImageView imageView = this.f27775a;
            if (z10) {
                imageView.setImageResource(R.drawable.ic_input_eye);
                vVar.f27767s.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                vVar.f27767s.setTransformationMethod(PasswordTransformationMethod.getInstance());
                imageView.setImageResource(R.drawable.ic_input_eye_off);
            }
            Editable text = vVar.f27767s.getText();
            if (text != null) {
                String obj = text.toString();
                if (!TextUtils.isEmpty(obj) && obj.length() > 0) {
                    vVar.f27767s.setSelection(obj.length());
                }
            }
        }
    }

    /* compiled from: InputPwdDialog.java */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            v vVar = v.this;
            vVar.A = 1;
            vVar.dismiss();
        }
    }

    /* compiled from: InputPwdDialog.java */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            EditText editText;
            v vVar = v.this;
            if (vVar.f23532h != null && !TextUtils.isEmpty(vVar.A())) {
                vVar.f23532h.a();
                return;
            }
            vVar.A = 0;
            if (vVar.f27768t == null && (editText = vVar.f27767s) != null) {
                vVar.f27768t = pdf.pdfreader.viewer.editor.free.utils.s1.a(editText);
            }
            ObjectAnimator objectAnimator = vVar.f27768t;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
        }
    }

    /* compiled from: InputPwdDialog.java */
    /* loaded from: classes3.dex */
    public class d extends androidx.activity.n {
        public d() {
            super(true);
        }

        @Override // androidx.activity.n
        public final void a() {
            v vVar = v.this;
            vVar.A = 1;
            vVar.dismiss();
        }
    }

    public v(Context context) {
        super(context);
        this.A = 0;
    }

    public final String A() {
        EditText editText = this.f27767s;
        if (editText == null || editText.getText() == null) {
            return "";
        }
        return this.f27767s.getText().toString();
    }

    @Override // oo.f, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        oo.a aVar;
        ObjectAnimator objectAnimator = this.f27768t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        super.dismiss();
        if (this.A == 1 && (aVar = this.f23532h) != null) {
            aVar.cancel();
        }
    }

    public final void g() {
        View view;
        EditText editText;
        EditText editText2;
        if (this.f23535k == 2 && (editText2 = this.f27767s) != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editText2);
        }
        if (isShowing() && this.f27769u != null && (view = this.f27770v) != null) {
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.dp_12);
            View view2 = this.f27770v;
            view2.setPadding(view2.getPaddingStart(), dimensionPixelSize, this.f27770v.getPaddingEnd(), this.f27770v.getPaddingBottom());
            this.f27769u.setVisibility(0);
            if (this.f27768t == null && (editText = this.f27767s) != null) {
                this.f27768t = pdf.pdfreader.viewer.editor.free.utils.s1.a(editText);
            }
            ObjectAnimator objectAnimator = this.f27768t;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
        }
    }

    @Override // oo.f
    public final void t() {
        View findViewById = s().findViewById(R.id.titleTv);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("PW9edC9pUnd0ZiNuEVYBZUJCF0khKDcuW2RYdCN0AWUbdik=", "tcRE2vJm"));
        this.f23522n = (TextView) findViewById;
        View findViewById2 = s().findViewById(R.id.cancelTv);
        ((TextView) findViewById2).setOnClickListener(new f5.e(this, 22));
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiPBdlqYDDKTogbyATIGsgUyBCIFJ9PiBJIHYgZCASfQ==", "Ke0Onba8"));
        this.f23524p = (TextView) findViewById2;
        View findViewById3 = s().findViewById(R.id.okTv);
        ((TextView) findViewById3).setOnClickListener(new k9.c(this, 28));
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("QW8kdCVpB3dcZl1uDVY_ZTNCS0kiPBdlg4D3KV0gbCATIGsgUyBCIFJ9PiBJIHYgZCASfQ==", "aQWLDT99"));
        this.f23523o = (TextView) findViewById3;
        View findViewById4 = s().findViewById(R.id.alertIconImg);
        ((ImageView) findViewById4).setVisibility(0);
        kotlin.jvm.internal.g.d(findViewById4, ea.a.p("Am8edAZpHHdmZg9uUFY-ZU9CK0ktPH9tloDXRVsgYiBQIFEgcCBZIGh9bCAUIHcgGCByfQ==", "IgpqPyWs"));
        this.f23525q = (ImageView) findViewById4;
        s().findViewById(R.id.bottomCenterSpace).setVisibility(0);
        TextView textView = this.f23524p;
        if (textView != null) {
            textView.setVisibility(0);
            ((ViewGroup) s().findViewById(R.id.contentLayout)).addView(View.inflate(getContext(), R.layout.dialog_input_pwd, null));
            String str = this.f27772x;
            if (str == null || TextUtils.isEmpty(str)) {
                this.f27772x = getContext().getResources().getString(R.string.arg_res_0x7f130389);
            }
            String str2 = this.f27773y;
            if (str2 == null || TextUtils.isEmpty(str2)) {
                this.f27773y = getContext().getResources().getString(R.string.arg_res_0x7f13038a);
            }
            ImageView imageView = this.f23525q;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_merge_lock);
                this.f27769u = (LinearLayout) s().findViewById(R.id.wrong_ll);
                this.f27770v = s().findViewById(R.id.bottomLayout);
                this.f27771w = (TextView) s().findViewById(R.id.dec_tv);
                TextView textView2 = this.f23522n;
                if (textView2 != null) {
                    textView2.setText(this.f27772x);
                    this.f27771w.setText(this.f27773y);
                    ImageView imageView2 = (ImageView) s().findViewById(R.id.iv_eye);
                    EditText editText = (EditText) s().findViewById(R.id.et_name);
                    this.f27767s = editText;
                    this.f27774z = false;
                    editText.setHint(" " + getContext().getResources().getString(R.string.arg_res_0x7f1303c3));
                    this.f27767s.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    imageView2.setImageResource(R.drawable.ic_input_eye_off);
                    imageView2.setOnClickListener(new a(imageView2));
                    this.f27767s.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.u
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                            EditText editText2;
                            v vVar = v.this;
                            if (i10 == 6) {
                                if (vVar.f23532h != null && !TextUtils.isEmpty(vVar.A())) {
                                    vVar.f23532h.a();
                                } else {
                                    vVar.A = 0;
                                    if (vVar.f27768t == null && (editText2 = vVar.f27767s) != null) {
                                        vVar.f27768t = pdf.pdfreader.viewer.editor.free.utils.s1.a(editText2);
                                    }
                                    ObjectAnimator objectAnimator = vVar.f27768t;
                                    if (objectAnimator != null) {
                                        objectAnimator.start();
                                    }
                                }
                                return true;
                            }
                            vVar.getClass();
                            return false;
                        }
                    });
                    TextView textView3 = this.f23524p;
                    if (textView3 != null) {
                        textView3.setOnClickListener(new b());
                        TextView textView4 = this.f23523o;
                        if (textView4 != null) {
                            textView4.setOnClickListener(new c());
                            d dVar = new d();
                            OnBackPressedDispatcher onBackPressedDispatcher = this.c;
                            onBackPressedDispatcher.getClass();
                            onBackPressedDispatcher.b(dVar);
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("IGtldg==", "YBsB13he"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("LGFfYxxsY3Y=", "edGmnGN8"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("O2lFbBxUdg==", "DTFzlZCr"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UmwucgdJAW8cSVln", "5FGmi8n1"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("LGFfYxxsY3Y=", "edGmnGN8"));
        throw null;
    }

    @Override // oo.f
    public final EditText u() {
        return this.f27767s;
    }

    @Override // oo.f
    public final boolean w() {
        return true;
    }

    @Override // oo.f
    public final void z() {
        this.A = 0;
    }
}
