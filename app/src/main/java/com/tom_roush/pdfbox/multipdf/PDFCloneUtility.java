package com.tom_roush.pdfbox.multipdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class PDFCloneUtility {
    private final PDDocument destination;
    private final Map<Object, COSBase> clonedVersion = new HashMap();
    private final Set<COSBase> clonedValues = new HashSet();

    public PDFCloneUtility(PDDocument pDDocument) {
        this.destination = pDDocument;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.tom_roush.pdfbox.cos.COSArray] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.tom_roush.pdfbox.cos.COSBase] */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.tom_roush.pdfbox.cos.COSBase] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, com.tom_roush.pdfbox.cos.COSBase] */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.tom_roush.pdfbox.cos.COSArray] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.tom_roush.pdfbox.cos.COSBase] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tom_roush.pdfbox.cos.COSDictionary, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.cos.COSStream, java.lang.Object] */
    public COSBase cloneForNewDocument(Object obj) {
        ?? r02;
        ?? cOSDictionary;
        if (obj == null) {
            return null;
        }
        COSBase cOSBase = this.clonedVersion.get(obj);
        if (cOSBase != null) {
            return cOSBase;
        }
        boolean z10 = obj instanceof COSBase;
        if (z10 && this.clonedValues.contains(obj)) {
            return (COSBase) obj;
        }
        if (obj instanceof List) {
            r02 = new COSArray();
            for (Object obj2 : (List) obj) {
                r02.add(cloneForNewDocument(obj2));
            }
        } else if ((obj instanceof COSObjectable) && !z10) {
            r02 = cloneForNewDocument(((COSObjectable) obj).getCOSObject());
        } else if (obj instanceof COSObject) {
            r02 = cloneForNewDocument(((COSObject) obj).getObject());
        } else if (obj instanceof COSArray) {
            r02 = new COSArray();
            COSArray cOSArray = (COSArray) obj;
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                r02.add(cloneForNewDocument(cOSArray.get(i10)));
            }
        } else {
            if (obj instanceof COSStream) {
                COSStream cOSStream = (COSStream) obj;
                cOSDictionary = this.destination.getDocument().createCOSStream();
                OutputStream createRawOutputStream = cOSDictionary.createRawOutputStream();
                InputStream createRawInputStream = cOSStream.createRawInputStream();
                IOUtils.copy(createRawInputStream, createRawOutputStream);
                createRawInputStream.close();
                createRawOutputStream.close();
                this.clonedVersion.put(obj, cOSDictionary);
                for (Map.Entry<COSName, COSBase> entry : cOSStream.entrySet()) {
                    cOSDictionary.setItem(entry.getKey(), cloneForNewDocument(entry.getValue()));
                }
            } else if (obj instanceof COSDictionary) {
                cOSDictionary = new COSDictionary();
                this.clonedVersion.put(obj, cOSDictionary);
                for (Map.Entry<COSName, COSBase> entry2 : ((COSDictionary) obj).entrySet()) {
                    cOSDictionary.setItem(entry2.getKey(), cloneForNewDocument(entry2.getValue()));
                }
            } else {
                r02 = (COSBase) obj;
            }
            r02 = cOSDictionary;
        }
        this.clonedVersion.put(obj, r02);
        this.clonedValues.add(r02);
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.tom_roush.pdfbox.cos.COSBase] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.tom_roush.pdfbox.cos.COSBase] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.tom_roush.pdfbox.cos.COSDictionary, com.tom_roush.pdfbox.cos.COSStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.tom_roush.pdfbox.multipdf.PDFCloneUtility] */
    public void cloneMerge(COSObjectable cOSObjectable, COSObjectable cOSObjectable2) {
        COSBase cOSBase;
        if (cOSObjectable == null || (cOSBase = this.clonedVersion.get(cOSObjectable)) != 0) {
            return;
        }
        if (!(cOSObjectable instanceof COSBase)) {
            cloneMerge(cOSObjectable.getCOSObject(), cOSObjectable2.getCOSObject());
        } else if (cOSObjectable instanceof COSObject) {
            if (cOSObjectable2 instanceof COSObject) {
                cloneMerge(((COSObject) cOSObjectable).getObject(), ((COSObject) cOSObjectable2).getObject());
            } else if ((cOSObjectable2 instanceof COSDictionary) || (cOSObjectable2 instanceof COSArray)) {
                cloneMerge(((COSObject) cOSObjectable).getObject(), cOSObjectable2);
            }
        } else if (cOSObjectable instanceof COSArray) {
            if (cOSObjectable2 instanceof COSObject) {
                cloneMerge(cOSObjectable, ((COSObject) cOSObjectable2).getObject());
            } else {
                COSArray cOSArray = (COSArray) cOSObjectable;
                for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                    ((COSArray) cOSObjectable2).add(cloneForNewDocument(cOSArray.get(i10)));
                }
            }
        } else if (cOSObjectable instanceof COSStream) {
            COSStream cOSStream = (COSStream) cOSObjectable;
            cOSBase = this.destination.getDocument().createCOSStream();
            OutputStream createOutputStream = cOSBase.createOutputStream(cOSStream.getFilters());
            IOUtils.copy(cOSStream.createInputStream(), createOutputStream);
            createOutputStream.close();
            this.clonedVersion.put(cOSObjectable, cOSBase);
            for (Map.Entry<COSName, COSBase> entry : cOSStream.entrySet()) {
                cOSBase.setItem(entry.getKey(), cloneForNewDocument(entry.getValue()));
            }
        } else if (cOSObjectable instanceof COSDictionary) {
            if (cOSObjectable2 instanceof COSObject) {
                cloneMerge(cOSObjectable, ((COSObject) cOSObjectable2).getObject());
            } else {
                this.clonedVersion.put(cOSObjectable, cOSBase);
                for (Map.Entry<COSName, COSBase> entry2 : ((COSDictionary) cOSObjectable).entrySet()) {
                    COSName key = entry2.getKey();
                    COSBase value = entry2.getValue();
                    COSDictionary cOSDictionary = (COSDictionary) cOSObjectable2;
                    if (cOSDictionary.getItem(key) != null) {
                        cloneMerge(value, cOSDictionary.getItem(key));
                    } else {
                        cOSDictionary.setItem(key, cloneForNewDocument(value));
                    }
                }
            }
        } else {
            cOSBase = (COSBase) cOSObjectable;
        }
        this.clonedVersion.put(cOSObjectable, cOSBase);
        this.clonedValues.add(cOSBase);
    }

    public PDDocument getDestination() {
        return this.destination;
    }
}
