package com.bytedance.sdk.component.fl.ac.cJ;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* compiled from: DefaultDecoder.java */
/* loaded from: classes.dex */
public class Qhi {
    public static final ImageView.ScaleType Qhi = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config cJ = Bitmap.Config.ARGB_4444;
    private int CJ;
    private final int ROR;
    private final ImageView.ScaleType Sf;
    private final int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final Bitmap.Config f8412ac;

    /* renamed from: fl  reason: collision with root package name */
    private int f8413fl;

    /* renamed from: hm  reason: collision with root package name */
    private final int f8414hm = 3840;
    private final int WAv = 104857600;

    public Qhi(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.f8412ac = config;
        this.CJ = i10;
        this.f8413fl = i11;
        this.Sf = scaleType;
        this.Tgh = i12;
        this.ROR = i13;
        Qhi(i10, i11);
    }

    public static int Qhi(int i10, int i11, int i12, int i13, int i14, int i15) {
        double min = Math.min(i10 / i12, i11 / i13);
        if (i14 > 0 && i15 > 0) {
            min = Math.max(min, Math.min(Math.max(i10, i11) / Math.max(i14, i15), Math.min(i10, i11) / Math.min(i14, i15)));
        }
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > min) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private static int Qhi(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i10 == 0 ? i12 : i10;
        } else if (i10 == 0) {
            return (int) (i12 * (i11 / i13));
        } else if (i11 == 0) {
            return i10;
        } else {
            double d10 = i13 / i12;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d11 = i11;
                return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
            }
            double d12 = i11;
            return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
        }
    }

    public Bitmap Qhi(byte[] bArr) {
        Bitmap decodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.CJ == 0 && this.f8413fl == 0) {
            options.inPreferredConfig = this.f8412ac;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int Qhi2 = Qhi(this.CJ, this.f8413fl, i10, i11, this.Sf);
            int Qhi3 = Qhi(this.f8413fl, this.CJ, i11, i10, this.Sf);
            options.inJustDecodeBounds = false;
            options.inSampleSize = Qhi(i10, i11, Qhi2, Qhi3, this.Tgh, this.ROR);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > Qhi2 || decodeByteArray.getHeight() > Qhi3)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, Qhi2, Qhi3, true);
                if (createScaledBitmap != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray != null && decodeByteArray.getByteCount() > 104857600) {
            int width = decodeByteArray.getWidth() / 2;
            int height = decodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeByteArray, width, height, true);
                if (createScaledBitmap2 != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                return createScaledBitmap2;
            }
        }
        return decodeByteArray;
    }

    private void Qhi(int i10, int i11) {
        if (i10 > 3840 && i11 > 3840) {
            if (i10 > i11) {
                this.CJ = 3840;
                this.f8413fl = (i11 * 3840) / i10;
                return;
            }
            this.CJ = (i10 * 3840) / i11;
            this.f8413fl = 3840;
        } else if (i10 > 3840) {
            this.CJ = 3840;
            this.f8413fl = (i11 * 3840) / i10;
        } else if (i11 > 3840) {
            this.CJ = (i10 * 3840) / i11;
            this.f8413fl = 3840;
        }
    }
}
