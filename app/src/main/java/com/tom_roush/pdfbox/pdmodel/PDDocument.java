package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.io.MemoryUsageSetting;
import com.tom_roush.pdfbox.io.RandomAccessBuffer;
import com.tom_roush.pdfbox.io.RandomAccessBufferedFileInputStream;
import com.tom_roush.pdfbox.io.RandomAccessRead;
import com.tom_roush.pdfbox.io.ScratchFile;
import com.tom_roush.pdfbox.pdfparser.PDFParser;
import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import com.tom_roush.pdfbox.pdmodel.encryption.AccessPermission;
import com.tom_roush.pdfbox.pdmodel.encryption.PDEncryption;
import com.tom_roush.pdfbox.pdmodel.encryption.ProtectionPolicy;
import com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandler;
import com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandlerFactory;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.ExternalSigningSupport;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.PDSignature;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.SignatureInterface;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.SigningSupport;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDField;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDSignatureField;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class PDDocument implements Closeable {
    private static final int[] RESERVE_BYTE_RANGE = {0, 1000000000, 1000000000, 1000000000};
    private AccessPermission accessPermission;
    private boolean allSecurityToBeRemoved;
    private final COSDocument document;
    private PDDocumentCatalog documentCatalog;
    private Long documentId;
    private PDDocumentInformation documentInformation;
    private PDEncryption encryption;
    private final Set<TrueTypeFont> fontsToClose;
    private final Set<PDFont> fontsToSubset;
    private final RandomAccessRead pdfSource;
    private ResourceCache resourceCache;
    private SignatureInterface signInterface;
    private boolean signatureAdded;
    private SigningSupport signingSupport;

    static {
        PDDeviceRGB.INSTANCE.toRGB(new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        try {
            COSNumber.get(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
            COSNumber.get("1");
        } catch (IOException unused) {
        }
    }

    public PDDocument() {
        this(MemoryUsageSetting.setupMainMemoryOnly());
    }

    private void assignAcroFormDefaultResource(PDAcroForm pDAcroForm, COSDictionary cOSDictionary) {
        COSName cOSName = COSName.DR;
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSDictionary) {
            COSDictionary cOSDictionary2 = (COSDictionary) dictionaryObject;
            PDResources defaultResources = pDAcroForm.getDefaultResources();
            if (defaultResources == null) {
                pDAcroForm.getCOSObject().setItem(cOSName, (COSBase) cOSDictionary2);
                cOSDictionary2.setDirect(true);
                cOSDictionary2.setNeedToBeUpdated(true);
                return;
            }
            COSDictionary cOSObject = defaultResources.getCOSObject();
            COSName cOSName2 = COSName.XOBJECT;
            COSBase item = cOSDictionary2.getItem(cOSName2);
            COSBase item2 = cOSObject.getItem(cOSName2);
            if ((item instanceof COSDictionary) && (item2 instanceof COSDictionary)) {
                ((COSDictionary) item2).addAll((COSDictionary) item);
                cOSObject.setNeedToBeUpdated(true);
            }
        }
    }

    private void assignAppearanceDictionary(PDSignatureField pDSignatureField, COSDictionary cOSDictionary) {
        PDAppearanceDictionary pDAppearanceDictionary = new PDAppearanceDictionary(cOSDictionary);
        cOSDictionary.setDirect(true);
        pDSignatureField.getWidgets().get(0).setAppearance(pDAppearanceDictionary);
    }

    private void assignSignatureRectangle(PDSignatureField pDSignatureField, COSDictionary cOSDictionary) {
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(COSName.RECT);
        PDRectangle rectangle = pDSignatureField.getWidgets().get(0).getRectangle();
        if (rectangle == null || rectangle.getCOSArray().size() != 4) {
            pDSignatureField.getWidgets().get(0).setRectangle(new PDRectangle(cOSArray));
        }
    }

    private boolean checkSignatureAnnotation(List<PDAnnotation> list, PDAnnotationWidget pDAnnotationWidget) {
        for (PDAnnotation pDAnnotation : list) {
            if (pDAnnotation.getCOSObject().equals(pDAnnotationWidget.getCOSObject())) {
                return true;
            }
        }
        return false;
    }

    private boolean checkSignatureField(Iterator<PDField> it, PDSignatureField pDSignatureField) {
        while (it.hasNext()) {
            PDField next = it.next();
            if ((next instanceof PDSignatureField) && next.getCOSObject().equals(pDSignatureField.getCOSObject())) {
                return true;
            }
        }
        return false;
    }

    private PDSignatureField findSignatureField(Iterator<PDField> it, PDSignature pDSignature) {
        PDSignatureField pDSignatureField;
        PDSignature signature;
        while (it.hasNext()) {
            PDField next = it.next();
            if ((next instanceof PDSignatureField) && (signature = (pDSignatureField = (PDSignatureField) next).getSignature()) != null && signature.getCOSObject().equals(pDSignature.getCOSObject())) {
                return pDSignatureField;
            }
        }
        return null;
    }

    public static PDDocument load(File file) {
        return load(file, "", MemoryUsageSetting.setupMainMemoryOnly());
    }

    private void prepareNonVisibleSignature(PDSignatureField pDSignatureField) {
        pDSignatureField.getWidgets().get(0).setRectangle(new PDRectangle());
        PDAppearanceDictionary pDAppearanceDictionary = new PDAppearanceDictionary();
        PDAppearanceStream pDAppearanceStream = new PDAppearanceStream(this);
        pDAppearanceStream.setBBox(new PDRectangle());
        pDAppearanceDictionary.setNormalAppearance(pDAppearanceStream);
        pDSignatureField.getWidgets().get(0).setAppearance(pDAppearanceDictionary);
    }

    private void prepareVisibleSignature(PDSignatureField pDSignatureField, PDAcroForm pDAcroForm, COSDocument cOSDocument) {
        boolean z10 = true;
        boolean z11 = true;
        for (COSObject cOSObject : cOSDocument.getObjects()) {
            if (!z10 && !z11) {
                break;
            }
            COSBase object = cOSObject.getObject();
            if (object instanceof COSDictionary) {
                COSDictionary cOSDictionary = (COSDictionary) object;
                COSBase dictionaryObject = cOSDictionary.getDictionaryObject(COSName.TYPE);
                if (z10 && COSName.ANNOT.equals(dictionaryObject)) {
                    assignSignatureRectangle(pDSignatureField, cOSDictionary);
                    z10 = false;
                }
                COSBase dictionaryObject2 = cOSDictionary.getDictionaryObject(COSName.FT);
                COSBase dictionaryObject3 = cOSDictionary.getDictionaryObject(COSName.AP);
                if (z11 && COSName.SIG.equals(dictionaryObject2) && (dictionaryObject3 instanceof COSDictionary)) {
                    assignAppearanceDictionary(pDSignatureField, (COSDictionary) dictionaryObject3);
                    assignAcroFormDefaultResource(pDAcroForm, cOSDictionary);
                    z11 = false;
                }
            }
        }
        if (!z10 && !z11) {
            return;
        }
        throw new IllegalArgumentException("Template is missing required objects");
    }

    public void addPage(PDPage pDPage) {
        getPages().add(pDPage);
    }

    public void addSignature(PDSignature pDSignature) {
        addSignature(pDSignature, new SignatureOptions());
    }

    @Deprecated
    public void addSignatureField(List<PDSignatureField> list, SignatureInterface signatureInterface, SignatureOptions signatureOptions) {
        PDDocumentCatalog documentCatalog = getDocumentCatalog();
        documentCatalog.getCOSObject().setNeedToBeUpdated(true);
        PDAcroForm acroForm = documentCatalog.getAcroForm(null);
        if (acroForm == null) {
            acroForm = new PDAcroForm(this);
            documentCatalog.setAcroForm(acroForm);
        }
        COSDictionary cOSObject = acroForm.getCOSObject();
        cOSObject.setDirect(true);
        cOSObject.setNeedToBeUpdated(true);
        if (!acroForm.isSignaturesExist()) {
            acroForm.setSignaturesExist(true);
        }
        List<PDField> fields = acroForm.getFields();
        for (PDSignatureField pDSignatureField : list) {
            pDSignatureField.getCOSObject().setNeedToBeUpdated(true);
            if (checkSignatureField(acroForm.getFieldIterator(), pDSignatureField)) {
                pDSignatureField.getCOSObject().setNeedToBeUpdated(true);
            } else {
                fields.add(pDSignatureField);
            }
            if (pDSignatureField.getSignature() != null) {
                pDSignatureField.getCOSObject().setNeedToBeUpdated(true);
                addSignature(pDSignatureField.getSignature(), signatureInterface, signatureOptions);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.document.isClosed()) {
            SigningSupport signingSupport = this.signingSupport;
            IOException iOException = null;
            if (signingSupport != null) {
                iOException = IOUtils.closeAndLogException(signingSupport, "SigningSupport", null);
            }
            IOException closeAndLogException = IOUtils.closeAndLogException(this.document, "COSDocument", iOException);
            RandomAccessRead randomAccessRead = this.pdfSource;
            if (randomAccessRead != null) {
                closeAndLogException = IOUtils.closeAndLogException(randomAccessRead, "RandomAccessRead pdfSource", closeAndLogException);
            }
            for (TrueTypeFont trueTypeFont : this.fontsToClose) {
                closeAndLogException = IOUtils.closeAndLogException(trueTypeFont, "TrueTypeFont", closeAndLogException);
            }
            if (closeAndLogException != null) {
                throw closeAndLogException;
            }
        }
    }

    public AccessPermission getCurrentAccessPermission() {
        if (this.accessPermission == null) {
            this.accessPermission = AccessPermission.getOwnerAccessPermission();
        }
        return this.accessPermission;
    }

    public synchronized COSDocument getDocument() {
        return this.document;
    }

    public PDDocumentCatalog getDocumentCatalog() {
        if (this.documentCatalog == null) {
            COSBase dictionaryObject = this.document.getTrailer().getDictionaryObject(COSName.ROOT);
            if (dictionaryObject instanceof COSDictionary) {
                this.documentCatalog = new PDDocumentCatalog(this, (COSDictionary) dictionaryObject);
            } else {
                this.documentCatalog = new PDDocumentCatalog(this);
            }
        }
        return this.documentCatalog;
    }

    public Long getDocumentId() {
        return this.documentId;
    }

    public PDDocumentInformation getDocumentInformation() {
        if (this.documentInformation == null) {
            COSDictionary trailer = this.document.getTrailer();
            COSName cOSName = COSName.INFO;
            COSDictionary cOSDictionary = trailer.getCOSDictionary(cOSName);
            if (cOSDictionary == null) {
                cOSDictionary = new COSDictionary();
                trailer.setItem(cOSName, (COSBase) cOSDictionary);
            }
            this.documentInformation = new PDDocumentInformation(cOSDictionary);
        }
        return this.documentInformation;
    }

    public PDEncryption getEncryption() {
        if (this.encryption == null && isEncrypted()) {
            this.encryption = new PDEncryption(this.document.getEncryptionDictionary());
        }
        return this.encryption;
    }

    public Set<PDFont> getFontsToSubset() {
        return this.fontsToSubset;
    }

    public PDSignature getLastSignatureDictionary() {
        List<PDSignature> signatureDictionaries = getSignatureDictionaries();
        int size = signatureDictionaries.size();
        if (size > 0) {
            return signatureDictionaries.get(size - 1);
        }
        return null;
    }

    public int getNumberOfPages() {
        return getDocumentCatalog().getPages().getCount();
    }

    public PDPage getPage(int i10) {
        return getDocumentCatalog().getPages().get(i10);
    }

    public PDPageTree getPages() {
        return getDocumentCatalog().getPages();
    }

    public ResourceCache getResourceCache() {
        return this.resourceCache;
    }

    public List<PDSignature> getSignatureDictionaries() {
        ArrayList arrayList = new ArrayList();
        for (PDSignatureField pDSignatureField : getSignatureFields()) {
            COSBase dictionaryObject = pDSignatureField.getCOSObject().getDictionaryObject(COSName.V);
            if (dictionaryObject != null) {
                arrayList.add(new PDSignature((COSDictionary) dictionaryObject));
            }
        }
        return arrayList;
    }

    public List<PDSignatureField> getSignatureFields() {
        ArrayList arrayList = new ArrayList();
        PDAcroForm acroForm = getDocumentCatalog().getAcroForm(null);
        if (acroForm != null) {
            Iterator<PDField> it = acroForm.getFieldTree().iterator();
            while (it.hasNext()) {
                PDField next = it.next();
                if (next instanceof PDSignatureField) {
                    arrayList.add((PDSignatureField) next);
                }
            }
        }
        return arrayList;
    }

    public float getVersion() {
        float parseFloat;
        float version = getDocument().getVersion();
        if (version >= 1.4f) {
            String version2 = getDocumentCatalog().getVersion();
            if (version2 != null) {
                try {
                    parseFloat = Float.parseFloat(version2);
                } catch (NumberFormatException unused) {
                }
                return Math.max(parseFloat, version);
            }
            parseFloat = -1.0f;
            return Math.max(parseFloat, version);
        }
        return version;
    }

    public PDPage importPage(PDPage pDPage) {
        PDPage pDPage2 = new PDPage(new COSDictionary(pDPage.getCOSObject()), this.resourceCache);
        pDPage2.setContents(new PDStream(this, pDPage.getContents(), COSName.FLATE_DECODE));
        addPage(pDPage2);
        pDPage2.setCropBox(new PDRectangle(pDPage.getCropBox().getCOSArray()));
        pDPage2.setMediaBox(new PDRectangle(pDPage.getMediaBox().getCOSArray()));
        pDPage2.setRotation(pDPage.getRotation());
        if (pDPage.getResources() != null) {
            pDPage.getCOSObject().containsKey(COSName.RESOURCES);
        }
        return pDPage2;
    }

    public boolean isAllSecurityToBeRemoved() {
        return this.allSecurityToBeRemoved;
    }

    public boolean isEncrypted() {
        return this.document.isEncrypted();
    }

    public void protect(ProtectionPolicy protectionPolicy) {
        if (isAllSecurityToBeRemoved()) {
            setAllSecurityToBeRemoved(false);
        }
        if (!isEncrypted()) {
            this.encryption = new PDEncryption();
        }
        SecurityHandler newSecurityHandlerForPolicy = SecurityHandlerFactory.INSTANCE.newSecurityHandlerForPolicy(protectionPolicy);
        if (newSecurityHandlerForPolicy != null) {
            getEncryption().setSecurityHandler(newSecurityHandlerForPolicy);
            return;
        }
        throw new IOException("No security handler for policy " + protectionPolicy);
    }

    public void registerTrueTypeFontForClosing(TrueTypeFont trueTypeFont) {
        this.fontsToClose.add(trueTypeFont);
    }

    public void removePage(PDPage pDPage) {
        getPages().remove(pDPage);
    }

    public void save(String str) {
        save(new File(str));
    }

    public void saveIncremental(OutputStream outputStream) {
        COSWriter cOSWriter = null;
        try {
            if (this.pdfSource != null) {
                COSWriter cOSWriter2 = new COSWriter(outputStream, this.pdfSource);
                try {
                    cOSWriter2.write(this, this.signInterface);
                    cOSWriter2.close();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    cOSWriter = cOSWriter2;
                    if (cOSWriter != null) {
                        cOSWriter.close();
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("document was not loaded from a file or a stream");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public ExternalSigningSupport saveIncrementalForExternalSigning(OutputStream outputStream) {
        if (this.pdfSource != null) {
            Iterator<PDSignature> it = getSignatureDictionaries().iterator();
            PDSignature pDSignature = null;
            while (it.hasNext()) {
                pDSignature = it.next();
                if (pDSignature.getCOSObject().isNeedToBeUpdated()) {
                    break;
                }
            }
            if (Arrays.equals(pDSignature.getByteRange(), RESERVE_BYTE_RANGE)) {
                COSWriter cOSWriter = new COSWriter(outputStream, this.pdfSource);
                cOSWriter.write(this);
                SigningSupport signingSupport = new SigningSupport(cOSWriter);
                this.signingSupport = signingSupport;
                return signingSupport;
            }
            throw new IllegalStateException("signature reserve byte range has been changed after addSignature(), please set the byte range that existed after addSignature()");
        }
        throw new IllegalStateException("document was not loaded from a file or a stream");
    }

    public void setAllSecurityToBeRemoved(boolean z10) {
        this.allSecurityToBeRemoved = z10;
    }

    public void setDocumentId(Long l10) {
        this.documentId = l10;
    }

    public void setDocumentInformation(PDDocumentInformation pDDocumentInformation) {
        this.documentInformation = pDDocumentInformation;
        this.document.getTrailer().setItem(COSName.INFO, (COSBase) pDDocumentInformation.getCOSObject());
    }

    public void setEncryptionDictionary(PDEncryption pDEncryption) {
        this.encryption = pDEncryption;
    }

    public void setResourceCache(ResourceCache resourceCache) {
        this.resourceCache = resourceCache;
    }

    public void setVersion(float f10) {
        float version = getVersion();
        if (f10 == version || f10 < version) {
            return;
        }
        if (getDocument().getVersion() >= 1.4f) {
            getDocumentCatalog().setVersion(Float.toString(f10));
        } else {
            getDocument().setVersion(f10);
        }
    }

    public PDDocument(MemoryUsageSetting memoryUsageSetting) {
        ScratchFile scratchFile;
        this.fontsToSubset = new HashSet();
        this.fontsToClose = new HashSet();
        this.resourceCache = new DefaultResourceCache();
        this.signatureAdded = false;
        try {
            scratchFile = new ScratchFile(memoryUsageSetting);
        } catch (IOException e10) {
            e10.getMessage();
            try {
                scratchFile = new ScratchFile(MemoryUsageSetting.setupMainMemoryOnly());
            } catch (IOException unused) {
                scratchFile = null;
            }
        }
        COSDocument cOSDocument = new COSDocument(scratchFile);
        this.document = cOSDocument;
        this.pdfSource = null;
        COSDictionary cOSDictionary = new COSDictionary();
        cOSDocument.setTrailer(cOSDictionary);
        COSDictionary cOSDictionary2 = new COSDictionary();
        cOSDictionary.setItem(COSName.ROOT, (COSBase) cOSDictionary2);
        COSName cOSName = COSName.TYPE;
        cOSDictionary2.setItem(cOSName, COSName.CATALOG);
        cOSDictionary2.setItem(COSName.VERSION, COSName.getPDFName("1.4"));
        COSDictionary cOSDictionary3 = new COSDictionary();
        COSName cOSName2 = COSName.PAGES;
        cOSDictionary2.setItem(cOSName2, (COSBase) cOSDictionary3);
        cOSDictionary3.setItem(cOSName, (COSBase) cOSName2);
        cOSDictionary3.setItem(COSName.KIDS, (COSBase) new COSArray());
        cOSDictionary3.setItem(COSName.COUNT, (COSBase) COSInteger.ZERO);
    }

    public static PDDocument load(File file, MemoryUsageSetting memoryUsageSetting) {
        return load(file, "", (InputStream) null, (String) null, memoryUsageSetting);
    }

    public void addSignature(PDSignature pDSignature, SignatureOptions signatureOptions) {
        addSignature(pDSignature, null, signatureOptions);
    }

    public void removePage(int i10) {
        getPages().remove(i10);
    }

    public void save(File file) {
        save(new BufferedOutputStream(new FileOutputStream(file)));
    }

    public static PDDocument load(File file, String str) {
        return load(file, str, (InputStream) null, (String) null, MemoryUsageSetting.setupMainMemoryOnly());
    }

    public void addSignature(PDSignature pDSignature, SignatureInterface signatureInterface) {
        addSignature(pDSignature, signatureInterface, new SignatureOptions());
    }

    public void save(OutputStream outputStream) {
        if (!this.document.isClosed()) {
            for (PDFont pDFont : this.fontsToSubset) {
                pDFont.subset();
            }
            this.fontsToSubset.clear();
            COSWriter cOSWriter = new COSWriter(outputStream);
            try {
                cOSWriter.write(this);
                return;
            } finally {
                cOSWriter.close();
            }
        }
        throw new IOException("Cannot save a document which has been closed");
    }

    public static PDDocument load(File file, String str, MemoryUsageSetting memoryUsageSetting) {
        return load(file, str, (InputStream) null, (String) null, memoryUsageSetting);
    }

    public void addSignature(PDSignature pDSignature, SignatureInterface signatureInterface, SignatureOptions signatureOptions) {
        if (!this.signatureAdded) {
            this.signatureAdded = true;
            int preferredSignatureSize = signatureOptions.getPreferredSignatureSize();
            if (preferredSignatureSize > 0) {
                pDSignature.setContents(new byte[preferredSignatureSize]);
            } else {
                pDSignature.setContents(new byte[SignatureOptions.DEFAULT_SIGNATURE_SIZE]);
            }
            pDSignature.setByteRange(RESERVE_BYTE_RANGE);
            this.signInterface = signatureInterface;
            int numberOfPages = getNumberOfPages();
            if (numberOfPages != 0) {
                PDPage page = getPage(Math.min(Math.max(signatureOptions.getPage(), 0), numberOfPages - 1));
                PDDocumentCatalog documentCatalog = getDocumentCatalog();
                PDSignatureField pDSignatureField = null;
                PDAcroForm acroForm = documentCatalog.getAcroForm(null);
                documentCatalog.getCOSObject().setNeedToBeUpdated(true);
                if (acroForm == null) {
                    acroForm = new PDAcroForm(this);
                    documentCatalog.setAcroForm(acroForm);
                } else {
                    acroForm.getCOSObject().setNeedToBeUpdated(true);
                }
                COSDictionary cOSObject = acroForm.getCOSObject();
                COSName cOSName = COSName.FIELDS;
                COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
                if (dictionaryObject instanceof COSArray) {
                    ((COSArray) dictionaryObject).setNeedToBeUpdated(true);
                    pDSignatureField = findSignatureField(acroForm.getFieldIterator(), pDSignature);
                } else {
                    acroForm.getCOSObject().setItem(cOSName, new COSArray());
                }
                if (pDSignatureField == null) {
                    pDSignatureField = new PDSignatureField(acroForm);
                    pDSignatureField.setValue(pDSignature);
                    pDSignatureField.getWidgets().get(0).setPage(page);
                } else {
                    pDSignature.getCOSObject().setNeedToBeUpdated(true);
                }
                pDSignatureField.getWidgets().get(0).setPrinted(true);
                List<PDField> fields = acroForm.getFields();
                acroForm.getCOSObject().setDirect(true);
                acroForm.setSignaturesExist(true);
                acroForm.setAppendOnly(true);
                boolean checkSignatureField = checkSignatureField(acroForm.getFieldIterator(), pDSignatureField);
                if (checkSignatureField) {
                    pDSignatureField.getCOSObject().setNeedToBeUpdated(true);
                } else {
                    fields.add(pDSignatureField);
                }
                COSDocument visualSignature = signatureOptions.getVisualSignature();
                if (visualSignature == null) {
                    prepareNonVisibleSignature(pDSignatureField);
                    return;
                }
                prepareVisibleSignature(pDSignatureField, acroForm, visualSignature);
                List<PDAnnotation> annotations = page.getAnnotations();
                page.setAnnotations(annotations);
                if (!(annotations instanceof COSArrayList) || !(fields instanceof COSArrayList) || !((COSArrayList) annotations).toList().equals(((COSArrayList) fields).toList()) || !checkSignatureField) {
                    PDAnnotationWidget pDAnnotationWidget = pDSignatureField.getWidgets().get(0);
                    if (checkSignatureAnnotation(annotations, pDAnnotationWidget)) {
                        pDAnnotationWidget.getCOSObject().setNeedToBeUpdated(true);
                    } else {
                        annotations.add(pDAnnotationWidget);
                    }
                }
                page.getCOSObject().setNeedToBeUpdated(true);
                return;
            }
            throw new IllegalStateException("Cannot sign an empty document");
        }
        throw new IllegalStateException("Only one signature may be added in a document");
    }

    public static PDDocument load(File file, String str, InputStream inputStream, String str2) {
        return load(file, str, inputStream, str2, MemoryUsageSetting.setupMainMemoryOnly());
    }

    public static PDDocument load(File file, String str, InputStream inputStream, String str2, MemoryUsageSetting memoryUsageSetting) {
        RandomAccessBufferedFileInputStream randomAccessBufferedFileInputStream = new RandomAccessBufferedFileInputStream(file);
        try {
            return load(randomAccessBufferedFileInputStream, str, inputStream, str2, memoryUsageSetting);
        } catch (IOException e10) {
            IOUtils.closeQuietly(randomAccessBufferedFileInputStream);
            throw e10;
        }
    }

    public void saveIncremental(OutputStream outputStream, Set<COSDictionary> set) {
        COSWriter cOSWriter;
        if (this.pdfSource != null) {
            COSWriter cOSWriter2 = null;
            try {
                cOSWriter = new COSWriter(outputStream, this.pdfSource, set);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                cOSWriter.write(this, this.signInterface);
                cOSWriter.close();
                return;
            } catch (Throwable th3) {
                th = th3;
                cOSWriter2 = cOSWriter;
                if (cOSWriter2 != null) {
                    cOSWriter2.close();
                }
                throw th;
            }
        }
        throw new IllegalStateException("document was not loaded from a file or a stream");
    }

    private static PDDocument load(RandomAccessBufferedFileInputStream randomAccessBufferedFileInputStream, String str, InputStream inputStream, String str2, MemoryUsageSetting memoryUsageSetting) {
        ScratchFile scratchFile = new ScratchFile(memoryUsageSetting);
        try {
            PDFParser pDFParser = new PDFParser(randomAccessBufferedFileInputStream, str, inputStream, str2, scratchFile);
            pDFParser.parse();
            return pDFParser.getPDDocument();
        } catch (IOException e10) {
            IOUtils.closeQuietly(scratchFile);
            throw e10;
        }
    }

    public static PDDocument load(InputStream inputStream) {
        return load(inputStream, "", (InputStream) null, (String) null, MemoryUsageSetting.setupMainMemoryOnly());
    }

    public static PDDocument load(InputStream inputStream, MemoryUsageSetting memoryUsageSetting) {
        return load(inputStream, "", (InputStream) null, (String) null, memoryUsageSetting);
    }

    public static PDDocument load(InputStream inputStream, String str) {
        return load(inputStream, str, (InputStream) null, (String) null, MemoryUsageSetting.setupMainMemoryOnly());
    }

    public static PDDocument load(InputStream inputStream, String str, InputStream inputStream2, String str2) {
        return load(inputStream, str, inputStream2, str2, MemoryUsageSetting.setupMainMemoryOnly());
    }

    public static PDDocument load(InputStream inputStream, String str, MemoryUsageSetting memoryUsageSetting) {
        return load(inputStream, str, (InputStream) null, (String) null, memoryUsageSetting);
    }

    public static PDDocument load(InputStream inputStream, String str, InputStream inputStream2, String str2, MemoryUsageSetting memoryUsageSetting) {
        ScratchFile scratchFile = new ScratchFile(memoryUsageSetting);
        try {
            PDFParser pDFParser = new PDFParser(scratchFile.createBuffer(inputStream), str, inputStream2, str2, scratchFile);
            pDFParser.parse();
            return pDFParser.getPDDocument();
        } catch (IOException e10) {
            IOUtils.closeQuietly(scratchFile);
            throw e10;
        }
    }

    public PDDocument(COSDocument cOSDocument) {
        this(cOSDocument, null);
    }

    public PDDocument(COSDocument cOSDocument, RandomAccessRead randomAccessRead) {
        this(cOSDocument, randomAccessRead, null);
    }

    public PDDocument(COSDocument cOSDocument, RandomAccessRead randomAccessRead, AccessPermission accessPermission) {
        this.fontsToSubset = new HashSet();
        this.fontsToClose = new HashSet();
        this.resourceCache = new DefaultResourceCache();
        this.signatureAdded = false;
        this.document = cOSDocument;
        this.pdfSource = randomAccessRead;
        this.accessPermission = accessPermission;
    }

    public static PDDocument load(byte[] bArr) {
        return load(bArr, "");
    }

    public static PDDocument load(byte[] bArr, String str) {
        return load(bArr, str, (InputStream) null, (String) null);
    }

    public static PDDocument load(byte[] bArr, String str, InputStream inputStream, String str2) {
        return load(bArr, str, inputStream, str2, MemoryUsageSetting.setupMainMemoryOnly());
    }

    public static PDDocument load(byte[] bArr, String str, InputStream inputStream, String str2, MemoryUsageSetting memoryUsageSetting) {
        PDFParser pDFParser = new PDFParser(new RandomAccessBuffer(bArr), str, inputStream, str2, new ScratchFile(memoryUsageSetting));
        pDFParser.parse();
        return pDFParser.getPDDocument();
    }
}
