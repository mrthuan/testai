package pdf.pdfreader.viewer.editor.free.feature.scan.adapter;

import android.content.Context;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter;

/* compiled from: ThumbAdapter.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter$ViewHolder$onBinding$2", f = "ThumbAdapter.kt", l = {ShapeTypes.FLOW_CHART_PROCESS, ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS, ShapeTypes.FLOW_CHART_MULTIDOCUMENT, ShapeTypes.FLOW_CHART_MANUAL_INPUT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ThumbAdapter$ViewHolder$onBinding$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ul.b $image;
    final /* synthetic */ int $position;
    Object L$0;
    int label;
    final /* synthetic */ ThumbAdapter.ViewHolder this$0;
    final /* synthetic */ ThumbAdapter this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbAdapter$ViewHolder$onBinding$2(ThumbAdapter.ViewHolder viewHolder, Context context, ul.b bVar, ThumbAdapter thumbAdapter, int i10, kotlin.coroutines.c<? super ThumbAdapter$ViewHolder$onBinding$2> cVar) {
        super(2, cVar);
        this.this$0 = viewHolder;
        this.$context = context;
        this.$image = bVar;
        this.this$1 = thumbAdapter;
        this.$position = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ThumbAdapter$ViewHolder$onBinding$2(this.this$0, this.$context, this.$image, this.this$1, this.$position, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter$ViewHolder$onBinding$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ThumbAdapter$ViewHolder$onBinding$2) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
