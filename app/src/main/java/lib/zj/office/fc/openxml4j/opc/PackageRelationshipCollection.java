package lib.zj.office.fc.openxml4j.opc;

import a0.d;
import a6.h;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.ElementHandler;
import lib.zj.office.fc.dom4j.ElementPath;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.exceptions.InvalidFormatException;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public final class PackageRelationshipCollection implements Iterable<PackageRelationship> {
    private static POILogger logger = POILogFactory.getLogger(PackageRelationshipCollection.class);
    private ZipPackage container;
    boolean fCorePropertiesRelationship;
    private PackagePartName partName;
    private PackagePart relationshipPart;
    private TreeMap<String, PackageRelationship> relationshipsByID;
    private TreeMap<String, PackageRelationship> relationshipsByType;
    private PackagePart sourcePart;

    public PackageRelationshipCollection() {
        this.relationshipsByID = new TreeMap<>();
        this.relationshipsByType = new TreeMap<>();
    }

    private static PackagePartName getRelationshipPartName(PackagePart packagePart) {
        PackagePartName partName;
        if (packagePart == null) {
            partName = PackagingURIHelper.PACKAGE_ROOT_PART_NAME;
        } else {
            partName = packagePart.getPartName();
        }
        return PackagingURIHelper.getRelationshipPartName(partName);
    }

    private void parseRelationshipsPart(PackagePart packagePart) {
        try {
            this.fCorePropertiesRelationship = false;
            SAXReader sAXReader = new SAXReader();
            POILogger pOILogger = logger;
            int i10 = POILogger.DEBUG;
            pOILogger.log(i10, "Parsing relationship: " + packagePart.getPartName());
            InputStream inputStream = packagePart.getInputStream();
            sAXReader.addHandler("/Relationships/Relationship", new SaxHandler());
            sAXReader.read(inputStream);
            inputStream.close();
        } catch (Exception e10) {
            logger.log(POILogger.ERROR, (Throwable) e10);
            throw new InvalidFormatException(e10.getMessage());
        }
    }

    public void addRelationship(PackageRelationship packageRelationship) {
        this.relationshipsByID.put(packageRelationship.getId(), packageRelationship);
        this.relationshipsByType.put(packageRelationship.getRelationshipType(), packageRelationship);
    }

    public void clear() {
        this.relationshipsByID.clear();
        this.relationshipsByType.clear();
    }

    public PackageRelationship getRelationship(int i10) {
        if (i10 >= 0 && i10 <= this.relationshipsByID.values().size()) {
            int i11 = 0;
            for (PackageRelationship packageRelationship : this.relationshipsByID.values()) {
                int i12 = i11 + 1;
                if (i10 == i11) {
                    return packageRelationship;
                }
                i11 = i12;
            }
            return null;
        }
        throw new IllegalArgumentException("index");
    }

    public PackageRelationship getRelationshipByID(String str) {
        return this.relationshipsByID.get(str);
    }

    public PackageRelationshipCollection getRelationships(String str) {
        return new PackageRelationshipCollection(this, str);
    }

    @Override // java.lang.Iterable
    public Iterator<PackageRelationship> iterator() {
        return this.relationshipsByID.values().iterator();
    }

    public void removeRelationship(String str) {
        PackageRelationship packageRelationship;
        TreeMap<String, PackageRelationship> treeMap = this.relationshipsByID;
        if (treeMap == null || this.relationshipsByType == null || (packageRelationship = treeMap.get(str)) == null) {
            return;
        }
        this.relationshipsByID.remove(packageRelationship.getId());
        this.relationshipsByType.values().remove(packageRelationship);
    }

    public int size() {
        return this.relationshipsByID.values().size();
    }

    public String toString() {
        String str;
        String c;
        String c10;
        String c11;
        if (this.relationshipsByID == null) {
            str = "relationshipsByID=null";
        } else {
            str = this.relationshipsByID.size() + " relationship(s) = [";
        }
        PackagePart packagePart = this.relationshipPart;
        if (packagePart != null && packagePart._partName != null) {
            StringBuilder g10 = d.g(str, ",");
            g10.append(this.relationshipPart._partName);
            c = g10.toString();
        } else {
            c = h.c(str, ",relationshipPart=null");
        }
        PackagePart packagePart2 = this.sourcePart;
        if (packagePart2 != null && packagePart2._partName != null) {
            StringBuilder g11 = d.g(c, ",");
            g11.append(this.sourcePart._partName);
            c10 = g11.toString();
        } else {
            c10 = h.c(c, ",sourcePart=null");
        }
        if (this.partName != null) {
            StringBuilder g12 = d.g(c10, ",");
            g12.append(this.partName);
            c11 = g12.toString();
        } else {
            c11 = h.c(c10, ",uri=null)");
        }
        return h.c(c11, "]");
    }

    public Iterator<PackageRelationship> iterator(String str) {
        ArrayList arrayList = new ArrayList();
        for (PackageRelationship packageRelationship : this.relationshipsByID.values()) {
            if (packageRelationship.getRelationshipType().equals(str)) {
                arrayList.add(packageRelationship);
            }
        }
        return arrayList.iterator();
    }

    public PackageRelationship addRelationship(URI uri, TargetMode targetMode, String str, String str2) {
        String str3;
        String sb2;
        if (str2 == null) {
            int i10 = 0;
            do {
                StringBuilder sb3 = new StringBuilder("rId");
                i10++;
                sb3.append(i10);
                sb2 = sb3.toString();
            } while (this.relationshipsByID.get(sb2) != null);
            str3 = sb2;
        } else {
            str3 = str2;
        }
        PackageRelationship packageRelationship = new PackageRelationship(this.container, this.sourcePart, uri, targetMode, str, str3);
        this.relationshipsByID.put(packageRelationship.getId(), packageRelationship);
        this.relationshipsByType.put(packageRelationship.getRelationshipType(), packageRelationship);
        return packageRelationship;
    }

    public PackageRelationshipCollection(PackageRelationshipCollection packageRelationshipCollection, String str) {
        this();
        for (PackageRelationship packageRelationship : packageRelationshipCollection.relationshipsByID.values()) {
            if (str == null || packageRelationship.getRelationshipType().equals(str)) {
                addRelationship(packageRelationship);
            }
        }
    }

    public void removeRelationship(PackageRelationship packageRelationship) {
        if (packageRelationship != null) {
            this.relationshipsByID.values().remove(packageRelationship);
            this.relationshipsByType.values().remove(packageRelationship);
            return;
        }
        throw new IllegalArgumentException("rel");
    }

    public PackageRelationshipCollection(ZipPackage zipPackage) {
        this(zipPackage, (PackagePart) null);
    }

    public PackageRelationshipCollection(PackagePart packagePart) {
        this(packagePart._container, packagePart);
    }

    public PackageRelationshipCollection(ZipPackage zipPackage, PackagePart packagePart) {
        this();
        if (zipPackage != null) {
            if (packagePart != null && packagePart.isRelationshipPart()) {
                throw new IllegalArgumentException("part");
            }
            this.container = zipPackage;
            this.sourcePart = packagePart;
            PackagePartName relationshipPartName = getRelationshipPartName(packagePart);
            this.partName = relationshipPartName;
            if (zipPackage.containPart(relationshipPartName)) {
                PackagePart part = zipPackage.getPart(this.partName);
                this.relationshipPart = part;
                parseRelationshipsPart(part);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("container");
    }

    /* loaded from: classes3.dex */
    public class SaxHandler implements ElementHandler {
        public SaxHandler() {
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onEnd(ElementPath elementPath) {
            String value;
            Element current = elementPath.getCurrent();
            try {
                if (current.getName().equals(PackageRelationship.RELATIONSHIP_TAG_NAME)) {
                    String value2 = current.attribute(PackageRelationship.ID_ATTRIBUTE_NAME).getValue();
                    String value3 = current.attribute(PackageRelationship.TYPE_ATTRIBUTE_NAME).getValue();
                    if (value3.equals(PackageRelationshipTypes.CORE_PROPERTIES)) {
                        PackageRelationshipCollection packageRelationshipCollection = PackageRelationshipCollection.this;
                        if (!packageRelationshipCollection.fCorePropertiesRelationship) {
                            packageRelationshipCollection.fCorePropertiesRelationship = true;
                        } else {
                            throw new InvalidFormatException("OPC Compliance error [M4.1]: there is more than one core properties relationship in the package !");
                        }
                    }
                    Attribute attribute = current.attribute(PackageRelationship.TARGET_MODE_ATTRIBUTE_NAME);
                    TargetMode targetMode = TargetMode.INTERNAL;
                    if (attribute != null && !attribute.getValue().toLowerCase().equals("internal")) {
                        targetMode = TargetMode.EXTERNAL;
                    }
                    try {
                        value = current.attribute(PackageRelationship.TARGET_ATTRIBUTE_NAME).getValue();
                        PackageRelationshipCollection.this.addRelationship(PackagingURIHelper.toURI(value), targetMode, value3, value2);
                    } catch (URISyntaxException e10) {
                        POILogger pOILogger = PackageRelationshipCollection.logger;
                        int i10 = POILogger.ERROR;
                        pOILogger.log(i10, (Object) ("Cannot convert " + value + " in a valid relationship URI-> ignored"), (Throwable) e10);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            current.detach();
        }

        @Override // lib.zj.office.fc.dom4j.ElementHandler
        public void onStart(ElementPath elementPath) {
        }
    }
}
