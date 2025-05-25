package com.tom_roush.pdfbox.pdfparser;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObjectKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class XrefTrailerResolver {
    private final Map<Long, XrefTrailerObj> bytePosToXrefMap = new HashMap();
    private XrefTrailerObj curXrefTrailerObj = null;
    private XrefTrailerObj resolvedXrefTrailer = null;

    /* loaded from: classes2.dex */
    public enum XRefType {
        TABLE,
        STREAM
    }

    /* loaded from: classes2.dex */
    public static class XrefTrailerObj {
        protected COSDictionary trailer;
        private final Map<COSObjectKey, Long> xrefTable;
        private XRefType xrefType;

        public /* synthetic */ XrefTrailerObj(int i10) {
            this();
        }

        public void reset() {
            this.xrefTable.clear();
        }

        private XrefTrailerObj() {
            this.trailer = null;
            this.xrefTable = new HashMap();
            this.xrefType = XRefType.TABLE;
        }
    }

    public Set<Long> getContainedObjectNumbers(int i10) {
        if (this.resolvedXrefTrailer == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        long j10 = -i10;
        for (Map.Entry entry : this.resolvedXrefTrailer.xrefTable.entrySet()) {
            if (((Long) entry.getValue()).longValue() == j10) {
                hashSet.add(Long.valueOf(((COSObjectKey) entry.getKey()).getNumber()));
            }
        }
        return hashSet;
    }

    public COSDictionary getCurrentTrailer() {
        return this.curXrefTrailerObj.trailer;
    }

    public final COSDictionary getFirstTrailer() {
        if (this.bytePosToXrefMap.isEmpty()) {
            return null;
        }
        return this.bytePosToXrefMap.get(new TreeSet(this.bytePosToXrefMap.keySet()).first()).trailer;
    }

    public final COSDictionary getLastTrailer() {
        if (this.bytePosToXrefMap.isEmpty()) {
            return null;
        }
        return this.bytePosToXrefMap.get(new TreeSet(this.bytePosToXrefMap.keySet()).last()).trailer;
    }

    public COSDictionary getTrailer() {
        XrefTrailerObj xrefTrailerObj = this.resolvedXrefTrailer;
        if (xrefTrailerObj == null) {
            return null;
        }
        return xrefTrailerObj.trailer;
    }

    public final int getTrailerCount() {
        return this.bytePosToXrefMap.size();
    }

    public Map<COSObjectKey, Long> getXrefTable() {
        XrefTrailerObj xrefTrailerObj = this.resolvedXrefTrailer;
        if (xrefTrailerObj != null) {
            return xrefTrailerObj.xrefTable;
        }
        return null;
    }

    public XRefType getXrefType() {
        XrefTrailerObj xrefTrailerObj = this.resolvedXrefTrailer;
        if (xrefTrailerObj != null) {
            return xrefTrailerObj.xrefType;
        }
        return null;
    }

    public void nextXrefObj(long j10, XRefType xRefType) {
        this.curXrefTrailerObj = new XrefTrailerObj(0);
        this.bytePosToXrefMap.put(Long.valueOf(j10), this.curXrefTrailerObj);
        this.curXrefTrailerObj.xrefType = xRefType;
    }

    public void reset() {
        for (XrefTrailerObj xrefTrailerObj : this.bytePosToXrefMap.values()) {
            xrefTrailerObj.reset();
        }
        this.curXrefTrailerObj = null;
        this.resolvedXrefTrailer = null;
    }

    public void setStartxref(long j10) {
        if (this.resolvedXrefTrailer != null) {
            return;
        }
        XrefTrailerObj xrefTrailerObj = new XrefTrailerObj(0);
        this.resolvedXrefTrailer = xrefTrailerObj;
        xrefTrailerObj.trailer = new COSDictionary();
        XrefTrailerObj xrefTrailerObj2 = this.bytePosToXrefMap.get(Long.valueOf(j10));
        ArrayList arrayList = new ArrayList();
        if (xrefTrailerObj2 != null) {
            this.resolvedXrefTrailer.xrefType = xrefTrailerObj2.xrefType;
            arrayList.add(Long.valueOf(j10));
            do {
                COSDictionary cOSDictionary = xrefTrailerObj2.trailer;
                if (cOSDictionary == null) {
                    break;
                }
                long j11 = cOSDictionary.getLong(COSName.PREV, -1L);
                if (j11 == -1 || (xrefTrailerObj2 = this.bytePosToXrefMap.get(Long.valueOf(j11))) == null) {
                    break;
                }
                arrayList.add(Long.valueOf(j11));
            } while (arrayList.size() < this.bytePosToXrefMap.size());
            Collections.reverse(arrayList);
        } else {
            arrayList.addAll(this.bytePosToXrefMap.keySet());
            Collections.sort(arrayList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            XrefTrailerObj xrefTrailerObj3 = this.bytePosToXrefMap.get((Long) it.next());
            COSDictionary cOSDictionary2 = xrefTrailerObj3.trailer;
            if (cOSDictionary2 != null) {
                this.resolvedXrefTrailer.trailer.addAll(cOSDictionary2);
            }
            this.resolvedXrefTrailer.xrefTable.putAll(xrefTrailerObj3.xrefTable);
        }
    }

    public void setTrailer(COSDictionary cOSDictionary) {
        XrefTrailerObj xrefTrailerObj = this.curXrefTrailerObj;
        if (xrefTrailerObj == null) {
            return;
        }
        xrefTrailerObj.trailer = cOSDictionary;
    }

    public void setXRef(COSObjectKey cOSObjectKey, long j10) {
        XrefTrailerObj xrefTrailerObj = this.curXrefTrailerObj;
        if (xrefTrailerObj == null) {
            cOSObjectKey.getNumber();
        } else if (!xrefTrailerObj.xrefTable.containsKey(cOSObjectKey)) {
            this.curXrefTrailerObj.xrefTable.put(cOSObjectKey, Long.valueOf(j10));
        }
    }
}
