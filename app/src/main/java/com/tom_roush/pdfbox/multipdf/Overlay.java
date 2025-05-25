package com.tom_roush.pdfbox.multipdf;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDPageTree;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lib.zj.office.fc.codec.CharEncoding;

/* loaded from: classes2.dex */
public class Overlay implements Closeable {
    private LayoutPage defaultOverlayPage;
    private LayoutPage evenPageOverlayPage;
    private LayoutPage firstPageOverlayPage;
    private LayoutPage lastPageOverlayPage;
    private LayoutPage oddPageOverlayPage;
    private final Set<PDDocument> openDocuments = new HashSet();
    private Map<Integer, LayoutPage> specificPageOverlayPage = new HashMap();
    private Position position = Position.BACKGROUND;
    private String inputFileName = null;
    private PDDocument inputPDFDocument = null;
    private String defaultOverlayFilename = null;
    private PDDocument defaultOverlay = null;
    private String firstPageOverlayFilename = null;
    private PDDocument firstPageOverlay = null;
    private String lastPageOverlayFilename = null;
    private PDDocument lastPageOverlay = null;
    private String allPagesOverlayFilename = null;
    private PDDocument allPagesOverlay = null;
    private String oddPageOverlayFilename = null;
    private PDDocument oddPageOverlay = null;
    private String evenPageOverlayFilename = null;
    private PDDocument evenPageOverlay = null;
    private int numberOfOverlayPages = 0;
    private boolean useAllOverlayPages = false;

    /* renamed from: com.tom_roush.pdfbox.multipdf.Overlay$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tom_roush$pdfbox$multipdf$Overlay$Position;

        static {
            int[] iArr = new int[Position.values().length];
            $SwitchMap$com$tom_roush$pdfbox$multipdf$Overlay$Position = iArr;
            try {
                iArr[Position.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tom_roush$pdfbox$multipdf$Overlay$Position[Position.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class LayoutPage {
        private final COSStream overlayContentStream;
        private final PDRectangle overlayMediaBox;
        private final COSDictionary overlayResources;
        private final int overlayRotation;

        public /* synthetic */ LayoutPage(PDRectangle pDRectangle, COSStream cOSStream, COSDictionary cOSDictionary, int i10, int i11) {
            this(pDRectangle, cOSStream, cOSDictionary, i10);
        }

        private LayoutPage(PDRectangle pDRectangle, COSStream cOSStream, COSDictionary cOSDictionary, int i10) {
            this.overlayMediaBox = pDRectangle;
            this.overlayContentStream = cOSStream;
            this.overlayResources = cOSDictionary;
            this.overlayRotation = i10;
        }
    }

    /* loaded from: classes2.dex */
    public enum Position {
        FOREGROUND,
        BACKGROUND
    }

    private void addOriginalContent(COSBase cOSBase, COSArray cOSArray) {
        if (cOSBase == null) {
            return;
        }
        if (cOSBase instanceof COSStream) {
            cOSArray.add(cOSBase);
        } else if (cOSBase instanceof COSArray) {
            cOSArray.addAll((COSArray) cOSBase);
        } else {
            throw new IOException("Unknown content type: ".concat(cOSBase.getClass().getName()));
        }
    }

    private COSStream createCombinedContentStream(COSBase cOSBase) {
        List<COSStream> createContentStreamList = createContentStreamList(cOSBase);
        COSStream createCOSStream = this.inputPDFDocument.getDocument().createCOSStream();
        OutputStream createOutputStream = createCOSStream.createOutputStream(COSName.FLATE_DECODE);
        for (COSStream cOSStream : createContentStreamList) {
            COSInputStream createInputStream = cOSStream.createInputStream();
            IOUtils.copy(createInputStream, createOutputStream);
            createOutputStream.flush();
            createInputStream.close();
        }
        createOutputStream.close();
        return createCOSStream;
    }

    private List<COSStream> createContentStreamList(COSBase cOSBase) {
        ArrayList arrayList = new ArrayList();
        if (cOSBase == null) {
            return arrayList;
        }
        if (cOSBase instanceof COSStream) {
            arrayList.add((COSStream) cOSBase);
        } else if (cOSBase instanceof COSArray) {
            Iterator<COSBase> it = ((COSArray) cOSBase).iterator();
            while (it.hasNext()) {
                arrayList.addAll(createContentStreamList(it.next()));
            }
        } else if (cOSBase instanceof COSObject) {
            arrayList.addAll(createContentStreamList(((COSObject) cOSBase).getObject()));
        } else {
            throw new IOException("Unknown content type: ".concat(cOSBase.getClass().getName()));
        }
        return arrayList;
    }

    private COSStream createOverlayStream(PDPage pDPage, LayoutPage layoutPage, COSName cOSName) {
        StringBuilder sb2 = new StringBuilder("q\nq\n");
        PDRectangle pDRectangle = new PDRectangle(layoutPage.overlayMediaBox.getCOSArray());
        if (layoutPage.overlayRotation == 90 || layoutPage.overlayRotation == 270) {
            pDRectangle.setLowerLeftX(layoutPage.overlayMediaBox.getLowerLeftY());
            pDRectangle.setLowerLeftY(layoutPage.overlayMediaBox.getLowerLeftX());
            pDRectangle.setUpperRightX(layoutPage.overlayMediaBox.getUpperRightY());
            pDRectangle.setUpperRightY(layoutPage.overlayMediaBox.getUpperRightX());
        }
        AffineTransform calculateAffineTransform = calculateAffineTransform(pDPage, pDRectangle);
        double[] dArr = new double[6];
        calculateAffineTransform.getMatrix(dArr);
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append(float2String((float) dArr[i10]));
            sb2.append(" ");
        }
        sb2.append(" cm\n /");
        sb2.append(cOSName.getName());
        sb2.append(" Do Q\nQ\n");
        return createStream(sb2.toString());
    }

    private COSName createOverlayXObject(PDPage pDPage, LayoutPage layoutPage) {
        PDFormXObject pDFormXObject = new PDFormXObject(layoutPage.overlayContentStream);
        pDFormXObject.setResources(new PDResources(layoutPage.overlayResources));
        pDFormXObject.setFormType(1);
        pDFormXObject.setBBox(layoutPage.overlayMediaBox.createRetranslatedRectangle());
        AffineTransform affineTransform = new AffineTransform();
        int i10 = layoutPage.overlayRotation;
        if (i10 != 90) {
            if (i10 != 180) {
                if (i10 == 270) {
                    affineTransform.translate(layoutPage.overlayMediaBox.getHeight(), 0.0d);
                    affineTransform.rotate(Math.toRadians(-270.0d));
                }
            } else {
                affineTransform.translate(layoutPage.overlayMediaBox.getWidth(), layoutPage.overlayMediaBox.getHeight());
                affineTransform.rotate(Math.toRadians(-180.0d));
            }
        } else {
            affineTransform.translate(0.0d, layoutPage.overlayMediaBox.getWidth());
            affineTransform.rotate(Math.toRadians(-90.0d));
        }
        pDFormXObject.setMatrix(affineTransform);
        return pDPage.getResources().add(pDFormXObject, "OL");
    }

    private COSStream createStream(String str) {
        COSName cOSName;
        COSStream createCOSStream = this.inputPDFDocument.getDocument().createCOSStream();
        if (str.length() > 20) {
            cOSName = COSName.FLATE_DECODE;
        } else {
            cOSName = null;
        }
        OutputStream createOutputStream = createCOSStream.createOutputStream(cOSName);
        createOutputStream.write(str.getBytes(CharEncoding.ISO_8859_1));
        createOutputStream.close();
        return createCOSStream;
    }

    private String float2String(float f10) {
        String plainString = new BigDecimal(String.valueOf(f10)).toPlainString();
        if (plainString.indexOf(46) > -1 && !plainString.endsWith(".0")) {
            while (plainString.endsWith(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES) && !plainString.endsWith(".0")) {
                plainString = plainString.substring(0, plainString.length() - 1);
            }
        }
        return plainString;
    }

    private LayoutPage getLayoutPage(PDDocument pDDocument) {
        PDPage page = pDDocument.getPage(0);
        COSBase dictionaryObject = page.getCOSObject().getDictionaryObject(COSName.CONTENTS);
        PDResources resources = page.getResources();
        if (resources == null) {
            resources = new PDResources();
        }
        return new LayoutPage(page.getMediaBox(), createCombinedContentStream(dictionaryObject), resources.getCOSObject(), page.getRotation(), 0);
    }

    private Map<Integer, LayoutPage> getLayoutPages(PDDocument pDDocument) {
        int numberOfPages = pDDocument.getNumberOfPages();
        HashMap hashMap = new HashMap(numberOfPages);
        for (int i10 = 0; i10 < numberOfPages; i10++) {
            PDPage page = pDDocument.getPage(i10);
            COSBase dictionaryObject = page.getCOSObject().getDictionaryObject(COSName.CONTENTS);
            PDResources resources = page.getResources();
            if (resources == null) {
                resources = new PDResources();
            }
            hashMap.put(Integer.valueOf(i10), new LayoutPage(page.getMediaBox(), createCombinedContentStream(dictionaryObject), resources.getCOSObject(), page.getRotation(), 0));
        }
        return hashMap;
    }

    private PDDocument loadPDF(String str) {
        return PDDocument.load(new File(str));
    }

    private void loadPDFs() {
        String str = this.inputFileName;
        if (str != null) {
            this.inputPDFDocument = loadPDF(str);
        }
        String str2 = this.defaultOverlayFilename;
        if (str2 != null) {
            this.defaultOverlay = loadPDF(str2);
        }
        PDDocument pDDocument = this.defaultOverlay;
        if (pDDocument != null) {
            this.defaultOverlayPage = getLayoutPage(pDDocument);
        }
        String str3 = this.firstPageOverlayFilename;
        if (str3 != null) {
            this.firstPageOverlay = loadPDF(str3);
        }
        PDDocument pDDocument2 = this.firstPageOverlay;
        if (pDDocument2 != null) {
            this.firstPageOverlayPage = getLayoutPage(pDDocument2);
        }
        String str4 = this.lastPageOverlayFilename;
        if (str4 != null) {
            this.lastPageOverlay = loadPDF(str4);
        }
        PDDocument pDDocument3 = this.lastPageOverlay;
        if (pDDocument3 != null) {
            this.lastPageOverlayPage = getLayoutPage(pDDocument3);
        }
        String str5 = this.oddPageOverlayFilename;
        if (str5 != null) {
            this.oddPageOverlay = loadPDF(str5);
        }
        PDDocument pDDocument4 = this.oddPageOverlay;
        if (pDDocument4 != null) {
            this.oddPageOverlayPage = getLayoutPage(pDDocument4);
        }
        String str6 = this.evenPageOverlayFilename;
        if (str6 != null) {
            this.evenPageOverlay = loadPDF(str6);
        }
        PDDocument pDDocument5 = this.evenPageOverlay;
        if (pDDocument5 != null) {
            this.evenPageOverlayPage = getLayoutPage(pDDocument5);
        }
        String str7 = this.allPagesOverlayFilename;
        if (str7 != null) {
            this.allPagesOverlay = loadPDF(str7);
        }
        PDDocument pDDocument6 = this.allPagesOverlay;
        if (pDDocument6 != null) {
            Map<Integer, LayoutPage> layoutPages = getLayoutPages(pDDocument6);
            this.specificPageOverlayPage = layoutPages;
            this.useAllOverlayPages = true;
            this.numberOfOverlayPages = layoutPages.size();
        }
    }

    private void overlayPage(PDPage pDPage, LayoutPage layoutPage, COSArray cOSArray) {
        if (pDPage.getResources() == null) {
            pDPage.setResources(new PDResources());
        }
        cOSArray.add((COSBase) createOverlayStream(pDPage, layoutPage, createOverlayXObject(pDPage, layoutPage)));
    }

    private void processPages(PDDocument pDDocument) {
        PDPageTree pages = pDDocument.getPages();
        int count = pages.getCount();
        Iterator<PDPage> it = pages.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            PDPage next = it.next();
            i10++;
            LayoutPage layoutPage = getLayoutPage(i10, count);
            if (layoutPage != null) {
                COSDictionary cOSObject = next.getCOSObject();
                COSName cOSName = COSName.CONTENTS;
                COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
                COSArray cOSArray = new COSArray();
                int i11 = AnonymousClass1.$SwitchMap$com$tom_roush$pdfbox$multipdf$Overlay$Position[this.position.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        overlayPage(next, layoutPage, cOSArray);
                        addOriginalContent(dictionaryObject, cOSArray);
                    } else {
                        throw new IOException("Unknown type of position:" + this.position);
                    }
                } else {
                    cOSArray.add((COSBase) createStream("q\n"));
                    addOriginalContent(dictionaryObject, cOSArray);
                    cOSArray.add((COSBase) createStream("Q\n"));
                    overlayPage(next, layoutPage, cOSArray);
                }
                cOSObject.setItem(cOSName, (COSBase) cOSArray);
            }
        }
    }

    public AffineTransform calculateAffineTransform(PDPage pDPage, PDRectangle pDRectangle) {
        AffineTransform affineTransform = new AffineTransform();
        PDRectangle mediaBox = pDPage.getMediaBox();
        affineTransform.translate((mediaBox.getWidth() - pDRectangle.getWidth()) / 2.0f, (mediaBox.getHeight() - pDRectangle.getHeight()) / 2.0f);
        return affineTransform;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        PDDocument pDDocument = this.defaultOverlay;
        if (pDDocument != null) {
            pDDocument.close();
        }
        PDDocument pDDocument2 = this.firstPageOverlay;
        if (pDDocument2 != null) {
            pDDocument2.close();
        }
        PDDocument pDDocument3 = this.lastPageOverlay;
        if (pDDocument3 != null) {
            pDDocument3.close();
        }
        PDDocument pDDocument4 = this.allPagesOverlay;
        if (pDDocument4 != null) {
            pDDocument4.close();
        }
        PDDocument pDDocument5 = this.oddPageOverlay;
        if (pDDocument5 != null) {
            pDDocument5.close();
        }
        PDDocument pDDocument6 = this.evenPageOverlay;
        if (pDDocument6 != null) {
            pDDocument6.close();
        }
        for (PDDocument pDDocument7 : this.openDocuments) {
            pDDocument7.close();
        }
        this.openDocuments.clear();
        this.specificPageOverlayPage.clear();
    }

    public String getDefaultOverlayFile() {
        return this.defaultOverlayFilename;
    }

    public String getInputFile() {
        return this.inputFileName;
    }

    public PDDocument overlay(Map<Integer, String> map) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        loadPDFs();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            PDDocument pDDocument = (PDDocument) hashMap.get(entry.getValue());
            if (pDDocument == null) {
                pDDocument = loadPDF(entry.getValue());
                hashMap.put(entry.getValue(), pDDocument);
                hashMap2.put(pDDocument, getLayoutPage(pDDocument));
            }
            this.openDocuments.add(pDDocument);
            this.specificPageOverlayPage.put(entry.getKey(), (LayoutPage) hashMap2.get(pDDocument));
        }
        processPages(this.inputPDFDocument);
        return this.inputPDFDocument;
    }

    public PDDocument overlayDocuments(Map<Integer, PDDocument> map) {
        loadPDFs();
        for (Map.Entry<Integer, PDDocument> entry : map.entrySet()) {
            PDDocument value = entry.getValue();
            if (value != null) {
                this.specificPageOverlayPage.put(entry.getKey(), getLayoutPage(value));
            }
        }
        processPages(this.inputPDFDocument);
        return this.inputPDFDocument;
    }

    public void setAllPagesOverlayFile(String str) {
        this.allPagesOverlayFilename = str;
    }

    public void setAllPagesOverlayPDF(PDDocument pDDocument) {
        this.allPagesOverlay = pDDocument;
    }

    public void setDefaultOverlayFile(String str) {
        this.defaultOverlayFilename = str;
    }

    public void setDefaultOverlayPDF(PDDocument pDDocument) {
        this.defaultOverlay = pDDocument;
    }

    public void setEvenPageOverlayFile(String str) {
        this.evenPageOverlayFilename = str;
    }

    public void setEvenPageOverlayPDF(PDDocument pDDocument) {
        this.evenPageOverlay = pDDocument;
    }

    public void setFirstPageOverlayFile(String str) {
        this.firstPageOverlayFilename = str;
    }

    public void setFirstPageOverlayPDF(PDDocument pDDocument) {
        this.firstPageOverlay = pDDocument;
    }

    public void setInputFile(String str) {
        this.inputFileName = str;
    }

    public void setInputPDF(PDDocument pDDocument) {
        this.inputPDFDocument = pDDocument;
    }

    public void setLastPageOverlayFile(String str) {
        this.lastPageOverlayFilename = str;
    }

    public void setLastPageOverlayPDF(PDDocument pDDocument) {
        this.lastPageOverlay = pDDocument;
    }

    public void setOddPageOverlayFile(String str) {
        this.oddPageOverlayFilename = str;
    }

    public void setOddPageOverlayPDF(PDDocument pDDocument) {
        this.oddPageOverlay = pDDocument;
    }

    public void setOverlayPosition(Position position) {
        this.position = position;
    }

    private LayoutPage getLayoutPage(int i10, int i11) {
        LayoutPage layoutPage;
        LayoutPage layoutPage2;
        if (this.useAllOverlayPages || !this.specificPageOverlayPage.containsKey(Integer.valueOf(i10))) {
            if (i10 != 1 || (layoutPage2 = this.firstPageOverlayPage) == null) {
                if (i10 != i11 || (layoutPage = this.lastPageOverlayPage) == null) {
                    int i12 = i10 % 2;
                    if (i12 != 1 || (layoutPage2 = this.oddPageOverlayPage) == null) {
                        if ((i12 != 0 || (layoutPage = this.evenPageOverlayPage) == null) && (layoutPage = this.defaultOverlayPage) == null) {
                            if (this.useAllOverlayPages) {
                                return this.specificPageOverlayPage.get(Integer.valueOf((i10 - 1) % this.numberOfOverlayPages));
                            }
                            return null;
                        }
                    }
                }
                return layoutPage;
            }
            return layoutPage2;
        }
        return this.specificPageOverlayPage.get(Integer.valueOf(i10));
    }
}
