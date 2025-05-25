package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import kotlin.text.Regex;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.b;
import pdf.pdfreader.viewer.editor.free.ui.dialog.a3;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment;
import pdf.pdfreader.viewer.editor.free.ui.widget.DrawSignView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignaturePad;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27919a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f27920b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f27919a = i10;
        this.f27920b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f27919a;
        Object obj = this.f27920b;
        switch (i10) {
            case 0:
                DebugAppConfigFragment debugAppConfigFragment = (DebugAppConfigFragment) obj;
                int i11 = DebugAppConfigFragment.f27856d0;
                kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("PGgTc1Uw", "FfHzqfGJ"));
                VB vb2 = debugAppConfigFragment.Y;
                kotlin.jvm.internal.g.b(vb2);
                Editable text = ((am.o0) vb2).f1221i0.getText();
                if (!TextUtils.isEmpty(text)) {
                    Regex regex = pdf.pdfreader.viewer.editor.free.feature.ocr.helper.b.f25070a;
                    ArrayList a10 = b.a.a(text.toString());
                    if (debugAppConfigFragment.i() instanceof ReaderDebugActivity) {
                        androidx.fragment.app.u i12 = debugAppConfigFragment.i();
                        kotlin.jvm.internal.g.c(i12, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuBm5sbkdsGSA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUbLiRkW3QacmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUgxhJWVARBBiOmdwYw1pQWkueQ==", "UsjUiA2u"));
                        ((ReaderDebugActivity) i12).w1(a10);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                SettingFragment settingFragment = (SettingFragment) obj;
                SettingFragment.a aVar = SettingFragment.f27957u0;
                kotlin.jvm.internal.g.e(settingFragment, ea.a.p("R2gic1cw", "5z4wW3JO"));
                a3 a3Var = new a3(settingFragment.g0());
                a3Var.f27493z = new h5.e(settingFragment, 17);
                a3Var.show();
                return;
            default:
                DrawSignView drawSignView = (DrawSignView) obj;
                int i13 = DrawSignView.f28182f;
                tn.a.b(drawSignView.getContext(), ea.a.p("HGlWbg==", "hko1Yj9G"), ea.a.p("AmlWbhtkRGE_XxRlV28hZUpfMWwgY2s=", "hTq1D6FG"));
                SignaturePad signaturePad = drawSignView.f28183a.f1047p;
                ArrayList arrayList = signaturePad.f28480k;
                if (!arrayList.isEmpty()) {
                    SignaturePad.c cVar = (SignaturePad.c) arrayList.get(arrayList.size() - 1);
                    signaturePad.f28479j.add(cVar);
                    if (cVar instanceof SignaturePad.d) {
                        SignaturePad.d dVar = (SignaturePad.d) cVar;
                        signaturePad.c(dVar.f28487b, dVar.f28486a);
                    } else if (cVar instanceof SignaturePad.e) {
                        SignaturePad.e eVar = (SignaturePad.e) cVar;
                        signaturePad.c(eVar.f28489b, eVar.c);
                    }
                    arrayList.remove(arrayList.size() - 1);
                    signaturePad.invalidate();
                    SignaturePad.f fVar = signaturePad.f28478i;
                    if (fVar != null) {
                        ((DrawSignView) fVar).g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
