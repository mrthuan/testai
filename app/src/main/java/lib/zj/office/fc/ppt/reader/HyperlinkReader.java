package lib.zj.office.fc.ppt.reader;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;
import lib.zj.office.fc.openxml4j.opc.PackageRelationshipTypes;
import lib.zj.office.system.f;

/* loaded from: classes3.dex */
public class HyperlinkReader {
    private static HyperlinkReader hyperlink = new HyperlinkReader();
    private Map<String, Integer> link;

    public static HyperlinkReader instance() {
        return hyperlink;
    }

    public void disposs() {
        Map<String, Integer> map = this.link;
        if (map != null) {
            map.clear();
            this.link = null;
        }
    }

    public void getHyperlinkList(f fVar, PackagePart packagePart) {
        int a10;
        this.link = new Hashtable();
        Iterator<PackageRelationship> it = packagePart.getRelationshipsByType(PackageRelationshipTypes.HYPERLINK_PART).iterator();
        while (it.hasNext()) {
            PackageRelationship next = it.next();
            String id2 = next.getId();
            if (getLinkIndex(id2) < 0 && (a10 = fVar.o().d().a(1, next.getTargetURI().toString())) >= 0) {
                this.link.put(id2, Integer.valueOf(a10));
            }
        }
    }

    public int getLinkIndex(String str) {
        Integer num;
        Map<String, Integer> map = this.link;
        if (map != null && map.size() > 0 && (num = this.link.get(str)) != null) {
            return num.intValue();
        }
        return -1;
    }
}
