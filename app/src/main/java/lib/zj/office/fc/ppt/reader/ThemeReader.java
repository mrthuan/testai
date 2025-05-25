package lib.zj.office.fc.ppt.reader;

import android.graphics.Color;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.PackagePart;

/* loaded from: classes3.dex */
public class ThemeReader {
    private static ThemeReader themeReader = new ThemeReader();

    public static ThemeReader instance() {
        return themeReader;
    }

    public Map<String, Integer> getThemeColorMap(PackagePart packagePart) {
        Element element;
        SAXReader sAXReader = new SAXReader();
        InputStream inputStream = packagePart.getInputStream();
        Element rootElement = sAXReader.read(inputStream).getRootElement();
        if (rootElement != null && (element = rootElement.element("themeElements")) != null) {
            Element element2 = element.element("clrScheme");
            HashMap hashMap = new HashMap();
            Iterator elementIterator = element2.elementIterator();
            while (elementIterator.hasNext()) {
                Element element3 = (Element) elementIterator.next();
                String name = element3.getName();
                Element element4 = element3.element("srgbClr");
                Element element5 = element3.element("sysClr");
                if (element4 != null) {
                    try {
                        hashMap.put(name, Integer.valueOf(Color.parseColor("#" + element4.attributeValue("val"))));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else if (element5 != null) {
                    try {
                        hashMap.put(name, Integer.valueOf(Color.parseColor("#" + element5.attributeValue("lastClr"))));
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                } else {
                    hashMap.put(name, -1);
                }
            }
            return hashMap;
        }
        inputStream.close();
        return null;
    }
}
