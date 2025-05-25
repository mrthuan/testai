package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.fontbox.ttf.NamingTable;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAdditionalActions;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes2.dex */
public class FDFField implements COSObjectable {
    private COSDictionary field;

    public FDFField() {
        this.field = new COSDictionary();
    }

    private String escapeXML(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\"') {
                if (charAt != '<') {
                    if (charAt != '>') {
                        if (charAt != '&') {
                            if (charAt != '\'') {
                                if (charAt > '~') {
                                    sb2.append("&#");
                                    sb2.append((int) charAt);
                                    sb2.append(";");
                                } else {
                                    sb2.append(charAt);
                                }
                            } else {
                                sb2.append("&apos;");
                            }
                        } else {
                            sb2.append("&amp;");
                        }
                    } else {
                        sb2.append("&gt;");
                    }
                } else {
                    sb2.append("&lt;");
                }
            } else {
                sb2.append("&quot;");
            }
        }
        return sb2.toString();
    }

    public PDAction getAction() {
        return PDActionFactory.createAction((COSDictionary) this.field.getDictionaryObject(COSName.A));
    }

    public PDAdditionalActions getAdditionalActions() {
        COSDictionary cOSDictionary = (COSDictionary) this.field.getDictionaryObject(COSName.AA);
        if (cOSDictionary != null) {
            return new PDAdditionalActions(cOSDictionary);
        }
        return null;
    }

    public PDAppearanceDictionary getAppearanceDictionary() {
        COSDictionary cOSDictionary = (COSDictionary) this.field.getDictionaryObject(COSName.AP);
        if (cOSDictionary != null) {
            return new PDAppearanceDictionary(cOSDictionary);
        }
        return null;
    }

    public FDFNamedPageReference getAppearanceStreamReference() {
        COSDictionary cOSDictionary = (COSDictionary) this.field.getDictionaryObject(COSName.AP_REF);
        if (cOSDictionary != null) {
            return new FDFNamedPageReference(cOSDictionary);
        }
        return null;
    }

    public COSBase getCOSValue() {
        COSBase dictionaryObject = this.field.getDictionaryObject(COSName.V);
        if (dictionaryObject instanceof COSName) {
            return dictionaryObject;
        }
        if (dictionaryObject instanceof COSArray) {
            return dictionaryObject;
        }
        if (!(dictionaryObject instanceof COSString) && !(dictionaryObject instanceof COSStream)) {
            if (dictionaryObject == null) {
                return null;
            }
            throw new IOException("Error:Unknown type for field import" + dictionaryObject);
        }
        return dictionaryObject;
    }

    public Integer getClearFieldFlags() {
        COSNumber cOSNumber = (COSNumber) this.field.getDictionaryObject(COSName.CLR_FF);
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public Integer getClearWidgetFieldFlags() {
        COSNumber cOSNumber = (COSNumber) this.field.getDictionaryObject(COSName.CLR_F);
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public Integer getFieldFlags() {
        COSNumber cOSNumber = (COSNumber) this.field.getDictionaryObject(COSName.FF);
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public FDFIconFit getIconFit() {
        COSDictionary cOSDictionary = (COSDictionary) this.field.getDictionaryObject(COSName.IF);
        if (cOSDictionary != null) {
            return new FDFIconFit(cOSDictionary);
        }
        return null;
    }

    public List<FDFField> getKids() {
        COSArray cOSArray = (COSArray) this.field.getDictionaryObject(COSName.KIDS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                arrayList.add(new FDFField((COSDictionary) cOSArray.getObject(i10)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public List<Object> getOptions() {
        COSArray cOSArray = (COSArray) this.field.getDictionaryObject(COSName.OPT);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList(cOSArray.size());
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                COSBase object = cOSArray.getObject(i10);
                if (object instanceof COSString) {
                    arrayList.add(((COSString) object).getString());
                } else {
                    arrayList.add(new FDFOptionElement((COSArray) object));
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public String getPartialFieldName() {
        return this.field.getString(COSName.T);
    }

    public String getRichText() {
        COSBase dictionaryObject = this.field.getDictionaryObject(COSName.RV);
        if (dictionaryObject == null) {
            return null;
        }
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getString();
        }
        return ((COSStream) dictionaryObject).toTextString();
    }

    public Integer getSetFieldFlags() {
        COSNumber cOSNumber = (COSNumber) this.field.getDictionaryObject(COSName.SET_FF);
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public Integer getSetWidgetFieldFlags() {
        COSNumber cOSNumber = (COSNumber) this.field.getDictionaryObject(COSName.SET_F);
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public Object getValue() {
        COSBase dictionaryObject = this.field.getDictionaryObject(COSName.V);
        if (dictionaryObject instanceof COSName) {
            return ((COSName) dictionaryObject).getName();
        }
        if (dictionaryObject instanceof COSArray) {
            return COSArrayList.convertCOSStringCOSArrayToList((COSArray) dictionaryObject);
        }
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getString();
        }
        if (dictionaryObject instanceof COSStream) {
            return ((COSStream) dictionaryObject).toTextString();
        }
        if (dictionaryObject == null) {
            return null;
        }
        throw new IOException("Error:Unknown type for field import" + dictionaryObject);
    }

    public Integer getWidgetFieldFlags() {
        COSNumber cOSNumber = (COSNumber) this.field.getDictionaryObject("F");
        if (cOSNumber != null) {
            return Integer.valueOf(cOSNumber.intValue());
        }
        return null;
    }

    public void setAction(PDAction pDAction) {
        this.field.setItem(COSName.A, pDAction);
    }

    public void setAdditionalActions(PDAdditionalActions pDAdditionalActions) {
        this.field.setItem(COSName.AA, pDAdditionalActions);
    }

    public void setAppearanceDictionary(PDAppearanceDictionary pDAppearanceDictionary) {
        this.field.setItem(COSName.AP, pDAppearanceDictionary);
    }

    public void setAppearanceStreamReference(FDFNamedPageReference fDFNamedPageReference) {
        this.field.setItem(COSName.AP_REF, fDFNamedPageReference);
    }

    public void setClearFieldFlags(Integer num) {
        this.field.setItem(COSName.CLR_FF, (COSBase) (num != null ? COSInteger.get(num.intValue()) : null));
    }

    public void setClearWidgetFieldFlags(Integer num) {
        this.field.setItem(COSName.CLR_F, (COSBase) (num != null ? COSInteger.get(num.intValue()) : null));
    }

    public void setFieldFlags(Integer num) {
        this.field.setItem(COSName.FF, (COSBase) (num != null ? COSInteger.get(num.intValue()) : null));
    }

    public void setIconFit(FDFIconFit fDFIconFit) {
        this.field.setItem(COSName.IF, fDFIconFit);
    }

    public void setKids(List<FDFField> list) {
        this.field.setItem(COSName.KIDS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setOptions(List<Object> list) {
        this.field.setItem(COSName.OPT, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setPartialFieldName(String str) {
        this.field.setString(COSName.T, str);
    }

    public void setRichText(COSString cOSString) {
        this.field.setItem(COSName.RV, (COSBase) cOSString);
    }

    public void setSetFieldFlags(Integer num) {
        this.field.setItem(COSName.SET_FF, (COSBase) (num != null ? COSInteger.get(num.intValue()) : null));
    }

    public void setSetWidgetFieldFlags(Integer num) {
        this.field.setItem(COSName.SET_F, (COSBase) (num != null ? COSInteger.get(num.intValue()) : null));
    }

    public void setValue(Object obj) {
        COSBase cOSBase;
        if (obj instanceof List) {
            cOSBase = COSArrayList.convertStringListToCOSStringCOSArray((List) obj);
        } else if (obj instanceof String) {
            cOSBase = new COSString((String) obj);
        } else if (obj instanceof COSObjectable) {
            cOSBase = ((COSObjectable) obj).getCOSObject();
        } else if (obj != null) {
            throw new IOException("Error:Unknown type for field import" + obj);
        } else {
            cOSBase = null;
        }
        this.field.setItem(COSName.V, cOSBase);
    }

    public void setWidgetFieldFlags(Integer num) {
        this.field.setItem(COSName.F, (COSBase) (num != null ? COSInteger.get(num.intValue()) : null));
    }

    public void writeXML(Writer writer) {
        writer.write("<field name=\"");
        writer.write(getPartialFieldName());
        writer.write("\">\n");
        Object value = getValue();
        if (value instanceof String) {
            writer.write("<value>");
            writer.write(escapeXML((String) value));
            writer.write("</value>\n");
        } else if (value instanceof List) {
            for (String str : (List) value) {
                writer.write("<value>");
                writer.write(escapeXML(str));
                writer.write("</value>\n");
            }
        }
        String richText = getRichText();
        if (richText != null) {
            writer.write("<value-richtext>");
            writer.write(escapeXML(richText));
            writer.write("</value-richtext>\n");
        }
        List<FDFField> kids = getKids();
        if (kids != null) {
            for (FDFField fDFField : kids) {
                fDFField.writeXML(writer);
            }
        }
        writer.write("</field>\n");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.field;
    }

    public void setRichText(COSStream cOSStream) {
        this.field.setItem(COSName.RV, (COSBase) cOSStream);
    }

    public FDFField(COSDictionary cOSDictionary) {
        this.field = cOSDictionary;
    }

    public void setClearFieldFlags(int i10) {
        this.field.setInt(COSName.CLR_FF, i10);
    }

    public void setClearWidgetFieldFlags(int i10) {
        this.field.setInt(COSName.CLR_F, i10);
    }

    public void setFieldFlags(int i10) {
        this.field.setInt(COSName.FF, i10);
    }

    public void setSetFieldFlags(int i10) {
        this.field.setInt(COSName.SET_FF, i10);
    }

    public void setSetWidgetFieldFlags(int i10) {
        this.field.setInt(COSName.SET_F, i10);
    }

    public void setWidgetFieldFlags(int i10) {
        this.field.setInt(COSName.F, i10);
    }

    public FDFField(Element element) {
        this();
        setPartialFieldName(element.getAttribute(NamingTable.TAG));
        NodeList childNodes = element.getChildNodes();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node item = childNodes.item(i10);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                if (element2.getTagName().equals("value")) {
                    setValue(com.tom_roush.pdfbox.util.XMLUtil.getNodeValue(element2));
                } else if (element2.getTagName().equals("value-richtext")) {
                    setRichText(new COSString(com.tom_roush.pdfbox.util.XMLUtil.getNodeValue(element2)));
                } else if (element2.getTagName().equals("field")) {
                    arrayList.add(new FDFField(element2));
                }
            }
        }
        if (arrayList.size() > 0) {
            setKids(arrayList);
        }
    }

    public void setValue(COSBase cOSBase) {
        this.field.setItem(COSName.V, cOSBase);
    }
}
