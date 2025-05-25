package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionURI;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import lib.zj.pdfeditor.Annotation;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes2.dex */
public class FDFAnnotationLink extends FDFAnnotation {
    public static final String SUBTYPE = "Link";

    public FDFAnnotationLink() {
        this.annot.setName(COSName.SUBTYPE, "Link");
    }

    public FDFAnnotationLink(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationLink(Element element) {
        super(element);
        Node namedItem;
        this.annot.setName(COSName.SUBTYPE, "Link");
        try {
            NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().evaluate("OnActivation/Action/URI", element, XPathConstants.NODESET);
            if (nodeList.getLength() <= 0 || (namedItem = nodeList.item(0).getAttributes().getNamedItem(Annotation.KEY_ANNOT_NAME)) == null || namedItem.getNodeValue() == null) {
                return;
            }
            PDActionURI pDActionURI = new PDActionURI();
            pDActionURI.setURI(namedItem.getNodeValue());
            this.annot.setItem(COSName.A, pDActionURI);
        } catch (XPathExpressionException unused) {
        }
    }
}
