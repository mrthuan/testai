package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.tensorflow.lite.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NativeInterpreterWrapper implements AutoCloseable {

    /* renamed from: a  reason: collision with root package name */
    public long f23571a;

    /* renamed from: b  reason: collision with root package name */
    public long f23572b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f23573d;

    /* renamed from: e  reason: collision with root package name */
    public Tensor[] f23574e;

    /* renamed from: f  reason: collision with root package name */
    public Tensor[] f23575f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23576g;
    private long inferenceDurationNanoseconds = -1;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f23577h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f23578i = new ArrayList();

    public NativeInterpreterWrapper(ByteBuffer byteBuffer, b.a aVar) {
        a aVar2;
        Class<?> cls;
        Iterator it;
        boolean z10 = false;
        this.f23576g = false;
        TensorFlowLite.a();
        if (!(byteBuffer instanceof MappedByteBuffer) && (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder())) {
            throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.f23573d = byteBuffer;
        long createErrorReporter = createErrorReporter(512);
        long createModelWithBuffer = createModelWithBuffer(this.f23573d, createErrorReporter);
        this.f23571a = createErrorReporter;
        this.c = createModelWithBuffer;
        long createInterpreter = createInterpreter(createModelWithBuffer, createErrorReporter, -1);
        this.f23572b = createInterpreter;
        this.f23574e = new Tensor[getInputCount(createInterpreter)];
        this.f23575f = new Tensor[getOutputCount(this.f23572b)];
        boolean hasUnresolvedFlexOp = hasUnresolvedFlexOp(this.f23572b);
        ArrayList arrayList = aVar.f23584a;
        if (hasUnresolvedFlexOp) {
            try {
                cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
                it = arrayList.iterator();
            } catch (Exception unused) {
            }
            while (it.hasNext()) {
                if (cls.isInstance((a) it.next())) {
                    aVar2 = null;
                    break;
                }
            }
            aVar2 = (a) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (aVar2 != null) {
                this.f23578i.add((AutoCloseable) aVar2);
                applyDelegate(this.f23572b, this.f23571a, aVar2.a());
            }
        }
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a aVar3 = (a) it2.next();
                applyDelegate(this.f23572b, this.f23571a, aVar3.a());
                this.f23577h.add(aVar3);
            }
        } catch (IllegalArgumentException e10) {
            if (hasUnresolvedFlexOp && !hasUnresolvedFlexOp(this.f23572b)) {
                z10 = true;
            }
            if (z10) {
                System.err.println("Ignoring failed delegate application: " + e10);
            } else {
                throw e10;
            }
        }
        allocateTensors(this.f23572b, createErrorReporter);
        this.f23576g = true;
    }

    private static native long allocateTensors(long j10, long j11);

    private static native void allowBufferHandleOutput(long j10, boolean z10);

    private static native void allowFp16PrecisionForFp32(long j10, boolean z10);

    private static native void applyDelegate(long j10, long j11, long j12);

    private static native long createCancellationFlag(long j10);

    private static native long createErrorReporter(int i10);

    private static native long createInterpreter(long j10, long j11, int i10);

    private static native long createModel(String str, long j10);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j10);

    private static native void delete(long j10, long j11, long j12);

    private static native long deleteCancellationFlag(long j10);

    private static native int getExecutionPlanLength(long j10);

    private static native int getInputCount(long j10);

    private static native String[] getInputNames(long j10);

    private static native int getInputTensorIndex(long j10, int i10);

    private static native int getOutputCount(long j10);

    private static native int getOutputDataType(long j10, int i10);

    private static native String[] getOutputNames(long j10);

    private static native int getOutputTensorIndex(long j10, int i10);

    private static native boolean hasUnresolvedFlexOp(long j10);

    private static native void numThreads(long j10, int i10);

    private static native void resetVariableTensors(long j10, long j11);

    private static native boolean resizeInput(long j10, long j11, int i10, int[] iArr, boolean z10);

    private static native void run(long j10, long j11);

    private static native void setCancelled(long j10, long j11, boolean z10);

    private static native void useXNNPACK(long j10, long j11, boolean z10, int i10);

    public final void a() {
        if (this.f23576g) {
            return;
        }
        this.f23576g = true;
        allocateTensors(this.f23572b, this.f23571a);
        int i10 = 0;
        while (true) {
            Tensor[] tensorArr = this.f23575f;
            if (i10 < tensorArr.length) {
                Tensor tensor = tensorArr[i10];
                if (tensor != null) {
                    tensor.h();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final Tensor b(int i10) {
        if (i10 >= 0) {
            Tensor[] tensorArr = this.f23574e;
            if (i10 < tensorArr.length) {
                Tensor tensor = tensorArr[i10];
                if (tensor == null) {
                    long j10 = this.f23572b;
                    Tensor g10 = Tensor.g(getInputTensorIndex(j10, i10), j10);
                    tensorArr[i10] = g10;
                    return g10;
                }
                return tensor;
            }
        }
        throw new IllegalArgumentException(b.a.c("Invalid input Tensor index: ", i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object[] r10, java.util.HashMap r11) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.NativeInterpreterWrapper.c(java.lang.Object[], java.util.HashMap):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i10 = 0;
        while (true) {
            Tensor[] tensorArr = this.f23574e;
            if (i10 >= tensorArr.length) {
                break;
            }
            Tensor tensor = tensorArr[i10];
            if (tensor != null) {
                tensor.b();
                this.f23574e[i10] = null;
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            Tensor[] tensorArr2 = this.f23575f;
            if (i11 >= tensorArr2.length) {
                break;
            }
            Tensor tensor2 = tensorArr2[i11];
            if (tensor2 != null) {
                tensor2.b();
                this.f23575f[i11] = null;
            }
            i11++;
        }
        delete(this.f23571a, this.c, this.f23572b);
        deleteCancellationFlag(0L);
        this.f23571a = 0L;
        this.c = 0L;
        this.f23572b = 0L;
        this.f23573d = null;
        this.f23576g = false;
        this.f23577h.clear();
        ArrayList arrayList = this.f23578i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((AutoCloseable) it.next()).close();
            } catch (Exception e10) {
                System.err.println("Failed to close flex delegate: " + e10);
            }
        }
        arrayList.clear();
    }
}
