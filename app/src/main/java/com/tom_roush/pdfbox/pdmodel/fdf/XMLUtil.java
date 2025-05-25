package com.tom_roush.pdfbox.pdmodel.fdf;

import java.io.InputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

@Deprecated
/* loaded from: classes2.dex */
final class XMLUtil {
    private XMLUtil() {
    }

    public static String getNodeValue(Element element) {
        return com.tom_roush.pdfbox.util.XMLUtil.getNodeValue(element);
    }

    public static Document parse(InputStream inputStream) {
        return com.tom_roush.pdfbox.util.XMLUtil.parse(inputStream);
    }
}
