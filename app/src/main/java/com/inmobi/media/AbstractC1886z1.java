package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.ByteArrayOutputStream;

/* renamed from: com.inmobi.media.z1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1886z1 implements X {

    /* renamed from: a  reason: collision with root package name */
    public final AdConfig.AdQualityConfig f15698a;

    public AbstractC1886z1(AdConfig.AdQualityConfig adQualityConfig) {
        kotlin.jvm.internal.g.e(adQualityConfig, "adQualityConfig");
        this.f15698a = adQualityConfig;
    }

    public final Bitmap a(Bitmap bitmap) {
        kotlin.jvm.internal.g.e(bitmap, "bitmap");
        double resizedPercentage = (this.f15698a.getResizedPercentage() / 100.0d) * bitmap.getWidth();
        double resizedPercentage2 = (this.f15698a.getResizedPercentage() / 100.0d) * bitmap.getHeight();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) resizedPercentage, (int) resizedPercentage2, true);
        kotlin.jvm.internal.g.d(createScaledBitmap, "createScaledBitmap(...)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        if (length <= this.f15698a.getMaxImageSize()) {
            return createScaledBitmap;
        }
        StringBuilder sb2 = new StringBuilder("resize - original - ");
        sb2.append(resizedPercentage);
        String str = "  - ";
        sb2.append("  - ");
        sb2.append(resizedPercentage2);
        sb2.append(" - size - ");
        sb2.append(length);
        String message = sb2.toString();
        kotlin.jvm.internal.g.e(message, "message");
        while (length > this.f15698a.getMaxImageSize()) {
            String str2 = str;
            double sqrt = Math.sqrt(this.f15698a.getMaxImageSize() / length);
            resizedPercentage *= sqrt;
            resizedPercentage2 *= sqrt;
            if (Math.floor(resizedPercentage) <= 0.0d && Math.floor(resizedPercentage2) <= 0.0d) {
                return createScaledBitmap;
            }
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, (int) Math.floor(resizedPercentage), (int) Math.floor(resizedPercentage2), true);
            kotlin.jvm.internal.g.d(createScaledBitmap, "createScaledBitmap(...)");
            byteArrayOutputStream.reset();
            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            length = byteArrayOutputStream.toByteArray().length;
            str = str2;
        }
        String message2 = "resize - " + resizedPercentage + str + resizedPercentage2 + " - " + byteArrayOutputStream.size();
        kotlin.jvm.internal.g.e(message2, "message");
        return createScaledBitmap;
    }
}
