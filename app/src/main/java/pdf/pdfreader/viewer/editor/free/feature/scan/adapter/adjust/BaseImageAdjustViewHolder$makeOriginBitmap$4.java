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
@c(c = "pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder$makeOriginBitmap$4", f = "BaseImageAdjustViewHolder.kt", l = {50, 53, 56, 58}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseImageAdjustViewHolder$makeOriginBitmap$4 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super Bitmap>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $height;
    final /* synthetic */ ul.b $image;
    final /* synthetic */ ul.c $imageConfig;
    final /* synthetic */ int $width;
    final /* synthetic */ boolean $withFilter;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ BaseImageAdjustViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseImageAdjustViewHolder$makeOriginBitmap$4(ul.b bVar, Context context, int i10, int i11, BaseImageAdjustViewHolder baseImageAdjustViewHolder, ul.c cVar, boolean z10, kotlin.coroutines.c<? super BaseImageAdjustViewHolder$makeOriginBitmap$4> cVar2) {
        super(2, cVar2);
        this.$image = bVar;
        this.$context = context;
        this.$width = i10;
        this.$height = i11;
        this.this$0 = baseImageAdjustViewHolder;
        this.$imageConfig = cVar;
        this.$withFilter = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        BaseImageAdjustViewHolder$makeOriginBitmap$4 baseImageAdjustViewHolder$makeOriginBitmap$4 = new BaseImageAdjustViewHolder$makeOriginBitmap$4(this.$image, this.$context, this.$width, this.$height, this.this$0, this.$imageConfig, this.$withFilter, cVar);
        baseImageAdjustViewHolder$makeOriginBitmap$4.L$0 = obj;
        return baseImageAdjustViewHolder$makeOriginBitmap$4;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae A[Catch: all -> 0x018c, TryCatch #2 {all -> 0x018c, blocks: (B:10:0x0023, B:54:0x0141, B:56:0x0145, B:57:0x014b, B:63:0x0179, B:60:0x0171, B:62:0x0176, B:64:0x017d, B:66:0x0181, B:69:0x0187, B:16:0x004a, B:51:0x012c, B:19:0x0061, B:39:0x00e6, B:42:0x00f4, B:46:0x00fd, B:22:0x0081, B:38:0x00e0, B:25:0x009d, B:27:0x00a1, B:34:0x00ae), top: B:74:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145 A[Catch: all -> 0x018c, TRY_LEAVE, TryCatch #2 {all -> 0x018c, blocks: (B:10:0x0023, B:54:0x0141, B:56:0x0145, B:57:0x014b, B:63:0x0179, B:60:0x0171, B:62:0x0176, B:64:0x017d, B:66:0x0181, B:69:0x0187, B:16:0x004a, B:51:0x012c, B:19:0x0061, B:39:0x00e6, B:42:0x00f4, B:46:0x00fd, B:22:0x0081, B:38:0x00e0, B:25:0x009d, B:27:0x00a1, B:34:0x00ae), top: B:74:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181 A[Catch: all -> 0x018c, TryCatch #2 {all -> 0x018c, blocks: (B:10:0x0023, B:54:0x0141, B:56:0x0145, B:57:0x014b, B:63:0x0179, B:60:0x0171, B:62:0x0176, B:64:0x017d, B:66:0x0181, B:69:0x0187, B:16:0x004a, B:51:0x012c, B:19:0x0061, B:39:0x00e6, B:42:0x00f4, B:46:0x00fd, B:22:0x0081, B:38:0x00e0, B:25:0x009d, B:27:0x00a1, B:34:0x00ae), top: B:74:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.BaseImageAdjustViewHolder$makeOriginBitmap$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super Bitmap> cVar) {
        return ((BaseImageAdjustViewHolder$makeOriginBitmap$4) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
