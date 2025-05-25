package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.util.Locale;

@TargetApi(19)
/* loaded from: classes.dex */
public class FlutterImageView extends View implements ef.b {

    /* renamed from: a  reason: collision with root package name */
    public ImageReader f18573a;

    /* renamed from: b  reason: collision with root package name */
    public Image f18574b;
    public Bitmap c;

    /* renamed from: d  reason: collision with root package name */
    public final SurfaceKind f18575d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18576e;

    /* loaded from: classes.dex */
    public enum SurfaceKind {
        background,
        overlay
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlutterImageView(Context context, int i10, int i11, SurfaceKind surfaceKind) {
        super(context, null);
        ImageReader a10 = a(i10, i11);
        this.f18576e = false;
        this.f18573a = a10;
        this.f18575d = surfaceKind;
        setAlpha(0.0f);
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(19)
    public static ImageReader a(int i10, int i11) {
        if (i10 <= 0) {
            String.format(Locale.US, "ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i10));
            i10 = 1;
        }
        if (i11 <= 0) {
            String.format(Locale.US, "ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i11));
            i11 = 1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return com.google.android.gms.internal.ads.f.b(i10, i11);
        }
        return ImageReader.newInstance(i10, i11, 1, 3);
    }

    public final void b() {
        Image acquireLatestImage;
        if (!this.f18576e) {
            return;
        }
        setAlpha(0.0f);
        if (this.f18576e && (acquireLatestImage = this.f18573a.acquireLatestImage()) != null) {
            Image image = this.f18574b;
            if (image != null) {
                image.close();
                this.f18574b = null;
            }
            this.f18574b = acquireLatestImage;
            invalidate();
        }
        this.c = null;
        Image image2 = this.f18574b;
        if (image2 != null) {
            image2.close();
            this.f18574b = null;
        }
        invalidate();
        this.f18576e = false;
    }

    public FlutterRenderer getAttachedRenderer() {
        return null;
    }

    public ImageReader getImageReader() {
        return this.f18573a;
    }

    public Surface getSurface() {
        return this.f18573a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        super.onDraw(canvas);
        Image image = this.f18574b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.c = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f18574b.getHeight();
                    Bitmap bitmap = this.c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.c.getHeight() != height) {
                        this.c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if ((i10 != this.f18573a.getWidth() || i11 != this.f18573a.getHeight()) && this.f18575d == SurfaceKind.background && this.f18576e) {
            this.f18573a.getSurface();
            throw null;
        }
    }

    public FlutterImageView(Context context) {
        this(context, 1, 1, SurfaceKind.background);
    }

    public FlutterImageView(Context context, AttributeSet attributeSet) {
        this(context, 1, 1, SurfaceKind.background);
    }
}
