package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.PDSignature;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDField;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDSignatureField;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* loaded from: classes2.dex */
public class PDFTemplateStructure {
    private PDAcroForm acroForm;
    private COSDictionary acroFormDictionary;
    private List<PDField> acroFormFields;
    private AffineTransform affineTransform;
    private PDAppearanceDictionary appearanceDictionary;
    private PDRectangle formatterRectangle;
    private PDFormXObject holderForm;
    private PDResources holderFormResources;
    private PDStream holderFormStream;
    private PDImageXObject image;
    private PDFormXObject imageForm;
    private COSName imageFormName;
    private PDResources imageFormResources;
    private PDStream imageFormStream;
    private COSName imageName;
    private PDFormXObject innerForm;
    private COSName innerFormName;
    private PDResources innerFormResources;
    private PDStream innerFormStream;
    private PDPage page;
    private PDSignature pdSignature;
    private COSArray procSet;
    private PDSignatureField signatureField;
    private PDRectangle signatureRectangle;
    private PDDocument template;
    private COSDocument visualSignature;
    private COSDictionary widgetDictionary;

    public PDAcroForm getAcroForm() {
        return this.acroForm;
    }

    public COSDictionary getAcroFormDictionary() {
        return this.acroFormDictionary;
    }

    public List<PDField> getAcroFormFields() {
        return this.acroFormFields;
    }

    public AffineTransform getAffineTransform() {
        return this.affineTransform;
    }

    public PDAppearanceDictionary getAppearanceDictionary() {
        return this.appearanceDictionary;
    }

    public PDRectangle getFormatterRectangle() {
        return this.formatterRectangle;
    }

    public PDFormXObject getHolderForm() {
        return this.holderForm;
    }

    public PDResources getHolderFormResources() {
        return this.holderFormResources;
    }

    public PDStream getHolderFormStream() {
        return this.holderFormStream;
    }

    public PDImageXObject getImage() {
        return this.image;
    }

    public PDFormXObject getImageForm() {
        return this.imageForm;
    }

    public COSName getImageFormName() {
        return this.imageFormName;
    }

    public PDResources getImageFormResources() {
        return this.imageFormResources;
    }

    public PDStream getImageFormStream() {
        return this.imageFormStream;
    }

    public COSName getImageName() {
        return this.imageName;
    }

    public PDFormXObject getInnerForm() {
        return this.innerForm;
    }

    public COSName getInnerFormName() {
        return this.innerFormName;
    }

    public PDResources getInnerFormResources() {
        return this.innerFormResources;
    }

    public PDStream getInnerFormStream() {
        return this.innerFormStream;
    }

    public PDPage getPage() {
        return this.page;
    }

    public PDSignature getPdSignature() {
        return this.pdSignature;
    }

    public COSArray getProcSet() {
        return this.procSet;
    }

    public PDSignatureField getSignatureField() {
        return this.signatureField;
    }

    public PDRectangle getSignatureRectangle() {
        return this.signatureRectangle;
    }

    public PDDocument getTemplate() {
        return this.template;
    }

    @Deprecated
    public ByteArrayInputStream getTemplateAppearanceStream() {
        COSDocument visualSignature = getVisualSignature();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new COSWriter(byteArrayOutputStream).write(visualSignature);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        getTemplate().close();
        return byteArrayInputStream;
    }

    public COSDocument getVisualSignature() {
        return this.visualSignature;
    }

    public COSDictionary getWidgetDictionary() {
        return this.widgetDictionary;
    }

    public void setAcroForm(PDAcroForm pDAcroForm) {
        this.acroForm = pDAcroForm;
    }

    public void setAcroFormDictionary(COSDictionary cOSDictionary) {
        this.acroFormDictionary = cOSDictionary;
    }

    public void setAcroFormFields(List<PDField> list) {
        this.acroFormFields = list;
    }

    public void setAffineTransform(AffineTransform affineTransform) {
        this.affineTransform = affineTransform;
    }

    public void setAppearanceDictionary(PDAppearanceDictionary pDAppearanceDictionary) {
        this.appearanceDictionary = pDAppearanceDictionary;
    }

    public void setFormatterRectangle(PDRectangle pDRectangle) {
        this.formatterRectangle = pDRectangle;
    }

    public void setHolderForm(PDFormXObject pDFormXObject) {
        this.holderForm = pDFormXObject;
    }

    public void setHolderFormResources(PDResources pDResources) {
        this.holderFormResources = pDResources;
    }

    public void setHolderFormStream(PDStream pDStream) {
        this.holderFormStream = pDStream;
    }

    public void setImage(PDImageXObject pDImageXObject) {
        this.image = pDImageXObject;
    }

    public void setImageForm(PDFormXObject pDFormXObject) {
        this.imageForm = pDFormXObject;
    }

    public void setImageFormName(COSName cOSName) {
        this.imageFormName = cOSName;
    }

    public void setImageFormResources(PDResources pDResources) {
        this.imageFormResources = pDResources;
    }

    public void setImageFormStream(PDStream pDStream) {
        this.imageFormStream = pDStream;
    }

    public void setImageName(COSName cOSName) {
        this.imageName = cOSName;
    }

    public void setInnerForm(PDFormXObject pDFormXObject) {
        this.innerForm = pDFormXObject;
    }

    public void setInnerFormName(COSName cOSName) {
        this.innerFormName = cOSName;
    }

    public void setInnerFormResources(PDResources pDResources) {
        this.innerFormResources = pDResources;
    }

    public void setInnterFormStream(PDStream pDStream) {
        this.innerFormStream = pDStream;
    }

    public void setPage(PDPage pDPage) {
        this.page = pDPage;
    }

    public void setPdSignature(PDSignature pDSignature) {
        this.pdSignature = pDSignature;
    }

    public void setProcSet(COSArray cOSArray) {
        this.procSet = cOSArray;
    }

    public void setSignatureField(PDSignatureField pDSignatureField) {
        this.signatureField = pDSignatureField;
    }

    public void setSignatureRectangle(PDRectangle pDRectangle) {
        this.signatureRectangle = pDRectangle;
    }

    public void setTemplate(PDDocument pDDocument) {
        this.template = pDDocument;
    }

    public void setVisualSignature(COSDocument cOSDocument) {
        this.visualSignature = cOSDocument;
    }

    public void setWidgetDictionary(COSDictionary cOSDictionary) {
        this.widgetDictionary = cOSDictionary;
    }
}
