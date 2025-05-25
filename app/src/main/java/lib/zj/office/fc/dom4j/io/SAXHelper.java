package lib.zj.office.fc.dom4j.io;

import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/* loaded from: classes3.dex */
class SAXHelper {
    private static boolean loggedWarning = true;

    public static XMLReader createXMLReader(boolean z10) {
        XMLReader createXMLReaderViaJAXP = createXMLReaderViaJAXP(z10, true);
        if (createXMLReaderViaJAXP == null) {
            try {
                createXMLReaderViaJAXP = XMLReaderFactory.createXMLReader();
            } catch (Exception e10) {
                if (isVerboseErrorReporting()) {
                    e10.printStackTrace();
                }
                throw new SAXException(e10);
            }
        }
        if (createXMLReaderViaJAXP != null) {
            return createXMLReaderViaJAXP;
        }
        throw new SAXException("Couldn't create SAX reader");
    }

    public static XMLReader createXMLReaderViaJAXP(boolean z10, boolean z11) {
        try {
            return JAXPHelper.createXMLReader(z10, z11);
        } catch (Throwable th2) {
            if (!loggedWarning) {
                loggedWarning = true;
                if (isVerboseErrorReporting()) {
                    th2.printStackTrace();
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    public static boolean isVerboseErrorReporting() {
        try {
            String property = System.getProperty("org.dom4j.verbose");
            if (property != null) {
                property.equalsIgnoreCase("true");
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public static boolean setParserFeature(XMLReader xMLReader, String str, boolean z10) {
        try {
            xMLReader.setFeature(str, z10);
            return true;
        } catch (SAXNotRecognizedException | SAXNotSupportedException unused) {
            return false;
        }
    }

    public static boolean setParserProperty(XMLReader xMLReader, String str, Object obj) {
        try {
            xMLReader.setProperty(str, obj);
            return true;
        } catch (SAXNotRecognizedException | SAXNotSupportedException unused) {
            return false;
        }
    }
}
