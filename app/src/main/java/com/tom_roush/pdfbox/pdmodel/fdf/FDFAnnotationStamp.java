package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.util.Hex;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes2.dex */
public class FDFAnnotationStamp extends FDFAnnotation {
    public static final String SUBTYPE = "Stamp";

    public FDFAnnotationStamp() {
        this.annot.setName(COSName.SUBTYPE, "Stamp");
    }

    private COSArray parseArrayElement(Element element) {
        element.getAttribute("KEY");
        COSArray cOSArray = new COSArray();
        NodeList childNodes = element.getChildNodes();
        String attribute = element.getAttribute("KEY");
        if ("BBox".equals(attribute) && childNodes.getLength() < 4) {
            throw new IOException("BBox does not have enough coordinates, only has: " + childNodes.getLength());
        } else if ("Matrix".equals(attribute) && childNodes.getLength() < 6) {
            throw new IOException("Matrix does not have enough coordinates, only has: " + childNodes.getLength());
        } else {
            for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
                Node item = childNodes.item(i10);
                if (item instanceof Element) {
                    Element element2 = (Element) item;
                    element2.getAttribute("KEY");
                    String attribute2 = element2.getAttribute("VAL");
                    element2.getTagName();
                    if (!"INT".equalsIgnoreCase(element2.getTagName()) && !"FIXED".equalsIgnoreCase(element2.getTagName())) {
                        if ("NAME".equalsIgnoreCase(element2.getTagName())) {
                            cOSArray.add((COSBase) COSName.getPDFName(attribute2));
                        } else if ("BOOL".equalsIgnoreCase(element2.getTagName())) {
                            cOSArray.add((COSBase) COSBoolean.getBoolean(Boolean.parseBoolean(attribute2)));
                        } else if ("DICT".equalsIgnoreCase(element2.getTagName())) {
                            cOSArray.add((COSBase) parseDictElement(element2));
                        } else if ("STREAM".equalsIgnoreCase(element2.getTagName())) {
                            cOSArray.add((COSBase) parseStreamElement(element2));
                        } else if ("ARRAY".equalsIgnoreCase(element2.getTagName())) {
                            cOSArray.add((COSBase) parseArrayElement(element2));
                        } else {
                            element2.getTagName();
                        }
                    } else {
                        cOSArray.add((COSBase) COSNumber.get(attribute2));
                    }
                }
            }
            return cOSArray;
        }
    }

    private COSDictionary parseDictElement(Element element) {
        element.getAttribute("KEY");
        COSDictionary cOSDictionary = new COSDictionary();
        NodeList childNodes = element.getChildNodes();
        element.getAttribute("KEY");
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node item = childNodes.item(i10);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                String attribute = element2.getAttribute("KEY");
                String attribute2 = element2.getAttribute("VAL");
                if ("DICT".equals(element2.getTagName())) {
                    cOSDictionary.setItem(COSName.getPDFName(attribute), (COSBase) parseDictElement(element2));
                } else if ("STREAM".equals(element2.getTagName())) {
                    cOSDictionary.setItem(COSName.getPDFName(attribute), (COSBase) parseStreamElement(element2));
                } else if ("NAME".equals(element2.getTagName())) {
                    cOSDictionary.setName(COSName.getPDFName(attribute), attribute2);
                } else if ("INT".equalsIgnoreCase(element2.getTagName())) {
                    cOSDictionary.setInt(COSName.getPDFName(attribute), Integer.parseInt(attribute2));
                } else if ("FIXED".equalsIgnoreCase(element2.getTagName())) {
                    cOSDictionary.setFloat(COSName.getPDFName(attribute), Float.parseFloat(attribute2));
                } else if ("BOOL".equalsIgnoreCase(element2.getTagName())) {
                    cOSDictionary.setBoolean(COSName.getPDFName(attribute), Boolean.parseBoolean(attribute2));
                } else if ("ARRAY".equalsIgnoreCase(element2.getTagName())) {
                    cOSDictionary.setItem(COSName.getPDFName(attribute), (COSBase) parseArrayElement(element2));
                } else {
                    element2.getTagName();
                }
            }
        }
        return cOSDictionary;
    }

    private COSDictionary parseStampAnnotationAppearanceXML(Element element) {
        COSDictionary cOSDictionary = new COSDictionary();
        cOSDictionary.setItem(COSName.N, (COSBase) new COSStream());
        NodeList childNodes = element.getChildNodes();
        element.getAttribute("KEY");
        element.getTagName();
        element.getNodeName();
        childNodes.getLength();
        if (!"AP".equals(element.getAttribute("KEY"))) {
            element.getTagName();
            element.getAttribute("KEY");
            return cOSDictionary;
        }
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node item = childNodes.item(i10);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                if ("STREAM".equalsIgnoreCase(element2.getTagName())) {
                    element2.getAttribute("KEY");
                    element2.getTagName();
                    cOSDictionary.setItem(element2.getAttribute("KEY"), (COSBase) parseStreamElement(element2));
                    element2.getAttribute("KEY");
                } else {
                    element2.getTagName();
                }
            }
        }
        return cOSDictionary;
    }

    private COSStream parseStreamElement(Element element) {
        element.getAttribute("KEY");
        COSStream cOSStream = new COSStream();
        NodeList childNodes = element.getChildNodes();
        element.getAttribute("KEY");
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node item = childNodes.item(i10);
            if (item instanceof Element) {
                Element element2 = (Element) item;
                String attribute = element2.getAttribute("KEY");
                String attribute2 = element2.getAttribute("VAL");
                element2.getTagName();
                if ("INT".equalsIgnoreCase(element2.getTagName())) {
                    if (!"Length".equals(attribute)) {
                        cOSStream.setInt(COSName.getPDFName(attribute), Integer.parseInt(attribute2));
                    }
                } else if ("FIXED".equalsIgnoreCase(element2.getTagName())) {
                    cOSStream.setFloat(COSName.getPDFName(attribute), Float.parseFloat(attribute2));
                } else if ("NAME".equalsIgnoreCase(element2.getTagName())) {
                    cOSStream.setName(COSName.getPDFName(attribute), attribute2);
                } else if ("BOOL".equalsIgnoreCase(element2.getTagName())) {
                    cOSStream.setBoolean(COSName.getPDFName(attribute), Boolean.parseBoolean(attribute2));
                } else if ("ARRAY".equalsIgnoreCase(element2.getTagName())) {
                    cOSStream.setItem(COSName.getPDFName(attribute), (COSBase) parseArrayElement(element2));
                } else if ("DICT".equalsIgnoreCase(element2.getTagName())) {
                    cOSStream.setItem(COSName.getPDFName(attribute), (COSBase) parseDictElement(element2));
                } else if ("STREAM".equalsIgnoreCase(element2.getTagName())) {
                    cOSStream.setItem(COSName.getPDFName(attribute), (COSBase) parseStreamElement(element2));
                } else if ("DATA".equalsIgnoreCase(element2.getTagName())) {
                    element2.getAttribute("ENCODING");
                    OutputStream outputStream = null;
                    if ("HEX".equals(element2.getAttribute("ENCODING"))) {
                        try {
                            outputStream = cOSStream.createRawOutputStream();
                            outputStream.write(Hex.decodeHex(element2.getTextContent()));
                        } finally {
                        }
                    } else if ("ASCII".equals(element2.getAttribute("ENCODING"))) {
                        try {
                            outputStream = cOSStream.createOutputStream();
                            outputStream.write(element2.getTextContent().getBytes());
                            IOUtils.closeQuietly(outputStream);
                        } finally {
                        }
                    } else {
                        element2.getAttribute("ENCODING");
                    }
                } else {
                    element2.getTagName();
                }
            }
        }
        return cOSStream;
    }

    public FDFAnnotationStamp(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationStamp(Element element) {
        super(element);
        this.annot.setName(COSName.SUBTYPE, "Stamp");
        try {
            String evaluate = XPathFactory.newInstance().newXPath().evaluate("appearance", element);
            try {
                byte[] decodeBase64 = Hex.decodeBase64(evaluate);
                if (evaluate == null || evaluate.isEmpty()) {
                    return;
                }
                new String(decodeBase64);
                Element documentElement = com.tom_roush.pdfbox.util.XMLUtil.parse(new ByteArrayInputStream(decodeBase64)).getDocumentElement();
                if ("dict".equalsIgnoreCase(documentElement.getNodeName())) {
                    this.annot.setItem(COSName.AP, (COSBase) parseStampAnnotationAppearanceXML(documentElement));
                    return;
                }
                throw new IOException("Error while reading stamp document, root should be 'dict' and not '" + documentElement.getNodeName() + OperatorName.SHOW_TEXT_LINE);
            } catch (IllegalArgumentException unused) {
            }
        } catch (XPathExpressionException e10) {
            e10.toString();
        }
    }
}
