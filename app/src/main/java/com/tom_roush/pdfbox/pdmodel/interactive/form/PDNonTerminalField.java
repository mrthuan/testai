package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.fdf.FDFField;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class PDNonTerminalField extends PDField {
    public PDNonTerminalField(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public FDFField exportFDF() {
        FDFField fDFField = new FDFField();
        fDFField.setPartialFieldName(getPartialName());
        fDFField.setValue(getValue());
        List<PDField> children = getChildren();
        ArrayList arrayList = new ArrayList(children.size());
        for (PDField pDField : children) {
            arrayList.add(pDField.exportFDF());
        }
        fDFField.setKids(arrayList);
        return fDFField;
    }

    public List<PDField> getChildren() {
        PDField fromDictionary;
        ArrayList arrayList = new ArrayList();
        COSArray cOSArray = getCOSObject().getCOSArray(COSName.KIDS);
        if (cOSArray == null) {
            return arrayList;
        }
        for (int i10 = 0; i10 < cOSArray.size(); i10++) {
            COSBase object = cOSArray.getObject(i10);
            if ((object instanceof COSDictionary) && object.getCOSObject() != getCOSObject() && (fromDictionary = PDField.fromDictionary(getAcroForm(), (COSDictionary) object, this)) != null) {
                arrayList.add(fromDictionary);
            }
        }
        return arrayList;
    }

    public COSBase getDefaultValue() {
        return getCOSObject().getDictionaryObject(COSName.DV);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public int getFieldFlags() {
        COSInteger cOSInteger = (COSInteger) getCOSObject().getDictionaryObject(COSName.FF);
        if (cOSInteger != null) {
            return cOSInteger.intValue();
        }
        return 0;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public String getFieldType() {
        return getCOSObject().getNameAsString(COSName.FT);
    }

    public COSBase getValue() {
        return getCOSObject().getDictionaryObject(COSName.V);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public String getValueAsString() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.V);
        if (dictionaryObject != null) {
            return dictionaryObject.toString();
        }
        return "";
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public List<PDAnnotationWidget> getWidgets() {
        return Collections.emptyList();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public void importFDF(FDFField fDFField) {
        super.importFDF(fDFField);
        List<FDFField> kids = fDFField.getKids();
        List<PDField> children = getChildren();
        if (kids == null) {
            return;
        }
        for (int i10 = 0; i10 < kids.size(); i10++) {
            for (PDField pDField : children) {
                FDFField fDFField2 = kids.get(i10);
                String partialFieldName = fDFField2.getPartialFieldName();
                if (partialFieldName != null && partialFieldName.equals(pDField.getPartialName())) {
                    pDField.importFDF(fDFField2);
                }
            }
        }
    }

    public void setChildren(List<PDField> list) {
        getCOSObject().setItem(COSName.KIDS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setDefaultValue(COSBase cOSBase) {
        getCOSObject().setItem(COSName.V, cOSBase);
    }

    public void setValue(COSBase cOSBase) {
        getCOSObject().setItem(COSName.V, cOSBase);
    }

    public PDNonTerminalField(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public void setValue(String str) {
        getCOSObject().setString(COSName.V, str);
    }
}
