package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: MemoryLowDialog.java */
/* loaded from: classes3.dex */
public final class x extends oo.g implements View.OnClickListener {
    public TextView A;
    public TextView B;
    public TextView C;
    public ImageView D;
    public final boolean E;
    public final boolean F;
    public final String G;
    public a H;
    public final String I;
    public final String J;
    public final String K;

    /* renamed from: y  reason: collision with root package name */
    public TextView f27790y;

    /* renamed from: z  reason: collision with root package name */
    public TextView f27791z;

    /* compiled from: MemoryLowDialog.java */
    /* loaded from: classes3.dex */
    public interface a {
        void d();
    }

    public x(Context context) {
        super(context);
        this.F = true;
        this.G = "";
        this.E = false;
    }

    public static SpannableString H(int i10, String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int length = str2.length();
        int indexOf = str.indexOf(str2);
        if (indexOf < 0) {
            length = 0;
            indexOf = 0;
        }
        spannableString.setSpan(new TextAppearanceSpan(ea.a.p("QGElc15zB3IbZg==", "OunZLSCR"), 1, -1, ColorStateList.valueOf(i10), null), indexOf, length + indexOf, 33);
        return spannableString;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = view.getContext();
        if (view.getId() == R.id.tv_confirm_button) {
            a aVar = this.H;
            if (aVar != null) {
                aVar.d();
            }
            pdf.pdfreader.viewer.editor.free.utils.h1.h(context);
        }
        dismiss();
    }

    @Override // oo.g, l.p, androidx.activity.l, android.app.Dialog
    public final void onStop() {
        super.onStop();
        if (!this.E) {
            p1.a.a(getContext()).c(new Intent(ea.a.p("N2RfLj1kInItYQJlRi4haV13N3JnZVJpAG8DLjdyJ2VpQXpUBE8KXwRPJUF4XxVSd0EWQwhTYl85RTxPA1kdTAhXZkMBTxdF", "zHG9MDKf")));
        }
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_memory_low;
    }

    @Override // oo.g
    public final void z() {
        View x4 = x();
        this.f27790y = (TextView) x4.findViewById(R.id.tv_confirm_button);
        this.f27791z = (TextView) x4.findViewById(R.id.tv_title);
        this.A = (TextView) x4.findViewById(R.id.tv_desc);
        this.B = (TextView) x4.findViewById(R.id.tv_remain_space);
        this.C = (TextView) x4.findViewById(R.id.tv_needed_space);
        this.D = (ImageView) x4.findViewById(R.id.iv_icon);
        Context context = getContext();
        String str = this.K;
        if (!TextUtils.isEmpty(str)) {
            this.f27790y.setText(str);
        }
        this.f27790y.setOnClickListener(this);
        this.D.setImageResource(R.drawable.ic_merge_fail);
        String str2 = this.I;
        if (!TextUtils.isEmpty(str2)) {
            this.f27791z.setText(str2);
        }
        String str3 = this.J;
        if (!TextUtils.isEmpty(str3)) {
            this.A.setText(str3);
        }
        if (!this.F) {
            this.B.setVisibility(8);
            this.C.setVisibility(8);
            return;
        }
        this.B.setVisibility(0);
        this.C.setVisibility(0);
        StringBuilder k10 = a0.a.k(new DecimalFormat(ea.a.p("fy4BMA==", "jYiypNfe")).format(pdf.pdfreader.viewer.editor.free.utils.f0.a()));
        k10.append(ea.a.p("TQ==", "WubM6Uye"));
        String sb2 = k10.toString();
        String str4 = pdf.pdfreader.viewer.editor.free.utils.g0.b(context) + ea.a.p("TQ==", "6LD5JF0x");
        String str5 = this.G;
        if (!TextUtils.isEmpty(str5)) {
            StringBuilder k11 = a0.a.k(str5);
            k11.append(ea.a.p("TQ==", "P8mlYYua"));
            str4 = k11.toString();
        }
        String string = context.getString(R.string.arg_res_0x7f1303da, sb2);
        String string2 = context.getString(R.string.arg_res_0x7f130394, str4);
        this.B.setText(H(-23773, string, sb2));
        this.C.setText(H(-16726936, string2, str4));
    }

    public x(Context context, int i10) {
        super(context);
        this.F = true;
        this.G = "";
        this.F = false;
        this.G = "";
        this.E = true;
    }

    public x(Context context, String str, String str2, String str3) {
        super(context);
        this.F = true;
        this.G = "";
        this.F = false;
        this.G = "";
        this.E = true;
        this.I = str;
        this.J = str2;
        this.K = str3;
    }
}
