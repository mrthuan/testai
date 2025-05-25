package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible;

import android.graphics.Bitmap;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDSignatureField;

/* loaded from: classes2.dex */
public interface PDFTemplateBuilder {
    void closeTemplate(PDDocument pDDocument);

    void createAcroForm(PDDocument pDDocument);

    void createAcroFormDictionary(PDAcroForm pDAcroForm, PDSignatureField pDSignatureField);

    void createAffineTransform(AffineTransform affineTransform);

    @Deprecated
    void createAffineTransform(byte[] bArr);

    void createAppearanceDictionary(PDFormXObject pDFormXObject, PDSignatureField pDSignatureField);

    void createBackgroundLayerForm(PDResources pDResources, PDRectangle pDRectangle);

    @Deprecated
    void createFormatterRectangle(byte[] bArr);

    void createFormatterRectangle(int[] iArr);

    void createHolderForm(PDResources pDResources, PDStream pDStream, PDRectangle pDRectangle);

    void createHolderFormResources();

    void createHolderFormStream(PDDocument pDDocument);

    void createImageForm(PDResources pDResources, PDResources pDResources2, PDStream pDStream, PDRectangle pDRectangle, AffineTransform affineTransform, PDImageXObject pDImageXObject);

    void createImageFormResources();

    void createImageFormStream(PDDocument pDDocument);

    void createInnerForm(PDResources pDResources, PDStream pDStream, PDRectangle pDRectangle);

    void createInnerFormResource();

    void createInnerFormStream(PDDocument pDDocument);

    void createPage(PDVisibleSignDesigner pDVisibleSignDesigner);

    void createProcSetArray();

    void createSignature(PDSignatureField pDSignatureField, PDPage pDPage, String str);

    void createSignatureField(PDAcroForm pDAcroForm);

    void createSignatureImage(PDDocument pDDocument, Bitmap bitmap);

    void createSignatureRectangle(PDSignatureField pDSignatureField, PDVisibleSignDesigner pDVisibleSignDesigner);

    void createTemplate(PDPage pDPage);

    void createVisualSignature(PDDocument pDDocument);

    void createWidgetDictionary(PDSignatureField pDSignatureField, PDResources pDResources);

    PDFTemplateStructure getStructure();

    void injectAppearanceStreams(PDStream pDStream, PDStream pDStream2, PDStream pDStream3, COSName cOSName, COSName cOSName2, COSName cOSName3, PDVisibleSignDesigner pDVisibleSignDesigner);

    void injectProcSetArray(PDFormXObject pDFormXObject, PDPage pDPage, PDResources pDResources, PDResources pDResources2, PDResources pDResources3, COSArray cOSArray);

    void insertInnerFormToHolderResources(PDFormXObject pDFormXObject, PDResources pDResources);
}
