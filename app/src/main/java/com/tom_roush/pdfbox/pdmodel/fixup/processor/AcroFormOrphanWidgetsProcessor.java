package com.tom_roush.pdfbox.pdmodel.fixup.processor;

import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.font.FontMappers;
import com.tom_roush.pdfbox.pdmodel.font.FontMapping;
import com.tom_roush.pdfbox.pdmodel.font.PDType0Font;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDField;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDFieldFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDVariableText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes2.dex */
public class AcroFormOrphanWidgetsProcessor extends AbstractProcessor {
    public AcroFormOrphanWidgetsProcessor(PDDocument pDDocument) {
        super(pDDocument);
    }

    private void addFontFromWidget(PDResources pDResources, PDAnnotation pDAnnotation) {
        PDAppearanceStream normalAppearanceStream = pDAnnotation.getNormalAppearanceStream();
        if (normalAppearanceStream != null && normalAppearanceStream.getResources() != null) {
            PDResources resources = normalAppearanceStream.getResources();
            for (COSName cOSName : resources.getFontNames()) {
                if (!cOSName.getName().startsWith("+")) {
                    try {
                        if (pDResources.getFont(cOSName) == null) {
                            pDResources.put(cOSName, resources.getFont(cOSName));
                            cOSName.getName();
                        }
                    } catch (IOException unused) {
                        cOSName.getName();
                    }
                } else {
                    cOSName.getName();
                }
            }
        }
    }

    private void ensureFontResources(PDResources pDResources, PDVariableText pDVariableText) {
        String defaultAppearance = pDVariableText.getDefaultAppearance();
        if (defaultAppearance.startsWith(PackagingURIHelper.FORWARD_SLASH_STRING) && defaultAppearance.length() > 1) {
            COSName pDFName = COSName.getPDFName(defaultAppearance.substring(1, defaultAppearance.indexOf(" ")));
            if (pDResources != null) {
                try {
                    if (pDResources.getFont(pDFName) == null) {
                        pDVariableText.getFullyQualifiedName();
                        FontMapping<TrueTypeFont> trueTypeFont = FontMappers.instance().getTrueTypeFont(pDFName.getName(), null);
                        if (trueTypeFont != null) {
                            PDType0Font load = PDType0Font.load(this.document, trueTypeFont.getFont(), false);
                            pDFName.getName();
                            trueTypeFont.getFont().getName();
                            pDResources.put(pDFName, load);
                        } else {
                            pDVariableText.getFullyQualifiedName();
                            pDFName.getName();
                        }
                    }
                } catch (IOException e10) {
                    pDVariableText.getFullyQualifiedName();
                    e10.getMessage();
                }
            }
        }
    }

    private void handleAnnotations(PDAcroForm pDAcroForm, List<PDField> list, List<PDAnnotation> list2, Map<String, PDField> map) {
        PDResources defaultResources = pDAcroForm.getDefaultResources();
        for (PDAnnotation pDAnnotation : list2) {
            if (pDAnnotation instanceof PDAnnotationWidget) {
                addFontFromWidget(defaultResources, pDAnnotation);
                if (pDAnnotation.getCOSObject().getCOSDictionary(COSName.PARENT) != null) {
                    PDField resolveNonRootField = resolveNonRootField(pDAcroForm, (PDAnnotationWidget) pDAnnotation, map);
                    if (resolveNonRootField != null) {
                        list.add(resolveNonRootField);
                    }
                } else {
                    list.add(PDFieldFactory.createField(pDAcroForm, pDAnnotation.getCOSObject(), null));
                }
            }
        }
    }

    private void resolveFieldsFromWidgets(PDAcroForm pDAcroForm) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<PDPage> it = this.document.getPages().iterator();
        while (it.hasNext()) {
            try {
                handleAnnotations(pDAcroForm, arrayList, it.next().getAnnotations(), hashMap);
            } catch (IOException e10) {
                e10.getMessage();
            }
        }
        pDAcroForm.setFields(arrayList);
        Iterator<PDField> it2 = pDAcroForm.getFieldTree().iterator();
        while (it2.hasNext()) {
            PDField next = it2.next();
            if (next instanceof PDVariableText) {
                ensureFontResources(pDAcroForm.getDefaultResources(), (PDVariableText) next);
            }
        }
    }

    private PDField resolveNonRootField(PDAcroForm pDAcroForm, PDAnnotationWidget pDAnnotationWidget, Map<String, PDField> map) {
        COSDictionary cOSDictionary = pDAnnotationWidget.getCOSObject().getCOSDictionary(COSName.PARENT);
        do {
            COSName cOSName = COSName.PARENT;
            if (cOSDictionary.containsKey(cOSName)) {
                cOSDictionary = cOSDictionary.getCOSDictionary(cOSName);
            } else if (map.get(cOSDictionary.getString(COSName.T)) != null) {
                return null;
            } else {
                PDField createField = PDFieldFactory.createField(pDAcroForm, cOSDictionary, null);
                if (createField != null) {
                    map.put(createField.getFullyQualifiedName(), createField);
                }
                return createField;
            }
        } while (cOSDictionary != null);
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.fixup.processor.PDDocumentProcessor
    public void process() {
        PDAcroForm acroForm = this.document.getDocumentCatalog().getAcroForm(null);
        if (acroForm != null) {
            resolveFieldsFromWidgets(acroForm);
        }
    }
}
