package io.flutter.embedding.android;

import android.graphics.Matrix;
import android.view.InputDevice;
import android.view.MotionEvent;
import io.flutter.embedding.android.g;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* compiled from: AndroidTouchProcessor.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final Matrix f18610e = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final FlutterRenderer f18611a;

    /* renamed from: b  reason: collision with root package name */
    public final g f18612b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f18613d = new HashMap();

    public a(FlutterRenderer flutterRenderer, boolean z10) {
        this.f18611a = flutterRenderer;
        if (g.c == null) {
            g.c = new g();
        }
        this.f18612b = g.c;
        this.c = z10;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 4;
        }
        if (i10 == 1) {
            return 6;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 == 6) {
            return 6;
        }
        if (i10 == 2) {
            return 5;
        }
        if (i10 == 7) {
            return 3;
        }
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 8) {
            return 3;
        }
        return -1;
    }

    public final void a(MotionEvent motionEvent, int i10, int i11, int i12, Matrix matrix, ByteBuffer byteBuffer) {
        long j10;
        int i13;
        HashMap hashMap;
        long j11;
        int i14;
        double d10;
        double d11;
        double d12;
        double d13;
        char c;
        InputDevice.MotionRange motionRange;
        int i15;
        if (i11 == -1) {
            return;
        }
        if (this.c) {
            g gVar = this.f18612b;
            gVar.getClass();
            j10 = g.a.f18634b.incrementAndGet();
            gVar.f18632a.put(j10, MotionEvent.obtain(motionEvent));
            gVar.f18633b.add(Long.valueOf(j10));
        } else {
            j10 = 0;
        }
        int toolType = motionEvent.getToolType(i10);
        if (toolType != 1) {
            if (toolType != 2) {
                i13 = 3;
                if (toolType != 3) {
                    if (toolType != 4) {
                        i13 = 5;
                    }
                } else {
                    i13 = 1;
                }
            } else {
                i13 = 2;
            }
        } else {
            i13 = 0;
        }
        float[] fArr = {motionEvent.getX(i10), motionEvent.getY(i10)};
        matrix.mapPoints(fArr);
        HashMap hashMap2 = this.f18613d;
        if (i13 == 1) {
            j11 = motionEvent.getButtonState() & 31;
            if (j11 == 0 && motionEvent.getSource() == 8194 && i11 == 4) {
                hashMap = hashMap2;
                hashMap.put(Integer.valueOf(motionEvent.getPointerId(i10)), fArr);
            } else {
                hashMap = hashMap2;
            }
        } else {
            hashMap = hashMap2;
            j11 = i13 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = hashMap.containsKey(Integer.valueOf(motionEvent.getPointerId(i10)));
        if (motionEvent.getActionMasked() == 8) {
            i14 = 1;
        } else {
            i14 = 0;
        }
        byteBuffer.putLong(j10);
        byteBuffer.putLong(motionEvent.getEventTime() * 1000);
        if (containsKey) {
            if (i11 == 4) {
                i15 = 7;
            } else if (i11 == 5) {
                i15 = 8;
            } else if (i11 != 6 && i11 != 0) {
                throw new AssertionError("Unexpected pointer change");
            } else {
                i15 = 9;
            }
            byteBuffer.putLong(i15);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i11);
            byteBuffer.putLong(i13);
        }
        byteBuffer.putLong(i14);
        byteBuffer.putLong(motionEvent.getPointerId(i10));
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = (float[]) hashMap.get(Integer.valueOf(motionEvent.getPointerId(i10)));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j11);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i10));
        if (motionEvent.getDevice() != null && (motionRange = motionEvent.getDevice().getMotionRange(2)) != null) {
            d11 = motionRange.getMin();
            d10 = motionRange.getMax();
        } else {
            d10 = 1.0d;
            d11 = 0.0d;
        }
        byteBuffer.putDouble(d11);
        byteBuffer.putDouble(d10);
        if (i13 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i10));
            d12 = 0.0d;
            byteBuffer.putDouble(0.0d);
        } else {
            d12 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i10));
        byteBuffer.putDouble(motionEvent.getToolMajor(i10));
        byteBuffer.putDouble(motionEvent.getToolMinor(i10));
        byteBuffer.putDouble(d12);
        byteBuffer.putDouble(d12);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i10));
        if (i13 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i10));
        } else {
            byteBuffer.putDouble(d12);
        }
        byteBuffer.putLong(i12);
        if (i14 == 1) {
            byteBuffer.putDouble(-motionEvent.getAxisValue(10));
            byteBuffer.putDouble(-motionEvent.getAxisValue(9));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr3 = (float[]) hashMap.get(Integer.valueOf(motionEvent.getPointerId(i10)));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d13 = 0.0d;
        } else {
            d13 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d13);
        byteBuffer.putDouble(d13);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d13);
        if (containsKey) {
            if (i11 == 4) {
                c = 7;
            } else if (i11 == 5) {
                c = '\b';
            } else if (i11 != 6 && i11 != 0) {
                throw new AssertionError("Unexpected pointer change");
            } else {
                c = '\t';
            }
            if (c == '\t') {
                hashMap.remove(Integer.valueOf(motionEvent.getPointerId(i10)));
            }
        }
    }

    public final void c(MotionEvent motionEvent, Matrix matrix) {
        boolean z10;
        boolean z11;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int b10 = b(motionEvent.getActionMasked());
        if (actionMasked != 0 && actionMasked != 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && (actionMasked == 1 || actionMasked == 6)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            a(motionEvent, motionEvent.getActionIndex(), b10, 0, matrix, allocateDirect);
        } else if (z11) {
            for (int i10 = 0; i10 < pointerCount; i10++) {
                if (i10 != motionEvent.getActionIndex() && motionEvent.getToolType(i10) == 1) {
                    a(motionEvent, i10, 5, 1, matrix, allocateDirect);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), b10, 0, matrix, allocateDirect);
        } else {
            for (int i11 = 0; i11 < pointerCount; i11++) {
                a(motionEvent, i11, b10, 0, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 280 == 0) {
            this.f18611a.f18652a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
            return;
        }
        throw new AssertionError("Packet position is not on field boundary");
    }
}
