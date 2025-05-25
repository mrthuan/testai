package m3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.model.layer.Layer;
import e3.k;
import e3.l;
import e3.o;
import h3.p;
import java.io.IOException;
import java.util.HashSet;
import p3.g;

/* compiled from: ImageLayer.java */
/* loaded from: classes.dex */
public final class b extends com.airbnb.lottie.model.layer.a {

    /* renamed from: w  reason: collision with root package name */
    public final f3.a f21797w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f21798x;

    /* renamed from: y  reason: collision with root package name */
    public final Rect f21799y;

    /* renamed from: z  reason: collision with root package name */
    public p f21800z;

    public b(k kVar, Layer layer) {
        super(kVar, layer);
        this.f21797w = new f3.a(3);
        this.f21798x = new Rect();
        this.f21799y = new Rect();
    }

    @Override // com.airbnb.lottie.model.layer.a, j3.e
    public final void c(n3.a aVar, Object obj) {
        super.c(aVar, obj);
        if (obj == o.C) {
            if (aVar == null) {
                this.f21800z = null;
            } else {
                this.f21800z = new p(aVar, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, g3.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        Bitmap p10 = p();
        if (p10 != null) {
            rectF.set(0.0f, 0.0f, g.c() * p10.getWidth(), g.c() * p10.getHeight());
            this.f6134l.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void j(Canvas canvas, Matrix matrix, int i10) {
        Bitmap p10 = p();
        if (p10 != null && !p10.isRecycled()) {
            float c = g.c();
            f3.a aVar = this.f21797w;
            aVar.setAlpha(i10);
            p pVar = this.f21800z;
            if (pVar != null) {
                aVar.setColorFilter((ColorFilter) pVar.f());
            }
            canvas.save();
            canvas.concat(matrix);
            int width = p10.getWidth();
            int height = p10.getHeight();
            Rect rect = this.f21798x;
            rect.set(0, 0, width, height);
            Rect rect2 = this.f21799y;
            rect2.set(0, 0, (int) (p10.getWidth() * c), (int) (p10.getHeight() * c));
            canvas.drawBitmap(p10, rect, rect2, aVar);
            canvas.restore();
        }
    }

    public final Bitmap p() {
        i3.b bVar;
        Context context;
        boolean z10;
        Bitmap bitmap;
        String str = this.f6136n.f6106g;
        k kVar = this.f6135m;
        if (kVar.getCallback() == null) {
            bVar = null;
        } else {
            i3.b bVar2 = kVar.f16375i;
            if (bVar2 != null) {
                Drawable.Callback callback = kVar.getCallback();
                if (callback != null && (callback instanceof View)) {
                    context = ((View) callback).getContext();
                } else {
                    context = null;
                }
                Context context2 = bVar2.f18434a;
                if ((context == null && context2 == null) || context2.equals(context)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    kVar.f16375i = null;
                }
            }
            if (kVar.f16375i == null) {
                kVar.f16375i = new i3.b(kVar.getCallback(), kVar.f16376j, kVar.f16369b.f16343d);
            }
            bVar = kVar.f16375i;
        }
        if (bVar == null) {
            return null;
        }
        String str2 = bVar.f18435b;
        l lVar = bVar.c.get(str);
        if (lVar == null) {
            return null;
        }
        Bitmap bitmap2 = lVar.f16413d;
        if (bitmap2 != null) {
            return bitmap2;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        String str3 = lVar.c;
        if (str3.startsWith("data:") && str3.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                synchronized (i3.b.f18433d) {
                    bVar.c.get(str).f16413d = decodeByteArray;
                }
                return decodeByteArray;
            } catch (IllegalArgumentException unused) {
                p3.c.f23668a.getClass();
                HashSet hashSet = p3.b.f23667a;
                if (hashSet.contains("data URL did not have correct base64 format.")) {
                    return null;
                }
                hashSet.add("data URL did not have correct base64 format.");
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                Bitmap decodeStream = BitmapFactory.decodeStream(bVar.f18434a.getAssets().open(str2 + str3), null, options);
                int i10 = lVar.f16411a;
                int i11 = lVar.f16412b;
                g.a aVar = g.f23679a;
                if (decodeStream.getWidth() == i10 && decodeStream.getHeight() == i11) {
                    bitmap = decodeStream;
                } else {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, i10, i11, true);
                    decodeStream.recycle();
                    bitmap = createScaledBitmap;
                }
                bVar.a(bitmap, str);
                return bitmap;
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused2) {
            p3.c.f23668a.getClass();
            HashSet hashSet2 = p3.b.f23667a;
            if (hashSet2.contains("Unable to open asset.")) {
                return null;
            }
            hashSet2.add("Unable to open asset.");
            return null;
        }
    }
}
