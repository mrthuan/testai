package pdf.pdfreader.viewer.editor.free.ui.act.single_choose;

import android.content.Intent;
import gn.b;
import java.util.ArrayList;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.TurnPageMode;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity;
import ul.b;

/* compiled from: SingleSelectImagePreviewActivity.kt */
/* loaded from: classes3.dex */
public final class SingleSelectImagePreviewActivity extends ReaderSelectImagePreviewActivity {
    public static final /* synthetic */ int X = 0;

    /* compiled from: SingleSelectImagePreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(pdf.pdfreader.viewer.editor.free.ui.act.a context, b bVar, boolean z10, TurnPageMode turnPageMode) {
            g.e(context, "context");
            Intent intent = new Intent(context, SingleSelectImagePreviewActivity.class);
            intent.putExtra(ea.a.p("WGUyXxdpEXAeYU1fGXIzdi1lRV8vZA==", "sRVEJSQh"), bVar.f30405b);
            intent.putExtra(ea.a.p("WnMNchxtNmgbcmQ=", "ATmtlaVy"), z10);
            if (turnPageMode != null) {
                intent.putExtra(ea.a.p("R3U5bid5EmU=", "kWpuH8aG"), turnPageMode.ordinal());
            }
            context.startActivityForResult(intent, 200);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity
    public final void n2() {
        b bVar;
        ArrayList arrayList = (ArrayList) p2().f30456e.d();
        if (arrayList != null && (!arrayList.isEmpty()) && (bVar = (b) m.t0(0, arrayList)) != null) {
            b.a aVar = gn.b.f17937a;
            String p10 = ea.a.p("LmRVaRRnaGQ1bi9fFmwBY2s=", "4c6EToXu");
            aVar.getClass();
            b.a.b(this, p10);
            Intent intent = new Intent();
            intent.putExtra(ea.a.p("PWVCdRV0Z2EuaA==", "sCWztzL3"), bVar.f30404a);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        String str;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 200 && i11 == -1) {
            if (intent != null) {
                str = intent.getStringExtra(ea.a.p("QWU4dR90MmEGaA==", "hXz3MSMY"));
            } else {
                str = null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra(ea.a.p("PWVCdRV0Z2EuaA==", "WfJJg1hv"), str);
            setResult(-1, intent2);
            finish();
        }
    }
}
