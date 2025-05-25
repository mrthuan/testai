package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes2.dex */
public class FDFAnnotationInk extends FDFAnnotation {
    public static final String SUBTYPE = "Ink";

    public FDFAnnotationInk() {
        this.annot.setName(COSName.SUBTYPE, "Ink");
    }

    public List<float[]> getInkList() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.INKLIST);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<COSBase> it = cOSArray.iterator();
            while (it.hasNext()) {
                arrayList.add(((COSArray) it.next()).toFloatArray());
            }
            return arrayList;
        }
        return null;
    }

    public final void setInkList(List<float[]> list) {
        COSArray cOSArray = new COSArray();
        for (float[] fArr : list) {
            COSArray cOSArray2 = new COSArray();
            cOSArray2.setFloatArray(fArr);
            cOSArray.add((COSBase) cOSArray2);
        }
        this.annot.setItem(COSName.INKLIST, (COSBase) cOSArray);
    }

    public FDFAnnotationInk(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationInk(Element element) {
        super(element);
        this.annot.setName(COSName.SUBTYPE, "Ink");
        try {
            NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().evaluate("inklist/gesture", element, XPathConstants.NODESET);
            if (nodeList.getLength() != 0) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
                    Node item = nodeList.item(i10);
                    if (item instanceof Element) {
                        String[] split = item.getFirstChild().getNodeValue().split(",|;");
                        float[] fArr = new float[split.length];
                        for (int i11 = 0; i11 < split.length; i11++) {
                            fArr[i11] = Float.parseFloat(split[i11]);
                        }
                        arrayList.add(fArr);
                    }
                }
                setInkList(arrayList);
                return;
            }
            throw new IOException("Error: missing element 'gesture'");
        } catch (XPathExpressionException unused) {
        }
    }
}
