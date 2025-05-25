package pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh;

import am.d3;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cg.l;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.File;
import kotlin.text.j;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIErrorRetryView;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: AIChatFileUploadViewHolder.kt */
/* loaded from: classes3.dex */
public final class c extends g<km.a, d3> {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f24718g = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f24719d;

    /* renamed from: e  reason: collision with root package name */
    public l<? super km.a, tf.d> f24720e;

    /* renamed from: f  reason: collision with root package name */
    public l<? super km.a, tf.d> f24721f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d3 d3Var) {
        super(d3Var);
        ea.a.p("NmkCZChuZw==", "j2TlAZq2");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g
    public final void l(int i10, km.a aVar) {
        String string;
        String string2;
        final km.a aVar2 = aVar;
        int i11 = aVar2.f19881k;
        Context context = this.c;
        V v10 = this.f24704b;
        if (i11 != 500) {
            if (i11 != 501) {
                d3 d3Var = (d3) v10;
                d3Var.f823j.setVisibility(8);
                d3Var.f818e.setVisibility(8);
                d3Var.f822i.setVisibility(8);
                TextView textView = d3Var.f820g;
                textView.setVisibility(0);
                TextView textView2 = d3Var.f821h;
                textView2.setVisibility(0);
                AIErrorRetryView aIErrorRetryView = d3Var.f816b;
                switch (i11) {
                    case PglCryptUtils.INPUT_INVALID /* 502 */:
                        aIErrorRetryView.setVisibility(0);
                        string = context.getString(R.string.arg_res_0x7f13056e);
                        break;
                    case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                        aIErrorRetryView.setVisibility(8);
                        string = context.getString(R.string.arg_res_0x7f1301ac);
                        break;
                    case PglCryptUtils.BASE64_FAILED /* 504 */:
                        aIErrorRetryView.setVisibility(8);
                        string = context.getString(R.string.arg_res_0x7f13056e);
                        break;
                    default:
                        aIErrorRetryView.setVisibility(8);
                        string = context.getString(R.string.arg_res_0x7f13056e);
                        break;
                }
                textView2.setText(string);
                if (this.f24719d) {
                    string2 = context.getString(R.string.arg_res_0x7f13042c);
                } else {
                    string2 = context.getString(R.string.arg_res_0x7f130428);
                }
                kotlin.jvm.internal.g.d(string2, ea.a.p("WmZjaQBGEG8fQX1QCGczKWR7OCBmIGMgsID2UhZzGHJabiwuAWUWcgspPiBJIHYgZCASfQ==", "RP8l5sOi"));
                SpannableString spannableString = new SpannableString(string2);
                spannableString.setSpan(new UnderlineSpan(), 0, string2.length(), 33);
                textView.setText(spannableString);
                textView.setTextColor(androidx.core.content.a.getColor(context, R.color.color_100_343BF2_5F70FF));
                textView2.setVisibility(0);
            } else {
                d3 d3Var2 = (d3) v10;
                d3Var2.f823j.setVisibility(8);
                d3Var2.f818e.setVisibility(8);
                d3Var2.f820g.setVisibility(8);
                d3Var2.f821h.setVisibility(8);
                TextView textView3 = d3Var2.f822i;
                textView3.setVisibility(0);
                textView3.setText(v.t(context, aVar2.f19880j));
                d3Var2.f816b.setVisibility(8);
            }
        } else {
            d3 d3Var3 = (d3) v10;
            d3Var3.f823j.setVisibility(0);
            d3Var3.f818e.setVisibility(0);
            TextView textView4 = d3Var3.f820g;
            textView4.setVisibility(0);
            String string3 = context.getString(R.string.arg_res_0x7f130022);
            kotlin.jvm.internal.g.d(string3, ea.a.p("UG8ldBZ4Fi4VZUBTHXI_biMoYC41dDFpXGdDYSF0Am9dXyhhHWMHbCk=", "2mBkiC5w"));
            SpannableString spannableString2 = new SpannableString(string3);
            spannableString2.setSpan(new UnderlineSpan(), 0, string3.length(), 33);
            textView4.setText(spannableString2);
            textView4.setTextColor(androidx.core.content.a.getColor(context, R.color.color_100_DD202A));
            d3Var3.f822i.setVisibility(8);
            d3Var3.f821h.setVisibility(8);
            d3Var3.f816b.setVisibility(8);
        }
        d3 d3Var4 = (d3) v10;
        d3Var4.f819f.setText(aVar2.f19878h);
        int i12 = aVar2.f19879i;
        AppCompatImageView appCompatImageView = d3Var4.f817d;
        if (i12 == 701) {
            appCompatImageView.setImageResource(R.drawable.ic_home_pdf2);
        } else {
            String str = aVar2.f19877g;
            if (str != null) {
                ea.a.p("WnQubV1mC2wXUFV0aA==", "gLBSV6y8");
                if (j.F(str, ea.a.p("UHN2", "dafHC6qs"), false)) {
                    appCompatImageView.setImageResource(R.drawable.ic_home_csv2);
                }
            }
            appCompatImageView.setImageResource(R.drawable.ic_home_doc2);
        }
        d3Var4.f816b.setErrorClickListener(new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatFileUploadViewHolder$onBindView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                l<? super km.a, tf.d> lVar = c.this.f24720e;
                if (lVar != null) {
                    lVar.invoke(aVar2);
                }
            }
        });
        String p10 = ea.a.p("VWklZA5uIS4paSBpWGUUb1Z0M2knZXI=", "1j7KgF13");
        ConstraintLayout constraintLayout = d3Var4.c;
        kotlin.jvm.internal.g.d(constraintLayout, p10);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatFileUploadViewHolder$onBindView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intent intent;
                kotlin.jvm.internal.g.e(it, "it");
                c cVar = c.this;
                int i13 = c.f24718g;
                Context context2 = cVar.c;
                km.a aVar3 = aVar2;
                String str2 = aVar3.f19877g;
                int i14 = aVar3.f19879i;
                String p11 = ea.a.p("CVJ-TSZBSQ==", "ATrpG8Y1");
                ReaderPdfApplication.k().g(null);
                File file = new File(str2);
                long length = file.length();
                if (!file.exists() || file.length() < 0) {
                    j1.e(context2, context2.getResources().getString(R.string.arg_res_0x7f130393), true, null, -1);
                } else if (length == 0) {
                    j1.e(context2, context2.getResources().getString(R.string.arg_res_0x7f130148), true, null, -1);
                } else {
                    if (i14 == 701) {
                        intent = new Intent(context2, ReaderAIPreviewActivity.class);
                    } else {
                        intent = new Intent(context2, OfficeAIReaderActivity.class);
                    }
                    intent.setAction(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhVJFlc=", "SfOP1vpJ"));
                    intent.setData(Uri.fromFile(file));
                    intent.putExtra(ea.a.p("JnN3chZtZ2EuaA==", "UXCwAulp"), true);
                    intent.putExtra(ea.a.p("KWldZSlhQ2g=", "PkdEZYut"), str2);
                    intent.putExtra(ea.a.p("P2FCcw5vRWQ=", "T1rmbrg8"), "");
                    intent.putExtra(ea.a.p("KXJebQ==", "PbtwgWh8"), p11);
                    intent.addFlags(268435456);
                    try {
                        context2.startActivity(intent);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        t1.c(ea.a.p("OWlUdzhJZ2Rm", "nwsK3wo8"), e10);
                        dp.a.a().getClass();
                        dp.a.d(context2, e10);
                    }
                }
            }
        });
        String p11 = ea.a.p("M2kiZCtuKi46bwl0", "3oQLBMHg");
        LinearLayout linearLayout = d3Var4.f815a;
        kotlin.jvm.internal.g.d(linearLayout, p11);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatFileUploadViewHolder$onBindView$3
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }
        });
        String p12 = ea.a.p("N2k0ZBhuLC4paSBpWGUDdm1wPm8oZHVhGmMUbB5yEGUhcnk=", "OKUZqK4u");
        TextView textView5 = d3Var4.f820g;
        kotlin.jvm.internal.g.d(textView5, p12);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView5, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.AIChatFileUploadViewHolder$onBindView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                l<? super km.a, tf.d> lVar = c.this.f24721f;
                if (lVar != null) {
                    lVar.invoke(aVar2);
                }
            }
        });
    }
}
