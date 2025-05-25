package lib.zj.office.fc.openxml4j.opc.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentException;
import lib.zj.office.fc.dom4j.DocumentHelper;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.ElementPath;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.exceptions.InvalidFormatException;
import lib.zj.office.fc.openxml4j.exceptions.InvalidOperationException;
import lib.zj.office.fc.openxml4j.exceptions.OpenXML4JRuntimeException;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackagePartName;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;

/* loaded from: classes3.dex */
public class ContentTypeManager {
    public static final String CONTENT_TYPES_PART_NAME = "[Content_Types].xml";
    private static final String CONTENT_TYPE_ATTRIBUTE_NAME = "ContentType";
    private static final String DEFAULT_TAG_NAME = "Default";
    private static final String EXTENSION_ATTRIBUTE_NAME = "Extension";
    private static final String OVERRIDE_TAG_NAME = "Override";
    private static final String PART_NAME_ATTRIBUTE_NAME = "PartName";
    public static final String TYPES_NAMESPACE_URI = "http://schemas.openxmlformats.org/package/2006/content-types";
    private static final String TYPES_TAG_NAME = "Types";
    protected ZipPackage container;
    private TreeMap<String, String> defaultContentType = new TreeMap<>();
    private TreeMap<PackagePartName, String> overrideContentType;

    public ContentTypeManager(InputStream inputStream, ZipPackage zipPackage) {
        this.container = zipPackage;
        if (inputStream != null) {
            try {
                parseContentTypesFile(inputStream);
            } catch (InvalidFormatException unused) {
                throw new InvalidFormatException("Can't read content types part !");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDefaultContentType(String str, String str2) {
        this.defaultContentType.put(str.toLowerCase(), str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOverrideContentType(PackagePartName packagePartName, String str) {
        if (this.overrideContentType == null) {
            this.overrideContentType = new TreeMap<>();
        }
        this.overrideContentType.put(packagePartName, str);
    }

    private void appendDefaultType(Element element, Map.Entry<String, String> entry) {
        element.addElement(DEFAULT_TAG_NAME).addAttribute(EXTENSION_ATTRIBUTE_NAME, entry.getKey()).addAttribute(CONTENT_TYPE_ATTRIBUTE_NAME, entry.getValue());
    }

    private void appendSpecificTypes(Element element, Map.Entry<PackagePartName, String> entry) {
        element.addElement(OVERRIDE_TAG_NAME).addAttribute(PART_NAME_ATTRIBUTE_NAME, entry.getKey().getName()).addAttribute(CONTENT_TYPE_ATTRIBUTE_NAME, entry.getValue());
    }

    private void parseContentTypesFile(InputStream inputStream) {
        try {
            SAXReader sAXReader = new SAXReader();
            XLSXSaxHandler xLSXSaxHandler = new XLSXSaxHandler();
            sAXReader.addHandler("/Types/Default", xLSXSaxHandler);
            sAXReader.addHandler("/Types/Override", xLSXSaxHandler);
            sAXReader.read(inputStream);
        } catch (DocumentException e10) {
            throw new InvalidFormatException(e10.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r1 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addContentType(lib.zj.office.fc.openxml4j.opc.PackagePartName r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getExtension()
            java.lang.String r0 = r0.toLowerCase()
            int r1 = r0.length()
            if (r1 == 0) goto L26
            java.util.TreeMap<java.lang.String, java.lang.String> r1 = r2.defaultContentType
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L1f
            java.util.TreeMap<java.lang.String, java.lang.String> r1 = r2.defaultContentType
            boolean r1 = r1.containsValue(r4)
            if (r1 != 0) goto L20
            goto L26
        L1f:
            r1 = 0
        L20:
            if (r1 != 0) goto L29
            r2.addDefaultContentType(r0, r4)
            goto L29
        L26:
            r2.addOverrideContentType(r3, r4)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.openxml4j.opc.internal.ContentTypeManager.addContentType(lib.zj.office.fc.openxml4j.opc.PackagePartName, java.lang.String):void");
    }

    public void clearAll() {
        this.defaultContentType.clear();
        TreeMap<PackagePartName, String> treeMap = this.overrideContentType;
        if (treeMap != null) {
            treeMap.clear();
        }
    }

    public void clearOverrideContentTypes() {
        TreeMap<PackagePartName, String> treeMap = this.overrideContentType;
        if (treeMap != null) {
            treeMap.clear();
        }
    }

    public String getContentType(PackagePartName packagePartName) {
        if (packagePartName != null) {
            TreeMap<PackagePartName, String> treeMap = this.overrideContentType;
            if (treeMap != null && treeMap.containsKey(packagePartName)) {
                return this.overrideContentType.get(packagePartName);
            }
            String lowerCase = packagePartName.getExtension().toLowerCase();
            if (this.defaultContentType.containsKey(lowerCase)) {
                return this.defaultContentType.get(lowerCase);
            }
            ZipPackage zipPackage = this.container;
            if (zipPackage != null && zipPackage.getPart(packagePartName) != null) {
                throw new OpenXML4JRuntimeException("Rule M2.4 exception : this error should NEVER happen, if so please send a mail to the developers team, thanks !");
            }
            return null;
        }
        throw new IllegalArgumentException("partName");
    }

    public boolean isContentTypeRegister(String str) {
        TreeMap<PackagePartName, String> treeMap;
        if (str != null) {
            if (!this.defaultContentType.values().contains(str) && ((treeMap = this.overrideContentType) == null || !treeMap.values().contains(str))) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("contentType");
    }

    public void removeContentType(PackagePartName packagePartName) {
        if (packagePartName != null) {
            TreeMap<PackagePartName, String> treeMap = this.overrideContentType;
            if (treeMap != null && treeMap.get(packagePartName) != null) {
                this.overrideContentType.remove(packagePartName);
                return;
            }
            String extension = packagePartName.getExtension();
            ZipPackage zipPackage = this.container;
            boolean z10 = true;
            if (zipPackage != null) {
                try {
                    Iterator<PackagePart> it = zipPackage.getParts().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        PackagePart next = it.next();
                        if (!next.getPartName().equals(packagePartName) && next.getPartName().getExtension().equalsIgnoreCase(extension)) {
                            z10 = false;
                            break;
                        }
                    }
                } catch (InvalidFormatException e10) {
                    throw new InvalidOperationException(e10.getMessage());
                }
            }
            if (z10) {
                this.defaultContentType.remove(extension);
            }
            ZipPackage zipPackage2 = this.container;
            if (zipPackage2 != null) {
                try {
                    Iterator<PackagePart> it2 = zipPackage2.getParts().iterator();
                    while (it2.hasNext()) {
                        PackagePart next2 = it2.next();
                        if (!next2.getPartName().equals(packagePartName) && getContentType(next2.getPartName()) == null) {
                            throw new InvalidOperationException("Rule M2.4 is not respected: Nor a default element or override element is associated with the part: " + next2.getPartName().getName());
                        }
                    }
                    return;
                } catch (InvalidFormatException e11) {
                    throw new InvalidOperationException(e11.getMessage());
                }
            }
            return;
        }
        throw new IllegalArgumentException("partName");
    }

    public boolean save(OutputStream outputStream) {
        Document createDocument = DocumentHelper.createDocument();
        Element addElement = createDocument.addElement(new QName(TYPES_TAG_NAME, Namespace.get("", "http://schemas.openxmlformats.org/package/2006/content-types")));
        for (Map.Entry<String, String> entry : this.defaultContentType.entrySet()) {
            appendDefaultType(addElement, entry);
        }
        TreeMap<PackagePartName, String> treeMap = this.overrideContentType;
        if (treeMap != null) {
            for (Map.Entry<PackagePartName, String> entry2 : treeMap.entrySet()) {
                appendSpecificTypes(addElement, entry2);
            }
        }
        createDocument.normalize();
        return saveImpl(createDocument, outputStream);
    }

    public boolean saveImpl(Document document, OutputStream outputStream) {
        return true;
    }

    /* loaded from: classes3.dex */
    public class XLSXSaxHandler implements ElementHandler {
        public XLSXSaxHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            Element current = elementPath.getCurrent();
            String name = current.getName();
            if (name.equals(ContentTypeManager.DEFAULT_TAG_NAME)) {
                ContentTypeManager.this.addDefaultContentType(current.attribute(ContentTypeManager.EXTENSION_ATTRIBUTE_NAME).getValue(), current.attribute(ContentTypeManager.CONTENT_TYPE_ATTRIBUTE_NAME).getValue());
            } else if (name.equals(ContentTypeManager.OVERRIDE_TAG_NAME)) {
                try {
                    ContentTypeManager.this.addOverrideContentType(PackagingURIHelper.createPartName(new URI(current.attribute(ContentTypeManager.PART_NAME_ATTRIBUTE_NAME).getValue())), current.attribute(ContentTypeManager.CONTENT_TYPE_ATTRIBUTE_NAME).getValue());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            current.detach();
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onStart(ElementPath elementPath) {
        }
    }
}
