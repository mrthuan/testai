package com.tom_roush.pdfbox.pdmodel.interactive.form;

import androidx.appcompat.view.menu.d;
import b.a;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class PDButton extends PDTerminalField {
    static final int FLAG_PUSHBUTTON = 65536;
    static final int FLAG_RADIO = 32768;
    static final int FLAG_RADIOS_IN_UNISON = 33554432;

    public PDButton(PDAcroForm pDAcroForm) {
        super(pDAcroForm);
        getCOSObject().setItem(COSName.FT, (COSBase) COSName.BTN);
    }

    private String getOnValue(int i10) {
        List<PDAnnotationWidget> widgets = getWidgets();
        if (i10 < widgets.size()) {
            return getOnValueForWidget(widgets.get(i10));
        }
        return "";
    }

    private String getOnValueForWidget(PDAnnotationWidget pDAnnotationWidget) {
        PDAppearanceEntry normalAppearance;
        PDAppearanceDictionary appearance = pDAnnotationWidget.getAppearance();
        if (appearance != null && (normalAppearance = appearance.getNormalAppearance()) != null) {
            for (COSName cOSName : normalAppearance.getSubDictionary().keySet()) {
                if (COSName.Off.compareTo(cOSName) != 0) {
                    return cOSName.getName();
                }
            }
            return "";
        }
        return "";
    }

    private void updateByOption(String str) {
        List<PDAnnotationWidget> widgets = getWidgets();
        List<String> exportValues = getExportValues();
        if (widgets.size() == exportValues.size()) {
            if (str.equals(COSName.Off.getName())) {
                updateByValue(str);
                return;
            }
            int indexOf = exportValues.indexOf(str);
            if (indexOf != -1) {
                updateByValue(getOnValue(indexOf));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The number of options doesn't match the number of widgets");
    }

    private void updateByValue(String str) {
        getCOSObject().setName(COSName.V, str);
        for (PDAnnotationWidget pDAnnotationWidget : getWidgets()) {
            if (pDAnnotationWidget.getAppearance() != null) {
                if (((COSDictionary) pDAnnotationWidget.getAppearance().getNormalAppearance().getCOSObject()).containsKey(str)) {
                    pDAnnotationWidget.setAppearanceState(str);
                } else {
                    pDAnnotationWidget.setAppearanceState(COSName.Off.getName());
                }
            }
        }
    }

    public void checkValue(String str) {
        Set<String> onValues = getOnValues();
        COSName cOSName = COSName.Off;
        if (cOSName.getName().compareTo(str) != 0 && !onValues.contains(str)) {
            StringBuilder g10 = a.g("value '", str, "' is not a valid option for the field ");
            g10.append(getFullyQualifiedName());
            g10.append(", valid values are: ");
            g10.append(onValues);
            g10.append(" and ");
            g10.append(cOSName.getName());
            throw new IllegalArgumentException(g10.toString());
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDTerminalField
    public void constructAppearances() {
        List<String> exportValues = getExportValues();
        if (exportValues.size() > 0) {
            try {
                int parseInt = Integer.parseInt(getValue());
                if (parseInt < exportValues.size()) {
                    updateByOption(exportValues.get(parseInt));
                    return;
                }
                return;
            } catch (NumberFormatException unused) {
                return;
            }
        }
        updateByValue(getValue());
    }

    public String getDefaultValue() {
        COSBase inheritableAttribute = getInheritableAttribute(COSName.DV);
        if (inheritableAttribute instanceof COSName) {
            return ((COSName) inheritableAttribute).getName();
        }
        return "";
    }

    public List<String> getExportValues() {
        COSBase inheritableAttribute = getInheritableAttribute(COSName.OPT);
        if (inheritableAttribute instanceof COSString) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(((COSString) inheritableAttribute).getString());
            return arrayList;
        } else if (inheritableAttribute instanceof COSArray) {
            return COSArrayList.convertCOSStringCOSArrayToList((COSArray) inheritableAttribute);
        } else {
            return Collections.emptyList();
        }
    }

    public Set<String> getOnValues() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (getExportValues().size() > 0) {
            linkedHashSet.addAll(getExportValues());
            return linkedHashSet;
        }
        for (PDAnnotationWidget pDAnnotationWidget : getWidgets()) {
            linkedHashSet.add(getOnValueForWidget(pDAnnotationWidget));
        }
        return linkedHashSet;
    }

    public String getValue() {
        COSBase inheritableAttribute = getInheritableAttribute(COSName.V);
        if (inheritableAttribute instanceof COSName) {
            String name = ((COSName) inheritableAttribute).getName();
            List<String> exportValues = getExportValues();
            if (!exportValues.isEmpty()) {
                try {
                    int parseInt = Integer.parseInt(name, 10);
                    if (parseInt >= 0 && parseInt < exportValues.size()) {
                        return exportValues.get(parseInt);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return name;
        }
        return "Off";
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public String getValueAsString() {
        return getValue();
    }

    public boolean isPushButton() {
        return getCOSObject().getFlag(COSName.FF, FLAG_PUSHBUTTON);
    }

    public boolean isRadioButton() {
        return getCOSObject().getFlag(COSName.FF, 32768);
    }

    public void setDefaultValue(String str) {
        checkValue(str);
        getCOSObject().setName(COSName.DV, str);
    }

    public void setExportValues(List<String> list) {
        if (list != null && !list.isEmpty()) {
            getCOSObject().setItem(COSName.OPT, (COSBase) COSArrayList.convertStringListToCOSStringCOSArray(list));
            return;
        }
        getCOSObject().removeItem(COSName.OPT);
    }

    @Deprecated
    public void setPushButton(boolean z10) {
        getCOSObject().setFlag(COSName.FF, FLAG_PUSHBUTTON, z10);
        if (z10) {
            setRadioButton(false);
        }
    }

    @Deprecated
    public void setRadioButton(boolean z10) {
        getCOSObject().setFlag(COSName.FF, 32768, z10);
        if (z10) {
            setPushButton(false);
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.form.PDField
    public void setValue(String str) {
        checkValue(str);
        if (getExportValues().size() > 0) {
            updateByOption(str);
        } else {
            updateByValue(str);
        }
        applyChange();
    }

    public PDButton(PDAcroForm pDAcroForm, COSDictionary cOSDictionary, PDNonTerminalField pDNonTerminalField) {
        super(pDAcroForm, cOSDictionary, pDNonTerminalField);
    }

    public void setValue(int i10) {
        if (!getExportValues().isEmpty() && i10 >= 0 && i10 < getExportValues().size()) {
            updateByValue(String.valueOf(i10));
            applyChange();
            return;
        }
        StringBuilder e10 = d.e("index '", i10, "' is not a valid index for the field ");
        e10.append(getFullyQualifiedName());
        e10.append(", valid indices are from 0 to ");
        e10.append(getExportValues().size() - 1);
        throw new IllegalArgumentException(e10.toString());
    }
}
