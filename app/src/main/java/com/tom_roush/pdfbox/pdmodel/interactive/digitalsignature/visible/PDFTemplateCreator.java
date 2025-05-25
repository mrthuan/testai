package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDSignatureField;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class PDFTemplateCreator {
    private final PDFTemplateBuilder pdfBuilder;

    public PDFTemplateCreator(PDFTemplateBuilder pDFTemplateBuilder) {
        this.pdfBuilder = pDFTemplateBuilder;
    }

    private InputStream getVisualSignatureAsStream(COSDocument cOSDocument) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        COSWriter cOSWriter = new COSWriter(byteArrayOutputStream);
        cOSWriter.write(cOSDocument);
        cOSWriter.close();
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    public InputStream buildPDF(PDVisibleSignDesigner pDVisibleSignDesigner) {
        PDFTemplateStructure structure = this.pdfBuilder.getStructure();
        this.pdfBuilder.createProcSetArray();
        this.pdfBuilder.createPage(pDVisibleSignDesigner);
        PDPage page = structure.getPage();
        this.pdfBuilder.createTemplate(page);
        PDDocument template = structure.getTemplate();
        this.pdfBuilder.createAcroForm(template);
        PDAcroForm acroForm = structure.getAcroForm();
        this.pdfBuilder.createSignatureField(acroForm);
        PDSignatureField signatureField = structure.getSignatureField();
        this.pdfBuilder.createSignature(signatureField, page, "");
        this.pdfBuilder.createAcroFormDictionary(acroForm, signatureField);
        this.pdfBuilder.createAffineTransform(pDVisibleSignDesigner.getTransform());
        AffineTransform affineTransform = structure.getAffineTransform();
        this.pdfBuilder.createSignatureRectangle(signatureField, pDVisibleSignDesigner);
        this.pdfBuilder.createFormatterRectangle(pDVisibleSignDesigner.getFormatterRectangleParameters());
        PDRectangle formatterRectangle = structure.getFormatterRectangle();
        this.pdfBuilder.createSignatureImage(template, pDVisibleSignDesigner.getImage());
        this.pdfBuilder.createHolderFormStream(template);
        PDStream holderFormStream = structure.getHolderFormStream();
        this.pdfBuilder.createHolderFormResources();
        PDResources holderFormResources = structure.getHolderFormResources();
        this.pdfBuilder.createHolderForm(holderFormResources, holderFormStream, formatterRectangle);
        this.pdfBuilder.createAppearanceDictionary(structure.getHolderForm(), signatureField);
        this.pdfBuilder.createInnerFormStream(template);
        this.pdfBuilder.createInnerFormResource();
        PDResources innerFormResources = structure.getInnerFormResources();
        this.pdfBuilder.createInnerForm(innerFormResources, structure.getInnerFormStream(), formatterRectangle);
        PDFormXObject innerForm = structure.getInnerForm();
        this.pdfBuilder.insertInnerFormToHolderResources(innerForm, holderFormResources);
        this.pdfBuilder.createImageFormStream(template);
        PDStream imageFormStream = structure.getImageFormStream();
        this.pdfBuilder.createImageFormResources();
        PDResources imageFormResources = structure.getImageFormResources();
        this.pdfBuilder.createImageForm(imageFormResources, innerFormResources, imageFormStream, formatterRectangle, affineTransform, structure.getImage());
        this.pdfBuilder.createBackgroundLayerForm(innerFormResources, formatterRectangle);
        this.pdfBuilder.injectProcSetArray(innerForm, page, innerFormResources, imageFormResources, holderFormResources, structure.getProcSet());
        this.pdfBuilder.injectAppearanceStreams(holderFormStream, imageFormStream, imageFormStream, structure.getImageFormName(), structure.getImageName(), structure.getInnerFormName(), pDVisibleSignDesigner);
        this.pdfBuilder.createVisualSignature(template);
        this.pdfBuilder.createWidgetDictionary(signatureField, holderFormResources);
        InputStream visualSignatureAsStream = getVisualSignatureAsStream(structure.getVisualSignature());
        visualSignatureAsStream.available();
        template.close();
        return visualSignatureAsStream;
    }

    public PDFTemplateStructure getPdfStructure() {
        return this.pdfBuilder.getStructure();
    }
}
