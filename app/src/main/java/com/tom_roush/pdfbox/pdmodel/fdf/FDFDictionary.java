package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes2.dex */
public class FDFDictionary implements COSObjectable {
    private COSDictionary fdf;

    public FDFDictionary() {
        this.fdf = new COSDictionary();
    }

    public List<FDFAnnotation> getAnnotations() {
        COSArray cOSArray = (COSArray) this.fdf.getDictionaryObject(COSName.ANNOTS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                arrayList.add(FDFAnnotation.create((COSDictionary) cOSArray.getObject(i10)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public COSStream getDifferences() {
        return (COSStream) this.fdf.getDictionaryObject(COSName.DIFFERENCES);
    }

    public List<PDFileSpecification> getEmbeddedFDFs() {
        COSArray cOSArray = (COSArray) this.fdf.getDictionaryObject(COSName.EMBEDDED_FDFS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                arrayList.add(PDFileSpecification.createFS(cOSArray.get(i10)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public String getEncoding() {
        String nameAsString = this.fdf.getNameAsString(COSName.ENCODING);
        if (nameAsString == null) {
            return "PDFDocEncoding";
        }
        return nameAsString;
    }

    public List<FDFField> getFields() {
        COSArray cOSArray = (COSArray) this.fdf.getDictionaryObject(COSName.FIELDS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                arrayList.add(new FDFField((COSDictionary) cOSArray.getObject(i10)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public PDFileSpecification getFile() {
        return PDFileSpecification.createFS(this.fdf.getDictionaryObject(COSName.F));
    }

    public COSArray getID() {
        return (COSArray) this.fdf.getDictionaryObject(COSName.ID);
    }

    public FDFJavaScript getJavaScript() {
        COSDictionary cOSDictionary = (COSDictionary) this.fdf.getDictionaryObject(COSName.JAVA_SCRIPT);
        if (cOSDictionary != null) {
            return new FDFJavaScript(cOSDictionary);
        }
        return null;
    }

    public List<FDFPage> getPages() {
        COSArray cOSArray = (COSArray) this.fdf.getDictionaryObject(COSName.PAGES);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                arrayList.add(new FDFPage((COSDictionary) cOSArray.get(i10)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public String getStatus() {
        return this.fdf.getString(COSName.STATUS);
    }

    public String getTarget() {
        return this.fdf.getString(COSName.TARGET);
    }

    public void setAnnotations(List<FDFAnnotation> list) {
        this.fdf.setItem(COSName.ANNOTS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setDifferences(COSStream cOSStream) {
        this.fdf.setItem(COSName.DIFFERENCES, (COSBase) cOSStream);
    }

    public void setEmbeddedFDFs(List<PDFileSpecification> list) {
        this.fdf.setItem(COSName.EMBEDDED_FDFS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setEncoding(String str) {
        this.fdf.setName(COSName.ENCODING, str);
    }

    public void setFields(List<FDFField> list) {
        this.fdf.setItem(COSName.FIELDS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        this.fdf.setItem(COSName.F, pDFileSpecification);
    }

    public void setID(COSArray cOSArray) {
        this.fdf.setItem(COSName.ID, (COSBase) cOSArray);
    }

    public void setJavaScript(FDFJavaScript fDFJavaScript) {
        this.fdf.setItem(COSName.JAVA_SCRIPT, fDFJavaScript);
    }

    public void setPages(List<FDFPage> list) {
        this.fdf.setItem(COSName.PAGES, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setStatus(String str) {
        this.fdf.setString(COSName.STATUS, str);
    }

    public void setTarget(String str) {
        this.fdf.setString(COSName.TARGET, str);
    }

    public void writeXML(Writer writer) {
        PDFileSpecification file = getFile();
        if (file != null) {
            writer.write("<f href=\"" + file.getFile() + "\" />\n");
        }
        COSArray id2 = getID();
        if (id2 != null) {
            writer.write("<ids original=\"" + ((COSString) id2.getObject(0)).toHexString() + "\" ");
            writer.write("modified=\"" + ((COSString) id2.getObject(1)).toHexString() + "\" />\n");
        }
        List<FDFField> fields = getFields();
        if (fields != null && fields.size() > 0) {
            writer.write("<fields>\n");
            for (FDFField fDFField : fields) {
                fDFField.writeXML(writer);
            }
            writer.write("</fields>\n");
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.fdf;
    }

    public FDFDictionary(COSDictionary cOSDictionary) {
        this.fdf = cOSDictionary;
    }

    public FDFDictionary(Element element) {
        this();
        NodeList childNodes = element.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node item = childNodes.item(i10);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                if (element2.getTagName().equals("f")) {
                    PDFileSpecification pDSimpleFileSpecification = new PDSimpleFileSpecification();
                    pDSimpleFileSpecification.setFile(element2.getAttribute("href"));
                    setFile(pDSimpleFileSpecification);
                } else if (element2.getTagName().equals("ids")) {
                    COSArray cOSArray = new COSArray();
                    String attribute = element2.getAttribute("original");
                    String attribute2 = element2.getAttribute("modified");
                    try {
                        cOSArray.add(COSString.parseHex(attribute));
                    } catch (IOException unused) {
                    }
                    try {
                        cOSArray.add(COSString.parseHex(attribute2));
                    } catch (IOException unused2) {
                    }
                    setID(cOSArray);
                } else if (element2.getTagName().equals("fields")) {
                    NodeList childNodes2 = element2.getChildNodes();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < childNodes2.getLength(); i11++) {
                        Node item2 = childNodes2.item(i11);
                        if ((item2 instanceof Element) && ((Element) item2).getTagName().equals("field")) {
                            try {
                                arrayList.add(new FDFField((Element) childNodes2.item(i11)));
                            } catch (IOException unused3) {
                                item2.getNodeValue();
                            }
                        }
                    }
                    setFields(arrayList);
                } else if (element2.getTagName().equals("annots")) {
                    NodeList childNodes3 = element2.getChildNodes();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < childNodes3.getLength(); i12++) {
                        Node item3 = childNodes3.item(i12);
                        if (item3 instanceof Element) {
                            Element element3 = (Element) item3;
                            String nodeName = element3.getNodeName();
                            try {
                                if (nodeName.equals("text")) {
                                    arrayList2.add(new FDFAnnotationText(element3));
                                } else if (nodeName.equals("caret")) {
                                    arrayList2.add(new FDFAnnotationCaret(element3));
                                } else if (nodeName.equals("freetext")) {
                                    arrayList2.add(new FDFAnnotationFreeText(element3));
                                } else if (nodeName.equals("fileattachment")) {
                                    arrayList2.add(new FDFAnnotationFileAttachment(element3));
                                } else if (nodeName.equals("highlight")) {
                                    arrayList2.add(new FDFAnnotationHighlight(element3));
                                } else if (nodeName.equals("ink")) {
                                    arrayList2.add(new FDFAnnotationInk(element3));
                                } else if (nodeName.equals("line")) {
                                    arrayList2.add(new FDFAnnotationLine(element3));
                                } else if (nodeName.equals("link")) {
                                    arrayList2.add(new FDFAnnotationLink(element3));
                                } else if (nodeName.equals("circle")) {
                                    arrayList2.add(new FDFAnnotationCircle(element3));
                                } else if (nodeName.equals("square")) {
                                    arrayList2.add(new FDFAnnotationSquare(element3));
                                } else if (nodeName.equals("polygon")) {
                                    arrayList2.add(new FDFAnnotationPolygon(element3));
                                } else if (nodeName.equals("polyline")) {
                                    arrayList2.add(new FDFAnnotationPolyline(element3));
                                } else if (nodeName.equals("sound")) {
                                    arrayList2.add(new FDFAnnotationSound(element3));
                                } else if (nodeName.equals("squiggly")) {
                                    arrayList2.add(new FDFAnnotationSquiggly(element3));
                                } else if (nodeName.equals("stamp")) {
                                    arrayList2.add(new FDFAnnotationStamp(element3));
                                } else if (nodeName.equals("strikeout")) {
                                    arrayList2.add(new FDFAnnotationStrikeOut(element3));
                                } else if (nodeName.equals("underline")) {
                                    arrayList2.add(new FDFAnnotationUnderline(element3));
                                }
                            } catch (IOException unused4) {
                                element3.getNodeValue();
                            }
                        }
                    }
                    setAnnotations(arrayList2);
                }
            }
        }
    }
}
