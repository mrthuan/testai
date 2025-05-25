package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PdfSecondTipsDialog.java */
/* loaded from: classes3.dex */
public final class j1 extends oo.g {

    /* renamed from: y  reason: collision with root package name */
    public final c f27629y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.fragment.app.o0 f27630z;

    /* compiled from: PdfSecondTipsDialog.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            j1 j1Var = j1.this;
            j1Var.dismiss();
            c cVar = j1Var.f27629y;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    /* compiled from: PdfSecondTipsDialog.java */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar = j1.this.f27629y;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    /* compiled from: PdfSecondTipsDialog.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a();

        void b();
    }

    public j1(Context context, androidx.fragment.app.o0 o0Var, c cVar) {
        super(context);
        this.f27629y = cVar;
        this.f27630z = o0Var;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.layout_pdf_second_tips_dialog;
    }

    @Override // oo.g
    public final void z() {
        TextView textView = (TextView) x().findViewById(R.id.dia_second_tips_title);
        androidx.fragment.app.o0 o0Var = this.f27630z;
        if (!TextUtils.isEmpty((String) o0Var.f3891a)) {
            textView.setText((String) o0Var.f3891a);
        }
        TextView textView2 = (TextView) x().findViewById(R.id.dia_second_tips_msg);
        if (!TextUtils.isEmpty((String) o0Var.f3892b)) {
            textView2.setText((String) o0Var.f3892b);
        }
        TextView textView3 = (TextView) x().findViewById(R.id.dia_second_tips_cancle);
        HashMap hashMap = o0Var.c;
        if (!TextUtils.isEmpty((String) hashMap)) {
            textView3.setText((String) hashMap);
        }
        TextView textView4 = (TextView) x().findViewById(R.id.dia_second_tips_ok);
        if (!TextUtils.isEmpty((String) o0Var.f3893d)) {
            textView4.setText((String) o0Var.f3893d);
        }
        textView3.setOnClickListener(new a());
        textView4.setOnClickListener(new b());
    }
}
