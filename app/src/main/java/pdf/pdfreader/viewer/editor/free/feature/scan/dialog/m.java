package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.n0;

/* compiled from: PopCropType.kt */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f25699a;

    /* renamed from: b  reason: collision with root package name */
    public final View f25700b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public PopupWindow f25701d;

    /* compiled from: PopCropType.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(int i10);
    }

    public m(Context context, AppCompatImageView appCompatImageView, int i10, n0 n0Var) {
        kotlin.jvm.internal.g.e(context, ea.a.p("O28cdAd4dA==", "7yXrb3vY"));
        ea.a.p("M2EaZTZ0", "YuChXOM7");
        ea.a.p("X2k4dBZuB3I=", "VndpulmS");
        this.f25699a = context;
        this.f25700b = appCompatImageView;
        this.c = n0Var;
        List I = ge.a.I(context.getString(R.string.arg_res_0x7f130078), context.getString(R.string.arg_res_0x7f130080), context.getString(R.string.arg_res_0x7f1302c2));
        View inflate = LayoutInflater.from(context).inflate(R.layout.pop_filter_type, (ViewGroup) null, false);
        kotlin.jvm.internal.g.d(inflate, ea.a.p("LnIWbUBjKW48ZR50HS4-bl5sM3QsKGQuloDXZjhsNmU6Xw15GGVqICZ1CmwYIDFhVHM3KQ==", "QMHyhFjH"));
        ((RecyclerView) inflate.findViewById(R.id.pop_filter_type_content)).setAdapter(new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.a(i10, I, new n(this)));
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.showAsDropDown(appCompatImageView, 0, -context.getResources().getDimensionPixelSize(R.dimen.dp_16), 8388613);
        this.f25701d = popupWindow;
    }
}
