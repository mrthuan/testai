package com.bytedance.sdk.component.adexpress.CJ;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.fl.ac.cJ.Qhi;
import com.bytedance.sdk.component.utils.hm;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;

/* compiled from: ImageLoadUtils.java */
/* loaded from: classes.dex */
public class bxS {
    private static void CJ(ImageView imageView, byte[] bArr, int i10, int i11) {
        Bitmap Qhi = new Qhi(i10, i11, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i10, i11).Qhi(bArr);
        if (Qhi != null) {
            imageView.setImageBitmap(Qhi);
        }
    }

    public static void Qhi(ImageView imageView, byte[] bArr, int i10, int i11) {
        if (TextUtils.equals(ContentTypes.EXTENSION_PNG, hm.Qhi(Arrays.copyOfRange(bArr, 0, hm.Qhi())))) {
            cJ(imageView, bArr, i10, i11);
        } else {
            ac(imageView, bArr, i10, i11);
        }
    }

    private static void ac(ImageView imageView, byte[] bArr, int i10, int i11) {
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(wrap);
            try {
                decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                imageView.setImageDrawable(decodeDrawable);
                return;
            } catch (IOException unused) {
                return;
            }
        }
        CJ(imageView, bArr, i10, i11);
    }

    private static void cJ(ImageView imageView, byte[] bArr, int i10, int i11) {
        CJ(imageView, bArr, i10, i11);
    }
}
