package pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust;

import android.content.Context;
import android.graphics.Bitmap;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;
import wf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseImageAdjustViewHolder.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$4", f = "BaseImageAdjustViewHolder.kt", l = {107, 110, 113, 115}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$4 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Bitmap>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $height;
    final /* synthetic */ ul.b $image;
    final /* synthetic */ ul.c $imageConfig;
    final /* synthetic */ int $width;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ BaseImageAdjustViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$4(ul.b bVar, Context context, int i10, int i11, BaseImageAdjustViewHolder baseImageAdjustViewHolder, ul.c cVar, kotlin.coroutines.c<? super BaseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$4> cVar2) {
        super(2, cVar2);
        this.$image = bVar;
        this.$context = context;
        this.$width = i10;
        this.$height = i11;
        this.this$0 = baseImageAdjustViewHolder;
        this.$imageConfig = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        BaseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$4 baseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$4 = new BaseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$4(this.$image, this.$context, this.$width, this.$height, this.this$0, this.$imageConfig, cVar);
        baseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$4.L$0 = obj;
        return baseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[Catch: all -> 0x0163, TryCatch #1 {all -> 0x0163, blocks: (B:10:0x001d, B:53:0x0121, B:55:0x0125, B:56:0x012b, B:62:0x015e, B:59:0x0156, B:61:0x015b, B:15:0x0040, B:50:0x010e, B:18:0x0055, B:38:0x00d2, B:41:0x00df, B:45:0x00e6, B:21:0x0073, B:37:0x00cc, B:24:0x008d, B:26:0x0091, B:33:0x009e), top: B:67:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125 A[Catch: all -> 0x0163, TRY_LEAVE, TryCatch #1 {all -> 0x0163, blocks: (B:10:0x001d, B:53:0x0121, B:55:0x0125, B:56:0x012b, B:62:0x015e, B:59:0x0156, B:61:0x015b, B:15:0x0040, B:50:0x010e, B:18:0x0055, B:38:0x00d2, B:41:0x00df, B:45:0x00e6, B:21:0x0073, B:37:0x00cc, B:24:0x008d, B:26:0x0091, B:33:0x009e), top: B:67:0x000a, inners: #3 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Bitmap> cVar) {
        return ((BaseImageAdjustViewHolder$makeOriginBitmapWithoutFilter$4) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
