package lib.zj.office.fc.dom4j.util;

import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.QName;

/* loaded from: classes3.dex */
public class AttributeHelper {
    public static boolean booleanValue(Element element, String str) {
        return booleanValue(element.attribute(str));
    }

    public static boolean booleanValue(Element element, QName qName) {
        return booleanValue(element.attribute(qName));
    }

    public static boolean booleanValue(Attribute attribute) {
        Object data;
        if (attribute == null || (data = attribute.getData()) == null) {
            return false;
        }
        if (data instanceof Boolean) {
            return ((Boolean) data).booleanValue();
        }
        return "true".equalsIgnoreCase(data.toString());
    }
}
