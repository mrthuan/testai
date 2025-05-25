package pdf.pdfreader.viewer.editor.free.feature.ai.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import androidx.activity.r;
import java.util.HashSet;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24726a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f24727b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f24726a = i10;
        this.f24727b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f24726a;
        Object obj = this.f24727b;
        switch (i10) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj;
                g.e(ref$BooleanRef, ea.a.p("F2k4Qz9pAWs0ZVFkK2E1aw==", "7uBVDaIM"));
                if (!ref$BooleanRef.element) {
                    AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                    String p10 = ea.a.p("UmkobBJpD18Vb0BfCmw_Y2s=", "6fjQrc1S");
                    aIEventCenter.getClass();
                    AIEventCenter.i(p10, null);
                    return;
                }
                return;
            case 1:
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj;
                OCRResultActivity.a aVar = OCRResultActivity.f25101x;
                g.e(ref$BooleanRef2, ea.a.p("TWkiQ1tpG2sHaw==", "1xiQ7xyC"));
                if (!ref$BooleanRef2.element) {
                    HashSet<String> hashSet = OCREventCenter.c;
                    if (!hashSet.contains(ea.a.p("IGNDXx1pRGM7ci5fFmEGY1BsMWMpaQZr", "rEl6Gyej"))) {
                        Context c = r.c("XGM5XxdpEWMTclBfCmE4YyFsbWMqaSBr", "W49JidaG", hashSet);
                        OCREventCenter.b(c, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "plKlDYo4", c, "XGNy", "50SALabY"), ea.a.p("KmMHXwhpI2MpcgJfV2E5Y11sDWMlaVVr", "q7EulPfh"));
                        return;
                    }
                    return;
                }
                return;
            default:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) obj;
                String str = OfficeReaderActivity.D2;
                g.e(officeReaderActivity, ea.a.p("R2gic1cw", "LagBztLx"));
                officeReaderActivity.j3();
                return;
        }
    }
}
