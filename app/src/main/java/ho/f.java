package ho;

import android.content.Context;
import ho.b;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.AdjustableType;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;

/* compiled from: RawGroupAiFilter.kt */
/* loaded from: classes3.dex */
public final class f extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "smeeMZ2r"));
    }

    @Override // ho.b
    public final GroupAiFilterType b() {
        return GroupAiFilterType.RAW;
    }

    @Override // ho.b
    public final void c() {
        b.a aVar = new b.a(AdjustableType.CONTRAST, new ko.d());
        ArrayList<b.a> arrayList = this.c;
        arrayList.add(aVar);
        arrayList.add(new b.a(AdjustableType.BRIGHTNESS, new ko.c()));
        arrayList.add(new b.a(AdjustableType.SHARPEN, new ko.e()));
    }
}
