package com.tom_roush.pdfbox.pdmodel.graphics.image;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public interface PDImage extends COSObjectable {
    InputStream createInputStream();

    InputStream createInputStream(DecodeOptions decodeOptions);

    InputStream createInputStream(List<String> list);

    int getBitsPerComponent();

    PDColorSpace getColorSpace();

    COSArray getDecode();

    int getHeight();

    Bitmap getImage();

    Bitmap getImage(Rect rect, int i10);

    boolean getInterpolate();

    Bitmap getStencilImage(Paint paint);

    String getSuffix();

    int getWidth();

    boolean isEmpty();

    boolean isStencil();

    void setBitsPerComponent(int i10);

    void setColorSpace(PDColorSpace pDColorSpace);

    void setDecode(COSArray cOSArray);

    void setHeight(int i10);

    void setInterpolate(boolean z10);

    void setStencil(boolean z10);

    void setWidth(int i10);
}
