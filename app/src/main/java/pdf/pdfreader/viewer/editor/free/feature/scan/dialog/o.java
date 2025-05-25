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
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.o0;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;

/* compiled from: PopFilterType.kt */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Context f25703a;

    /* renamed from: b  reason: collision with root package name */
    public final View f25704b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final List<GroupAiFilterType> f25705d;

    /* renamed from: e  reason: collision with root package name */
    public PopupWindow f25706e;

    /* compiled from: PopFilterType.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(GroupAiFilterType groupAiFilterType);
    }

    public o(Context context, AppCompatImageView appCompatImageView, o0 o0Var, List list) {
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "m8m5SjqB"));
        ea.a.p("Q2E5ZR10", "F84S8nyZ");
        ea.a.p("X2k4dBZuB3I=", "02wlWq32");
        kotlin.jvm.internal.g.e(list, ea.a.p("VWkndBZycw==", "BNIrSOLq"));
        this.f25703a = context;
        this.f25704b = appCompatImageView;
        this.c = o0Var;
        this.f25705d = list;
        View inflate = LayoutInflater.from(context).inflate(R.layout.pop_filter_type, (ViewGroup) null, false);
        kotlin.jvm.internal.g.d(inflate, ea.a.p("VXIkbVtjDW4GZUx0QC4_biJsU3QjKBEuioCVZlxsP2VBXz95A2VOIBx1WGxFIDBhKHNXKQ==", "h35KPrGJ"));
        ((RecyclerView) inflate.findViewById(R.id.pop_filter_type_content)).setAdapter(new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.c(list, new p(this)));
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.showAsDropDown(appCompatImageView, 0, -context.getResources().getDimensionPixelSize(R.dimen.dp_16), 8388613);
        this.f25706e = popupWindow;
    }
}
