package lib.zj.office.fc.openxml4j.opc;

import java.util.TreeMap;
import lib.zj.office.fc.openxml4j.exceptions.InvalidOperationException;

/* loaded from: classes3.dex */
public final class PackagePartCollection extends TreeMap<PackagePartName, PackagePart> {
    private static final long serialVersionUID = 2515031135957635515L;

    @Override // java.util.TreeMap, java.util.AbstractMap
    public Object clone() {
        return super.clone();
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public PackagePart put(PackagePartName packagePartName, PackagePart packagePart) {
        if (!containsKey(packagePartName)) {
            return (PackagePart) super.put((PackagePartCollection) packagePartName, (PackagePartName) packagePart);
        }
        throw new InvalidOperationException("You can't add a part with a part name derived from another part ! [M1.11]");
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public PackagePart remove(Object obj) {
        return (PackagePart) super.remove(obj);
    }
}
