package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.fontbox.util.Charsets;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdfparser.PDFStreamParser;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import java.io.IOException;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class PDFreeTextAppearanceHandler extends PDAbstractAppearanceHandler {
    private static final Pattern COLOR_PATTERN = Pattern.compile(".*color\\:\\s*\\#([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]).*");
    private COSName fontName;
    private float fontSize;

    public PDFreeTextAppearanceHandler(PDAnnotation pDAnnotation) {
        super(pDAnnotation);
        this.fontSize = 10.0f;
        this.fontName = COSName.HELV;
    }

    private void extractFontDetails(PDAnnotationMarkup pDAnnotationMarkup) {
        PDDocument pDDocument;
        String defaultAppearance = pDAnnotationMarkup.getDefaultAppearance();
        if (defaultAppearance == null && (pDDocument = this.document) != null && pDDocument.getDocumentCatalog().getAcroForm() != null) {
            defaultAppearance = this.document.getDocumentCatalog().getAcroForm().getDefaultAppearance();
        }
        if (defaultAppearance == null) {
            return;
        }
        try {
            PDFStreamParser pDFStreamParser = new PDFStreamParser(defaultAppearance.getBytes(Charsets.US_ASCII));
            COSArray cOSArray = new COSArray();
            COSArray cOSArray2 = new COSArray();
            while (true) {
                Object parseNextToken = pDFStreamParser.parseNextToken();
                if (parseNextToken == null) {
                    break;
                } else if (parseNextToken instanceof Operator) {
                    if (!OperatorName.SET_FONT_AND_SIZE.equals(((Operator) parseNextToken).getName())) {
                        cOSArray = cOSArray2;
                    }
                    cOSArray2 = cOSArray;
                    cOSArray = new COSArray();
                } else {
                    cOSArray.add((COSBase) parseNextToken);
                }
            }
            if (cOSArray2.size() >= 2) {
                COSBase cOSBase = cOSArray2.get(0);
                if (cOSBase instanceof COSName) {
                    this.fontName = (COSName) cOSBase;
                }
                COSBase cOSBase2 = cOSArray2.get(1);
                if (cOSBase2 instanceof COSNumber) {
                    this.fontSize = ((COSNumber) cOSBase2).floatValue();
                }
            }
        } catch (IOException unused) {
        }
    }

    private PDColor extractNonStrokingColor(PDAnnotationMarkup pDAnnotationMarkup) {
        PDColor pDColor;
        PDColor pDColor2 = new PDColor(new float[]{0.0f}, PDDeviceGray.INSTANCE);
        String defaultAppearance = pDAnnotationMarkup.getDefaultAppearance();
        if (defaultAppearance == null) {
            return pDColor2;
        }
        try {
            PDFStreamParser pDFStreamParser = new PDFStreamParser(defaultAppearance.getBytes(Charsets.US_ASCII));
            COSArray cOSArray = new COSArray();
            Operator operator = null;
            COSArray cOSArray2 = null;
            for (Object parseNextToken = pDFStreamParser.parseNextToken(); parseNextToken != null; parseNextToken = pDFStreamParser.parseNextToken()) {
                if (parseNextToken instanceof Operator) {
                    Operator operator2 = (Operator) parseNextToken;
                    String name = operator2.getName();
                    if (!OperatorName.NON_STROKING_GRAY.equals(name) && !OperatorName.NON_STROKING_RGB.equals(name) && !OperatorName.NON_STROKING_CMYK.equals(name)) {
                        cOSArray = cOSArray2;
                        cOSArray2 = cOSArray;
                        cOSArray = new COSArray();
                    }
                    operator = operator2;
                    cOSArray2 = cOSArray;
                    cOSArray = new COSArray();
                } else {
                    cOSArray.add((COSBase) parseNextToken);
                }
            }
            if (operator != null) {
                String name2 = operator.getName();
                if (OperatorName.NON_STROKING_GRAY.equals(name2)) {
                    pDColor = new PDColor(cOSArray2, PDDeviceGray.INSTANCE);
                } else if (OperatorName.NON_STROKING_RGB.equals(name2)) {
                    pDColor = new PDColor(cOSArray2, PDDeviceRGB.INSTANCE);
                } else {
                    OperatorName.NON_STROKING_CMYK.equals(name2);
                    return pDColor2;
                }
                return pDColor;
            }
            return pDColor2;
        } catch (IOException unused) {
            return pDColor2;
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateAppearanceStreams() {
        generateNormalAppearance();
        generateRolloverAppearance();
        generateDownAppearance();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:10|11|12|13|(2:15|(29:17|18|(1:20)|21|(6:24|25|26|(4:28|(2:30|(1:32))(1:36)|33|34)(2:37|38)|35|22)|51|52|(1:54)|55|(1:138)(3:61|(1:63)(1:137)|64)|65|66|(1:135)(6:70|71|72|73|74|75)|76|(14:80|81|(11:85|86|(1:94)|95|(2:97|(1:(1:100)(1:124))(1:125))(1:126)|101|(4:103|104|105|106)|116|(4:118|(2:121|119)|122|123)|43|44)|127|86|(4:88|90|92|94)|95|(0)(0)|101|(0)|116|(0)|43|44)|128|81|(11:85|86|(0)|95|(0)(0)|101|(0)|116|(0)|43|44)|127|86|(0)|95|(0)(0)|101|(0)|116|(0)|43|44))|140|18|(0)|21|(1:22)|51|52|(0)|55|(1:57)|138|65|66|(1:68)|135|76|(14:80|81|(0)|127|86|(0)|95|(0)(0)|101|(0)|116|(0)|43|44)|128|81|(0)|127|86|(0)|95|(0)(0)|101|(0)|116|(0)|43|44|(2:(0)|(1:112))) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03eb, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0372 A[Catch: IOException -> 0x03eb, all -> 0x0409, TryCatch #6 {all -> 0x0409, blocks: (B:135:0x0402, B:61:0x01ae, B:67:0x020f, B:71:0x0234, B:73:0x023d, B:77:0x024b, B:79:0x025d, B:81:0x0264, B:83:0x026e, B:85:0x027e, B:93:0x0292, B:97:0x0303, B:99:0x0311, B:101:0x035d, B:109:0x036b, B:110:0x036e, B:111:0x036f, B:113:0x0372, B:114:0x037e, B:116:0x0383, B:117:0x039e, B:94:0x02ad, B:95:0x02c9, B:96:0x02e7, B:78:0x0254, B:72:0x0239, B:66:0x01df), top: B:144:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098 A[Catch: all -> 0x03f5, IOException -> 0x03f9, TryCatch #12 {IOException -> 0x03f9, all -> 0x03f5, blocks: (B:14:0x0037, B:16:0x0057, B:18:0x0063, B:20:0x0093, B:22:0x0098, B:23:0x009b, B:24:0x00a1), top: B:146:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c A[Catch: all -> 0x03ed, IOException -> 0x03f1, TryCatch #11 {IOException -> 0x03f1, all -> 0x03ed, blocks: (B:27:0x00a8, B:29:0x00b0, B:31:0x00bc, B:33:0x00e2, B:35:0x00f1, B:37:0x00fb, B:36:0x00f5, B:38:0x0106, B:40:0x010c, B:41:0x010f, B:43:0x0119, B:45:0x0125, B:47:0x0129, B:49:0x0143, B:51:0x015a, B:53:0x0176, B:55:0x017e, B:57:0x018a, B:50:0x0153), top: B:148:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0248 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0264 A[Catch: IOException -> 0x03eb, all -> 0x0409, TryCatch #6 {all -> 0x0409, blocks: (B:135:0x0402, B:61:0x01ae, B:67:0x020f, B:71:0x0234, B:73:0x023d, B:77:0x024b, B:79:0x025d, B:81:0x0264, B:83:0x026e, B:85:0x027e, B:93:0x0292, B:97:0x0303, B:99:0x0311, B:101:0x035d, B:109:0x036b, B:110:0x036e, B:111:0x036f, B:113:0x0372, B:114:0x037e, B:116:0x0383, B:117:0x039e, B:94:0x02ad, B:95:0x02c9, B:96:0x02e7, B:78:0x0254, B:72:0x0239, B:66:0x01df), top: B:144:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e7 A[Catch: IOException -> 0x03eb, all -> 0x0409, TryCatch #6 {all -> 0x0409, blocks: (B:135:0x0402, B:61:0x01ae, B:67:0x020f, B:71:0x0234, B:73:0x023d, B:77:0x024b, B:79:0x025d, B:81:0x0264, B:83:0x026e, B:85:0x027e, B:93:0x0292, B:97:0x0303, B:99:0x0311, B:101:0x035d, B:109:0x036b, B:110:0x036e, B:111:0x036f, B:113:0x0372, B:114:0x037e, B:116:0x0383, B:117:0x039e, B:94:0x02ad, B:95:0x02c9, B:96:0x02e7, B:78:0x0254, B:72:0x0239, B:66:0x01df), top: B:144:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0311 A[Catch: IOException -> 0x03eb, all -> 0x0409, TRY_LEAVE, TryCatch #6 {all -> 0x0409, blocks: (B:135:0x0402, B:61:0x01ae, B:67:0x020f, B:71:0x0234, B:73:0x023d, B:77:0x024b, B:79:0x025d, B:81:0x0264, B:83:0x026e, B:85:0x027e, B:93:0x0292, B:97:0x0303, B:99:0x0311, B:101:0x035d, B:109:0x036b, B:110:0x036e, B:111:0x036f, B:113:0x0372, B:114:0x037e, B:116:0x0383, B:117:0x039e, B:94:0x02ad, B:95:0x02c9, B:96:0x02e7, B:78:0x0254, B:72:0x0239, B:66:0x01df), top: B:144:0x0033 }] */
    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void generateNormalAppearance() {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDFreeTextAppearanceHandler.generateNormalAppearance():void");
    }

    public PDFreeTextAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
        this.fontSize = 10.0f;
        this.fontName = COSName.HELV;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }
}
