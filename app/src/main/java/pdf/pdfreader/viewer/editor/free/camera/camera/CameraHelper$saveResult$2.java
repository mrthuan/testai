package pdf.pdfreader.viewer.editor.free.camera.camera;

import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;

/* compiled from: CameraHelper.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper$saveResult$2", f = "CameraHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CameraHelper$saveResult$2 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ int $cameraId;
    final /* synthetic */ sl.a $cameraPreviewSize;
    final /* synthetic */ int $deviceRotation;
    final /* synthetic */ String $filePath;
    final /* synthetic */ byte[] $imageData;
    final /* synthetic */ int $maxPicSize;
    final /* synthetic */ sl.a $showPreviewMaxSize;
    final /* synthetic */ sl.a $userSeePreviewMaxSize;
    int label;
    final /* synthetic */ CameraHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraHelper$saveResult$2(CameraHelper cameraHelper, String str, byte[] bArr, int i10, int i11, sl.a aVar, sl.a aVar2, sl.a aVar3, int i12, kotlin.coroutines.c<? super CameraHelper$saveResult$2> cVar) {
        super(2, cVar);
        this.this$0 = cameraHelper;
        this.$filePath = str;
        this.$imageData = bArr;
        this.$cameraId = i10;
        this.$deviceRotation = i11;
        this.$cameraPreviewSize = aVar;
        this.$showPreviewMaxSize = aVar2;
        this.$userSeePreviewMaxSize = aVar3;
        this.$maxPicSize = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CameraHelper$saveResult$2(this.this$0, this.$filePath, this.$imageData, this.$cameraId, this.$deviceRotation, this.$cameraPreviewSize, this.$showPreviewMaxSize, this.$userSeePreviewMaxSize, this.$maxPicSize, cVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:43|(2:48|49)|51|(4:(4:(11:(24:56|57|58|59|(1:61)(2:145|(1:147)(19:148|63|64|65|66|67|68|69|(1:71)(2:119|(1:121)(1:122))|72|73|75|76|78|79|(1:81)(1:(1:86)(1:(1:88)))|82|83|84))|62|63|64|65|66|67|68|69|(0)(0)|72|73|75|76|78|79|(0)(0)|82|83|84)|72|73|75|76|78|79|(0)(0)|82|83|84)|68|69|(0)(0))|65|66|67)|153|57|58|59|(0)(0)|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04e9, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04ea, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04ec, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04ed, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04ef, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04f0, code lost:
        r2 = null;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04f3, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04f4, code lost:
        r2 = null;
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d3 A[Catch: all -> 0x0517, TryCatch #14 {all -> 0x0517, blocks: (B:147:0x03bb, B:155:0x03d3, B:157:0x03d7, B:160:0x03dc, B:161:0x03e3, B:162:0x03e4, B:169:0x03f3, B:181:0x0426, B:199:0x046d, B:253:0x0512, B:230:0x04d9, B:231:0x04e2, B:248:0x0501, B:249:0x0507, B:168:0x03ef, B:250:0x0508, B:251:0x050f, B:146:0x03af, B:120:0x02e7, B:121:0x02fa, B:122:0x030a, B:123:0x0317, B:125:0x031a, B:126:0x0325, B:127:0x0331, B:128:0x033e, B:130:0x0341, B:131:0x034c, B:132:0x0358, B:134:0x0368, B:136:0x0375, B:138:0x037e, B:140:0x0386, B:143:0x03a5, B:142:0x0398), top: B:278:0x02e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0403 A[Catch: all -> 0x04ef, Exception -> 0x04f3, TryCatch #18 {Exception -> 0x04f3, all -> 0x04ef, blocks: (B:170:0x03f5, B:172:0x0403, B:174:0x040c, B:176:0x0410), top: B:290:0x03f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x040c A[Catch: all -> 0x04ef, Exception -> 0x04f3, TryCatch #18 {Exception -> 0x04f3, all -> 0x04ef, blocks: (B:170:0x03f5, B:172:0x0403, B:174:0x040c, B:176:0x0410), top: B:290:0x03f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0435 A[Catch: all -> 0x048f, Exception -> 0x0493, TryCatch #7 {Exception -> 0x0493, blocks: (B:182:0x042c, B:184:0x0435, B:185:0x043d, B:187:0x0441), top: B:273:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x043d A[Catch: all -> 0x048f, Exception -> 0x0493, TryCatch #7 {Exception -> 0x0493, blocks: (B:182:0x042c, B:184:0x0435, B:185:0x043d, B:187:0x0441), top: B:273:0x042c }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x045e A[Catch: all -> 0x047b, Exception -> 0x047e, TryCatch #17 {Exception -> 0x047e, all -> 0x047b, blocks: (B:192:0x0459, B:194:0x045e, B:196:0x0464, B:198:0x046a), top: B:291:0x0459 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0508 A[Catch: all -> 0x0517, TryCatch #14 {all -> 0x0517, blocks: (B:147:0x03bb, B:155:0x03d3, B:157:0x03d7, B:160:0x03dc, B:161:0x03e3, B:162:0x03e4, B:169:0x03f3, B:181:0x0426, B:199:0x046d, B:253:0x0512, B:230:0x04d9, B:231:0x04e2, B:248:0x0501, B:249:0x0507, B:168:0x03ef, B:250:0x0508, B:251:0x050f, B:146:0x03af, B:120:0x02e7, B:121:0x02fa, B:122:0x030a, B:123:0x0317, B:125:0x031a, B:126:0x0325, B:127:0x0331, B:128:0x033e, B:130:0x0341, B:131:0x034c, B:132:0x0358, B:134:0x0368, B:136:0x0375, B:138:0x037e, B:140:0x0386, B:143:0x03a5, B:142:0x0398), top: B:278:0x02e7 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper$saveResult$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((CameraHelper$saveResult$2) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
