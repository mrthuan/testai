package ho;

import android.content.Context;
import ho.b;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.AdjustableType;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;

/* compiled from: ContrastGroupAiFilter.kt */
/* loaded from: classes3.dex */
public final class d extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "br5xdidv"));
    }

    @Override // ho.b
    public final GroupAiFilterType b() {
        return GroupAiFilterType.CONTRAST;
    }

    @Override // ho.b
    public final void c() {
        AdjustableType adjustableType = AdjustableType.CONTRAST;
        ko.d dVar = new ko.d();
        dVar.f29512j = 2.062f;
        dVar.l(2.062f, dVar.f29511i);
        tf.d dVar2 = tf.d.f30009a;
        b.a aVar = new b.a(adjustableType, dVar);
        ArrayList<b.a> arrayList = this.c;
        arrayList.add(aVar);
        arrayList.add(new b.a(AdjustableType.BRIGHTNESS, new ko.c()));
        arrayList.add(new b.a(AdjustableType.SHARPEN, new ko.e()));
    }
}
