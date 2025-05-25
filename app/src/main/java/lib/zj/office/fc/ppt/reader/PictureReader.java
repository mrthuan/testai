package lib.zj.office.fc.ppt.reader;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import fi.a;
import fi.b;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipTypes;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;

/* loaded from: classes3.dex */
public class PictureReader {
    private static PictureReader picReader = new PictureReader();
    private Map<String, b> spIDAnchors;
    private Map<String, String> spIDs;
    private PackagePart vmlDrawingPart;

    private void getShapeIds(Boolean bool) {
        Element element;
        String text;
        String[] split;
        if (this.vmlDrawingPart != null) {
            SAXReader sAXReader = new SAXReader();
            InputStream inputStream = this.vmlDrawingPart.getInputStream();
            Element rootElement = sAXReader.read(inputStream).getRootElement();
            if (rootElement != null) {
                if (this.spIDs == null) {
                    this.spIDs = new Hashtable();
                }
                if (bool.booleanValue() && this.spIDAnchors == null) {
                    this.spIDAnchors = new Hashtable();
                }
                for (Element element2 : rootElement.elements("shape")) {
                    Element element3 = element2.element("imagedata");
                    if (element3 != null) {
                        String attributeValue = element2.attributeValue("spid");
                        if (bool.booleanValue()) {
                            if (attributeValue == null) {
                                attributeValue = element2.attributeValue(FacebookMediationAdapter.KEY_ID);
                            }
                            if (attributeValue != null && attributeValue.length() > 8) {
                                String substring = attributeValue.substring(8);
                                this.spIDs.put(substring, element3.attributeValue("relid"));
                                Element element4 = element2.element("ClientData");
                                if (element4 != null && (element = element4.element("Anchor")) != null && (text = element.getText()) != null && text.length() > 0 && (split = text.trim().replaceAll(" ", "").split(",")) != null && split.length == 8) {
                                    a aVar = new a();
                                    aVar.f17289b = (short) Integer.parseInt(split[0]);
                                    aVar.c = (short) Integer.parseInt(split[1]);
                                    aVar.f17288a = (short) Integer.parseInt(split[2]);
                                    aVar.f17290d = (short) Integer.parseInt(split[3]);
                                    a aVar2 = new a();
                                    aVar2.f17289b = (short) Integer.parseInt(split[4]);
                                    aVar2.c = (short) Integer.parseInt(split[5]);
                                    aVar2.f17288a = (short) Integer.parseInt(split[6]);
                                    aVar2.f17290d = (short) Integer.parseInt(split[7]);
                                    b bVar = new b((short) 1);
                                    bVar.f17292b = aVar;
                                    bVar.c = aVar2;
                                    this.spIDAnchors.put(substring, bVar);
                                }
                            } else {
                                return;
                            }
                        } else if (attributeValue != null && attributeValue.length() > 0) {
                            this.spIDs.put(attributeValue, element3.attributeValue("relid"));
                        } else {
                            this.spIDs.put(element2.attributeValue(FacebookMediationAdapter.KEY_ID), element3.attributeValue("relid"));
                        }
                    }
                }
            }
            inputStream.close();
        }
    }

    public static PictureReader instance() {
        return picReader;
    }

    public void dispose() {
        Map<String, String> map = this.spIDs;
        if (map != null) {
            map.clear();
        }
        Map<String, b> map2 = this.spIDAnchors;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                a aVar = this.spIDAnchors.get(str).f17292b;
            }
            this.spIDAnchors.clear();
        }
    }

    public b getExcelShapeAnchor(String str) {
        Map<String, b> map;
        if (str != null && (map = this.spIDAnchors) != null && map.size() > 0) {
            return this.spIDAnchors.get(str);
        }
        return null;
    }

    public PackagePart getOLEPart(ZipPackage zipPackage, PackagePart packagePart, String str, Boolean bool) {
        String str2;
        PackageRelationship relationship;
        if (this.vmlDrawingPart == null) {
            Iterator<PackageRelationship> it = packagePart.getRelationshipsByType(PackageRelationshipTypes.VMLDRAWING_PART).iterator();
            while (it.hasNext()) {
                this.vmlDrawingPart = zipPackage.getPart(it.next().getTargetURI());
                getShapeIds(bool);
            }
        }
        Map<String, String> map = this.spIDs;
        if (map != null && (str2 = map.get(str)) != null && (relationship = this.vmlDrawingPart.getRelationship(str2)) != null) {
            return zipPackage.getPart(relationship.getTargetURI());
        }
        return null;
    }
}
