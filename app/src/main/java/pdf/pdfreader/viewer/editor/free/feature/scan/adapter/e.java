package pdf.pdfreader.viewer.editor.free.feature.scan.adapter;

import am.q0;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.k0;
import cg.l;
import java.util.ArrayList;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.WidgetFromType;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter;
import pdf.pdfreader.viewer.editor.free.ui.adapter.w;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugViewModel;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25675a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25676b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f25675a = i10;
        this.f25676b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l<? super Integer, tf.d> lVar;
        int i10 = this.f25675a;
        Integer num = null;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.f25676b;
        switch (i10) {
            case 0:
                ThumbAdapter.ViewHolder viewHolder = (ThumbAdapter.ViewHolder) obj2;
                ThumbAdapter thumbAdapter = (ThumbAdapter) obj;
                g.e(viewHolder, ea.a.p("GmgocxMw", "Q6nA7QYL"));
                g.e(thumbAdapter, ea.a.p("O2hYc10x", "dWBxxL2Z"));
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                if (bindingAdapterPosition != -1 && bindingAdapterPosition != thumbAdapter.f25626g && (lVar = thumbAdapter.f25631l) != null) {
                    lVar.invoke(Integer.valueOf(bindingAdapterPosition));
                    return;
                }
                return;
            case 1:
                w.b bVar = (w.b) obj2;
                w wVar = (w) obj;
                int i11 = w.b.f27318l;
                g.e(bVar, ea.a.p("ImgHcxMw", "tiVn7ubC"));
                g.e(wVar, ea.a.p("O2hYc10x", "UAyQjwoJ"));
                Integer valueOf = Integer.valueOf(bVar.getAdapterPosition());
                int intValue = valueOf.intValue();
                if (intValue >= 0 && intValue < wVar.f27316h.size()) {
                    z10 = true;
                }
                if (z10) {
                    num = valueOf;
                }
                if (num != null) {
                    int intValue2 = num.intValue();
                    ArrayList arrayList = wVar.f27315g;
                    if (arrayList.contains(Integer.valueOf(intValue2))) {
                        arrayList.remove(Integer.valueOf(intValue2));
                    } else {
                        arrayList.add(Integer.valueOf(intValue2));
                    }
                    wVar.f27314f.b(intValue2);
                    wVar.notifyItemChanged(intValue2, new Object());
                    return;
                }
                return;
            case 2:
                DebugNotificationFragment debugNotificationFragment = (DebugNotificationFragment) obj2;
                Context context = (Context) obj;
                int i12 = DebugNotificationFragment.f27859d0;
                g.e(debugNotificationFragment, ea.a.p("O2hYc10w", "3lJLyPgk"));
                g.e(context, ea.a.p("F2MkbgdlGnQ=", "6ZWaKnKw"));
                try {
                    VB vb2 = debugNotificationFragment.Y;
                    g.b(vb2);
                    int parseInt = Integer.parseInt(((q0) vb2).f1332g.getText().toString());
                    VB vb3 = debugNotificationFragment.Y;
                    g.b(vb3);
                    int parseInt2 = Integer.parseInt(((q0) vb3).f1333h.getText().toString());
                    SharedPreferences sharedPreferences = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
                    sharedPreferences.edit().putInt(ea.a.p("K2VTdR5fWW8uXyxpG2kbaFBkMXIgYQFlPl9cbzlpVWksYUVpFm5oaDV1cg==", "ITRML2M3"), parseInt).apply();
                    sharedPreferences.edit().putInt(ea.a.p("K2VTdR5fWW8uXyxpG2kbaFBkMXIgYQFlMV85b0xpNGksYUVpFm5obTNuP3Rl", "i4yRCW8R"), parseInt2).apply();
                    Context context2 = view.getContext();
                    g.d(context2, ea.a.p("LnRNYwtuHmUwdA==", "oHGcdjCZ"));
                    pp.a.b(context2);
                    Toast.makeText(context, ea.a.p("2671586uhIji5b6f", "VSF6ZNrF"), 0).show();
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                Context context3 = (Context) obj2;
                DebugPageAndDialogFragment debugPageAndDialogFragment = (DebugPageAndDialogFragment) obj;
                int i13 = DebugPageAndDialogFragment.f27860g0;
                g.e(context3, ea.a.p("T2MMbjhlGnQ=", "2VkcLbqc"));
                g.e(debugPageAndDialogFragment, ea.a.p("R2hQc24w", "br39JpBe"));
                WidgetFromType widgetFromType = WidgetFromType.Setting;
                k0 k0Var = debugPageAndDialogFragment.f27861d0;
                f fVar = (f) ((ReaderDebugViewModel) k0Var.getValue()).f27853g.getValue();
                pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b bVar2 = ((ReaderDebugViewModel) k0Var.getValue()).f27852f;
                if (bVar2 != null) {
                    new PdfReaderAppWidgetNewDialog(context3, widgetFromType, fVar, bVar2).show();
                    return;
                } else {
                    g.i(ea.a.p("CXA-Ux90BWkmZzZlRm0-c0tpPW4AbkJyG2QEYzRy", "cDhNzq8P"));
                    throw null;
                }
        }
    }
}
