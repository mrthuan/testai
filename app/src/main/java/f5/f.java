package f5;

import android.content.DialogInterface;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17102a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17103b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f17102a = i10;
        this.f17103b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f17102a;
        Object obj = this.f17103b;
        switch (i10) {
            case 0:
                i this$0 = (i) obj;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                c cVar = this$0.f17110u;
                if (cVar != null) {
                    ((ReaderHomeActivity.k0) cVar).X();
                }
                c5.a b10 = c5.a.b();
                b10.a();
                d5.b b11 = b10.c.f5583e.b();
                if (b11 != null) {
                    b11.onCancel();
                    return;
                }
                return;
            default:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) obj;
                String str = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("JWgBc3Qw", "m7QhPoOT"));
                officeReaderActivity.w2().postDelayed(new pdf.pdfreader.viewer.editor.free.office.j(officeReaderActivity, 2), 150L);
                return;
        }
    }
}
