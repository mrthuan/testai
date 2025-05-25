package pdf.pdfreader.viewer.editor.free.camera.camera;

import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;

/* compiled from: CameraHelper.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper$takePhoto$1$1", f = "CameraHelper.kt", l = {195}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CameraHelper$takePhoto$1$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ int $cameraId;
    final /* synthetic */ sl.a $cameraPreviewSize;
    final /* synthetic */ byte[] $data;
    final /* synthetic */ int $deviceRotation;
    final /* synthetic */ String $filePath;
    final /* synthetic */ rl.a $listener;
    final /* synthetic */ int $maxPicSize;
    final /* synthetic */ sl.a $showPreviewMaxSize;
    final /* synthetic */ sl.a $userSeePreviewMaxSize;
    int label;
    final /* synthetic */ CameraHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraHelper$takePhoto$1$1(CameraHelper cameraHelper, byte[] bArr, int i10, String str, int i11, sl.a aVar, sl.a aVar2, sl.a aVar3, int i12, rl.a aVar4, kotlin.coroutines.c<? super CameraHelper$takePhoto$1$1> cVar) {
        super(2, cVar);
        this.this$0 = cameraHelper;
        this.$data = bArr;
        this.$cameraId = i10;
        this.$filePath = str;
        this.$deviceRotation = i11;
        this.$cameraPreviewSize = aVar;
        this.$showPreviewMaxSize = aVar2;
        this.$userSeePreviewMaxSize = aVar3;
        this.$maxPicSize = i12;
        this.$listener = aVar4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CameraHelper$takePhoto$1$1(this.this$0, this.$data, this.$cameraId, this.$filePath, this.$deviceRotation, this.$cameraPreviewSize, this.$showPreviewMaxSize, this.$userSeePreviewMaxSize, this.$maxPicSize, this.$listener, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            CameraHelper cameraHelper = this.this$0;
            byte[] data = this.$data;
            g.d(data, "data");
            int i11 = this.$cameraId;
            String str = this.$filePath;
            int i12 = this.$deviceRotation;
            sl.a aVar = this.$cameraPreviewSize;
            sl.a aVar2 = this.$showPreviewMaxSize;
            sl.a aVar3 = this.$userSeePreviewMaxSize;
            int i13 = this.$maxPicSize;
            this.label = 1;
            cameraHelper.getClass();
            Object w02 = t0.w0(j0.f20207b, new CameraHelper$saveResult$2(cameraHelper, str, data, i11, i12, aVar, aVar2, aVar3, i13, null), this);
            if (w02 != obj2) {
                w02 = d.f30009a;
            }
            if (w02 == obj2) {
                return obj2;
            }
        }
        CameraHelper cameraHelper2 = this.this$0;
        cameraHelper2.f24081p = null;
        l1.a aVar4 = cameraHelper2.f24077l;
        if (aVar4 != null) {
            cameraHelper2.f24076k.removeCallbacks(aVar4);
        }
        try {
            CameraHelper cameraHelper3 = this.this$0;
            cameraHelper3.f24083r = Boolean.FALSE;
            cameraHelper3.o(cameraHelper3.f24085t);
            this.this$0.i();
        } catch (Throwable unused) {
            this.this$0.i();
        }
        this.$listener.s0();
        return d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((CameraHelper$takePhoto$1$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
