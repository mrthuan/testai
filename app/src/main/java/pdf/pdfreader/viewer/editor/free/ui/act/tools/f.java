package pdf.pdfreader.viewer.editor.free.ui.act.tools;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27061a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f27062b;
    public final /* synthetic */ BaseOperatePDFActivity c;

    public /* synthetic */ f(EditText editText, BaseOperatePDFActivity baseOperatePDFActivity, int i10) {
        this.f27061a = i10;
        this.f27062b = editText;
        this.c = baseOperatePDFActivity;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        boolean z10;
        String obj;
        String obj2;
        int i11 = this.f27061a;
        String str = "";
        EditText editText = this.f27062b;
        BaseOperatePDFActivity baseOperatePDFActivity = this.c;
        switch (i11) {
            case 0:
                PDFChooseActivity pDFChooseActivity = (PDFChooseActivity) baseOperatePDFActivity;
                PDFChooseActivity.a aVar = PDFChooseActivity.f27008u0;
                kotlin.jvm.internal.g.e(editText, ea.a.p("a3RZaQpfVnAqbHk=", "rGpxDfg1"));
                kotlin.jvm.internal.g.e(pDFChooseActivity, ea.a.p("R2gic1cw", "Dzutgr5Y"));
                if (i10 == 0 || i10 == 3) {
                    CharSequence text = textView.getText();
                    if (text != null && (obj2 = text.toString()) != null) {
                        str = obj2;
                    }
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editText);
                    if (!TextUtils.isEmpty(str)) {
                        pDFChooseActivity.C2(str);
                        return true;
                    }
                }
                return false;
            default:
                SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = (SearchPDFWhenChooseActivity) baseOperatePDFActivity;
                int i12 = SearchPDFWhenChooseActivity.f27034m0;
                kotlin.jvm.internal.g.e(editText, ea.a.p("a3RZaQpfVnAqbHk=", "jyt1GK3D"));
                kotlin.jvm.internal.g.e(searchPDFWhenChooseActivity, ea.a.p("O2hYc10w", "pZ2Xvtps"));
                if (i10 == 0 || i10 == 3) {
                    CharSequence text2 = textView.getText();
                    if (text2 != null && (obj = text2.toString()) != null) {
                        str = obj;
                    }
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editText);
                    if (!TextUtils.isEmpty(str)) {
                        if (str.length() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            u uVar = searchPDFWhenChooseActivity.f27043i0;
                            if (uVar != null) {
                                uVar.f27310e.add(0, str);
                                uVar.notifyDataSetChanged();
                            }
                            RecyclerView recyclerView = searchPDFWhenChooseActivity.f27040f0;
                            if (recyclerView != null) {
                                recyclerView.setVisibility(4);
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("J2lCdBZyTlI_YzNjGWUaVlxldw==", "3RuCLwRy"));
                                throw null;
                            }
                        }
                        searchPDFWhenChooseActivity.B2(str);
                        return true;
                    }
                }
                return false;
        }
    }
}
