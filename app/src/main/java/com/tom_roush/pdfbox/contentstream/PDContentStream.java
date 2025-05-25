package com.tom_roush.pdfbox.contentstream;

import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.InputStream;

/* loaded from: classes2.dex */
public interface PDContentStream {
    PDRectangle getBBox();

    InputStream getContents();

    Matrix getMatrix();

    PDResources getResources();
}
